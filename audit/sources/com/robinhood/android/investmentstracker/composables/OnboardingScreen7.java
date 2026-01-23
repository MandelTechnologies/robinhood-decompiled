package com.robinhood.android.investmentstracker.composables;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OnboardingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$OnboardingScreen$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class OnboardingScreen7 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ int $page;
    final /* synthetic */ ExoPlayer $secondExoPlayer;

    OnboardingScreen7(Context context, int i, ExoPlayer exoPlayer, ExoPlayer exoPlayer2) {
        this.$context = context;
        this.$page = i;
        this.$exoPlayer = exoPlayer;
        this.$secondExoPlayer = exoPlayer2;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
        invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-386002609, i, -1, "com.robinhood.android.investmentstracker.composables.OnboardingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingScreen.kt:125)");
        }
        if (z) {
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(400));
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changed(this.$page) | composer.changedInstance(this.$exoPlayer) | composer.changedInstance(this.$secondExoPlayer);
            final Context context = this.$context;
            final int i2 = this.$page;
            final ExoPlayer exoPlayer = this.$exoPlayer;
            final ExoPlayer exoPlayer2 = this.$secondExoPlayer;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$OnboardingScreen$1$1$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OnboardingScreen7.invoke$lambda$2$lambda$1(context, i2, exoPlayer, exoPlayer2, (Context) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierM5156height3ABfNKs, null, composer, 48, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView invoke$lambda$2$lambda$1(Context context, int i, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(context);
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(1);
        if (i != 0) {
            exoPlayer = exoPlayer2;
        }
        playerView.setPlayer(exoPlayer);
        return playerView;
    }
}
