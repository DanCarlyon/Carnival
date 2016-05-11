package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.item.*;
import com.dancarlyon.carnival.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemRecord;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCarnival icing = new ItemIcing();
    public static final ItemCarnival sprinkles = new ItemSprinkles();
    public static final ItemCarnival carnivalToken = new ItemToken();
    public static final ItemCarnival carnivalFlour = new ItemCarnivalFlour();
    public static final ItemCarnival rawCornDog = new ItemRawCornDog();
    public static final ItemCarnival batterBucket = new ItemBatterBucket();
    public static final ItemCarnival carnivalTicket = new ItemCarnivalTicket();
    public static final ItemRecord carnivalMusic = new ItemCarnivalMusic("carnival_music");

    public static void init()
    {
        GameRegistry.registerItem(icing, "icing");
        GameRegistry.registerItem(sprinkles, "sprinkles");
        GameRegistry.registerItem(carnivalToken, "carnival_token");
        GameRegistry.registerItem(carnivalFlour, "carnival_flour");
        GameRegistry.registerItem(rawCornDog, "raw_corn_dog");
        GameRegistry.registerItem(batterBucket, "batter_bucket");
        GameRegistry.registerItem(carnivalTicket, "carnival_ticket");
        GameRegistry.registerItem(carnivalMusic, "carnival_music");
    }

}
