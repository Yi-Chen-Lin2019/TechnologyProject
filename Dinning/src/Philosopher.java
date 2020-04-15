
public class Philosopher extends Thread {
	private Chopstick c1;
	private Chopstick c2;
	private String name;
	
	public Philosopher(Chopstick c1, Chopstick c2, String name) {
		this.c1 = c1;
		this.c2 = c2;
		this.name = name;
	}
	
	public void run() {
		
		while (c1.getState() != 0 && c2.getState() != 0) {
			//try {
				System.out.println("Philosopher " + name + " is starving");
				//this.wait();
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}					
		}
		// critical section
		c1.pickUp();
		c2.pickUp();	
		System.out.println("Philosopher " + name + " is eating, using chopstick " + c1.toString() + c2.toString());
		c1.putDown();
		c2.putDown();
		System.out.println("Philosopher " + name + " is thinking");			
		//this.notifyAll();
		
		
	}
}
