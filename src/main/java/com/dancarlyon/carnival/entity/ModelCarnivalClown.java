package com.dancarlyon.carnival.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.util.MathHelper;

public class ModelCarnivalClown extends ModelBase {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer lefthair;

    static int startEntityId = 300;

    public ModelCarnivalClown()
    {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(64, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(64, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(64, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(64, 64);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(64, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        lefthair = new ModelRenderer(this, 0, 32);
        lefthair.addBox(-5F, -6F, -3F, 10, 2, 8);
        lefthair.setRotationPoint(0F, 0F, 0F);
        lefthair.setTextureSize(64, 64);
        lefthair.mirror = true;
        setRotation(lefthair, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        head.render(f5);
        body.render(f5);
        rightarm.render(f5);
        leftarm.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
        lefthair.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        head.rotateAngleY = f3 / (180F / (float)Math.PI);
        head.rotateAngleX = f4 / (180F / (float)Math.PI);
        lefthair.rotateAngleY = head.rotateAngleY;
        lefthair.rotateAngleX = head.rotateAngleX;
        rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        rightarm.rotateAngleZ = 0.0F;
        leftarm.rotateAngleZ = 0.0F;
        rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        rightleg.rotateAngleY = 0.0F;
        leftleg.rotateAngleY = 0.0F;

        if (this.isRiding)
        {
            rightarm.rotateAngleX += -((float)Math.PI / 5F);
            leftarm.rotateAngleX += -((float)Math.PI / 5F);
            rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            rightleg.rotateAngleY = ((float)Math.PI / 10F);
            leftleg.rotateAngleY = -((float)Math.PI / 10F);
        }

        rightarm.rotateAngleY = 0.0F;
        leftarm.rotateAngleY = 0.0F;
        float f6;
        float f7;

        if (this.onGround > -9990.0F)
        {
            f6 = this.onGround;
            body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
            rightarm.rotationPointZ = MathHelper.sin(body.rotateAngleY) * 5.0F;
            rightarm.rotationPointX = -MathHelper.cos(body.rotateAngleY) * 5.0F;
            leftarm.rotationPointZ = -MathHelper.sin(body.rotateAngleY) * 5.0F;
            leftarm.rotationPointX = MathHelper.cos(body.rotateAngleY) * 5.0F;
            rightarm.rotateAngleY += body.rotateAngleY;
            leftarm.rotateAngleY += body.rotateAngleY;
            leftarm.rotateAngleX += body.rotateAngleY;
            f6 = 1.0F - this.onGround;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            f7 = MathHelper.sin(f6 * (float)Math.PI);
            float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;
            rightarm.rotateAngleX = (float)((double)rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
            rightarm.rotateAngleY += body.rotateAngleY * 2.0F;
            rightarm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
        }

            body.rotateAngleX = 0.0F;
            rightleg.rotationPointZ = 0.1F;
            leftleg.rotationPointZ = 0.1F;
            rightleg.rotationPointY = 12.0F;
            leftleg.rotationPointY = 12.0F;
            head.rotationPointY = 0.0F;

        rightarm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        leftarm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
        rightarm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
        leftarm.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
        
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    }

    @SuppressWarnings("unchecked")
    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
    {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityList.EntityEggInfo(id, primaryColor, secondaryColor));
    }

    public static int getUniqueEntityId()
    {
        do {
            startEntityId++;
        }
        while (EntityList.getStringFromID(startEntityId) != null);

        return startEntityId;
    }
}
