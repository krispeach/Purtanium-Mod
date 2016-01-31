package Purtanium.World;

import java.util.Random;

import Purtanium.Blocks.PurtaniumBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenPurtanium implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX*16, chunkZ*16, world);
			break;
		case 0:
			generateSurface( random, chunkX*16, chunkZ*16, world);
			break;
		}
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world)	{}
	
	private void generateSurface(Random random, int chunkX, int chunkZ, World world)
	{
		for(int i = 0; i < 100; i++)
		{
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(64);
			int randPosZ = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(PurtaniumBlocks.Ore, 7).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
}