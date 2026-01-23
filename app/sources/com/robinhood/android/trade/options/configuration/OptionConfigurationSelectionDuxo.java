package com.robinhood.android.trade.options.configuration;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.OptionOrderLoggings;
import com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionOrderDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OrderTimeInForce;
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
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
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
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Clock2;
import kotlinx.datetime.Converters4;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: OptionConfigurationSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\"\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionOrderDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionOrderDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Landroidx/lifecycle/SavedStateHandle;)V", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setDayNightOverlay", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setTimeInForce", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "logScreenAppear", "logCloseButtonTap", "logGtcAlertModalAppear", "title", "", "message", "logGtcAlertModalDismiss", "resources", "Landroid/content/res/Resources;", "logGtcAlertModalContinue", "logOptionConfigurationTap", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "buttonText", "optionsContext", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "logDisclosureTap", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionConfigurationSelectionDuxo extends OldBaseDuxo<OptionConfigurationSelectionViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MarketHoursStore marketHoursStore;
    private final OptionOrderDiscoveryStore optionOrderDiscoveryStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final EventLogger getEventLogger() {
        return this.eventLogger;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionConfigurationSelectionDuxo(EventLogger eventLogger, ExperimentsStore experimentsStore, MarketHoursStore marketHoursStore, OptionOrderDiscoveryStore optionOrderDiscoveryStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, SavedStateHandle savedStateHandle) {
        super(new OptionConfigurationSelectionViewState((OptionConfigurationSelectionFragment.Args) INSTANCE.getArgs(savedStateHandle), null, false, null, false, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, 2, null);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionOrderDiscoveryStore, "optionOrderDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.marketHoursStore = marketHoursStore;
        this.optionOrderDiscoveryStore = optionOrderDiscoveryStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.marketHoursStore.refreshToday(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursStore.getMarketHoursToday(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$1(this.f$0, (MarketHours) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$2(this.f$0, (OptionConfigurationSelectionViewState) obj);
            }
        });
        Observable<OptionConfigurationSelectionViewState> observableTake = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo.onCreate.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionConfigurationSelectionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShowOptionMarketDiscovery();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$3(this.f$0, (OptionConfigurationSelectionViewState) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$onCreate$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionConfigurationSelectionViewState) it).getAutoUpdateStateAt());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C29765x6ca88434<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableFlatMap = observableDistinctUntilChanged.map(new Function() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final Long apply(Instant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Long.valueOf(it.toEpochMilli() - Converters4.toJavaInstant(Clock2.INSTANCE.now()).toEpochMilli());
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo.onCreate.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Long> apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.timer(it.longValue(), TimeUnit.MILLISECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$6(this.f$0, (Long) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = asObservable(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$8(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsOrderPathMarketTradingHours.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, final MarketHours it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionConfigurationSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$1$lambda$0(it, (OptionConfigurationSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState onCreate$lambda$1$lambda$0(MarketHours marketHours, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, marketHours, false, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState onCreate$lambda$2(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, null, optionConfigurationSelectionDuxo.optionOrderDiscoveryStore.shouldShowOptionOrderMarketNewTag(), null, false, false, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, OptionConfigurationSelectionViewState optionConfigurationSelectionViewState) {
        optionConfigurationSelectionDuxo.optionOrderDiscoveryStore.recordOptionOrderMarketNewTagSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, Long l) {
        optionConfigurationSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$6$lambda$5((OptionConfigurationSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState onCreate$lambda$6$lambda$5(OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, null, false, null, false, false, 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, final Boolean bool) {
        optionConfigurationSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$8$lambda$7(bool, (OptionConfigurationSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState onCreate$lambda$8$lambda$7(Boolean bool, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, null, false, null, bool.booleanValue(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, final boolean z) {
        optionConfigurationSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.onCreate$lambda$10$lambda$9(z, (OptionConfigurationSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState onCreate$lambda$10$lambda$9(boolean z, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, null, false, null, false, z, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public final void setDayNightOverlay(final DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.setDayNightOverlay$lambda$11(dayNightOverlay, (OptionConfigurationSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState setDayNightOverlay$lambda$11(DayNightOverlay dayNightOverlay, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, dayNightOverlay, false, null, false, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public final void setTimeInForce(final OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionConfigurationSelectionDuxo.setTimeInForce$lambda$12(timeInForce, (OptionConfigurationSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionConfigurationSelectionViewState setTimeInForce$lambda$12(OrderTimeInForce orderTimeInForce, OptionConfigurationSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionConfigurationSelectionViewState.copy$default(applyMutation, null, null, false, null, false, orderTimeInForce, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    public final void logScreenAppear() {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), null, null, null, 29, null);
    }

    public final void logCloseButtonTap() {
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Screen screen = new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CLOSE_BUTTON, "order-types-screen-close-button", null, 4, null);
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, companion.toOptionsContext$feature_trade_options_externalDebug(((OptionConfigurationSelectionFragment.Args) companion.getArgs((HasSavedState) this)).getSelectedOrderType()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), 8, null);
    }

    public final void logGtcAlertModalAppear(String title, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
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
        LearningLesson learningLesson = null;
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
        int i5 = -1;
        int i6 = -1;
        int i7 = -2097153;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, new Context(i, i2, i3, null, str, str2, str3, productTag, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, new AlertContext(title, message, null, 4, null), technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), 9, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logGtcAlertModalDismiss(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C29757R.string.option_order_configuration_error_gtc_market_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C29757R.string.option_order_configuration_error_gtc_market_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
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
        LearningLesson learningLesson = null;
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
        int i5 = -1;
        int i6 = -1;
        int i7 = -2097153;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "market-orders-gtc-dismiss", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0), new Context(i, i2, i3, null, str, str2, str3, productTag, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, new AlertContext(string2, string3, null, 4, null), technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), false, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logGtcAlertModalContinue(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C29757R.string.option_order_configuration_error_gtc_market_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(C29757R.string.option_order_configuration_error_gtc_market_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
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
        LearningLesson learningLesson = null;
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
        int i5 = -1;
        int i6 = -1;
        int i7 = -2097153;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "market-orders-gtc-continue", null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0), new Context(i, i2, i3, null, str, str2, str3, productTag, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, new AlertContext(string2, string3, null, 4, null), technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), false, 32, null);
    }

    public static /* synthetic */ void logOptionConfigurationTap$default(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo, Component.ComponentType componentType, String str, OptionsContext optionsContext, int i, Object obj) {
        if ((i & 4) != 0) {
            optionsContext = null;
        }
        optionConfigurationSelectionDuxo.logOptionConfigurationTap(componentType, str, optionsContext);
    }

    public final void logOptionConfigurationTap(Component.ComponentType componentType, String buttonText, OptionsContext optionsContext) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), new Component(componentType, null, null, 6, null), null, new Context(i, i2, i3, buttonText, str, str2, str3, productTag, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -4194305, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public final void logDisclosureTap() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_ORDER_CONFIGURATION_SELECTION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, OptionOrderLoggings.STOP_MARKET_DISCLOSURE_COMPONENT_IDENTIFIER, null, 4, null), null, null, false, 57, null);
    }

    /* compiled from: OptionConfigurationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionDuxo;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "<init>", "()V", "toOptionsContext", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "Lcom/robinhood/models/db/OptionOrderType;", "toOptionsContext$feature_trade_options_externalDebug", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionConfigurationSelectionDuxo, OptionConfigurationSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionConfigurationSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionConfigurationSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionConfigurationSelectionFragment.Args getArgs(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo) {
            return (OptionConfigurationSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionConfigurationSelectionDuxo);
        }

        public final OptionsContext toOptionsContext$feature_trade_options_externalDebug(OptionOrderType optionOrderType) {
            Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
            return new OptionsContext(null, null, null, null, null, null, null, null, null, null, OptionOrderType2.toRosettaType(optionOrderType), null, null, null, 15359, null);
        }
    }
}
