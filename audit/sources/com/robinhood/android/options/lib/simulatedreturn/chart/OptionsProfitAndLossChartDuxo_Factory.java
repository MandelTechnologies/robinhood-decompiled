package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitAndLossChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartDuxo_Factory implements Factory<OptionsProfitAndLossChartDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore;
    private final Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore;
    private final Provider<OptionsProfitAndLossChartStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsProfitAndLossChartDuxo_Factory create(Provider<EventLogger> provider, Provider<OptionMarketHoursStore> provider2, Provider<OptionQuoteStore> provider3, Provider<OptionSimulatedReturnsStore> provider4, Provider<OptionUnderlyingQuoteStore> provider5, Provider<OptionsProfitAndLossChartStateProvider> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final OptionsProfitAndLossChartDuxo newInstance(EventLogger eventLogger, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProfitAndLossChartStateProvider optionsProfitAndLossChartStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(eventLogger, optionMarketHoursStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsProfitAndLossChartStateProvider, duxoBundle);
    }

    public OptionsProfitAndLossChartDuxo_Factory(Provider<EventLogger> eventLogger, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsProfitAndLossChartStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OptionsProfitAndLossChartDuxo get() {
        Companion companion = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSimulatedReturnsStore optionSimulatedReturnsStore = this.optionSimulatedReturnsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnsStore, "get(...)");
        OptionUnderlyingQuoteStore optionUnderlyingQuoteStore = this.optionUnderlyingQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUnderlyingQuoteStore, "get(...)");
        OptionsProfitAndLossChartStateProvider optionsProfitAndLossChartStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsProfitAndLossChartStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(eventLogger, optionMarketHoursStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsProfitAndLossChartStateProvider, duxoBundle);
    }

    /* compiled from: OptionsProfitAndLossChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo_Factory;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDuxo;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsProfitAndLossChartDuxo_Factory create(Provider<EventLogger> eventLogger, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsProfitAndLossChartStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsProfitAndLossChartDuxo_Factory(eventLogger, optionMarketHoursStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OptionsProfitAndLossChartDuxo newInstance(EventLogger eventLogger, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsProfitAndLossChartStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsProfitAndLossChartDuxo(eventLogger, optionMarketHoursStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, stateProvider, duxoBundle);
        }
    }
}
