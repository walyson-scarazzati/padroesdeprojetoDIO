package subsistema2.cep;

public class CepApi {

private static CepApi instancia = new CepApi(); 
	
	private CepApi() {
		//com ela e sem ela o resultado é o mesmo
		super();
	}
	//como garanto que essa instancia vai ser exposta para quem está chamando
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
	
}
