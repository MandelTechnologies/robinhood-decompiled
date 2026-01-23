package com.robinhood.store.event;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/store/event/EstimatedFeesParams;", "", "Ljava/util/UUID;", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2", m3645f = "EventOrderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2 extends ContinuationImpl7 implements Function3<EstimatedFeesParams, Map<UUID, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
    int label;

    EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2(Continuation<? super EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(EstimatedFeesParams estimatedFeesParams, Map<UUID, ? extends BigDecimal> map, Continuation<? super Unit> continuation) {
        return new EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
