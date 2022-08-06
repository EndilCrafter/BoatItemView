package me.soapsuds.boatiview.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import me.soapsuds.boatiview.BoatItemView;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = BoatItemView.MODID, bus = Bus.MOD)
public class DataGen {
	
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
	
	@SubscribeEvent
	public static void onDataGen(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper fileHelper = event.getExistingFileHelper();

		generator.addProvider(true, new BLangGen(generator));

	}

}
