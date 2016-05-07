package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemCyanideBottle extends FoodItemCarnival
{
    public ItemCyanideBottle() {
        super(0, 5F, false);
        this.setUnlocalizedName("cyanide_bottle");
        this.setMaxStackSize(1);
        this.setPotionEffect(Potion.regeneration.id, ConfigurationHandler.cyanideRegenDuration, 5, 1);
        this.setPotionEffect(Potion.heal.id, ConfigurationHandler.cyanideHealthDuration, 5, 1);
        this.setPotionEffect(Potion.poison.id, ConfigurationHandler.cyanidePoisonDuration, 5, 1);
    }

    public EnumAction getItemUseAction(ItemStack ItemCyanideBottle)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }
}
