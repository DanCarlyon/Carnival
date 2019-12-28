package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.Carnival;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Carnival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final Item carnival_token = null;


    /*public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties()).setRegistryName(Carnival.MOD_ID, "carnival_token1")
        );
    }*/

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        // register a new item here
        //LOGGER.info("HELLO from Registering Items");
        itemRegistryEvent.getRegistry().registerAll(
                new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(Carnival.MOD_ID, "carnival_token")
        );
    }
}
