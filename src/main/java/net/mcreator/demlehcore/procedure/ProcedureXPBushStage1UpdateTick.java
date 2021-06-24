package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.demlehcore.block.BlockXPBushStage3;
import net.mcreator.demlehcore.block.BlockXPBushStage2;
import net.mcreator.demlehcore.block.BlockXPBushStage1;
import net.mcreator.demlehcore.block.BlockXPBushStage0;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureXPBushStage1UpdateTick extends ElementsDemlehcoreMod.ModElement {
	public ProcedureXPBushStage1UpdateTick(ElementsDemlehcoreMod instance) {
		super(instance, 184);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure XPBushStage1UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure XPBushStage1UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure XPBushStage1UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure XPBushStage1UpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			IBlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().setDouble("nwtgGrothTimer", ((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "nwtgGrothTimer")) + 1));
			world.notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "nwtgGrothTimer")) >= 300)) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockXPBushStage0.block.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockXPBushStage1.block.getDefaultState();
					IBlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
						IProperty _property = entry.getKey();
						if (_bs.getPropertyKeys().contains(_property))
							_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockXPBushStage1.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockXPBushStage2.block.getDefaultState();
					IBlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
						IProperty _property = entry.getKey();
						if (_bs.getPropertyKeys().contains(_property))
							_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockXPBushStage2.block.getDefaultState()
					.getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockXPBushStage3.block.getDefaultState();
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
	}
}
