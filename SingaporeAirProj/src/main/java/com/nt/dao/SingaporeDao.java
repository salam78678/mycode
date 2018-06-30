package com.nt.dao;

import java.util.List;

import com.nt.domain.SingaporeAirCargo;

public interface SingaporeDao {
	

	public void addSingaPore(SingaporeAirCargo spac);
	public void updateSingapore(SingaporeAirCargo spac);
	public List<SingaporeAirCargo> listSingaporeAirCargo();
	public SingaporeAirCargo getSingaporeByShipmentId(int id);
	public void removeSingapore(int id);

}
