package Purtanium.Food;
import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class PurtaniumFood extends ItemFood 
{
	private PotionEffect[] effects;
		
	public PurtaniumFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavourite, PotionEffect... effects)
	{
		super(healAmount,saturationModifier,wolvesFavourite);
		this.setUnlocalizedName(unlocalizedName);
	    this.setTextureName(Strings.MODID + ":" + unlocalizedName);
	    this.setCreativeTab(Purtanium.tabPurtanium);
	    this.effects = effects;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	        
	    for (int i = 0; i < effects.length; i ++) {
	        if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
	            player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
	    }
	}
}