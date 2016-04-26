package com.test.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.test.model.UserInfo;

/**
 * Session Bean implementation class NewsletterRegistration
 */
@Stateless
public class NewsletterRegistration implements NewsletterRegistrationRemote, NewsletterRegistrationLocal {

    
    @PersistenceContext(name = "JPADB")
    private EntityManager em;
    
    /**
     * Default constructor. 
     */
    public NewsletterRegistration() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void registerUser(UserInfo userInfo) {
       em.persist(userInfo);        
    }

    @Override
    public UserInfo findUserByEmail(String email) {
      return (UserInfo) em.createQuery("SELECT u FROM UserInfo u WHERE u.email LIKE :email")
               .setParameter("email", email)
               .getSingleResult();
    }

}
