package com.dancarlyon.carnival;

import com.dancarlyon.carnival.entity.EntityCarnivalClown;
import com.dancarlyon.carnival.entity.ModelCarnivalClown;
import com.dancarlyon.carnival.entity.RenderClown;
import com.dancarlyon.carnival.handler.ConfigurationHandler;
import com.dancarlyon.carnival.init.*;
import com.dancarlyon.carnival.proxy.IProxy;
import com.dancarlyon.carnival.reference.Reference;
import com.dancarlyon.carnival.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

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

        ModFoodItems.init();

        ModItems.init();

        ModBlocks.init();

        ModArmor.init();

        ModEntities.init();

        EntityRegistry.registerModEntity(EntityCarnivalClown.class, "carnival_clown", 1, this, 80, 3, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityCarnivalClown.class, new RenderClown(new ModelCarnivalClown(), 0.5F));
        EntityRegistry.addSpawn(EntityCarnivalClown.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);

        LogHelper.info("Pre Initialization Checks Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Crafting register
        Recipes.init();

        //World Stuff
        ModWorld.init();

        LogHelper.info("Initialization Checks Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapping up
        LogHelper.info("Post Initialization Checks Complete!");
    }
}
