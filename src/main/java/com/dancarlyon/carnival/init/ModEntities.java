package com.dancarlyon.carnival.init;


import com.dancarlyon.carnival.entity.EntityCarnivalClown;
import com.dancarlyon.carnival.entity.ModelCarnivalClown;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModEntities {

    public static void init()
    {
        ModelCarnivalClown.registerEntityEgg(EntityCarnivalClown.class, 0xffffff, 0xff0000);
        LanguageRegistry.instance().addStringLocalization("entity.Carnival.carnival_clown.name", "en_US", "Carnival Clown");
    }
}
