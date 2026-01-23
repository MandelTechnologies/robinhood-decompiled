package com.robinhood.android.support.supporthub;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$12 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ Function0<Unit> $onClickContinue;
    final /* synthetic */ SnapshotState<Boolean> $videoEnd$delegate;
    final /* synthetic */ SnapshotState<Boolean> $videoLoading$delegate;
    final /* synthetic */ SnapshotState<Boolean> $videoPlaying$delegate;

    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$12(ExoPlayer exoPlayer, Function0<Unit> function0, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3) {
        this.$exoPlayer = exoPlayer;
        this.$onClickContinue = function0;
        this.$videoPlaying$delegate = snapshotState;
        this.$videoEnd$delegate = snapshotState2;
        this.$videoLoading$delegate = snapshotState3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2049317736, i, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideo.<anonymous>.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:860)");
        }
        boolean zConciergeWelcomeVideo$lambda$38 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$38(this.$videoPlaying$delegate);
        boolean zConciergeWelcomeVideo$lambda$41 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate);
        boolean zConciergeWelcomeVideo$lambda$35 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$35(this.$videoLoading$delegate);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$exoPlayer);
        final ExoPlayer exoPlayer = this.$exoPlayer;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$12$1$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (exoPlayer.getPlaybackState() != 3) {
                        return;
                    }
                    exoPlayer.play();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls(zConciergeWelcomeVideo$lambda$38, zConciergeWelcomeVideo$lambda$41, zConciergeWelcomeVideo$lambda$35, (Function0) objRememberedValue, this.$onClickContinue, null, composer, 0, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
