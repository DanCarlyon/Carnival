package com.dancarlyon.carnival.item;


import com.dancarlyon.carnival.creativetab.CreativeTabCarnival;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class ItemCarnivalMusic extends ItemRecord {

    public String setRecordName;

    public ItemCarnivalMusic(String p_i45350_1_) {
        super(p_i45350_1_);
        this.setRecordName = "carnival_music";
        this.maxStackSize = 1;
        this.setUnlocalizedName("carnival_music");
        this.setCreativeTab(CreativeTabCarnival.CARNIVAL_TAB);
    }

    @SideOnly(Side.CLIENT)
    public String getRecordTitle()
    {
        return "carnival_music" + this.recordName;
    }
    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(Reference.MOD_ID + ":carnival_music");
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.record." + this.recordName + ".desc");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") +1));
    }

}
