
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.flight.FlightMod;

public class FlightModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, FlightMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_FLIGHT = REGISTRY.register("potion_of_flight",
			() -> new Potion(new MobEffectInstance(FlightModMobEffects.FLIGHT.get(), 2400, 0, false, true)));
	public static final RegistryObject<Potion> EXTENDED_POTION_OF_FLIGHT = REGISTRY.register("extended_potion_of_flight",
			() -> new Potion(new MobEffectInstance(FlightModMobEffects.FLIGHT.get(), 9600, 0, false, true)));
}
