package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RoundupTimelineStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RoundupTimelineStore$skipRoundupOrderEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RoundupTimelineStore4 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RoundupTimelineStore4(Object obj) {
        super(2, obj, PlutoApi.class, "skipRoundupOrder", "skipRoundupOrder(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
        return ((PlutoApi) this.receiver).skipRoundupOrder(uuid, continuation);
    }
}
