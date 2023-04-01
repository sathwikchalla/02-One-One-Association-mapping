package in.ineuron.main;

import in.ineuron.bean.Account;
import in.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account =new Account("123","Sathwik","Savings");
		Employee employee=new Employee("E123E","Sathwik", "Urlg", account);
		employee.getEmployeeDetails();
	}
//Adding Comment Lines
}
