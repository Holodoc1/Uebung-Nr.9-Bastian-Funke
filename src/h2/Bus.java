package h2;
import java.util.ArrayList;

public class Bus {
	public ArrayList<Passenger> passengers;
	
	public Bus() {
		passengers = new ArrayList<Passenger>();
	}
	
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	
	private void exitBus() {
		ArrayList<Passenger> leaves = new ArrayList<Passenger>();
		for(Passenger p : passengers) {
			if(p.planned == p.visited) {
				leaves.add(p);
			}
		}
		for(Passenger p : leaves) {
			passengers.remove(p);
		}
	}
	
	public void nextStop(Passenger[] boarding) {
		for(Passenger p : passengers) {
			p.visited += 1;
		}
		exitBus();
		for(Passenger p : boarding) {
			passengers.add(p);
		}
	}
	
	public void nextStop() {
		for(Passenger p : passengers) {
			p.visited += 1;
		}
		exitBus();
	}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> schwarzfahrer = new ArrayList<Passenger>();
		for(Passenger p : passengers) {
			if(!p.ticket) {
				schwarzfahrer.add(p);
			}
		}
		for(Passenger p : schwarzfahrer) {
			passengers.remove(p);
		}
		return schwarzfahrer;
	}
	
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		ArrayList<Passenger> steigtUm = new ArrayList<Passenger>();
		for(Passenger p : passengers) {
			for(String name : passengerNames) {
				if(p.name.equals(name)) {
					otherBus.enterBus(p);
					steigtUm.add(p);
				}
			}
		}
		for(Passenger p : steigtUm) {
			passengers.remove(p);
		}
	}
}
