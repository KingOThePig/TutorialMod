package com.kingothepig.tutorialmod.init;

import com.kingothepig.tutorialmod.block.BlockFlag;
import com.kingothepig.tutorialmod.reference.BlockRef;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final BlockFlag flag = new BlockFlag();
    public static void init(){

        GameRegistry.registerBlock(flag, BlockRef.FLAG_NAME);
    }
}
