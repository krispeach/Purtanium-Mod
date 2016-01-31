package Purtanium.Entitys;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import Purtanium.Purtanium;

public class PurtaniumEntitys 
{
	public static void mainRegistry()
	{
		registerEntry();
	}
	
	public static void registerEntry()
	{
		createEntity(PurtaniumMob.class, "Purtanium Mob" ,0x600FB6, 0xAF73EE);		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) 
	{
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Purtanium.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.monster, BiomeGenBase.birchForest);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	public static void createEgg(int id, int solidColor, int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
	}
}