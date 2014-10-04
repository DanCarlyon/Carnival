package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModFoodItems
{
    public static final FoodItemCarnival rawDonut = new ItemRawDonut();
    public static final FoodItemCarnival baconDonut = new ItemBaconDonut();
    public static final FoodItemCarnival plainDonut = new ItemPlainDonut();
    public static final FoodItemCarnival icedDonut = new ItemIcedDonut();
    public static final FoodItemCarnival sprinklesDonut = new ItemSprinkledDonut();
    public static final FoodItemCarnival bacon = new ItemBacon();
    public static final FoodItemCarnival rawBacon = new ItemRawBacon();

    public static final FoodItemCarnival giantWaffle = new ItemGiantWaffle();

    public static final FoodItemCarnival rawHotdog = new ItemRawSausage();
    public static final FoodItemCarnival cookedHotdog = new ItemCookedSausage();
    public static final FoodItemCarnival hotdog = new ItemHotdog();

    public static void init()
    {
        GameRegistry.registerItem(rawDonut, "raw_Donut");
        GameRegistry.registerItem(baconDonut, "bacon_Donut");
        GameRegistry.registerItem(plainDonut, "plain_Donut");
        GameRegistry.registerItem(icedDonut, "iced_Donut");
        GameRegistry.registerItem(sprinklesDonut, "donut_with_sprinkles");
        GameRegistry.registerItem(bacon, "bacon");
        GameRegistry.registerItem(rawBacon, "raw_bacon");

        GameRegistry.registerItem(giantWaffle, "giant_waffle");

        GameRegistry.registerItem(rawHotdog, "raw_hotdog");
        GameRegistry.registerItem(cookedHotdog, "cooked_hotdog");
        GameRegistry.registerItem(hotdog, "hotdog");
    }
}
