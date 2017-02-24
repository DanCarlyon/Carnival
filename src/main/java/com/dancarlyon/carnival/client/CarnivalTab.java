package com.dancarlyon.carnival.client;


import com.dancarlyon.carnival.CarnivalMod;
import com.dancarlyon.carnival.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CarnivalTab extends CreativeTabs {

    public CarnivalTab() {
        super(CarnivalMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.carnivalTicket;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
