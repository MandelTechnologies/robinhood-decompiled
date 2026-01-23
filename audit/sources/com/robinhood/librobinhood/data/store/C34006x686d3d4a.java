package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionChainSelectedMetricsDao;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$streamStrategyBuilderSelectedMetricsById$2 */
/* loaded from: classes13.dex */
/* synthetic */ class C34006x686d3d4a extends FunctionReferenceImpl implements Function1<String, Flow<? extends OptionChainSelectedMetrics>> {
    C34006x686d3d4a(Object obj) {
        super(1, obj, OptionChainSelectedMetricsDao.class, "getOptionChainSelectedMetricsById", "getOptionChainSelectedMetricsById(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionChainSelectedMetrics> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionChainSelectedMetricsDao) this.receiver).getOptionChainSelectedMetricsById(p0);
    }
}
