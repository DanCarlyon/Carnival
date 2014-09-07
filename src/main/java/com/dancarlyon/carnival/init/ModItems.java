package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.ItemBaconDonut;
import com.dancarlyon.carnival.item.ItemCarnival;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCarnival baconDonut = new ItemBaconDonut();

    public static void init()
    {
        GameRegistry.registerItem(baconDonut, "Bacon_Donut");
    }
}
