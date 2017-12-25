package com.infotech.client;

import com.infotech.model.Employee;
import static com.infotech.util.ConstantsUtil.COMPANY_NAME;
import static java.lang.Math.sqrt;
public class ClientTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setId(10982);
		employee.setName("Sean Murphy");
		employee.setEmail("sean.m2017@ibm.com");
		employee.setSalary(90000.00);
		
		//String companyName = ConstantsUtil.COMPANY_NAME;//Before JDK 1.5 or JAVA 5
		String companyName = COMPANY_NAME;//Before JDK 1.5 or JAVA 5
		
		employee.setCompanyName(companyName);
		
		System.out.println(employee);
		
		System.out.println("----------------------------------------------");
		
		//System.out.println(Math.sqrt(25.0));//Before JDK 1.5 or JAVA 5
		System.out.println(sqrt(25.0));//after JDK 1.5 onwards
	}
}
