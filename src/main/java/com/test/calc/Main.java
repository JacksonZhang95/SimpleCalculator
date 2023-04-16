package com.test.calc;

import com.test.calc.strategy.CalcStrategyFactory;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/15 13:33
 * @description :
 */
public class Main {

    public static void main(String[] args) {

        CalcStrategyFactory calcStrategyFactory = new CalcStrategyFactory();
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(calcStrategyFactory);

        BigDecimal r1 = mathematicalCalculator.calc(EnumCalcType.MULTIPLY, new BigDecimal(1), ParseUtils.parse(3));
        BigDecimal r2 = mathematicalCalculator.undoCalc();
        BigDecimal r3 = mathematicalCalculator.redoCalc(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }

}
