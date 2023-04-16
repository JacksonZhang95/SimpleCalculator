package com.test.calc;

import com.test.calc.exception.CalcParamIllegalException;
import com.test.calc.strategy.Calc;
import com.test.calc.strategy.CalcStrategyFactory;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/16 15:21
 * @description :
 */
public class MathematicalCalculator {

    private CalcStrategyFactory calcStrategyFactory;

    private EnumCalcType lastCalcType;

    private BigDecimal[] lastCalcParam;

    private BigDecimal lastResult;

    public MathematicalCalculator(CalcStrategyFactory calcStrategyFactory) {
        this.calcStrategyFactory = calcStrategyFactory;
    }

    public BigDecimal calc(EnumCalcType calcType, BigDecimal base, BigDecimal... args) {
        if (calcType == null || base == null) {
            throw new CalcParamIllegalException();
        }
        Calc calcStrategy = calcStrategyFactory.getCalcStrategy(calcType);
        BigDecimal result = calcStrategy.calc(base, args);
        lastResult = base;
        lastCalcParam = args;
        lastCalcType = calcType;
        return result;
    }

    public BigDecimal redoCalc(BigDecimal base) {
        if (base == null) {
            throw new CalcParamIllegalException();
        }
        lastResult = base;
        Calc calcStrategy = calcStrategyFactory.getCalcStrategy(lastCalcType);
        BigDecimal result = calcStrategy.redo(base, lastCalcParam);
        return result;
    }

    public BigDecimal undoCalc() {
        return lastResult;
    }
}
