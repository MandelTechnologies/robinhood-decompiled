package com.robinhood.android.taxcenter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.TaxCenterStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCenterDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/taxcenter/TaxCenterDuxo;", "taxCenterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/taxcenter/TaxCenterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TaxCenterDuxo_Factory implements Factory<TaxCenterDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<TaxCenterViewState2> stateProvider;
    private final Provider<TaxCenterStore> taxCenterStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final TaxCenterDuxo_Factory create(Provider<TaxCenterStore> provider, Provider<RegionGateProvider> provider2, Provider<TaxCenterViewState2> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final TaxCenterDuxo newInstance(TaxCenterStore taxCenterStore, RegionGateProvider regionGateProvider, TaxCenterViewState2 taxCenterViewState2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(taxCenterStore, regionGateProvider, taxCenterViewState2, duxoBundle);
    }

    public TaxCenterDuxo_Factory(Provider<TaxCenterStore> taxCenterStore, Provider<RegionGateProvider> regionGateProvider, Provider<TaxCenterViewState2> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(taxCenterStore, "taxCenterStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.taxCenterStore = taxCenterStore;
        this.regionGateProvider = regionGateProvider;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public TaxCenterDuxo get() {
        Companion companion = INSTANCE;
        TaxCenterStore taxCenterStore = this.taxCenterStore.get();
        Intrinsics.checkNotNullExpressionValue(taxCenterStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        TaxCenterViewState2 taxCenterViewState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(taxCenterViewState2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(taxCenterStore, regionGateProvider, taxCenterViewState2, duxoBundle);
    }

    /* compiled from: TaxCenterDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/taxcenter/TaxCenterDuxo_Factory;", "taxCenterStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/taxcenter/TaxCenterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/taxcenter/TaxCenterDuxo;", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TaxCenterDuxo_Factory create(Provider<TaxCenterStore> taxCenterStore, Provider<RegionGateProvider> regionGateProvider, Provider<TaxCenterViewState2> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(taxCenterStore, "taxCenterStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TaxCenterDuxo_Factory(taxCenterStore, regionGateProvider, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final TaxCenterDuxo newInstance(TaxCenterStore taxCenterStore, RegionGateProvider regionGateProvider, TaxCenterViewState2 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(taxCenterStore, "taxCenterStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new TaxCenterDuxo(taxCenterStore, regionGateProvider, stateProvider, duxoBundle);
        }
    }
}
