package org.test.calc;

import com.test.calc.EnumCalcType;
import com.test.calc.MathematicalCalculator;
import com.test.calc.ParseUtils;
import com.test.calc.strategy.CalcStrategyFactory;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/16 16:25
 * @description :
 */
public class MainTest {

    @Test
    public void testAdd() {
        CalcStrategyFactory calcStrategyFactory = new CalcStrategyFactory();
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(calcStrategyFactory);

        BigDecimal r1 = mathematicalCalculator.calc(EnumCalcType.ADD, new BigDecimal(1), ParseUtils.parse(3));
        BigDecimal r2 = mathematicalCalculator.undoCalc();
        BigDecimal r3 = mathematicalCalculator.redoCalc(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    @Test
    public void testSubtract() {
        CalcStrategyFactory calcStrategyFactory = new CalcStrategyFactory();
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(calcStrategyFactory);

        BigDecimal r1 = mathematicalCalculator.calc(EnumCalcType.SUBTRACT, new BigDecimal(1), ParseUtils.parse(3));
        BigDecimal r2 = mathematicalCalculator.undoCalc();
        BigDecimal r3 = mathematicalCalculator.redoCalc(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    @Test
    public void testMultiply() {
        CalcStrategyFactory calcStrategyFactory = new CalcStrategyFactory();
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(calcStrategyFactory);

        BigDecimal r1 = mathematicalCalculator.calc(EnumCalcType.MULTIPLY, new BigDecimal(1), ParseUtils.parse(3));
        BigDecimal r2 = mathematicalCalculator.undoCalc();
        BigDecimal r3 = mathematicalCalculator.redoCalc(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

    @Test
    public void testDivide() {
        CalcStrategyFactory calcStrategyFactory = new CalcStrategyFactory();
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(calcStrategyFactory);

        BigDecimal r1 = mathematicalCalculator.calc(EnumCalcType.DIVIDE, new BigDecimal(1), ParseUtils.parse(3));
        BigDecimal r2 = mathematicalCalculator.undoCalc();
        BigDecimal r3 = mathematicalCalculator.redoCalc(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

}
