package dao.general;

import java.util.List;

import modelo.DatoBasico;
import modelo.ModalidadCompetencia;
import modelo.TipoCompetencia;
import modelo.TipoDato;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoModalidadCompetencia extends dao.generico.GenericDao {

	public List<ModalidadCompetencia> listarActivos(){

		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(ModalidadCompetencia.class);
		c.add(Restrictions.eq("estatus",'A'));
		return c.list();
	}	
	
	public List<ModalidadCompetencia> listarModalidad(TipoCompetencia tc){
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(ModalidadCompetencia.class);
		c.add(Restrictions.eq("estatus",'A'));
		c.add(Restrictions.eq("tipoCompetencia",tc));
		return c.list();	
}
	
	public List<ModalidadCompetencia> listarPorTipoCompetencia2(TipoCompetencia tc){
	  	  Session session = getSession();
	  	  
	  	  Transaction tx = session.beginTransaction();
	  	  Criteria c = session.createCriteria(ModalidadCompetencia.class);
	  	  
	  	  List list = c.add(Restrictions.eq("tipoCompetencia",tc)).list();
	  	  return list;
	        
		  }
	
}
