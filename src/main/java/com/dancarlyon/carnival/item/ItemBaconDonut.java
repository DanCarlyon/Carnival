package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import net.minecraft.potion.Potion;

public class ItemBaconDonut extends FoodItemCarnival
{
    public ItemBaconDonut()
    {
        super(12, 0.9F, false);
        this.setUnlocalizedName("bacon_donut");
        this.setPotionEffect(Potion.regeneration.id, ConfigurationHandler.baconDonutRegenDuration, 5, 1);
    }
}
