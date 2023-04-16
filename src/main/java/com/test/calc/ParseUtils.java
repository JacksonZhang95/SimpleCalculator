package com.test.calc;

import java.math.BigDecimal;

/**
 * @author : JacksonZhang
 * @date : 2023/4/16 16:29
 * @description :
 */
public class ParseUtils {

    public static BigDecimal[] parse(int... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        BigDecimal[] result = new BigDecimal[args.length];
        for (int i = 0; i < args.length; i++) {
            result[i] = new BigDecimal(args[i]);

        }
        return result;
    }

    public static BigDecimal[] parse(String... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        BigDecimal[] result = new BigDecimal[args.length];
        for (int i = 0; i < args.length; i++) {
            result[i] = new BigDecimal(args[i]);

        }
        return result;
    }
}
