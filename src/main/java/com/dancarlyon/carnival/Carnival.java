package com.dancarlyon.carnival;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="Carnival", name="Carnival", version="1.7.10-1.0")
public class Carnival
{
    @Mod.Instance("Carnival")
    public static Carnival instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //network/configs/items
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Crafting register
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapping up
    }
}
