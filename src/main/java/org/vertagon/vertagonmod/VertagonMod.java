package org.vertagon.vertagonmod;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.vertagon.vertagonmod.proxy.CommonProxy;
import org.vertagon.vertagonmod.tab.VertagonCreativeTab;

@Mod(modid = VertagonMod.MODID, version = VertagonMod.VERSION, name = VertagonMod.NAME, useMetadata = true)
public class VertagonMod {
    public static final String MODID = "vertagonmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Vertagon Mod";

    @SidedProxy(clientSide = "org.vertagon.vertagonmod.proxy.ClientProxy",
            serverSide = "org.vertagon.vertagonmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static VertagonMod instance;

    public static VertagonCreativeTab creativeTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        creativeTab = new VertagonCreativeTab(CreativeTabs.getNextID(), "tab_vertagon");
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
