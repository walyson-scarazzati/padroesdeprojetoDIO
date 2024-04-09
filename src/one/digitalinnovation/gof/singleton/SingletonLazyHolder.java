package one.digitalinnovation.gof.singleton;

//Singleton Lazy Holder
public class SingletonLazyHolder {
	
	// encapsular essa instancia em uma classe estatica interna
	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder(); 
	}	
	private SingletonLazyHolder() {
		//com ela e sem ela o resultado é o mesmo
		super();
	}
	//como garanto que essa instancia vai ser exposta para quem está chamando
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
