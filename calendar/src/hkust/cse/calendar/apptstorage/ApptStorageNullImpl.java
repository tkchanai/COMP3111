package hkust.cse.calendar.apptstorage;

import hkust.cse.calendar.unit.Appt;
import hkust.cse.calendar.unit.Location;
import hkust.cse.calendar.unit.TimeSpan;
import hkust.cse.calendar.unit.User;

public class ApptStorageNullImpl extends ApptStorage {

	private User defaultUser = null;
	
	public ApptStorageNullImpl( User user )
	{
		defaultUser = user;
	}
	
	Location[] _locations;
	
	@Override
	public Location[] getLocationList() {
		return _locations;
	}
	@Override
	public void setLocationList(Location[] locations) {
		_locations = locations;
	}
	
	@Override
	public void SaveAppt(Appt appt) {
		// TODO Auto-generated method stub
		System.out.println("Update");
	}

	@Override
	public Appt[] RetrieveAppts(TimeSpan d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appt[] RetrieveAppts(User entity, TimeSpan time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appt RetrieveAppts(int joinApptID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateAppt(Appt appt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveAppt(Appt appt) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getDefaultUser() {
		// TODO Auto-generated method stub
		return defaultUser;
	}

	@Override
	public void LoadApptFromXml() {
		// TODO Auto-generated method stub

	}

}
