package com.test.calc.strategy;

import com.test.calc.EnumCalcType;
import com.test.calc.exception.CalcParamIllegalException;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : JacksonZhang
 * @date : 2023/4/15 13:37
 * @description :
 */
public class DivideCalcStrategy extends AbstractCalcStrategy {

    @Override
    public BigDecimal calc(BigDecimal baseNum, BigDecimal... nums) {
        if (baseNum == null) {
            throw new CalcParamIllegalException();
        }
        BigDecimal result = baseNum;
        if (nums == null) {
            return result;
        }
        for (BigDecimal num : nums) {
            result = result.divide(num,20, RoundingMode.DOWN);
        }
        return result;
    }

    @Override
    public BigDecimal redo(BigDecimal baseNum, BigDecimal... nums) {
        return calc(baseNum, nums);
    }


    @Override
    public EnumCalcType getType() {
        return EnumCalcType.DIVIDE;
    }
}
