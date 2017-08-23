 import java.util.ArrayList;

class Employee{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary= salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	//jab bhi 2 object ko compare karna hotta hai to equals ko override karna hotta hai. or khud ka equals bnana hotta hai
	@Override
	public boolean equals(Object o){
		Employee e = (Employee) o;
		if(this.id == e.id && this.name.equals(e.name)
				&& this.salary==e.salary){
			return true;
		}
		else
		{
			return false;
		}
	}

	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist= new ArrayList<>();
		Employee ram= new Employee(1001,"ram",8800);
		emplist.add(ram);
		Employee shyam= new Employee(1002,"shyam",9800);
		emplist.add(shyam);
		System.out.println(emplist);
//search operation
	                                 //1.10minutes  timing in recording in which talk about what happen in internally.
//search karte time hme apna equals ovverride karna pdega becoz  we want to compare values of object(compare) not reference 
		//.jo check karat hai same or not
		Employee searchram=new Employee(1001,"ram",8800);
		int indexNo = emplist.indexOf(searchram);
		if(indexNo>=0){
			System.out.println("Found...");
			emplist.remove(indexNo);
	System.out.println(emplist);
		}
		else
		{
			System.out.println("Not Found...");
		}
		

	}

}
