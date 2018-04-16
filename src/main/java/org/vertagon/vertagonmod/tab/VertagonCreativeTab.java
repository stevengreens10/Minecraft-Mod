package org.vertagon.vertagonmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class VertagonCreativeTab extends CreativeTabs {

    public VertagonCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.chest_minecart;
    }
}
