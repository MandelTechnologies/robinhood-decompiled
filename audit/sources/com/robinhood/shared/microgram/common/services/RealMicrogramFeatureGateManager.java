package com.robinhood.shared.microgram.common.services;

import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.microgram.featuregate.MicrogramFeatureGateManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealMicrogramFeatureGateManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramFeatureGateManager;", "Lcom/robinhood/microgram/featuregate/MicrogramFeatureGateManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "getFeatureGateState", "", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RealMicrogramFeatureGateManager implements MicrogramFeatureGateManager {
    private final RegionGateProvider regionGateProvider;

    public RealMicrogramFeatureGateManager(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.microgram.featuregate.MicrogramFeatureGateManager
    public Object getFeatureGateState(String str, Continuation<? super Boolean> continuation) {
        return RegionGateProvider.DefaultImpls.getRegionGateStateByName$default(this.regionGateProvider, str, false, continuation, 2, null);
    }
}
