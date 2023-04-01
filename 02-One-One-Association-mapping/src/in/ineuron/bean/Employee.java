package in.ineuron.bean;

public class Employee {
	private String eid;
	private String ename;
	private String eaddr;
	
	Account account;

	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	public void getEmployeeDetails()
	{
		System.out.println("employee details are");
		System.out.println("employee id :" +eid);
		System.out.println("employee Name :" +ename);
		System.out.println("employee Address :" +eaddr);
		System.out.println("Account Details:");
		System.out.println("Account Number:" + account.accNo);
		System.out.println("Account Name:" + account.accName);
		System.out.println("Account Type:" + account.accType);
	}
	
	

}
