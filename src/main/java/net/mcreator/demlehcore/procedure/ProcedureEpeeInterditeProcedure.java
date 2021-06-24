package net.mcreator.demlehcore.procedure;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Random;
import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureEpeeInterditeProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureEpeeInterditeProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 209);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure EpeeInterditeProcedure!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 10, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
	}
}
