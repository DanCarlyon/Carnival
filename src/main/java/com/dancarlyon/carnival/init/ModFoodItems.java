package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.*;
import com.dancarlyon.carnival.item.ItemGreenSnowCone;
import com.dancarlyon.carnival.item.ItemLightBlueSnowCone;
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

    public static final FoodItemCarnival cyanideBottle = new ItemCyanideBottle();

    public static final FoodItemCarnival candyFloss = new ItemCandyFloss();

    public static final FoodItemCarnival cornDog = new ItemCornDog();

    public static final FoodItemCarnival plainSnowCone = new ItemPlainSnowCone();
    public static final FoodItemCarnival redSnowCone = new ItemRedSnowCone();
    public static final FoodItemCarnival blueSnowCone = new ItemBlueSnowCone();
    public static final FoodItemCarnival greenSnowCone = new ItemGreenSnowCone();
    public static final FoodItemCarnival lightBlueSnowCone = new ItemLightBlueSnowCone();

    public static final FoodItemCarnival limeSnowCone = new ItemLimeSnowCone();
    public static final FoodItemCarnival magentaSnowCone = new ItemMagentaSnowCone();
    public static final FoodItemCarnival orangeSnowCone = new ItemOrangeSnowCone();
    public static final FoodItemCarnival purpleSnowCone = new ItemPurpleSnowCone();
    public static final FoodItemCarnival yellowSnowCone = new ItemYellowSnowCone();
    public static final FoodItemCarnival multiSnowCone = new ItemMultiSnowCone();

    public static final FoodItemCarnival candyApple = new ItemCandyApple();
    public static final FoodItemCarnival pretzel = new ItemPretzel();

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

        GameRegistry.registerItem(cyanideBottle, "cyanide_bottle");

        GameRegistry.registerItem(candyFloss, "candy_floss");
        GameRegistry.registerItem(cornDog, "corn_dog");
        GameRegistry.registerItem(plainSnowCone, "plain_snow_cone");
        GameRegistry.registerItem(redSnowCone, "red_snow_cone");
        GameRegistry.registerItem(blueSnowCone, "blue_snow_cone");
        GameRegistry.registerItem(greenSnowCone, "green_snow_cone");
        GameRegistry.registerItem(lightBlueSnowCone, "lightblue_snow_cone");

        GameRegistry.registerItem(limeSnowCone, "lime_snow_cone");
        GameRegistry.registerItem(magentaSnowCone, "magenta_snow_cone");
        GameRegistry.registerItem(orangeSnowCone, "orange_snow_cone");
        GameRegistry.registerItem(purpleSnowCone, "purple_snow_cone");
        GameRegistry.registerItem(yellowSnowCone, "yellow_snow_cone");
        GameRegistry.registerItem(multiSnowCone, "multi_colored_snowcone");

        GameRegistry.registerItem(candyApple, "candy_apple");
        GameRegistry.registerItem(pretzel, "pretzel");
    }
}
