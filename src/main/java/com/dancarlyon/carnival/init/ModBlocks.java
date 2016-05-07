package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.block.BlockCarnival;
import com.dancarlyon.carnival.block.BlockSwordInStone;
import com.dancarlyon.carnival.handler.ConfigurationHandler;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCarnival swordinstone = new BlockSwordInStone();

    public static void init()
    {
        if(ConfigurationHandler.enableSwordInStoneBlock == true) {
            GameRegistry.registerBlock(swordinstone, "swordinstone");
        }
    }
}
