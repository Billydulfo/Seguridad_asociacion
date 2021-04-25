package mx.edu.uacm.seguridad.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

/*Prueba Unitaria*/
@SpringBootTest
public class UsuarioTest {
	private static final Logger log = LogManager.getLogger(UsuarioTest.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarUsuarioTest() {
		log.debug("Entrando al metodo debeGuardarUsuarioTest");
		Usuario usr = new Usuario();
		usr.setEmail("samy@gmail.com");
		usr.setPassword("pass123456");
		em.persist(usr);
		
		
	}
	
	

}