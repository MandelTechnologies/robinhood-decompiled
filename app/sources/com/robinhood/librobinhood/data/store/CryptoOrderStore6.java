package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: CryptoOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$pendingQuery$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoOrderStore6 extends AdaptedFunctionReference implements Function1<CryptoOrderStore.PendingRequest, Job> {
    CryptoOrderStore6(Object obj) {
        super(1, obj, PaginatedEndpoint.class, "refreshAllPages", "refreshAllPages(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(CryptoOrderStore.PendingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default((PaginatedEndpoint) this.receiver, p0, false, 2, null);
    }
}
