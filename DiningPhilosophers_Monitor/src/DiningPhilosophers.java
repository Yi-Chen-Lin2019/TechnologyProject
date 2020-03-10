
public class DiningPhilosophers {
	static States[] states = new States[5];
	
	public void pickup (int i) {
		states[i] = States.HUNGRY;
		System.out.println("Philosopher "+i+" is hungry...");
		test(i);
		try {
			if(states[i] != States.EATING) {
				wait();
			} 
		} catch (InterruptedException e) { }
		finally {};	
		
	}
	
	public void putdown (int i) {
		states[i] = States.THINKING;
		System.out.println("Philosopher "+i+" is thinking...");
		//test left and right neighbors
		test((i+4)%5); //left
		test((i+1)%5); //right
	}
	public void test (int i) {		
		if(states[(i+4)%5] != States.EATING && 
		states[i].equals(States.HUNGRY) &&
		states[(i+1)%5] != States.EATING){
			states[i] = States.EATING;
			System.out.println("Philosopher "+i+" is eating...");
			//notify();
		}
	}

}	
	

