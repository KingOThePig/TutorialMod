package com.kingothepig.tutorialmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityMob extends EntityAnimal {
    public EntityMob(World world) {
        super(world);
        this.setSize(0.9F, 1.8F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAIPanic(this ,0.6D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAITempt(this, 0.5D, Items.diamond, false));
    }

    public boolean isAIEnabled(){
        return true;
    }

    protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return new EntityMob(worldObj);
    }
}
