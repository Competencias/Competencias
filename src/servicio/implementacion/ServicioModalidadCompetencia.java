package servicio.implementacion;

import java.util.List;

import dao.general.DaoModalidadCompetencia;


import modelo.Divisa;
import modelo.ModalidadCompetencia;
import modelo.TipoCompetencia;
import servicio.interfaz.IServicioModalidadCompetencia;

public class ServicioModalidadCompetencia implements
		IServicioModalidadCompetencia {
	
	DaoModalidadCompetencia daoModalidadCompetencia;

	public DaoModalidadCompetencia getDaoModalidadCompetencia() {
		return daoModalidadCompetencia;
	}

	public void setDaoModalidadCompetencia(
		 DaoModalidadCompetencia daoModalidadCompetencia) {
		this.daoModalidadCompetencia = daoModalidadCompetencia;
	}

	@Override
	public void eliminar(ModalidadCompetencia mc) {
		ModalidadCompetencia m = (ModalidadCompetencia)mc;
		m.setEstatus('E');
		daoModalidadCompetencia.eliminar(mc);
		
	}
	
	
	@Override
	public void agregar(ModalidadCompetencia mc) {
		if (mc.getCodigoModalidadCompetencia() == 0){
			   int cod = daoModalidadCompetencia.listar(ModalidadCompetencia.class).size()+1;
			   mc.setCodigoModalidadCompetencia(cod);
			   mc.setEstatus('A');
			}
			daoModalidadCompetencia.guardar(mc);
			
		}

	@Override
	public List<ModalidadCompetencia> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModalidadCompetencia> listarActivos() {
		return daoModalidadCompetencia.listarActivos();
	}

	@Override
	public List<ModalidadCompetencia> buscarPorCodigo(ModalidadCompetencia mc) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<ModalidadCompetencia> listarModalidad (TipoCompetencia tc){
		return daoModalidadCompetencia.listarModalidad(tc);
	}
	@Override
	public List<ModalidadCompetencia> listarPorTipoCompetencia(TipoCompetencia tc) {
		return  daoModalidadCompetencia.listarPorTipoCompetencia2(tc);
	}

	

}
