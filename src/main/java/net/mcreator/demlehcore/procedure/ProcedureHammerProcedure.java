package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureHammerProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureHammerProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 142);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HammerProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HammerProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HammerProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HammerProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HammerProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity.getHorizontalFacing()) == EnumFacing.NORTH) || ((entity.getHorizontalFacing()) == EnumFacing.SOUTH))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
					&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))))) < 3))) {
				world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)),
						world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)));
				(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
						(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
								.getItemDamage()) + 1));
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))))) < 3))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0)));
					(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
							(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
									.getItemDamage()) + 1));
					if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
							&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))).getBlock()
									.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))) < 3))) {
						world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
								new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)),
								world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))), 1);
						world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0)));
						(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
								(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.getItemDamage()) + 1));
						if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)))).getMaterial() == Material.ROCK)
								&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))).getBlock()
										.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))) < 3))) {
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))).getBlock().dropBlockAsItem(world,
									new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)),
									world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))), 1);
							world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0)));
							(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
									.setItemDamage((int) (((((entity instanceof EntityLivingBase)
											? ((EntityLivingBase) entity).getHeldItemMainhand()
											: ItemStack.EMPTY)).getItemDamage()) + 1));
							if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)))).getMaterial() == Material.ROCK)
									&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))).getBlock()
											.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))) < 3))) {
								world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))).getBlock().dropBlockAsItem(world,
										new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)),
										world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))), 1);
								world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0)));
								(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.setItemDamage((int) (((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY)).getItemDamage()) + 1));
								if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))).getBlock()
												.getHarvestLevel(
														world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))))) < 3))) {
									world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
											new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)),
											world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))), 1);
									world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)));
									(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.setItemDamage((int) (((((entity instanceof EntityLivingBase)
													? ((EntityLivingBase) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)).getItemDamage()) + 1));
									if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))))
											.getMaterial() == Material.ROCK)
											&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))).getBlock()
													.getHarvestLevel(
															world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))))) < 3))) {
										world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))).getBlock().dropBlockAsItem(
												world, new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)),
												world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))), 1);
										world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)));
										(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.setItemDamage((int) (((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)).getItemDamage()) + 1));
										if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))))
												.getMaterial() == Material.ROCK)
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))).getBlock()
														.getHarvestLevel(world
																.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))))) < 3))) {
											world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))).getBlock().dropBlockAsItem(
													world, new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)),
													world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))), 1);
											world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)));
											(((entity instanceof EntityLivingBase)
													? ((EntityLivingBase) entity).getHeldItemMainhand()
													: ItemStack.EMPTY))
															.setItemDamage((int) (((((entity instanceof EntityLivingBase)
																	? ((EntityLivingBase) entity).getHeldItemMainhand()
																	: ItemStack.EMPTY)).getItemDamage()) + 1));
										}
									}
								}
							}
						}
					}
				}
			}
		} else if ((((entity.getHorizontalFacing()) == EnumFacing.WEST) || ((entity.getHorizontalFacing()) == EnumFacing.EAST))) {
			if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
					&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))))) < 3))) {
				world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)),
						world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0))), 1);
				world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 0)));
				(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
						(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
								.getItemDamage()) + 1));
				if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)))).getMaterial() == Material.ROCK)
						&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1))))) < 3))) {
					world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1)));
					(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
							(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
									.getItemDamage()) + 1));
					if ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)))).getMaterial() == Material.ROCK)
							&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))).getBlock()
									.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))))) < 3))) {
						world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
								new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)),
								world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))), 1);
						world.setBlockToAir(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1)));
						(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setItemDamage(
								(int) (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.getItemDamage()) + 1));
						if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getMaterial() == Material.ROCK)
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))).getBlock()
										.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))) < 3))) {
							world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))).getBlock().dropBlockAsItem(world,
									new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)),
									world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))), 1);
							world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)));
							(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
									.setItemDamage((int) (((((entity instanceof EntityLivingBase)
											? ((EntityLivingBase) entity).getHeldItemMainhand()
											: ItemStack.EMPTY)).getItemDamage()) + 1));
							if ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1)))).getMaterial() == Material.ROCK)
									&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))).getBlock()
											.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))))) < 3))) {
								world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))).getBlock().dropBlockAsItem(world,
										new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1)),
										world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))), 1);
								world.setBlockToAir(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1)));
								(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.setItemDamage((int) (((((entity instanceof EntityLivingBase)
												? ((EntityLivingBase) entity).getHeldItemMainhand()
												: ItemStack.EMPTY)).getItemDamage()) + 1));
								if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getMaterial() == Material.ROCK)
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))).getBlock()
												.getHarvestLevel(
														world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))))) < 3))) {
									world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
											new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)),
											world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0))), 1);
									world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)));
									(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.setItemDamage((int) (((((entity instanceof EntityLivingBase)
													? ((EntityLivingBase) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)).getItemDamage()) + 1));
									if ((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))))
											.getMaterial() == Material.ROCK)
											&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))).getBlock()
													.getHarvestLevel(
															world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))))) < 3))) {
										world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(
												world, new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)),
												world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))), 1);
										world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)));
										(((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.setItemDamage((int) (((((entity instanceof EntityLivingBase)
														? ((EntityLivingBase) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)).getItemDamage()) + 1));
										if ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1))))
												.getMaterial() == Material.ROCK)
												&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1))).getBlock()
														.getHarvestLevel(world
																.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1))))) < 3))) {
											world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(
													world, new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)),
													world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1))), 1);
											world.setBlockToAir(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)));
											(((entity instanceof EntityLivingBase)
													? ((EntityLivingBase) entity).getHeldItemMainhand()
													: ItemStack.EMPTY))
															.setItemDamage((int) (((((entity instanceof EntityLivingBase)
																	? ((EntityLivingBase) entity).getHeldItemMainhand()
																	: ItemStack.EMPTY)).getItemDamage()) + 1));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
