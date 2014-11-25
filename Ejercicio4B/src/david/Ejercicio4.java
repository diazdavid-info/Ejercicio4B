package david;

public class Ejercicio4 {

	public static void main(String[] args) throws InterruptedException {
		int totalSuma = 0;
		int totalResta = 0;
		DatosComunes dc = new DatosComunes();
		
		AddProductor productor = new AddProductor(dc);
		SumaConsumidor suma = new SumaConsumidor(dc);
		RestaConsumidor resta = new RestaConsumidor(dc);
		
		Thread t1,t2,t3;
		
		t1 = new Thread(productor, "Productor");
		t2 = new Thread(suma, "SumaConsumidor");
		t3 = new Thread(resta, "RestaConsumidor");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		for (int i = 0; i < dc.datos.argNumber.length; i++) {
			totalSuma += dc.datos.argNumber[i];
			totalResta -= dc.datos.argNumber[i];
		}
		
		System.out.println("Total suma: "+dc.datos.getTotalSuma()+" Esperado: "+totalSuma);
		System.out.println("Total resta: "+dc.datos.getTotalResta()+" Esperado: "+totalResta);

	}

}
