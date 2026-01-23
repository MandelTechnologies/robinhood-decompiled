package com.robinhood.android.futures.assethome.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.FuturesPerformanceStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeClientServiceImp_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp;", "futuresAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresPerformanceStore", "Lcom/robinhood/store/futures/FuturesPerformanceStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeClientServiceImp_Factory implements Factory<FuturesAssetHomeClientServiceImp> {
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesPerformanceStore> futuresPerformanceStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesAssetHomeClientServiceImp_Factory create(Provider<FuturesAccountStore> provider, Provider<FuturesPerformanceStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FuturesAssetHomeClientServiceImp newInstance(FuturesAccountStore futuresAccountStore, FuturesPerformanceStore futuresPerformanceStore) {
        return INSTANCE.newInstance(futuresAccountStore, futuresPerformanceStore);
    }

    public FuturesAssetHomeClientServiceImp_Factory(Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesPerformanceStore> futuresPerformanceStore) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresPerformanceStore, "futuresPerformanceStore");
        this.futuresAccountStore = futuresAccountStore;
        this.futuresPerformanceStore = futuresPerformanceStore;
    }

    @Override // javax.inject.Provider
    public FuturesAssetHomeClientServiceImp get() {
        Companion companion = INSTANCE;
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesPerformanceStore futuresPerformanceStore = this.futuresPerformanceStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresPerformanceStore, "get(...)");
        return companion.newInstance(futuresAccountStore, futuresPerformanceStore);
    }

    /* compiled from: FuturesAssetHomeClientServiceImp_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp_Factory;", "futuresAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresPerformanceStore", "Lcom/robinhood/store/futures/FuturesPerformanceStore;", "newInstance", "Lcom/robinhood/android/futures/assethome/microgram/FuturesAssetHomeClientServiceImp;", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesAssetHomeClientServiceImp_Factory create(Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesPerformanceStore> futuresPerformanceStore) {
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresPerformanceStore, "futuresPerformanceStore");
            return new FuturesAssetHomeClientServiceImp_Factory(futuresAccountStore, futuresPerformanceStore);
        }

        @JvmStatic
        public final FuturesAssetHomeClientServiceImp newInstance(FuturesAccountStore futuresAccountStore, FuturesPerformanceStore futuresPerformanceStore) {
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresPerformanceStore, "futuresPerformanceStore");
            return new FuturesAssetHomeClientServiceImp(futuresAccountStore, futuresPerformanceStore);
        }
    }
}
