package com.robinhood.android.equity;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: FeeEstimation.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equity/EquitiesSellSideDropdown;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.EquitiesSellSideDropdown, reason: use source file name */
/* loaded from: classes3.dex */
public final class FeeEstimation extends RegionGate {
    public static final FeeEstimation INSTANCE = new FeeEstimation();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private FeeEstimation() {
        super("equities_sell_side_dropdown", new RegionGateConfiguration.UserInSupportedCountries(SetsKt.setOf(CountryCode.Supported.Singapore.INSTANCE), null, 2, 0 == true ? 1 : 0));
    }
}
