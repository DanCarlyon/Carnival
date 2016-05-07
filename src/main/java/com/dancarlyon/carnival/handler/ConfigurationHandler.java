package com.dancarlyon.carnival.handler;

import com.dancarlyon.carnival.reference.Reference;
//import com.sun.xml.internal.bind.v2.model.core.ID;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;


public class ConfigurationHandler
{
    public static Configuration configuration;
    public static int baconDonutRegenDuration = 0;
    public static int cyanideRegenDuration = 0;
    public static int cyanideHealthDuration = 0;
    public static int cyanidePoisonDuration = 0;
    public static int giantwaffleHealDuration = 0;
    public static int pretzelSpeedDuration = 0;

    public static int multiSnowConeSpeedDuration = 0;
    public static int multiSnowConeDigSpeedDuration = 0;
    public static int multiSnowConeJumpDuration = 0;

    public static boolean enableSwordInStoneBlock = false;

    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        baconDonutRegenDuration = configuration.getInt("Bacon Donut Regen Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Bacon Donut Regeneration. Min: 0, Max: 120");

        cyanideRegenDuration = configuration.getInt("Cyanide(Epic) Bottle Regen Duration", "FoodEffectDurations", 90, 0, 120, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 120");
        cyanideHealthDuration = configuration.getInt("Cyanide(Epic) Bottle Heal Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 120");
        cyanidePoisonDuration = configuration.getInt("Cyanide(Epic) Bottle Poison Duration", "FoodEffectDurations", 120, 0, 240, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 240");

        giantwaffleHealDuration = configuration.getInt("Giant Waffle Heal Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Giant Waffle Heal. Min: 0, Max: 240");

        pretzelSpeedDuration = configuration.getInt("Pretzel Speed Duration", "FoodEffectDurations", 10, 0, 60, "Number of seconds for speed to last after eating a pretzel");

        multiSnowConeSpeedDuration = configuration.getInt("Multi Colored Snowcone Move Speed Duration", "FoodEffectDurations", 5, 0, 20, "Number of seconds for speed to last after eating a multi colored snowcone");
        multiSnowConeDigSpeedDuration = configuration.getInt("Multi Colored Snowcone Dig Speed Duration", "FoodEffectDurations", 5, 0, 20, "Number of seconds for dig speed to last after eating a multi colored snowcone");
        multiSnowConeJumpDuration = configuration.getInt("Multi Colored Snowcone Jump Duration", "FoodEffectDurations", 5, 0, 20, "Number of seconds for jump to last after eating a multi colored snowcone");


        enableSwordInStoneBlock = configuration.getBoolean("Enable/Disable Sword in stone block", "BlockConfigurations", true, "To disable set to false");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
