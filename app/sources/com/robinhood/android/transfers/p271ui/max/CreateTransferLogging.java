package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.data.store.logging.utils.LoggingUtils4;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.models.api.bonfire.ApiCreateQueuedDepositResponse;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.converters.brokerage.Securities;
import com.robinhood.rosetta.converters.cash.Transfers;
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
import com.robinhood.rosetta.eventlogging.Money;
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
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import retrofit2.Response;

/* compiled from: CreateTransferLogging.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000\u001am\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0002\u0010#\u001a2\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000\u001aT\u0010%\u001a\u00020\u0001*\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000\u001a\u001e\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a2\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a,\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002072\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a$\u00108\u001a\u00020/2\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a2\u00109\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020:012\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a6\u0010;\u001a\u00020\u0001*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000¨\u0006@"}, m3636d2 = {"logButtonTransfer", "", "Lcom/robinhood/analytics/EventLogger;", "amount", "Ljava/math/BigDecimal;", "depositSuggestions", "", "entryPointIdentifier", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "wiresContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "screenIdentifier", "componentOverride", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "logTransferSubmit", "transferData", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "refId", "Ljava/util/UUID;", "sessionId", "rothConversionYear", "", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/transfers/ui/max/TransferData;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "logAmountEntered", "logAccountSelected", "account", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "iraContributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "logFrequencySelected", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "createTransferSuccessEvent", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "response", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "transferContext", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "createTransferErrorEvent", "throwable", "", "createTransferBaseEvent", "createQueuedDepositSuccessEvent", "Lcom/robinhood/models/api/bonfire/ApiCreateQueuedDepositResponse;", "logRfpSelection", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "isPrimary", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferLoggingKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferLogging {

    /* compiled from: CreateTransferLogging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferLoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void logButtonTransfer$default(EventLogger eventLogger, BigDecimal bigDecimal, List list, String str, UserInteractionEventData.Action action, Screen.Name name, MAXTransferContext.EntryPoint entryPoint, String str2, UserInteractionEventData.EventType eventType, WiresContext wiresContext, String str3, Component.ComponentType componentType, TransferAccount transferAccount, TransferAccount transferAccount2, int i, Object obj) {
        TransferAccount transferAccount3;
        EventLogger eventLogger2;
        BigDecimal bigDecimal2;
        List list2;
        String str4;
        UserInteractionEventData.Action action2;
        MAXTransferContext.EntryPoint entryPoint2;
        String str5;
        UserInteractionEventData.EventType eventType2;
        Screen.Name name2 = (i & 16) != 0 ? Screen.Name.CREATE_MAX_TRANSFER : name;
        WiresContext wiresContext2 = (i & 256) != 0 ? null : wiresContext;
        String str6 = (i & 512) != 0 ? "" : str3;
        Component.ComponentType componentType2 = (i & 1024) != 0 ? null : componentType;
        TransferAccount transferAccount4 = (i & 2048) != 0 ? null : transferAccount;
        if ((i & 4096) != 0) {
            transferAccount3 = null;
            bigDecimal2 = bigDecimal;
            list2 = list;
            str4 = str;
            action2 = action;
            entryPoint2 = entryPoint;
            str5 = str2;
            eventType2 = eventType;
            eventLogger2 = eventLogger;
        } else {
            transferAccount3 = transferAccount2;
            eventLogger2 = eventLogger;
            bigDecimal2 = bigDecimal;
            list2 = list;
            str4 = str;
            action2 = action;
            entryPoint2 = entryPoint;
            str5 = str2;
            eventType2 = eventType;
        }
        logButtonTransfer(eventLogger2, bigDecimal2, list2, str4, action2, name2, entryPoint2, str5, eventType2, wiresContext2, str6, componentType2, transferAccount4, transferAccount3);
    }

    public static final void logButtonTransfer(EventLogger eventLogger, BigDecimal amount, List<? extends BigDecimal> depositSuggestions, String entryPointIdentifier, UserInteractionEventData.Action action, Screen.Name screenName, MAXTransferContext.EntryPoint entryPoint, String str, UserInteractionEventData.EventType eventType, WiresContext wiresContext, String screenIdentifier, Component.ComponentType componentType, TransferAccount transferAccount, TransferAccount transferAccount2) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(depositSuggestions, "depositSuggestions");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Screen screen = new Screen(screenName, null, screenIdentifier, null, 10, null);
        Component component = new Component(componentType == null ? Component.ComponentType.BUTTON : componentType, null, null, 6, null);
        Money protobuf = Securities.toProtobuf(Money3.toMoney(amount, Currencies.USD));
        List<? extends BigDecimal> list = depositSuggestions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Securities.toProtobuf(Money3.toMoney((BigDecimal) it.next(), Currencies.USD)));
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen, component, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, protobuf, transferAccount != null ? Transfers.toProtobuf(transferAccount) : null, transferAccount2 != null ? Transfers.toProtobuf(transferAccount2) : null, null, null, entryPoint, null, null, null, arrayList, null, null, null, null, str == null ? "" : str, null, null, null, null, 1014705, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wiresContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -131073, -1, -1, -65, -1, 16383, null), null, null, 96, null), false, false, 6, null);
    }

    public static /* synthetic */ void logTransferSubmit$default(EventLogger eventLogger, TransferData transferData, UUID uuid, UUID uuid2, TransferAccount transferAccount, TransferAccount transferAccount2, Screen.Name name, MAXTransferContext.EntryPoint entryPoint, String str, String str2, Integer num, int i, Object obj) {
        Integer num2;
        EventLogger eventLogger2;
        TransferData transferData2;
        UUID uuid3;
        UUID uuid4;
        TransferAccount transferAccount3;
        TransferAccount transferAccount4;
        MAXTransferContext.EntryPoint entryPoint2;
        Screen.Name name2 = (i & 32) != 0 ? Screen.Name.CREATE_MAX_TRANSFER : name;
        String str3 = (i & 128) != 0 ? null : str;
        String str4 = (i & 256) != 0 ? "" : str2;
        if ((i & 512) != 0) {
            num2 = null;
            transferData2 = transferData;
            uuid3 = uuid;
            uuid4 = uuid2;
            transferAccount3 = transferAccount;
            transferAccount4 = transferAccount2;
            entryPoint2 = entryPoint;
            eventLogger2 = eventLogger;
        } else {
            num2 = num;
            eventLogger2 = eventLogger;
            transferData2 = transferData;
            uuid3 = uuid;
            uuid4 = uuid2;
            transferAccount3 = transferAccount;
            transferAccount4 = transferAccount2;
            entryPoint2 = entryPoint;
        }
        logTransferSubmit(eventLogger2, transferData2, uuid3, uuid4, transferAccount3, transferAccount4, name2, entryPoint2, str3, str4, num2);
    }

    public static final void logTransferSubmit(EventLogger eventLogger, TransferData transferData, UUID refId, UUID sessionId, TransferAccount sourceAccount, TransferAccount sinkAccount, Screen.Name screenName, MAXTransferContext.EntryPoint entryPoint, String str, String screenIdentifier, Integer num) {
        String str2;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
        Screen screen = new Screen(screenName, null, screenIdentifier, null, 10, null);
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        String string2 = refId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Money protobuf = Securities.toProtobuf(Money3.toMoney(transferData.getAmount(), Currencies.USD));
        MAXTransferContext.TransferAccount protobuf2 = Transfers.toProtobuf(sourceAccount);
        MAXTransferContext.TransferAccount protobuf3 = Transfers.toProtobuf(sinkAccount);
        TransferContext.Frequency protobuf4 = Transfers.toProtobuf(transferData.getFrequency());
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData = transferData.getIraContributionData();
        MAXTransferContext.IRAContributionData protobuf5 = iraContributionData != null ? Transfers.toProtobuf(iraContributionData) : null;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = transferData.getIraDistributionData();
        MAXTransferContext.IRADistributionData protobuf6 = iraDistributionData != null ? Transfers.toProtobuf(iraDistributionData) : null;
        String string3 = sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        if (str == null) {
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str2 = lowerCase;
        } else {
            str2 = str;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(string2, protobuf, protobuf2, protobuf3, protobuf4, protobuf5, entryPoint, protobuf6, string3, null, null, num != null ? new MAXTransferContext.IRARothConversionData(num.intValue(), null, 2, null) : null, null, null, null, str2, null, null, null, null, 1013248, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public static /* synthetic */ void logAmountEntered$default(EventLogger eventLogger, BigDecimal bigDecimal, Screen.Name name, MAXTransferContext.EntryPoint entryPoint, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        logAmountEntered(eventLogger, bigDecimal, name, entryPoint, str);
    }

    public static final void logAmountEntered(EventLogger eventLogger, BigDecimal amount, Screen.Name screenName, MAXTransferContext.EntryPoint entryPoint, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Screen screen = new Screen(screenName, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.ENTER_TRANSFER_AMOUNT;
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(amount);
        if (str == null) {
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str2 = lowerCase;
        } else {
            str2 = str;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, moneyForLogging, null, null, null, null, entryPoint, null, null, null, null, null, null, null, null, str2, null, null, null, null, 1015741, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public static /* synthetic */ void logAccountSelected$default(EventLogger eventLogger, TransferAccount transferAccount, TransferAccountDirection transferAccountDirection, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, WiresContext wiresContext, Screen.Name name, MAXTransferContext.EntryPoint entryPoint, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            iraContributionData = null;
        }
        if ((i & 8) != 0) {
            wiresContext = null;
        }
        if ((i & 16) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        if ((i & 64) != 0) {
            str = null;
        }
        logAccountSelected(eventLogger, transferAccount, transferAccountDirection, iraContributionData, wiresContext, name, entryPoint, str);
    }

    public static final void logAccountSelected(EventLogger eventLogger, TransferAccount transferAccount, TransferAccountDirection direction, ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData, WiresContext wiresContext, Screen.Name screenName, MAXTransferContext.EntryPoint entryPoint, String str) {
        MAXTransferContext mAXTransferContext;
        String str2;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Screen screen = new Screen(screenName, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT_ACCOUNT;
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            mAXTransferContext = new MAXTransferContext(null, null, transferAccount != null ? Transfers.toProtobuf(transferAccount) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048571, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mAXTransferContext = new MAXTransferContext(null, null, null, transferAccount != null ? Transfers.toProtobuf(transferAccount) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048567, null);
        }
        MAXTransferContext mAXTransferContext2 = mAXTransferContext;
        MAXTransferContext.IRAContributionData protobuf = iraContributionData != null ? Transfers.toProtobuf(iraContributionData) : null;
        if (str == null) {
            String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str2 = lowerCase;
        } else {
            str2 = str;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContext2.copy((377169 & 1) != 0 ? mAXTransferContext2.id : null, (377169 & 2) != 0 ? mAXTransferContext2.amount : null, (377169 & 4) != 0 ? mAXTransferContext2.source_account : null, (377169 & 8) != 0 ? mAXTransferContext2.sink_account : null, (377169 & 16) != 0 ? mAXTransferContext2.frequency : null, (377169 & 32) != 0 ? mAXTransferContext2.ira_contribution_data : protobuf, (377169 & 64) != 0 ? mAXTransferContext2.entry_point : entryPoint, (377169 & 128) != 0 ? mAXTransferContext2.ira_distribution_data : null, (377169 & 256) != 0 ? mAXTransferContext2.session_id : null, (377169 & 512) != 0 ? mAXTransferContext2.ach_transfer_data : null, (377169 & 1024) != 0 ? mAXTransferContext2.deposit_suggestions : null, (377169 & 2048) != 0 ? mAXTransferContext2.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? mAXTransferContext2.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? mAXTransferContext2.currency_conversion_data : null, (377169 & 16384) != 0 ? mAXTransferContext2.locality : null, (377169 & 32768) != 0 ? mAXTransferContext2.entry_point_logging_identifier : str2, (377169 & 65536) != 0 ? mAXTransferContext2.transfer_v2_direction : null, (377169 & 131072) != 0 ? mAXTransferContext2.selected_pill_amount : null, (377169 & 262144) != 0 ? mAXTransferContext2.transfer_method : null, (377169 & 524288) != 0 ? mAXTransferContext2.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wiresContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -65, -1, 16383, null), false, 40, null);
    }

    public static /* synthetic */ void logFrequencySelected$default(EventLogger eventLogger, ApiCreateTransferRequest2 apiCreateTransferRequest2, Screen.Name name, int i, Object obj) {
        if ((i & 2) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        logFrequencySelected(eventLogger, apiCreateTransferRequest2, name);
    }

    public static final void logFrequencySelected(EventLogger eventLogger, ApiCreateTransferRequest2 frequency, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT_FREQUENCY, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, new Context(i, i2, i3, null, null, str, null, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, null, null, null, Transfers.toProtobuf(frequency), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048559, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public static /* synthetic */ UserInteractionEventData createTransferSuccessEvent$default(Response response, MAXTransferContext mAXTransferContext, String str, Screen.Name name, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        return createTransferSuccessEvent(response, mAXTransferContext, str, name);
    }

    public static final UserInteractionEventData createTransferSuccessEvent(Response<ApiCreateTransferResponse> response, MAXTransferContext transferContext, String entryPointIdentifier, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        UserInteractionEventData userInteractionEventDataCreateTransferBaseEvent = createTransferBaseEvent(transferContext, entryPointIdentifier, screenName);
        Context context = userInteractionEventDataCreateTransferBaseEvent.getContext();
        Context context2 = context == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : context;
        NetworkContext networkContext = LoggingUtils4.toNetworkContext(response, NetworkContext.Tag.SUBMIT_TRANSFER);
        ApiCreateTransferResponse apiCreateTransferResponseBody = response.body();
        String transferId = apiCreateTransferResponseBody != null ? apiCreateTransferResponseBody.getTransferId() : null;
        if (transferId == null) {
            transferId = "";
        }
        return UserInteractionEventData.copy$default(userInteractionEventDataCreateTransferBaseEvent, null, null, null, null, Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, networkContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InstantDeposit(null, transferId, null, 5, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -129, -1, -1, -1, 16383, null), null, null, 111, null);
    }

    public static /* synthetic */ UserInteractionEventData createTransferErrorEvent$default(Throwable th, MAXTransferContext mAXTransferContext, String str, Screen.Name name, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        return createTransferErrorEvent(th, mAXTransferContext, str, name);
    }

    public static final UserInteractionEventData createTransferErrorEvent(Throwable throwable, MAXTransferContext transferContext, String entryPointIdentifier, Screen.Name screenName) {
        Context context;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        UserInteractionEventData userInteractionEventDataCreateTransferBaseEvent = createTransferBaseEvent(transferContext, entryPointIdentifier, screenName);
        Context context2 = userInteractionEventDataCreateTransferBaseEvent.getContext();
        if (context2 == null) {
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
        } else {
            context = context2;
        }
        return UserInteractionEventData.copy$default(userInteractionEventDataCreateTransferBaseEvent, null, null, null, null, Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LoggingUtils4.toNetworkContext(throwable, NetworkContext.Tag.SUBMIT_TRANSFER), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8193, -1, -1, -1, -1, 16383, null), null, null, 111, null);
    }

    public static /* synthetic */ UserInteractionEventData createTransferBaseEvent$default(MAXTransferContext mAXTransferContext, String str, Screen.Name name, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        return createTransferBaseEvent(mAXTransferContext, str, name);
    }

    public static final UserInteractionEventData createTransferBaseEvent(MAXTransferContext transferContext, String entryPointIdentifier, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, new Screen(screenName, null, null, null, 14, null), null, null, new Context(i, i2, i3, null, null, null, null, Context.ProductTag.TRANSFERS, 0, null, entryPointIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, transferContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -131073, -1, -1, -1, -1, 16383, null), null, null, 108, null);
    }

    public static /* synthetic */ UserInteractionEventData createQueuedDepositSuccessEvent$default(Response response, MAXTransferContext mAXTransferContext, String str, Screen.Name name, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        return createQueuedDepositSuccessEvent(response, mAXTransferContext, str, name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UserInteractionEventData createQueuedDepositSuccessEvent(Response<ApiCreateQueuedDepositResponse> response, MAXTransferContext transferContext, String entryPointIdentifier, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transferContext, "transferContext");
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Screen screen = new Screen(screenName, null, null, null, 14, null);
        NetworkContext networkContext = LoggingUtils4.toNetworkContext(response, NetworkContext.Tag.SUBMIT_TRANSFER);
        Context.ProductTag productTag = Context.ProductTag.TRANSFERS;
        ApiCreateQueuedDepositResponse apiCreateQueuedDepositResponseBody = response.body();
        String transferId = apiCreateQueuedDepositResponseBody != null ? apiCreateQueuedDepositResponseBody.getTransferId() : null;
        if (transferId == null) {
            transferId = "";
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        Screen screen2 = null;
        String str5 = null;
        Asset asset = null;
        com.robinhood.rosetta.eventlogging.List list = null;
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
        PlaidEventData plaidEventData = null;
        IAVContext iAVContext = null;
        TransferContext transferContext2 = null;
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
        ByteString byteString = null;
        int i5 = -1153;
        int i6 = -139265;
        int i7 = -129;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, screen, null, null, new Context(i, i2, i3, 0 == true ? 1 : 0, str, objArr, str2, productTag, i4, str3, entryPointIdentifier, str4, screen2, str5, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str6, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext2, transferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, new InstantDeposit(null, transferId, null, 5, null), cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str7, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), null, null, 108, null);
    }

    public static final void logRfpSelection(EventLogger eventLogger, Screen screen, boolean z, BigDecimal amount, MAXTransferContext.EntryPoint entryPoint, String str) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        if (z) {
            action = UserInteractionEventData.Action.PRIMARY_CTA;
        } else {
            action = UserInteractionEventData.Action.SECONDARY_CTA;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(Component.ComponentType.BOTTOM_SHEET, "rfp_upsell", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, ExtensionsKt.toMoneyForLogging(amount), null, null, null, null, entryPoint, null, null, null, null, null, null, null, null, str == null ? "" : str, null, null, null, null, 1015741, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}
