package mock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mock.dto.Customer;

public class Customerdao {
	EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entitymanager=entitymanagerfactory.createEntityManager();
	EntityTransaction entitytransaction=entitymanager.getTransaction();
	public void insert(Customer e1) {
		entitytransaction.begin();
		entitymanager.persist(e1);
		entitytransaction.commit();;
	}
	
	public  List<Customer> fetchallll(){
		Query q=entitymanager.createQuery("select data from Customer data");
	
	 List<Customer> b=q.getResultList();
	
	
		return b;
		}
	public String deleteData(String fname) {
		System.out.println("dao"+fname);
		Customer e2=entitymanager.find(Customer.class,fname);
		System.out.println(e2);
		 if(e2!=null) {
		entitytransaction.begin();
		entitymanager.remove(e2);
		entitytransaction.commit();
		return "data deleted successfully";
		
			}
			else {
				return "data not found";
			}
		
		}
		
		
	
	public void updatedata(Customer e1) {
		entitytransaction.begin();
		entitymanager.merge(e1);
		entitytransaction.commit();
	}
}
