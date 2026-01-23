package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionChainAvailableMetricsDao;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$streamStrategyBuilderAvailableMetrics$2 */
/* loaded from: classes13.dex */
/* synthetic */ class C34004x4be25166 extends FunctionReferenceImpl implements Function1<String, Flow<? extends OptionChainAvailableMetrics>> {
    C34004x4be25166(Object obj) {
        super(1, obj, OptionChainAvailableMetricsDao.class, "getOptionChainAvailableMetrics", "getOptionChainAvailableMetrics(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionChainAvailableMetrics> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionChainAvailableMetricsDao) this.receiver).getOptionChainAvailableMetrics(p0);
    }
}
