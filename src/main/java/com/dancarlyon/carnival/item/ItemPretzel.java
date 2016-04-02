package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import net.minecraft.potion.Potion;

public class ItemPretzel extends FoodItemCarnival {
    public ItemPretzel() {
        super(6, 1.0F, false);
        this.setPotionEffect(Potion.moveSpeed.id, ConfigurationHandler.pretzelSpeedDuration, 1, 1);
        this.setUnlocalizedName("pretzel");
    }
}
