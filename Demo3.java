/*
import java.util.ArrayList;
import java.util.Scanner;

class product implements Comparable<product>
{
	private int id;
	private String name;
	private double price;
	
	product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price
				+  "]";
	}

	@Override
	public int compareTo(product p) {
		return this.name.compareTo(p.name); 
		
	}
}

class productoperation{
	productoperation(){}
	ArrayList<product> productlist=new ArrayList<>();
	Scanner scanner =new Scanner(System.in);
	

public void addNewproduct(){
	System.out.println("enter the product id");
  int	pid= scanner.nextInt();
  System.out.println("enter the product name");
  String pname=scanner.next();
  System.out.println("enter the price value");
    double pprice=scanner.nextDouble();

    product product = new product(pid,pname,pprice);
	productlist.add(product);  // Add Object in ArrayList
}
public void print(){
	productlist.forEach((p)->System.out.println(p));
}


}

// CRUD Operation
// product ka object baar baar bnega 
// lekin product operation ka object ek hi baar bnega kyoki agr esa nhi hua to add pe alag object bnega or delete p alag lekin hme y kaam
// ek hi pe karana ha to singelton class bnani pdegi

public class Demo3 {

	public static void main(String[] args) {
		//ProductOperations prodOpr = ProductOperations();
		productoperation prodopr= new productoperation();
		Scanner scanner= new Scanner(System.in);
	//ArrayList<product> productlist=new ArrayList<>();
	while(true){
		System.out.println("1.add a product list");
		System.out.println("2.search a product");
		System.out.println("3.print all product");
		System.out.println("4. delete a product");
		System.out.println("5.update a product");
		System.out.println("press 0 to Quit");
		System.out.println("enter your chice");
		int choice=scanner.nextInt();
		switch(choice){
		case 0:
			System.out.println("Qiut the application");
			System.exit(0);
			break;
		case 1:
			prodopr.addNewproduct();
			break;
		case 3:
			prodopr.print();
			break;
			
		}
	}




	}
}
*/