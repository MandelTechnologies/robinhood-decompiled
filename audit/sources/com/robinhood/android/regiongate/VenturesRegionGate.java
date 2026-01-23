package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.EquitiesRhvExperiment;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/VenturesRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class VenturesRegionGate extends RegionGate {
    public static final VenturesRegionGate INSTANCE = new VenturesRegionGate();

    private VenturesRegionGate() {
        super("ventures", RegionGateConfiguration.UserInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInAnyExperiment.INSTANCE, CollectionsKt.listOf(EquitiesRhvExperiment.INSTANCE), (Set) null, (Set) null, 6, (Object) null));
    }
}
