package com.robinhood.android.optionsrolling.p209ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.data.prefs.ShouldShowRollingLearnMoreCard;
import com.robinhood.android.common.options.rolling.OptionRollingContentful;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingNuxFragment;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyParentFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.rosetta.eventlogging.AccountType;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFundingMethodContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnScrubBarContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContext;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.BreakingNewsContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ConciergePlusSupportContext;
import com.robinhood.rosetta.eventlogging.ConciergeSupportContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CortexDigestContext;
import com.robinhood.rosetta.eventlogging.CortexDigestOnboardingContext;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.CountryGatingContext;
import com.robinhood.rosetta.eventlogging.CryptoAssetContext;
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.rosetta.eventlogging.CryptoGiftContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierStatusContext;
import com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierUpgradedContext;
import com.robinhood.rosetta.eventlogging.CryptoQuickTradeButtonContext;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferLimitContext;
import com.robinhood.rosetta.eventlogging.DappBrowserContext;
import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.robinhood.rosetta.eventlogging.DashboardWidgetContext;
import com.robinhood.rosetta.eventlogging.DayTradeCardContext;
import com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.DeepLinkContext;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.DisclosureDropdown;
import com.robinhood.rosetta.eventlogging.EarningsCallContext;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.EquitiesLadderContext;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.EquityScreenerContext;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.rosetta.eventlogging.EventContractsPositionContext;
import com.robinhood.rosetta.eventlogging.FXRate;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.FuturesPositionContext;
import com.robinhood.rosetta.eventlogging.FuturesTradeBarContext;
import com.robinhood.rosetta.eventlogging.GDPRConsentManagementContext;
import com.robinhood.rosetta.eventlogging.GoldContext;
import com.robinhood.rosetta.eventlogging.GoldDefaultOptInContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.InstantDeposit;
import com.robinhood.rosetta.eventlogging.InstantUpsellContext;
import com.robinhood.rosetta.eventlogging.InternalAssetTransferContext;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext;
import com.robinhood.rosetta.eventlogging.IpoAccessListVideoContext;
import com.robinhood.rosetta.eventlogging.IpoaAllocationCylinderContext;
import com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContext;
import com.robinhood.rosetta.eventlogging.IpoaPostCobFollowUpContext;
import com.robinhood.rosetta.eventlogging.KeychainLoginContext;
import com.robinhood.rosetta.eventlogging.LearningAnswer;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningMatchingExercise;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseBucket;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseEntity;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.LoadingOverlaySpinnerContext;
import com.robinhood.rosetta.eventlogging.LoginContext;
import com.robinhood.rosetta.eventlogging.LogoutContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatch;
import com.robinhood.rosetta.eventlogging.MarginHealthState;
import com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext;
import com.robinhood.rosetta.eventlogging.MarginTieredRatesContext;
import com.robinhood.rosetta.eventlogging.MarginUpgradeContext;
import com.robinhood.rosetta.eventlogging.MicrogramInstallContext;
import com.robinhood.rosetta.eventlogging.NCWTokenVisibilityContext;
import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.NcwMultichainTokenContext;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.robinhood.rosetta.eventlogging.NcwTransferContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.NotificationContext;
import com.robinhood.rosetta.eventlogging.OnboardingWelcomeTakeoverScreenContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingActionContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingErrorContext;
import com.robinhood.rosetta.eventlogging.OptionOrderBidAskBarContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.OptionSimulatedReturnsContext;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.rosetta.eventlogging.OptionsCancelNewContext;
import com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContext;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.OrderSummaryNbbo;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext;
import com.robinhood.rosetta.eventlogging.PatternDayTradingContext;
import com.robinhood.rosetta.eventlogging.PaycheckSectionContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PendingOptionOrderContext;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.PerpetualContractContext;
import com.robinhood.rosetta.eventlogging.PerpetualPositionContext;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.PortfolioSharingContext;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import com.robinhood.rosetta.eventlogging.PostSignupOnboardingContext;
import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.robinhood.rosetta.eventlogging.PostTransferUpsellContext;
import com.robinhood.rosetta.eventlogging.PrismContext;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.ReferralInviteContext;
import com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext;
import com.robinhood.rosetta.eventlogging.ReturnsComparisonContext;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.SLIPHubStockRowContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchEquityScreenerContext;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext;
import com.robinhood.rosetta.eventlogging.SocialTradingContext;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
import com.robinhood.rosetta.eventlogging.TransactionDisputeContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.TransferErrorContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UpsellBannerContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
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
import okio.ByteString;

/* compiled from: OptionRollingNuxFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002)*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\r\u0010!\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\"J\t\u0010#\u001a\u00020\u0018H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "shouldShowRollingLearnMoreCard", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldShowRollingLearnMoreCard", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldShowRollingLearnMoreCard", "(Lcom/robinhood/prefs/BooleanPreference;)V", "callbacks", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionRollingNuxFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    public EventLogger eventLogger;

    @ShouldShowRollingLearnMoreCard
    public BooleanPreference shouldShowRollingLearnMoreCard;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionRollingNuxFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionRollingNuxFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Callbacks;", "", "onGetStartedClicked", "", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onGetStartedClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OptionRollingNuxFragment optionRollingNuxFragment, int i, Composer composer, int i2) {
        optionRollingNuxFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    public final BooleanPreference getShouldShowRollingLearnMoreCard() {
        BooleanPreference booleanPreference = this.shouldShowRollingLearnMoreCard;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldShowRollingLearnMoreCard");
        return null;
    }

    public final void setShouldShowRollingLearnMoreCard(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldShowRollingLearnMoreCard = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, new Screen(Screen.Name.OPTIONS_ROLLING_NUX, null, ((OptionRollingStrategyParentFragment.Args) INSTANCE.getArgs((Fragment) this)).getStrategyCode(), null, 10, null), null, null, null, 29, null);
    }

    /* compiled from: OptionRollingNuxFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$ComposeContent$1 */
    static final class C247831 implements Function2<Composer, Integer, Unit> {
        C247831() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-980080102, i, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment.ComposeContent.<anonymous> (OptionRollingNuxFragment.kt:55)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(OptionRollingNuxFragment.this);
            final OptionRollingNuxFragment optionRollingNuxFragment = OptionRollingNuxFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionRollingNuxFragment.C247831.invoke$lambda$1$lambda$0(optionRollingNuxFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(OptionRollingNuxFragment.this);
            final OptionRollingNuxFragment optionRollingNuxFragment2 = OptionRollingNuxFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionRollingNuxFragment.C247831.invoke$lambda$3$lambda$2(optionRollingNuxFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(OptionRollingNuxFragment.this);
            final OptionRollingNuxFragment optionRollingNuxFragment3 = OptionRollingNuxFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionRollingNuxFragment.C247831.invoke$lambda$5$lambda$4(optionRollingNuxFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            OptionRollingNuxComposable3.OptionRollingNuxComposable(function0, function02, (Function0) objRememberedValue3, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OptionRollingNuxFragment optionRollingNuxFragment) {
            optionRollingNuxFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(OptionRollingNuxFragment optionRollingNuxFragment) {
            optionRollingNuxFragment.getCallbacks().onGetStartedClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invoke$lambda$5$lambda$4(OptionRollingNuxFragment optionRollingNuxFragment) {
            EventLogger eventLogger = optionRollingNuxFragment.getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_LEARNING_LESSON;
            Screen screen = new Screen(Screen.Name.OPTIONS_ROLLING_NUX, null, null, null, 14, null);
            Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
            OptionRollingContentful optionRollingContentful = OptionRollingContentful.OPTIONS_ROLLING_LEARN_MORE;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i4 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Screen screen2 = null;
            String str7 = null;
            Asset asset = null;
            List list = null;
            NewsFeedItem newsFeedItem = null;
            Feedback feedback = null;
            CXIssue cXIssue = null;
            InAppSurvey inAppSurvey = null;
            ListsContext listsContext = null;
            DirectDepositContext directDepositContext = null;
            DirectDepositSwitcherContext directDepositSwitcherContext = null;
            RecurringContext recurringContext = null;
            OrderKind orderKind = null;
            InAppComm inAppComm = null;
            LearningSection learningSection = null;
            LearningMatchingExercise learningMatchingExercise = null;
            LearningAnswer learningAnswer = null;
            LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
            LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
            SafetyLabelInfoTag safetyLabelInfoTag = null;
            SafetyLabelLesson safetyLabelLesson = null;
            String str8 = null;
            EducationTour educationTour = null;
            EducationTourSection educationTourSection = null;
            EducationTourOutroTooltip educationTourOutroTooltip = null;
            EducationTourOutro educationTourOutro = null;
            EducationSeries educationSeries = null;
            EducationHome educationHome = null;
            FundingContext fundingContext = null;
            URLComponents uRLComponents = null;
            Article article = null;
            TransactionDisputeContext transactionDisputeContext = null;
            NetworkContext networkContext = null;
            PlaidEventData plaidEventData = null;
            IAVContext iAVContext = null;
            TransferContext transferContext = null;
            MAXTransferContext mAXTransferContext = null;
            MAXTransferAccountSelectionContext mAXTransferAccountSelectionContext = null;
            QueuedDepositContext queuedDepositContext = null;
            RewardContext rewardContext = null;
            SearchResultItem searchResultItem = null;
            OptionsContext optionsContext = null;
            OptionStrategyContext optionStrategyContext = null;
            OptionWatchlistAboutContext optionWatchlistAboutContext = null;
            DisclosureDropdown disclosureDropdown = null;
            GraphContext graphContext = null;
            EtpCompositionContext etpCompositionContext = null;
            LoginContext loginContext = null;
            OrderSummaryNbbo orderSummaryNbbo = null;
            AgreementContext agreementContext = null;
            IpoAccessListVideoContext ipoAccessListVideoContext = null;
            RecommendationsContext recommendationsContext = null;
            IpoAccessInstrumentContext ipoAccessInstrumentContext = null;
            IpoaAllocationCylinderContext ipoaAllocationCylinderContext = null;
            IpoaParticipationGraphContext ipoaParticipationGraphContext = null;
            IpoaPostCobFollowUpContext ipoaPostCobFollowUpContext = null;
            VoiceRecordContext voiceRecordContext = null;
            CXInquiryContext cXInquiryContext = null;
            InstantDeposit instantDeposit = null;
            CryptoTransferContext cryptoTransferContext = null;
            CryptoGiftContext cryptoGiftContext = null;
            ShareholderQAContext shareholderQAContext = null;
            RHYContext rHYContext = null;
            ChallengeContext challengeContext = null;
            SLIPContext sLIPContext = null;
            SLIPHubStockRowContext sLIPHubStockRowContext = null;
            PaymentLinkingContext paymentLinkingContext = null;
            AdvancedChartsContext advancedChartsContext = null;
            PaycheckSectionContext paycheckSectionContext = null;
            Basket basket = null;
            InvestFlowContext investFlowContext = null;
            MarginUpgradeContext marginUpgradeContext = null;
            AlertContext alertContext = null;
            TechnicalIndicatorContext technicalIndicatorContext = null;
            DcfKycContext dcfKycContext = null;
            ValueSelectorContext valueSelectorContext = null;
            AdvancedChartsAboutContext advancedChartsAboutContext = null;
            GoldContext goldContext = null;
            RecsRetirementContext recsRetirementContext = null;
            InvestorProfileQuestionnaireContext investorProfileQuestionnaireContext = null;
            EquityOrderContext equityOrderContext = null;
            KeychainLoginContext keychainLoginContext = null;
            PasskeyEnrollmentContext passkeyEnrollmentContext = null;
            CryptoAssetContext cryptoAssetContext = null;
            CryptoTransactionContext cryptoTransactionContext = null;
            CryptoTokenApprovalContext cryptoTokenApprovalContext = null;
            NcwOnboardingContext ncwOnboardingContext = null;
            NcwFundingContext ncwFundingContext = null;
            DappRequestContext dappRequestContext = null;
            String str9 = null;
            PerformanceChartContext performanceChartContext = null;
            BrokerageAccountContext brokerageAccountContext = null;
            BrokerageAccountSwitcherContext brokerageAccountSwitcherContext = null;
            OptionsEligibilityContext optionsEligibilityContext = null;
            CryptoOrderContext cryptoOrderContext = null;
            NcwTransferContext ncwTransferContext = null;
            NotificationContext notificationContext = null;
            NcwMultichainTokenContext ncwMultichainTokenContext = null;
            RetirementContext retirementContext = null;
            PostTransferActionContext postTransferActionContext = null;
            BuyingPowerRowContext buyingPowerRowContext = null;
            StepUpVerificationContext stepUpVerificationContext = null;
            GoldUpgradeContext goldUpgradeContext = null;
            OptionOrderDetailContext optionOrderDetailContext = null;
            OptionOrderDetailLegContext optionOrderDetailLegContext = null;
            PendingOptionOrderContext pendingOptionOrderContext = null;
            CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext = null;
            EquityScreenerContext equityScreenerContext = null;
            AcatsInContext acatsInContext = null;
            CatpayOrderContext catpayOrderContext = null;
            SearchEquityScreenerContext searchEquityScreenerContext = null;
            P2PContext p2PContext = null;
            RetirementFundingMethodsContext retirementFundingMethodsContext = null;
            ReturnsComparisonContext returnsComparisonContext = null;
            AccountType accountType = null;
            MarginHealthState marginHealthState = null;
            BuyingPowerHubContext buyingPowerHubContext = null;
            UpsellBannerContext upsellBannerContext = null;
            ReferralEntryPointContext referralEntryPointContext = null;
            OnboardingWelcomeTakeoverScreenContext onboardingWelcomeTakeoverScreenContext = null;
            ReferralInviteContext referralInviteContext = null;
            WiresContext wiresContext = null;
            PortfolioSharingContext portfolioSharingContext = null;
            PatternDayTradingContext patternDayTradingContext = null;
            DayTradeCardContext dayTradeCardContext = null;
            OptionsChainCustomizationContext optionsChainCustomizationContext = null;
            DappBrowserContext dappBrowserContext = null;
            DayTradeCounterGraphicContext dayTradeCounterGraphicContext = null;
            PositionsInstrumentType positionsInstrumentType = null;
            PositionsSortOptionsContext positionsSortOptionsContext = null;
            FXRate fXRate = null;
            TransferErrorContext transferErrorContext = null;
            PortfolioAccountContext portfolioAccountContext = null;
            OptionSimulatedReturnsContext optionSimulatedReturnsContext = null;
            CountryGatingContext countryGatingContext = null;
            InstantUpsellContext instantUpsellContext = null;
            GDPRConsentManagementContext gDPRConsentManagementContext = null;
            NCWTokenVisibilityContext nCWTokenVisibilityContext = null;
            OptionOrderBidAskBarContext optionOrderBidAskBarContext = null;
            GoldDefaultOptInContext goldDefaultOptInContext = null;
            GoldUpgradeType goldUpgradeType = null;
            CryptoTransferLimitContext cryptoTransferLimitContext = null;
            MarginTieredRatesContext marginTieredRatesContext = null;
            ResumeApplicationTakeoverContext resumeApplicationTakeoverContext = null;
            CryptoStakingContext cryptoStakingContext = null;
            OptionsCancelNewContext optionsCancelNewContext = null;
            LogoutContext logoutContext = null;
            PostTransferUpsellContext postTransferUpsellContext = null;
            MicrogramInstallContext microgramInstallContext = null;
            PostSignupOnboardingContext postSignupOnboardingContext = null;
            FuturesOrderContext futuresOrderContext = null;
            FuturesContractContext futuresContractContext = null;
            FuturesTradeBarContext futuresTradeBarContext = null;
            OptionOnboardingContext optionOnboardingContext = null;
            OptionOnboardingActionContext optionOnboardingActionContext = null;
            OptionOnboardingErrorContext optionOnboardingErrorContext = null;
            DashboardWidgetContext dashboardWidgetContext = null;
            SlipOnboardingCheckboxContext slipOnboardingCheckboxContext = null;
            FuturesOrderButtonContext futuresOrderButtonContext = null;
            FuturesLadderContext futuresLadderContext = null;
            LoadingOverlaySpinnerContext loadingOverlaySpinnerContext = null;
            EarningsCallContext earningsCallContext = null;
            InternalAssetTransferContext internalAssetTransferContext = null;
            DeepLinkContext deepLinkContext = null;
            AdvisoryFutureReturnsGraphContext advisoryFutureReturnsGraphContext = null;
            AdvisoryFutureReturnScrubBarContext advisoryFutureReturnScrubBarContext = null;
            SupportAppointmentSettingContext supportAppointmentSettingContext = null;
            EventContractOrderContext eventContractOrderContext = null;
            FuturesPositionContext futuresPositionContext = null;
            FuturesAccountStatusContext futuresAccountStatusContext = null;
            ConciergeSupportContext conciergeSupportContext = null;
            MarginMaintenanceTableRowContext marginMaintenanceTableRowContext = null;
            BreakingNewsContext breakingNewsContext = null;
            AdvisoryFundingMethodContext advisoryFundingMethodContext = null;
            CryptoPostTradeFeeTierStatusContext cryptoPostTradeFeeTierStatusContext = null;
            PerpetualsOrderContext perpetualsOrderContext = null;
            PerpetualPositionContext perpetualPositionContext = null;
            PerpetualContractContext perpetualContractContext = null;
            PrismContext prismContext = null;
            CryptoPostTradeFeeTierUpgradedContext cryptoPostTradeFeeTierUpgradedContext = null;
            LegendAdvancedChartsContext legendAdvancedChartsContext = null;
            EventContractHubCardContext eventContractHubCardContext = null;
            ComboOrderDetailContext comboOrderDetailContext = null;
            CryptoFeeTierStatusContext cryptoFeeTierStatusContext = null;
            CortexDigestContext cortexDigestContext = null;
            CortexDigestOnboardingContext cortexDigestOnboardingContext = null;
            EventContractsPositionContext eventContractsPositionContext = null;
            EquitiesLadderContext equitiesLadderContext = null;
            MarginCallMarketOrderDataMismatch marginCallMarketOrderDataMismatch = null;
            ConciergePlusSupportContext conciergePlusSupportContext = null;
            CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
            SocialTradingContext socialTradingContext = null;
            ByteString byteString = null;
            int i5 = -67108865;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(i, i2, i3, str, str2, objArr2, str3, objArr, i4, str4, str5, str6, screen2, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, new LearningLesson(optionRollingContentful.getContentfulId(), null, false, 0, null, 30, null), learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), false, 40, null);
            optionRollingNuxFragment.getShouldShowRollingLearnMoreCard().set(false);
            Navigator navigator = optionRollingNuxFragment.getNavigator();
            android.content.Context contextRequireContext = optionRollingNuxFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new EducationLessonFragmentKeys2(optionRollingContentful.getContentfulId(), "STRATEGY_ROLL"), false, false, true, false, null, false, null, null, 1004, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(305985746);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(305985746, i2, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment.ComposeContent (OptionRollingNuxFragment.kt:53)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(-980080102, true, new C247831(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionRollingNuxFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionRollingNuxFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingNuxFragment;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyParentFragment$Args;", "<init>", "()V", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionRollingNuxFragment, OptionRollingStrategyParentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionRollingStrategyParentFragment.Args getArgs(OptionRollingNuxFragment optionRollingNuxFragment) {
            return (OptionRollingStrategyParentFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionRollingNuxFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionRollingNuxFragment newInstance(OptionRollingStrategyParentFragment.Args args) {
            return (OptionRollingNuxFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionRollingNuxFragment optionRollingNuxFragment, OptionRollingStrategyParentFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionRollingNuxFragment, args);
        }
    }
}
