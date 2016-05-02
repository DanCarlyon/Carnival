package com.dancarlyon.carnival.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemCarnivalTicket extends ItemCarnival {
    public ItemCarnivalTicket() {
        super();
        this.setUnlocalizedName("carnival_ticket");
    }


    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer player)
    {
        player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Wonder what i can use this for?"));
        return p_77659_1_;
    }
}
