package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpoint;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoQuoteStore$streamCryptoQuotes$1 extends AdaptedFunctionReference implements Function1<List<? extends UUID>, Job> {
    CryptoQuoteStore$streamCryptoQuotes$1(Object obj) {
        super(1, obj, PaginatedEndpoint.class, "refreshAllPages", "refreshAllPages(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Job invoke(List<? extends UUID> list) {
        return invoke2((List<UUID>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Job invoke2(List<UUID> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return PaginatedEndpoint.DefaultImpls.refreshAllPages$default((PaginatedEndpoint) this.receiver, p0, false, 2, null);
    }
}
