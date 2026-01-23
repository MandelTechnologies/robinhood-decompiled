package com.mux.stats.sdk.muxstats;

import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MuxStateCollector.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Player", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$updateOnMain$1", m3645f = "MuxStateCollector.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$updateOnMain$1, reason: use source file name */
/* loaded from: classes27.dex */
final class MuxStateCollector3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MuxStateCollector.PlayerWatcher<Player> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MuxStateCollector3(MuxStateCollector.PlayerWatcher<Player> playerWatcher, Continuation<? super MuxStateCollector3> continuation) {
        super(2, continuation);
        this.this$0 = playerWatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MuxStateCollector3 muxStateCollector3 = new MuxStateCollector3(this.this$0, continuation);
        muxStateCollector3.L$0 = obj;
        return muxStateCollector3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MuxStateCollector3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Long timeMillis = this.this$0.getTimeMillis();
            if (timeMillis == null) {
                String simpleName = CoroutineScope.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                MuxLogger.m1117d(simpleName, "PlaybackPositionWatcher: Player lost. Stopping");
                this.this$0.stop("player lost");
            } else {
                this.this$0.getStateCollector().setPlaybackPositionMills(timeMillis.longValue());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
