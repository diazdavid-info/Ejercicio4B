package david;

public class AddProductor implements Runnable{
	DatosComunes datosComunes;
	
	public AddProductor(DatosComunes dc){
		datosComunes = dc;
	}
	
	public void run(){
		for (int i = 0; i < datosComunes.datos.argNumber.length; i++) {
			datosComunes.add.acquireUninterruptibly();
			datosComunes.paso.acquireUninterruptibly();
			datosComunes.datos.addNumber();
			datosComunes.paso.release();
			datosComunes.operationSuma.release();
		}
	}

}
