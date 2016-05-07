package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import net.minecraft.potion.Potion;

public class ItemMultiSnowCone extends FoodItemCarnival
{
    public ItemMultiSnowCone() {
        super(3, 0.5F, false);
        this.setUnlocalizedName("multi_colored_snowcone");
        this.setMaxStackSize(1);
        this.setPotionEffect(Potion.moveSpeed.id, ConfigurationHandler.multiSnowConeSpeedDuration, 5, 1);
        this.setPotionEffect(Potion.digSpeed.id, ConfigurationHandler.multiSnowConeDigSpeedDuration, 5, 1);
        this.setPotionEffect(Potion.jump.id, ConfigurationHandler.multiSnowConeJumpDuration, 5, 1);
    }
}
