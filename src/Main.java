import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int bothmale = 0;
		int steps = 0;
		while (true) {
			boolean a = r.nextBoolean();
			boolean b = r.nextBoolean();
			if (a | b) {
			steps++;
				if (a && b) {
					bothmale++;
				}
			}
			System.out.println(steps+": "+(float)bothmale/steps);
		}
	}

}
