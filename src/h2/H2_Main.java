package h2;
import java.util.ArrayList;

public class H2_Main {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Bus otherBus = new Bus();
		Passenger a = new Passenger("Karsten",3,true);
		Passenger b = new Passenger("Anna",1,true);
		Passenger c = new Passenger("Clara",5,true);
		Passenger d = new Passenger("Kevin",2,false);
		Passenger e = new Passenger("Kalle",7,false);
		Passenger f = new Passenger("Ben",6,true);
		String[] names = {"Anna","Clara"};
		
		bus.enterBus(a);
		bus.enterBus(b);
		bus.enterBus(c);
		bus.enterBus(d);
		bus.enterBus(e);
		bus.enterBus(f);
		bus.transferPassengers(otherBus, names);
		otherBus.nextStop();
		
		ArrayList<Passenger> ohneTicket = bus.findPassengersWithoutTickets();
		if(!ohneTicket.isEmpty()) {
			System.out.print("Rausgeschmissen: ");
			for(Passenger p : ohneTicket) {
				System.out.print(p.name + "-->");
			}
			System.out.print("||");
		}
		
		System.out.println();
		if(!bus.passengers.isEmpty()) {
			System.out.print("Bus 1: ");
			for(Passenger p : bus.passengers) {
				System.out.print(p.name + "-->");
			}
			System.out.print("||");
		}
		
		System.out.println();
		if(!otherBus.passengers.isEmpty()) {
			System.out.print("Bus 2: ");
			for(Passenger p : otherBus.passengers) {
				System.out.print(p.name + "-->");
			}
			System.out.print("||");
		}
	}
	
}
