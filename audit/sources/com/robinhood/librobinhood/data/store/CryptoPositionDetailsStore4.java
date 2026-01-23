package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore;
import com.robinhood.models.api.ApiCryptoPositionDetails;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: CryptoPositionDetailsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoPositionDetailsStore$streamCryptoPositionDetailsQuery$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoPositionDetailsStore4 extends AdaptedFunctionReference implements Function1<CryptoPositionDetailsStore.CryptoPositionDetailsParams, Flow<? extends Response<ApiCryptoPositionDetails>>> {
    CryptoPositionDetailsStore4(Object obj) {
        super(1, obj, Endpoint8.class, "backendPoll", "backendPoll(Lcom/robinhood/android/moria/network/Endpoint;Ljava/lang/Object;Ljava/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<Response<ApiCryptoPositionDetails>> invoke(CryptoPositionDetailsStore.CryptoPositionDetailsParams p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint8.backendPoll$default((Endpoint) this.receiver, p0, null, null, 6, null);
    }
}
