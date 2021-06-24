package net.mcreator.demlehcore.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemBigDynamite;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureBigDynamiteProcedure2 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureBigDynamiteProcedure2(ElementsDemlehcoreMod instance) {
		super(instance, 112);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BigDynamiteProcedure2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("counter1", ((entity.getEntityData().getDouble("counter1")) + 1));
		if ((((entity.getEntityData().getDouble("counter1")) % 1) == 0)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBigDynamite.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
