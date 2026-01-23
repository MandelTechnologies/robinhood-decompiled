package com.robinhood.store.futures.arsenal;

import com.robinhood.android.moria.network.Endpoint;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesContractStore$multiUiContractQuery$1 extends AdaptedFunctionReference implements Function1<List<? extends UUID>, Job> {
    FuturesContractStore$multiUiContractQuery$1(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Job invoke(List<? extends UUID> list) {
        return invoke2((List<UUID>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Job invoke2(List<UUID> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
    }
}
