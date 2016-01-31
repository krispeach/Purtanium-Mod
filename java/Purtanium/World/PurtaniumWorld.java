package Purtanium.World;

import cpw.mods.fml.common.registry.GameRegistry;

public class PurtaniumWorld 
{
	public static void mainRegistry()
	{
		initWorldGen();
	}

	private static void initWorldGen() 
	{
		registerWorldGen(new WorldGenPurtanium(), 1);
	}

	private static void registerWorldGen(WorldGenPurtanium worldGenPurtanium, int weightedProbability) 
	{
		GameRegistry.registerWorldGenerator(worldGenPurtanium, weightedProbability);
	}
}