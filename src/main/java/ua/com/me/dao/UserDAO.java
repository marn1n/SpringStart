package ua.com.me.dao;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.me.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

@Repository
public class UserDAO {
//    private EntityManagerFactory entityManagerFactory;
//    {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
//        entityManagerFactoryBean.setPersistenceUnitName("xxx");
//        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//    }

//    public EntityManagerFactory getEntityManagerFactory() {
//        return entityManagerFactory;
//    }
//
//    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public UserDAO() {
    }


    @Transactional
    public void save(User user) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();
        entityManager.persist(user);

    }

//    public void close() {
//        entityManagerFactory.close();
//    }
}
