package cl.icap.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstack.model.dao.ClienteDao;
import cl.icap.fullstack.model.dto.ClienteDto;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteDao clienteDao;
	
	public ClienteServiceImpl() {
	}

	public List<ClienteDto> list(){
		return clienteDao.list();
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
	
}
