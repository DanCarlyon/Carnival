package com.dancarlyon.carnival.client;


import com.dancarlyon.carnival.CarnivalMod;
import com.dancarlyon.carnival.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CarnivalTab extends CreativeTabs {

    public CarnivalTab() {
        super(CarnivalMod.modId);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.carnivalTicket;
    }

}