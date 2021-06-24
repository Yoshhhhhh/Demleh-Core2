package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.demlehcore.item.ItemXPBerry;
import net.mcreator.demlehcore.block.BlockXPBushStage3;
import net.mcreator.demlehcore.block.BlockXPBushStage0;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureXPBushOnRightClick extends ElementsDemlehcoreMod.ModElement {
	public ProcedureXPBushOnRightClick(ElementsDemlehcoreMod instance) {
		super(instance, 172);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure XPBushOnRightClick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure XPBushOnRightClick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure XPBushOnRightClick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure XPBushOnRightClick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double randomNumber = 0;
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockXPBushStage3.block.getDefaultState().getBlock())) {
			if ((!(world.isRemote))) {
				randomNumber = (double) Math.random();
				if (((randomNumber) >= 0.66)) {
					for (int index0 = 0; index0 < (int) (3); index0++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, (x + 0.05), (y + 0.05), (z + 0.05),
									new ItemStack(ItemXPBerry.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				} else if (((randomNumber) >= 0.33)) {
					for (int index1 = 0; index1 < (int) (2); index1++) {
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, (x + 0.05), (y + 0.05), (z + 0.05),
									new ItemStack(ItemXPBerry.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				} else {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, (x + 0.05), (y + 0.05), (z + 0.05),
								new ItemStack(ItemXPBerry.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockXPBushStage0.block.getDefaultState();
					IBlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
						IProperty _property = entry.getKey();
						if (_bs.getPropertyKeys().contains(_property))
							_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockXPBushStage3.block.getDefaultState()
				.getBlock())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, (x + 0.05), (y + 0.05), (z + 0.05), new ItemStack(ItemXPBerry.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), SoundCategory.NEUTRAL,
					(float) 1, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockXPBushStage0.block.getDefaultState();
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
