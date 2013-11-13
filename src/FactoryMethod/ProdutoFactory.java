package FactoryMethod;

import Composite.ProdutoComponent;
import Composite.Produto;



public class ProdutoFactory implements ProdutoComponentFactory {
	
	public ProdutoComponent getProdutoComponent(){
		return new Produto();
	}
}
