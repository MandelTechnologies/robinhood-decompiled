package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.api.equity.EquitiesSay;
import com.robinhood.models.api.ApiProxyCommunication;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import retrofit2.Response;

/* compiled from: EquityProxyVotingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.equityproxyvoting.EquityProxyVotingStore$proxyCommunicationEndpoint$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityProxyVotingStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Response<ApiProxyCommunication>>, Object>, ContinuationImpl6 {
    EquityProxyVotingStore2(Object obj) {
        super(2, obj, EquitiesSay.class, "getInstrumentProxyCommunications", "getInstrumentProxyCommunications(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<ApiProxyCommunication>> continuation) {
        return ((EquitiesSay) this.receiver).getInstrumentProxyCommunications(uuid, continuation);
    }
}
