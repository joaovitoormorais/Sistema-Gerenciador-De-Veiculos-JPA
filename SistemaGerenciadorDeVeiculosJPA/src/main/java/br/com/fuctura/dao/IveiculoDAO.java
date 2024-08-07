package br.com.fuctura.dao;

import java.util.List;

import br.com.fcutura.dto.PlacaPrecoVeiculoDTO;
import br.com.fuctura.entity.Veiculo;


//nao posso colocar codigo aqui!
public interface IveiculoDAO {
	
	//select * from veiculo
	public List<Veiculo> findAll();
	public List<PlacaPrecoVeiculoDTO> findVeiculoByAno(int ano);
}
