package cl.icap.fullstack.model.dto;

public class ClienteDto {
	
	private Integer CLIENTE_ID;     
	private String CLIENTE_NOMBRE;            
	private String CLIENTE_APELLIDO;            
	private String CLIENTE_DIRECCION;        
	private String COMUNA_CLIENTE;
	private Integer FONO_CLIENTE;                   
	private Integer CANT_PASAJEROS;       
	private Integer NIVEL_ID;       

	public ClienteDto() {
		
	}

	public Integer getCLIENTE_ID() {
		return CLIENTE_ID;
	}

	public void setCLIENTE_ID(Integer cLIENTE_ID) {
		CLIENTE_ID = cLIENTE_ID;
	}

	public String getCLIENTE_NOMBRE() {
		return CLIENTE_NOMBRE;
	}

	public void setCLIENTE_NOMBRE(String cLIENTE_NOMBRE) {
		CLIENTE_NOMBRE = cLIENTE_NOMBRE;
	}

	public String getCLIENTE_APELLIDO() {
		return CLIENTE_APELLIDO;
	}

	public void setCLIENTE_APELLIDO(String cLIENTE_APELLIDO) {
		CLIENTE_APELLIDO = cLIENTE_APELLIDO;
	}

	public String getCLIENTE_DIRECCION() {
		return CLIENTE_DIRECCION;
	}

	public void setCLIENTE_DIRECCION(String cLIENTE_DIRECCION) {
		CLIENTE_DIRECCION = cLIENTE_DIRECCION;
	}

	public String getCOMUNA_CLIENTE() {
		return COMUNA_CLIENTE;
	}

	public void setCOMUNA_CLIENTE(String cOMUNA_CLIENTE) {
		COMUNA_CLIENTE = cOMUNA_CLIENTE;
	}

	public Integer getFONO_CLIENTE() {
		return FONO_CLIENTE;
	}

	public void setFONO_CLIENTE(Integer fONO_CLIENTE) {
		FONO_CLIENTE = fONO_CLIENTE;
	}

	public Integer getCANT_PASAJEROS() {
		return CANT_PASAJEROS;
	}

	public void setCANT_PASAJEROS(Integer cANT_PASAJEROS) {
		CANT_PASAJEROS = cANT_PASAJEROS;
	}

	public Integer getNIVEL_ID() {
		return NIVEL_ID;
	}

	public void setNIVEL_ID(Integer nIVEL_ID) {
		NIVEL_ID = nIVEL_ID;
	}

}
