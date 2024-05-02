package controller;

import model.Imovel;

public class ImpostoPortoAlegre implements ICalculoImposto {

	@Override
	public void defineImposto(Imovel imovel) {
		if(imovel.getAreaGaragem() > 0.0f) {
			imovel.setImposto((imovel.getAreaTotal()*7.5f)+ (imovel.getAreaGaragem()*2.5f));
		}else {
			imovel.setImposto((imovel.getAreaTotal()*8f));
		}
	}
}
