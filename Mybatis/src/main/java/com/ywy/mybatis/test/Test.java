package com.ywy.mybatis.test;

import com.ywy.mybatis.entity.SmartDog;

/**
 * @author aibinru
 * @date 24-8-7 15:47
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Thinking t = new Thinking();
        //t.stepOne();

        SmartDog smartDog = new SmartDog();
        smartDog.getSub(1, 1);
        smartDog.getSum(1,1);
    }
}
