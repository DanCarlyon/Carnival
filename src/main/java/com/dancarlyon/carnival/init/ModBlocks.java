package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.block.BlockCarnival;
import com.dancarlyon.carnival.block.BlockTicketMachine;
import com.dancarlyon.carnival.handler.ConfigurationHandler;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCarnival ticketmachine = new BlockTicketMachine();

    public static void init()
    {
        if(ConfigurationHandler.enableTicketMachineBlock) {
            GameRegistry.registerBlock(ticketmachine, "ticketmachine");
        }
    }
}
