package Purtanium.Entitys;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PurtaniumMob extends EntityAnimal
{
	public PurtaniumMob(World world) 
	{
		super(world);
		setSize(10.0F, 10.0F);
		tasks.addTask(0, new EntityAIWander(this, 0.4D));
		tasks.addTask(0, new EntityAIPanic(this, 0.9D));
		tasks.addTask(0, new EntityAITempt(this, 0.7D, Items.wheat, false));
	}
	
	public boolean isAIEnabled(){ return true;}
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(24.0F);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}	

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) 
	{		
		return new PurtaniumMob(worldObj);
	}
}