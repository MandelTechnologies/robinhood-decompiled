package com.robinhood.android.assethomes;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeTopAppBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo;", "performanceChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "stateProvider", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AssetHomeTopAppBarDuxo_Factory implements Factory<AssetHomeTopAppBarDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<AssetHomeTopAppBarDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AssetHomeTopAppBarDuxo_Factory create(Provider<PerformanceChartStore> provider, Provider<AssetHomeTopAppBarDuxo3> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AssetHomeTopAppBarDuxo newInstance(PerformanceChartStore performanceChartStore, AssetHomeTopAppBarDuxo3 assetHomeTopAppBarDuxo3, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(performanceChartStore, assetHomeTopAppBarDuxo3, duxoBundle);
    }

    public AssetHomeTopAppBarDuxo_Factory(Provider<PerformanceChartStore> performanceChartStore, Provider<AssetHomeTopAppBarDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.performanceChartStore = performanceChartStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AssetHomeTopAppBarDuxo get() {
        Companion companion = INSTANCE;
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        AssetHomeTopAppBarDuxo3 assetHomeTopAppBarDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(assetHomeTopAppBarDuxo3, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(performanceChartStore, assetHomeTopAppBarDuxo3, duxoBundle);
    }

    /* compiled from: AssetHomeTopAppBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo_Factory;", "performanceChartStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "stateProvider", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/assethomes/AssetHomeTopAppBarDuxo;", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetHomeTopAppBarDuxo_Factory create(Provider<PerformanceChartStore> performanceChartStore, Provider<AssetHomeTopAppBarDuxo3> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AssetHomeTopAppBarDuxo_Factory(performanceChartStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AssetHomeTopAppBarDuxo newInstance(PerformanceChartStore performanceChartStore, AssetHomeTopAppBarDuxo3 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AssetHomeTopAppBarDuxo(performanceChartStore, stateProvider, duxoBundle);
        }
    }
}
