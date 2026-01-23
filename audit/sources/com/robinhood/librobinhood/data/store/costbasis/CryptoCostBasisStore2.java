package com.robinhood.librobinhood.data.store.costbasis;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: CryptoCostBasisStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore$detailsQuery$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCostBasisStore2 extends AdaptedFunctionReference implements Function1<CryptoCostBasisStore.DetailsParams, Job> {
    CryptoCostBasisStore2(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(CryptoCostBasisStore.DetailsParams p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
