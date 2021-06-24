package net.mcreator.demlehcore.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureMagmaAppleFoodEaten extends ElementsDemlehcoreMod.ModElement {
	public ProcedureMagmaAppleFoodEaten(ElementsDemlehcoreMod instance) {
		super(instance, 123);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MagmaAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 1200, (int) 1));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 600, (int) 0));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 600, (int) 1));
	}
}
