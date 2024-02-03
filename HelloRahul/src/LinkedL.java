import java.util.*;


public class LinkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				LinkedList<Integer> l1 = new LinkedList<>();
				LinkedList<Integer> l2 = new LinkedList<>();
				l1.add(5);
				l1.add(9);
				l1.add(4);
				l1.add(3);
				
				// If you want add a element in a specified location
				// NOTE:- add() method append the list (not replace element)
				l1.add(14);
				
				
				l2.add(44);
				l2.add(65);
				l2.add(34);
				
				l1.addAll(l2);
//				// To add a new Collection in a existing list
//				l1.addAll(3, l2);	
//				
//				// set() method replacement the element with specified location
//				l1.set(5, 234);
				
				 //To clear ArrayList
				//l1.clear();
				
				
				
				for(int i = 0; i<l1.size(); i++) {
					
					System.out.println(l1.get(i));
					
				}
				
//				OR
//				Use iterator instead of for loop 
//				But its provide only first element (EX- 5)
				
//				
//				Iterator<Integer> t1 = l1.iterator();
//				System.out.println(t1.next());
				
//				System.out.println(l1.indexOf(0));
//				System.out.println(l1.isEmpty());
				
//				System.out.println(l1.contains(4));;
//				System.out.println(l1.indexOf(44));

			}

	}


