package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$6$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {365}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$6$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isSeeking$delegate;
    final /* synthetic */ LiveEventStreamViewState3 $playbackState;
    final /* synthetic */ SnapshotState<Boolean> $showControls$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamComposableKt$VideoPlayer$6$1(LiveEventStreamViewState3 liveEventStreamViewState3, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super LiveEventStreamComposableKt$VideoPlayer$6$1> continuation) {
        super(2, continuation);
        this.$playbackState = liveEventStreamViewState3;
        this.$isSeeking$delegate = snapshotState;
        this.$showControls$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveEventStreamComposableKt$VideoPlayer$6$1(this.$playbackState, this.$isSeeking$delegate, this.$showControls$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveEventStreamComposableKt$VideoPlayer$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$playbackState != LiveEventStreamViewState3.PAUSED && !LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$35(this.$isSeeking$delegate)) {
                if (LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$31(this.$showControls$delegate)) {
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = Duration3.toDuration(3, DurationUnitJvm.SECONDS);
                    this.label = 1;
                    if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$32(this.$showControls$delegate, false);
        return Unit.INSTANCE;
    }
}
