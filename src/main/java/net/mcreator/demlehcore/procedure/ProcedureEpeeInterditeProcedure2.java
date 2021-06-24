package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureEpeeInterditeProcedure2 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureEpeeInterditeProcedure2(ElementsDemlehcoreMod instance) {
		super(instance, 213);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EpeeInterditeProcedure2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EpeeInterditeProcedure2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EpeeInterditeProcedure2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EpeeInterditeProcedure2!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 2, true);
		}
	}
}
