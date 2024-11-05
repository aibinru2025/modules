//package com.ywy.mybatis.aspect;
//
//import com.ywy.mybatis.test.User;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//import java.io.UnsupportedEncodingException;
//import java.util.Base64;
//
///**
// * @author aibinru
// * @date 24-8-7 15:34
// * @description:
// */
//
//@Aspect
//@Component
//public class ParamAspect {
//
//    @Pointcut("execution(public * com.ywy.mybatis.()")
//    public void doOperation() {
//
//    }
//
//
//    @Before("doOperation()")
//    public void before(JoinPoint joinPoint) throws Throwable{
//        Object[] objs = joinPoint.getArgs();
//        for (Object obj : objs) {
//            User user =(User) obj;
//            System.out.println("前置通知接受的参数:"+user);
//            String name =base64DeStr(user.getName());
//            user.setName(name);
//        }
//    }
//
//
//    @AfterReturning(returning = "object", pointcut = "doOperation()")
//    public void doAfterReturning(Object object) {
//        ResultBody resultBody = (ResultBody) object;
//        String str =null;
//        try {
//            str=base64EnStr(resultBody.getResult());
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        System.out.println("前置通知响应的参数:"+str);
//    }
//
//
//    public  String base64EnStr(String str) throws UnsupportedEncodingException {
//        return Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
//    }
//
//
//    public static String base64DeStr(String encodeStr) throws UnsupportedEncodingException {
//        byte[] decodeStr = Base64.getDecoder().decode(encodeStr);
//        return new String(decodeStr, "UTF-8");
//    }
//
//
//
