package cl.icap.fullstack.model.dao;

import java.util.List;

import cl.icap.fullstack.model.dto.ClienteDto;

public interface ClienteDao {
	public int insert(ClienteDto clienteDto);
	public ClienteDto get(int CLIENTE_ID );
	public int update(ClienteDto clienteDto );
	public int delete (int CLIENTE_ID);
	public List<ClienteDto> list();

}
