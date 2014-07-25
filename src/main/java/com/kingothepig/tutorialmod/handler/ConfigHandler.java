package com.kingothepig.tutorialmod.handler;

import com.kingothepig.tutorialmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile){
        //create config object from given config file
        if(config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    private static void loadConfig(){

        testValue = config.getBoolean("testValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");

        if(config.hasChanged()){
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if ( event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //resync config
            loadConfig();
        }
    }
}
