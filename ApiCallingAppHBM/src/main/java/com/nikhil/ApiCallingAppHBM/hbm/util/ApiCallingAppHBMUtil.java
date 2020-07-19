package com.nikhil.ApiCallingAppHBM.hbm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiCallingAppHBMUtil {

	private static SessionFactory cObjSessionFactory;
	private static Logger LOG = LoggerFactory.getLogger(ApiCallingAppHBMUtil.class);
	
	private static SessionFactory getSessionFactory() throws Exception{
		Configuration lObjConfiguration;
		ServiceRegistry lObjServiceRegistry;
		
		try {
			if(cObjSessionFactory == null) {
				lObjConfiguration = new Configuration().configure("ApiCallingApp.cfg.xml");
				lObjServiceRegistry = new StandardServiceRegistryBuilder().applySettings(lObjConfiguration.getProperties()).build();
				
				cObjSessionFactory = lObjConfiguration.buildSessionFactory(lObjServiceRegistry);
				System.out.println("SessionFactory created");
				return cObjSessionFactory;
			}else {
				return cObjSessionFactory;
			}
		} catch (Exception e) {
			LOG.info("Important message:{}",e);
			throw e;
		}finally {
			lObjConfiguration = null;
			lObjServiceRegistry = null;
		}
	}
	
	public Session getHbmSession() throws Exception{
		SessionFactory lObjSessionFactory;
		Session lObjSession;
		try {
			lObjSessionFactory = getSessionFactory();
			lObjSession = lObjSessionFactory.getCurrentSession();
			if(lObjSession != null) {
				System.out.print("Got the session");
			}
			return lObjSession;
		} catch (Exception e) {
			LOG.info("important message: ",e);
			throw e;
		}
	}
}
