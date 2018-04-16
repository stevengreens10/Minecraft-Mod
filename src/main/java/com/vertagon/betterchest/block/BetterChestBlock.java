package com.vertagon.betterchest.block;

import com.vertagon.betterchest.BetterChestMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BetterChestBlock extends Block{

	protected BetterChestBlock(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(BetterChestMod.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(BetterChestMod.betterChestTab);
		GameRegistry.registerBlock(this, getUnlocalizedName().substring(5));
	}

}
