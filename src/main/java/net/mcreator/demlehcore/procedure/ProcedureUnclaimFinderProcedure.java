package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemBaseDetector;
import net.mcreator.demlehcore.block.BlockEboniteMachine;
import net.mcreator.demlehcore.block.BlockDemlehMachine;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Random;
import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureUnclaimFinderProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureUnclaimFinderProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 186);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UnclaimFinderProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure UnclaimFinderProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure UnclaimFinderProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure UnclaimFinderProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure UnclaimFinderProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure UnclaimFinderProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean logX = false;
		boolean logY = false;
		boolean logZ = false;
		double coordX = 0;
		double coordY = 0;
		double coordZ = 0;
		double tickvar = 0;
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemBaseDetector.block, (int) (1)).getItem())) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setItemDamage(0);
				}
			}
			coordX = (double) (-20);
			logY = (boolean) (false);
			for (int index0 = 0; index0 < (int) (40); index0++) {
				coordY = (double) (-110);
				for (int index1 = 0; index1 < (int) (125); index1++) {
					coordZ = (double) (-20);
					for (int index2 = 0; index2 < (int) (40); index2++) {
						if (((((world.getBlockState(new BlockPos((int) (x + (coordX)), (int) (y + (coordY)), (int) (z + (coordZ)))))
								.getBlock() == Blocks.CHEST.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x + (coordX)), (int) (y + (coordY)), (int) (z + (coordZ)))))
										.getBlock() == Blocks.CRAFTING_TABLE.getDefaultState().getBlock()))
								|| (((world.getBlockState(new BlockPos((int) (x + (coordX)), (int) (y + (coordY)), (int) (z + (coordZ)))))
										.getBlock() == BlockDemlehMachine.block.getDefaultState().getBlock())
										|| (((world.getBlockState(new BlockPos((int) (x + (coordX)), (int) (y + (coordY)), (int) (z + (coordZ)))))
												.getBlock() == Blocks.FURNACE.getDefaultState().getBlock())
												|| ((world.getBlockState(
														new BlockPos((int) (x + (coordX)), (int) (y + (coordY)), (int) (z + (coordZ)))))
																.getBlock() == BlockEboniteMachine.block.getDefaultState().getBlock()))))) {
							logY = (boolean) (true);
						}
						coordZ = (double) ((coordZ) + 1);
					}
					coordY = (double) ((coordY) + 1);
				}
				coordX = (double) ((coordX) + 1);
			}
			if (((logY) == (true))) {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Potentielle base trouv\u00E9e!"), (true));
				}
			}
		}
	}
}
