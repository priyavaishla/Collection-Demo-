import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> phonemap= new HashMap<>();
phonemap.put("amit", 8888);
phonemap.put("sumit",9999);
phonemap.put("amit",7777);
System.out.println("phonemap"+phonemap);
System.out.println(phonemap.get("amit"));
System.out.println(phonemap.remove("amit", 8888));



for(Map.Entry<String, Integer> keyvaluepair:phonemap.entrySet()){
	System.out.println(keyvaluepair.getKey()+""+keyvaluepair.getValue());
	
}

HashMap<String,ArrayList<Integer>> phnmap= new HashMap<>();
ArrayList<Integer> number= new ArrayList<>();
number.add(1000);
number.add(2000000);
phnmap.put("amit", number);
System.out.println(phnmap);
	}

}
