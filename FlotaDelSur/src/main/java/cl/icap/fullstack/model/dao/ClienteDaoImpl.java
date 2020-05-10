package cl.icap.fullstack.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.fullstack.model.dto.ClienteDto;

@Repository
@Transactional 
public class ClienteDaoImpl implements ClienteDao {
	private String insert = "INSERT INTO Cliente VALUES(?,?,?,?,?,?,?,?,)";
	private String select = "SELECT * FROM Cliente WHERE CLIENTE_ID=?";
	private String update = "UPDATE Cliente SET CLIENTE_ID=?,CLIENTE_NOMBRE=?,CLIENTE_APELLIDO=?,CLIENTE_DIRECCION=?,COMUNA_CLIENTE=?,FONO_CLIENTE=?,CANT_PASAJEROS=?,NIVEL_ID =?,WHERE CLIENTE_ID"; 
	private String delete = "DELETE Cliente WHERE CLIENTE_ID=?";
	private String list  = "SELECT * FROM Cliente";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ClienteDaoImpl() {
	}

	@Override
	public int insert(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ClienteDto get(int CLIENTE_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ClienteDto clienteDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int CLIENTE_ID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ClienteDto> list() {
		List<ClienteDto> listCliente = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(ClienteDto.class));
		return listCliente;
	}

}
