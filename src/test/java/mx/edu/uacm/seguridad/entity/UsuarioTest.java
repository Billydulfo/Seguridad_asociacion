package mx.edu.uacm.seguridad.entity;

import java.util.HashSet;
import java.util.Set;

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

	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarUsuarioRolTest() {
		log.debug("esntrando a debe guardar usuario test");
		Usuario usr = new Usuario();
		usr.setEmail("pambolin@uacm.edu.mx");
		usr.setPassword("123456789");
		
		Rol rol  =  new Rol();
		rol.setNombreRol("Admin");
		rol.setCliente(usr);
		
		Rol rol1  =  new Rol();
		rol1.setNombreRol("user");
		rol1.setCliente(usr);

		Set<Rol> roles = new HashSet<>();
		roles.add(rol);
		roles.add(rol1);
		usr.setRoles(roles);
		
		em.persist(usr);	
	}
}