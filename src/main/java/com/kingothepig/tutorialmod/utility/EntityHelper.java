package com.kingothepig.tutorialmod.utility;

import com.kingothepig.tutorialmod.TutorialMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class EntityHelper {
    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName,randomId, TutorialMod.instance, 32, 1, true);

        createEgg(randomId, solidColor, spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
