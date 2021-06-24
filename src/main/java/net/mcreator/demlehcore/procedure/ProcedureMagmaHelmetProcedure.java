package net.mcreator.demlehcore.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureMagmaHelmetProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureMagmaHelmetProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 156);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MagmaHelmetProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double random = 0;
		random = (double) Math.random();
		if (((random) >= 0.995)) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 600, (int) 1));
		}
	}
}
