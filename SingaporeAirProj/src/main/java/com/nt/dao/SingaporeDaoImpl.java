package com.nt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;

import com.nt.domain.SingaporeAirCargo;

public class SingaporeDaoImpl implements SingaporeDao {
	private static final org.slf4j.Logger logger =  LoggerFactory.getLogger(SingaporeDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addSingaPore(SingaporeAirCargo spac) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(spac);
		logger.info("Singapore saved successfully,SingaporeDetails="+spac);
	}

	@Override
	public void updateSingapore(SingaporeAirCargo spac) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(spac);
		logger.info("SingaporeAirCargo, Person Details="+spac);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SingaporeAirCargo> listSingaporeAirCargo() {
		Session session = this.sessionFactory.getCurrentSession();
		List<SingaporeAirCargo> SingaporeList = session.createQuery("from SingaporeAirCargo").list();
		for(SingaporeAirCargo sac : SingaporeList){
			logger.info("Person List::"+sac);
		}
		return SingaporeList;
	}

	@Override
	public SingaporeAirCargo getSingaporeByShipmentId(int shipmentId) {
		Session session = this.sessionFactory.getCurrentSession();		
		SingaporeAirCargo sac = (SingaporeAirCargo) session.load(SingaporeAirCargo.class, new Integer(shipmentId));
		logger.info("SingaporeAirCargo, SingaporeAirCargo details="+sac);
		return sac;
		
	}

	@Override
	public void removeSingapore(int shipmentId) {
		Session session = this.sessionFactory.getCurrentSession();
		SingaporeAirCargo sac = session.load(SingaporeAirCargo.class, new Integer(shipmentId));
		if(null != sac){
			session.delete(sac);
		}
		logger.info("SingaporeAirCargo  deleted successfully, SingaporeAirCargo  details="+sac);
	}
	}


