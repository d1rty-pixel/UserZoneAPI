package org.lichtspiele.UserZoneAPI.ebean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "uz_zone_players")
public class ZonePlayers {

	public static enum ZonePlayerType {
		OWNER, MEMBER
	}
	
	private int zone_id;
	
	private String zone_player_type;
	
	private int player_id;

	/**
	 * @return the zone_id
	 */
	public int getZone_id() {
		return zone_id;
	}

	/**
	 * @param zone_id the zone_id to set
	 */
	public void setZone_id(int zone_id) {
		this.zone_id = zone_id;
	}
	
	/**
	 * @return the zone_player_type
	 */
	public String getZone_player_type() {
		return zone_player_type;
	}

	/**
	 * @param zone_player_type the zone_player_type to set
	 */
	public void setZone_player_type(String zone_player_type) {
		this.zone_player_type = zone_player_type;
	}

	/**
	 * @return the player_id
	 */
	public int getPlayer_id() {
		return player_id;
	}

	/**
	 * @param player_id the player_id to set
	 */
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	
}
