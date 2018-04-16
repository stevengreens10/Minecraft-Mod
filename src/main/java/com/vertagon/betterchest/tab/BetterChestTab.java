package com.vertagon.betterchest.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BetterChestTab extends CreativeTabs{

	public BetterChestTab(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.chest_minecart;
	}

	
	
}
