package com.dancarlyon.carnival.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockTicketMachine extends BlockCarnival
{
    public IIcon[] icons = new IIcon[6];

    public BlockTicketMachine()
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
            //.playSoundAtEntity(EntityPlayerObject, "mod_id:hit", 1.0F, 1.0F);
            world.playSoundAtEntity(player, "carnival:cha_ching", 1, 1);
            //world.playSoundEffect(, 70, 20, "carnival:cha_ching", 1, 1);
        } else {
            player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Maybe I should try something else."));
        }
        return false;
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon("carnival:"+this.textureName + "_" + i);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

}
