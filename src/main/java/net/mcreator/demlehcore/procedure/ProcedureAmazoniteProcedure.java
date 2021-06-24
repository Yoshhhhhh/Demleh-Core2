package net.mcreator.demlehcore.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureAmazoniteProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureAmazoniteProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 154);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmazoniteProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 10);
	}
}
