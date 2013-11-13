package FactoryMethod;

import Composite.ProdutoComponent;
import Composite.KitProduto;



public class KitProdutoFactory implements ProdutoComponentFactory {
	
	public ProdutoComponent getProdutoComponent() {
		return new KitProduto();
	}
}
