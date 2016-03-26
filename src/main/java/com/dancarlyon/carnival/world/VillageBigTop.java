package com.dancarlyon.carnival.world;


import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

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

        //Empty
        this.fillWithBlocks(world, box, 0,0,0, 20,15,20, Blocks.air, Blocks.air, false);

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

        //Y 1-5 Z 3
        this.fillWithMetadataBlocks(world, box, 8,1,3, 8,5,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,1,3,9,5,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,3,3, 10,5,3, Blocks.wool,14, Blocks.wool,14, false);

        //Doorway
        this.fillWithBlocks(world, box, 10,1,3, 10,2,3, Blocks.air, Blocks.air, false);

        this.fillWithBlocks(world, box, 11,1,3,11,5,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,3, 12,5,3, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 4
        this.fillWithMetadataBlocks(world, box, 6,1,4, 6,5,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,1,4, 7,5,4, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,1,4, 13,5,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,4, 14,5,4, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 5
        this.fillWithBlocks(world, box, 5,1,5, 5,5,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,1,5, 15,5,5, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 6
        this.fillWithMetadataBlocks(world, box, 4,1,6, 4,5,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 16,1,6, 16,5,6, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 7
        this.fillWithBlocks(world, box, 4,1,7, 4,5,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,1,7, 16,5,7, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 8
        this.fillWithMetadataBlocks(world, box, 3,1,8, 3,5,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,1,8, 17,5,8, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 9
        this.fillWithBlocks(world, box, 3,1,9, 3,5,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,1,9, 17,5,9, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 10
        this.fillWithMetadataBlocks(world, box, 3,1,10, 3,5,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,1,10, 17,5,10, Blocks.wool,14, Blocks.wool,17, false);

        //Y 1-5 Z 11
        this.fillWithBlocks(world, box, 3,1,11, 3,5,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,1,11, 17,5,11, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 12
        this.fillWithMetadataBlocks(world, box, 3,1,12, 3,5,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,1,12, 17,5,12, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 13
        this.fillWithBlocks(world, box, 4,1,13, 4,5,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,1,13, 16,5,13, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 14
        this.fillWithMetadataBlocks(world, box, 4,1,14, 4,5,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 16,1,14, 16,5,14, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 15
        this.fillWithBlocks(world, box, 5,1,15, 5,5,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,1,15, 15,5,15, Blocks.wool, Blocks.wool, false);

        //Y 1-5 Z 16
        this.fillWithMetadataBlocks(world, box, 6,1,16, 6,5,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,1,16, 7,5,16, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,1,16, 13,5,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,16, 14,5,16, Blocks.wool,14, Blocks.wool,14, false);

        //Y 1-5 Z 17
        this.fillWithMetadataBlocks(world, box, 8,1,17, 8,5,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,1,17, 9,5,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,1,17, 10,5,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,1,17, 11,5,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,17, 12,5,17, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 2
        this.fillWithMetadataBlocks(world, box, 8,6,2, 8,6,2, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,2, 9,6,2, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,2, 10,6,2, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,2, 11,6,2, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,2, 12,6,2, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 3
        this.fillWithMetadataBlocks(world, box, 6,6,3, 6,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,3, 7,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,6,3, 8,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,3, 9,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,3, 10,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,3, 11,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,3, 12,6,3, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,3, 13,6,3, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,3, 14,6,3, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 4
        this.fillWithBlocks(world, box, 5,6,4, 5,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 6,6,4, 6,6,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,4, 7,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 8,6,4, 12,6,4, Blocks.air, Blocks.air, false);
        this.fillWithBlocks(world, box, 13,6,4, 13,6,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,4, 14,6,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,4, 15,6,4, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 5
        this.fillWithBlocks(world, box, 4,6,5, 5,6,5, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,6,5, 16,6,5, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 6
        this.fillWithMetadataBlocks(world, box, 3,6,6, 4,6,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 16,6,6, 17,6,6, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 7
        this.fillWithBlocks(world, box, 3,6,7, 4,6,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,6,7, 17,6,7, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 8
        this.fillWithMetadataBlocks(world, box, 2,6,8, 3,6,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,6,8, 18,6,8, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 9
        this.fillWithBlocks(world, box, 2,6,9, 3,6,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,6,9, 18,6,9, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 10
        this.fillWithMetadataBlocks(world, box, 2,6,10, 3,6,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,6,10, 18,6,10, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 11
        this.fillWithBlocks(world, box, 2,6,11, 3,6,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 17,6,11, 18,6,11, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 12
        this.fillWithMetadataBlocks(world, box, 2,6,12, 3,6,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 17,6,12, 18,6,12, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 13
        this.fillWithBlocks(world, box, 3,6,13, 4,6,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 16,6,13, 17,6,13, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 14
        this.fillWithMetadataBlocks(world, box, 3,6,14, 4,6,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 16,6,14, 17,6,14, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 15
        this.fillWithBlocks(world, box, 4,6,15, 5,6,15, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,6,15, 16,6,15, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 16
        this.fillWithBlocks(world, box, 5,6,16, 5,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 6,6,16, 6,6,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,16, 7,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,6,16, 13,6,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,16, 14,6,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 15,6,16, 15,6,16, Blocks.wool, Blocks.wool, false);

        //Y 6 Z 17
        this.fillWithMetadataBlocks(world, box, 6,6,17, 6,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,6,17, 7,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,6,17, 8,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,17, 9,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,17, 10,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,17, 11,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,17, 12,6,17, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,6,17, 13,6,17, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,6,17, 14,6,17, Blocks.wool,14, Blocks.wool,14, false);

        //Y 6 Z 18
        this.fillWithMetadataBlocks(world, box, 8,6,18, 8,6,18, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,6,18, 9,6,18, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,6,18, 10,6,18, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,6,18, 11,6,18, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,6,18, 12,6,18, Blocks.wool,14, Blocks.wool,14, false);


        //Y 7 Z 4-16 no air blocks trial
        this.fillWithMetadataBlocks(world, box, 8,7,4, 8,7,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,7,4, 9,7,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,7,4, 10,7,4, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,7,4, 11,7,4, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,7,4, 12,7,4, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 6,7,5, 6,7,5, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,7,5, 7,7,5, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,7,5, 8,7,5, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,7,5, 9,7,5, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,7,5, 10,7,5, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,7,5, 11,7,5, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,7,5, 12,7,5, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,7,5, 13,7,5, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,7,5, 14,7,5, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 5,7,6, 6,7,6, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,7,6, 7,7,6, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,7,6, 13,7,6, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,7,6, 15,7,6, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 5,7,7, 6,7,7, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 14,7,7, 15,7,7, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 4,7,8, 5,7,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 15,7,8, 16,7,8, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 4,7,9, 5,7,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,7,9, 16,7,9, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 4,7,10, 5,7,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 15,7,10, 16,7,10, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 4,7,11, 5,7,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 15,7,11, 16,7,11, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 4,7,12, 5,7,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 15,7,12, 16,7,12, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 5,7,13, 6,7,13, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 14,7,13, 15,7,13, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 5,7,14, 6,7,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,7,14, 7,7,14, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,7,14, 13,7,14, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,7,14, 15,7,14, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 6,7,15, 6,7,15, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 7,7,15, 7,7,15, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,7,15, 8,7,15, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,7,15, 9,7,15, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,7,15, 10,7,15, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,7,15, 11,7,15, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,7,15, 12,7,15, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,7,15, 13,7,15, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 14,7,15, 14,7,15, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 8,7,16, 8,7,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,7,16, 9,7,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,7,16, 10,7,16, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,7,16, 11,7,16, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,7,16, 12,7,16, Blocks.wool,14, Blocks.wool,14, false);

        //Y 8 no air
        this.fillWithMetadataBlocks(world, box, 8,8,6, 8,8,6, Blocks.wool,14,Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,8,6, 9,8,6, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,8,6, 10,8,6, Blocks.wool,14,Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,8,6, 11,8,6, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,8,6, 12,8,6, Blocks.wool,14,Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 7,8,7, 7,8,7, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,8,7, 8,8,7, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,8,7, 9,8,7, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,8,7, 10,8,7, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,8,7, 11,8,7, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,8,7, 12,8,7, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,8,7, 13,8,7, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 6,8,8, 8,8,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 12,8,8, 14,8,8, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 6,8,9, 7,8,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,8,9, 14,8,9, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 6,8,10, 7,8,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 13,8,10, 14,8,10, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 6,8,11, 7,8,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 13,8,11, 14,8,11, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 6,8,12, 8,8,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 12,8,12, 14,8,12, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 7,8,13, 7,8,13, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 8,8,13, 8,8,13, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,8,13, 9,8,13, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,8,13, 10,8,13, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,8,13, 11,8,13, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,8,13, 12,8,13, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 13,8,13, 13,8,13, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 8,8,14, 8,8,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 9,8,14, 9,8,14, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,8,14, 10,8,14, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,8,14, 11,8,14, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 12,8,14, 12,8,14, Blocks.wool,14, Blocks.wool,14, false);

        //Y 9
        this.fillWithBlocks(world, box, 9,9,8, 9,9,8, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,9,8, 10,9,8, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,9,8, 11,9,8, Blocks.wool, Blocks.wool, false);

        this.fillWithBlocks(world, box, 8,9,9, 9,9,9, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 11,9,9, 12,9,9, Blocks.wool, Blocks.wool, false);

        this.fillWithMetadataBlocks(world, box, 8,9,10, 8,9,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithMetadataBlocks(world, box, 12,9,10, 12,9,10, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithBlocks(world, box, 8,9,11, 9,9,11, Blocks.wool, Blocks.wool, false);
        this.fillWithBlocks(world, box, 11,9,11, 12,9,11, Blocks.wool, Blocks.wool, false);

        this.fillWithBlocks(world, box, 9,9,12, 9,9,12, Blocks.wool, Blocks.wool, false);
        this.fillWithMetadataBlocks(world, box, 10,9,12, 10,9,12, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,9,12, 11,9,12, Blocks.wool, Blocks.wool, false);

        //Y 10
        this.fillWithMetadataBlocks(world, box, 10,10,9, 10,10,9, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 9,10,10, 9,10,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 10,10,10, 10,10,10, Blocks.glowstone, Blocks.glowstone, false);
        this.fillWithMetadataBlocks(world, box, 11,10,10, 11,10,10, Blocks.wool,14, Blocks.wool,14, false);

        this.fillWithMetadataBlocks(world, box, 10,10,11, 10,10,11, Blocks.wool,14, Blocks.wool,14, false);

        //Y 11
        this.fillWithBlocks(world, box, 10,11,10, 10,11,10, Blocks.fence, Blocks.fence, false);

        //Y 12
        this.fillWithBlocks(world, box, 10,12,10, 10,12,10, Blocks.fence, Blocks.fence, false);

        //Y 13
        this.fillWithBlocks(world, box, 10,13,10, 10,13,10, Blocks.fence, Blocks.fence, false);
        this.fillWithMetadataBlocks(world, box, 11,13,10, 11,13,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 12,13,10, 12,13,10, Blocks.wool, Blocks.wool, false);

        //Y 14
        this.fillWithMetadataBlocks(world, box, 10,14,10, 10,14,10, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 11,14,10, 11,14,10, Blocks.wool, Blocks.wool, false);

        //Torches 9/11
        this.fillWithBlocks(world, box, 9,4,4, 9,4,4, Blocks.torch, Blocks.torch, false);
        this.fillWithBlocks(world, box, 11,4,4, 11,4,4, Blocks.torch, Blocks.torch, false);

        this.fillWithBlocks(world, box, 4,4,9, 4,4,9, Blocks.torch, Blocks.torch, false);
        this.fillWithBlocks(world, box, 4,4,11, 4,4,11, Blocks.torch, Blocks.torch, false);

        this.fillWithBlocks(world, box, 16,4,9, 16,4,9, Blocks.torch, Blocks.torch, false);
        this.fillWithBlocks(world, box, 16,4,11, 16,4,11, Blocks.torch, Blocks.torch, false);

        this.fillWithBlocks(world, box, 9,4,16, 9,4,16, Blocks.torch, Blocks.torch, false);
        this.fillWithBlocks(world, box, 11,4,16, 11,4,16, Blocks.torch, Blocks.torch, false);

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
            return new StructureVillagePieces.PieceWeight(VillageBigTop.class, 35, MathHelper.getRandomIntegerInRange(random, 0 + i, 1 + i));
        }
        @Override
        public Class<?> getComponentClass()
        {
            return VillageBigTop.class;
        }
    }

}
