package com.dancarlyon.carnival.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FoodConfig
{
    public static ForgeConfigSpec.IntValue cyanide_regen_time;
    public static ForgeConfigSpec.IntValue cyanide_poison_time;

    public static ForgeConfigSpec.IntValue snowcone_speed_time;
    public static ForgeConfigSpec.IntValue snowcone_haste_time;
    public static ForgeConfigSpec.IntValue snowcone_jump_time;

    public static ForgeConfigSpec.IntValue pretzel_speed_time;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Food Config");

        cyanide_regen_time = server
                .comment("Time regeneration effect should last from Cyanide Bottle")
                .defineInRange("food.cyanide_regen_time", 200, 1, 2400);

        cyanide_poison_time = server
                .comment("Time poison effect should last from Cyanide Bottle")
                .defineInRange("food.cyanide_regen_time", 400, 1, 2400);

        snowcone_speed_time = server
                .comment("Time Speed effect should last from Rainbow Snowcone")
                .defineInRange("food.cyanide_regen_time", 2000, 1, 2400);

        snowcone_haste_time = server
                .comment("Time Haste effect should last from Rainbow Snowcone")
                .defineInRange("food.cyanide_regen_time", 2000, 1, 2400);

        snowcone_jump_time = server
                .comment("Time Jump effect should last from Rainbow Snowcone")
                .defineInRange("food.cyanide_regen_time", 2000, 1, 2400);

        pretzel_speed_time = server
                .comment("Time Speed effect should last from Pretzel")
                .defineInRange("food.cyanide_regen_time", 1200, 1, 2400);
    }
}
