package mx.edu.uacm.seguridad.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class PermisoTest {
private static final Logger log = LogManager.getLogger(PermisoTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarPermisoTest() {
		log.debug("Entrando al metodo debeGuardarPermisoTest");
		Permiso p  =  new Permiso();
		p.setNombrePermiso("Leer");
		/*
		Permiso p1  =  new Permiso();
		p1.setNombrePermiso("Escribir");
		*/
		
		em.persist(p);	
		
	}
	

}
