package com.robinhood.android.equitydetail.p123ui.chartsettings;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartSettingsBottomSheetFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "showCandlestickChartPrefState", "Lcom/robinhood/prefs/BooleanPreference;", "showExtendedHoursChartPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ChartSettingsBottomSheetFragment_MembersInjector implements MembersInjector<ChartSettingsBottomSheetFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Navigator> navigator;
    private final Provider<BooleanPreference> showCandlestickChartPrefState;
    private final Provider<BooleanPreference> showExtendedHoursChartPref;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ChartSettingsBottomSheetFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<ExperimentsStore> provider3, Provider<BooleanPreference> provider4, Provider<BooleanPreference> provider5, Provider<EventLogger> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectEventLogger(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(chartSettingsBottomSheetFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(chartSettingsBottomSheetFragment, experimentsStore);
    }

    @JvmStatic
    @ShowCandlestickChartPref
    public static final void injectShowCandlestickChartPrefState(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShowCandlestickChartPrefState(chartSettingsBottomSheetFragment, booleanPreference);
    }

    @JvmStatic
    @ShowExtendedHoursChartPref
    public static final void injectShowExtendedHoursChartPref(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShowExtendedHoursChartPref(chartSettingsBottomSheetFragment, booleanPreference);
    }

    public ChartSettingsBottomSheetFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> showCandlestickChartPrefState, Provider<BooleanPreference> showExtendedHoursChartPref, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
        Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.singletons = singletons;
        this.navigator = navigator;
        this.experimentsStore = experimentsStore;
        this.showCandlestickChartPrefState = showCandlestickChartPrefState;
        this.showExtendedHoursChartPref = showExtendedHoursChartPref;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChartSettingsBottomSheetFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        BaseBottomSheetDialogFragment_MembersInjector.Companion companion2 = BaseBottomSheetDialogFragment_MembersInjector.INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        Companion companion3 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion3.injectExperimentsStore(instance, experimentsStore);
        BooleanPreference booleanPreference = this.showCandlestickChartPrefState.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectShowCandlestickChartPrefState(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.showExtendedHoursChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion3.injectShowExtendedHoursChartPref(instance, booleanPreference2);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
    }

    /* compiled from: ChartSettingsBottomSheetFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "showCandlestickChartPrefState", "Lcom/robinhood/prefs/BooleanPreference;", "showExtendedHoursChartPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "injectExperimentsStore", "", "instance", "injectShowCandlestickChartPrefState", "injectShowExtendedHoursChartPref", "injectEventLogger", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ChartSettingsBottomSheetFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<ExperimentsStore> experimentsStore, Provider<BooleanPreference> showCandlestickChartPrefState, Provider<BooleanPreference> showExtendedHoursChartPref, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
            Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new ChartSettingsBottomSheetFragment_MembersInjector(singletons, navigator, experimentsStore, showCandlestickChartPrefState, showExtendedHoursChartPref, eventLogger);
        }

        @JvmStatic
        public final void injectExperimentsStore(ChartSettingsBottomSheetFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        @ShowCandlestickChartPref
        public final void injectShowCandlestickChartPrefState(ChartSettingsBottomSheetFragment instance, BooleanPreference showCandlestickChartPrefState) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
            instance.setShowCandlestickChartPrefState(showCandlestickChartPrefState);
        }

        @JvmStatic
        @ShowExtendedHoursChartPref
        public final void injectShowExtendedHoursChartPref(ChartSettingsBottomSheetFragment instance, BooleanPreference showExtendedHoursChartPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showExtendedHoursChartPref, "showExtendedHoursChartPref");
            instance.setShowExtendedHoursChartPref(showExtendedHoursChartPref);
        }

        @JvmStatic
        public final void injectEventLogger(ChartSettingsBottomSheetFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
