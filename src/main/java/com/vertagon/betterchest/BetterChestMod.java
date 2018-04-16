package com.vertagon.betterchest;

import com.vertagon.betterchest.item.BetterChestItems;
import com.vertagon.betterchest.proxy.CommonProxy;
import com.vertagon.betterchest.tab.BetterChestTab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = BetterChestMod.MODID, version = BetterChestMod.VERSION, name = BetterChestMod.NAME)
public class BetterChestMod {
    public static final String MODID = "betterchest";
    public static final String VERSION = "1.0";
    public static final String NAME = "Better Chest";
    
    @SidedProxy(clientSide="com.vertagon.betterchest.proxy.ClientProxy", 
    		serverSide="com.vertagon.betterchest.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs betterChestTab;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    	
    	betterChestTab = new BetterChestTab(CreativeTabs.getNextID(), "tab_betterChest");
    	
    	BetterChestItems.setup();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
