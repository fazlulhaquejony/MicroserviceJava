package com.fjtech.loans.repository;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.fjtech.loans.models.Loan;

@Repository
public class LoanRepoImp implements LoanRepo {

	public EntityManager entityManager ;
	
	public LoanRepoImp(EntityManager entityManager)
	{
		this.entityManager =entityManager;
	}
	
	@Override
	public Loan getData() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<Loan> query =  session.createQuery("from Loan",Loan.class);
		Loan loan =  query.getSingleResult();
		
		return loan;
	}

}
