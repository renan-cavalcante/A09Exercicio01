package controller;

import model.Imovel;

public class ImpostoSaoPaulo implements ICalculoImposto {

	@Override
	public void defineImposto(Imovel imovel) {
		imovel.setImposto(( imovel.getAreaTotal() *10)+(imovel.getNumeroComodos()*2));
	}

}