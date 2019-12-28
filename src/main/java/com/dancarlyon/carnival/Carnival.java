package com.dancarlyon.carnival;

import com.dancarlyon.carnival.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Carnival.MOD_ID)
public class Carnival {

    public static final String MOD_ID = "carnival";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
   /* @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            // register a new item here
            LOGGER.info("HELLO from Registering Items");
            ModItems.registerItems(itemRegistryEvent);
        }
    }*/
}
