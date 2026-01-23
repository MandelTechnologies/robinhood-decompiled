package com.robinhood.android.recommendations.retirement.p223ui.results.swipey;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
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
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: RecsRetirementQuestionnaireResultsSwipiesFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementSwipiesCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onLastPageContinue", "exit", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsSwipiesFragment extends GenericActionHandlingFragment implements RecsRetirementQuestionnaireResultsSwipiesContent8, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RecommendationsRegionGate.INSTANCE, RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecsRetirementQuestionnaireResultsSwipiesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecsRetirementQuestionnaireResultsSwipiesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Callbacks;", "", "onLastPageContinue", "", "recommendationId", "Ljava/util/UUID;", "onExitSwipies", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExitSwipies();

        void onLastPageContinue(UUID recommendationId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RecsRetirementQuestionnaireResultsSwipiesFragment recsRetirementQuestionnaireResultsSwipiesFragment, int i, Composer composer, int i2) {
        recsRetirementQuestionnaireResultsSwipiesFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(750983293);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750983293, i2, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment.ComposeContent (RecsRetirementQuestionnaireResultsSwipiesFragment.kt:40)");
            }
            ActionHandlingFragment2.ContentWithDialog(this, ComposableLambda3.rememberComposableLambda(11666521, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(11666521, i3, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment.ComposeContent.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesFragment.kt:42)");
                    }
                    Companion companion = RecsRetirementQuestionnaireResultsSwipiesFragment.INSTANCE;
                    String str = null;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    String str2 = null;
                    String str3 = null;
                    int i7 = 0;
                    String str4 = null;
                    String str5 = null;
                    Screen screen = null;
                    String str6 = null;
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
                    LearningLesson learningLesson = null;
                    LearningSection learningSection = null;
                    LearningMatchingExercise learningMatchingExercise = null;
                    LearningAnswer learningAnswer = null;
                    LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
                    LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
                    SafetyLabelInfoTag safetyLabelInfoTag = null;
                    SafetyLabelLesson safetyLabelLesson = null;
                    String str7 = null;
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
                    String str8 = null;
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
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -2;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = -1;
                    Object[] objArr = 0 == true ? 1 : 0;
                    Object[] objArr2 = 0 == true ? 1 : 0;
                    Object[] objArr3 = 0 == true ? 1 : 0;
                    RecsRetirementQuestionnaireResultsSwipiesContent3.ResultsSwipeyScreen(((Args) companion.getArgs((Fragment) RecsRetirementQuestionnaireResultsSwipiesFragment.this)).getResults().getSwipeyPage(), new Context(i4, i5, i6, str2, str, objArr2, str3, objArr3, i7, objArr, str4, str5, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, new RecommendationsContext(null, null, ((Args) companion.getArgs((Fragment) RecsRetirementQuestionnaireResultsSwipiesFragment.this)).getSource(), str, null, ((Args) companion.getArgs((Fragment) RecsRetirementQuestionnaireResultsSwipiesFragment.this)).getAccountType(), null, 91, null), ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i8, i9, i10, i11, i12, i13, 16383, null), RecsRetirementQuestionnaireResultsSwipiesFragment.this, null, composer2, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementQuestionnaireResultsSwipiesFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContent8
    public void onLastPageContinue() {
        getCallbacks().onLastPageContinue(((Args) INSTANCE.getArgs((Fragment) this)).getResults().getRecommendationId());
    }

    @Override // com.robinhood.android.recommendations.retirement.p223ui.results.swipey.RecsRetirementQuestionnaireResultsSwipiesContent8
    public void exit() {
        getCallbacks().onExitSwipies();
    }

    /* compiled from: RecsRetirementQuestionnaireResultsSwipiesFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Args;", "Landroid/os/Parcelable;", "results", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "source", "", "accountType", "<init>", "(Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;Ljava/lang/String;Ljava/lang/String;)V", "getResults", "()Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "getSource", "()Ljava/lang/String;", "getAccountType", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountType;
        private final UiQuestionnaireResults results;
        private final String source;

        /* compiled from: RecsRetirementQuestionnaireResultsSwipiesFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiQuestionnaireResults) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.results, flags);
            dest.writeString(this.source);
            dest.writeString(this.accountType);
        }

        public Args(UiQuestionnaireResults results, String source, String accountType) {
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.results = results;
            this.source = source;
            this.accountType = accountType;
        }

        public final UiQuestionnaireResults getResults() {
            return this.results;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getAccountType() {
            return this.accountType;
        }
    }

    /* compiled from: RecsRetirementQuestionnaireResultsSwipiesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment;", "Lcom/robinhood/android/recommendations/retirement/ui/results/swipey/RecsRetirementQuestionnaireResultsSwipiesFragment$Args;", "<init>", "()V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecsRetirementQuestionnaireResultsSwipiesFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecsRetirementQuestionnaireResultsSwipiesFragment recsRetirementQuestionnaireResultsSwipiesFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recsRetirementQuestionnaireResultsSwipiesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecsRetirementQuestionnaireResultsSwipiesFragment newInstance(Args args) {
            return (RecsRetirementQuestionnaireResultsSwipiesFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecsRetirementQuestionnaireResultsSwipiesFragment recsRetirementQuestionnaireResultsSwipiesFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recsRetirementQuestionnaireResultsSwipiesFragment, args);
        }
    }
}
