package david;

public class SumaConsumidor implements Runnable {
	DatosComunes datosComunes;
	
	public SumaConsumidor(DatosComunes dc){
		datosComunes = dc;
	}
	
	public void run(){
		for (int i = 0; i < datosComunes.datos.argNumber.length; i++) {
			datosComunes.operationSuma.acquireUninterruptibly();
			datosComunes.paso.acquireUninterruptibly();
			datosComunes.datos.sumNumber();
			datosComunes.paso.release();
			datosComunes.operationResta.release();
		}
	}

}
