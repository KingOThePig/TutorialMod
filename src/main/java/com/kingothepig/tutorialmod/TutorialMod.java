package com.kingothepig.tutorialmod;

import com.kingothepig.tutorialmod.handler.ConfigHandler;
import com.kingothepig.tutorialmod.init.ModBlocks;
import com.kingothepig.tutorialmod.init.ModItems;
import com.kingothepig.tutorialmod.init.Recipes;
import com.kingothepig.tutorialmod.proxy.IProxy;
import com.kingothepig.tutorialmod.reference.ConfigRef;
import com.kingothepig.tutorialmod.reference.Reference;
import com.kingothepig.tutorialmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = ConfigRef.GUI_FACTORY_CLASS)
public class TutorialMod {

    @Mod.Instance(Reference.MOD_ID)
    public static TutorialMod instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY, serverSide = Reference.MOD_SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre-Init Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        Recipes.init();
        LogHelper.info("Init Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Init Complete!");

        for(String oreName : OreDictionary.getOreNames()){
            LogHelper.info(oreName);
        }

    }

}
