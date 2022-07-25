package p4;
import java.util.ArrayList;
import java.util.Collections;
//40.Convert HashSet to list
import java.util.HashSet;
import java.util.List;

public class Hashset_to_list_40 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		set.add("BMW");
		set.add("Suzuki");
		set.add("Audi");
		set.add("Ferrari");
		set.add("Tata");
		set.add("Ford");
		
		System.out.println("Hashset is : "+set);
        
		List<String> list = new ArrayList<>();
		list.addAll(set);
		System.out.println("List is : "+list);
		System.out.println("------------------------------------------------");
		List list1 = new ArrayList();
		Collections.addAll(list1, set);
		System.out.println("List is : "+list1);
		
		
	}

}
