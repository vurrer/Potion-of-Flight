
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FlightModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion POTION_OF_FLIGHT = register(
			new Potion(new MobEffectInstance(FlightModMobEffects.FLIGHT, 2400, 0, false, true)).setRegistryName("potion_of_flight"));
	public static final Potion EXTENDED_POTION_OF_FLIGHT = register(
			new Potion(new MobEffectInstance(FlightModMobEffects.FLIGHT, 9600, 0, false, true)).setRegistryName("extended_potion_of_flight"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
