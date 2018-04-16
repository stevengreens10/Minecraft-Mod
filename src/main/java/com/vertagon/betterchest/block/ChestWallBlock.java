package com.vertagon.betterchest.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ChestWallBlock extends BetterChestBlock{

	protected ChestWallBlock(String name, Material material) {
		super(name, material);
		setHardness(0.4f);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(1f);
		setResistance(1f);
	}
	
	@Override
	public void onBlockClicked(World world, int bx, int by, int bz,
			EntityPlayer player) {
		super.onBlockClicked(world, bx, by, bz, player);
		
		System.out.print(getUnlocalizedName() + " clicked!");
	}

}
