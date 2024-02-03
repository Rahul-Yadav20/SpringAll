import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class NewPark{
	public void parkSlot(Parking p) {
		p.park();
	}
}





public class MainClass {
	public static void main(String[] args) {
		//Parking np = new Building1();
		NewPark ob = new NewPark();
//		ob.parkSlot(new Building2());
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Parking b2=ac.getBean("park", Parking.class);
		ob.parkSlot(b2);
		
	}
	
	
}
