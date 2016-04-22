import java.util.Random;


public class RandomRolls {

	public static void main(String[] args) {
		Random rnd = new Random();
		int roll;
		final int NUMROLLS = 10000;
		int f1=0, f2=0, f3=0, f4=0, f5=0, f6=0;
		for (int i = 0; i < NUMROLLS; i++){
			roll = 1+rnd.nextInt(6);
			if (roll == 1){
				f1++;
			}
		}

	}

}
