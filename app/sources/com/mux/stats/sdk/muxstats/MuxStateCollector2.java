package com.mux.stats.sdk.muxstats;

import com.mux.stats.sdk.muxstats.MuxStateCollector;
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

/* compiled from: MuxStateCollector.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Player", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$start$1", m3645f = "MuxStateCollector.kt", m3646l = {597}, m3647m = "invokeSuspend")
/* renamed from: com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$start$1, reason: use source file name */
/* loaded from: classes27.dex */
final class MuxStateCollector2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MuxStateCollector.PlayerWatcher<Player> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MuxStateCollector2(MuxStateCollector.PlayerWatcher<Player> playerWatcher, Continuation<? super MuxStateCollector2> continuation) {
        super(2, continuation);
        this.this$0 = playerWatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MuxStateCollector2 muxStateCollector2 = new MuxStateCollector2(this.this$0, continuation);
        muxStateCollector2.L$0 = obj;
        return muxStateCollector2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MuxStateCollector2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        long updateIntervalMillis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            this.this$0.updateOnMain(coroutineScope);
            updateIntervalMillis = this.this$0.getUpdateIntervalMillis();
            this.L$0 = coroutineScope;
            this.label = 1;
        } while (DelayKt.delay(updateIntervalMillis, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
