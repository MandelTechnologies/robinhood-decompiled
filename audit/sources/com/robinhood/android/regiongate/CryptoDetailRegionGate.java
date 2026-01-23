package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.CryptoExperiments;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/CryptoDetailRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CryptoDetailRegionGate extends RegionGate {
    public static final CryptoDetailRegionGate INSTANCE = new CryptoDetailRegionGate();

    private CryptoDetailRegionGate() {
        super("crypto_detail", RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.INSTANCE, CollectionsKt.listOf(CryptoExperiments.INSTANCE), SetsKt.plus(CountryCode.Supported.INSTANCE.getEU_COUNTRIES(), CountryCode.Supported.UnitedStates.INSTANCE), (Set) null, (Set) null, 12, (Object) null));
    }
}
