
public class Employee {
	int eid;
	int salary;
	static String ceo;
	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(int i, int j, String string) {
		eid = i;
		salary = j;
		ceo = string;
	}
	public void display() {
		System.out.println(eid + " : "+ salary + " : "+ ceo);
	}
	public void main(String[] args) {
		System.out.println("hi");
		Employee emp1 = new Employee(1,4000,"Mahesh");
		Employee emp2 = new Employee(2,5000,"Rahul");
		Employee.ceo = "Nikita";
		emp1.display();
	}
}
