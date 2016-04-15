package com.dancarlyon.carnival.init;


import com.dancarlyon.carnival.entity.EntityCarnivalClown;
import com.dancarlyon.carnival.entity.ModelCarnivalClown;
import com.dancarlyon.carnival.entity.RenderClown;
import com.dancarlyon.carnival.reference.Reference;
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
        EntityRegistry.registerModEntity(EntityCarnivalClown.class, "carnival_clown", 1, Reference.MOD_ID, 80, 3, true);
        RenderingRegistry.registerEntityRenderingHandler(EntityCarnivalClown.class, new RenderClown(new ModelCarnivalClown(), 0.5F));
        EntityRegistry.addSpawn(EntityCarnivalClown.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.plains);
        ModelCarnivalClown.registerEntityEgg(EntityCarnivalClown.class, 0xffffff, 0xff0000);
        LanguageRegistry.instance().addStringLocalization("entity.Carnival.carnival_clown.name", "en_US", "Carnival Clown");
    }
}
