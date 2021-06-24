package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;

import net.mcreator.demlehcore.item.ItemMiniumSmeltHammer;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureHammerSmeltProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureHammerSmeltProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 174);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HammerSmeltProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure HammerSmeltProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure HammerSmeltProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure HammerSmeltProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure HammerSmeltProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean removeBlock = false;
		if (((new ItemStack(ItemMiniumSmeltHammer.block, (int) (1)).getItem()
				.canHarvestBlock((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))))) == (true))) {
			if ((!((FurnaceRecipes.instance()
					.getSmeltingResult((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))).copy())
							.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, (x + 0.5), (y + 0.5), (z + 0.5), (FurnaceRecipes.instance()
							.getSmeltingResult((new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))).copy()));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
				removeBlock = (boolean) (true);
			} else {
				removeBlock = (boolean) (false);
			}
			if (((removeBlock) == (true))) {
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			} else {
				world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			}
		}
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
