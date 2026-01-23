package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOverviewSettingsBinding;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.overview.RewardsOverviewBottomSheetDialogFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsOverviewSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u001a\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010-H\u0016J\u001a\u00104\u001a\u00020\u00072\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020&H\u0002J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020$H\u0002J\t\u0010;\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewSettingsBinding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "pendingAmount", "", "pauseRoundupDialogMessage", "", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onPrimaryButtonClicked", "dialogId", "", "passthroughArgs", "onSecondaryButtonClicked", "bind", "state", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsViewState;", "showPauseRoundupsBottomSheet", "showPauseRoundupsSuccessBottomSheet", "message", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOverviewSettingsFragment extends BaseFragment implements RegionGated, RhBottomSheetDialogFragment.OnClickListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Context loggingContext;
    private final Screen loggingScreen;
    private CharSequence pauseRoundupDialogMessage;
    private String pendingAmount;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOverviewSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewSettingsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return true;
    }

    public RewardsOverviewSettingsFragment() {
        super(C10176R.layout.fragment_rewards_overview_settings);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_SETTINGS, null, null, null, 14, null);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getRoundupGeneralContext();
        this.duxo = OldDuxos.oldDuxo(this, RewardsOverviewSettingsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RewardsOverviewSettingsFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final RewardsOverviewSettingsDuxo getDuxo() {
        return (RewardsOverviewSettingsDuxo) this.duxo.getValue();
    }

    private final FragmentRewardsOverviewSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsOverviewSettingsBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsRowView rewardsOverviewAssetSelectionRow = getBinding().rewardsOverviewAssetSelectionRow;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewAssetSelectionRow, "rewardsOverviewAssetSelectionRow");
        OnClickListeners.onClick(rewardsOverviewAssetSelectionRow, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOverviewSettingsFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        final RdsToggleView rdsToggleView = getBinding().rewardsOverviewRoundupToggleRow;
        rdsToggleView.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOverviewSettingsFragment.onViewCreated$lambda$3$lambda$2(rdsToggleView, this, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102723(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RewardsOverviewSettingsFragment rewardsOverviewSettingsFragment) {
        Navigator navigator = rewardsOverviewSettingsFragment.getNavigator();
        android.content.Context contextRequireContext = rewardsOverviewSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RewardsOnboarding(LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(RdsToggleView rdsToggleView, RewardsOverviewSettingsFragment rewardsOverviewSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        if (z) {
            Navigator navigator = rewardsOverviewSettingsFragment.getNavigator();
            android.content.Context contextRequireContext = rewardsOverviewSettingsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RewardsOnboarding(LegacyIntentKey.RewardsOnboarding.Action.RESUME_ENROLLMENT), null, false, null, null, 60, null);
        } else {
            rewardsOverviewSettingsFragment.showPauseRoundupsBottomSheet();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsOverviewSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewSettingsFragment$onViewCreated$3 */
    /* synthetic */ class C102723 extends FunctionReferenceImpl implements Function1<RewardsOverviewSettingsViewState, Unit> {
        C102723(Object obj) {
            super(1, obj, RewardsOverviewSettingsFragment.class, "bind", "bind(Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOverviewSettingsViewState rewardsOverviewSettingsViewState) throws Resources.NotFoundException {
            invoke2(rewardsOverviewSettingsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOverviewSettingsViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOverviewSettingsFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId != C10176R.id.dialog_id_rewards_pause_roundups) {
            return true;
        }
        getDuxo().pauseRoundup();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RewardsOverviewSettingsViewState state) throws Resources.NotFoundException {
        CharSequence charSequenceConsume;
        this.pendingAmount = state.getPendingRoundupAmountText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.pauseRoundupDialogMessage = state.pauseRoundupDialogMessage(resources);
        RdsRowView rdsRowView = getBinding().rewardsOverviewAssetSelectionRow;
        rdsRowView.setEnabled(state.isAssetSelectionRowEnabled());
        rdsRowView.setSecondaryText(state.getAssetSymbol());
        RdsToggleView rdsToggleView = getBinding().rewardsOverviewRoundupToggleRow;
        rdsToggleView.setEnabled(this.pendingAmount != null);
        rdsToggleView.setCheckedProgrammatically(state.isRoundupToggleOn());
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        UiEvent<CharSequence> uiEventPauseRoundupSuccessWithDialogMessageUiEvent = state.pauseRoundupSuccessWithDialogMessageUiEvent(resources2);
        if (uiEventPauseRoundupSuccessWithDialogMessageUiEvent != null && (charSequenceConsume = uiEventPauseRoundupSuccessWithDialogMessageUiEvent.consume()) != null) {
            showPauseRoundupsSuccessBottomSheet(charSequenceConsume);
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getPauseRoundupErrorUiEvent());
    }

    private final void showPauseRoundupsBottomSheet() {
        RewardsOverviewBottomSheetDialogFragment rewardsOverviewBottomSheetDialogFragment = (RewardsOverviewBottomSheetDialogFragment) RewardsOverviewBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C10176R.id.dialog_id_rewards_pause_roundups, getString(C10176R.string.pause_roundups_dialog_title), null, this.pauseRoundupDialogMessage, null, getString(C10176R.string.pause_roundups_dialog_primary_button), null, getString(C11048R.string.general_label_dismiss), null, false, false, null, null, null, false, false, false, false, null, null, null, 2096980, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rewardsOverviewBottomSheetDialogFragment.show(childFragmentManager, "pauseRoundupsBottomSheet");
    }

    private final void showPauseRoundupsSuccessBottomSheet(CharSequence message) {
        RewardsOverviewBottomSheetDialogFragment rewardsOverviewBottomSheetDialogFragment = (RewardsOverviewBottomSheetDialogFragment) RewardsOverviewBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C10176R.id.dialog_id_rewards_pause_roundups_success, getString(C10176R.string.pause_roundups_success_dialog_title), null, message, null, getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097108, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rewardsOverviewBottomSheetDialogFragment.show(childFragmentManager, "pauseRoundupsSuccessBottomSheet");
    }

    /* compiled from: RewardsOverviewSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsSettings;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewSettingsFragment;", "key", "newInstance", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RoundupRewardsSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RewardsOverviewSettingsFragment createFragment(LegacyFragmentKey.RoundupRewardsSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance();
        }

        private final RewardsOverviewSettingsFragment newInstance() {
            return new RewardsOverviewSettingsFragment();
        }
    }
}
