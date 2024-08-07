package com.ywy.mybatis.test;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author aibinru
 * @date 24-8-7 15:42
 * @description:
 */
@Aspect
@Component
@Slf4j
public class Monitor {

    @Before(value = "execution(public void com.ywy.mybatis.test.*.*(..))")
    public void isSetGoal(JoinPoint joinPoint) {
        System.out.println("是否设定了目标");
        Signature signature = joinPoint.getSignature();
// 1. 在调用目标方法之前打印“方法开始”日志
        System.out.println("日志--方法名：" + signature.getName() + "--方法开始--参数： " + Arrays.asList(joinPoint.getArgs()));
        log.info("是否设定了目标");
    }

    //这个就对应动态代理类的
    @After(value = "execution(public void com.ywy.mybatis.test.Thinking.stepOne())")
    public void showFinallyEndLog() {
        System.out.println("最终通知");
    }
}
