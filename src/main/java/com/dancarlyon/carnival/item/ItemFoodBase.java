package com.dancarlyon.carnival.item;

import com.dancarlyon.carnival.CarnivalMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements ItemModelProvider {

    protected String name;

    public ItemFoodBase(String name, int amount, float saturation, boolean wolfFood) {
        super(amount, saturation, wolfFood);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CarnivalMod.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        CarnivalMod.proxy.registerItemRenderer(item, 0, name);
    }
}
