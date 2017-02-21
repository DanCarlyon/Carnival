package com.dancarlyon.carnival.client;


import com.dancarlyon.carnival.Carnival;
import com.dancarlyon.carnival.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CarnivalTab extends CreativeTabs {

    public CarnivalTab() {
        super(Carnival.modId);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.carnivalTicket;
    }

}
