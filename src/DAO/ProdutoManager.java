package DAO;

import java.util.*;

import DAO.ProdutoDAO;

public class ProdutoManager {
	
	static ProdutoManager me;
	
	List<ProdutoDAO> produtos;
	
	private ProdutoManager(){
		produtos = new ArrayList<>();
		
		ProdutoDAO p = new ProdutoDAO();
	}
	
	public static ProdutoManager getInstance(){
		if( me==null )
			me = new ProdutoManager();
		return me;
	}
}
