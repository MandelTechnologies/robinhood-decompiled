package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import retrofit2.Response;

/* compiled from: NbboSummaryStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class NbboSummaryStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Response<ApiNbboSummary>>, Object>, ContinuationImpl6 {
    NbboSummaryStore2(Object obj) {
        super(2, obj, TradeEquityBonfireApi.class, "getNbboSummary", "getNbboSummary(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Response<ApiNbboSummary>> continuation) {
        return ((TradeEquityBonfireApi) this.receiver).getNbboSummary(uuid, continuation);
    }
}
