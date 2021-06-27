package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.demlehcore.block.BlockCaveblock2;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureCaveBlockProcedure2 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureCaveBlockProcedure2(ElementsDemlehcoreMod instance) {
		super(instance, 248);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CaveBlockProcedure2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CaveBlockProcedure2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CaveBlockProcedure2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CaveBlockProcedure2!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCaveblock2.block.getDefaultState(), 3);
	}
}
