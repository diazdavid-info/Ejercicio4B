package david;

public class RestaConsumidor implements Runnable{
	DatosComunes datosComunes;
	
	public RestaConsumidor(DatosComunes dc){
		datosComunes = dc;
	}
	
	public void run(){
		for (int i = 0; i < datosComunes.datos.argNumber.length; i++) {
			datosComunes.operationResta.acquireUninterruptibly();
			datosComunes.paso.acquireUninterruptibly();
			datosComunes.datos.resNumber();
			datosComunes.paso.release();
			datosComunes.add.release();
		}
	}

}
