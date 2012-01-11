package servicio.implementacion;

import java.util.List;

import dao.general.DaoConstante;
import dao.general.DaoIndicador;

import modelo.Constante;

import servicio.interfaz.IServicioConstante;

public class ServicioConstante implements IServicioConstante {
	
	DaoConstante daoConstante;
	
	public DaoConstante getDaoConstante() {
		return daoConstante;
	}

	public void setDaoConstante(DaoConstante daoConstante) {
		this.daoConstante = daoConstante;
	}

	@Override
	public void eliminar(Constante c) {
		// TODO Auto-generated method stub
		daoConstante.eliminar(c);

	}

	@Override
	public void agregar(Constante c) {
		// TODO Auto-generated method stub
		daoConstante.guardar(c);
	}

	@Override
	public void actualizar(Constante c) {
		// TODO Auto-generated method stub
		daoConstante.actualizar(c);
	}
//
//	@Override
//	public Constante buscarPorCodigo(Constante c) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Constante> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Constante> listarActivos() {
		// TODO Auto-generated method stub
		return daoConstante.listarActivos(Constante.class);
	}
	
}
