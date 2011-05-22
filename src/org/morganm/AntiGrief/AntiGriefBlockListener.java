/**
 * 
 */
package org.morganm.AntiGrief;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

/** Here we listen for block break/create events.
 * 
 * Lots of block creation events accumulate points towards us not being a fly-by griefer. Lots of
 * block break events on player-created blocks (such as cobble or wood planks) accumulate griefer
 * points that lead us toward the conclusion that this is a griefer.
 * 
 * @author morganm
 *
 */
public class AntiGriefBlockListener extends BlockListener {
	private static Map<Material, Integer> playerMaterials = new HashMap<Material, Integer>();
	private AntiGrief ag;
	
	public AntiGriefBlockListener(AntiGrief ag) {
		this.ag = ag;
		fillPlayerMaterials();
	}
	
    @Override
    public void onBlockBreak(BlockBreakEvent event) {
    	// check to see if player is "ignored" (ie. they have a Permission that indicates they shouldn't be subject to AntiGrief checks)
    	
    	Block b = event.getBlock();
    	Material m = b.getType();
    	
    	Integer weight = playerMaterials.get(m);
    	if( weight != null ) {
    		; // add griefer weighting to current player.
    	}
    }

	/** Fill our private playerBlocks Map with all the blocks that we consider player-created along
	 * with their associated weighting.
	 * 
	 */
	private void fillPlayerMaterials()
	{
		playerMaterials.put(Material.COBBLESTONE, Integer.valueOf(5)); // not ALWAYS true, but most commonly so
		playerMaterials.put(Material.TORCH, Integer.valueOf(5));
		playerMaterials.put(Material.WORKBENCH, Integer.valueOf(5));

		playerMaterials.put(Material.GLASS, Integer.valueOf(10));
		playerMaterials.put(Material.WOOL, Integer.valueOf(10));
		playerMaterials.put(Material.WOOD, Integer.valueOf(10));	// wooden plank
		
		playerMaterials.put(Material.RAILS, Integer.valueOf(15));
		playerMaterials.put(Material.POWERED_RAIL, Integer.valueOf(15));
		playerMaterials.put(Material.COBBLESTONE_STAIRS, Integer.valueOf(10));
		
		playerMaterials.put(Material.WOODEN_DOOR, Integer.valueOf(20));
		playerMaterials.put(Material.BED_BLOCK, Integer.valueOf(20));
		playerMaterials.put(Material.DOUBLE_STEP, Integer.valueOf(20));
		playerMaterials.put(Material.STEP, Integer.valueOf(20));
		playerMaterials.put(Material.BRICK, Integer.valueOf(20));
		playerMaterials.put(Material.BOOKSHELF, Integer.valueOf(20));
		playerMaterials.put(Material.WOOD_STAIRS, Integer.valueOf(20));		
		playerMaterials.put(Material.SIGN_POST, Integer.valueOf(20));
		playerMaterials.put(Material.LADDER, Integer.valueOf(20));
		playerMaterials.put(Material.WALL_SIGN, Integer.valueOf(20));
		playerMaterials.put(Material.STONE_PLATE, Integer.valueOf(20));
		playerMaterials.put(Material.IRON_DOOR_BLOCK, Integer.valueOf(20));
		playerMaterials.put(Material.WOOD_PLATE, Integer.valueOf(20));
		playerMaterials.put(Material.REDSTONE_TORCH_ON, Integer.valueOf(20));
		playerMaterials.put(Material.STONE_BUTTON, Integer.valueOf(20));
		playerMaterials.put(Material.JUKEBOX, Integer.valueOf(20));
		playerMaterials.put(Material.FENCE, Integer.valueOf(20));
		
		playerMaterials.put(Material.CHEST, Integer.valueOf(50));
		playerMaterials.put(Material.DIAMOND_BLOCK, Integer.valueOf(50));
	}
}
