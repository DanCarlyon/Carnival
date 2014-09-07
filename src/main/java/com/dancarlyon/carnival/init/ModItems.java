package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.*;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCarnival icing = new ItemIcing();
    public static final ItemCarnival sprinkles = new ItemSprinkles();

    public static void init()
    {
        GameRegistry.registerItem(icing, "icing");
        GameRegistry.registerItem(sprinkles, "sprinkles");
    }

}
