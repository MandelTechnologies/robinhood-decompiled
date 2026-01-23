package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.WatchlistRedesignExperiment;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/WatchlistTabRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class WatchlistTabRegionGate extends RegionGate {
    public static final WatchlistTabRegionGate INSTANCE = new WatchlistTabRegionGate();

    /* JADX WARN: Multi-variable type inference failed */
    private WatchlistTabRegionGate() {
        super("watchlist_tab", new RegionGateConfiguration.UserInAnyExperiment(CollectionsKt.listOf(new ExperimentTarget(WatchlistRedesignExperiment.INSTANCE, CollectionsKt.listOf(WatchlistRedesignExperiment.Variant.SWIPE_WATCHLIST_TAB))), null, 2, 0 == true ? 1 : 0));
    }
}
