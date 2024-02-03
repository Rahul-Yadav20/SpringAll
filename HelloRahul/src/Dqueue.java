import java.util.*;

public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();

		ad1.add(12);
		ad1.add(45);
		ad1.add(23);
		ad1.add(34);
		
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
		// addfirst and addlast can throw an exception if there is any error
		ad1.addFirst(90);
		ad1.addLast(56);
		
		System.out.println("Using addfirst and addlast");
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
		// offerFirst and offerLast can't throw any exception
		ad1.offerFirst(70);
		ad1.offerLast(100);
		
		System.out.println("Using offerFirst and offerLast");
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
	}
	

}
