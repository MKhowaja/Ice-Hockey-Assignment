
public class sortingMethods {
	public static void printandSortAge(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (jumbo[i].getAge() < jumbo[i+1].getAge()) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
		for (int i=0;i<jumbo.length;i++)
			System.out.println(jumbo[i].getFName()+" "+jumbo[i].getLName()+", age "+jumbo[i].getAge());
	}
}
