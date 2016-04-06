package com.dancarlyon.carnival.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import static net.minecraft.client.audio.SoundCategory.BLOCKS;
import static net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.HEALTH;

public class EntityCarnivalClown extends EntityMob {
    public EntityCarnivalClown(World par1World)
    {
        super(par1World);

        this.setSize(1.5F, 2.0F);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override

    protected String getLivingSound()
    {
        return "mob.zombie.say";
    }

    @Override
    protected String getHurtSound()
    {
        return "carnival:clown";
    }

    @Override
    protected String getDeathSound()
    {
        return "mob.zombie.death";
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        /*this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(THE HEALTH.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.53000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(ATTACKDAMAGE.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(AMOUNT OF BLOCKS THAT IT FOLLOWS YOU.0D);*/
    }
}
