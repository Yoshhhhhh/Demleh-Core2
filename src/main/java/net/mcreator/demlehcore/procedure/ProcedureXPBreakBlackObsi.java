package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.item.EntityXPOrb;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureXPBreakBlackObsi extends ElementsDemlehcoreMod.ModElement {
	public ProcedureXPBreakBlackObsi(ElementsDemlehcoreMod instance) {
		super(instance, 124);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure XPBreakBlackObsi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure XPBreakBlackObsi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure XPBreakBlackObsi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure XPBreakBlackObsi!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 40));
		}
	}
}
