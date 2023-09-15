package ClassandOject;

//class declaration
class Employee {

//data member
//instance variable

	String empid;
	String empname;
	int empage;
	String empsalary;

	// Parameterised constructor

	public Employee(String empid, String empname, int empage, String empsalary) {

		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.empsalary = empsalary;
	}

	// method1

	String getEmpid() {
		return empid;
	}
//method 2

	String getEmpname() {
		return empname;
	}

	// method

	int getEmpage() {
		return empage;

	}

	String getEmpsalary() {
		return empsalary;
	}
	
	public String toString()
	{
		return ("Emp ID="+getEmpid()
		        +"\nEmp Name="+getEmpname()
		        +"\nEmp age="+getEmpage()
		        +"\nEmp Salary="+getEmpsalary());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee("1","Amol Appa Harde",24,"230000");
		System.out.println(emp.toString());

	}

}
