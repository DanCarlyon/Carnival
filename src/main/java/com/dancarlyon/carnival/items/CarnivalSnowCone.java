package com.dancarlyon.carnival.items;

import com.dancarlyon.carnival.init.ModFoods;
import com.dancarlyon.carnival.init.ModItemGroups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CarnivalSnowCone extends Item {

    public static final Food snowCone = (new Food.Builder()).hunger(3).saturation(0.5F).build();

    public CarnivalSnowCone() {
        super(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(ModFoods.RAINBOW_CONE));
    }
}
