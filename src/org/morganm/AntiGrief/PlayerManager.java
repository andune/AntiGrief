/**
 * 
 */
package org.morganm.AntiGrief;

import org.bukkit.entity.Player;

/**
 * This object keeps track of online players and their "grief" totals from all actions thus far.
 * 
 * @author morganm
 *
 */
public class PlayerManager {
	private static PlayerManager instance;
	
	private 
	
	// singleton pattern
	public static PlayerManager getInstance() {
		if( instance == null ) {
			synchronized(PlayerManager.class) {
				if( instance == null )
					instance = new PlayerManager();
			}
		}
		
		return instance;
	}
	
	/** When a player does something that adds to their "grief value", this method is called to increase their
	 * grief counter.
	 * 
	 * @param p the Player object to add/subject points to 
	 * @param points the amount of points to add (can be negative to remove grief points for positive behavior)
	 */
	public void addGriefPoints(Player p, int points) {
		playerMap
	}
}
