package controller;

import model.Imovel;

public class ImpostoBeloHorizonte implements ICalculoImposto {

	@Override
	public void defineImposto(Imovel imovel) {
		imovel.setImposto((imovel.getAreaTotal() * 7) + (imovel.getNumeroQuartos() * 4));
	}
}
