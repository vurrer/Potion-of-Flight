
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.flight.block.MysticalOreBlock;
import net.mcreator.flight.FlightMod;

public class FlightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FlightMod.MODID);
	public static final RegistryObject<Block> MYSTICAL_ORE = REGISTRY.register("mystical_ore", () -> new MysticalOreBlock());
}
