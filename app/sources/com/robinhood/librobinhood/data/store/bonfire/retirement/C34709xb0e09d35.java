package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.moria.network.Endpoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.Job;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore$internalRetirement401kRolloverQuery$1 */
/* loaded from: classes13.dex */
/* synthetic */ class C34709xb0e09d35 extends AdaptedFunctionReference implements Function1<Boolean, Job> {
    C34709xb0e09d35(Object obj) {
        super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Job invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final Job invoke(boolean z) {
        return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, Boolean.valueOf(z), false, null, 6, null);
    }
}
