package model;

public class Imovel {
	private String endereco;
	private Cidade cidade;
	private long areaTotal;
	private int numeroQuartos;
	private int numeroComodos;
	private Double areaGaragem;
	private int idade;
	private double imposto;
	
	public Imovel() {
		// TODO Auto-generated constructor stub
	}

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public final Cidade getCidade() {
		return cidade;
	}

	public final void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public final long getAreaTotal() {
		return areaTotal;
	}

	public final void setAreaTotal(long areaTotal) {
		this.areaTotal = areaTotal;
	}

	public final int getNumeroQuartos() {
		return numeroQuartos;
	}

	public final void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public final int getNumeroComodos() {
		return numeroComodos;
	}

	public final void setNumeroComodos(int numeroComodos) {
		this.numeroComodos = numeroComodos;
	}

	public final Double getAreaGaragem() {
		return areaGaragem;
	}

	public final void setAreaGaragem(Double areaGaragem) {
		this.areaGaragem = areaGaragem;
	}

	public final int getIdade() {
		return idade;
	}

	public final void setIdade(int idade) {
		this.idade = idade;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}
