package Purtanium.Blocks;

import Purtanium.Items.Ingot;
import Purtanium.Items.PurtaniumItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class PurtaniumBlocks 
{
	public static void mainRegistry()
	{
		initBlocks();
		registerBlocks();
	}
	
	public static Block Ore;
	public static Item Ingot;
    public static Block Block;
    public static Block Door;
    public static Block Plate;
    public static Hopper Hopper;
    public static Anvil Anvil;
    public static Block Bars;
    public static Block Cauldron;

	private static void initBlocks() 
	{
		Ore = new Ore(Material.rock);
		Ingot = new Ingot();
		
		Anvil = new Anvil();
    	Bars = new Pane();
    	Block = new PurtaniumBlock(Material.iron);
    	Cauldron = new Cauldron();
    	Door = new Door(Material.iron);
    	Hopper = new Hopper();
    	Plate = new Plate("block",Material.iron, 200);		
	}

	private static void registerBlocks() 
	{
    	GameRegistry.registerBlock(Ore, "purtaniumore");
		GameRegistry.registerItem(Ingot, "purtaniumingot");
		
    	GameRegistry.registerBlock(Block, "purtaniumblock");
    	GameRegistry.registerBlock(Hopper, "purtaniumhopper");
    	GameRegistry.registerBlock(Plate, "purtaniumplate");
    	GameRegistry.registerBlock(Bars, "purtaniumbars");
    	GameRegistry.registerBlock(Door, "purtaniumdoor");
    	GameRegistry.registerBlock(Anvil, "purtaniumanvil");
    	GameRegistry.registerBlock(Cauldron, "purtaniumcauldron");
		
    	GameRegistry.addRecipe(new ItemStack(Block),new Object[]{
    		"AA ",
    		"AA ",
    		'A',Ingot});
    	GameRegistry.addRecipe(new ItemStack(Hopper),new Object[]{
    		"A A",
    		"ABA",
    		" A ",
    		'A',Ingot, 'B', Blocks.chest});
    	GameRegistry.addRecipe(new ItemStack(Bars),new Object[]{
    		"AAA",
    		"AAA",
    		'A',Ingot});
    	GameRegistry.addRecipe(new ItemStack(Anvil),new Object[]{
    		"AAA",
    		" B ",
    		"BBB",
    		'A',Block, 'B', Ingot});
    	GameRegistry.addRecipe(new ItemStack(Cauldron),new Object[]{
    		"A A",
    		"A A",
    		"AAA",
    		'A',Ingot});
    	GameRegistry.addRecipe(new ItemStack(Plate),new Object[]{
    		"AA",
    		'A',Ingot});    	
	}	
}