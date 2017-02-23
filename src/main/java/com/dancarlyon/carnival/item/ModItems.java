package com.dancarlyon.carnival.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemBase icing;
    public static ItemBase sprinkles;
    public static ItemBase carnivalToken;
    public static ItemBase carnivalFlour;
    public static ItemBase rawCornDog;
    public static ItemBase batterBucket;
    public static ItemBase carnivalTicket;

    /* Food Items */
    public static ItemFoodBase bacon;
    public static ItemFoodBase baconDonut;
    public static ItemFoodBase candyApple;
    public static ItemFoodBase candyFloss;
    public static ItemFoodBase cookedHotdog;
    public static ItemFoodBase cornDog;
    public static ItemFoodBase giantWaffle;
    public static ItemFoodBase hotdog;
    public static ItemFoodBase icedDonut;
    public static ItemFoodBase plainDonut;
    public static ItemFoodBase pretzel;
    public static ItemFoodBase rawBacon;
    public static ItemFoodBase rawDonut;
    public static ItemFoodBase rawHotdog;
    public static ItemFoodBase sprinkledDonut;

    public static void init() {
        icing = register(new ItemBase("icing"));
        sprinkles = register(new ItemBase("sprinkles"));
        carnivalToken = register(new ItemBase("carnivalToken"));
        carnivalFlour = register(new ItemBase("carnivalFlour"));
        rawCornDog = register(new ItemBase("rawCornDog"));
        batterBucket = register(new ItemBase("batterBucket"));
        carnivalTicket = register(new ItemBase("carnivalTicket"));

        bacon = register(new ItemFoodBase("bacon", 1, 0.1f, true));
        baconDonut = register(new ItemFoodBase("baconDonut", 12, 0.9f, false));
        candyApple = register(new ItemFoodBase("candyApple", 5, 0.5f, false));
        candyFloss = register(new ItemFoodBase("candyFloss", 12, 0.9f, false));
        cookedHotdog = register(new ItemFoodBase("cookedHotdog", 2, 0.1f, true));
        cornDog = register(new ItemFoodBase("cornDog", 6, 0.5f, false));
        giantWaffle = register(new ItemFoodBase("giantWaffle", 12, 0.9f, false));
        hotdog = register(new ItemFoodBase("hotdog", 4, 0.1f, true));
        icedDonut = register(new ItemFoodBase("icedDonut", 3, 0.3f, false));
        plainDonut = register(new ItemFoodBase("plainDonut", 3, 0.3f, false));
        pretzel = register(new ItemFoodBase("pretzel", 6, 1.0f, false));
        rawBacon = register(new ItemFoodBase("rawBacon", 1, 0.1f, false));
        rawDonut = register(new ItemFoodBase("rawDonut", 1, 0.3f, false));
        rawHotdog = register(new ItemFoodBase("rawHotdog", 1, 0.1f, false));
        sprinkledDonut = register(new ItemFoodBase("sprinkledDonut", 3, 0.3f, false));
    }

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

}
