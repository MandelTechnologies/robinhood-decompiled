package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$accountMarketValuesLiveQuery$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class PerformanceChartStore4 extends AdaptedFunctionReference implements Function1<PerformanceChartStore.AccountMarketValuesLiveRequest, Flow<? extends ApiAccountMarketValuesLive>> {
    PerformanceChartStore4(Object obj) {
        super(1, obj, Endpoint.class, "poll", "poll(Ljava/lang/Object;Ljava/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<ApiAccountMarketValuesLive> invoke(PerformanceChartStore.AccountMarketValuesLiveRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Endpoint.DefaultImpls.poll$default((Endpoint) this.receiver, p0, null, null, 6, null);
    }
}
