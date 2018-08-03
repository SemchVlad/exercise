package ru.argustelecom.vsemchenko.app;

import junit.framework.TestCase;
import org.junit.Test;
import ru.argustelecom.vsemchenko.app.model.ApplicationServer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author v.semchenko
 */
public class AppTest extends TestCase {

	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");

		try {
			EntityManager em = emf.createEntityManager();
			try {
				ApplicationServer appServer = new ApplicationServer();
				appServer.setAppServerName("app-ktp");
				appServer.setHost("jboss3");
				appServer.setPortOffSet(0);
				appServer.setInstallDirPath("/jboss_prod");
				appServer.setState("Runnig");



				em.persist(appServer);
			} finally {
				em.close();
			}
		}finally{
			emf.close();
		}
	}

}
