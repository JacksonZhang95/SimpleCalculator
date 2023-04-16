package com.test.calc.strategy;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/14 17:09
 * @description :
 */
public interface Calc {

    BigDecimal calc(BigDecimal baseNum, BigDecimal... nums);

    BigDecimal redo(BigDecimal baseNum, BigDecimal... nums);
}
