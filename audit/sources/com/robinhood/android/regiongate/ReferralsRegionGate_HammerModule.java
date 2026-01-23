package com.robinhood.android.regiongate;

import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: ReferralsRegionGate_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ReferralsRegionGate_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/android/regiongate/RegionGate;", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ReferralsRegionGate_HammerModule {
    public static final ReferralsRegionGate_HammerModule INSTANCE = new ReferralsRegionGate_HammerModule();

    private ReferralsRegionGate_HammerModule() {
    }

    public final RegionGate provide() {
        return ReferralsRegionGate.INSTANCE;
    }
}
