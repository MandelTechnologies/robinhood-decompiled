package com.robinhood.android.equity;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: ShareBasedMarketBuysRegionGate_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/ShareBasedMarketBuysRegionGate_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/android/regiongate/RegionGate;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ShareBasedMarketBuysRegionGate_HammerModule {
    public static final ShareBasedMarketBuysRegionGate_HammerModule INSTANCE = new ShareBasedMarketBuysRegionGate_HammerModule();

    private ShareBasedMarketBuysRegionGate_HammerModule() {
    }

    public final RegionGate provide() {
        return ShareBasedMarketBuysRegionGate.INSTANCE;
    }
}
