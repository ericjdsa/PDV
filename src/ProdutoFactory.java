
public class ProdutoFactory implements ProdutoComponentFactory {
	
	public ProdutoComponent getProdutoComponent(){
		return new Produto();
	}
}
