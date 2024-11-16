package module1.java.collection.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ChangeOrder implements Comparator<Integer>{
	
	public int compare(Integer o1, Integer O2) {
		
		return O2-o1;
	}//12 13
}
 
class Stringcomparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o1.length()-o2.length();
	}
	
}
class AccendingOder implements Comparator<String >{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}

}
 class ComparatorDemo {

	 
	public static void ComparatorEx() {
	
		List<Integer> list1=new ArrayList<>();
		List<String>  list2=new ArrayList<>();
//		List<String>  list3= Arrays.asList("Apple", "banana", "chiku", "chut", "gand","Mango", "amitkigf", "lahasun", "lauda", "strobery");
		
		list2.add("Banana");
		list2.add("Apple");
		list2.add("cate");
		list2.add("druite");
		list1.add(12);
		list1.add(13);
		list1.add(1);
		list1.add(19);
		list1.add(10);
		list1.add(12);
		list1.sort(null);//accending order
//		list1.sort(new ChangeOrder());
		list1.sort((obj1,obj2)->obj2-obj1);
		System.out.println(list1);
		
		list2.sort(null);
		System.out.println(list2);
		list2.sort((obj1,obj2)-> obj1.length()-obj2.length());
		System.out.println(list2);
		
//	System.out.println(list3);
//	 list3.sort(null);
//	 System.out.println(list3);
//	 list3.sort((Obj1, Obj2)->Obj2.length()-Obj1.length());
//	 System.out.println(list3);
//	 list3.sort(new AccendingOder());
//	 System.out.println(list3);
	 
	 ArrayList<Student> cstd=new ArrayList<>();
	 Scanner sc = new Scanner(System.in);
	
//	 for(int i=0; i<5; i++) {
//		 System.out.print("Enter id:");
//		 long myId=sc.nextLong();
//		 System.out.print("Enter Name:");+
//		 String myName=sc.next(); 
//		 Student std=new Student(myId,myName);
//		 cstd.add(std);
//		 }
//	 
//	 for(Student st:cstd) {
//		
//		 System.out.println(st.toString());
//	 }
	 
	 Person p1 = new Person(1, "one");
	 Person p2 = new Person(2, "Two");
	 Person p3 = new Person(3, "Three");
	 
	 ArrayList<Person> pers= new ArrayList<>();
	 pers.add(p1);
	 pers.add(p2);
	 pers.add(p3);
	 
	 for( Person  person :  pers) {
		 
		 System.out.println(person.toString());
		 
	 }
	 
	}


}
