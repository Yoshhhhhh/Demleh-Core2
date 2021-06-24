package net.mcreator.demlehcore.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemNuggetMineraiInterdit;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureMineraiInterditHurtProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureMineraiInterditHurtProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 215);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MineraiInterditHurtProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem())
				|| (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
