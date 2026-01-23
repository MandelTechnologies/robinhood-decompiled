package com.robinhood.android.cortex.digest.common.splash;

import androidx.compose.runtime.SnapshotState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CortexDigestSplashAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.common.splash.CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1", m3645f = "CortexDigestSplashAnimation.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ SnapshotState<Boolean> $isReady$delegate;
    final /* synthetic */ boolean $skipToEnd;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1(ExoPlayer exoPlayer, boolean z, SnapshotState<Boolean> snapshotState, Continuation<? super CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1> continuation) {
        super(2, continuation);
        this.$exoPlayer = exoPlayer;
        this.$skipToEnd = z;
        this.$isReady$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1(this.$exoPlayer, this.$skipToEnd, this.$isReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CortexDigestSplashAnimationKt$CortexDigestSplashAnimation$4$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long duration = this.$exoPlayer.getDuration() - 1;
        boolean z = this.$exoPlayer.getCurrentPosition() >= duration;
        if (CortexDigestSplashAnimationKt.CortexDigestSplashAnimation$lambda$31$lambda$12(this.$isReady$delegate) && this.$skipToEnd && !z) {
            this.$exoPlayer.seekTo(duration);
        }
        return Unit.INSTANCE;
    }
}
