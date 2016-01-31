/**
 * 
 */
package Purtanium.Food;

import Purtanium.Blocks.PurtaniumBlocks;
import Purtanium.Items.PurtaniumItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Kris
 *
 */
public class PurtaniumFoods 
{
	public static void mainRegistry()
	{
		initFoods();
		registerFoods();
	}
	
	public static ItemFood chocolate;
	public static ItemFood whiteChocolate;
	public static ItemFood chocolateIceCream;
	public static ItemFood candcIceCream;
	public static ItemFood omelette;
	public static ItemFood meatOmelette;
	public static ItemFood friedEgg;
	
	private static void initFoods()
	{		
		//region potion types
		/*new PotionEffect(Potion.blindness.id, 1200, 1),
		new PotionEffect(Potion.confusion.id, 1200, 1),
		new PotionEffect(Potion.damageBoost.id, 1200, 1),
		new PotionEffect(Potion.digSlowdown.id, 1200, 1),
		new PotionEffect(Potion.digSpeed.id, 1200, 1),
		new PotionEffect(Potion.fireResistance.id, 1200, 1),
		new PotionEffect(Potion.harm.id, 1200, 1),
		new PotionEffect(Potion.heal.id, 1200, 1),
		new PotionEffect(Potion.hunger.id, 1200, 1),
		new PotionEffect(Potion.invisibility.id, 1200, 1),
		new PotionEffect(Potion.jump.id, 600, 0),
		new PotionEffect(Potion.moveSlowdown.id, 1200, 1),
		new PotionEffect(Potion.moveSpeed.id, 1200, 1),
		new PotionEffect(Potion.nightVision.id, 1200, 1),
		new PotionEffect(Potion.poison.id, 1200, 1),
		new PotionEffect(Potion.regeneration.id, 1200, 1),
		new PotionEffect(Potion.resistance.id, 1200, 1),
		new PotionEffect(Potion.waterBreathing.id, 200, 1),
		new PotionEffect(Potion.weakness.id, 1200, 1),
		new PotionEffect(Potion.wither.id, 1200, 1)
		
		PotionEffect(potionId,duration,amplifier)
		*/			
		//endregion
		
		chocolate = new PurtaniumFood("chocolate", 2, 0.2f, false,
				new PotionEffect(Potion.moveSpeed.id, 1200, 1))
			    .setAlwaysEdible();
		whiteChocolate = new PurtaniumFood("whitechocolate", 2, 0.2f, false,
				new PotionEffect(Potion.moveSpeed.id, 1200, 1))
			    .setAlwaysEdible();
		chocolateIceCream = new PurtaniumFood("chocolateicecream", 2, 0.2f, false,
				new PotionEffect(Potion.moveSpeed.id, 1200, 1),
				new PotionEffect(Potion.jump.id, 600, 0))
			    .setAlwaysEdible();
		candcIceCream = new PurtaniumFood("candcicecream", 2, 0.2f, false,
				new PotionEffect(Potion.moveSpeed.id, 1200, 1),
				new PotionEffect(Potion.jump.id, 600, 0))
			    .setAlwaysEdible();
		omelette = new PurtaniumFood("omelette", 2, 1.6f, false,
				new PotionEffect(Potion.moveSlowdown.id, 1200, 1),
				new PotionEffect(Potion.regeneration.id, 200, 1))
			    .setAlwaysEdible();
		meatOmelette = new PurtaniumFood("meatomelette", 2, 2.0f, false,
				new PotionEffect(Potion.moveSlowdown.id, 1200, 1),
				new PotionEffect(Potion.regeneration.id, 200, 1))
			    .setAlwaysEdible();
		friedEgg = new PurtaniumFood("friedegg", 2, 0.6f, false)			
			    .setAlwaysEdible();
		
	}
	
	private static void registerFoods()
	{
		GameRegistry.registerItem(chocolate, "purtanium_chocolate");
		GameRegistry.registerItem(whiteChocolate, "purtanium_whitechocolate");
		GameRegistry.registerItem(chocolateIceCream, "purtanium_chocolateIceCream");
		GameRegistry.registerItem(candcIceCream, "purtanium_candcIceCream");
		GameRegistry.registerItem(omelette, "purtanium_omelette");
		GameRegistry.registerItem(meatOmelette, "purtanium_meatomelette");
		GameRegistry.registerItem(friedEgg, "purtanium_friedEgg");
		
		//Chocolate
		GameRegistry.addRecipe(new ItemStack(chocolate,4),new Object[]{
    		"AAA",
    		"CBC",
    		'A', new ItemStack(Items.dye, 1, 3),'B', Items.milk_bucket, 'C', Items.sugar});
		GameRegistry.addRecipe(new ItemStack(chocolate,8),new Object[]{
    		"AAA",
    		"CBC",
    		'A', new ItemStack(Items.dye, 1, 3),'B', PurtaniumItems.BucketMilk, 'C', Items.sugar});
		//White Chocolate
		GameRegistry.addRecipe(new ItemStack(chocolate,4),new Object[]{
    		"AAD",
    		"CBC",
    		'A', new ItemStack(Items.dye, 1, 3),'B', Items.milk_bucket, 'C', Items.sugar, 'D', new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(chocolate,8),new Object[]{
			"AAD",
    		"CBC",
    		'A', new ItemStack(Items.dye, 1, 3), 'B', PurtaniumItems.BucketMilk, 'C', Items.sugar, 'D', new ItemStack(Items.dye, 1, 15)});
		//Chocolate Ice cream
		GameRegistry.addRecipe(new ItemStack(chocolateIceCream,4),new Object[]{
    		"BAB",
    		"BCB",
    		"BDB", 
    		'A', chocolate,'B', Items.snowball, 'C', Items.milk_bucket, 'D', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(chocolateIceCream,8),new Object[]{
    		"BAB",
    		"BCB",
    		"BDB", 
    		'A', chocolate,'B', Items.snowball, 'C', PurtaniumItems.BucketMilk, 'D', Items.bowl});
		//Cookies and Cream Ice cream
		GameRegistry.addRecipe(new ItemStack(candcIceCream,4),new Object[]{
    		"BAB",
    		"BCB",
    		"BDB", 
    		'A', Items.cookie,'B', Items.snowball, 'C', Items.milk_bucket, 'D', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(candcIceCream,8),new Object[]{
    		"BAB",
    		"BCB",
    		"BDB", 
    		'A', Items.cookie,'B', Items.snowball, 'C', PurtaniumItems.BucketMilk, 'D', Items.bowl});
		//Meat Omelette
		GameRegistry.addRecipe(new ItemStack(meatOmelette),new Object[]{
    		"PMP",
    		"AAA",
    		'A', Items.egg, 'M', Items.cooked_beef, 'P', Items.potato});
		//Omelette
		GameRegistry.addRecipe(new ItemStack(omelette),new Object[]{
    		"AAA",
    		'A', Items.egg});
		//Fried Egg
		GameRegistry.addSmelting(new ItemStack(friedEgg), new ItemStack(Items.egg), 0.2F);		
	}
}