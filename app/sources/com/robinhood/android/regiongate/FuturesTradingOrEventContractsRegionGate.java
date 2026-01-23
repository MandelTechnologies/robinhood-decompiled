package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.EventContractsExperiments;
import com.robinhood.android.regiongate.experiment.FuturesExperiments;
import com.robinhood.experiments.Experiment;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/FuturesTradingOrEventContractsRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FuturesTradingOrEventContractsRegionGate extends RegionGate {
    public static final FuturesTradingOrEventContractsRegionGate INSTANCE = new FuturesTradingOrEventContractsRegionGate();

    private FuturesTradingOrEventContractsRegionGate() {
        super("futures_trading_or_event_contracts", RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.INSTANCE, CollectionsKt.listOf((Object[]) new Experiment[]{EventContractsExperiments.INSTANCE, FuturesExperiments.INSTANCE}), CountryCode.Supported.UnitedStates.INSTANCE, (Set) null, (Set) null, 12, (Object) null));
    }
}
