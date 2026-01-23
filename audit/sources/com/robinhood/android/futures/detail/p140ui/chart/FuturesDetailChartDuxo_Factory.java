package com.robinhood.android.futures.detail.p140ui.chart;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.futures.FuturesSettingsStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo;", "futuresContractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "visitedMacPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesDetailChartDuxo_Factory implements Factory<FuturesDetailChartDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FuturesChartsServiceManager> futuresChartsServiceManager;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<FuturesSettingsStore> futuresSettingsStore;
    private final Provider<BooleanPreference> visitedMacPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesDetailChartDuxo_Factory create(Provider<FuturesContractStore> provider, Provider<FuturesQuoteStore> provider2, Provider<FuturesSettingsStore> provider3, Provider<FuturesChartsServiceManager> provider4, Provider<ExperimentsStore> provider5, Provider<BooleanPreference> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final FuturesDetailChartDuxo newInstance(FuturesContractStore futuresContractStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesChartsServiceManager futuresChartsServiceManager, ExperimentsStore experimentsStore, BooleanPreference booleanPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(futuresContractStore, futuresQuoteStore, futuresSettingsStore, futuresChartsServiceManager, experimentsStore, booleanPreference, duxoBundle);
    }

    public FuturesDetailChartDuxo_Factory(Provider<FuturesContractStore> futuresContractStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesSettingsStore> futuresSettingsStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> visitedMacPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(visitedMacPref, "visitedMacPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresContractStore = futuresContractStore;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresSettingsStore = futuresSettingsStore;
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.experimentsStore = experimentsStore;
        this.visitedMacPref = visitedMacPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FuturesDetailChartDuxo get() {
        Companion companion = INSTANCE;
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesSettingsStore futuresSettingsStore = this.futuresSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresSettingsStore, "get(...)");
        FuturesChartsServiceManager futuresChartsServiceManager = this.futuresChartsServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresChartsServiceManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.visitedMacPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(futuresContractStore, futuresQuoteStore, futuresSettingsStore, futuresChartsServiceManager, experimentsStore, booleanPreference, duxoBundle);
    }

    /* compiled from: FuturesDetailChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo_Factory;", "futuresContractStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresSettingsStore", "Lcom/robinhood/store/futures/FuturesSettingsStore;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "visitedMacPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesDetailChartDuxo_Factory create(Provider<FuturesContractStore> futuresContractStore, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesSettingsStore> futuresSettingsStore, Provider<FuturesChartsServiceManager> futuresChartsServiceManager, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> visitedMacPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(visitedMacPref, "visitedMacPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesDetailChartDuxo_Factory(futuresContractStore, futuresQuoteStore, futuresSettingsStore, futuresChartsServiceManager, experimentsStore, visitedMacPref, duxoBundle);
        }

        @JvmStatic
        public final FuturesDetailChartDuxo newInstance(FuturesContractStore futuresContractStore, FuturesQuoteStore futuresQuoteStore, FuturesSettingsStore futuresSettingsStore, FuturesChartsServiceManager futuresChartsServiceManager, ExperimentsStore experimentsStore, BooleanPreference visitedMacPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresSettingsStore, "futuresSettingsStore");
            Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(visitedMacPref, "visitedMacPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesDetailChartDuxo(futuresContractStore, futuresQuoteStore, futuresSettingsStore, futuresChartsServiceManager, experimentsStore, visitedMacPref, duxoBundle);
        }
    }
}
