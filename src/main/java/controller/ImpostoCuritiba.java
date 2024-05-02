package controller;

import model.Imovel;

public class ImpostoCuritiba implements ICalculoImposto {

	@Override
	public void defineImposto(Imovel imovel) {
		Double impostoBase = (double) imovel.getAreaTotal() * 5f;
		if (imovel.getIdade() > 50) {
			imovel.setImposto(impostoBase + (imovel.getIdade() * 3));
			return;
		}

		if (imovel.getIdade() < 20) {
			imovel.setImposto(impostoBase + (imovel.getIdade() * 2));
			return;
		}

		imovel.setImposto(impostoBase + (imovel.getIdade() * 2.5f));
	}
}
