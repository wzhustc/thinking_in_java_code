package thinking_chapter11;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class PetCount {
	public static void main(String[] args) throws Exception, IllegalAccessException {
		Vector pets = new Vector();
		Class[] petTypes = {Pet.class, Dog.class, Cat.class, Pig.class};
		for (int i = 0; i < 15; i++) {
			int rnd = 1 + (int)(Math.random() * (petTypes.length - 1));
			pets.add(petTypes[rnd].newInstance());
		}
		Hashtable ht = new Hashtable();
		for (int i = 0; i < petTypes.length; i++) {
			ht.put(petTypes[i].toString(), new Counter());
		}
		
		for (int i = 0; i < pets.size(); i++) {
			Object o = pets.elementAt(i);
			if (o instanceof Pet) {
				((Counter)ht.get("thinking_chapter11.Pet")).i++;
			}
			if (o instanceof Dog) {
				((Counter)ht.get("thinking_chapter11.Dog")).i++;
			}
			if (o instanceof Cat) {
				((Counter)ht.get("thinking_chapter11.Cat")).i++;
			}
			if (o instanceof Pig) {
				((Counter)ht.get("thinking_chapter11.Pig")).i++;
			}
		}
		
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.elementAt(i).getClass().toString());
		}
		Set set = ht.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		
	}
}

class Pet {}

class Dog extends Pet{}

class Cat extends Pet{}

class Pig extends Pet{}

class Counter {
	int i;
}
