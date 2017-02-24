package com.dancarlyon.carnival.recipe;


import com.dancarlyon.carnival.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {

    public static void init() {
        //Shaped
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rawDonut), " w ", "w w", " w ", 'w', "cropWheat"));
        GameRegistry.addRecipe(new ItemStack(ModItems.rawBacon, 3), "  p", " p ", "p  ", 'p', new ItemStack(Items.PORKCHOP));
        GameRegistry.addRecipe(new ItemStack(ModItems.rawHotdog, 3), "   ", "ppp", "   ", 'p', new ItemStack(Items.PORKCHOP));
        GameRegistry.addRecipe(new ItemStack(ModItems.hotdog, 4), "   ", "bhb", " b ", 'b', new ItemStack(Items.BREAD), 'h', new ItemStack(ModItems.cookedHotdog));
        GameRegistry.addRecipe(new ItemStack(ModItems.candyFloss, 1), "sss", "sws", " w ", 's', new ItemStack(Items.SUGAR), 'w', new ItemStack(Items.STICK));
        GameRegistry.addRecipe(new ItemStack(ModItems.rawCornDog, 1), " b ", " m ", " s ", 'b', new ItemStack(ModItems.batterBucket), 'm', new ItemStack(ModItems.rawHotdog), 's', new ItemStack(Items.STICK));
        GameRegistry.addRecipe(new ItemStack(ModItems.carnivalFlour, 3), " c ", " w ", " s ", 'c', new ItemStack(Blocks.COBBLESTONE), 'w', new ItemStack(Items.WHEAT), 's', new ItemStack(Blocks.STONE_SLAB));
        GameRegistry.addRecipe(new ItemStack(ModItems.snowCone, 1), " s ", "p p", " p ", 's', new ItemStack(Items.SNOWBALL), 'p', new ItemStack(Items.PAPER));

        GameRegistry.addRecipe(new ItemStack(ModItems.candyApple, 1), "sss", "sas", " w ", 's', new ItemStack(Items.SUGAR), 'a', new ItemStack(Items.APPLE), 'w', new ItemStack(Items.STICK));

        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.icedDonut), new ItemStack(ModItems.icing), new ItemStack(ModItems.plainDonut));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sprinkledDonut), new ItemStack(ModItems.icedDonut), new ItemStack(ModItems.sprinkles));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.baconDonut), new ItemStack(ModItems.icedDonut), new ItemStack(ModItems.bacon));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sprinkles), new ItemStack(Items.SUGAR), new ItemStack(Items.SLIME_BALL));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.icing), new ItemStack(Items.SUGAR), new ItemStack(Items.WATER_BUCKET));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.batterBucket), new ItemStack(ModItems.carnivalFlour), new ItemStack(ModItems.carnivalFlour), new ItemStack(Items.WATER_BUCKET));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.red), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blue), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.green), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lightblue), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 12));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.magenta), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 13));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.orange), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 14));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.purple), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.yellow), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 11));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lime), new ItemStack(ModItems.snowCone), new ItemStack(Items.DYE, 1, 10));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.rawDonut), new ItemStack(ModItems.plainDonut), 5.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.rawBacon), new ItemStack(ModItems.bacon), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.rawHotdog), new ItemStack(ModItems.cookedHotdog), 1.0f);
        GameRegistry.addSmelting(new ItemStack(Items.GOLD_NUGGET), new ItemStack(ModItems.carnivalToken), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.carnivalToken), new ItemStack(Items.GOLD_NUGGET), 1.0f);
        GameRegistry.addSmelting(new ItemStack(Items.GOLD_INGOT), new ItemStack(ModItems.carnivalToken, 8), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.rawCornDog), new ItemStack(ModItems.cornDog), 1.0f);
    }

}
