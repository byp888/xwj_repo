package com.demo.template.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		Class<TestEntity> clazz = TestEntity.class;
		Field[] fields = clazz.getDeclaredFields();
		Method[] methods = clazz.getDeclaredMethods();
		for(int i = 0; i < fields.length; i++) {
			TestAnno feildAnno = fields[i].getAnnotation(TestAnno.class); 
			System.out.println(fields[i].getName().toUpperCase() + " annotation field:" + feildAnno);
			if(feildAnno != null) {
				System.out.println(feildAnno.value());
				System.out.println(Arrays.asList(feildAnno.type()));
			}
		}
		System.out.println("===========================");
		for(int i = 0; i < methods.length; i++) {
			TestAnno methodAnno = methods[i].getAnnotation(TestAnno.class); 
			System.out.println(methods[i].getName() + " annotation method:" + methodAnno);
			if(methodAnno != null) {
				System.out.println(methodAnno.value());
				System.out.println(Arrays.asList(methodAnno.type()));
			}
		}
	}
}
