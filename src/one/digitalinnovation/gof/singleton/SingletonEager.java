package one.digitalinnovation.gof.singleton;

//Singleton "apressado"
public class SingletonEager {

	// atribui a instancia aqui, acontece que no momento que a classe SingletonEager for acionada essa instancia é atribuida vai estar 
	//pronta para ser retornada 
	private static SingletonEager instancia = new SingletonEager(); 
	
	private SingletonEager() {
		//com ela e sem ela o resultado é o mesmo
		super();
	}
	//como garanto que essa instancia vai ser exposta para quem está chamando
	public static SingletonEager getInstancia() {
		return instancia;
	}
	
}
