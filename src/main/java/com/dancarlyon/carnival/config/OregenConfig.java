package com.dancarlyon.carnival.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig
{
    public static ForgeConfigSpec.IntValue carnival_chance;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Oregen Config");

        carnival_chance = server
                .comment("Maxiumum number of ore vein of xyz in spawn chunk")
                .defineInRange("oregen.carnival_chance", 100, 1, 1000);
    }
}
