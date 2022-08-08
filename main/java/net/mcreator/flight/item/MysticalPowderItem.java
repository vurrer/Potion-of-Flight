
package net.mcreator.flight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MysticalPowderItem extends Item {
	public MysticalPowderItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("mystical_powder");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
