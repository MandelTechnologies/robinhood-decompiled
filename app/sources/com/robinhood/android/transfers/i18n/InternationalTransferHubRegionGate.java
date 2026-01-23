package com.robinhood.android.transfers.i18n;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateConfiguration;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;

/* compiled from: InternationalTransferHubRegionGate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/i18n/InternationalTransferHubRegionGate;", "Lcom/robinhood/android/regiongate/RegionGate;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransferHubRegionGate extends RegionGate {
    public static final InternationalTransferHubRegionGate INSTANCE = new InternationalTransferHubRegionGate();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private InternationalTransferHubRegionGate() {
        super("international-transfer-hub", new RegionGateConfiguration.UserInSupportedCountries(Affiliate.RHSG.INSTANCE.plus(CountryCode.Supported.UnitedKingdom.INSTANCE), null, 2, 0 == true ? 1 : 0));
    }
}
