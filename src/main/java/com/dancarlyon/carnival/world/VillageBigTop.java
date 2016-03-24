package com.dancarlyon.carnival.world;


import com.dancarlyon.carnival.utility.LogHelper;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VillageBigTop extends StructureVillagePieces.Village
{
    /*public VillageBigTop()
    {
    }*/

    public VillageBigTop(Start villagePiece, int par2, Random par3Random, StructureBoundingBox par4StructureBoundingBox, int par5)
    {
        super(villagePiece, par2);
        this.coordBaseMode = par5;
        this.boundingBox = par4StructureBoundingBox;
    }

    private int groundLevel = -1;

    @Override
    public boolean addComponentParts(World world, Random rand, StructureBoundingBox box) {
        if(groundLevel < 0)
        {
            groundLevel = this.getAverageGroundLevel(world, box);
            if(groundLevel<0) {
                return true;
            }
            boundingBox.offset(0, groundLevel - boundingBox.maxY+14-1, 0);
        }
        LogHelper.info("Bound Box maxY: "+boundingBox.maxY);
        LogHelper.info("Bounding Box: "+boundingBox.toString());
        //Empty
        this.fillWithBlocks(world, box, 0,0,0, 20,15,20, Blocks.air, Blocks.air, false);

        /*this.fillWithBlocks(world, box, 1,1,3, 1,4,3, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 1,1,8, 1,6,8, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 9,1,3, 9,6,3, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 9,1,8, 9,6,8, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 1,4,3, 9,4,8, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 6,5,3, 6,7,3, Blocks.sandstone, Blocks.sandstone, false);
        this.fillWithBlocks(world, box, 1,5,5, 1,6,5, Blocks.sandstone, Blocks.sandstone, false);*/

        //Floor Include outside Blocks.grass and Blocks.sand
        //Y level 0
        //Line 0
        this.fillWithBlocks(world, box, 0,0,0, 20,0,0, Blocks.grass, Blocks.grass, false);

        //Line 1
        this.fillWithBlocks(world, box, 0,0,1, 6,0,1, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 7,0,1, 13,0,1, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 14,0,1, 20,0,1, Blocks.grass, Blocks.grass, false);

        //Line 2
        this.fillWithBlocks(world, box, 0,0,2, 4,0,2, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 5,0,2, 15,0,2, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 16,0,2, 20,0,2, Blocks.grass, Blocks.grass, false);

        //Line 3
        this.fillWithBlocks(world, box, 0,0,3, 3,0,3, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 4,0,2, 16,0,3, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 17,0,3, 20,0,3, Blocks.grass, Blocks.grass, false);

        //Line 4
        this.fillWithBlocks(world, box, 0,0,4, 2,0,4, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 3,0,4, 17,0,4, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 18,0,4, 20,0,4, Blocks.grass, Blocks.grass, false);

        //Lines 5, 6
        this.fillWithBlocks(world, box, 0,0,5, 1,0,6, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 2,0,5, 18,0,6, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 19,0,5, 20,0,6, Blocks.grass, Blocks.grass, false);

        //Lines 7, 13
        this.fillWithBlocks(world, box, 0,0,7, 0,0,13, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 1,0,7, 19,0,13, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 20,0,7, 20,0,13, Blocks.grass, Blocks.grass, false);

        //Lines 14, 15
        this.fillWithBlocks(world, box, 0,0,14, 1,0,15, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 2,0,14, 18,0,15, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 19,0,14, 20,0,15, Blocks.grass, Blocks.grass, false);

        //Line 16
        this.fillWithBlocks(world, box, 0,0,16, 2,0,16, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 3,0,16, 17,0,16, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 18,0,16, 20,0,16, Blocks.grass, Blocks.grass, false);

        //Line 17
        this.fillWithBlocks(world, box, 0,0,17, 3,0,17, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 4,0,17, 16,0,17, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 17,0,17, 20,0,17, Blocks.grass, Blocks.grass, false);

        //Line 18
        this.fillWithBlocks(world, box, 0,0,18, 4,0,18, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 5,0,18, 15,0,18, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 16,0,18, 20,0,18, Blocks.grass, Blocks.grass, false);

        //Line 19
        this.fillWithBlocks(world, box, 0,0,19, 6,0,19, Blocks.grass, Blocks.grass, false);
        this.fillWithBlocks(world, box, 7,0,19, 13,0,19, Blocks.sand, Blocks.sand, false);
        this.fillWithBlocks(world, box, 14,0,19, 20,0,19, Blocks.grass, Blocks.grass, false);

        //Line 20
        this.fillWithBlocks(world, box, 0,0,20, 20,0,20, Blocks.grass, Blocks.grass, false);


        //Y 1-5 Z 0-2
        this.fillWithBlocks(world, box, 0,1,0, 20,5,2, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 3
        this.fillWithBlocks(world, box, 0,1,3, 7,5,3, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 8,1,3, 8,5,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,1,3,9,5,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,3,3, 10,5,3, Blocks.wool,14, Blocks.wool,14, false);

        //Doorway
        this.fillWithBlocks(world, box, 10,1,3, 10,2,3, Blocks.air, Blocks.air, false);

        this.fillWithBlocks(world, box, 11,1,3,11,5,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,3, 12,5,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,1,3, 20,5,3, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 4
        this.fillWithBlocks(world, box, 0,1,4, 5,5,4, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 6,1,4, 6,5,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,1,4, 7,5,4, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 8,1,4, 12,5,4, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 13,1,4, 13,5,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,4, 14,5,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,1,4, 15,5,4, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 5
        this.fillWithBlocks(world, box, 0,1,5, 4,5,5, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 5,1,5, 5,5,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 6,1,5, 14,5,5, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 15,1,5, 15,5,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,1,5, 20,5,5, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 6
        this.fillWithBlocks(world, box, 0,1,6, 3,5,6, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 4,1,6, 4,5,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 5,1,6, 15,5,6, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 16,1,6, 16,5,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 17,1,6, 20,5,6, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 7
        this.fillWithBlocks(world, box, 0,1,7, 3,5,7, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 4,1,7, 4,5,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 5,1,7, 15,5,7, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 16,1,7, 16,5,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,1,7, 20,5,7, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 8
        this.fillWithBlocks(world, box, 0,1,8, 2,5,8, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,8, 3,5,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,1,8, 16,5,8, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,8, 17,5,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 18,1,8, 20,5,8, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 9
        this.fillWithBlocks(world, box, 0,1,9, 2,5,9, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 3,1,9, 3,5,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 4,1,9, 16,5,9, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 17,1,9, 17,5,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 18,1,9, 20,1,9, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 10
        this.fillWithBlocks(world, box, 0,1,10, 2,5,10, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,10, 3,5,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,1,10, 16,5,10, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,10, 17,5,10, Blocks.wool,14, Blocks.wool,17, false);
        this.fillWithBlocks(world, box, 18,1,10, 20,5,10, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 11
        this.fillWithBlocks(world, box, 0,1,11, 2,1,11, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 3,1,11, 3,5,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 4,1,11, 16,5,11, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 17,1,11, 17,5,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 18,1,11, 20,5,11, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 12
        this.fillWithBlocks(world, box, 0,1,12, 2,5,12, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,12, 3,5,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,1,12, 16,5,12, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,12, 17,5,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 18,1,12, 20,5,12, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 13
        this.fillWithBlocks(world, box, 0,1,13, 3,5,13, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 4,1,13, 4,5,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 5,1,13, 15,5,13, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 16,1,13, 16,5,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,1,13, 20,5,13, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 14
        this.fillWithBlocks(world, box, 0,1,14, 3,5,14, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 4,1,14, 4,5,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 5,1,14, 15,5,14, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 16,1,14, 16,5,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 17,1,14, 20,5,14, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 15
        this.fillWithBlocks(world, box, 0,1,15, 4,5,15, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 5,1,15, 5,5,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 6,1,15, 14,5,15, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 15,1,15, 15,5,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,1,15, 20,5,15, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 16
        this.fillWithBlocks(world, box, 0,1,16, 5,5,16, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 6,1,16, 6,5,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,1,16, 7,5,16, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 8,1,16, 12,5,16, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 13,1,16, 13,5,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,16, 14,5,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,1,16, 20,5,16, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 17
        this.fillWithBlocks(world, box, 0,1,17, 7,5,17, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 8,1,17, 8,5,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,1,17, 9,5,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,1,17, 10,5,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,1,17, 11,5,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,17, 12,5,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,1,17, 20,5,17, Blocks.air, Blocks.air, false);

        //Y 1-5 Z 18-20
        this.fillWithBlocks(world, box, 0,1,18, 20,5,20, Blocks.air, Blocks.air, false);

        //Y 6 Z 0-1
        this.fillWithBlocks(world, box, 0,6,0, 20,6,1, Blocks.air, Blocks.air, false);

        //Y 6 Z 2
        this.fillWithBlocks(world, box, 0,6,2, 7,6,2, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 8,6,2, 8,6,2, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,2, 9,6,2, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,2, 10,6,2, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,2, 11,6,2, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,2, 12,6,2, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,2, 20,6,2, Blocks.air, Blocks.air, false);

        //Y 6 Z 3
        this.fillWithBlocks(world, box, 0,6,3, 5,6,3, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 6,6,3, 6,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,3, 7,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,6,3, 8,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,3, 9,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,3, 10,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,3, 11,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,3, 12,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,3, 13,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,3, 14,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,3, 20,6,3, Blocks.air, Blocks.air, false);

        //Y 6 Z 4
        this.fillWithBlocks(world, box, 0,6,4, 4,6,4, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 5,6,4, 5,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 6,6,4, 6,6,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,4, 7,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 8,6,4, 12,6,4, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 13,6,4, 13,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,4, 14,6,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,4, 15,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,6,4, 20,6,4, Blocks.air, Blocks.air, false);

        //Y 5 Z 5
        this.fillWithBlocks(world, box, 0,6,5, 3,6,5, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 4,6,5, 5,6,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 6,6,5, 14,6,5, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 15,6,5, 16,6,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,6,5, 20,6,5, Blocks.air, Blocks.air, false);

        //Y 6 Z 6
        this.fillWithBlocks(world, box, 0,6,6, 2,6,6, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 3,6,6, 4,6,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 5,6,6, 15,6,6, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 16,6,6, 17,6,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 18,6,6, 20,6,6, Blocks.air, Blocks.air, false);

        //Y 6 Z 7
        this.fillWithBlocks(world, box, 0,6,7, 2,6,7, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 3,6,7, 4,6,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 5,6,7, 15,6,7, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 16,6,7, 17,6,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 18,6,7, 20,6,6, Blocks.air, Blocks.air, false);

        //Y 6 Z 8
        this.fillWithBlocks(world, box, 0,6,8, 1,6,8, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 2,6,8, 3,6,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,6,8, 16,6,8, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,6,8, 18,6,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 19,6,8, 20,6,8, Blocks.air, Blocks.air, false);

        //Y 6 Z 9
        this.fillWithBlocks(world, box, 0,6,9, 1,6,9, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 2,6,9, 3,6,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 4,6,9, 16,6,9, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 17,6,9, 18,6,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 19,6,9, 20,6,9, Blocks.air, Blocks.air, false);

        //Y 6 Z 10
        this.fillWithBlocks(world, box, 0,6,10, 1,6,10, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 2,6,10, 3,6,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,6,10, 16,6,10, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,6,10, 18,6,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 19,6,10, 20,6,10, Blocks.air, Blocks.air, false);

        //Y 6 Z 11
        this.fillWithBlocks(world, box, 0,6,11, 1,6,11, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 2,6,11, 3,6,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 4,6,11, 16,6,11, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 17,6,11, 18,6,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 19,6,11, 20,6,11, Blocks.air, Blocks.air, false);

        //Y 6 Z 12
        this.fillWithBlocks(world, box, 0,6,12, 1,6,12, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 2,6,12, 3,6,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 4,6,12, 16,6,12, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 17,6,12, 18,6,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 19,6,12, 20,6,12, Blocks.air, Blocks.air, false);

        //Y 6 Z 13
        this.fillWithBlocks(world, box, 0,6,13, 2,6,13, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 3,6,13, 4,6,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 5,6,13, 15,6,13, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 16,6,13, 17,6,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 18,6,13, 20,6,13, Blocks.air, Blocks.air, false);

        //Y 6 Z 14
        this.fillWithBlocks(world, box, 0,6,14, 2,6,14, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 3,6,14, 4,6,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 5,6,14, 15,6,14, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 16,6,14, 17,6,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 18,6,14, 20,6,14, Blocks.air, Blocks.air, false);

        //Y 6 Z 15
        this.fillWithBlocks(world, box, 0,6,15, 3,6,15, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 4,6,15, 5,6,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 6,6,15, 14,6,15, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 15,6,15, 16,6,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,6,15, 20,6,15, Blocks.air, Blocks.air, false);

        //Y 6 Z 16
        this.fillWithBlocks(world, box, 0,6,16, 4,6,16, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 5,6,16, 5,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 6,6,16, 6,6,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,16, 7,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 8,6,16, 12,6,16, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 13,6,16, 13,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,16, 14,6,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,16, 15,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,6,16, 20,6,16, Blocks.air, Blocks.air, false);

        //Y 6 Z 17
        this.fillWithBlocks(world, box, 0,6,17, 5,6,17, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 6,6,17, 6,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,17, 7,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,6,17, 8,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,17, 9,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,17, 10,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,17, 11,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,17, 12,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,17, 13,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,17, 14,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,17, 20,6,17, Blocks.air, Blocks.air, false);

        //Y 6 Z 18
        this.fillWithBlocks(world, box, 0,6,18, 7,6,18, Blocks.air, Blocks.air, false);
        this.fillWithMetadataBlocks(world, box, 8,6,18, 8,6,18, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,18, 9,6,18, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,18, 10,6,18, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,18, 11,6,18, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,18, 12,6,18, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,18, 20,6,18, Blocks.air, Blocks.air, false);

        //Y 6 Z 19-20
        this.fillWithBlocks(world, box, 0,6,19, 20,6,20, Blocks.air, Blocks.air, false);


        /*this.fillWithMetadataBlocks(world, box, 0,0,0, 0,10,0, Blocks.Blocks.wool,14, Blocks.Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 1,0,1, 1,10,1, Blocks.Blocks.wool, Blocks.Blocks.wool, false);*/

        this.spawnVillagers(world, box, 4, 1, 2, 1);
        return true;
    }

    public static class VillageManager implements IVillageCreationHandler
    {
        @Override
        public Object buildComponent(StructureVillagePieces.PieceWeight villagePiece, StructureVillagePieces.Start startPiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5)
        {
            StructureBoundingBox box = StructureBoundingBox.getComponentToAddBoundingBox(p1, p2, p3, 0, 0, 0, 20, 15, 20, p4);
            return (!canVillageGoDeeper(box)) || (StructureComponent.findIntersecting(pieces, box) != null) ? null : new VillageBigTop(startPiece, p5, random, box, p4);
        }
        @Override
        public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random random, int i)
        {
            return new StructureVillagePieces.PieceWeight(VillageBigTop.class, 15, MathHelper.getRandomIntegerInRange(random, 0 + i, 1 + i));
        }
        @Override
        public Class<?> getComponentClass()
        {
            return VillageBigTop.class;
        }
    }


}
