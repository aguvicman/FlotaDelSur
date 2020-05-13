package cl.icap.fullstack.model.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Viaje")
@EntityListeners(AuditingEntityListener.class)
public class ViajeDto {
	@Id
	private Integer VIAJE_ID;     
	private Integer CLIENTE_ID;            
	private Integer TIPOVIAJE_ID;            
	private Integer REGION_ID;        
	private Integer COMUNA_ID;
	private String VEHICULO_ID;                   
	private Integer CONDUCTOR_ID;       
	private Date VIAJE_FECHA;       
	private Integer TIPOPAGO_ID;
	private Integer COSTO;
	
	public ViajeDto() {
		
	}

	public Integer getVIAJE_ID() {
		return VIAJE_ID;
	}

	public void setVIAJE_ID(Integer vIAJE_ID) {
		VIAJE_ID = vIAJE_ID;
	}

	public Integer getCLIENTE_ID() {
		return CLIENTE_ID;
	}

	public void setCLIENTE_ID(Integer cLIENTE_ID) {
		CLIENTE_ID = cLIENTE_ID;
	}

	public Integer getTIPOVIAJE_ID() {
		return TIPOVIAJE_ID;
	}

	public void setTIPOVIAJE_ID(Integer tIPOVIAJE_ID) {
		TIPOVIAJE_ID = tIPOVIAJE_ID;
	}

	public Integer getREGION_ID() {
		return REGION_ID;
	}

	public void setREGION_ID(Integer rEGION_ID) {
		REGION_ID = rEGION_ID;
	}

	public Integer getCOMUNA_ID() {
		return COMUNA_ID;
	}

	public void setCOMUNA_ID(Integer cOMUNA_ID) {
		COMUNA_ID = cOMUNA_ID;
	}

	public String getVEHICULO_ID() {
		return VEHICULO_ID;
	}

	public void setVEHICULO_ID(String vEHICULO_ID) {
		VEHICULO_ID = vEHICULO_ID;
	}

	public Integer getCONDUCTOR_ID() {
		return CONDUCTOR_ID;
	}

	public void setCONDUCTOR_ID(Integer cONDUCTOR_ID) {
		CONDUCTOR_ID = cONDUCTOR_ID;
	}

	public Date getVIAJE_FECHA() {
		return VIAJE_FECHA;
	}

	public void setVIAJE_FECHA(Date vIAJE_FECHA) {
		VIAJE_FECHA = vIAJE_FECHA;
	}

	public Integer getTIPOPAGO_ID() {
		return TIPOPAGO_ID;
	}

	public void setTIPOPAGO_ID(Integer tIPOPAGO_ID) {
		TIPOPAGO_ID = tIPOPAGO_ID;
	}

	public Integer getCOSTO() {
		return COSTO;
	}

	public void setCOSTO(Integer cOSTO) {
		COSTO = cOSTO;
	}


	
}
