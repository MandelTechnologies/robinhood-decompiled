package com.robinhood.android.equityscreener.filters;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorFilterDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndicatorFilterDuxo_Factory implements Factory<IndicatorFilterDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<IndicatorsStore> indicatorsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ScanStore> scanStore;
    private final Provider<ScreenersStore> screenersStore;
    private final Provider<IndicatorFilterViewState3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndicatorFilterDuxo_Factory create(Provider<DuxoBundle> provider, Provider<SavedStateHandle> provider2, Provider<IndicatorsStore> provider3, Provider<ScanStore> provider4, Provider<ScreenersStore> provider5, Provider<EventLogger> provider6, Provider<IndicatorFilterViewState3> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final IndicatorFilterDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, IndicatorsStore indicatorsStore, ScanStore scanStore, ScreenersStore screenersStore, EventLogger eventLogger, IndicatorFilterViewState3 indicatorFilterViewState3) {
        return INSTANCE.newInstance(duxoBundle, savedStateHandle, indicatorsStore, scanStore, screenersStore, eventLogger, indicatorFilterViewState3);
    }

    public IndicatorFilterDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<IndicatorsStore> indicatorsStore, Provider<ScanStore> scanStore, Provider<ScreenersStore> screenersStore, Provider<EventLogger> eventLogger, Provider<IndicatorFilterViewState3> stateProvider) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(scanStore, "scanStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.indicatorsStore = indicatorsStore;
        this.scanStore = scanStore;
        this.screenersStore = screenersStore;
        this.eventLogger = eventLogger;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndicatorFilterDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        IndicatorsStore indicatorsStore = this.indicatorsStore.get();
        Intrinsics.checkNotNullExpressionValue(indicatorsStore, "get(...)");
        ScanStore scanStore = this.scanStore.get();
        Intrinsics.checkNotNullExpressionValue(scanStore, "get(...)");
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        IndicatorFilterViewState3 indicatorFilterViewState3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indicatorFilterViewState3, "get(...)");
        return companion.newInstance(duxoBundle, savedStateHandle, indicatorsStore, scanStore, screenersStore, eventLogger, indicatorFilterViewState3);
    }

    /* compiled from: IndicatorFilterDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterProvider;", "newInstance", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndicatorFilterDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<IndicatorsStore> indicatorsStore, Provider<ScanStore> scanStore, Provider<ScreenersStore> screenersStore, Provider<EventLogger> eventLogger, Provider<IndicatorFilterViewState3> stateProvider) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(scanStore, "scanStore");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndicatorFilterDuxo_Factory(duxoBundle, savedStateHandle, indicatorsStore, scanStore, screenersStore, eventLogger, stateProvider);
        }

        @JvmStatic
        public final IndicatorFilterDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, IndicatorsStore indicatorsStore, ScanStore scanStore, ScreenersStore screenersStore, EventLogger eventLogger, IndicatorFilterViewState3 stateProvider) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(scanStore, "scanStore");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndicatorFilterDuxo(duxoBundle, savedStateHandle, indicatorsStore, scanStore, screenersStore, eventLogger, stateProvider);
        }
    }
}
