package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.*;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModArmor {
    public static final ArmorItemCarnival baconHelmet = new ItemBaconHelmet();
    public static final ArmorItemCarnival baconChest = new ItemBaconChest();
    public static final ArmorItemCarnival baconLeggings = new ItemBaconLeggings();
    public static final ArmorItemCarnival baconBoots = new ItemBaconBoots();

    public static void init()
    {
        GameRegistry.registerItem(baconHelmet, "bacon_helmet");
        GameRegistry.registerItem(baconChest, "bacon_chest");
        GameRegistry.registerItem(baconLeggings, "bacon_leggings");
        GameRegistry.registerItem(baconBoots, "bacon_boots");
    }

}
