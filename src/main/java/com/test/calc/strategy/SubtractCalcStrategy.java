package com.test.calc.strategy;

import com.test.calc.exception.CalcParamIllegalException;
import com.test.calc.EnumCalcType;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/15 13:37
 * @description :
 */
public class SubtractCalcStrategy extends AbstractCalcStrategy {

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
            result = result.subtract(num);
        }
        return result;
    }

    @Override
    public BigDecimal redo(BigDecimal baseNum, BigDecimal... nums) {
        return calc(baseNum, nums);
    }

    @Override
    public EnumCalcType getType() {
        return EnumCalcType.SUBTRACT;
    }
}
