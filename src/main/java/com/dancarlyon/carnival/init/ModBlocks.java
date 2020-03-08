package com.dancarlyon.carnival.init;

import com.dancarlyon.carnival.Carnival;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Carnival.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Carnival.MOD_ID)
public class ModBlocks {

    public static final Block test_block = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(2).harvestTool(ToolType.PICKAXE)).setRegistryName(Carnival.MOD_ID, "test_block")

        );
    }
}
