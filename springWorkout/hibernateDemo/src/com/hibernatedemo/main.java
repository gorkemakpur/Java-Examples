package com.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;


public class main {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try 
		{
			session.beginTransaction();
			//from City where CountryCode='TUR' AND District='Sivas' �rnek-1-
			//from City where Name LIKE '%iva%' �rnek-2-
			//from City as c ORDER BY c.name DESC �rnek-3-
			/* �rnek-4-
			 List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
			
			for(String countryCode :countryCodes) 
			{															
				System.out.println(countryCode);
			} 
			 */
			
			/*	insert �nre�i
			 * City city=new City(); city.setName("Sivas58"); city.setCountryCode("TUR");
			 * city.setDistrict("Sivas"); city.setPopulation(999111333); session.save(city);
			 */
			
			
			/* Update �rne�i
			 * City city=session.get(City.class,4086); city.setPopulation(3333333);
			 * city.setName("Sivas123456");
			 */
			
			
			//Delete �rne�i
			City city=session.get(City.class, 4086);
			session.delete(city);
			
			session.getTransaction().commit();
			
		} 
		
		finally 
		{
			factory.close();		
		}
		
	}

}
