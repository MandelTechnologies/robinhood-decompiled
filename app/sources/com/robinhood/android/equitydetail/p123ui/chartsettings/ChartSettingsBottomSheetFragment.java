package com.robinhood.android.equitydetail.p123ui.chartsettings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsTextButtonRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentChartSettingsBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ChartSettingsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 72\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0006\u0010-\u001a\u00020%J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0002J\u0014\u00103\u001a\u00020%*\u00020\u001f2\u0006\u00104\u001a\u000205H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentChartSettingsBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentChartSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Callbacks;", "callbacks$delegate", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "showCandlestickChartPrefState", "Lcom/robinhood/prefs/BooleanPreference;", "getShowCandlestickChartPrefState", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowCandlestickChartPrefState", "(Lcom/robinhood/prefs/BooleanPreference;)V", "showExtendedHoursChartPref", "getShowExtendedHoursChartPref", "setShowExtendedHoursChartPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "initializeHoursSection", "initializeChartTypeSection", "initializeChartEducationTour", "shouldDisplay", "", "logChartTypeToggled", "id", "", "Callbacks", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChartSettingsBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    @ShowCandlestickChartPref
    public BooleanPreference showCandlestickChartPrefState;

    @ShowExtendedHoursChartPref
    public BooleanPreference showExtendedHoursChartPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChartSettingsBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentChartSettingsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ChartSettingsBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChartSettingsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Callbacks;", "", "launchChartEducationTour", "", "tourName", "", "onFinish", "Lkotlin/Function0;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchChartEducationTour(String tourName, Function0<Unit> onFinish);
    }

    public ChartSettingsBottomSheetFragment() {
        super(C15314R.layout.fragment_chart_settings);
        this.binding = ViewBinding5.viewBinding(this, ChartSettingsBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final FragmentChartSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChartSettingsBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final BooleanPreference getShowCandlestickChartPrefState() {
        BooleanPreference booleanPreference = this.showCandlestickChartPrefState;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showCandlestickChartPrefState");
        return null;
    }

    public final void setShowCandlestickChartPrefState(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showCandlestickChartPrefState = booleanPreference;
    }

    public final BooleanPreference getShowExtendedHoursChartPref() {
        BooleanPreference booleanPreference = this.showExtendedHoursChartPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showExtendedHoursChartPref");
        return null;
    }

    public final void setShowExtendedHoursChartPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showExtendedHoursChartPref = booleanPreference;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        ScarletManager scarletManager;
        Observable<DayNightOverlay> observableIsDayChanges;
        Observable observableObserveOnMainThread;
        ScopedObservable scopedObservableBind$default;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper != null && (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) != null && (observableIsDayChanges = DayNightChanges.isDayChanges(scarletManager)) != null && (observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(observableIsDayChanges)) != null && (scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(this, observableObserveOnMainThread, (LifecycleEvent) null, 1, (Object) null)) != null) {
            scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChartSettingsBottomSheetFragment.onViewCreated$lambda$1(this.f$0, (DayNightOverlay) obj);
                }
            });
        }
        bind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, DayNightOverlay theme) {
        int color;
        Intrinsics.checkNotNullParameter(theme, "theme");
        NestedScrollView nestedScrollView = chartSettingsBottomSheetFragment.getBinding().scrollView;
        if (DayNightChanges.isDay(theme)) {
            color = chartSettingsBottomSheetFragment.requireContext().getColor(C20690R.color.mobius_background_1_day);
        } else {
            color = chartSettingsBottomSheetFragment.requireContext().getColor(C20690R.color.mobius_background_2_night);
        }
        nestedScrollView.setBackgroundColor(color);
        return Unit.INSTANCE;
    }

    public final void bind() throws Resources.NotFoundException {
        initializeHoursSection();
        initializeChartTypeSection();
        Screen eventScreen = ((LegacyDialogFragmentKey.ChartSettings) INSTANCE.getArgs((Fragment) this)).getEventScreen();
        initializeChartEducationTour((eventScreen != null ? eventScreen.getName() : null) != Screen.Name.EQUITY_ADVANCED_CHARTS);
    }

    private final void initializeHoursSection() throws Resources.NotFoundException {
        RdsToggleView rdsToggleView = getBinding().chartSettingsHoursRow;
        Boolean showExtendedHours = ((LegacyDialogFragmentKey.ChartSettings) INSTANCE.getArgs((Fragment) this)).getShowExtendedHours();
        rdsToggleView.setChecked(showExtendedHours != null ? showExtendedHours.booleanValue() : getShowExtendedHoursChartPref().get());
        getBinding().chartSettingsHoursRow.onCheckedChanged(new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChartSettingsBottomSheetFragment.initializeHoursSection$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getBinding().hoursSectionTitle.setText(getText(C15314R.string.chart_settings_more_options_label_adt));
        getBinding().chartSettingsHoursRow.setPrimaryText(getText(C15314R.string.chart_settings_extended_hours_label_adt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeHoursSection$lambda$2(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, boolean z) {
        chartSettingsBottomSheetFragment.getShowExtendedHoursChartPref().set(z);
        return Unit.INSTANCE;
    }

    private final void initializeChartTypeSection() {
        int i;
        if (getShowCandlestickChartPrefState().get()) {
            i = C15314R.id.chart_settings_candlestick_selection;
        } else {
            i = C15314R.id.chart_settings_line_selection;
        }
        getBinding().chartSettingsTypeRadiogroup.check(i);
        getBinding().chartSettingsTypeRadiogroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChartSettingsBottomSheetFragment.initializeChartTypeSection$lambda$3(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        getBinding().chartSettingsTypeTitle.setText(getText(C15314R.string.chart_settings_type_label_adt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeChartTypeSection$lambda$3(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C15314R.id.chart_settings_line_selection) {
            chartSettingsBottomSheetFragment.getShowCandlestickChartPrefState().set(false);
        } else {
            if (i != C15314R.id.chart_settings_candlestick_selection) {
                throw new IllegalStateException(("Unknown id " + i).toString());
            }
            chartSettingsBottomSheetFragment.getShowCandlestickChartPrefState().set(true);
        }
        chartSettingsBottomSheetFragment.logChartTypeToggled(chartSettingsBottomSheetFragment.getEventLogger(), i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeChartEducationTour$initializeTour$lambda$5(final ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, int i, String str) {
        final boolean z = chartSettingsBottomSheetFragment.getShowCandlestickChartPrefState().get();
        chartSettingsBottomSheetFragment.getBinding().chartSettingsTypeRadiogroup.check(i);
        chartSettingsBottomSheetFragment.getCallbacks().launchChartEducationTour(str, new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartSettingsBottomSheetFragment.initializeChartEducationTour$initializeTour$lambda$5$lambda$4(this.f$0, z);
            }
        });
        chartSettingsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeChartEducationTour$initializeTour$lambda$5$lambda$4(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, boolean z) {
        chartSettingsBottomSheetFragment.getShowCandlestickChartPrefState().set(z);
        return Unit.INSTANCE;
    }

    private final void initializeChartEducationTour(boolean shouldDisplay) {
        LinearLayout chartSettingsEducationTourContainer = getBinding().chartSettingsEducationTourContainer;
        Intrinsics.checkNotNullExpressionValue(chartSettingsEducationTourContainer, "chartSettingsEducationTourContainer");
        chartSettingsEducationTourContainer.setVisibility(shouldDisplay ? 0 : 8);
        RdsTextButtonRowView chartSettingsCandlestickChartEducationTour = getBinding().chartSettingsCandlestickChartEducationTour;
        Intrinsics.checkNotNullExpressionValue(chartSettingsCandlestickChartEducationTour, "chartSettingsCandlestickChartEducationTour");
        initializeChartEducationTour$initializeTour(chartSettingsCandlestickChartEducationTour, shouldDisplay, this, EducationTourScreenNames.STOCK_CHART_SETTINGS_CANDLESTICK_PAGE_SCREEN, C15314R.id.chart_settings_candlestick_selection);
        RdsTextButtonRowView chartSettingsLineChartEducationTour = getBinding().chartSettingsLineChartEducationTour;
        Intrinsics.checkNotNullExpressionValue(chartSettingsLineChartEducationTour, "chartSettingsLineChartEducationTour");
        initializeChartEducationTour$initializeTour(chartSettingsLineChartEducationTour, shouldDisplay, this, EducationTourScreenNames.STOCK_CHART_SETTINGS_PAGE_SCREEN, C15314R.id.chart_settings_line_selection);
    }

    private final void logChartTypeToggled(EventLogger eventLogger, int i) {
        String str;
        if (i == C15314R.id.chart_settings_line_selection) {
            str = "line";
        } else if (i != C15314R.id.chart_settings_candlestick_selection) {
            return;
        } else {
            str = "candlesticks";
        }
        String str2 = str;
        Screen eventScreen = ((LegacyDialogFragmentKey.ChartSettings) INSTANCE.getArgs((Fragment) this)).getEventScreen();
        if (eventScreen != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.TOGGLE_PRICE_CHART_TYPE, eventScreen, new Component(Component.ComponentType.RADIO_BUTTON, str2, null, 4, null), null, null, false, 56, null);
        }
    }

    /* compiled from: ChartSettingsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ChartSettings;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "<init>", "()V", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ChartSettingsBottomSheetFragment, LegacyDialogFragmentKey.ChartSettings>, DialogFragmentResolver<LegacyDialogFragmentKey.ChartSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.ChartSettings getArgs(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment) {
            return (LegacyDialogFragmentKey.ChartSettings) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, chartSettingsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChartSettingsBottomSheetFragment newInstance(LegacyDialogFragmentKey.ChartSettings chartSettings) {
            return (ChartSettingsBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, chartSettings);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, LegacyDialogFragmentKey.ChartSettings chartSettings) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, chartSettingsBottomSheetFragment, chartSettings);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.ChartSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) ChartSettingsBottomSheetFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }

    private static final void initializeChartEducationTour$initializeTour(View view, boolean z, final ChartSettingsBottomSheetFragment chartSettingsBottomSheetFragment, final String str, final int i) {
        view.setVisibility(z ? 0 : 8);
        view.setEnabled(z);
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartSettingsBottomSheetFragment.initializeChartEducationTour$initializeTour$lambda$5(this.f$0, i, str);
            }
        });
    }
}
