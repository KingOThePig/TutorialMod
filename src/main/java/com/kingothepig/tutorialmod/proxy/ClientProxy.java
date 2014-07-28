package com.kingothepig.tutorialmod.proxy;

import com.kingothepig.tutorialmod.entity.EntityMob;
import com.kingothepig.tutorialmod.render.RenderEntityMob;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy{
    public static void registerRenderThings(){
        RenderingRegistry.registerEntityRenderingHandler(EntityMob.class, new RenderEntityMob(new ModelBiped(), 0));
    }
}
