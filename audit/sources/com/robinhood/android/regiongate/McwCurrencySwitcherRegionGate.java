package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.I18nMcwCurrencySwitcherExperiment;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/McwCurrencySwitcherRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class McwCurrencySwitcherRegionGate extends RegionGate {
    public static final McwCurrencySwitcherRegionGate INSTANCE = new McwCurrencySwitcherRegionGate();

    private McwCurrencySwitcherRegionGate() {
        super("mcw-currency-switcher", RegionGateConfiguration.UserInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInAnyExperiment.INSTANCE, I18nMcwCurrencySwitcherExperiment.INSTANCE, (Set) null, (Set) null, 6, (Object) null));
    }
}
