
package net.beezymc.starfields.item;

import java.util.List;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

public class PlushieItem extends Item {
	public PlushieItem() {
		super(new Item.Settings().maxCount(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendTooltip(ItemStack itemstack, World world, List<Text> list, TooltipContext flag) {
		super.appendTooltip(itemstack, world, list, flag);
		list.add(Text.literal("Can be placed on an item frame"));
	}
}
