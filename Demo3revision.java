import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

  // jb hm store karare  hai to object ki form m krare hai   lekin calculation k lea primitive m change karee that is called autoboxing
// jo ki 1.5 me automatic hori hai.
//                                          1.5 ne hme 2 feature dea h pehla (autoboxing) dusra (generic ).

public class Demo3revision {
	
		static void oddeven(int x){
			if(x%2==0){
				System.out.println("even"+x);
				
			}
			else{
				System.out.println("odd"+x);
			}
		}
	

	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();//generic-----allow only one type of thing
	// ARRAY LIST ME ADD KARNE K 2 TARIKE HAI (AT END , AT SPECIFIED POSITION)
	//                          ARRAY LIST BY DEFAULT CONTAIN ANY OBJECT
	//list .add(new Integer(100));//add at end
	list.add(100);
	//AUTOBOXING WHICH CONVERT PROIMITIVE TO WRAPPER TYPE(object) OR VICE VERSA
	//list .add(new Integer(200));//1.4
	/*list.add("ram");*/
	//list .add(new Integer(300));
list.add(300);
	//list.add(0,new Integer(900));// add at specified position
	//list.add(200.00);
	list.add(0,900);
	//list .add(new Double(9.20));
	/*list.add(9.20);*/
	System.out.println(list.toString());// list is internally list.tostring() is predefined method  which is coming from  object class and 
	//list ne override krlea taki loop chla kr print kra ske
//hasnext()search that if there  is any  element than print else close bracket.
	list.add(500);
	System.out.println(list);
Integer firstno=(Integer)list.get(1);//downcasting 
Integer Secondno=(Integer)list.get(3); 
//list.add(new Integer(firstno.intValue()+Secondno.intValue()));   1.4
//list .add(firstno+Secondno);//Autoboxing
list.add(list.get(1)+list.get(3));

//unBoxing - Wrapper to primitive
//boxing - primitive to wrapper
System.out.println("now list is"+list);
//searching
 int index=-1;
 index=list.indexOf(500);
if(index>=0){
//if(list.contains(200)){
	// contains internally have indexof if indexof>=0 then found and if -1 then not found
	System.out.println("found");
	//list.remove(index);
	list.set(index, 8000);//update
	System.out.println("after updation"+list);
}
else{
	System.out.println("not found");
}
Collections.sort(list);
System.out.println(list+"after sort");


                                       //Traverse way(ek--ek karke iterate karna cheeg ko)
//1 way  older way
for(int i=0; i<=list.size();i++){
	System.out.println(i);
}
//2 way Itertor is a interface isme hme startup nhi lagana pdta
Iterator<Integer> it= list.iterator();
while(it.hasNext()){// check is there any element
	int currentelement= it.next();//give current element and move to the next element.
	it.remove();
	System.out.println(currentelement); 
}
// 3 way traverse in both direction
ListIterator lt= list.listIterator();
while(lt.hasNext()){
	System.out.println(lt.next());
}
while(lt.hasPrevious()){
	System.out.println(lt.previous());
}

//4 way enhance for loop
for(int d:list){
	System.out.println(d);
}
// 5 way  come in java 1.8
// it is not a loop it is method
//value nahi pura pura function pass kardea.
list.forEach( Demo3revision::oddeven);






	}

	}


