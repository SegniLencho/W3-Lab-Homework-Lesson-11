import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class TeachersDemo {

	public static void main(String[] args) {
		 HashMap<Integer,String> productMap = new HashMap<Integer,String>();
		 productMap.put(1, "Keys");
		 productMap.put(4, "Books");
		 productMap.put(4, "Books");
		 productMap.put(3, "Systems");
		 productMap.put(7, "Mobile");
		 productMap.put(null, null);
		 System.out.println(productMap);
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(5);

		ht.put(1, "Segni");
		ht.put(2, "Siifan");
		ht.put(0, "Gudeta");
		System.out.println("Hash Table " + productMap);

		HashSet<String> stateSet = new HashSet<String>();
		stateSet.add("CA");
		stateSet.add("WI");
		stateSet.add("NY");
		stateSet.add(null);
		if (stateSet.contains("PB")) // if CA, it will not add but shows
										// following message
			System.out.println("Already found");
		else
			stateSet.add("PB");
		System.out.println(stateSet);

		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(10);
		numberSet.add(-12);
		numberSet.add(15);
		numberSet.add(16);
		numberSet.remove(15);
		boolean s = numberSet.add(19);
		for (Integer num : numberSet)
			System.out.println("Value : " + num);
		System.out.println(s);
		
		String aa="AB";
		System.out.println(aa.hashCode());

	}
}
