package me.fobba.vanish.mixin.client;

import com.mojang.authlib.GameProfile;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Crystalinqq
 * Updated by 20kdc on 17/02/20 - changed implementation method, made a module again, made async
 */
@Mixin(AbstractClientPlayer.class)
public class MixinAbstractClientPlayer {


}
