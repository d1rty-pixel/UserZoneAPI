package org.lichtspiele.UserZoneAPI.ebean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uz_zone_types")
public class ZoneTypes {

	@Id
	private int id;
	
	private String name;
	
	private int max_per_player;

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
	 * @return the max_per_player
	 */
	public int getMax_per_player() {
		return max_per_player;
	}

	/**
	 * @param max_per_player the max_per_player to set
	 */
	public void setMax_per_player(int max_per_player) {
		this.max_per_player = max_per_player;
	}
	
	
	
}
