package com.kingothepig.tutorialmod.init;

import com.kingothepig.tutorialmod.item.ItemMapleLeaf;
import com.kingothepig.tutorialmod.item.ItemModItem;
import com.kingothepig.tutorialmod.reference.ItemRef;
import com.kingothepig.tutorialmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemModItem mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, ItemRef.MAPLELEAF_NAME);

        OreDictionary.registerOre("treeLeaves", new ItemStack(ModItems.mapleLeaf, 1));
    }
}
