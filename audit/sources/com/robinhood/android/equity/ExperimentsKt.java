package com.robinhood.android.equity;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Experiments.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\f"}, m3636d2 = {"isMarketBuysV2Enabled", "Lio/reactivex/Observable;", "", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "trigger", "streamWithExperiment", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "experiment", "Lcom/robinhood/experiments/Experiment;", "lib-store-equity-shared_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ExperimentsKt {
    public static final Observable<Boolean> isMarketBuysV2Enabled(RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, boolean z) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<this>");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        return streamWithExperiment(regionGateProvider, experimentsStore, ShareBasedMarketBuysRegionGate.INSTANCE, ShareBasedMarketBuysV2RegionGate.INSTANCE, z);
    }

    public static final Observable<Boolean> streamWithExperiment(RegionGateProvider regionGateProvider, final ExperimentsStore experimentsStore, RegionGate regionGate, final Experiment<?> experiment, final boolean z) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<this>");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Observable<Boolean> observableFlatMap = RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, regionGate, false, 2, null).flatMap(new Function() { // from class: com.robinhood.android.equity.ExperimentsKt.streamWithExperiment.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean inRegion) {
                Intrinsics.checkNotNullParameter(inRegion, "inRegion");
                if (inRegion.booleanValue()) {
                    return ExperimentsProvider.DefaultImpls.streamState$default(experimentsStore, new Experiment[]{experiment}, z, null, 4, null);
                }
                Observable observableJust = Observable.just(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }
}
