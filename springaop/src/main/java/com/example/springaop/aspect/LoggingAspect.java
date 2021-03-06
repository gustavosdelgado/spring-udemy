package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {

        System.out.println("Executing BEFORE AccountDAO has done some shit");
        
    }
}
