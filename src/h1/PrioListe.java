package h1;
import java.util.ArrayList;

public class PrioListe {
	public ArrayList<Patient> myList = new ArrayList<Patient>();
	
	public void addPatient(Patient p) {
		if(myList.isEmpty()) myList.add(p);
		else {
			int index = myList.size();
			for(Patient a : myList) {
				if((p.prio < a.prio) && myList.indexOf(a) < index) {
					index = myList.indexOf(a);
				}
			}
			myList.add(index, p);
		}
	}
	
	public Patient getNextPatient() {
		if(!myList.isEmpty()) {
			return myList.removeFirst();		
		}else {
			return null;
		}
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p);
	}
}
