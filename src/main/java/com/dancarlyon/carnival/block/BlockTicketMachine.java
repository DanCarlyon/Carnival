package com.dancarlyon.carnival.block;

import com.dancarlyon.carnival.init.ModItems;
import com.dancarlyon.carnival.utility.LogHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTicketMachine extends BlockCarnival
{
    public IIcon[] icons = new IIcon[6];

    public BlockTicketMachine()
    {
        super();
        this.setBlockName("ticketmachine");
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
        this.setBlockTextureName("ticketmachine");

    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if(!world.isRemote) {
            if (player.getHeldItem() != null && player.getHeldItem().getItem().getUnlocalizedName().equals("item.carnival:carnival_ticket")) {
                world.playSoundAtEntity(player, "carnival:cha_ching", 2, 1);
                spawnAnItem(world, x, y, z);
            } else {
                player.addChatComponentMessage(new ChatComponentText(player.getDisplayName() + " Maybe I should try something else."));
            }
        }
        return false;
    }

    private void spawnAnItem(World world, int x, int y, int z) {
        EntityItem ent = new EntityItem(world, x, y, z, new ItemStack(ModItems.carnivalToken));
        world.spawnEntityInWorld(ent);
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


    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack p_149689_6_)
    {
        LogHelper.info("x: "+x+" y: "+y+" z: "+z);
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        LogHelper.info(l);
        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

    }

}
