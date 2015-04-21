package org.lichtspiele.UserZoneAPI.ebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "uz_zone_properties")
public class ZoneProperties {

	public static enum ZonePropertyType {
		WORLDGUARD_REGION_FLAG
	}
	
	private int zone_id;
	
	private String zone_property_type;
	
	@Column(columnDefinition = "TEXT")
	private String property;

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
	 * @return the zone_property_type
	 */
	public String getZone_property_type() {
		return zone_property_type;
	}

	/**
	 * @param zone_property_type the zone_property_type to set
	 */
	public void setZone_property_type(String zone_property_type) {
		this.zone_property_type = zone_property_type;
	}

	/**
	 * @return the property
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * @param property the property to set
	 */
	public void setProperty(String property) {
		this.property = property;
	}
}
