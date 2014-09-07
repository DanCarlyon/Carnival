package com.dancarlyon.carnival;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import com.dancarlyon.carnival.init.ModBlocks;
import com.dancarlyon.carnival.init.ModItems;
import com.dancarlyon.carnival.init.Recipes;
import com.dancarlyon.carnival.proxy.IProxy;
import com.dancarlyon.carnival.reference.Reference;
import com.dancarlyon.carnival.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Carnival
{
    @Mod.Instance(Reference.MOD_ID)
    public static Carnival instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //network/configs/items
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Checks Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Crafting register
        Recipes.init();
        LogHelper.info("Initialization Checks Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapping up
        LogHelper.info("Post Initialization Checks Complete!");
    }
}
