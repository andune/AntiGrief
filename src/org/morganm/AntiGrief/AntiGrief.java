/**
 * 
 */
package org.morganm.AntiGrief;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author morganm
 *
 */
public class AntiGrief extends JavaPlugin {
	private final AntiGriefBlockListener blockListener = new AntiGriefBlockListener(this);
	private final AntiGriefPlayerListener playerListener = new AntiGriefPlayerListener(this);

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.Plugin#onDisable()
	 */
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.bukkit.plugin.Plugin#onEnable()
	 */
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Type.PLAYER_INTERACT, playerListener, Priority.Low, this);
		pm.registerEvent(Type.BLOCK_BREAK, blockListener, Priority.Highest, this);
		getCommand("antigrief").setExecutor(new CmdAntiGrief(this));
	}

}
