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

    public static void init() {
        icing = register(new ItemBase("icing"));
        sprinkles = register(new ItemBase("sprinkles"));
        carnivalToken = register(new ItemBase("carnivalToken"));
        carnivalFlour = register(new ItemBase("carnivalFlour"));
        rawCornDog = register(new ItemBase("rawCornDog"));
        batterBucket = register(new ItemBase("batterBucket"));
        carnivalTicket = register(new ItemBase("carnivalTicket"));

    }

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item;
	}

}
