package h1;

public class H1_Main {

	public static void main(String[] args) {
		PrioListe list = new PrioListe();
		Patient a = new Patient("Kurt",1);
		Patient b = new Patient("Bernd",10);
		Patient c = new Patient("Bastian",5);
		Patient d = new Patient("Karl",7);
		list.addPatient(a);
		list.addPatient(b);
		list.addPatient(c);
		list.addPatient(d);
		System.out.println(list.getNextPatient().name);
		System.out.println(a.name + ": " + list.getPosition(a));
		if(!list.myList.isEmpty()) {
			for(Patient p : list.myList) {
				System.out.print(p.name + "-->");
			}
			System.out.print("||");
		}
		
	}
}
