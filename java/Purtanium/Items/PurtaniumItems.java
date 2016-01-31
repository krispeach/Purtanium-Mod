package Purtanium.Items;

import java.util.BitSet;
import java.util.Set;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryNamespaced;
import net.minecraftforge.common.util.EnumHelper;
import Purtanium.Purtanium;
import Purtanium.Blocks.PurtaniumBlocks;
import Purtanium.lib.Strings;

public class PurtaniumItems 
{	
	public static final RegistryNamespaced itemRegistry = GameData.getItemRegistry();
	public static final RegistryNamespaced blockRegistry = GameData.getBlockRegistry();
	
	public static ArmorMaterial purtaniumArmor = EnumHelper.addArmorMaterial("Purtanium", 40, new int[]{10,15,10,5}, 30);
	public static ToolMaterial purtaniumTool = EnumHelper.addToolMaterial("Purtanium", 3, 2000, 10.0F, 4.0F, 30);
	
	public static void mainRegistry()
	{
		initItems();
		registerItems();
	}
		
	//region Properties
	public static Item Axe;
	public static Item Boots;
	public static Item ChestPlate;
	public static Item Helmet;
	public static Item Hoe;
	public static Item Leggings;
	public static Item PickAxe;
	public static Item Shovel;
	public static Item Sword;
	public static Item Shears;
	public static Item HorseArmor;
	public static Item Door;
	public static Item Bucket;
	public static Item BucketWater;
	public static Item BucketLava;
	public static Item BucketMilk;
	public static Item Cauldron;
	public static Item Anvil;

	//endregion Properties
	
	private static void initItems() 
	{		
		//region Tool Initialization
    	Axe = new Axe();
    	Hoe = new Hoe();
    	PickAxe = new PickAxe();
    	Shovel = new Shovel();
    	Sword = new Sword();
    	Shears = new Shears();
    	//endregion Tool Initialization
    	
    	//region Other Items Initialization
    	Bucket = new Bucket(Blocks.air)
    		.setUnlocalizedName("purtaniumbucket")
    		.setMaxStackSize(16)
    		.setTextureName(Strings.MODID + ":bucket_empty");
    	BucketWater = new Bucket(Blocks.flowing_water)
    		.setUnlocalizedName("purtaniumbucketwater")
    		.setContainerItem(Bucket)
    		.setTextureName(Strings.MODID + ":bucket_water");
    	BucketLava = new Bucket(Blocks.flowing_lava)
    		.setUnlocalizedName("purtaniumbucketlava")
    		.setContainerItem(Bucket)
    		.setTextureName(Strings.MODID + ":bucket_lava");
    	BucketMilk = new BucketMilk()
    		.setContainerItem(Bucket); 	
    	Door = new Door(Material.iron);
    	Anvil = new Anvil()
    		.setUnlocalizedName("purtaniumanvil");
    	Cauldron = new ItemReed(PurtaniumBlocks.Cauldron)
	    	.setUnlocalizedName("purtaniumcauldron")
			.setTextureName(Strings.MODID + ":cauldron")
			.setCreativeTab(Purtanium.tabPurtanium);
    	//endregion Other Items Initialization
    	
    	//region Armor Initialization
    	int armorId = Purtanium.proxy.addArmor("purtanium");
    	
    	Helmet = new Armor(purtaniumArmor, armorId,0)
			.setUnlocalizedName("purtaniumhelmet")
			.setTextureName(Strings.MODID + ":helmet")
			.setCreativeTab(Purtanium.tabPurtanium);
    	ChestPlate = new Armor(purtaniumArmor, armorId,1)
			.setUnlocalizedName("purtaniumchestplate")
			.setTextureName(Strings.MODID + ":chestplate")
			.setCreativeTab(Purtanium.tabPurtanium);
    	Leggings = new Armor(purtaniumArmor, armorId,2)
			.setUnlocalizedName("purtaniumleggings")
			.setTextureName(Strings.MODID + ":leggings")
			.setCreativeTab(Purtanium.tabPurtanium);
    	Boots = new Armor(purtaniumArmor, armorId,3)
			.setUnlocalizedName("purtaniumboots")
			.setTextureName(Strings.MODID + ":boots")
			.setCreativeTab(Purtanium.tabPurtanium);
    	//endregion Armor Initialization		
	}
	
	private static void registerItems() 
	{    	
		//region Tool Registration
    	GameRegistry.registerItem(Axe, "purtaniumaxe");
    	GameRegistry.registerItem(Hoe, "purtaniumhoe");
    	GameRegistry.registerItem(PickAxe, "purtaniumpickaxe");
    	GameRegistry.registerItem(Shovel, "purtaniumshovel");
    	GameRegistry.registerItem(Sword, "purtaniumsword");
    	GameRegistry.registerItem(Shears, "purtaniumshears");
    	//endregion Tool Registration
    	
    	//region Other Tools Registration    	
    	GameRegistry.registerItem(Bucket, "purtaniumbucket");
		GameRegistry.registerItem(BucketWater, "purtaniumbucketwater");
		GameRegistry.registerItem(BucketLava, "purtaniumbucketlava");
		GameRegistry.registerItem(BucketMilk, "purtaniumbucketmilk"); 	
		GameRegistry.registerItem(Door, "purtaniumdooritem");
		GameRegistry.registerItem(Cauldron, "purtaniumcauldronitem");
		/*
		Block door = (Block)blockRegistry.getObject(Strings.MODID +":purtaniumdoor");
		Block anvil = (Block)blockRegistry.getObject(Strings.MODID +":purtaniumanvil");
		Block cauldron = (Block)blockRegistry.getObject(Strings.MODID +":purtaniumcauldron");
		
		itemRegistry.addObject(Block.getIdFromBlock(door), Strings.MODID +":purtaniumdoor", purtaniumDoor);
		itemRegistry.addObject(Block.getIdFromBlock(anvil), Strings.MODID +":purtaniumanvil", purtaniumAnvil);
		itemRegistry.addObject(Block.getIdFromBlock(cauldron), Strings.MODID +":purtaniumcauldron", purtaniumCauldron);
		
		//GameRegistry.registerItem(purtaniumAnvil, "purtaniumanvil");
		
    	//endregion Other Tools Registration
    	*/
    	//region Armor Registration
    	GameRegistry.registerItem(Helmet, "purtaniumhelmet");
    	GameRegistry.registerItem(ChestPlate, "purtaniumchestplate");
    	GameRegistry.registerItem(Leggings, "purtaniumleggings");
    	GameRegistry.registerItem(Boots, "purtaniumboots");
    	//endregion Armor Registration

    	Item Ingot = (Item)Item.itemRegistry.getObject(Strings.MODID +":purtaniumingot");
    	
    	//region Tool Recipes
    	GameRegistry.addRecipe(new ItemStack(Axe), new Object[]{
        	"AA",
        	"AB",
        	" B",
        	'A', Ingot, 'B', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(Hoe), new Object[]{
        	"AA ",
        	" B ",
        	" B ",
        	'A', Ingot, 'B', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(PickAxe), new Object[]{
        	"AAA",
        	" B ",
        	" B ",
        	'A', Ingot, 'B', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(Shovel), new Object[]{
        	"A",
        	"B",
        	"B",
        	'A', Ingot, 'B', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(Sword), new Object[]{
	    	"A",
	    	"A",
	    	"B",
	    	'A', Ingot, 'B', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(Shears),new Object[]{
    		" A ",
    		"A  ",
    		'A',Ingot});
    	//endregion Tool Recipes
    	
    	//region Other Tool Recipes
    	GameRegistry.addRecipe(new ItemStack(Bucket),new Object[]{
    		"A A",
    		" A ",
    		'A',Ingot});
    	GameRegistry.addRecipe(new ItemStack(Door),new Object[]{
    		"AA ",
    		"AA ",
    		"AA ",
    		'A',Ingot});
    	//endregion Tool Recipes
    	
    	//region Armor Recipe
    	GameRegistry.addRecipe(new ItemStack(Helmet), new Object[]{
        	"AAA",
        	"A A",
        	'A', Ingot});
    	GameRegistry.addRecipe(new ItemStack(ChestPlate), new Object[]{
        	"A A",
        	"AAA",
        	"AAA",
        	'A', Ingot});
    	GameRegistry.addRecipe(new ItemStack(Leggings), new Object[]{
        	"AAA",
        	"A A",
        	"A A",
        	'A', Ingot});
    	GameRegistry.addRecipe(new ItemStack(Boots), new Object[]{
        	"A A",
        	"A A",
        	'A', Ingot});
    	//endregion Armor Recipe
    	
    	GameRegistry.addSmelting(PurtaniumBlocks.Ore, new ItemStack(Ingot), 0.2F);		
	}
}