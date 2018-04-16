package com.vertagon.betterchest.block;

import net.minecraft.block.material.Material;

public class BetterChestBlocks {

	public static BetterChestBlock chestWallBlock;
	
	public static void setup() {
		chestWallBlock = new ChestWallBlock("chestWallBlock", Material.rock);
	}
	
}
