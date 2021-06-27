package net.mcreator.demlehcore.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemFragment5;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureFauxInterditeProcedure4 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureFauxInterditeProcedure4(ElementsDemlehcoreMod instance) {
		super(instance, 236);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FauxInterditeProcedure4!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure FauxInterditeProcedure4!");
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
		if (sourceentity instanceof EntityLivingBase) {
			ItemStack _setstack = new ItemStack(ItemFragment5.block, (int) (1));
			_setstack.setCount(2);
			((EntityLivingBase) sourceentity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
			if (sourceentity instanceof EntityPlayerMP)
				((EntityPlayerMP) sourceentity).inventory.markDirty();
		}
	}
}
