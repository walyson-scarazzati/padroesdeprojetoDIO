package one.digitalinnovation.gof.test;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// Singleton
		
		//Testes relacionados ao Design Pattern Singleton
		// não consegue instanciar pelo construtor 
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		// vou tentar chamar uma nova instancias sera ela vai chamar a mesma? 
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		//Resultado ele devolve o mesmo endereço de memória
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		// vou tentar chamar uma nova instancias sera ela vai chamar a mesma? 
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		//Resultado ele devolve o mesmo endereço de memória
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		// vou tentar chamar uma nova instancias sera ela vai chamar a mesma? 
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		//Resultado ele devolve o mesmo endereço de memória
		
		// Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
