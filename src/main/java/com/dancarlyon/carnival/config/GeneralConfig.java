package com.dancarlyon.carnival.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeneralConfig
{
    public static ForgeConfigSpec.BooleanValue enable_experimental;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("General Config");

        enable_experimental = server
                .comment("Enable experimental features, remminder they may be buggy/not work")
                .define("general.enable_experimental", false);

    }
}
