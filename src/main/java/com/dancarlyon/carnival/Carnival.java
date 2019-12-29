package com.dancarlyon.carnival;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Carnival.MOD_ID)
public class Carnival {

    public static final String MOD_ID = "carnival";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");

    }
}
