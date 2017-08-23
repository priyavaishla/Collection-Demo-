import java.util.HashSet;
import java.util.Locale.Category;
class Book{
	private int id;
	private String name;
	private String category;
	private double price;
	private String author;
	Book(int id,String name,String category,double price,String author){
		
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.author=author;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", category=" + category
				+ ", price=" + price + ", author=" + author + "]\n";
	}
	
	
	@Override
	
	public int hashCode(){
		if(category.equalsIgnoreCase("pro")){
			return 10;
		}
		else{
			return 20;
		}
		
		
		
	}
	@Override
	public boolean equals(Object o){
		Book b1=null;
		boolean isfound= false;
		if(o instanceof Book){
			b1= (Book) o;
			if(this.id==b1.id&&this.name.equals (b1.name)&&this.category.equals(b1.category)
					&&this.price==b1.price&&this.author.equals(b1.author)){
				isfound=true;
			}
			
		}
		return isfound;
	}
}

public class setDemo1 {


	public static void main(String[] args) {
		HashSet <Book> bookset= new HashSet<>();
		Book java = new Book(1001,"Java","Pro",2000,"Katheiy");
		bookset.add(java);// by default call hashcode and equals of Object class
		Book java2 = new Book(1001,"Java","Pro",2000,"Katheiy");
		bookset.add(java2);
		Book c = new Book(1002,"C","Pro",2000,"Yashwant");
		bookset.add(c);
		Book c2 = new Book(1002,"C","Pro",2000,"Yashwant");
		bookset.add(c2);
		Book networking = new Book(1003,"Network","net",1000,"Tom");
            System.out.println(bookset);
           // yha ye charo book k lea alg ag shell bna k agya(hashcode) mtlb equals to chla hi nahi.
            System.out.println("HashCode");
            System.out.println("Java HashCode "+java.hashCode());
    		System.out.println("Java2 HashCode "+java2.hashCode());
    		System.out.println("C HashCode "+c.hashCode());
    		System.out.println("C2 hashCode "+c2.hashCode());
    		//System.out.println("C3 hashCode "+c3.hashCode());
    		System.out.println("NetWork hashCode "+networking.hashCode());
       // kyoki chaar kitabe programing ki hai to chora ka hashcode(shell) same hona chaea  lekin abhi ye esa kuch nahi karne vala.
    		// ye sb object class krra hai.
    		// ab mujh sirf 2 shell chaea
    		// String + Wrapper + Date + Calender(class) - equals and hashCode Override alredy

	}

}










