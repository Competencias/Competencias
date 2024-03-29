package controlador.competencia;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import modelo.Competencia;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;


import comun.EstadoCompetencia;

/**
 * Controlador para el archivo 'FrmCalendario.zul'
 * 
 * @author Eduardo Ochoa
 * @version 1.0
 */

public class CntrlFrmCalendario extends GenericForwardComposer {
	
	
	Component formulario; 
	AnnotateDataBinder binder;	
	Competencia competencia;
		
	/**
	 * Metodo que se ejecuta una vez es renderizado el componente. Sobreescrito
	 * de la clase GenericFordwardComposer
	 * @param c Component
	 */
	@Override
	public void doAfterCompose(Component c) throws Exception {	
		super.doAfterCompose(c);
		formulario = c;    			
	}
	

	public void onClick$btnBuscarCompetencia(){
		
		Component catalogo = Executions.createComponents("/Competencias/Vistas/FrmCatalogoCompetencia.zul",null,null);
        catalogo.setVariable("formulario",formulario, false);
        catalogo.setVariable("estatus",EstadoCompetencia.REGISTRADA,false);
        
        formulario.addEventListener("onCatalogoCerrado", new EventListener() {
			@Override
			public void onEvent(Event arg0) throws Exception {
				  competencia =  (Competencia) formulario.getVariable("competencia",false);		
			}
		});
        
                
	}

}
