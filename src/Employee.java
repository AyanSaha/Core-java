
public class Employee {
	protected String name;
	protected double sal;

	Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;

	}

	public void showValue() {
		// TODO Auto-generated method stub
		System.out.print("Name:" + this.name);
		System.out.println("Salary:" + this.sal);
	}

}

class Ceo extends Employee {
	private String ceo;
	private double salary;

	Ceo(String Emp, double sal, String ceo, double salary) {
		super(Emp, sal);
		this.ceo = ceo;
		this.salary = salary;

	}

	void showCEO() {
		System.out.println("CEO:" + this.ceo);
		System.out.println("Salary:" + this.salary);
		System.out.println("Employee:"+super.name);
		System.out.println("Emp_Salary:"+super.sal);
	}
}
