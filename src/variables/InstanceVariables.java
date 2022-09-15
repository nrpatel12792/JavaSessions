package variables;

import java.util.Arrays;

public class InstanceVariables {

	String username;
	String password;
	boolean isActive;
	double bmi;
	int age;
	char gender;
	int a[];
	String st[] = {"tom", "lisa", "peter"};
	
	public static void main(String[] args) {
		
		InstanceVariables lp = new InstanceVariables();
		System.out.println(lp.age);//0
		System.out.println(lp.username);//null
		System.out.println(lp.bmi);//0.0
		System.out.println(lp.gender);//
		System.out.println(lp.isActive);//false
		
		System.out.println(lp.st.length);//3
		System.out.println(Arrays.toString(lp.st));//[tom,lisa,peter]
		for(String e : lp.st) {
			System.out.println(e);
		}

	}

}
