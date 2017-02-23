package com.dancarlyon.carnival;

import com.dancarlyon.carnival.client.CarnivalTab;
import com.dancarlyon.carnival.item.ModItems;
import com.dancarlyon.carnival.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CarnivalMod.modId, name = CarnivalMod.name, version = CarnivalMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class CarnivalMod
{
    public static final String modId = "carnival";
    public static final String name = "Carnival Mod";
    public static final String version = "1.10.2-1.0.5";

    @Mod.Instance(modId)
    public static CarnivalMod instance;

    @SidedProxy(serverSide = "com.dancarlyon.carnival.proxy.CommonProxy", clientSide = "com.dancarlyon.carnival.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final CarnivalTab creativeTab = new CarnivalTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
