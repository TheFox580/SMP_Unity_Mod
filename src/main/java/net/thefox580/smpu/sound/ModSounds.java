package net.thefox580.smpu.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu.SMPUnity;

public class ModSounds {
    public static final DeferredRegister<SoundEvent>  SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SMPUnity.MOD_ID);

    public static final RegistryObject<SoundEvent> SUSPICIOUS_WHITE_POWDER_SNIFF = registerSoundEvents("suspicious_white_powder_sniff");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SMPUnity.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
