package net.mcreator.demlehcore.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.gui.GuiDemlehMachineGUI;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;
import net.mcreator.demlehcore.DemlehcoreMod;

import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureOpenDemlehMachine extends ElementsDemlehcoreMod.ModElement {
	public ProcedureOpenDemlehMachine(ElementsDemlehcoreMod instance) {
		super(instance, 170);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenDemlehMachine!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenDemlehMachine!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenDemlehMachine!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenDemlehMachine!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenDemlehMachine!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(DemlehcoreMod.instance, GuiDemlehMachineGUI.GUIID, world, x, y, z);
	}
}
