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
public class RolTest {
	private static final Logger log = LogManager.getLogger(RolTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarRolTest() {
		log.debug("Entrando al metodo debeGuardarRolTest");	
		Rol r =  new Rol();
		r.setNombreRol("Asistente");
		
		em.persist(r);	
		
	}
	
	
}
