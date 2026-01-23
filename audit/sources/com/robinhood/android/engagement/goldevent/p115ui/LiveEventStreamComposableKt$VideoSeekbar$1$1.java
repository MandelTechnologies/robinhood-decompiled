package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.runtime.SnapshotFloatState2;
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
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$1$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoSeekbar$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $atLiveEdge;
    final /* synthetic */ boolean $isEventLive;
    final /* synthetic */ boolean $isSeeking;
    final /* synthetic */ float $progress;
    final /* synthetic */ SnapshotFloatState2 $seekPosition$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveEventStreamComposableKt$VideoSeekbar$1$1(boolean z, boolean z2, boolean z3, float f, SnapshotFloatState2 snapshotFloatState2, Continuation<? super LiveEventStreamComposableKt$VideoSeekbar$1$1> continuation) {
        super(2, continuation);
        this.$isSeeking = z;
        this.$isEventLive = z2;
        this.$atLiveEdge = z3;
        this.$progress = f;
        this.$seekPosition$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveEventStreamComposableKt$VideoSeekbar$1$1(this.$isSeeking, this.$isEventLive, this.$atLiveEdge, this.$progress, this.$seekPosition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveEventStreamComposableKt$VideoSeekbar$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$isSeeking) {
            this.$seekPosition$delegate.setFloatValue((this.$isEventLive && this.$atLiveEdge) ? 1.0f : this.$progress);
        }
        return Unit.INSTANCE;
    }
}
