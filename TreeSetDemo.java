import java.util.Comparator;
import java.util.TreeSet;

class customer implements Comparable<customer>{
	private int id;
	private String name;
	customer(int id,String name){
		this.id=id;
		this.name=name;
		
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
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(customer customer) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(customer.name);
	}
	
}
	class sorteBycustomerId implements Comparator<customer>{

	
		public int compare(customer one, customer two) {
			// TODO Auto-generated method stub
			return((Integer) one.getId()).compareTo((Integer)two.getId());
		}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<customer> customerset= new TreeSet<>();
		//TreeSet<customer> customerset= new TreeSet<>(new sorteBycustomerId() );
		TreeSet<customer> customerSet = new TreeSet<>
		((first,second)->((Integer)first.getId()).compareTo(second.getId()));

		customer ram= new customer(1001,"ram");
		customerSet.add(ram);
		customer shyam= new customer(1002,"shyam");
		customerSet.add(shyam);
		System.out.println(customerSet);
	}

}
