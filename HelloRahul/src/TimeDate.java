
public class TimeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MiliSeconds from 1990 till now");
		System.out.println(System.currentTimeMillis());
		
		System.out.println("Seconds from 1990 till now");
		System.out.println(System.currentTimeMillis()/1000);
		
		System.out.println("Minutes from 1990 till now");
		System.out.println(System.currentTimeMillis()/1000/60);
		
		System.out.println("Hours from 1990 till now");
		System.out.println(System.currentTimeMillis()/1000/60/60);
		
		System.out.println("Days from 1990 till now");
		System.out.println(System.currentTimeMillis()/1000/60/60/24);
		
		System.out.println("Years from 1990 till now");
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
	}

}
