
public class KitProdutoFactory implements ProdutoComponentFactory {
	
	public ProdutoComponent getProdutoComponent() {
		return new KitProduto();
	}
}
