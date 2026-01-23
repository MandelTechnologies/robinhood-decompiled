package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsOverviewV2Binding;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.overview.RewardsOverviewBottomSheetDialogFragment;
import com.robinhood.android.cash.rewards.p074ui.overview.p075v2.RewardsOverviewV2ViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
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

/* compiled from: RewardsOverviewV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001DB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0018\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020#H\u0016J\u001a\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020#H\u0002J\t\u0010>\u001a\u00020\u0019H\u0096\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Fragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "<init>", "()V", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewV2Binding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewV2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onRecentHistoryShowAllClicked", "onSecondaryButtonClicked", "dialogId", "", "passthroughArgs", "bind", "state", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState;", "showPendingRoundupsBottomSheet", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOverviewV2Fragment extends BaseFragment implements RegionGated, UnifiedHistoryView.Callbacks, RhBottomSheetDialogFragment.OnClickListener {
    private static final int COIN_ANIMATION_LOOP_END_FRAME = 480;
    private static final int COIN_ANIMATION_LOOP_START_FRAME = 60;
    private static final String DISCLOSURE_URL = "https://cdn.robinhood.com/assets/robinhood/legal/robinhood-multiple-entity-disclosure.pdf";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Context loggingContext;
    private final Screen loggingScreen;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOverviewV2Fragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsOverviewV2Binding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardsOverviewV2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RewardsOverviewV2ViewState.EligibleTransactionMessageState.values().length];
            try {
                iArr[RewardsOverviewV2ViewState.EligibleTransactionMessageState.ROUNDUP_PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsOverviewV2ViewState.EligibleTransactionMessageState.NO_TRANSACTION_NO_ROUNDUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsOverviewV2ViewState.EligibleTransactionMessageState.NO_TRANSACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.doOnTransactionDetailRequested(this, historyEvent);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.onSummaryBadgeClicked(this, historyEvent);
    }

    public RewardsOverviewV2Fragment() {
        super(C10176R.layout.fragment_rewards_overview_v2);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_HUB, null, null, null, 14, null);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getRoundupGeneralContext();
        this.duxo = OldDuxos.oldDuxo(this, RewardsOverviewV2Duxo.class);
        this.binding = ViewBinding5.viewBinding(this, RewardsOverviewV2Fragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    private final RewardsOverviewV2Duxo getDuxo() {
        return (RewardsOverviewV2Duxo) this.duxo.getValue();
    }

    private final FragmentRewardsOverviewV2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsOverviewV2Binding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
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
        requireBaseActivity().showBackArrowIcon();
        setHasOptionsMenu(true);
        RdsRippleContainerView rewardsOverviewWeeklyHeldBanner = getBinding().rewardsOverviewWeeklyHeldBanner;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewWeeklyHeldBanner, "rewardsOverviewWeeklyHeldBanner");
        OnClickListeners.onClick(rewardsOverviewWeeklyHeldBanner, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Fragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOverviewV2Fragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsTextButton rewardsOverviewResumeRoundupButton = getBinding().rewardsOverviewResumeRoundupButton;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewResumeRoundupButton, "rewardsOverviewResumeRoundupButton");
        OnClickListeners.onClick(rewardsOverviewResumeRoundupButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Fragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOverviewV2Fragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsTextButton rewardsOverviewDisclosureButton = getBinding().rewardsOverviewDisclosureButton;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewDisclosureButton, "rewardsOverviewDisclosureButton");
        OnClickListeners.onClick(rewardsOverviewDisclosureButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Fragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsOverviewV2Fragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        getBinding().rewardsOverviewInvestedRoundups.setCallbacks(this);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102794(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RewardsOverviewV2Fragment rewardsOverviewV2Fragment) {
        rewardsOverviewV2Fragment.showPendingRoundupsBottomSheet();
        EventLogger.DefaultImpls.logTap$default(rewardsOverviewV2Fragment.getEventLogger(), UserInteractionEventData.Action.VIEW_ROUNDUP_SET_ASIDE_FAQ, rewardsOverviewV2Fragment.loggingScreen, null, null, rewardsOverviewV2Fragment.loggingContext, false, 44, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(RewardsOverviewV2Fragment rewardsOverviewV2Fragment) {
        Navigator navigator = rewardsOverviewV2Fragment.getNavigator();
        android.content.Context contextRequireContext = rewardsOverviewV2Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RewardsOnboarding(LegacyIntentKey.RewardsOnboarding.Action.RESUME_ENROLLMENT), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RewardsOverviewV2Fragment rewardsOverviewV2Fragment) {
        WebUtils.viewUrl$default(rewardsOverviewV2Fragment.requireContext(), DISCLOSURE_URL, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsOverviewV2Fragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2Fragment$onViewCreated$4 */
    /* synthetic */ class C102794 extends FunctionReferenceImpl implements Function1<RewardsOverviewV2ViewState, Unit> {
        C102794(Object obj) {
            super(1, obj, RewardsOverviewV2Fragment.class, "bind", "bind(Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOverviewV2ViewState rewardsOverviewV2ViewState) throws Resources.NotFoundException {
            invoke2(rewardsOverviewV2ViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOverviewV2ViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOverviewV2Fragment) this.receiver).bind(p0);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C10176R.menu.rewards_overview_settings_menu, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C10176R.id.rewards_overview_settings) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.RoundupRewardsSettings.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.ROUNDUP_REWARD, null, null, true, null, 45, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C10176R.id.dialog_id_rewards_pause_roundups_success) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string2 = getString(C10176R.string.rewards_learn_more_url);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            return true;
        }
        return super.onSecondaryButtonClicked(dialogId, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RewardsOverviewV2ViewState state) throws Resources.NotFoundException {
        CharSequence text;
        getBinding().rewardsOverviewRoundupsAmount.setText(state.getLifetimeAmountText());
        getBinding().rewardsOverviewTotalRoundups.setValueText(state.getRoundupInvestedAmountText());
        getBinding().rewardsOverviewTotalBonus.setValueText(state.getBonusInvestedAmountText());
        getBinding().rewardsOverviewWeeklyHeldAmount.setText(state.getPendingRoundupAmountText());
        RhTextView rhTextView = getBinding().rewardsOverviewCreatedDate;
        StringResource roundupCreatedAtText = state.getRoundupCreatedAtText();
        String string2 = null;
        if (roundupCreatedAtText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = roundupCreatedAtText.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        LottieAnimationView lottieAnimationView = getBinding().rewardsOverviewCoinAsset;
        if (state.getShouldShowCoinAnimation()) {
            Intrinsics.checkNotNull(lottieAnimationView);
            LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, LottieUrl.ROUNDUP_REWARDS_OVERVIEW_COIN);
            LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView, 60, Integer.valueOf(COIN_ANIMATION_LOOP_END_FRAME));
            if (!lottieAnimationView.isAnimating()) {
                lottieAnimationView.playAnimation();
            }
        } else {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setImageResource(C10176R.drawable.svg_rewards_overview_coin);
        }
        RhTextView rhTextView2 = getBinding().rewardsOverviewEligibleTransactionsMessage;
        int i = WhenMappings.$EnumSwitchMapping$0[state.getEligibleTransactionMessageState().ordinal()];
        if (i == 1) {
            string2 = getString(C10176R.string.rewards_overview_roundup_paused);
        } else if (i == 2) {
            string2 = getString(C10176R.string.rewards_overview_no_transactions_no_roundup);
        } else if (i == 3) {
            string2 = getString(C10176R.string.rewards_overview_no_transactions);
        }
        rhTextView2.setText(string2);
        RdsTextButton rewardsOverviewResumeRoundupButton = getBinding().rewardsOverviewResumeRoundupButton;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewResumeRoundupButton, "rewardsOverviewResumeRoundupButton");
        rewardsOverviewResumeRoundupButton.setVisibility(state.getRoundupEnrollmentState() == ApiRoundupEnrollment.State.INACTIVE ? 0 : 8);
        getBinding().rewardsOverviewEligibleTransactions.setData(state.getSortedEligibleTransactions());
        RhTextView rewardsOverviewInvestedRoundupsTitle = getBinding().rewardsOverviewInvestedRoundupsTitle;
        Intrinsics.checkNotNullExpressionValue(rewardsOverviewInvestedRoundupsTitle, "rewardsOverviewInvestedRoundupsTitle");
        rewardsOverviewInvestedRoundupsTitle.setVisibility(state.isRoundupHistorySectionVisible() ? 0 : 8);
        UnifiedHistoryView unifiedHistoryView = getBinding().rewardsOverviewInvestedRoundups;
        Intrinsics.checkNotNull(unifiedHistoryView);
        unifiedHistoryView.setVisibility(state.isRoundupHistorySectionVisible() ? 0 : 8);
        unifiedHistoryView.bind(state.getRoundupHistoryItems());
    }

    private final void showPendingRoundupsBottomSheet() {
        RewardsOverviewBottomSheetDialogFragment rewardsOverviewBottomSheetDialogFragment = (RewardsOverviewBottomSheetDialogFragment) RewardsOverviewBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C10176R.id.dialog_id_rewards_pause_roundups_success, getString(C10176R.string.rewards_overview_pending_roundups_bottom_sheet_title), null, getString(C10176R.string.rewards_overview_pending_roundups_bottom_sheet_description), null, getString(C11048R.string.general_label_got_it), null, getString(C11048R.string.general_action_learn_more), null, false, false, null, null, 8388611, false, false, false, false, null, null, null, 2088788, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rewardsOverviewBottomSheetDialogFragment.show(childFragmentManager, "pendingRoundupsBottomSheet");
    }

    /* compiled from: RewardsOverviewV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Fragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RoundupRewardsOverviewV2;", "<init>", "()V", "COIN_ANIMATION_LOOP_START_FRAME", "", "COIN_ANIMATION_LOOP_END_FRAME", "DISCLOSURE_URL", "", "createFragment", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2Fragment;", "key", "newInstance", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RoundupRewardsOverviewV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RewardsOverviewV2Fragment createFragment(LegacyFragmentKey.RoundupRewardsOverviewV2 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance();
        }

        private final RewardsOverviewV2Fragment newInstance() {
            return new RewardsOverviewV2Fragment();
        }
    }
}
