package com.ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;
public class ExpreMain {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/ExpressionLanguage/ExpreConfig.xml");
		ExpressionClass ex = con.getBean("expressionClass", ExpressionClass.class);
		System.out.println(ex);
		
		
		SpelExpressionParser se = new SpelExpressionParser();
		Expression expression = se.parseExpression("230+40");
		System.out.println(expression.getValue());
	}
}
