package com.dancarlyon.carnival.world;


import com.dancarlyon.carnival.utility.LogHelper;
import cpw.mods.fml.common.registry.VillagerRegistry;
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

import static net.minecraft.init.Blocks.*;

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
        this.fillWithBlocks(world, box, 0,0,0, 20,15,20, air, air, false);

        /*this.fillWithBlocks(world, box, 1,1,3, 1,4,3, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 1,1,8, 1,6,8, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 9,1,3, 9,6,3, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 9,1,8, 9,6,8, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 1,4,3, 9,4,8, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 6,5,3, 6,7,3, sandstone, sandstone, false);
        this.fillWithBlocks(world, box, 1,5,5, 1,6,5, sandstone, sandstone, false);*/

        //Floor Include outside grass and sand
        //Y level 0
        //Line 0
        this.fillWithBlocks(world, box, 0,0,0, 20,0,0, grass, grass, false);

        //Line 1
        this.fillWithBlocks(world, box, 0,0,1, 6,0,1, grass, grass, false);
        this.fillWithBlocks(world, box, 7,0,1, 13,0,1, sand, sand, false);
        this.fillWithBlocks(world, box, 14,0,1, 20,0,1, grass, grass, false);

        //Line 2
        this.fillWithBlocks(world, box, 0,0,2, 4,0,2, grass, grass, false);
        this.fillWithBlocks(world, box, 5,0,2, 15,0,2, sand, sand, false);
        this.fillWithBlocks(world, box, 16,0,2, 20,0,2, grass, grass, false);

        //Line 3
        this.fillWithBlocks(world, box, 0,0,3, 3,0,3, grass, grass, false);
        this.fillWithBlocks(world, box, 4,0,2, 16,0,3, sand, sand, false);
        this.fillWithBlocks(world, box, 17,0,3, 20,0,3, grass, grass, false);

        //Line 4
        this.fillWithBlocks(world, box, 0,0,4, 2,0,4, grass, grass, false);
        this.fillWithBlocks(world, box, 3,0,4, 17,0,4, sand, sand, false);
        this.fillWithBlocks(world, box, 18,0,4, 20,0,4, grass, grass, false);

        //Lines 5, 6
        this.fillWithBlocks(world, box, 0,0,5, 1,0,6, grass, grass, false);
        this.fillWithBlocks(world, box, 2,0,5, 18,0,6, sand, sand, false);
        this.fillWithBlocks(world, box, 19,0,5, 20,0,6, grass, grass, false);

        //Lines 7, 13
        this.fillWithBlocks(world, box, 0,0,7, 0,0,13, grass, grass, false);
        this.fillWithBlocks(world, box, 1,0,7, 19,0,13, sand, sand, false);
        this.fillWithBlocks(world, box, 20,0,7, 20,0,13, grass, grass, false);

        //Lines 14, 15
        this.fillWithBlocks(world, box, 0,0,14, 1,0,15, grass, grass, false);
        this.fillWithBlocks(world, box, 2,0,14, 18,0,15, sand, sand, false);
        this.fillWithBlocks(world, box, 19,0,14, 20,0,15, grass, grass, false);

        //Line 16
        this.fillWithBlocks(world, box, 0,0,16, 2,0,16, grass, grass, false);
        this.fillWithBlocks(world, box, 3,0,16, 17,0,16, sand, sand, false);
        this.fillWithBlocks(world, box, 18,0,16, 20,0,16, grass, grass, false);

        //Line 17
        this.fillWithBlocks(world, box, 0,0,17, 3,0,17, grass, grass, false);
        this.fillWithBlocks(world, box, 4,0,17, 16,0,17, sand, sand, false);
        this.fillWithBlocks(world, box, 17,0,17, 20,0,17, grass, grass, false);

        //Line 18
        this.fillWithBlocks(world, box, 0,0,18, 4,0,18, grass, grass, false);
        this.fillWithBlocks(world, box, 5,0,18, 15,0,18, sand, sand, false);
        this.fillWithBlocks(world, box, 16,0,18, 20,0,18, grass, grass, false);

        //Line 19
        this.fillWithBlocks(world, box, 0,0,19, 6,0,19, grass, grass, false);
        this.fillWithBlocks(world, box, 7,0,19, 13,0,19, sand, sand, false);
        this.fillWithBlocks(world, box, 14,0,19, 20,0,19, grass, grass, false);

        //Line 20
        this.fillWithBlocks(world, box, 0,0,20, 20,0,20, grass, grass, false);


        //Y 1-5 Z 0-2
        this.fillWithBlocks(world, box, 0,1,0, 20,5,2, air, air, false);

        //Y 1-5 Z 3
        this.fillWithBlocks(world, box, 0,1,3, 7,5,3, air, air, false);
        this.fillWithMetadataBlocks(world, box, 8,1,3, 8,5,3, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 9,1,3,9,5,3, wool, wool, false);
        this.fillWithMetadataBlocks(world, box, 10,1,3, 10,5,3, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 11,1,3,11,5,3, wool, wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,3, 12,5,3, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 13,1,3, 20,5,3, air, air, false);

        //Y 1-5 Z 4
        this.fillWithBlocks(world, box, 0,1,4, 5,5,4, air, air, false);
        this.fillWithMetadataBlocks(world, box, 6,1,4, 6,5,4, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 7,1,4, 7,5,4, wool, wool, false);
        this.fillWithBlocks(world, box, 8,1,4, 12,5,4, air, air, false);
        this.fillWithBlocks(world, box, 13,1,4, 13,5,4, wool, wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,4, 14,5,4, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 15,1,4, 15,5,4, air, air, false);

        //Y 1-5 Z 5
        this.fillWithBlocks(world, box, 0,1,5, 4,5,5, air, air, false);
        this.fillWithBlocks(world, box, 5,1,5, 5,5,5, wool, wool, false);
        this.fillWithBlocks(world, box, 6,1,5, 14,5,5, air, air, false);
        this.fillWithBlocks(world, box, 15,1,5, 15,5,5, wool, wool, false);
        this.fillWithBlocks(world, box, 16,1,5, 20,5,5, air, air, false);

        //Y 1-5 Z 6
        this.fillWithBlocks(world, box, 0,1,6, 3,5,6, air, air, false);
        this.fillWithMetadataBlocks(world, box, 4,1,6, 4,5,6, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 5,1,6, 15,5,6, air, air, false);
        this.fillWithMetadataBlocks(world, box, 16,1,6, 16,5,6, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 17,1,6, 20,5,6, air, air, false);

        //Y 1-5 Z 7
        this.fillWithBlocks(world, box, 0,1,7, 3,5,7, air, air, false);
        this.fillWithBlocks(world, box, 4,1,7, 4,5,7, wool, wool, false);
        this.fillWithBlocks(world, box, 5,1,7, 15,5,7, air, air, false);
        this.fillWithBlocks(world, box, 16,1,7, 16,5,7, wool, wool, false);
        this.fillWithBlocks(world, box, 17,1,7, 20,5,7, air, air, false);

        //Y 1-5 Z 8
        this.fillWithBlocks(world, box, 0,1,8, 2,5,8, air, air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,8, 3,5,8, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 4,1,8, 16,5,8, air, air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,8, 17,5,8, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 18,1,8, 20,5,8, air, air, false);

        //Y 1-5 Z 9
        this.fillWithBlocks(world, box, 0,1,9, 2,5,9, air, air, false);
        this.fillWithBlocks(world, box, 3,1,9, 3,5,9, wool, wool, false);
        this.fillWithBlocks(world, box, 4,1,9, 16,5,9, air, air, false);
        this.fillWithBlocks(world, box, 17,1,9, 17,5,9, wool, wool, false);
        this.fillWithBlocks(world, box, 18,1,9, 20,1,9, air, air, false);

        //Y 1-5 Z 10
        this.fillWithBlocks(world, box, 0,1,10, 2,5,10, air, air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,10, 3,5,10, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 4,1,10, 16,5,10, air, air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,10, 17,5,10, wool,14, wool,17, false);
        this.fillWithBlocks(world, box, 18,1,10, 20,5,10, air, air, false);

        //Y 1-5 Z 11
        this.fillWithBlocks(world, box, 0,1,11, 2,1,11, air, air, false);
        this.fillWithBlocks(world, box, 3,1,11, 3,5,11, wool, wool, false);
        this.fillWithBlocks(world, box, 4,1,11, 16,5,11, air, air, false);
        this.fillWithBlocks(world, box, 17,1,11, 17,5,11, wool, wool, false);
        this.fillWithBlocks(world, box, 18,1,11, 20,5,11, air, air, false);

        //Y 1-5 Z 12
        this.fillWithBlocks(world, box, 0,1,12, 2,5,12, air, air, false);
        this.fillWithMetadataBlocks(world, box, 3,1,12, 3,5,12, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 4,1,12, 16,5,12, air, air, false);
        this.fillWithMetadataBlocks(world, box, 17,1,12, 17,5,12, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 18,1,12, 20,5,12, air, air, false);

        //Y 1-5 Z 13
        this.fillWithBlocks(world, box, 0,1,13, 3,5,13, air, air, false);
        this.fillWithBlocks(world, box, 4,1,13, 4,5,13, wool, wool, false);
        this.fillWithBlocks(world, box, 5,1,13, 15,5,13, air, air, false);
        this.fillWithBlocks(world, box, 16,1,13, 16,5,13, wool, wool, false);
        this.fillWithBlocks(world, box, 17,1,13, 20,5,13, air, air, false);

        //Y 1-5 Z 14
        this.fillWithBlocks(world, box, 0,1,14, 3,5,14, air, air, false);
        this.fillWithMetadataBlocks(world, box, 4,1,14, 4,5,14, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 5,1,14, 15,5,14, air, air, false);
        this.fillWithMetadataBlocks(world, box, 16,1,14, 16,5,14, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 17,1,14, 20,5,14, air, air, false);

        //Y 1-5 Z 15
        this.fillWithBlocks(world, box, 0,1,15, 4,5,15, air, air, false);
        this.fillWithBlocks(world, box, 5,1,15, 5,5,15, wool, wool, false);
        this.fillWithBlocks(world, box, 6,1,15, 14,5,15, air, air, false);
        this.fillWithBlocks(world, box, 15,1,15, 15,5,15, wool, wool, false);
        this.fillWithBlocks(world, box, 16,1,15, 20,5,15, air, air, false);

        //Y 1-5 Z 16
        this.fillWithBlocks(world, box, 0,1,16, 5,5,16, air, air, false);
        this.fillWithMetadataBlocks(world, box, 6,1,16, 6,5,16, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 7,1,16, 7,5,16, wool, wool, false);
        this.fillWithBlocks(world, box, 8,1,16, 12,5,16, air, air, false);
        this.fillWithBlocks(world, box, 13,1,16, 13,5,16, wool, wool, false);
        this.fillWithMetadataBlocks(world, box, 14,1,16, 14,5,16, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 15,1,16, 20,5,16, air, air, false);

        //Y 1-5 Z 17
        this.fillWithBlocks(world, box, 0,1,17, 7,5,17, air, air, false);
        this.fillWithMetadataBlocks(world, box, 8,1,17, 8,5,17, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 9,1,17, 9,5,17, wool, wool, false);
        //Doorway
        this.fillWithBlocks(world, box, 10,1,17, 10,2,17, air, air, false);
        this.fillWithMetadataBlocks(world, box, 10,3,17, 10,5,17, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 11,1,17, 11,5,17, wool, wool, false);
        this.fillWithMetadataBlocks(world, box, 12,1,17, 12,5,17, wool,14, wool,14, false);
        this.fillWithBlocks(world, box, 13,1,17, 20,5,17, air, air, false);

        //Y 1-5 Z 18-20
        this.fillWithBlocks(world, box, 0,1,18, 20,5,20, air, air, false);



        /*this.fillWithMetadataBlocks(world, box, 0,0,0, 0,10,0, Blocks.wool,14, Blocks.wool,14, false);
        this.fillWithBlocks(world, box, 1,0,1, 1,10,1, Blocks.wool, Blocks.wool, false);*/

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
