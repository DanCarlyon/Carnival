package com.dancarlyon.carnival.block;

import com.dancarlyon.carnival.creativetab.CreativeTabCarnival;
import com.dancarlyon.carnival.init.ModItems;
import com.dancarlyon.carnival.reference.Reference;
import com.dancarlyon.carnival.utility.LogHelper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class BlockSwordInStone extends BlockCarnival
{
    public BlockSwordInStone()
    {
        super();
        this.setBlockName("swordinstone");
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setBlockTextureName("swordinstone");
    }

    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if(player.getHeldItem() != null && player.getHeldItem().getItem().getUnlocalizedName().equals("item.carnival:carnival_ticket")) {
            //player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Cha-Ching"));
            //world.playSound(1D, 1D, 1D, "carnival:ticket.cha_ching", 1F, 1.0F, false);
            world.playSoundEffect(20, 70, 20, "carnival:cha_ching", 1, 1);
        } else {
            player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Maybe I should try something else."));
        }
        return false;
    }
}
