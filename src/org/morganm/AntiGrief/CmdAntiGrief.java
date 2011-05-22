/**
 * 
 */
package org.morganm.AntiGrief;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * @author morganm
 *
 */
public class CmdAntiGrief implements CommandExecutor {
	private AntiGrief ag;
	
	public CmdAntiGrief(AntiGrief ag) {
		this.ag = ag;
	}

	/* (non-Javadoc)
	 * @see org.bukkit.command.CommandExecutor#onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[])
	 */
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2,	String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
