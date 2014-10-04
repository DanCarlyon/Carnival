package com.dancarlyon.carnival.item;

import net.minecraft.potion.Potion;

public class ItemGiantWaffle extends FoodItemCarnival
{
    public ItemGiantWaffle()
    {
        super(12, 0.9F, false);
        this.setUnlocalizedName("giant_waffle");
        this.setPotionEffect(Potion.regeneration.id, 60, 5, 1);
    }
}
