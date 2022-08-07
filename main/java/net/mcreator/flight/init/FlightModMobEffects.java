
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.flight.potion.FlightMobEffect;
import net.mcreator.flight.FlightMod;

public class FlightModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FlightMod.MODID);
	public static final RegistryObject<MobEffect> FLIGHT = REGISTRY.register("flight", () -> new FlightMobEffect());
}
