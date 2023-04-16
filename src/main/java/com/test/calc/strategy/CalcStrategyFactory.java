package com.test.calc.strategy;

import com.test.calc.EnumCalcType;
import com.test.calc.exception.CalcStrategyNotExistException;
import com.test.calc.strategy.AddCalcStrategy;
import com.test.calc.strategy.Calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author : JacksonZhang
 * @date : 2023/4/16 15:12
 * @description :
 */
public class CalcStrategyFactory {

    public static Map<EnumCalcType, Calc> StrategyMap = new HashMap<>(16);

    public Calc getCalcStrategy(EnumCalcType type) {
        Calc calc = StrategyMap.get(type);
        if (Objects.nonNull(calc)) {
            return calc;
        }
        return createCalcStrategy(type);
    }

    public synchronized Calc createCalcStrategy(EnumCalcType type) {
        Calc calc = StrategyMap.get(type);
        if (Objects.isNull(calc)) {
            switch (type) {
                case ADD:
                    calc = new AddCalcStrategy();
                    break;
                case SUBTRACT:
                    calc = new SubtractCalcStrategy();
                    break;
                case MULTIPLY:
                    calc = new MultiplyCalcStrategy();
                    break;
                case DIVIDE:
                    calc = new DivideCalcStrategy();
                    break;
                default:
                    throw new CalcStrategyNotExistException();
            }
            StrategyMap.put(type, calc);
        }
        return calc;
    }
}
