package com.robinhood.store.event;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.ceres.p284v1.GetEventContractRealizedPnlByContractResponseDto;
import com.robinhood.store.event.EventContractsPnlStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EventContractsPnlStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.event.EventContractsPnlStore$getEventContractRealizedPnlByContractQuery$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class EventContractsPnlStore4 extends AdaptedFunctionReference implements Function1<EventContractsPnlStore.EventContractRealizedPnlByContractParams, Flow<? extends GetEventContractRealizedPnlByContractResponseDto>> {
    EventContractsPnlStore4(Object obj) {
        super(1, obj, Endpoint.class, "poll", "poll(Ljava/lang/Object;Ljava/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<GetEventContractRealizedPnlByContractResponseDto> invoke(EventContractsPnlStore.EventContractRealizedPnlByContractParams p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.poll$default((Endpoint) this.receiver, p0, null, null, 6, null);
    }
}
