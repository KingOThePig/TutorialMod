package com.kingothepig.tutorialmod.init;

import com.kingothepig.tutorialmod.block.BlockFlag;
import com.kingothepig.tutorialmod.reference.BlockRef;
import com.kingothepig.tutorialmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockFlag flag = new BlockFlag();
    public static void init(){

        GameRegistry.registerBlock(flag, BlockRef.FLAG_NAME);
    }
}
