package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.utility.LogHelper;
import com.dancarlyon.carnival.world.VillageBigTop;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.world.gen.structure.MapGenStructureIO;

/**
 * Created by Danny on 22/03/2016.
 */
public class ModWorld
{
    public static void init()
    {
        LogHelper.info("Init World Stuff");
        VillagerRegistry.instance().registerVillageCreationHandler(new VillageBigTop.VillageManager());

        try{
            LogHelper.info("Trying to add big top");
            MapGenStructureIO.func_143031_a(VillageBigTop.class, "CarnivalVillageBigTop");
        }catch (Exception e){
            LogHelper.info("No Big top for you");
        }

    }
}
