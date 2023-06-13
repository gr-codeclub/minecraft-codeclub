package net.mcreator.catcosmonaut.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class CatWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.BUBBLE_POP, (x + 2), (y + 2), z, 5, 3, 3, 3, 1);
	}
}
