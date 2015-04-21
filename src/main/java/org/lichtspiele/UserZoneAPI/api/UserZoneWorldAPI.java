package org.lichtspiele.UserZoneAPI.api;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class UserZoneWorldAPI {

	public static void add(World world) {
		
	}
	
	public static void add(String world_name) {
		add(Bukkit.getWorld(world_name));
	}
		
	
	public static boolean exists(World world) {
		
		world.getUID();
		
		return false;
	}
	
	public static boolean exists(String world_name) {
		return true;
	}
	
	
	
	public static void remove(World world) {
		
	}
	
	public static void remove(String world_name) {
		
	}
	
	
	public static boolean hasZones(World world) {
		return true;
	}
	
	public static boolean hasZones(String world_name) {
		return true;
	}
	
}
