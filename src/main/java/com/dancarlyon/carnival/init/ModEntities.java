package com.dancarlyon.carnival.init;


import com.dancarlyon.carnival.entity.EntityCarnivalClown;
import com.dancarlyon.carnival.entity.ModelCarnivalClown;

public class ModEntities {

    public static void init()
    {
        ModelCarnivalClown.registerEntityEgg(EntityCarnivalClown.class, 0x339900, 0xff0000);
    }
}
