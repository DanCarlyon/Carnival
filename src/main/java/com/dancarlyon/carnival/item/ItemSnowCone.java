package com.dancarlyon.carnival.item;


import com.dancarlyon.carnival.CarnivalMod;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ItemSnowCone extends ItemFoodBase {


    public ItemSnowCone(String name, int amount, float saturation, boolean wolfFood) {
        super(name, amount, saturation, wolfFood);
        setPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 300, 0), 0.8F);
    }

    @Override
    public void registerItemModel(Item item) {
        CarnivalMod.proxy.registerItemRenderer(item, 0, name);
    }


}
