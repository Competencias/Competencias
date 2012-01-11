package dao.general;

import java.util.List;

import modelo.Categoria;
import modelo.Divisa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dao.generico.GenericDao;

public class DaoCategoria extends GenericDao {
	
	
	public List<Categoria> listarActivos(){
		//Permite buscar todas las divisas con estatus = 'A'
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(Categoria.class);
		List lista = c.add(Restrictions.eq("estatus",'A')).list();
		return lista;
	}
	
	public List<Categoria> listarcodigos(String nombreCategoria){
		//Permite buscar todas las divisas con estatus = 'A'
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		Criteria c = getSession().createCriteria(Categoria.class);
		List lista = c.add(Restrictions.eq("nombre",nombreCategoria)).list();
		
		return lista;
	}

	
	
	
	
}
