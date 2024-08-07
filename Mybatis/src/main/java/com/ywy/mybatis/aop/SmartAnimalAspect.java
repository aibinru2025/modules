package com.ywy.mybatis.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author aibinru
 * @date 24-8-7 15:56
 * @description:
 */
@Aspect //表示这个类是一个切面类
@Component //需要加入到 IOC 容器
public class SmartAnimalAspect {
//这个就对应动态代理类的
//System.out.println(" 日 志 -- 方 法 名 ： "+methodName+"-- 方 法 开 始 -- 参 数 ："+Arrays.asList(args));
    @Before(value = "execution(public float com.ywy.mybatis.entity.SmartDog.getSum(float ,float))")
    public void showBeginLog(JoinPoint joinPoint) {
        System.out.println("前置通知");
        Signature signature = joinPoint.getSignature();
// 1. 在调用目标方法之前打印“方法开始”日志
        System.out.println("日志--方法名：" + signature.getName() + "--方法开始--参数： " + Arrays.asList(joinPoint.getArgs()));
    }
//这个就对应动态代理类的
//System.out.println("日志--方法名："+methodName+"-- 方法正常结束--结果： result="+result);
    @AfterReturning(value = "execution(public float com.ywy.mybatis.entity.SmartDog.getSum(float ,float))")
    public void showSuccessEndLog(JoinPoint joinPoint) {
        System.out.println("返回通知");
        Signature signature = joinPoint.getSignature();
// 3. 在目标方法结束后打印“方法结束”日志
        System.out.println("日志--方法名：" + signature.getName() + "--方法正常结束 --~");
    }
//这个就对应动态代理类的
//System.out.println("日志--方法名："+methodName+"--方法抛出异常--异常类型： "+e.getClass().getName());
    @AfterThrowing(value = "execution(public float com.ywy.mybatis.entity.SmartDog.getSum(float ,float))")
    public void showExceptionLog() {
        System.out.println("异常通知");
    }
    //
//这个就对应动态代理类的
//System.out.println("日志--方法名："+methodName+"--方法最终结束");
    @After(value = "execution(public float com.ywy.mybatis.entity.SmartDog.getSum(float ,float))")
    public void showFinallyEndLog() {
        System.out.println("最终通知");
    }
}
