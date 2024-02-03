package com.ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* Spring Expression Langauge supports parsing 
 * and executing expression with the help of @Value annotation
 * @Value("#{expression}")
 */

@Component
public class ExpressionClass {

	@Value("#{20+30}")
	private int x;

	@Value("#{2+35}")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Expression [x=" + x + ", y=" + y + "]";
	}

}
