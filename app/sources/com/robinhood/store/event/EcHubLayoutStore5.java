package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.store.event.EcHubLayoutStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: EcHubLayoutStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.event.EcHubLayoutStore$queryEcHubLayout$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class EcHubLayoutStore5 extends AdaptedFunctionReference implements Function1<EcHubLayoutStore.GetLayoutParams, Job> {
    EcHubLayoutStore5(Object obj) {
        super(1, obj, IdlPaginatedResponseEndpoint.class, "refreshAllPages", "refreshAllPages(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(EcHubLayoutStore.GetLayoutParams p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IdlPaginatedResponseEndpoint.DefaultImpls.refreshAllPages$default((IdlPaginatedResponseEndpoint) this.receiver, p0, false, 2, null);
    }
}
