package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import net.minecraft.potion.Potion;

public class ItemGiantWaffle extends FoodItemCarnival
{
    public ItemGiantWaffle()
    {
        super(12, 0.9F, false);
        this.setUnlocalizedName("giant_waffle");
        this.setPotionEffect(Potion.heal.id, ConfigurationHandler.giantwaffleHealDuration,5, 1);
    }
}
