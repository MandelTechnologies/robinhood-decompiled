package com.robinhood.android.recommendations.p224ui.questionnaire.landing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireLandingBinding;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
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
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okio.ByteString;

/* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0003*+,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u00060\u0017j\u0002`\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireLandingBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireLandingBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Callbacks;", "callbacks$delegate", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireLandingFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireLandingFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireLandingBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsQuestionnaireLandingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenEventLogging;

    /* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Callbacks;", "", "onStartQuestionnaire", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onStartQuestionnaire();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public RecommendationsQuestionnaireLandingFragment() {
        super(C25978R.layout.fragment_recommendations_questionnaire_landing);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsQuestionnaireLandingFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.eventScreen = new Screen(Screen.Name.RECS_FIRST_TRADE_INTRO, null, null, null, 14, null);
        this.excludeFromAutoScreenEventLogging = true;
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

    private final FragmentRecommendationsQuestionnaireLandingBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsQuestionnaireLandingBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Context getEventContext() {
        Companion companion = INSTANCE;
        String source = ((Args) companion.getArgs((Fragment) this)).getSource();
        String str = source == null ? "" : source;
        String loggingId = ((Args) companion.getArgs((Fragment) this)).getLoggingId();
        String str2 = loggingId == null ? "" : loggingId;
        RecommendationsContext.EntryPoint entryPoint = null;
        String str3 = null;
        RecommendationsContext.RecommendationsType recommendationsType = null;
        String str4 = null;
        ByteString byteString = null;
        String str5 = null;
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
        String str6 = null;
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
        String str7 = null;
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
        ByteString byteString2 = null;
        int i = -1;
        int i2 = -1;
        int i3 = -2;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        return new Context(0, 0, 0, null, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0, str4, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str5, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str6, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, new RecommendationsContext(entryPoint, str2, str, str3, recommendationsType, str4, byteString, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null), ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str7, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i, i2, i3, i4, i5, i6, 16383, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentRecommendationsQuestionnaireLandingBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RdsButton cta = binding.cta;
        Intrinsics.checkNotNullExpressionValue(cta, "cta");
        ViewsKt.eventData$default(cta, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireLandingFragment.onViewCreated$lambda$3$lambda$0();
            }
        }, 1, null);
        RdsButton cta2 = binding.cta;
        Intrinsics.checkNotNullExpressionValue(cta2, "cta");
        OnClickListeners.onClick(cta2, new Function0() { // from class: com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsQuestionnaireLandingFragment.onViewCreated$lambda$3$lambda$1(binding, this);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireLandingFragment.onViewCreated$lambda$3$lambda$2(binding, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$1(FragmentRecommendationsQuestionnaireLandingBinding fragmentRecommendationsQuestionnaireLandingBinding, RecommendationsQuestionnaireLandingFragment recommendationsQuestionnaireLandingFragment) {
        fragmentRecommendationsQuestionnaireLandingBinding.cta.setLoading(true);
        recommendationsQuestionnaireLandingFragment.getCallbacks().onStartQuestionnaire();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(FragmentRecommendationsQuestionnaireLandingBinding fragmentRecommendationsQuestionnaireLandingBinding, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LottieUrl lottieUrl = DayNightChanges.isDay(it) ? LottieUrl.RECS_LANDING_ORB_DAY : LottieUrl.RECS_LANDING_ORB_NIGHT;
        LottieAnimationView lottieView = fragmentRecommendationsQuestionnaireLandingBinding.lottieView;
        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
        LottieAnimationViewsKt.setRemoteUrl(lottieView, lottieUrl);
        fragmentRecommendationsQuestionnaireLandingBinding.lottieView.setRepeatMode(1);
        fragmentRecommendationsQuestionnaireLandingBinding.lottieView.setRepeatCount(-1);
        fragmentRecommendationsQuestionnaireLandingBinding.lottieView.playAnimation();
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Args;", "Landroid/os/Parcelable;", "source", "", "loggingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getLoggingId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String loggingId;
        private final String source;

        /* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.source;
            }
            if ((i & 2) != 0) {
                str2 = args.loggingId;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingId() {
            return this.loggingId;
        }

        public final Args copy(String source, String loggingId) {
            return new Args(source, loggingId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.loggingId, args.loggingId);
        }

        public int hashCode() {
            String str = this.source;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.loggingId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(source=" + this.source + ", loggingId=" + this.loggingId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.loggingId);
        }

        public Args(String str, String str2) {
            this.source = str;
            this.loggingId = str2;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getLoggingId() {
            return this.loggingId;
        }
    }

    /* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment;", "Lcom/robinhood/android/recommendations/ui/questionnaire/landing/RecommendationsQuestionnaireLandingFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsQuestionnaireLandingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsQuestionnaireLandingFragment recommendationsQuestionnaireLandingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsQuestionnaireLandingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsQuestionnaireLandingFragment newInstance(Args args) {
            return (RecommendationsQuestionnaireLandingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsQuestionnaireLandingFragment recommendationsQuestionnaireLandingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsQuestionnaireLandingFragment, args);
        }
    }
}
