
public class Main {
	
	public static void main(String[] args) {
		//Chopstick[] c = new Chopstick[5];
		Chopstick c0 = new Chopstick("c0");
		Chopstick c1 = new Chopstick("c1");
		Chopstick c2 = new Chopstick("c2");
		Chopstick c3 = new Chopstick("c3");
		Chopstick c4 = new Chopstick("c4");
		
		
		Philosopher A = new Philosopher(c0, c1, "a");
		Philosopher B = new Philosopher(c1, c2, "b");
		Philosopher C = new Philosopher(c2, c3, "c");
		Philosopher D = new Philosopher(c3, c4, "d");
		Philosopher E = new Philosopher(c4, c0, "e");
		 
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		
	}

}
