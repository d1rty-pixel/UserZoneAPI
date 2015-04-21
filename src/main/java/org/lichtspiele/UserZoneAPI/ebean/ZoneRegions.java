package org.lichtspiele.UserZoneAPI.ebean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "uz_zone_regions")
public class ZoneRegions {

	public static enum ZoneRegionType {
		CUBOID, POLY2D
	}
	
	private int zone_id;
	
	private String region_type;

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
	 * @return the region_type
	 */
	public String getRegion_type() {
		return region_type;
	}

	/**
	 * @param region_type the region_type to set
	 */
	public void setRegion_type(String region_type) {
		this.region_type = region_type;
	}

}
