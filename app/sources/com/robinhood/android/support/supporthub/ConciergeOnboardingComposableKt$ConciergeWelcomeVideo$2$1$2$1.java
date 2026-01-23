package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import androidx.media3.p014ui.SubtitleView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$2$1 implements Function1<Context, PlayerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ExoPlayer $exoPlayer;

    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$2$1(Context context, ExoPlayer exoPlayer) {
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
        SubtitleView subtitleView = playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setVisibility(8);
        }
        playerView.setPlayer(exoPlayer);
        return playerView;
    }
}
