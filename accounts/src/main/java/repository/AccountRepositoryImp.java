package repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import model.Accounts;

@Repository
public class AccountRepositoryImp implements AccountRepository {
	
	public EntityManager entityManager;
	
	@Autowired
	public AccountRepositoryImp(EntityManager entitymanager) {
	
		entityManager = entitymanager;
		
	}
	
	@Override
	public Accounts getDataByAccountNumber() {
		// TODO Auto-generated method stub
        Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Accounts> query = currentSession.createQuery("from Accounts",Accounts.class); 
		
		Accounts account= query.getSingleResult();
		return account;
	}

}
