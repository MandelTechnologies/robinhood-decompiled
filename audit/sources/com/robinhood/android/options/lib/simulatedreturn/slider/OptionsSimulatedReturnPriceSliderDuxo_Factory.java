package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.QuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnPriceSliderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnPriceSliderDuxo_Factory implements Factory<OptionsSimulatedReturnPriceSliderDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<IndexStore> indexStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<OptionsSimulatedReturnPriceSliderStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsSimulatedReturnPriceSliderDuxo_Factory create(Provider<EventLogger> provider, Provider<IndexStore> provider2, Provider<QuoteStore> provider3, Provider<OptionsSimulatedReturnPriceSliderStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final OptionsSimulatedReturnPriceSliderDuxo newInstance(EventLogger eventLogger, IndexStore indexStore, QuoteStore quoteStore, OptionsSimulatedReturnPriceSliderStateProvider optionsSimulatedReturnPriceSliderStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(eventLogger, indexStore, quoteStore, optionsSimulatedReturnPriceSliderStateProvider, duxoBundle);
    }

    public OptionsSimulatedReturnPriceSliderDuxo_Factory(Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<QuoteStore> quoteStore, Provider<OptionsSimulatedReturnPriceSliderStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.quoteStore = quoteStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OptionsSimulatedReturnPriceSliderDuxo get() {
        Companion companion = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        OptionsSimulatedReturnPriceSliderStateProvider optionsSimulatedReturnPriceSliderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsSimulatedReturnPriceSliderStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(eventLogger, indexStore, quoteStore, optionsSimulatedReturnPriceSliderStateProvider, duxoBundle);
    }

    /* compiled from: OptionsSimulatedReturnPriceSliderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo_Factory;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "stateProvider", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnPriceSliderDuxo;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsSimulatedReturnPriceSliderDuxo_Factory create(Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<QuoteStore> quoteStore, Provider<OptionsSimulatedReturnPriceSliderStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsSimulatedReturnPriceSliderDuxo_Factory(eventLogger, indexStore, quoteStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OptionsSimulatedReturnPriceSliderDuxo newInstance(EventLogger eventLogger, IndexStore indexStore, QuoteStore quoteStore, OptionsSimulatedReturnPriceSliderStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsSimulatedReturnPriceSliderDuxo(eventLogger, indexStore, quoteStore, stateProvider, duxoBundle);
        }
    }
}
