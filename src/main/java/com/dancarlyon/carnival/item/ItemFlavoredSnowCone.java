package com.dancarlyon.carnival.item;


import com.dancarlyon.carnival.CarnivalMod;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ItemFlavoredSnowCone extends ItemFoodBase {

    protected String name;
    protected String color;

    public ItemFlavoredSnowCone(String name, int amount, float saturation, boolean wolfFood) {
        super(name + "SnowCone", amount, saturation, wolfFood);
        this.color = name;
        this.name = name + "SnowCone";
        setPotionEffectForSnowCone();
    }

    public void setPotionEffectForSnowCone() {
        switch (color) {
            case "blue":
                setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 300, 0), 0.8F);
                break;
            case "green":
                setPotionEffect(new PotionEffect(MobEffects.UNLUCK, 300, 0), 0.8F);
                break;
            case "multiColored":
                setPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 0), 1.0F);
                setPotionEffect(new PotionEffect(MobEffects.HASTE, 600, 0), 1.0F);
                setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 600, 0), 1.0F);
                break;
            default:
                break;
        }

    }

    @Override
    public void registerItemModel(Item item) {
        CarnivalMod.proxy.registerItemRenderer(item, 0, name);
    }
}
