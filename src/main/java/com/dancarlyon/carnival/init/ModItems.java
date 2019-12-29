package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.Carnival;
import com.dancarlyon.carnival.items.CarnivalDiscItem;
import com.dancarlyon.carnival.items.CarnivalSnowCone;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Carnival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Carnival.MOD_ID)
public class ModItems {

    public static final Item carnival_token = null;

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {

        // register a new item here
        //LOGGER.info("HELLO from Registering Items");
        Food bacon = (new Food.Builder()).hunger(1).saturation(0.1F).build();
        Food raw_bacon = (new Food.Builder()).hunger(1).saturation(0.1F).build();
        Food candy_apple = (new Food.Builder()).hunger(5).saturation(0.5F).build();
        Food candy_floss = (new Food.Builder()).hunger(12).saturation(0.9F).build();
        Food iced_donut = (new Food.Builder()).hunger(3).saturation(0.3F).build();
        Food donut = (new Food.Builder()).hunger(3).saturation(0.3F).build();
        Food donut_with_sprinkles = (new Food.Builder()).hunger(3).saturation(0.3F).build();
        Food raw_donut = (new Food.Builder()).hunger(1).saturation(0.3F).build();
        Food bacon_donut = (new Food.Builder()).hunger(12).saturation(0.9F).build();
        Food giant_waffle = (new Food.Builder()).hunger(12).saturation(0.9F).build();
        Food pretzel = (new Food.Builder()).hunger(6).saturation(1.0F).build();
        Food cooked_sausage = (new Food.Builder()).hunger(2).saturation(0.1F).build();
        Food raw_hotdog = (new Food.Builder()).hunger(1).saturation(0.1F).build();
        Food hot_dog = (new Food.Builder()).hunger(4).saturation(0.1F).build();
        Food corn_dog = (new Food.Builder()).hunger(6).saturation(0.5F).build();

        itemRegistryEvent.getRegistry().registerAll(
                // Items
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "carnival_token"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "flour"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "carnival_ticket"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "cyanide_bottle"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "batter_bucket"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "icing"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "raw_corn_dog"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "sprinkles"),

                // Music
                new CarnivalDiscItem(5, new SoundEvent(new ResourceLocation(Carnival.MOD_ID, "carnival_music")), (new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).maxStackSize(1).rarity(Rarity.UNCOMMON))).setRegistryName("carnival_music"),

                // Block Items
                new BlockItem(ModBlocks.test_block, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)).setRegistryName(Carnival.MOD_ID, "test_block"),

                // Food
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(bacon)).setRegistryName(Carnival.MOD_ID, "bacon"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(raw_bacon)).setRegistryName(Carnival.MOD_ID, "raw_bacon"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(cooked_sausage)).setRegistryName(Carnival.MOD_ID, "cooked_sausage"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(corn_dog)).setRegistryName(Carnival.MOD_ID, "corn_dog"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(giant_waffle)).setRegistryName(Carnival.MOD_ID, "giant_waffle"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(hot_dog)).setRegistryName(Carnival.MOD_ID, "hot_dog"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(raw_hotdog)).setRegistryName(Carnival.MOD_ID, "raw_hotdog"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(candy_apple)).setRegistryName(Carnival.MOD_ID, "candy_apple"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(candy_floss)).setRegistryName(Carnival.MOD_ID, "candy_floss"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(raw_donut)).setRegistryName(Carnival.MOD_ID, "raw_donut"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(donut)).setRegistryName(Carnival.MOD_ID, "plain_donut"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(iced_donut)).setRegistryName(Carnival.MOD_ID, "iced_donut"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(bacon_donut)).setRegistryName(Carnival.MOD_ID, "bacon_donut"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(donut_with_sprinkles)).setRegistryName(Carnival.MOD_ID, "donut_with_sprinkles"),
                new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP).food(pretzel)).setRegistryName(Carnival.MOD_ID, "pretzel"),

                // SnowCones
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "blue_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "green_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "lightblue_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "lime_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "magenta_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "orange_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "plain_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "purple_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "red_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "yellow_snow_cone"),
                new CarnivalSnowCone().setRegistryName(Carnival.MOD_ID, "multi_colored_snowcone")

        );

    }
}
