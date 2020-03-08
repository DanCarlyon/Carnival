package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.config.FoodConfig;
import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {
    public static final Food CYANIDE_BOTTLE = (new Food.Builder()).hunger(4).saturation(1.2F).effect(new EffectInstance(Effects.REGENERATION, FoodConfig.cyanide_regen_time.get(), 5), 1.0F).effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 5), 1.0F).effect(new EffectInstance(Effects.POISON, FoodConfig.cyanide_poison_time.get(), 5), 1.0F).setAlwaysEdible().build();
    public static final Food GIANT_WAFFLE = (new Food.Builder()).hunger(12).saturation(0.9F).effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 5), 1.0F).build();
    public static final Food RAINBOW_CONE = (new Food.Builder()).hunger(3).saturation(0.5F).effect(new EffectInstance(Effects.SPEED, FoodConfig.snowcone_speed_time.get(), 5), 1.0F).effect(new EffectInstance(Effects.HASTE, FoodConfig.snowcone_haste_time.get(), 5), 1.0F).effect(new EffectInstance(Effects.JUMP_BOOST, FoodConfig.snowcone_jump_time.get(), 5), 1.0F).build();
    public static final Food PRETZEL = (new Food.Builder()).hunger(6).saturation(1.0F).effect(new EffectInstance(Effects.SPEED, FoodConfig.pretzel_speed_time.get(), 1), 1.0F).build();

    public static final Food SNOW_CONE = (new Food.Builder()).hunger(6).saturation(1F).effect(new EffectInstance(Effects.BLINDNESS, 50, 5), 1.0F).effect(new EffectInstance(Effects.NAUSEA, 500, 5), 1.0F).effect(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 3), 0.5F).setAlwaysEdible().build();
}
