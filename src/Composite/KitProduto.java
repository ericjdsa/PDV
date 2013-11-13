package Composite;

import java.util.List;
import java.util.ArrayList;

/** "Composite" **/

public class KitProduto implements ProdutoComponent {
	
	private List<ProdutoComponent> childProdutoComponent = new ArrayList<ProdutoComponent>();
	
	public void add(ProdutoComponent produto) {
		childProdutoComponent.add(produto);
    }
 
    //Removes the graphic from the composition.
    public void remove(ProdutoComponent produto) {
    	childProdutoComponent.remove(produto);
    }

}
