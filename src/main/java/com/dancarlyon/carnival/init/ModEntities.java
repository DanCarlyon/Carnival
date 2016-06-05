package com.dancarlyon.carnival.init;


import com.dancarlyon.carnival.entity.*;
import com.dancarlyon.carnival.handler.ConfigurationHandler;
import com.dancarlyon.carnival.reference.Reference;
import com.dancarlyon.carnival.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModEntities {

    public static void init()
    {
        LogHelper.debug(ConfigurationHandler.enableCarnivalClowns);
        if(ConfigurationHandler.enableCarnivalClowns == true) {
            EntityRegistry.registerModEntity(EntityCarnivalClown.class, "carnival_clown", 1, Reference.MOD_ID, 80, 3, true);
            RenderingRegistry.registerEntityRenderingHandler(EntityCarnivalClown.class, new RenderClown(new ModelCarnivalClown(), 0.5F));
            EntityRegistry.addSpawn(EntityCarnivalClown.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);
            ModelCarnivalClown.registerEntityEgg(EntityCarnivalClown.class, 0xffffff, 0xff0000);
            LanguageRegistry.instance().addStringLocalization("entity.Carnival.carnival_clown.name", "en_US", "Carnival Clown");
        }

        //Temporarily removed while i think of a way to fix it
        /*EntityRegistry.registerModEntity(EntityDethknight.class, "dethknight", 2, Reference.MOD_ID, 80, 3, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityDethknight.class, new RenderDethknight(new ModelDethknight(), 0.5F));
        EntityRegistry.addSpawn(EntityDethknight.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);
        ModelCarnivalClown.registerEntityEgg(EntityDethknight.class, 0x000000, 0xff0000);
        LanguageRegistry.instance().addStringLocalization("entity.Carnival.dethknight.name", "en_US", "Dethknight");*/
    }
}
