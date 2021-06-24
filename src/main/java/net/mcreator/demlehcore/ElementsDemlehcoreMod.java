/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.demlehcore;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import net.mcreator.demlehcore.gui.GuiSouffreChestGUI;
import net.mcreator.demlehcore.gui.GuiMiniumChestGUI;
import net.mcreator.demlehcore.gui.GuiEboniteChestGUI;
import net.mcreator.demlehcore.gui.GuiEboMachineGUI;
import net.mcreator.demlehcore.gui.GuiDemlehMachineGUI;
import net.mcreator.demlehcore.gui.GuiAmazoniteChestGUI;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsDemlehcoreMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsDemlehcoreMod() {
		sounds.put(new ResourceLocation("demlehcore", "yg"), new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "yg")));
		sounds.put(new ResourceLocation("demlehcore", "rickroll"), new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "rickroll")));
		sounds.put(new ResourceLocation("demlehcore", "t-kt"), new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "t-kt")));
		sounds.put(new ResourceLocation("demlehcore", "rickroll2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "rickroll2")));
		sounds.put(new ResourceLocation("demlehcore", "rickroll3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "rickroll3")));
		sounds.put(new ResourceLocation("demlehcore", "rickroll4"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "rickroll4")));
		sounds.put(new ResourceLocation("demlehcore", "rickroll5"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "rickroll5")));
		sounds.put(new ResourceLocation("demlehcore", "yoshihurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "yoshihurt")));
		sounds.put(new ResourceLocation("demlehcore", "yoshideath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "yoshideath")));
		sounds.put(new ResourceLocation("demlehcore", "chest_open"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "chest_open")));
		sounds.put(new ResourceLocation("demlehcore", "chest_close"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("demlehcore", "chest_close")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsDemlehcoreMod.ModElement.class)
					elements.add((ElementsDemlehcoreMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsDemlehcoreMod.ModElement::initElements);
		this.addNetworkMessage(DemlehcoreModVariables.WorldSavedDataSyncMessageHandler.class, DemlehcoreModVariables.WorldSavedDataSyncMessage.class,
				Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = DemlehcoreModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = DemlehcoreModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				DemlehcoreMod.PACKET_HANDLER.sendTo(new DemlehcoreModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP) event.player);
			if (worlddata != null)
				DemlehcoreMod.PACKET_HANDLER.sendTo(new DemlehcoreModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = DemlehcoreModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				DemlehcoreMod.PACKET_HANDLER.sendTo(new DemlehcoreModVariables.WorldSavedDataSyncMessage(1, worlddata),
						(EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			DemlehcoreMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiEboMachineGUI.GUIID)
				return new GuiEboMachineGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiDemlehMachineGUI.GUIID)
				return new GuiDemlehMachineGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiMiniumChestGUI.GUIID)
				return new GuiMiniumChestGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiEboniteChestGUI.GUIID)
				return new GuiEboniteChestGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiAmazoniteChestGUI.GUIID)
				return new GuiAmazoniteChestGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiSouffreChestGUI.GUIID)
				return new GuiSouffreChestGUI.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiEboMachineGUI.GUIID)
				return new GuiEboMachineGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiDemlehMachineGUI.GUIID)
				return new GuiDemlehMachineGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiMiniumChestGUI.GUIID)
				return new GuiMiniumChestGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiEboniteChestGUI.GUIID)
				return new GuiEboniteChestGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiAmazoniteChestGUI.GUIID)
				return new GuiAmazoniteChestGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiSouffreChestGUI.GUIID)
				return new GuiSouffreChestGUI.GuiWindow(world, x, y, z, player);
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsDemlehcoreMod elements;
		protected final int sortid;
		public ModElement(ElementsDemlehcoreMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}