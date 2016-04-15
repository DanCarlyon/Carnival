package com.dancarlyon.carnival.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

public class EntityCarnivalClown extends EntityCreature {


    public EntityCarnivalClown(World par1World)
    {
        super(par1World);
        clearAITasks();

        this.setSize(1.0F, 2.0F);

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZombie.class, 2.0D, true));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityZombie.class, 4.0F));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityZombie.class, 6, true));
    }

    protected void clearAITasks()
    {
        tasks.taskEntries.clear();
        targetTasks.taskEntries.clear();
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    protected String getLivingSound()
    {
        return "";
    }

    @Override
    protected String getHurtSound()
    {
        return "carnival:clown.hit";
    }

    @Override
    protected String getDeathSound()
    {
        return "carnival:clown.die";
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.allowLeashing();
    }

}
