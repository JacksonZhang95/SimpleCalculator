package com.test.calc.strategy;

import com.test.calc.EnumCalcType;

/**
 * @author : JacksonZhang
 * @date : 2023/4/15 13:38
 * @description :
 */
public abstract class AbstractCalcStrategy implements Calc {

    public abstract EnumCalcType getType();

}
