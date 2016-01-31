package Purtanium.Entitys;

import Purtanium.lib.Strings;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMod extends RenderLiving 
{
	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/elephant.png");
	
	public RenderMod(ModelBase modelBase, float par2) 
	{
		super(modelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(PurtaniumMob p_110775_1_) 
	{
		return mobTextures;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return getEntityTexture((PurtaniumMob)entity);
	}
}