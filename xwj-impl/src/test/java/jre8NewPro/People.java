package jre8NewPro;

public interface People {
	
	double calclate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
}
