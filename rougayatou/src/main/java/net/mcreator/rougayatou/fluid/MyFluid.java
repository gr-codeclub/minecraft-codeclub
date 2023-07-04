
package net.mcreator.rougayatou.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.rougayatou.init.RougayatouModItems;
import net.mcreator.rougayatou.init.RougayatouModFluids;
import net.mcreator.rougayatou.init.RougayatouModFluidTypes;
import net.mcreator.rougayatou.init.RougayatouModBlocks;

public abstract class MyFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> RougayatouModFluidTypes.MY_TYPE.get(), () -> RougayatouModFluids.MY.get(), () -> RougayatouModFluids.FLOWING_MY.get()).explosionResistance(100f)
			.bucket(() -> RougayatouModItems.MY_BUCKET.get()).block(() -> (LiquidBlock) RougayatouModBlocks.MY.get());

	private MyFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MyFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MyFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
