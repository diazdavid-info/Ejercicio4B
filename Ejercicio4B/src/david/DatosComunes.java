package david;

import java.util.concurrent.Semaphore;

public class DatosComunes {
	Datos datos = new Datos();
	Semaphore paso = new Semaphore(1, true);
	Semaphore add = new Semaphore(1, true);
	Semaphore operationSuma = new Semaphore(0, true);
	Semaphore operationResta = new Semaphore(0, true);
}
