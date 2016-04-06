package com.dancarlyon.carnival.entity;


import com.dancarlyon.carnival.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderClown extends RenderBiped {
    public RenderClown(ModelBiped var1, float shadow) {
        super(var1, shadow);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation(Reference.MOD_ID + ":textures/models/carnival_clown.png");
    }
}
