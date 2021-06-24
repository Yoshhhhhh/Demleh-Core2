package net.mcreator.demlehcore.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Random;
import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureEpeeInterditeProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureEpeeInterditeProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 209);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EpeeInterditeProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure EpeeInterditeProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 10, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 60);
	}
}
