package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoStats;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoStatsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoStatsStore$cryptoStatsEndpoints$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoStatsStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiCryptoStats>, Object>, ContinuationImpl6 {
    CryptoStatsStore2(Object obj) {
        super(2, obj, CryptoBonfireApi.class, "getCryptoStats", "getCryptoStats(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiCryptoStats> continuation) {
        return ((CryptoBonfireApi) this.receiver).getCryptoStats(uuid, continuation);
    }
}
