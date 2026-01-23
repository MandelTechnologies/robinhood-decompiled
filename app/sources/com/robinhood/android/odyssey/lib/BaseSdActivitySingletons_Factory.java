package com.robinhood.android.odyssey.lib;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSdActivitySingletons_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "sdStore", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class BaseSdActivitySingletons_Factory implements Factory<BaseSdActivitySingletons> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IacStatusBannerStore> iacStatusBannerStore;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ServerDrivenStore> sdStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BaseSdActivitySingletons_Factory create(Provider<ExperimentsStore> provider, Provider<IacStatusBannerStore> provider2, Provider<LazyMoshi> provider3, Provider<ServerDrivenStore> provider4, Provider<AnalyticsLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final BaseSdActivitySingletons newInstance(ExperimentsStore experimentsStore, IacStatusBannerStore iacStatusBannerStore, LazyMoshi lazyMoshi, ServerDrivenStore serverDrivenStore, AnalyticsLogger analyticsLogger) {
        return INSTANCE.newInstance(experimentsStore, iacStatusBannerStore, lazyMoshi, serverDrivenStore, analyticsLogger);
    }

    public BaseSdActivitySingletons_Factory(Provider<ExperimentsStore> experimentsStore, Provider<IacStatusBannerStore> iacStatusBannerStore, Provider<LazyMoshi> moshi, Provider<ServerDrivenStore> sdStore, Provider<AnalyticsLogger> analytics) {
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

    @Override // javax.inject.Provider
    public BaseSdActivitySingletons get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IacStatusBannerStore iacStatusBannerStore = this.iacStatusBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacStatusBannerStore, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        ServerDrivenStore serverDrivenStore = this.sdStore.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        return companion.newInstance(experimentsStore, iacStatusBannerStore, lazyMoshi, serverDrivenStore, analyticsLogger);
    }

    /* compiled from: BaseSdActivitySingletons_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "sdStore", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "newInstance", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseSdActivitySingletons_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<IacStatusBannerStore> iacStatusBannerStore, Provider<LazyMoshi> moshi, Provider<ServerDrivenStore> sdStore, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(sdStore, "sdStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new BaseSdActivitySingletons_Factory(experimentsStore, iacStatusBannerStore, moshi, sdStore, analytics);
        }

        @JvmStatic
        public final BaseSdActivitySingletons newInstance(ExperimentsStore experimentsStore, IacStatusBannerStore iacStatusBannerStore, LazyMoshi moshi, ServerDrivenStore sdStore, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(sdStore, "sdStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new BaseSdActivitySingletons(experimentsStore, iacStatusBannerStore, moshi, sdStore, analytics);
        }
    }
}
