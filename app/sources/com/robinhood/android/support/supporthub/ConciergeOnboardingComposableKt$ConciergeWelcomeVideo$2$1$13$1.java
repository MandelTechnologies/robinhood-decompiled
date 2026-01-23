package com.robinhood.android.support.supporthub;

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
import kotlinx.coroutines.DelayKt;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1", m3645f = "ConciergeOnboardingComposable.kt", m3646l = {911}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExoPlayer $exoPlayer;
    final /* synthetic */ int $fadeOutDuration;
    final /* synthetic */ boolean $loadingVisible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1(boolean z, ExoPlayer exoPlayer, int i, Continuation<? super ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1> continuation) {
        super(2, continuation);
        this.$loadingVisible = z;
        this.$exoPlayer = exoPlayer;
        this.$fadeOutDuration = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1(this.$loadingVisible, this.$exoPlayer, this.$fadeOutDuration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$loadingVisible) {
                return Unit.INSTANCE;
            }
            if (!this.$exoPlayer.isPlaying()) {
                long j = (long) (this.$fadeOutDuration * 0.3f);
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$exoPlayer.play();
        return Unit.INSTANCE;
    }
}
