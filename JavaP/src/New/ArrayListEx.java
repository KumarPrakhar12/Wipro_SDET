package New;
import java.util.*;
public class ArrayListEx {
	
	 public static void main(String[] args) {
		 
		 List<String> names = new ArrayList<>();
		 names.add("Prakhar");
		 names.add(1, "kumar");
		 System.out.println(names);
		 names.clear();
		 System.out.println(names);
		 names.add("ravi");
		 names.add("pankaj");
		 names.add("uday");
		 names.set(2, "Raj");
		 System.out.println(names);
		 names.remove("Raj");
		 System.out.println(names);
		 names.contains("kumar");
		 names.equals("ravi");
		 names.indexOf("pankaj");
		 System.out.println(names.size());
		 names.get(1);
		 System.out.println(names.isEmpty());
		 names.lastIndexOf("ravi");
		 names.getFirst();
		 System.out.println(names);

}
}
