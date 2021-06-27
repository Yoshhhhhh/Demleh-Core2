package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.demlehcore.block.BlockCaveBlock;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureCaveBlockProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureCaveBlockProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 247);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CaveBlockProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CaveBlockProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CaveBlockProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CaveBlockProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCaveBlock.block.getDefaultState(), 3);
	}
}
