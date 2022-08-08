
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.flight.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.flight.item.MysticalPowderItem;
import net.mcreator.flight.item.MysticalDustItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FlightModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MYSTICAL_DUST = register(new MysticalDustItem());
	public static final Item MYSTICAL_POWDER = register(new MysticalPowderItem());
	public static final Item MYSTICAL_ORE = register(FlightModBlocks.MYSTICAL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
