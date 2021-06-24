package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.demlehcore.block.BlockBlackObsiPhase3;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureBlackObsiPhase2A3 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureBlackObsiPhase2A3(ElementsDemlehcoreMod instance) {
		super(instance, 118);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BlackObsiPhase2A3!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BlackObsiPhase2A3!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BlackObsiPhase2A3!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BlackObsiPhase2A3!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			IBlockState _bs = BlockBlackObsiPhase3.block.getDefaultState();
			IBlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
				IProperty _property = entry.getKey();
				if (_bs.getPropertyKeys().contains(_property))
					_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
