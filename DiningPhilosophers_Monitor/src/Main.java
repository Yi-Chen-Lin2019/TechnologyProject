
public class Main {
	public static void main(String[] args) {
		DiningPhilosophers d = new DiningPhilosophers();
		for (int i = 0; i < 5; i++) {
			d.states[i] = States.THINKING;
		}
		for (int i = 0; i < 5; i++) {
			d.pickup(i);
			d.putdown(i);
		}
	}
}
