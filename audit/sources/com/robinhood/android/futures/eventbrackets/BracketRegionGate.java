package com.robinhood.android.futures.eventbrackets;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.store.experiments.EventBracketExperiment;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: BracketRegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/BracketRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BracketRegionGate extends RegionGate {
    public static final BracketRegionGate INSTANCE = new BracketRegionGate();
    public static final int $stable = 8;

    private BracketRegionGate() {
        super("android-events-bracket", RegionGateConfiguration.UserInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInAnyExperiment.INSTANCE, EventBracketExperiment.INSTANCE, (Set) null, (Set) null, 6, (Object) null));
    }
}
