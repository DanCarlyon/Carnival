package com.dancarlyon.carnival.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        //Shaped
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModFoodItems.rawDonut), " w ", "w w", " w ", 'w', "cropWheat"));
        GameRegistry.addRecipe(new ItemStack(ModFoodItems.rawBacon, 3), "  p", " p ", "p  ", 'p', new ItemStack(Items.porkchop));
        GameRegistry.addRecipe(new ItemStack(ModFoodItems.rawHotdog, 3), "   ", "ppp", "   ", 'p', new ItemStack(Items.porkchop));
        GameRegistry.addRecipe(new ItemStack(ModFoodItems.hotdog, 4), "   ", "bhb", " b ", 'b', new ItemStack(Items.bread), 'h', new ItemStack(ModFoodItems.cookedHotdog));
        GameRegistry.addRecipe(new ItemStack(ModFoodItems.candyFloss, 1), "sss", "sws", " w ", 's', new ItemStack(Items.sugar), 'w', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.rawCornDog, 1), " b ", " m ", " s ", 'b', new ItemStack(ModItems.batterBucket), 'm', new ItemStack(ModFoodItems.rawHotdog), 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.carnivalFlour, 3), " c ", " w ", " s ", 'c', new ItemStack(Blocks.cobblestone), 'w', new ItemStack(Items.wheat), 's', new ItemStack(Blocks.stone_slab));
        GameRegistry.addRecipe(new ItemStack(ModFoodItems.plainSnowCone, 1), " s ", "p p", " p ", 's', new ItemStack(Items.snowball), 'p', new ItemStack(Items.paper));

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModFoodItems.icedDonut), new ItemStack(ModItems.icing), new ItemStack(ModFoodItems.plainDonut));
        GameRegistry.addShapelessRecipe(new ItemStack(ModFoodItems.sprinklesDonut), new ItemStack(ModFoodItems.icedDonut), new ItemStack(ModItems.sprinkles));
        GameRegistry.addShapelessRecipe(new ItemStack(ModFoodItems.baconDonut), new ItemStack(ModFoodItems.icedDonut), new ItemStack(ModFoodItems.bacon));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sprinkles), new ItemStack(Items.sugar), new ItemStack(Items.slime_ball));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.icing), new ItemStack(Items.sugar), new ItemStack(Items.water_bucket));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batterBucket), new ItemStack(ModItems.carnivalFlour), new ItemStack(ModItems.carnivalFlour), new ItemStack(Items.water_bucket));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModFoodItems.rawDonut), new ItemStack(ModFoodItems.plainDonut), 5);
        GameRegistry.addSmelting(new ItemStack(ModFoodItems.rawBacon), new ItemStack(ModFoodItems.bacon), 1);
        GameRegistry.addSmelting(new ItemStack(ModFoodItems.rawHotdog), new ItemStack(ModFoodItems.cookedHotdog), 1);
        GameRegistry.addSmelting(new ItemStack(Items.gold_nugget), new ItemStack(ModItems.carnivalToken), 1);
        GameRegistry.addSmelting(new ItemStack(ModItems.carnivalToken), new ItemStack(Items.gold_nugget), 1);
        GameRegistry.addSmelting(new ItemStack(Items.gold_ingot), new ItemStack(ModItems.carnivalToken, 8), 1);
        GameRegistry.addSmelting(new ItemStack(ModItems.rawCornDog), new ItemStack(ModFoodItems.cornDog), 1);

    }
}
