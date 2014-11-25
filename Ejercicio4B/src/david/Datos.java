package david;

import java.util.Random;

public class Datos {
	public static final int TAM_ARG = 10;
	protected int[] argNumber = new int[TAM_ARG];
	volatile protected int argPosition = 0;
	volatile protected int totalSuma = 0;
	volatile protected int totalResta = 0;
	Random r = new Random();
	
	public void addNumber(){
		argNumber[argPosition] = r.nextInt(100);
		argPosition++;
	}
	
	public void sumNumber(){
		totalSuma += argNumber[argPosition - 1];
	}
	
	public void resNumber(){
		totalResta -= argNumber[argPosition - 1];
	}
	
	public int getTotalSuma(){
		return totalSuma;
	}
	
	public int getTotalResta(){
		return totalResta;
	}

}
