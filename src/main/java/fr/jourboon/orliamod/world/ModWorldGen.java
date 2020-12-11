package fr.jourboon.orliamod.world;

import java.util.Random;

import fr.jourboon.orliamod.init.BlockInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) { 
		if(world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(BlockInit.NECROTIQUE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 15, random.nextInt(4) + 2, 2);
		generateOre(BlockInit.ANGELITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 15, random.nextInt(4) + 2, 2);
		generateOre(BlockInit.STAR_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 23, random.nextInt(3) + 1, 2);
		generateOre(BlockInit.ONYX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 35, random.nextInt(6) + 4, 5);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
