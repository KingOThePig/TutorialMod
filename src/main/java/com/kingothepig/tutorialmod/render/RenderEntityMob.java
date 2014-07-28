package com.kingothepig.tutorialmod.render;

import com.kingothepig.tutorialmod.entity.EntityMob;
import com.kingothepig.tutorialmod.reference.EntityRef;
import com.kingothepig.tutorialmod.reference.Reference;
import com.kingothepig.tutorialmod.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEntityMob extends RenderLiving
{

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + ":textures/entity/" + EntityRef.MOB_NAME + ".png");

    private static final String __OBFID = "CL_00000984";

    public RenderEntityMob(ModelBase model, float p_i1253_2_)
    {
        super(model, p_i1253_2_);
        LogHelper.info(mobTextures.getResourcePath());
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMob entity)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityMob)entity);
    }
}