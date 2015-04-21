package org.lichtspiele.UserZoneAPI.ebean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uz_zones")
public class Zones {

	@Id
	private int id;
		
	private String name;

	private int world_id;
	
	private int zone_type_id;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the world_id
	 */
	public int getWorld_id() {
		return world_id;
	}

	/**
	 * @param world_id the world_id to set
	 */
	public void setWorld_id(int world_id) {
		this.world_id = world_id;
	}

	/**
	 * @return the zone_type_id
	 */
	public int getZone_type_id() {
		return zone_type_id;
	}

	/**
	 * @param zone_type_id the zone_type_id to set
	 */
	public void setZone_type_id(int zone_type_id) {
		this.zone_type_id = zone_type_id;
	}

}
