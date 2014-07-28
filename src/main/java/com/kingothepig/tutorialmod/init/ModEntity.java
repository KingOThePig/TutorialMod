package com.kingothepig.tutorialmod.init;

import com.kingothepig.tutorialmod.entity.EntityMob;
import com.kingothepig.tutorialmod.reference.EntityRef;

import static com.kingothepig.tutorialmod.utility.EntityHelper.createEntity;

public class ModEntity {

    public static void init(){
        registerEntity();
    }

    public static void registerEntity(){
        createEntity(EntityMob.class, EntityRef.MOB_NAME, EntityRef.MOB_SOLID, EntityRef.MOB_SPOT);
    }

}
