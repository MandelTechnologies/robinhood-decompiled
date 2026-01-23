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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoPlayer$5$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoPlayer$5$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isInPipMode;
    final /* synthetic */ LiveEventStreamViewState3 $playbackState;
    final /* synthetic */ SnapshotState<Boolean> $showControls$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamComposableKt$VideoPlayer$5$1(boolean z, LiveEventStreamViewState3 liveEventStreamViewState3, SnapshotState<Boolean> snapshotState, Continuation<? super LiveEventStreamComposableKt$VideoPlayer$5$1> continuation) {
        super(2, continuation);
        this.$isInPipMode = z;
        this.$playbackState = liveEventStreamViewState3;
        this.$showControls$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveEventStreamComposableKt$VideoPlayer$5$1(this.$isInPipMode, this.$playbackState, this.$showControls$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveEventStreamComposableKt$VideoPlayer$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isInPipMode) {
            LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$32(this.$showControls$delegate, false);
        } else if (this.$playbackState == LiveEventStreamViewState3.PAUSED) {
            LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$32(this.$showControls$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
