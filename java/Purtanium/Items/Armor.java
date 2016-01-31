package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.Blocks.PurtaniumBlocks;
import Purtanium.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Armor extends ItemArmor
{
	private String [] armorTypes = new String [] {"purtaniumhelmet", "purtaniumchestplate", "purtaniumleggings", "purtaniumboots"};
	
	public Armor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{			
		if(stack.getItem().equals(PurtaniumItems.Helmet) 
				||stack.getItem().equals(PurtaniumItems.ChestPlate) 
				|| stack.getItem().equals(PurtaniumItems.Boots))
		{
			return Strings.MODID + ":textures/models/armor/layer_1.png";
		}
		else if(stack.getItem().equals(PurtaniumItems.Leggings))
		{
			return Strings.MODID + ":textures/models/armor/layer_2.png";
		}		
		else 
			return null;
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) 
	{
		super.onUpdate(stack, world, entity, p_77663_4_, p_77663_5_);
		EntityPlayer player = (EntityPlayer)entity;
		
		if(player.getCurrentArmor(0)!= null 
				&& player.getCurrentArmor(1)!= null 
				&& player.getCurrentArmor(2)!= null 
				&& player.getCurrentArmor(3)!= null)
		{
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chestplate = player.getCurrentArmor(2);
			ItemStack leggings = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			
			if(helmet.getItem() == PurtaniumItems.Helmet
					&& chestplate.getItem() == PurtaniumItems.ChestPlate
					&& leggings.getItem() == PurtaniumItems.Leggings
					&& boots.getItem() == PurtaniumItems.Boots)
			{
				player.capabilities.allowFlying = true;
				player.capabilities.setPlayerWalkSpeed(0.2F);
				player.capabilities.setFlySpeed(0.1F);
			}
		}
		else
		{
			player.capabilities.allowFlying = false;
			player.capabilities.setPlayerWalkSpeed(0.1F);
			player.capabilities.setFlySpeed(0.05F);
		}			
	}
}