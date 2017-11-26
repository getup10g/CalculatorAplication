package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	double x;
	double y;

	public CalculatorAplication(double a,double b){
		x=a;
		y=b;	}

	double add(){
		return x+y; }

	double subtract(){
		return x-y;}

	double miltiply(){
		return x*y;}

	double divide(){
		return x/y;}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		CalculatorApplication calc = new CalculatorApplication(5,7);
		calc.add();
		calc.divide();

		}
	}
}
