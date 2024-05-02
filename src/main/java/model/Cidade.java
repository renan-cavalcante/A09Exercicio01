package model;

import java.util.HashMap;
import java.util.Map;

import controller.ICalculoImposto;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

public enum Cidade {
	SAO_PAULO("São Paulo",1) {
		@Override
		public ImpostoSaoPaulo defineCalculoImposto() {
			return new ImpostoSaoPaulo();
		}
	},
	BELO_HORIZONTE("Belo Horizonte",2) {
		@Override
		public ImpostoPortoAlegre defineCalculoImposto() {
			return new ImpostoPortoAlegre();
		}
	},
	PORTO_ALEGRE("Porto Alegre",3) {
		@Override
		public ImpostoPortoAlegre defineCalculoImposto() {
			return new ImpostoPortoAlegre();
		}
	},
	CURITIBA("Curitiba",4) {
		@Override
		public ImpostoCuritiba defineCalculoImposto() {
			return new ImpostoCuritiba();
		}
	};
	
	private String nome;
	private int numero;
	
	private static final Map<Integer, Cidade> map = new HashMap<>();;
	
	Cidade(String nome, int numero){
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public abstract ICalculoImposto defineCalculoImposto();
	
	public static  Map<Integer, Cidade> obtercidades() {
		
	    for (Cidade cidade : Cidade.values()) {
	        map.put(cidade.getNumero(), cidade);
	    }
	    return map;
	}
	
	public static Cidade getCidade(int num) {
		return map.get(num);
	}

}
