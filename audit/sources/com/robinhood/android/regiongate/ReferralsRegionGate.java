package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.android.regiongate.experiment.SgExperiment;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* compiled from: RegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ReferralsRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ReferralsRegionGate extends RegionGate {
    public static final ReferralsRegionGate INSTANCE = new ReferralsRegionGate();

    private ReferralsRegionGate() {
        super("referrals", RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.Companion.invoke$default(RegionGateConfiguration.UserInSupportedCountriesOrInAnyExperiment.INSTANCE, CollectionsKt.listOf(SgExperiment.INSTANCE), SetsKt.setOf((Object[]) new CountryCode.Supported[]{CountryCode.Supported.UnitedStates.INSTANCE, CountryCode.Supported.UnitedKingdom.INSTANCE}), (Set) null, (Set) null, 12, (Object) null));
    }
}
