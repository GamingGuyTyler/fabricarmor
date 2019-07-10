package net.ggtylerr.fabricarmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ggtylerr.fabricarmor.items.CustomArmor;
import net.ggtylerr.fabricarmor.items.FabricArmorItem;
import net.ggtylerr.fabricarmor.items.FabricItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FabricArmor implements ModInitializer {
	private static final FabricItem FABRIC_ITEM = new FabricItem(new Item.Settings());
	private static final Item FABRIC_HELMET = new FabricArmorItem(CustomArmor.FABRIC, EquipmentSlot.HEAD, (new Item.Settings()));
	private static final Item FABRIC_CHESTPLATE = new FabricArmorItem(CustomArmor.FABRIC, EquipmentSlot.CHEST, (new Item.Settings()));
	private static final Item FABRIC_LEGGINGS = new FabricArmorItem(CustomArmor.FABRIC, EquipmentSlot.LEGS, (new Item.Settings()));
	private static final Item FABRIC_BOOTS = new FabricArmorItem(CustomArmor.FABRIC, EquipmentSlot.FEET, (new Item.Settings()));
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
			new Identifier("fabric_armor","group"))
			.icon(() -> new ItemStack(FABRIC_ITEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FABRIC_ITEM));
				stacks.add(new ItemStack(FABRIC_HELMET));
				stacks.add(new ItemStack(FABRIC_CHESTPLATE));
				stacks.add(new ItemStack(FABRIC_LEGGINGS));
				stacks.add(new ItemStack(FABRIC_BOOTS));
			})
			.build();
	@Override
	public void onInitialize() {
		// Item
		Registry.register(Registry.ITEM, new Identifier("fabric_armor","fabric_item"), FABRIC_ITEM);
		// Armor
		Registry.register(Registry.ITEM, new Identifier("fabric_armor","fabric_helmet"), FABRIC_HELMET);
		Registry.register(Registry.ITEM, new Identifier("fabric_armor","fabric_chestplate"), FABRIC_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("fabric_armor","fabric_leggings"), FABRIC_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("fabric_armor","fabric_boots"), FABRIC_BOOTS);
	}
}
