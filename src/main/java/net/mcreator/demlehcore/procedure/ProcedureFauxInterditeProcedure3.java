package net.mcreator.demlehcore.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemFragment4;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureFauxInterditeProcedure3 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureFauxInterditeProcedure3(ElementsDemlehcoreMod instance) {
		super(instance, 234);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FauxInterditeProcedure3!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure FauxInterditeProcedure3!");
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
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == (ItemStack.EMPTY).getItem())) {
			if (sourceentity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemFragment4.block, (int) (1));
				_setstack.setCount(2);
				((EntityLivingBase) sourceentity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (sourceentity instanceof EntityPlayerMP)
					((EntityPlayerMP) sourceentity).inventory.markDirty();
			}
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
						"Malheureusement, l'utilisation de la faux avec un item dans la main gauche fais en sorte que tu ne re\u00E7ois pas un item n\u00E9cessaire. Pour l'instant, va voir dash, mais pour le futur, ne mets pas d'item dans ta main gauche en utilisant la faux!"),
						(false));
			}
		}
	}
}
