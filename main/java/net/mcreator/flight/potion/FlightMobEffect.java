
package net.mcreator.flight.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FlightMobEffect extends MobEffect {
	public FlightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1187227);
		setRegistryName("flight");
	}

	@Override
	public String getDescriptionId() {
		return "effect.flight.flight";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
