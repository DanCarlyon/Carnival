package com.dancarlyon.carnival.item;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemPlainSnowCone extends FoodItemCarnival {
    public ItemPlainSnowCone() {
        super(6, 1F, false);
        this.setUnlocalizedName("plain_snow_cone");
        this.setPotionEffect(Potion.confusion.id, 3, 5, 1);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Ouch! Brain Freeze"));
    }

}
