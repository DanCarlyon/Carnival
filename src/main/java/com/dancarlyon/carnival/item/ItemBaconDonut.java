package com.dancarlyon.carnival.item;

import net.minecraft.potion.Potion;

public class ItemBaconDonut extends FoodItemCarnival
{
    public ItemBaconDonut()
    {
        super(12, 0.9F, false);
        this.setUnlocalizedName("bacon_donut");
        this.setPotionEffect(Potion.regeneration.id, 60, 5, 1);
    }
}
