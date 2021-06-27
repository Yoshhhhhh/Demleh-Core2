package net.mcreator.demlehcore.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureFauxInterditeProcedure5 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureFauxInterditeProcedure5(ElementsDemlehcoreMod instance) {
		super(instance, 238);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FauxInterditeProcedure5!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure FauxInterditeProcedure5!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHealth() : -1) > 7)) {
			if (sourceentity instanceof EntityLivingBase)
				((EntityLivingBase) sourceentity).setHealth((float) 7);
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) 5);
		if (sourceentity instanceof EntityPlayer)
			((EntityPlayer) sourceentity).inventory.clearMatchingItems(
					((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem(),
					-1, (int) 1, null);
	}
}
