package com.kingothepig.tutorialmod.item;

import com.kingothepig.tutorialmod.reference.ItemRef;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMapleLeaf extends ItemModItem{
    public ItemMapleLeaf(){
        super();
        this.setUnlocalizedName("mapleLeaf");
    }

    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {

        player.addExperience(10000);


    }


}
