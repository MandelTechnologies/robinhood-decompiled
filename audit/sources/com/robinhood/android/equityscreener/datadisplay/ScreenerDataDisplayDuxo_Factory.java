package com.robinhood.android.equityscreener.datadisplay;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equityscreener.datadisplay.ScreenerDataDisplayDuxo_MembersInjector;
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

/* compiled from: ScreenerDataDisplayDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayStateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ScreenerDataDisplayDuxo_Factory implements Factory<ScreenerDataDisplayDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<IndicatorsStore> indicatorsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ScanStore> scanStore;
    private final Provider<ScreenersStore> screenersStore;
    private final Provider<ScreenerDataDisplayViewState3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ScreenerDataDisplayDuxo_Factory create(Provider<DuxoBundle> provider, Provider<SavedStateHandle> provider2, Provider<ScreenerDataDisplayViewState3> provider3, Provider<EventLogger> provider4, Provider<IndicatorsStore> provider5, Provider<ScreenersStore> provider6, Provider<ScanStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ScreenerDataDisplayDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ScreenerDataDisplayViewState3 screenerDataDisplayViewState3, EventLogger eventLogger) {
        return INSTANCE.newInstance(duxoBundle, savedStateHandle, screenerDataDisplayViewState3, eventLogger);
    }

    public ScreenerDataDisplayDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<ScreenerDataDisplayViewState3> stateProvider, Provider<EventLogger> eventLogger, Provider<IndicatorsStore> indicatorsStore, Provider<ScreenersStore> screenersStore, Provider<ScanStore> scanStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(scanStore, "scanStore");
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.eventLogger = eventLogger;
        this.indicatorsStore = indicatorsStore;
        this.screenersStore = screenersStore;
        this.scanStore = scanStore;
    }

    @Override // javax.inject.Provider
    public ScreenerDataDisplayDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        ScreenerDataDisplayViewState3 screenerDataDisplayViewState3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(screenerDataDisplayViewState3, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ScreenerDataDisplayDuxo screenerDataDisplayDuxoNewInstance = companion.newInstance(duxoBundle, savedStateHandle, screenerDataDisplayViewState3, eventLogger);
        ScreenerDataDisplayDuxo_MembersInjector.Companion companion2 = ScreenerDataDisplayDuxo_MembersInjector.INSTANCE;
        IndicatorsStore indicatorsStore = this.indicatorsStore.get();
        Intrinsics.checkNotNullExpressionValue(indicatorsStore, "get(...)");
        companion2.injectIndicatorsStore(screenerDataDisplayDuxoNewInstance, indicatorsStore);
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        companion2.injectScreenersStore(screenerDataDisplayDuxoNewInstance, screenersStore);
        ScanStore scanStore = this.scanStore.get();
        Intrinsics.checkNotNullExpressionValue(scanStore, "get(...)");
        companion2.injectScanStore(screenerDataDisplayDuxoNewInstance, scanStore);
        return screenerDataDisplayDuxoNewInstance;
    }

    /* compiled from: ScreenerDataDisplayDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayStateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "newInstance", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ScreenerDataDisplayDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<ScreenerDataDisplayViewState3> stateProvider, Provider<EventLogger> eventLogger, Provider<IndicatorsStore> indicatorsStore, Provider<ScreenersStore> screenersStore, Provider<ScanStore> scanStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(scanStore, "scanStore");
            return new ScreenerDataDisplayDuxo_Factory(duxoBundle, savedStateHandle, stateProvider, eventLogger, indicatorsStore, screenersStore, scanStore);
        }

        @JvmStatic
        public final ScreenerDataDisplayDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ScreenerDataDisplayViewState3 stateProvider, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new ScreenerDataDisplayDuxo(duxoBundle, savedStateHandle, stateProvider, eventLogger);
        }
    }
}
