package com.kingothepig.tutorialmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        //Shaped Recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), "x x", " x ", " x ", 'x', new ItemStack(Items.stick));

        //Shapeless Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf));

        //Ore Dictionary Shaped Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), "x x", " x ", " x ", 'x', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), "x", 'x', "treeLeaves"));

        //Ore Dictionary Shapeless Recipes
        //GameRegistry.addShapelessRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf)));


        //TEMP ITEM RECIPE FOR DIAMOND
        GameRegistry.addRecipe(new ItemStack(Items.diamond), "OGO", "GEG", "OGO", 'O', new ItemStack(Blocks.obsidian), 'G', new ItemStack(Items.glowstone_dust), 'E', new ItemStack(Items.ender_pearl));
    }
}
