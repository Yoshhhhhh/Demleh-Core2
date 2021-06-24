package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.demlehcore.item.ItemSmeltModifier;
import net.mcreator.demlehcore.item.ItemSharpnessModifier;
import net.mcreator.demlehcore.item.ItemProhibitedStick;
import net.mcreator.demlehcore.item.ItemNuggetMineraiInterdit;
import net.mcreator.demlehcore.item.ItemMiniumSmeltHammer;
import net.mcreator.demlehcore.item.ItemMiniumHammer;
import net.mcreator.demlehcore.item.ItemMagmaNugget;
import net.mcreator.demlehcore.item.ItemEpeeInterdite;
import net.mcreator.demlehcore.item.ItemEboniteSword;
import net.mcreator.demlehcore.item.ItemEboniteSuperAxe;
import net.mcreator.demlehcore.item.ItemEboniteSmeltHammer;
import net.mcreator.demlehcore.item.ItemEboniteHammer;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureMachineInterditeProcedure extends ElementsDemlehcoreMod.ModElement {
	public ProcedureMachineInterditeProcedure(ElementsDemlehcoreMod instance) {
		super(instance, 222);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MachineInterditeProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MachineInterditeProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MachineInterditeProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MachineInterditeProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemProhibitedStick.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemEpeeInterdite.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (4), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemMiniumHammer.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemSmeltModifier.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemMiniumSmeltHammer.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (4), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemEboniteHammer.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemSmeltModifier.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(ItemEboniteSmeltHammer.block, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (4))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (4), _setstack);
				}
			}
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemEboniteSword.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemSharpnessModifier.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))).addEnchantment(Enchantments.SHARPNESS, (int) 1);
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemEboniteSuperAxe.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemSharpnessModifier.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))).addEnchantment(Enchantments.SHARPNESS, (int) 1);
		}
		if (((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
				&& ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
						.getItem() == new ItemStack(ItemNuggetMineraiInterdit.block, (int) (1)).getItem()))
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(ItemEpeeInterdite.block, (int) (1))
						.getItem()) && ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(ItemSharpnessModifier.block, (int) (1)).getItem())))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot)
						return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))).addEnchantment(Enchantments.SHARPNESS, (int) 1);
		}
	}
}
