package com.dancarlyon.carnival.creativetab;

import com.dancarlyon.carnival.init.ModFoodItems;
import com.dancarlyon.carnival.init.ModItems;
import com.dancarlyon.carnival.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCarnival
{
    public static final CreativeTabs CARNIVAL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModFoodItems.baconDonut;
        }

    };
}
