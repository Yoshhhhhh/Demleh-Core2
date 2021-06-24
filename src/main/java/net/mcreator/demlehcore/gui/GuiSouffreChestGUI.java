
package net.mcreator.demlehcore.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;

import net.mcreator.demlehcore.ElementsDemlehcoreMod;
import net.mcreator.demlehcore.DemlehcoreMod;
import net.mcreator.demlehcore.procedure.ProcedureChestSoundCloseProcedure;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import java.io.IOException;
import akka.japi.Procedure;


@ElementsDemlehcoreMod.ModElement.Tag
public class GuiSouffreChestGUI extends ElementsDemlehcoreMod.ModElement {
	public static int GUIID = 7;
	public static HashMap guistate = new HashMap();
	public GuiSouffreChestGUI(ElementsDemlehcoreMod instance) {
		super(instance, 201);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
		elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
	}
	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		private IInventory internal;
		private World world;
		private EntityPlayer entity;
		private int x, y, z;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
			this.internal = new InventoryBasic("", true, 72);
			TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
			if (ent instanceof IInventory)
				this.internal = (IInventory) ent;
			this.customSlots.put(0, this.addSlotToContainer(new Slot(internal, 0, 7, 9) {
			}));
			this.customSlots.put(1, this.addSlotToContainer(new Slot(internal, 1, 25, 9) {
			}));
			this.customSlots.put(2, this.addSlotToContainer(new Slot(internal, 2, 43, 9) {
			}));
			this.customSlots.put(3, this.addSlotToContainer(new Slot(internal, 3, 61, 9) {
			}));
			this.customSlots.put(4, this.addSlotToContainer(new Slot(internal, 4, 79, 9) {
			}));
			this.customSlots.put(5, this.addSlotToContainer(new Slot(internal, 5, 97, 9) {
			}));
			this.customSlots.put(6, this.addSlotToContainer(new Slot(internal, 6, 115, 9) {
			}));
			this.customSlots.put(7, this.addSlotToContainer(new Slot(internal, 7, 133, 9) {
			}));
			this.customSlots.put(8, this.addSlotToContainer(new Slot(internal, 8, 151, 9) {
			}));
			this.customSlots.put(9, this.addSlotToContainer(new Slot(internal, 9, 7, 27) {
			}));
			this.customSlots.put(12, this.addSlotToContainer(new Slot(internal, 12, 61, 27) {
			}));
			this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 79, 27) {
			}));
			this.customSlots.put(14, this.addSlotToContainer(new Slot(internal, 14, 97, 27) {
			}));
			this.customSlots.put(15, this.addSlotToContainer(new Slot(internal, 15, 115, 27) {
			}));
			this.customSlots.put(16, this.addSlotToContainer(new Slot(internal, 16, 133, 27) {
			}));
			this.customSlots.put(17, this.addSlotToContainer(new Slot(internal, 17, 151, 27) {
			}));
			this.customSlots.put(18, this.addSlotToContainer(new Slot(internal, 18, 7, 45) {
			}));
			this.customSlots.put(19, this.addSlotToContainer(new Slot(internal, 19, 25, 45) {
			}));
			this.customSlots.put(20, this.addSlotToContainer(new Slot(internal, 20, 43, 45) {
			}));
			this.customSlots.put(21, this.addSlotToContainer(new Slot(internal, 21, 61, 45) {
			}));
			this.customSlots.put(22, this.addSlotToContainer(new Slot(internal, 22, 79, 45) {
			}));
			this.customSlots.put(23, this.addSlotToContainer(new Slot(internal, 23, 97, 45) {
			}));
			this.customSlots.put(24, this.addSlotToContainer(new Slot(internal, 24, 115, 45) {
			}));
			this.customSlots.put(25, this.addSlotToContainer(new Slot(internal, 25, 133, 45) {
			}));
			this.customSlots.put(27, this.addSlotToContainer(new Slot(internal, 27, 7, 63) {
			}));
			this.customSlots.put(28, this.addSlotToContainer(new Slot(internal, 28, 25, 63) {
			}));
			this.customSlots.put(29, this.addSlotToContainer(new Slot(internal, 29, 43, 63) {
			}));
			this.customSlots.put(26, this.addSlotToContainer(new Slot(internal, 26, 151, 45) {
			}));
			this.customSlots.put(30, this.addSlotToContainer(new Slot(internal, 30, 61, 63) {
			}));
			this.customSlots.put(31, this.addSlotToContainer(new Slot(internal, 31, 79, 63) {
			}));
			this.customSlots.put(32, this.addSlotToContainer(new Slot(internal, 32, 97, 63) {
			}));
			this.customSlots.put(33, this.addSlotToContainer(new Slot(internal, 33, 115, 63) {
			}));
			this.customSlots.put(34, this.addSlotToContainer(new Slot(internal, 34, 133, 63) {
			}));
			this.customSlots.put(35, this.addSlotToContainer(new Slot(internal, 35, 151, 63) {
			}));
			this.customSlots.put(36, this.addSlotToContainer(new Slot(internal, 36, 7, 81) {
			}));
			this.customSlots.put(37, this.addSlotToContainer(new Slot(internal, 37, 25, 81) {
			}));
			this.customSlots.put(38, this.addSlotToContainer(new Slot(internal, 38, 43, 81) {
			}));
			this.customSlots.put(39, this.addSlotToContainer(new Slot(internal, 39, 61, 81) {
			}));
			this.customSlots.put(40, this.addSlotToContainer(new Slot(internal, 40, 79, 81) {
			}));
			this.customSlots.put(41, this.addSlotToContainer(new Slot(internal, 41, 97, 81) {
			}));
			this.customSlots.put(42, this.addSlotToContainer(new Slot(internal, 42, 115, 81) {
			}));
			this.customSlots.put(43, this.addSlotToContainer(new Slot(internal, 43, 133, 81) {
			}));
			this.customSlots.put(44, this.addSlotToContainer(new Slot(internal, 44, 151, 81) {
			}));
			this.customSlots.put(45, this.addSlotToContainer(new Slot(internal, 45, 7, 99) {
			}));
			this.customSlots.put(46, this.addSlotToContainer(new Slot(internal, 46, 25, 99) {
			}));
			this.customSlots.put(47, this.addSlotToContainer(new Slot(internal, 47, 43, 99) {
			}));
			this.customSlots.put(48, this.addSlotToContainer(new Slot(internal, 48, 61, 99) {
			}));
			this.customSlots.put(49, this.addSlotToContainer(new Slot(internal, 49, 79, 99) {
			}));
			this.customSlots.put(50, this.addSlotToContainer(new Slot(internal, 50, 97, 99) {
			}));
			this.customSlots.put(51, this.addSlotToContainer(new Slot(internal, 51, 115, 99) {
			}));
			this.customSlots.put(52, this.addSlotToContainer(new Slot(internal, 52, 133, 99) {
			}));
			this.customSlots.put(53, this.addSlotToContainer(new Slot(internal, 53, 151, 99) {
			}));
			this.customSlots.put(54, this.addSlotToContainer(new Slot(internal, 54, 7, 117) {
			}));
			this.customSlots.put(55, this.addSlotToContainer(new Slot(internal, 55, 25, 117) {
			}));
			this.customSlots.put(56, this.addSlotToContainer(new Slot(internal, 56, 43, 117) {
			}));
			this.customSlots.put(57, this.addSlotToContainer(new Slot(internal, 57, 61, 117) {
			}));
			this.customSlots.put(58, this.addSlotToContainer(new Slot(internal, 58, 79, 117) {
			}));
			this.customSlots.put(59, this.addSlotToContainer(new Slot(internal, 59, 97, 117) {
			}));
			this.customSlots.put(60, this.addSlotToContainer(new Slot(internal, 60, 115, 117) {
			}));
			this.customSlots.put(61, this.addSlotToContainer(new Slot(internal, 61, 133, 117) {
			}));
			this.customSlots.put(62, this.addSlotToContainer(new Slot(internal, 62, 151, 117) {
			}));
			this.customSlots.put(10, this.addSlotToContainer(new Slot(internal, 10, 25, 27) {
			}));
			this.customSlots.put(11, this.addSlotToContainer(new Slot(internal, 11, 43, 27) {
			}));
			this.customSlots.put(63, this.addSlotToContainer(new Slot(internal, 63, 7, 135) {
			}));
			this.customSlots.put(64, this.addSlotToContainer(new Slot(internal, 64, 25, 135) {
			}));
			this.customSlots.put(65, this.addSlotToContainer(new Slot(internal, 65, 43, 135) {
			}));
			this.customSlots.put(66, this.addSlotToContainer(new Slot(internal, 66, 61, 135) {
			}));
			this.customSlots.put(67, this.addSlotToContainer(new Slot(internal, 67, 79, 135) {
			}));
			this.customSlots.put(68, this.addSlotToContainer(new Slot(internal, 68, 97, 135) {
			}));
			this.customSlots.put(69, this.addSlotToContainer(new Slot(internal, 69, 115, 135) {
			}));
			this.customSlots.put(70, this.addSlotToContainer(new Slot(internal, 70, 133, 135) {
			}));
			this.customSlots.put(71, this.addSlotToContainer(new Slot(internal, 71, 151, 135) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 0 + 8 + sj * 18, 77 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlotToContainer(new Slot(player.inventory, si, 0 + 8 + si * 18, 77 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return internal.isUsableByPlayer(player);
		}

		@Override
		public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 72) {
					if (!this.mergeItemStack(itemstack1, 72, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 72, false)) {
					if (index < 72 + 27) {
						if (!this.mergeItemStack(itemstack1, 72 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 72, 72 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
							&& (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
							&& ItemStack.areItemStackTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.splitStack(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureChestSoundCloseProcedure.executeProcedure($_dependencies);
			}
			if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
				this.clearContainer(playerIn, playerIn.world, internal);
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				DemlehcoreMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class GuiWindow extends GuiContainer {
		private World world;
		private int x, y, z;
		private EntityPlayer entity;
		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 176;
			this.ySize = 240;
		}
		private static final ResourceLocation texture = new ResourceLocation("demlehcore:textures/souffre_chest_gui.png");
		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1, 1, 1, 1);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawModalRectWithCustomSizedTexture(k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
			super.mouseClicked(mouseX, mouseY, mouseButton);
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			super.keyTyped(typedChar, keyCode);
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 176) / 2;
			this.guiTop = (this.height - 240) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			DemlehcoreMod.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
			handleButtonAction(entity, button.id, x, y, z);
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}

	public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			return null;
		}
	}

	public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			return null;
		}
	}

	public static class GUIButtonPressedMessage implements IMessage {
		int buttonID, x, y, z;
		public GUIButtonPressedMessage() {
		}

		public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(buttonID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			buttonID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}

	public static class GUISlotChangedMessage implements IMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage() {
		}

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(slotID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
			buf.writeInt(changeType);
			buf.writeInt(meta);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			slotID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
			changeType = buf.readInt();
			meta = buf.readInt();
		}
	}
	private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
