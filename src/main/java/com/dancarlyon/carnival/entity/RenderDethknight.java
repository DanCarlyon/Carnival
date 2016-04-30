package com.dancarlyon.carnival.entity;


import com.dancarlyon.carnival.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDethknight extends RenderLiving {
    public RenderDethknight(ModelBase var1, float shadow) {
        super(var1, shadow);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation(Reference.MOD_ID + ":textures/models/Dethknight_texture.png");
    }
}
