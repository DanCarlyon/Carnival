package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.ItemBaconLeggings;
import com.dancarlyon.carnival.item.ArmorItemCarnival;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModArmor {
    public static final ArmorItemCarnival baconLeggings = new ItemBaconLeggings();

    public static void init()
    {
        GameRegistry.registerItem(baconLeggings, "bacon_leggings");
    }

}
