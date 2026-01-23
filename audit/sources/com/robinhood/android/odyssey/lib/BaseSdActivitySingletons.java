package com.robinhood.android.odyssey.lib;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSdActivitySingletons.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "sdStore", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;Lcom/robinhood/analytics/AnalyticsLogger;)V", "getExperimentsStore$feature_lib_odyssey_externalDebug", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getIacStatusBannerStore$feature_lib_odyssey_externalDebug", "()Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "getMoshi$feature_lib_odyssey_externalDebug", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "getSdStore$feature_lib_odyssey_externalDebug", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "getAnalytics$feature_lib_odyssey_externalDebug", "()Lcom/robinhood/analytics/AnalyticsLogger;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class BaseSdActivitySingletons {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final ExperimentsStore experimentsStore;
    private final IacStatusBannerStore iacStatusBannerStore;
    private final LazyMoshi moshi;
    private final ServerDrivenStore sdStore;

    public BaseSdActivitySingletons(ExperimentsStore experimentsStore, IacStatusBannerStore iacStatusBannerStore, LazyMoshi moshi, ServerDrivenStore sdStore, AnalyticsLogger analytics) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(sdStore, "sdStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.experimentsStore = experimentsStore;
        this.iacStatusBannerStore = iacStatusBannerStore;
        this.moshi = moshi;
        this.sdStore = sdStore;
        this.analytics = analytics;
    }

    /* renamed from: getExperimentsStore$feature_lib_odyssey_externalDebug, reason: from getter */
    public final ExperimentsStore getExperimentsStore() {
        return this.experimentsStore;
    }

    /* renamed from: getIacStatusBannerStore$feature_lib_odyssey_externalDebug, reason: from getter */
    public final IacStatusBannerStore getIacStatusBannerStore() {
        return this.iacStatusBannerStore;
    }

    /* renamed from: getMoshi$feature_lib_odyssey_externalDebug, reason: from getter */
    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    /* renamed from: getSdStore$feature_lib_odyssey_externalDebug, reason: from getter */
    public final ServerDrivenStore getSdStore() {
        return this.sdStore;
    }

    /* renamed from: getAnalytics$feature_lib_odyssey_externalDebug, reason: from getter */
    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }
}
