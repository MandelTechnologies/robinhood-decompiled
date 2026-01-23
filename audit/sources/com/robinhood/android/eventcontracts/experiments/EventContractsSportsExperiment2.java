package com.robinhood.android.eventcontracts.experiments;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateConfiguration;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: EventContractsSportsExperiment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/experiments/EventContractsSportsRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.experiments.EventContractsSportsRegionGate, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventContractsSportsExperiment2 extends RegionGate {
    public static final EventContractsSportsExperiment2 INSTANCE = new EventContractsSportsExperiment2();

    private EventContractsSportsExperiment2() {
        super("event-contracts-sports", RegionGateConfiguration.UserInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInAnyExperiment.INSTANCE, EventContractsSportsExperiment.INSTANCE, (Set) null, (Set) null, 6, (Object) null));
    }
}
