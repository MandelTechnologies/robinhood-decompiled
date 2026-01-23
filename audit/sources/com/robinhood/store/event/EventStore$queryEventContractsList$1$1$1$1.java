package com.robinhood.store.event;

import com.robinhood.android.moria.network.Endpoint;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$queryEventContractsList$1$1$1$1", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventStore$queryEventContractsList$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ List<UUID> $it;
    int label;
    final /* synthetic */ EventStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventStore$queryEventContractsList$1$1$1$1(EventStore eventStore, List<UUID> list, Continuation<? super EventStore$queryEventContractsList$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = eventStore;
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventStore$queryEventContractsList$1$1$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((EventStore$queryEventContractsList$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Endpoint.DefaultImpls.refresh$default(this.this$0.getEventContractsList, this.$it, false, null, 6, null);
    }
}
