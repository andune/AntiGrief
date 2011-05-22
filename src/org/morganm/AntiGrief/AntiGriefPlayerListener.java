/**
 * 
 */
package org.morganm.AntiGrief;

import org.bukkit.event.player.PlayerListener;

/**
 * @author morganm
 *
 */
public class AntiGriefPlayerListener extends PlayerListener {
	private AntiGrief ag;
	
	public AntiGriefPlayerListener(AntiGrief ag) {
		this.ag = ag;
	}

}
