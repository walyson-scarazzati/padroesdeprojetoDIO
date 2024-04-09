package one.digitalinnovation.gof.singleton;

// Singleton "preguiçoso" no primeiro momento não disponibiliza a instância para o usuário 
public class SingletonLazy {
	
	private static SingletonLazy instancia; 
	
	//Como garanto que ninguem externamente não vai instanciar esse Singleton? Preciso criar o construtor
	//O construtor deve ser private para ninguém instanciar externamente
	private SingletonLazy() {
		//com ela e sem ela o resultado é o mesmo
		super();
	}
	//como garanto que essa instancia vai ser exposta para quem está chamando
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
