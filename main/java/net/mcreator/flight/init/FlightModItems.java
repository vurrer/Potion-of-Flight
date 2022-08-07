
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.flight.item.MysticalPowderItem;
import net.mcreator.flight.item.MysticalDustItem;
import net.mcreator.flight.FlightMod;

public class FlightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FlightMod.MODID);
	public static final RegistryObject<Item> MYSTICAL_ORE = block(FlightModBlocks.MYSTICAL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MYSTICAL_DUST = REGISTRY.register("mystical_dust", () -> new MysticalDustItem());
	public static final RegistryObject<Item> MYSTICAL_POWDER = REGISTRY.register("mystical_powder", () -> new MysticalPowderItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
