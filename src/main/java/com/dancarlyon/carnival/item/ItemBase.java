package com.dancarlyon.carnival.item;


import com.dancarlyon.carnival.CarnivalMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(CarnivalMod.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		CarnivalMod.proxy.registerItemRenderer(item, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
