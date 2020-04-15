
public class Chopstick {
	int state = 0;
	private String name;
	
	public Chopstick(String name) {
		state = 0;
		this.name = name;
	}
	
	synchronized public int getState() {
		notify();
		return state;
	}
	
	synchronized public void putDown() {
		state = 0;
		notify();
	}
	
	synchronized public void pickUp() {
		state = 1;
		notify();
	}
	
	public String toString() {
		return name;
	}
	
}
