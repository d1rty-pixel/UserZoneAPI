package org.lichtspiele.UserZoneAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.persistence.PersistenceException;

import org.bukkit.plugin.java.JavaPlugin;
import org.lichtspiele.UserZoneAPI.ebean.*;

public class UserZoneAPIPlugin extends JavaPlugin {


	private void setupDatabase() {
		try {
			getDatabase().find(ZoneTypes.class).findRowCount();
			getDatabase().find(Players.class).findRowCount();
			getDatabase().find(Worlds.class).findRowCount();
		} catch (PersistenceException e) {
			//log(Level.INFO, "Installing missing database tables");
			installDDL();
		}
	}
	
	@Override
	public List<Class<?>> getDatabaseClasses() {
		List<Class<?>> list = new ArrayList<Class<?>>();
		list.add(Players.class);
		list.add(Worlds.class);
		list.add(ZoneTypes.class);
		return list;
	}
	
	
}