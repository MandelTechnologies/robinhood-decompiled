package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcome$1$2$1 implements Function1<Context, PlayerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ExoPlayer $exoPlayer;

    ConciergeOnboardingComposableKt$ConciergeWelcome$1$2$1(Context context, ExoPlayer exoPlayer) {
        this.$context = context;
        this.$exoPlayer = exoPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PlayerView invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PlayerView playerView = new PlayerView(this.$context);
        ExoPlayer exoPlayer = this.$exoPlayer;
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(3);
        playerView.setShutterBackgroundColor(Color2.m6735toArgb8_81llA(Color.INSTANCE.m6725getTransparent0d7_KjU()));
        playerView.setPlayer(exoPlayer);
        return playerView;
    }
}
