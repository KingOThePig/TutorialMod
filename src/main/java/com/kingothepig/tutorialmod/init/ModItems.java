package com.kingothepig.tutorialmod.init;

import com.kingothepig.tutorialmod.item.ItemMapleLeaf;
import com.kingothepig.tutorialmod.item.ItemModItem;
import com.kingothepig.tutorialmod.reference.ItemRef;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemModItem mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, ItemRef.MAPLELEAF_NAME);
    }
}
