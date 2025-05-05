package io.github.qin.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class BigNumber {
    public static void main(String[] args) {
        /* 
        BigInteger bi = new BigInteger(
            Long.toString(Long.MAX_VALUE)
        );
        bi = bi.add(BigInteger.ONE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+1);
        System.out.println(bi);
         */

        // IEEE754 precision loss
        System.out.println(0.09 + 0.01); // disired vlaue:0.1                       actual value:0.09999999999999999
        System.out.println(0.215 - 0.05); // disired value:0.164999999999999999     actual value:0.16499999999999998
        System.out.println();

        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        BigDecimal result = bd1.add(bd2);
        System.out.println(result);
    }    
}