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
    public static boolean testValue = false;
    public static int baconDonutRegenDuration = 0;
    public static int cyanideRegenDuration = 0;
    public static int cyanideHealthDuration = 0;
    public static int cyanidePoisonDuration = 0;
    public static int giantwaffleHealDuration = 0;

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
        //testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example value");

        baconDonutRegenDuration = configuration.getInt("Bacon Donut Regen Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Bacon Donut Regeneration. Min: 0, Max: 120");

        cyanideRegenDuration = configuration.getInt("Cyanide(Epic) Bottle Regen Duration", "FoodEffectDurations", 90, 0, 120, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 120");
        cyanideHealthDuration = configuration.getInt("Cyanide(Epic) Bottle Heal Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 120");
        cyanidePoisonDuration = configuration.getInt("Cyanide(Epic) Bottle Poison Duration", "FoodEffectDurations", 120, 0, 240, "Number of seconds for Cyanide Regeneration. Min: 0, Max: 240");

        giantwaffleHealDuration = configuration.getInt("Giant Waffle Heal Duration", "FoodEffectDurations", 60, 0, 120, "Number of seconds for Giant Waffle Heal. Min: 0, Max: 240");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
