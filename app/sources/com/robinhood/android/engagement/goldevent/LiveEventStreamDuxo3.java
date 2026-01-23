package com.robinhood.android.engagement.goldevent;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: LiveEventStreamDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$createMuxBoundExoPlayerInstance$1$1$onPlaybackStateChanged$1", m3645f = "LiveEventStreamDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo$createMuxBoundExoPlayerInstance$1$1$onPlaybackStateChanged$1, reason: use source file name */
/* loaded from: classes7.dex */
final class LiveEventStreamDuxo3 extends ContinuationImpl7 implements Function2<LiveEventStreamViewState, Continuation<? super LiveEventStreamViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    LiveEventStreamDuxo3(Continuation<? super LiveEventStreamDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LiveEventStreamDuxo3 liveEventStreamDuxo3 = new LiveEventStreamDuxo3(continuation);
        liveEventStreamDuxo3.L$0 = obj;
        return liveEventStreamDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveEventStreamViewState liveEventStreamViewState, Continuation<? super LiveEventStreamViewState> continuation) {
        return ((LiveEventStreamDuxo3) create(liveEventStreamViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return LiveEventStreamViewState.copy$default((LiveEventStreamViewState) this.L$0, null, LiveEventStreamViewState3.BUFFERING, 1, null);
    }
}
