package com.robinhood.android.equitytradeladder;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment2;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderFragmentKey;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderKillswitchExperiment;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equitytrade.OrderStatusAlert;
import com.robinhood.android.equities.equitytrade.OrderStatusEvent;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.equities.equityupsell.EquityUpsell;
import com.robinhood.android.equities.equityupsell.EquityUpsellService;
import com.robinhood.android.equities.equityupsell.UpsellLocation;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxManager;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxProgressState;
import com.robinhood.android.equities.orderstatus.OrderConfirmationDescription;
import com.robinhood.android.equities.orderstatus.OrderConfirmationStatusString;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.bin.EquityTradeLadderBinManager;
import com.robinhood.android.equitytradeladder.extensions.EquityOrderContext2;
import com.robinhood.android.equitytradeladder.extensions.EquityOrders;
import com.robinhood.android.equitytradeladder.extensions.Flow2;
import com.robinhood.android.equitytradeladder.extensions.Logging6;
import com.robinhood.android.equitytradeladder.marketsession.MarketSessionChangeDataState;
import com.robinhood.android.equitytradeladder.marketsession.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState2;
import com.robinhood.android.equitytradeladder.models.EquityOrderTrigger;
import com.robinhood.android.equitytradeladder.models.EquityPendingOrder3;
import com.robinhood.android.equitytradeladder.models.EquityPendingOrder6;
import com.robinhood.android.equitytradeladder.models.EquityQuote;
import com.robinhood.android.equitytradeladder.models.PendingCanceledOrder;
import com.robinhood.android.equitytradeladder.models.PendingFilledOrder;
import com.robinhood.android.equitytradeladder.models.PendingPlacedOrder;
import com.robinhood.android.equitytradeladder.models.PendingReplacedOrder;
import com.robinhood.android.equitytradeladder.p128di.EquityTradeLadderModule3;
import com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState;
import com.robinhood.android.equitytradeladder.prefs.PostTradeLadderFtuxStatePref;
import com.robinhood.android.equitytradeladder.provider.LadderNuxScreenProvider;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.portfolio.pnl.ProfitAndLossAverageCostRetirementExperiment;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.ExperimentsKt;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentQueryMode;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityPositionType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.p355ui.InstrumentExternalHalt;
import com.robinhood.models.serverdriven.p347db.ActionButton;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.prefs.EnumPreference;
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
import com.robinhood.rosetta.eventlogging.ConciergeSupportContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CortexDigestContext;
import com.robinhood.rosetta.eventlogging.CortexDigestOnboardingContext;
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
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
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
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler2;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler3;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.tradeladder.p398ui.LadderInteraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceData;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderUserInteractionData;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.trading.tradecomponentscompose.C41061R;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.p413md.MdTopic;
import com.robinhood.websocket.p413md.MdWebsocketSource;
import com.robinhood.websocket.p413md.models.MdFeedData;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import retrofit2.Response;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Ú\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0004Û\u0001Ú\u0001B\u0085\u0002\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0001\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020G2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bO\u0010PJC\u0010Z\u001a\u00020G2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u0002012\u0006\u0010Y\u001a\u000201H\u0002¢\u0006\u0004\bZ\u0010[Jd\u0010`\u001a\u00020_2\u0006\u0010\\\u001a\u00020N2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010U2\u0006\u0010X\u001a\u0002012\u0006\u0010Y\u001a\u0002012\n\b\u0002\u0010]\u001a\u0004\u0018\u0001012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010UH\u0082@¢\u0006\u0004\b`\u0010aJ/\u0010h\u001a\u0002012\u0006\u0010b\u001a\u00020S2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020NH\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020G*\u00020_H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020G2\u0006\u0010l\u001a\u00020\u0002H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020G2\u0006\u0010l\u001a\u00020\u0002H\u0002¢\u0006\u0004\bo\u0010nJ%\u0010r\u001a\u00020G2\u0006\u0010f\u001a\u00020e2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020N0pH\u0002¢\u0006\u0004\br\u0010sJ\u001f\u0010x\u001a\u00020G2\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020GH\u0016¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020G¢\u0006\u0004\b|\u0010{J\r\u0010}\u001a\u00020G¢\u0006\u0004\b}\u0010{J\r\u0010~\u001a\u00020G¢\u0006\u0004\b~\u0010{J\r\u0010\u007f\u001a\u00020G¢\u0006\u0004\b\u007f\u0010{J\u000f\u0010\u0080\u0001\u001a\u00020G¢\u0006\u0005\b\u0080\u0001\u0010{J\u0019\u0010\u0082\u0001\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020U¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0086\u0001\u001a\u00020G2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0089\u0001\u001a\u00020G2\u0007\u0010\u0088\u0001\u001a\u000201¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u008b\u0001\u001a\u00020G¢\u0006\u0005\b\u008b\u0001\u0010{J\u000f\u0010\u008c\u0001\u001a\u00020G¢\u0006\u0005\b\u008c\u0001\u0010{J$\u0010\u0091\u0001\u001a\u00020G2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J&\u0010\u0097\u0001\u001a\u00020G2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020G¢\u0006\u0005\b\u0099\u0001\u0010{J\"\u0010\u009c\u0001\u001a\u00020G2\u0007\u0010l\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u000201¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009e\u0001\u001a\u00020G2\t\u0010l\u001a\u0005\u0018\u00010\u009a\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0019\u0010¡\u0001\u001a\u00020G2\u0007\u0010 \u0001\u001a\u000201¢\u0006\u0006\b¡\u0001\u0010\u008a\u0001J\u000f\u0010¢\u0001\u001a\u00020G¢\u0006\u0005\b¢\u0001\u0010{J\u0019\u0010¤\u0001\u001a\u00020G2\u0007\u0010£\u0001\u001a\u000201¢\u0006\u0006\b¤\u0001\u0010\u008a\u0001J\u000f\u0010¥\u0001\u001a\u00020G¢\u0006\u0005\b¥\u0001\u0010{J\u000f\u0010¦\u0001\u001a\u00020G¢\u0006\u0005\b¦\u0001\u0010{J\u000f\u0010§\u0001\u001a\u00020G¢\u0006\u0005\b§\u0001\u0010{J\u000f\u0010¨\u0001\u001a\u00020G¢\u0006\u0005\b¨\u0001\u0010{J\u000f\u0010©\u0001\u001a\u00020G¢\u0006\u0005\b©\u0001\u0010{J\u000f\u0010ª\u0001\u001a\u00020G¢\u0006\u0005\bª\u0001\u0010{J\u000f\u0010«\u0001\u001a\u00020G¢\u0006\u0005\b«\u0001\u0010{J\u000f\u0010¬\u0001\u001a\u00020G¢\u0006\u0005\b¬\u0001\u0010{R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u00ad\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010®\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¯\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010°\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010±\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010²\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010³\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010´\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010µ\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¶\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010·\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010¸\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010¹\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010º\u0001R\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010»\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010¼\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010½\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010¾\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010¿\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010À\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010Á\u0001R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010Â\u0001R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010Ã\u0001R\u0015\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010Ä\u0001R\u0015\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010Å\u0001R\u0015\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010Æ\u0001R\u0015\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010Ç\u0001R\u001d\u0010B\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bB\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u001b\u0010Ë\u0001\u001a\u00020N8\u0006¢\u0006\u000f\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0005\bÍ\u0001\u0010PR\u001f\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ï\u00010Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001f\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010Õ\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Â\u0001R\u001b\u0010Ö\u0001\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Ì\u0001R\u0018\u0010Ø\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001¨\u0006Ü\u0001"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "Lcom/robinhood/shared/tradeladder/ui/ladder/BaseLadderDuxo;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "equityTradeService", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;", "equityTradeLadderBinManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "ladderFtuxManager", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "ladderNuxScreenProvider", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "mdWebsocketSource", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "streamMarketSessionChangeState", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "", "skipWebsocketFallback", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "subzeroOnboardingHandler", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "equityUpsellService", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/android/lib/account/AccountProvider;Lj$/time/Clock;Lcom/robinhood/android/equities/equitytrade/EquityTradeService;Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/websocket/md/MdWebsocketSource;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lcom/robinhood/android/common/buysell/BuySellStore;ZLcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "", "throwable", "", "handleOrderThrowable", "(Ljava/lang/Throwable;)V", "Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;", "event", "handleOrderStatusEvents", "(Lcom/robinhood/android/equities/equitytrade/OrderStatusEvent;)V", "Ljava/util/UUID;", "generateNewRefId", "()Ljava/util/UUID;", "Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "orderState", "Lcom/robinhood/models/db/EquityOrderSide;", "orderSide", "Ljava/math/BigDecimal;", "limitPrice", "stopPrice", "marketBuysEnabled", "subzeroEnabled", "handleSubmitOrder", "(Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZ)V", "refId", "autoSendOverride", "orderTradeAmountOverride", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "submitOrder", "(Ljava/util/UUID;Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/Boolean;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tradeSide", "Lcom/robinhood/models/api/AccountType;", "accountType", "", "accountNumber", "instrumentId", "handleSubzeroOnboarding", "(Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/api/AccountType;Ljava/lang/String;Ljava/util/UUID;)Z", "handleOrderSubmitResult", "(Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;)V", "state", "cancelOrder", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;)V", "replaceOrder", "", "orderIds", "cancelOrdersFallback", "(Ljava/lang/String;Ljava/util/Set;)V", "Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;", "ladderInteraction", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;", "userInteractionData", "onUserInteraction", "(Lcom/robinhood/shared/tradeladder/ui/LadderInteraction;Lcom/robinhood/shared/tradeladder/ui/ladder/models/ILadderUserInteractionData;)V", "onCreate", "()V", "onMarketBuyClicked", "onMarketSellClicked", "onNbboRefreshed", "onQuantitySelectorClicked", "onQuantitySelectorDismiss", "quantity", "onQuantityUpdated", "(Ljava/math/BigDecimal;)V", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "mode", "onQuantityInputModeChanged", "(Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;)V", "visibility", "onSettingsVisibilityChanged", "(Z)V", "onFlattenClicked", "onOpenOrdersClicked", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckAlert;", "alert", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "button", "onOrderCheckAction", "(Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent$OrderCheckAlert;Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;)V", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "equityOrderIntent", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "action", "onDirectOrderCheckAction", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/models/serverdriven/db/GenericAction;)V", "onPnlClick", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "advance", "setScreenState", "(Lcom/robinhood/android/equitytradeladder/LadderScreenState;Z)V", "advanceScreenState", "(Lcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "showConfirmationToast", "onAutoSendAgreementSigned", "onAutosendUpsellDismissed", "checked", "onAutoSendToggled", "showNextPostTradeFtuxState", "onNuxSeen", "onNewNuxBackClicked", "onExistingNuxBackClicked", "onNewNuxContinueClicked", "onExistingNuxContinueClicked", "onLoadingNuxSeen", "onLadderEducationCtaClick", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lj$/time/Clock;", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Lcom/robinhood/android/common/buysell/BuySellStore;", "Z", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "screenLoadContextualId", "Ljava/util/UUID;", "getScreenLoadContextualId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;", "binConfiguration", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/collections/ArrayDeque;", "screenStateQueue", "Lkotlin/collections/ArrayDeque;", "tradeInFlight", "lastSuccessOrderId", "Lcom/robinhood/rosetta/eventlogging/Screen;", "ladderScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Companion", "LadderPriceLevelData", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityTradeLadderDuxo extends BaseLadderDuxo<EquityTradeLadderDataState, EquityTradeLadderViewState, EquityTradeLadderEvent> implements HasSavedState {
    public static final String EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY = "EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY";
    private static final long FLATTEN_TIMEOUT = 7000;
    private static final long ONE_SECOND = 1000;
    private static final long TIMEOUT;
    private final AccountProvider accountProvider;
    private final InstrumentAccountSwitcherStore accountSwitcherStore;
    private final StateFlow2<EquityTradeLadderBinManager.BinConfiguration> binConfiguration;
    private final BuySellStore buySellStore;
    private final Clock clock;
    private final EquityTradeLadderBinManager equityTradeLadderBinManager;
    private final EquityTradeService equityTradeService;
    private final EquityUpsellService equityUpsellService;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    private final EquityTradeLadderFtuxManager ladderFtuxManager;
    private final LadderNuxScreenProvider ladderNuxScreenProvider;
    private final Screen ladderScreen;
    private UUID lastSuccessOrderId;
    private final TraderMarketHoursManager marketHoursManager;
    private final MdWebsocketSource mdWebsocketSource;
    private final NbboSummaryStore nbboSummaryStore;
    private final OrderStore orderStore;
    private final PerformanceLogger performanceLogger;
    private final PositionStore positionStore;
    private final EnumPreference<EquityPostTradeLadderFtuxState> postTradeLadderFtuxStatePref;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UUID screenLoadContextualId;
    private final ArrayDeque<LadderScreenState> screenStateQueue;
    private final ShortingInfoStore shortingInfoStore;
    private final boolean skipWebsocketFallback;
    private final StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState;
    private final SubzeroOnboardingHandler subzeroOnboardingHandler;
    private boolean tradeInFlight;
    private final TradeSettingsStore tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EquityTradeLadderDuxo(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, AccountProvider accountProvider, Clock clock, EquityTradeService equityTradeService, EquityTradeLadderBinManager equityTradeLadderBinManager, ExperimentsStore experimentsStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, EquityTradeLadderFtuxManager equityTradeLadderFtuxManager, LadderNuxScreenProvider ladderNuxScreenProvider, TraderMarketHoursManager traderMarketHoursManager, MdWebsocketSource mdWebsocketSource, NbboSummaryStore nbboSummaryStore, OrderStore orderStore, EnumPreference enumPreference, PositionStore positionStore, QuoteStore quoteStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, TradeSettingsStore tradeSettingsStore, BuySellStore buySellStore, boolean z, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EventLogger eventLogger, EquityUpsellService equityUpsellService, PerformanceLogger performanceLogger, DuxoBundle duxoBundle, EquityTradeLadderStateProvider equityTradeLadderStateProvider, SavedStateHandle savedStateHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(instrumentAccountSwitcherStore, accountProvider, clock, equityTradeService, equityTradeLadderBinManager, experimentsStore, instrumentBuyingPowerStore, instrumentStore, equityTradeLadderFtuxManager, ladderNuxScreenProvider, traderMarketHoursManager, mdWebsocketSource, nbboSummaryStore, orderStore, enumPreference, positionStore, quoteStore, regionGateProvider, streamMarketSessionChangeStateUseCase, tradeSettingsStore, buySellStore, z, shortingInfoStore, subzeroOnboardingHandler, eventLogger, equityUpsellService, performanceLogger, duxoBundle, (i & 268435456) != 0 ? new EquityTradeLadderStateProvider() : equityTradeLadderStateProvider, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityTradeLadderDuxo(InstrumentAccountSwitcherStore accountSwitcherStore, AccountProvider accountProvider, Clock clock, EquityTradeService equityTradeService, EquityTradeLadderBinManager equityTradeLadderBinManager, ExperimentsStore experimentsStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, EquityTradeLadderFtuxManager ladderFtuxManager, LadderNuxScreenProvider ladderNuxScreenProvider, TraderMarketHoursManager marketHoursManager, MdWebsocketSource mdWebsocketSource, NbboSummaryStore nbboSummaryStore, OrderStore orderStore, @PostTradeLadderFtuxStatePref EnumPreference<EquityPostTradeLadderFtuxState> postTradeLadderFtuxStatePref, PositionStore positionStore, QuoteStore quoteStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState, TradeSettingsStore tradeSettingsStore, BuySellStore buySellStore, @EquityTradeLadderModule3 boolean z, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EventLogger eventLogger, EquityUpsellService equityUpsellService, PerformanceLogger performanceLogger, DuxoBundle duxoBundle, EquityTradeLadderStateProvider stateProvider, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(equityTradeLadderBinManager, "equityTradeLadderBinManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
        Intrinsics.checkNotNullParameter(ladderNuxScreenProvider, "ladderNuxScreenProvider");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(mdWebsocketSource, "mdWebsocketSource");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new EquityTradeLadderDataState(((EquityTradeLadderFragmentKey) companion.getArgs(savedStateHandle)).getInstrumentId(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, Boolean.valueOf(tradeSettingsStore.getAutoSendPref(TradeSettingsStore4.LADDER)), null, null, null, null, null, clock, null, null, ladderNuxScreenProvider.determineFirstScreen(((EquityTradeLadderFragmentKey) companion.getArgs(savedStateHandle)).getSkipNux()), null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -75628546, 268435455, null), stateProvider, duxoBundle);
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountProvider = accountProvider;
        this.clock = clock;
        this.equityTradeService = equityTradeService;
        this.equityTradeLadderBinManager = equityTradeLadderBinManager;
        this.experimentsStore = experimentsStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.instrumentStore = instrumentStore;
        this.ladderFtuxManager = ladderFtuxManager;
        this.ladderNuxScreenProvider = ladderNuxScreenProvider;
        this.marketHoursManager = marketHoursManager;
        this.mdWebsocketSource = mdWebsocketSource;
        this.nbboSummaryStore = nbboSummaryStore;
        this.orderStore = orderStore;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.regionGateProvider = regionGateProvider;
        this.streamMarketSessionChangeState = streamMarketSessionChangeState;
        this.tradeSettingsStore = tradeSettingsStore;
        this.buySellStore = buySellStore;
        this.skipWebsocketFallback = z;
        this.shortingInfoStore = shortingInfoStore;
        this.subzeroOnboardingHandler = subzeroOnboardingHandler;
        this.eventLogger = eventLogger;
        this.equityUpsellService = equityUpsellService;
        this.performanceLogger = performanceLogger;
        this.savedStateHandle = savedStateHandle;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.screenLoadContextualId = uuidRandomUUID;
        this.binConfiguration = StateFlow4.MutableStateFlow(EquityTradeLadderBinManager.getDefaultConfiguration$default(equityTradeLadderBinManager, 0, 1, null));
        this.screenStateQueue = new ArrayDeque<>();
        Screen.Name name = Screen.Name.EQUITIES_TRADING_LADDER;
        String source = ((EquityTradeLadderFragmentKey) companion.getArgs((HasSavedState) this)).getSource();
        this.ladderScreen = new Screen(name, source == null ? "" : source, ((EquityTradeLadderFragmentKey) companion.getArgs((HasSavedState) this)).getInstrumentId(), null, 8, null);
    }

    public final UUID getScreenLoadContextualId() {
        return this.screenLoadContextualId;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo3
    public void onUserInteraction(final LadderInteraction ladderInteraction, LadderUserInteractionData userInteractionData) {
        LadderState.LadderData ladder;
        Intrinsics.checkNotNullParameter(ladderInteraction, "ladderInteraction");
        Intrinsics.checkNotNullParameter(userInteractionData, "userInteractionData");
        if (ladderInteraction instanceof LadderInteraction.ZoomStateChanged) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$0(ladderInteraction, this, (EquityTradeLadderDataState) obj);
                }
            });
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.ZoomScaleChanged) {
            applyMutation(new C158532(ladderInteraction, null));
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.PendingOrderDragDirectionChanged) {
            applyMutation(new C158543(ladderInteraction, null));
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.PendingOrderDragEnded) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$1(ladderInteraction, this, (EquityTradeLadderDataState) obj);
                }
            });
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.PendingOrderSelected) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$2(this.f$0, (EquityTradeLadderDataState) obj);
                }
            });
            LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ((LadderInteraction.PendingOrderSelected) ladderInteraction).getSelectedPendingOrders();
            submit(new EquityTradeLadderEvent.HapticFeedbacks(25));
            applyMutation(new C158556(selectedPendingOrders, null));
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.PendingOrderClicked) {
            LadderState.LadderData.SelectedPendingOrders selectedPendingOrders2 = ((LadderInteraction.PendingOrderClicked) ladderInteraction).getSelectedPendingOrders();
            if (selectedPendingOrders2 instanceof LadderState.LadderData.SelectedPendingOrders.Single) {
                submit(new EquityTradeLadderEvent.LaunchFragment(LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ORDER, ((LadderState.LadderData.SelectedPendingOrders.Single) selectedPendingOrders2).getOrderId(), null, false, 12, null)));
                return;
            }
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.PendingOrderDraggedOverRowChanged) {
            applyMutation(new C158567(((LadderInteraction.PendingOrderDraggedOverRowChanged) ladderInteraction).getNewDraggedOverIndex(), this, null));
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.RowClicked) {
            applyMutation(new C158578(ladderInteraction, null));
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$3(this.f$0, (EquityTradeLadderDataState) obj);
                }
            });
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.StartSideOrderClicked) {
            final EquityLadderOrderState orderState = ((EquityTradeLadderViewState) getStateFlow().getValue()).getOrderState();
            if (orderState == null) {
                return;
            }
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$4(this.f$0, ladderInteraction, orderState, (EquityTradeLadderDataState) obj);
                }
            });
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.EndSideOrderClicked) {
            final EquityLadderOrderState orderState2 = ((EquityTradeLadderViewState) getStateFlow().getValue()).getOrderState();
            if (orderState2 == null || (ladder = ((EquityTradeLadderViewState) getStateFlow().getValue()).getLadderState().getLadder()) == null || ladder.getLadderPriceLevels() == null) {
                return;
            }
            StringResource sellCheckString = this.equityTradeService.getSellCheckString(orderState2.getBuySellData(), orderState2.getAllowShorting(), OrderType.LIMIT, EquityOrderTrigger.orderTrigger(((LadderInteraction.EndSideOrderClicked) ladderInteraction).getOrderTrigger()));
            if (sellCheckString != null || !orderState2.getSellEnabled()) {
                if (sellCheckString != null) {
                    submit(new EquityTradeLadderEvent.Snackbar(null, sellCheckString, null, null, false, 13, null));
                    return;
                }
                return;
            } else {
                if (handleSubzeroOnboarding(orderState2.getSellOrderSide(), orderState2.getAccount().getType(), orderState2.getAccount().getAccountNumber(), orderState2.getInstrument().getId()) || this.tradeInFlight) {
                    return;
                }
                this.tradeInFlight = true;
                withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityTradeLadderDuxo.onUserInteraction$lambda$6(ladderInteraction, this, orderState2, (EquityTradeLadderDataState) obj);
                    }
                });
                return;
            }
        }
        if (ladderInteraction instanceof LadderInteraction.ContinueToNextFtuxState) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onUserInteraction$lambda$7(this.f$0, (EquityTradeLadderDataState) obj);
                }
            });
            return;
        }
        if (ladderInteraction instanceof LadderInteraction.BackToPreviousFtuxState) {
            applyMutation(new C1585114(null));
        } else {
            if (!(ladderInteraction instanceof LadderInteraction.ExitFtux)) {
                throw new NoWhenBranchMatchedException();
            }
            setScreenState(LadderScreenState.NuxLoading.INSTANCE, true);
            this.ladderFtuxManager.onFtuxCompleted();
            getSavedStateHandle().remove(EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY);
            applyMutation(new C1585215(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$0(LadderInteraction ladderInteraction, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState it) {
        BigDecimal priceIncrement;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!((LadderInteraction.ZoomStateChanged) ladderInteraction).getStarted()) {
            EventLogger eventLogger = equityTradeLadderDuxo.eventLogger;
            UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.DRAG;
            Screen screen = equityTradeLadderDuxo.ladderScreen;
            UserInteractionEventData.Action action = UserInteractionEventData.Action.ZOOM;
            EquitiesLadderContext equitiesLadderContext = it.getEquitiesLadderContext();
            LadderPriceLevels ladderPriceLevels = it.getLadderPriceLevels();
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, screen, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EquitiesLadderContext.copy$default(equitiesLadderContext, null, false, (ladderPriceLevels == null || (priceIncrement = ladderPriceLevels.getPriceIncrement()) == null) ? 0.0d : priceIncrement.doubleValue(), 0.0d, null, 27, null), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), null, null, 100, null), false, false, 6, null);
        }
        equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onUserInteraction$1$1(ladderInteraction, it, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$2 */
    static final class C158532 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ LadderInteraction $ladderInteraction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158532(LadderInteraction ladderInteraction, Continuation<? super C158532> continuation) {
            super(2, continuation);
            this.$ladderInteraction = ladderInteraction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158532 c158532 = EquityTradeLadderDuxo.this.new C158532(this.$ladderInteraction, continuation);
            c158532.L$0 = obj;
            return c158532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158532) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                EquityTradeLadderBinManager.BinConfiguration binConfiguration = (EquityTradeLadderBinManager.BinConfiguration) EquityTradeLadderDuxo.this.binConfiguration.getValue();
                if (equityTradeLadderDataState.getLadderPriceLevels() == null || equityTradeLadderDataState.getLadderPriceLevels().getScale() == ((LadderInteraction.ZoomScaleChanged) this.$ladderInteraction).getZoomScale()) {
                    return equityTradeLadderDataState;
                }
                EquityTradeLadderBinManager.BinConfiguration binConfigurationUpdateConfigurationScale = EquityTradeLadderDuxo.this.equityTradeLadderBinManager.updateConfigurationScale(binConfiguration, ((LadderInteraction.ZoomScaleChanged) this.$ladderInteraction).getZoomScale());
                StateFlow2 stateFlow2 = EquityTradeLadderDuxo.this.binConfiguration;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, binConfigurationUpdateConfigurationScale));
                return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, equityTradeLadderDataState.getLadderPriceLevels().copyForZoom(binConfigurationUpdateConfigurationScale.getScale(), binConfigurationUpdateConfigurationScale.getIncrement()), new LinkedHashMap(), null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -769, 268435455, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$3 */
    static final class C158543 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ LadderInteraction $ladderInteraction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158543(LadderInteraction ladderInteraction, Continuation<? super C158543> continuation) {
            super(2, continuation);
            this.$ladderInteraction = ladderInteraction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158543 c158543 = new C158543(this.$ladderInteraction, continuation);
            c158543.L$0 = obj;
            return c158543;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158543) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            return equityTradeLadderDataState.getSelectedPendingOrders() != null ? EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, ((LadderInteraction.PendingOrderDragDirectionChanged) this.$ladderInteraction).getDragDirection(), null, null, false, false, false, false, false, false, false, false, -1, 268304383, null) : equityTradeLadderDataState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$1(LadderInteraction ladderInteraction, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        LadderInteraction.PendingOrderDragEnded pendingOrderDragEnded = (LadderInteraction.PendingOrderDragEnded) ladderInteraction;
        if ((pendingOrderDragEnded.getSuccess() && ds.getSelectedPendingOrders() != null && pendingOrderDragEnded.isDelete()) || ds.getShouldPendingOrderChangePriceOnDragEnded()) {
            if (pendingOrderDragEnded.isDelete()) {
                equityTradeLadderDuxo.cancelOrder(ds);
            } else {
                equityTradeLadderDuxo.replaceOrder(ds);
            }
        } else {
            equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onUserInteraction$4$1(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$2(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        EventLogger.DefaultImpls.logTap$default(equityTradeLadderDuxo.eventLogger, UserInteractionEventData.Action.LADDER_SELECT_BULK_PENDING_ORDERS, equityTradeLadderDuxo.ladderScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ds.getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), false, 44, null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$6", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$6 */
    static final class C158556 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ LadderState.LadderData.SelectedPendingOrders $selectedPendingOrders;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158556(LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, Continuation<? super C158556> continuation) {
            super(2, continuation);
            this.$selectedPendingOrders = selectedPendingOrders;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158556 c158556 = new C158556(this.$selectedPendingOrders, continuation);
            c158556.L$0 = obj;
            return c158556;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158556) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default(((EquityTradeLadderDataState) this.L$0).copyToClearSelectionState(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, boxing.boxInt(this.$selectedPendingOrders.getRowIndex()), null, null, this.$selectedPendingOrders, false, false, false, false, false, false, false, false, -1, 267845631, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$7", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$7 */
    static final class C158567 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ int $newDraggedOverIndex;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158567(int i, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super C158567> continuation) {
            super(2, continuation);
            this.$newDraggedOverIndex = i;
            this.this$0 = equityTradeLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158567 c158567 = new C158567(this.$newDraggedOverIndex, this.this$0, continuation);
            c158567.L$0 = obj;
            return c158567;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158567) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            Integer orderDraggedOverIndex = equityTradeLadderDataState.getOrderDraggedOverIndex();
            int i = this.$newDraggedOverIndex;
            if (orderDraggedOverIndex != null && orderDraggedOverIndex.intValue() == i) {
                return equityTradeLadderDataState;
            }
            this.this$0.submit(new EquityTradeLadderEvent.HapticFeedbacks(26));
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, boxing.boxInt(this.$newDraggedOverIndex), null, null, null, false, false, false, false, false, false, false, false, -1, 268369919, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$8", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$8 */
    static final class C158578 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ LadderInteraction $ladderInteraction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158578(LadderInteraction ladderInteraction, Continuation<? super C158578> continuation) {
            super(2, continuation);
            this.$ladderInteraction = ladderInteraction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158578 c158578 = EquityTradeLadderDuxo.this.new C158578(this.$ladderInteraction, continuation);
            c158578.L$0 = obj;
            return c158578;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158578) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            LadderPriceLevels ladderPriceLevels;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            if (equityTradeLadderDataState.getSelectedRowIndex() != null || equityTradeLadderDataState.getQuantitySelectorOpen() || equityTradeLadderDataState.getSelectedPendingOrders() != null || equityTradeLadderDataState.getShowNbbo()) {
                return equityTradeLadderDataState.copyToClearSelectionState();
            }
            EquityTradeLadderDuxo.this.submit(new EquityTradeLadderEvent.HapticFeedbacks(1));
            BigDecimal lastTradePrice = equityTradeLadderDataState.getLadderPriceData().getLastTradePrice();
            BigDecimal price = null;
            Integer numBoxInt = (lastTradePrice == null || (ladderPriceLevels = equityTradeLadderDataState.getLadderPriceLevels()) == null) ? null : boxing.boxInt(LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevels, lastTradePrice, null, 2, null));
            int index = ((LadderInteraction.RowClicked) this.$ladderInteraction).getIndex();
            if (numBoxInt != null && numBoxInt.intValue() == index) {
                BigDecimal lastTradePrice2 = equityTradeLadderDataState.getLadderPriceData().getLastTradePrice();
                if (lastTradePrice2 != null) {
                    price = lastTradePrice2.setScale(2, RoundingMode.HALF_EVEN);
                }
            } else {
                LadderPriceLevels ladderPriceLevels2 = equityTradeLadderDataState.getLadderPriceLevels();
                if (ladderPriceLevels2 != null) {
                    price = ladderPriceLevels2.getPrice(((LadderInteraction.RowClicked) this.$ladderInteraction).getIndex());
                }
            }
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState.copyToClearSelectionState(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, boxing.boxInt(((LadderInteraction.RowClicked) this.$ladderInteraction).getIndex()), boxing.boxInt(((LadderInteraction.RowClicked) this.$ladderInteraction).getIndex()), price, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, true, false, false, false, false, false, false, false, Integer.MAX_VALUE, 267386876, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onUserInteraction$lambda$3(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getSelectedRowIndex() != null) {
            Map<Side, EquityOrderContext> mapBuildSelectedRowEquityOrderContext = Logging6.buildSelectedRowEquityOrderContext(ds);
            EventLogger eventLogger = equityTradeLadderDuxo.eventLogger;
            Screen screen = equityTradeLadderDuxo.ladderScreen;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Context.ProductTag productTag = null;
            int i4 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Screen screen2 = null;
            String str8 = null;
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
            String str9 = null;
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
            KeychainLoginContext keychainLoginContext = null;
            PasskeyEnrollmentContext passkeyEnrollmentContext = null;
            CryptoAssetContext cryptoAssetContext = null;
            CryptoTransactionContext cryptoTransactionContext = null;
            CryptoTokenApprovalContext cryptoTokenApprovalContext = null;
            NcwOnboardingContext ncwOnboardingContext = null;
            NcwFundingContext ncwFundingContext = null;
            DappRequestContext dappRequestContext = null;
            String str10 = null;
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
            Context context = new Context(i, i2, i3, str, str2, str3, str4, productTag, i4, str5, str6, str7, screen2, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, mapBuildSelectedRowEquityOrderContext.get(Side.START), keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str10, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, ds.getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16127, null);
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(componentType, "EQUITIES_LADDER_SELECTED_BAR_ROW_BUTTON", null, 4, null), null, context, 9, null);
            EventLogger eventLogger2 = equityTradeLadderDuxo.eventLogger;
            Screen screen3 = equityTradeLadderDuxo.ladderScreen;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            MarginUpgradeContext marginUpgradeContext2 = null;
            PrismContext prismContext2 = null;
            CortexDigestContext cortexDigestContext2 = null;
            CortexDigestOnboardingContext cortexDigestOnboardingContext2 = null;
            EventContractsPositionContext eventContractsPositionContext2 = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            Object[] objArr14 = 0 == true ? 1 : 0;
            Object[] objArr15 = 0 == true ? 1 : 0;
            Object[] objArr16 = 0 == true ? 1 : 0;
            Object[] objArr17 = 0 == true ? 1 : 0;
            Object[] objArr18 = 0 == true ? 1 : 0;
            Object[] objArr19 = 0 == true ? 1 : 0;
            Object[] objArr20 = 0 == true ? 1 : 0;
            Object[] objArr21 = 0 == true ? 1 : 0;
            Object[] objArr22 = 0 == true ? 1 : 0;
            Object[] objArr23 = 0 == true ? 1 : 0;
            Object[] objArr24 = 0 == true ? 1 : 0;
            Object[] objArr25 = 0 == true ? 1 : 0;
            Object[] objArr26 = 0 == true ? 1 : 0;
            Object[] objArr27 = 0 == true ? 1 : 0;
            Object[] objArr28 = 0 == true ? 1 : 0;
            Object[] objArr29 = 0 == true ? 1 : 0;
            Object[] objArr30 = 0 == true ? 1 : 0;
            Object[] objArr31 = 0 == true ? 1 : 0;
            Object[] objArr32 = 0 == true ? 1 : 0;
            Object[] objArr33 = 0 == true ? 1 : 0;
            Object[] objArr34 = 0 == true ? 1 : 0;
            Object[] objArr35 = 0 == true ? 1 : 0;
            Object[] objArr36 = 0 == true ? 1 : 0;
            Object[] objArr37 = 0 == true ? 1 : 0;
            Object[] objArr38 = 0 == true ? 1 : 0;
            Object[] objArr39 = 0 == true ? 1 : 0;
            Object[] objArr40 = 0 == true ? 1 : 0;
            Object[] objArr41 = 0 == true ? 1 : 0;
            Object[] objArr42 = 0 == true ? 1 : 0;
            Object[] objArr43 = 0 == true ? 1 : 0;
            Object[] objArr44 = 0 == true ? 1 : 0;
            Object[] objArr45 = 0 == true ? 1 : 0;
            Object[] objArr46 = 0 == true ? 1 : 0;
            Object[] objArr47 = 0 == true ? 1 : 0;
            Object[] objArr48 = 0 == true ? 1 : 0;
            Object[] objArr49 = 0 == true ? 1 : 0;
            Object[] objArr50 = 0 == true ? 1 : 0;
            Object[] objArr51 = 0 == true ? 1 : 0;
            Object[] objArr52 = 0 == true ? 1 : 0;
            Object[] objArr53 = 0 == true ? 1 : 0;
            Object[] objArr54 = 0 == true ? 1 : 0;
            Object[] objArr55 = 0 == true ? 1 : 0;
            Object[] objArr56 = 0 == true ? 1 : 0;
            Object[] objArr57 = 0 == true ? 1 : 0;
            Object[] objArr58 = 0 == true ? 1 : 0;
            Object[] objArr59 = 0 == true ? 1 : 0;
            Object[] objArr60 = 0 == true ? 1 : 0;
            Object[] objArr61 = 0 == true ? 1 : 0;
            Object[] objArr62 = 0 == true ? 1 : 0;
            Object[] objArr63 = 0 == true ? 1 : 0;
            Object[] objArr64 = 0 == true ? 1 : 0;
            Object[] objArr65 = 0 == true ? 1 : 0;
            Object[] objArr66 = 0 == true ? 1 : 0;
            Object[] objArr67 = 0 == true ? 1 : 0;
            Object[] objArr68 = 0 == true ? 1 : 0;
            Object[] objArr69 = 0 == true ? 1 : 0;
            Object[] objArr70 = 0 == true ? 1 : 0;
            Object[] objArr71 = 0 == true ? 1 : 0;
            Object[] objArr72 = 0 == true ? 1 : 0;
            Object[] objArr73 = 0 == true ? 1 : 0;
            Object[] objArr74 = 0 == true ? 1 : 0;
            Object[] objArr75 = 0 == true ? 1 : 0;
            Object[] objArr76 = 0 == true ? 1 : 0;
            Object[] objArr77 = 0 == true ? 1 : 0;
            Object[] objArr78 = 0 == true ? 1 : 0;
            Object[] objArr79 = 0 == true ? 1 : 0;
            Object[] objArr80 = 0 == true ? 1 : 0;
            Object[] objArr81 = 0 == true ? 1 : 0;
            Object[] objArr82 = 0 == true ? 1 : 0;
            Object[] objArr83 = 0 == true ? 1 : 0;
            Object[] objArr84 = 0 == true ? 1 : 0;
            Object[] objArr85 = 0 == true ? 1 : 0;
            Object[] objArr86 = 0 == true ? 1 : 0;
            Object[] objArr87 = 0 == true ? 1 : 0;
            Object[] objArr88 = 0 == true ? 1 : 0;
            Object[] objArr89 = 0 == true ? 1 : 0;
            Object[] objArr90 = 0 == true ? 1 : 0;
            Object[] objArr91 = 0 == true ? 1 : 0;
            Object[] objArr92 = 0 == true ? 1 : 0;
            Object[] objArr93 = 0 == true ? 1 : 0;
            Object[] objArr94 = 0 == true ? 1 : 0;
            Object[] objArr95 = 0 == true ? 1 : 0;
            Object[] objArr96 = 0 == true ? 1 : 0;
            Object[] objArr97 = 0 == true ? 1 : 0;
            Object[] objArr98 = 0 == true ? 1 : 0;
            Object[] objArr99 = 0 == true ? 1 : 0;
            Object[] objArr100 = 0 == true ? 1 : 0;
            Object[] objArr101 = 0 == true ? 1 : 0;
            Object[] objArr102 = 0 == true ? 1 : 0;
            Object[] objArr103 = 0 == true ? 1 : 0;
            Object[] objArr104 = 0 == true ? 1 : 0;
            Object[] objArr105 = 0 == true ? 1 : 0;
            Object[] objArr106 = 0 == true ? 1 : 0;
            Object[] objArr107 = 0 == true ? 1 : 0;
            Object[] objArr108 = 0 == true ? 1 : 0;
            Object[] objArr109 = 0 == true ? 1 : 0;
            Object[] objArr110 = 0 == true ? 1 : 0;
            Object[] objArr111 = 0 == true ? 1 : 0;
            Object[] objArr112 = 0 == true ? 1 : 0;
            Object[] objArr113 = 0 == true ? 1 : 0;
            Object[] objArr114 = 0 == true ? 1 : 0;
            Object[] objArr115 = 0 == true ? 1 : 0;
            Object[] objArr116 = 0 == true ? 1 : 0;
            Object[] objArr117 = 0 == true ? 1 : 0;
            Object[] objArr118 = 0 == true ? 1 : 0;
            Object[] objArr119 = 0 == true ? 1 : 0;
            Object[] objArr120 = 0 == true ? 1 : 0;
            Object[] objArr121 = 0 == true ? 1 : 0;
            Object[] objArr122 = 0 == true ? 1 : 0;
            Object[] objArr123 = 0 == true ? 1 : 0;
            Object[] objArr124 = 0 == true ? 1 : 0;
            Object[] objArr125 = 0 == true ? 1 : 0;
            Object[] objArr126 = 0 == true ? 1 : 0;
            Object[] objArr127 = 0 == true ? 1 : 0;
            Object[] objArr128 = 0 == true ? 1 : 0;
            Object[] objArr129 = 0 == true ? 1 : 0;
            Object[] objArr130 = 0 == true ? 1 : 0;
            Object[] objArr131 = 0 == true ? 1 : 0;
            Object[] objArr132 = 0 == true ? 1 : 0;
            Object[] objArr133 = 0 == true ? 1 : 0;
            Object[] objArr134 = 0 == true ? 1 : 0;
            Object[] objArr135 = 0 == true ? 1 : 0;
            Object[] objArr136 = 0 == true ? 1 : 0;
            Object[] objArr137 = 0 == true ? 1 : 0;
            Object[] objArr138 = 0 == true ? 1 : 0;
            Object[] objArr139 = 0 == true ? 1 : 0;
            Object[] objArr140 = 0 == true ? 1 : 0;
            Object[] objArr141 = 0 == true ? 1 : 0;
            Object[] objArr142 = 0 == true ? 1 : 0;
            Object[] objArr143 = 0 == true ? 1 : 0;
            Object[] objArr144 = 0 == true ? 1 : 0;
            Object[] objArr145 = 0 == true ? 1 : 0;
            Object[] objArr146 = 0 == true ? 1 : 0;
            Object[] objArr147 = 0 == true ? 1 : 0;
            Object[] objArr148 = 0 == true ? 1 : 0;
            Object[] objArr149 = 0 == true ? 1 : 0;
            Object[] objArr150 = 0 == true ? 1 : 0;
            Object[] objArr151 = 0 == true ? 1 : 0;
            Object[] objArr152 = 0 == true ? 1 : 0;
            Object[] objArr153 = 0 == true ? 1 : 0;
            Object[] objArr154 = 0 == true ? 1 : 0;
            Object[] objArr155 = 0 == true ? 1 : 0;
            Object[] objArr156 = 0 == true ? 1 : 0;
            Object[] objArr157 = 0 == true ? 1 : 0;
            Object[] objArr158 = 0 == true ? 1 : 0;
            Object[] objArr159 = 0 == true ? 1 : 0;
            Object[] objArr160 = 0 == true ? 1 : 0;
            Object[] objArr161 = 0 == true ? 1 : 0;
            Object[] objArr162 = 0 == true ? 1 : 0;
            Object[] objArr163 = 0 == true ? 1 : 0;
            Object[] objArr164 = 0 == true ? 1 : 0;
            Object[] objArr165 = 0 == true ? 1 : 0;
            Object[] objArr166 = 0 == true ? 1 : 0;
            Object[] objArr167 = 0 == true ? 1 : 0;
            Object[] objArr168 = 0 == true ? 1 : 0;
            Object[] objArr169 = 0 == true ? 1 : 0;
            Object[] objArr170 = 0 == true ? 1 : 0;
            Object[] objArr171 = 0 == true ? 1 : 0;
            Object[] objArr172 = 0 == true ? 1 : 0;
            Object[] objArr173 = 0 == true ? 1 : 0;
            Object[] objArr174 = 0 == true ? 1 : 0;
            Object[] objArr175 = 0 == true ? 1 : 0;
            Object[] objArr176 = 0 == true ? 1 : 0;
            Object[] objArr177 = 0 == true ? 1 : 0;
            Object[] objArr178 = 0 == true ? 1 : 0;
            Object[] objArr179 = 0 == true ? 1 : 0;
            Object[] objArr180 = 0 == true ? 1 : 0;
            Object[] objArr181 = 0 == true ? 1 : 0;
            Object[] objArr182 = 0 == true ? 1 : 0;
            Object[] objArr183 = 0 == true ? 1 : 0;
            Object[] objArr184 = 0 == true ? 1 : 0;
            Object[] objArr185 = 0 == true ? 1 : 0;
            Object[] objArr186 = 0 == true ? 1 : 0;
            Object[] objArr187 = 0 == true ? 1 : 0;
            Object[] objArr188 = 0 == true ? 1 : 0;
            Object[] objArr189 = 0 == true ? 1 : 0;
            Object[] objArr190 = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logAppear$default(eventLogger2, null, screen3, new Component(componentType, "EQUITIES_LADDER_SELECTED_BAR_ROW_BUTTON", null, 4, null), null, new Context(i5, i6, i7, objArr2, str8, objArr3, objArr4, objArr5, i8, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, objArr51, objArr52, objArr53, objArr54, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, marginUpgradeContext2, objArr81, objArr82, objArr83, objArr84, objArr85, objArr86, objArr87, objArr88, mapBuildSelectedRowEquityOrderContext.get(Side.END), objArr89, objArr90, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, objArr100, objArr101, objArr102, objArr103, objArr104, objArr105, objArr106, objArr107, objArr108, objArr109, objArr110, objArr111, objArr112, objArr113, objArr114, objArr115, objArr116, objArr117, objArr118, objArr119, objArr120, objArr121, objArr122, objArr123, objArr124, objArr125, objArr126, objArr127, objArr128, objArr129, objArr130, objArr131, objArr132, objArr133, objArr134, objArr135, objArr136, objArr137, objArr138, objArr139, objArr140, objArr141, objArr142, objArr143, objArr144, objArr145, objArr146, objArr147, objArr148, objArr149, objArr150, objArr151, objArr152, objArr153, objArr154, objArr155, objArr156, objArr157, objArr158, objArr159, objArr160, objArr161, objArr162, objArr163, objArr164, objArr165, objArr166, objArr167, objArr168, objArr169, objArr170, objArr171, objArr172, objArr173, objArr174, objArr175, objArr176, objArr177, objArr178, objArr179, objArr180, objArr181, objArr182, objArr183, objArr184, objArr185, prismContext2, objArr186, objArr187, objArr188, objArr189, objArr190, cortexDigestContext2, cortexDigestOnboardingContext2, eventContractsPositionContext2, ds.getEquitiesLadderContext(), null, null, null, objArr, null, -1, -1, -536870913, -1, -1, -1, 16127, null), 9, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$4(EquityTradeLadderDuxo equityTradeLadderDuxo, LadderInteraction ladderInteraction, EquityLadderOrderState equityLadderOrderState, EquityTradeLadderDataState ds) {
        String plainString;
        BigDecimal bigDecimalM822m;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (equityTradeLadderDuxo.tradeInFlight) {
            return Unit.INSTANCE;
        }
        equityTradeLadderDuxo.tradeInFlight = true;
        LadderInteraction.StartSideOrderClicked startSideOrderClicked = (LadderInteraction.StartSideOrderClicked) ladderInteraction;
        EquityOrderContext equityOrderContextCopy = null;
        BigDecimal selectedRowPrice = startSideOrderClicked.getOrderTrigger() == OrderTrigger.IMMEDIATE ? ds.getSelectedRowPrice() : null;
        BigDecimal selectedRowPrice2 = startSideOrderClicked.getOrderTrigger() == OrderTrigger.STOP ? ds.getSelectedRowPrice() : null;
        EventLogger eventLogger = equityTradeLadderDuxo.eventLogger;
        Screen screen = equityTradeLadderDuxo.ladderScreen;
        EquitiesLadderContext equitiesLadderContext = ds.getEquitiesLadderContext();
        EquityOrderContext equityOrderContext = Logging6.buildSelectedRowEquityOrderContext(ds).get(Side.START);
        if (equityOrderContext != null) {
            BigDecimal bigDecimal = selectedRowPrice == null ? selectedRowPrice2 : selectedRowPrice;
            if (bigDecimal == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal)) == null || (plainString = bigDecimalM822m.toPlainString()) == null) {
                plainString = "";
            }
            equityOrderContextCopy = equityOrderContext.copy((493567 & 1) != 0 ? equityOrderContext.instrument_id : null, (493567 & 2) != 0 ? equityOrderContext.symbol : null, (493567 & 4) != 0 ? equityOrderContext.side : null, (493567 & 8) != 0 ? equityOrderContext.type : null, (493567 & 16) != 0 ? equityOrderContext.trigger : null, (493567 & 32) != 0 ? equityOrderContext.is_dollar_based_amount : null, (493567 & 64) != 0 ? equityOrderContext.is_trailing_order : null, (493567 & 128) != 0 ? equityOrderContext.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equityOrderContext.market_hours : null, (493567 & 512) != 0 ? equityOrderContext.bid_price : plainString, (493567 & 1024) != 0 ? equityOrderContext.ask_price : null, (493567 & 2048) != 0 ? equityOrderContext.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equityOrderContext.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equityOrderContext.tax_lot_selections : null, (493567 & 16384) != 0 ? equityOrderContext.tax_lots_context : null, (493567 & 32768) != 0 ? equityOrderContext.estimated_total_fees : null, (493567 & 65536) != 0 ? equityOrderContext.position_effect : null, (493567 & 131072) != 0 ? equityOrderContext.order_entry_point : null, (493567 & 262144) != 0 ? equityOrderContext.order_input_format : null, (493567 & 524288) != 0 ? equityOrderContext.unknownFields() : null);
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "EQUITIES_LADDER_SELECTED_BAR_ROW_BUTTON", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equitiesLadderContext, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16127, null), false, 41, null);
        equityTradeLadderDuxo.handleSubmitOrder(equityLadderOrderState, EquityOrderSide.BUY, selectedRowPrice, selectedRowPrice2, ds.getMarketBuysEnabled(), ds.getSubzeroEnabled());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$6(LadderInteraction ladderInteraction, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityLadderOrderState equityLadderOrderState, EquityTradeLadderDataState ds) {
        String plainString;
        BigDecimal bigDecimalM822m;
        Intrinsics.checkNotNullParameter(ds, "ds");
        LadderInteraction.EndSideOrderClicked endSideOrderClicked = (LadderInteraction.EndSideOrderClicked) ladderInteraction;
        EquityOrderContext equityOrderContextCopy = null;
        BigDecimal selectedRowPrice = endSideOrderClicked.getOrderTrigger() == OrderTrigger.IMMEDIATE ? ds.getSelectedRowPrice() : null;
        BigDecimal selectedRowPrice2 = endSideOrderClicked.getOrderTrigger() == OrderTrigger.STOP ? ds.getSelectedRowPrice() : null;
        EventLogger eventLogger = equityTradeLadderDuxo.eventLogger;
        Screen screen = equityTradeLadderDuxo.ladderScreen;
        EquitiesLadderContext equitiesLadderContext = ds.getEquitiesLadderContext();
        EquityOrderContext equityOrderContext = Logging6.buildSelectedRowEquityOrderContext(ds).get(Side.END);
        if (equityOrderContext != null) {
            BigDecimal bigDecimal = selectedRowPrice == null ? selectedRowPrice2 : selectedRowPrice;
            if (bigDecimal == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal)) == null || (plainString = bigDecimalM822m.toPlainString()) == null) {
                plainString = "";
            }
            equityOrderContextCopy = equityOrderContext.copy((493567 & 1) != 0 ? equityOrderContext.instrument_id : null, (493567 & 2) != 0 ? equityOrderContext.symbol : null, (493567 & 4) != 0 ? equityOrderContext.side : null, (493567 & 8) != 0 ? equityOrderContext.type : null, (493567 & 16) != 0 ? equityOrderContext.trigger : null, (493567 & 32) != 0 ? equityOrderContext.is_dollar_based_amount : null, (493567 & 64) != 0 ? equityOrderContext.is_trailing_order : null, (493567 & 128) != 0 ? equityOrderContext.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equityOrderContext.market_hours : null, (493567 & 512) != 0 ? equityOrderContext.bid_price : null, (493567 & 1024) != 0 ? equityOrderContext.ask_price : plainString, (493567 & 2048) != 0 ? equityOrderContext.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equityOrderContext.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equityOrderContext.tax_lot_selections : null, (493567 & 16384) != 0 ? equityOrderContext.tax_lots_context : null, (493567 & 32768) != 0 ? equityOrderContext.estimated_total_fees : null, (493567 & 65536) != 0 ? equityOrderContext.position_effect : null, (493567 & 131072) != 0 ? equityOrderContext.order_entry_point : null, (493567 & 262144) != 0 ? equityOrderContext.order_input_format : null, (493567 & 524288) != 0 ? equityOrderContext.unknownFields() : null);
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.BUTTON, "EQUITIES_LADDER_SELECTED_BAR_ROW_BUTTON", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equitiesLadderContext, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16127, null), false, 41, null);
        equityTradeLadderDuxo.handleSubmitOrder(equityLadderOrderState, equityLadderOrderState.getSellOrderSide(), selectedRowPrice, selectedRowPrice2, ds.getMarketBuysEnabled(), ds.getSubzeroEnabled());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUserInteraction$lambda$7(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onUserInteraction$13$1(ds, equityTradeLadderDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$14", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$14 */
    static final class C1585114 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C1585114(Continuation<? super C1585114> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1585114 c1585114 = EquityTradeLadderDuxo.this.new C1585114(continuation);
            c1585114.L$0 = obj;
            return c1585114;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C1585114) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            GenericLadderFtuxProgressState ladderFtuxProgressState = equityTradeLadderDataState.getLadderFtuxProgressState();
            GenericLadderFtuxProgressState genericLadderFtuxProgressStatePrevState = ladderFtuxProgressState != null ? ladderFtuxProgressState.prevState() : null;
            EquityTradeLadderDuxo.this.getSavedStateHandle().set(EquityTradeLadderDuxo.EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY, genericLadderFtuxProgressStatePrevState);
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, genericLadderFtuxProgressStatePrevState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -9, 268435455, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$15", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$15 */
    static final class C1585215 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C1585215(Continuation<? super C1585215> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1585215 c1585215 = new C1585215(continuation);
            c1585215.L$0 = obj;
            return c1585215;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C1585215) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -9, 268435455, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        UUID uuidFromString = UUID.fromString(((EquityTradeLadderFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId());
        final SharedFlow stateFlow = getStateFlow();
        SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.take(new Flow<Integer>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C158002(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C158002<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C158002.this.emit(null, this);
                    }
                }

                public C158002(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        LadderState.LadderData ladder = ((EquityTradeLadderViewState) obj).getLadderState().getLadder();
                        Integer numBoxInt = ladder != null ? boxing.boxInt(ladder.getLastPriceIndex()) : null;
                        if (numBoxInt != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1), getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158311(uuidFromString, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158322(uuidFromString, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158333(uuidFromString, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158344(sharedFlowShareIn, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158355(sharedFlowShareIn, this, null), 3, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C158366(uuidFromString, null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {581}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1 */
    static final class C158311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158311(UUID uuid, Continuation<? super C158311> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158311(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InstrumentStore instrumentStore = EquityTradeLadderDuxo.this.instrumentStore;
                UUID uuid = this.$instrumentId;
                Intrinsics.checkNotNull(uuid);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(instrumentStore.getInstrument(uuid)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityTradeLadderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499841 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                final /* synthetic */ Instrument $instrument;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499841(Instrument instrument, Continuation<? super C499841> continuation) {
                    super(2, continuation);
                    this.$instrument = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499841 c499841 = new C499841(this.$instrument, continuation);
                    c499841.L$0 = obj;
                    return c499841;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                    return ((C499841) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, this.$instrument, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -3, 268435455, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499841((Instrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {592}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2 */
    static final class C158322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158322(UUID uuid, Continuation<? super C158322> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158322(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InstrumentStore instrumentStore = EquityTradeLadderDuxo.this.instrumentStore;
                UUID uuid = this.$instrumentId;
                Intrinsics.checkNotNull(uuid);
                Flow<InstrumentExternalHalt> flowStreamExternalHalt = instrumentStore.streamExternalHalt(uuid);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityTradeLadderDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamExternalHalt, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "externalHalt", "Lcom/robinhood/models/ui/InstrumentExternalHalt;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentExternalHalt, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentExternalHalt instrumentExternalHalt, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentExternalHalt, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499851 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                final /* synthetic */ InstrumentExternalHalt $externalHalt;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499851(InstrumentExternalHalt instrumentExternalHalt, Continuation<? super C499851> continuation) {
                    super(2, continuation);
                    this.$externalHalt = instrumentExternalHalt;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499851 c499851 = new C499851(this.$externalHalt, continuation);
                    c499851.L$0 = obj;
                    return c499851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                    return ((C499851) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                    InstrumentExternalHalt instrumentExternalHalt = this.$externalHalt;
                    return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, instrumentExternalHalt != null && instrumentExternalHalt.getHalted(), false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -32769, 268435455, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499851((InstrumentExternalHalt) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {602}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$3 */
    static final class C158333 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158333(UUID uuid, Continuation<? super C158333> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158333(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158333) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                QuoteStore quoteStore = EquityTradeLadderDuxo.this.quoteStore;
                UUID uuid = this.$instrumentId;
                Intrinsics.checkNotNull(uuid);
                Flow<Quote> flowStreamQuote = quoteStore.streamQuote(uuid);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamQuote, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Quote quote = (Quote) obj;
            if (quote != null) {
                EquityTradeLadderDuxo equityTradeLadderDuxo = EquityTradeLadderDuxo.this;
                EquityTradeLadderBinManager.BinConfiguration optimalBinConfiguration = equityTradeLadderDuxo.equityTradeLadderBinManager.getOptimalBinConfiguration(quote.getAdjustedPreviousClose().getDecimalValue());
                StateFlow2 stateFlow2 = equityTradeLadderDuxo.binConfiguration;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, optimalBinConfiguration));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$4", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {613}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$4 */
    static final class C158344 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158344(SharedFlow<Integer> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super C158344> continuation) {
            super(2, continuation);
            this.$firstLastPriceIndexFlow = sharedFlow;
            this.this$0 = equityTradeLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C158344(this.$firstLastPriceIndexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158344) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$4$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new EquityTradeLadderEvent.CenterAtIndex(this.I$0, false));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Integer> sharedFlow = this.$firstLastPriceIndexFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {620}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5 */
    static final class C158355 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158355(SharedFlow<Integer> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super C158355> continuation) {
            super(2, continuation);
            this.$firstLastPriceIndexFlow = sharedFlow;
            this.this$0 = equityTradeLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C158355(this.$firstLastPriceIndexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158355) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {634}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Integer> $firstLastPriceIndexFlow;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<Integer> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$firstLastPriceIndexFlow = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$firstLastPriceIndexFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$firstLastPriceIndexFlow, new C15801x7e66886a(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$5$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.I$0 = ((Number) obj).intValue();
                    return anonymousClass2;
                }

                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new EquityTradeLadderEvent.CenterAtIndex(this.I$0, false));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$firstLastPriceIndexFlow, this.this$0, null);
                this.label = 1;
                if (Timeout6.withTimeout(1000L, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6 */
    static final class C158366 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158366(UUID uuid, Continuation<? super C158366> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158366 c158366 = EquityTradeLadderDuxo.this.new C158366(this.$instrumentId, continuation);
            c158366.L$0 = obj;
            return c158366;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158366) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FlowKt.combine(FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(EquityTradeLadderDuxo.this.accountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null), new EquityTradeLadderDuxo$onCreate$6$accountNumberStream$1(null)), FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(EquityTradeLadderDuxo.this.accountProvider.streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null), new EquityTradeLadderDuxo$onCreate$6$accountNumberStream$2(null)), new EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3(null)))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(sharedFlowShareIn, EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(sharedFlowShareIn, EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(sharedFlowShareIn, EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(sharedFlowShareIn, EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass21(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass22(sharedFlowShareIn, EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass23(EquityTradeLadderDuxo.this, this.$instrumentId, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass24(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass25(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass26(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass27(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass28(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass29(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass30(EquityTradeLadderDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass31(EquityTradeLadderDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderFtuxProgressState firstFtuxPage = (EquityTradeLadderFtuxProgressState) this.this$0.getSavedStateHandle().get(EquityTradeLadderDuxo.EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY);
                if (firstFtuxPage == null) {
                    firstFtuxPage = this.this$0.ladderFtuxManager.getFirstFtuxPage(true);
                }
                this.this$0.applyMutation(new C499861(firstFtuxPage, null));
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499861 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                final /* synthetic */ EquityTradeLadderFtuxProgressState $ftuxProgressState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499861(EquityTradeLadderFtuxProgressState equityTradeLadderFtuxProgressState, Continuation<? super C499861> continuation) {
                    super(2, continuation);
                    this.$ftuxProgressState = equityTradeLadderFtuxProgressState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499861 c499861 = new C499861(this.$ftuxProgressState, continuation);
                    c499861.L$0 = obj;
                    return c499861;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                    return ((C499861) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, this.$ftuxProgressState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -9, 268435455, null);
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {663, 667}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r8, r1, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TradeSettingsStore tradeSettingsStore = this.this$0.tradeSettingsStore;
                    TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.LADDER;
                    TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(null);
                    String serverValue = IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND.getServerValue();
                    this.label = 1;
                    obj = tradeSettingsStore.streamAutoSendStateEvents(tradeSettingsStore4, equity, serverValue, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 2;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "autoSendState", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradeSettingsStore2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TradeSettingsStore2 tradeSettingsStore2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tradeSettingsStore2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TradeSettingsStore2 tradeSettingsStore2 = (TradeSettingsStore2) this.L$0;
                    if (tradeSettingsStore2 instanceof TradeSettingsStore2.ExpiredAgreement) {
                        EquityUpsellService.setUpsellComplete$default(this.this$0.equityUpsellService, UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, false, 4, null);
                        this.this$0.setScreenState(new LadderScreenState.BottomSheet.AutoSendRenew(false, null, 3, null), true);
                    } else if (tradeSettingsStore2 instanceof TradeSettingsStore2.AutosendIsOnAgreementNotSigned) {
                        EquityUpsellService.setUpsellComplete$default(this.this$0.equityUpsellService, UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, false, 4, null);
                        this.this$0.setScreenState(new LadderScreenState.BottomSheet.AutoSendIsOn(false, LadderScreenState.Ladder.INSTANCE, 1, null), true);
                    } else if (tradeSettingsStore2 instanceof TradeSettingsStore2.State) {
                        EquityUpsellService.setUpsellComplete$default(this.this$0.equityUpsellService, UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, false, 4, null);
                    } else {
                        if (!(tradeSettingsStore2 instanceof TradeSettingsStore2.NotSignedAgreement)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.equityUpsellService.setUpsellComplete(UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, false);
                    }
                    this.this$0.applyMutation(new C499911(tradeSettingsStore2, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499911 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ TradeSettingsStore2 $autoSendState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499911(TradeSettingsStore2 tradeSettingsStore2, Continuation<? super C499911> continuation) {
                        super(2, continuation);
                        this.$autoSendState = tradeSettingsStore2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499911 c499911 = new C499911(this.$autoSendState, continuation);
                        c499911.L$0 = obj;
                        return c499911;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499911) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, boxing.boxBoolean(this.$autoSendState.getAutoSend()), null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -131073, 268435455, null);
                    }
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {721}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TradeSettingsStore tradeSettingsStore = this.this$0.tradeSettingsStore;
                    TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.LADDER;
                    TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(EquityPositionType.LONG);
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(tradeSettingsStore, tradeSettingsStore4, equity, uuid, null, 8, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTradingSession$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499971 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $orderMarketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499971(OrderMarketHours orderMarketHours, Continuation<? super C499971> continuation) {
                        super(2, continuation);
                        this.$orderMarketHours = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499971 c499971 = new C499971(this.$orderMarketHours, continuation);
                        c499971.L$0 = obj;
                        return c499971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499971) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, this.$orderMarketHours, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1048577, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499971((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {735}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TradeSettingsStore tradeSettingsStore = this.this$0.tradeSettingsStore;
                    TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.LADDER;
                    TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(EquityPositionType.SHORT);
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(tradeSettingsStore, tradeSettingsStore4, equity, uuid, null, 8, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTradingSession$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499991 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $orderMarketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499991(OrderMarketHours orderMarketHours, Continuation<? super C499991> continuation) {
                        super(2, continuation);
                        this.$orderMarketHours = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499991 c499991 = new C499991(this.$orderMarketHours, continuation);
                        c499991.L$0 = obj;
                        return c499991;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499991) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, this.$orderMarketHours, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -2097153, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499991((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {748}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, TradeSettingsStore4.LADDER, new TradeSettingsStore3.Equity(EquityPositionType.LONG), null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500001 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $timeInForce;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500001(OrderTimeInForce orderTimeInForce, Continuation<? super C500001> continuation) {
                        super(2, continuation);
                        this.$timeInForce = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500001 c500001 = new C500001(this.$timeInForce, continuation);
                        c500001.L$0 = obj;
                        return c500001;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C500001) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, this.$timeInForce, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -262145, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500001((OrderTimeInForce) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {761}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, TradeSettingsStore4.LADDER, new TradeSettingsStore3.Equity(EquityPositionType.SHORT), null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500011 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $timeInForce;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500011(OrderTimeInForce orderTimeInForce, Continuation<? super C500011> continuation) {
                        super(2, continuation);
                        this.$timeInForce = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500011 c500011 = new C500011(this.$timeInForce, continuation);
                        c500011.L$0 = obj;
                        return c500011;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C500011) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, this.$timeInForce, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -524289, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500011((OrderTimeInForce) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {773}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $accountNumberStream;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(SharedFlow<String> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$accountNumberStream = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$accountNumberStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C15813x907f62c3(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$7$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ Account $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                        Account account = this.$it;
                        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, account, null, AccountDisplayNames.getDisplayName(account).getShort().getTitle(), null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -21, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {790}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $accountNumberStream;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(SharedFlow<String> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$accountNumberStream = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$accountNumberStream, this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C15814xe79d53a2(null, this.this$0, this.$instrumentId));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends Position>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Position> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Position> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<Position>) optional, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Position) ((Optional) this.L$0).getOrNull(), null));
                    return Unit.INSTANCE;
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$8$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ Position $position;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Position position, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$position = position;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        LadderDisplayMode ladderDisplayMode;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                        Position position = this.$position;
                        if (position == null || !Position5.getHasPosition(position)) {
                            ladderDisplayMode = LadderDisplayMode.PRICE;
                        } else {
                            ladderDisplayMode = equityTradeLadderDataState.getLadderDisplayMode();
                        }
                        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, position, false, false, false, null, null, null, null, null, null, null, null, null, null, ladderDisplayMode, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -134225921, 268435455, null);
                    }
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {806}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500021 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ Quote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500021(Quote quote, Continuation<? super C500021> continuation) {
                        super(2, continuation);
                        this.$quote = quote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500021 c500021 = new C500021(this.$quote, continuation);
                        c500021.L$0 = obj;
                        return c500021;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C500021) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                        Quote quote = this.$quote;
                        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, quote, null, null, null, null, null, null, null, null, false, false, quote != null && quote.getTradingHalted(), null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -65569, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500021((Quote) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    QuoteStore quoteStore = this.this$0.quoteStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow<Quote> flowStreamQuote = quoteStore.streamQuote(uuid);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamQuote, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {821}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $accountNumberStream;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(SharedFlow<String> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$accountNumberStream = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$accountNumberStream, this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C15803xb0289463(null, this.this$0, this.$instrumentId));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentBuyingPower, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentBuyingPower instrumentBuyingPower, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(instrumentBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$10$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ InstrumentBuyingPower $buyingPower;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(InstrumentBuyingPower instrumentBuyingPower, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$buyingPower = instrumentBuyingPower;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$buyingPower, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, this.$buyingPower, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -65, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((InstrumentBuyingPower) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {831}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/TradingSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSession, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TradingSession tradingSession, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tradingSession, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499871 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ TradingSession $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499871(TradingSession tradingSession, Continuation<? super C499871> continuation) {
                        super(2, continuation);
                        this.$it = tradingSession;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499871 c499871 = new C499871(this.$it, continuation);
                        c499871.L$0 = obj;
                        return c499871;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499871) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, this.$it.getCurrentMarketHours(), null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1025, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499871((TradingSession) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<TradingSession> currentTradingSession = this.this$0.marketHoursManager.getCurrentTradingSession();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(currentTradingSession, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {846}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    InstrumentStore instrumentStore = this.this$0.instrumentStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(instrumentStore.getInstrument(uuid)), Integer.MAX_VALUE, null, 2, null), new C15804x5e647621(null, this.this$0, this.$instrumentId));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$12$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ MarketSessionChangeDataState $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$state = marketSessionChangeDataState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, this.$state, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -268435457, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((MarketSessionChangeDataState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {863}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $accountNumberStream;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(SharedFlow<String> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$accountNumberStream = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$accountNumberStream, this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C15805xb5826700(null, this.this$0, this.$instrumentId));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "pendingOrders", "", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<java.util.List<? extends Order>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(java.util.List<? extends Order> list, Continuation<? super Unit> continuation) {
                    return invoke2((java.util.List<Order>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(java.util.List<Order> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    java.util.List list = (java.util.List) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(EquityOrders.pendingOrdersToDisplayOnLadder(list), list, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$13$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ java.util.List<Order> $filteredOrders;
                    final /* synthetic */ java.util.List<Order> $pendingOrders;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(java.util.List<Order> list, java.util.List<Order> list2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$filteredOrders = list;
                        this.$pendingOrders = list2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$filteredOrders, this.$pendingOrders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, this.$pendingOrders, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, EquityOrders.updateInternalPendingOrders(equityTradeLadderDataState.getUiPendingOrdersMap(), this.$filteredOrders), null, false, false, false, false, false, false, false, false, -4097, 268173311, null);
                    }
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {908}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MdWebsocketSource mdWebsocketSource = this.this$0.mdWebsocketSource;
                    String string2 = this.$instrumentId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Flow flowWithFallbackAfter = Flow2.withFallbackAfter(mdWebsocketSource.stream(new MdTopic.Feed.EquityL2Full(string2, false, null, null, null, 30, null)), Duration.m28738getInWholeMillisecondsimpl(EquityTradeLadderDuxo.TIMEOUT), this.this$0.skipWebsocketFallback, new AnonymousClass1(null));
                    MdWebsocketSource mdWebsocketSource2 = this.this$0.mdWebsocketSource;
                    String string3 = this.$instrumentId.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    Flow flowWithFallbackAfter2 = Flow2.withFallbackAfter(mdWebsocketSource2.stream(new MdTopic.Feed.EquityQuoteQbbo(string3, false, null, null, null, 30, null)), Duration.m28738getInWholeMillisecondsimpl(EquityTradeLadderDuxo.TIMEOUT), this.this$0.skipWebsocketFallback, new AnonymousClass2(null));
                    QuoteStore quoteStore = this.this$0.quoteStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(quoteStore.streamQuote(uuid));
                    Flow flowCombine = FlowKt.combine(flowWithFallbackAfter, flowWithFallbackAfter2, new Flow<Quote>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Quote> flowCollector, Continuation continuation) {
                            Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Quote quote = (Quote) obj;
                                    if (quote != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(quote, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityLadderL2DataKillSwitch.INSTANCE}, false, null, 6, null), this.this$0.binConfiguration, new AnonymousClass4(null));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super MdFeedData.L2Data>, Object> {
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new AnonymousClass1(continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super MdFeedData.L2Data> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/websocket/md/models/MdFeedData$Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function1<Continuation<? super MdFeedData.Quote>, Object> {
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super MdFeedData.Quote> continuation) {
                    return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo$LadderPriceLevelData;", "l2Data", "Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;", "qbboData", "Lcom/robinhood/websocket/md/models/MdFeedData$Quote;", "mdQuote", "Lcom/robinhood/models/db/Quote;", "l2KillSwitchEnabled", "", "currentBinConfig", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$4", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function6<MdFeedData.L2Data, MdFeedData.Quote, Quote, Boolean, EquityTradeLadderBinManager.BinConfiguration, Continuation<? super LadderPriceLevelData>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                /* synthetic */ Object L$2;
                /* synthetic */ Object L$3;
                /* synthetic */ boolean Z$0;
                int label;

                AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                    super(6, continuation);
                }

                public final Object invoke(MdFeedData.L2Data l2Data, MdFeedData.Quote quote, Quote quote2, boolean z, EquityTradeLadderBinManager.BinConfiguration binConfiguration, Continuation<? super LadderPriceLevelData> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                    anonymousClass4.L$0 = l2Data;
                    anonymousClass4.L$1 = quote;
                    anonymousClass4.L$2 = quote2;
                    anonymousClass4.Z$0 = z;
                    anonymousClass4.L$3 = binConfiguration;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Object invoke(MdFeedData.L2Data l2Data, MdFeedData.Quote quote, Quote quote2, Boolean bool, EquityTradeLadderBinManager.BinConfiguration binConfiguration, Continuation<? super LadderPriceLevelData> continuation) {
                    return invoke(l2Data, quote, quote2, bool.booleanValue(), binConfiguration, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new LadderPriceLevelData((MdFeedData.L2Data) this.L$0, (MdFeedData.Quote) this.L$1, (Quote) this.L$2, this.Z$0, ((EquityTradeLadderBinManager.BinConfiguration) this.L$3).getAvailableIntervals());
                }
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo$LadderPriceLevelData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$5", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<LadderPriceLevelData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(LadderPriceLevelData ladderPriceLevelData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(ladderPriceLevelData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    java.util.List listListOf;
                    java.util.List listListOf2;
                    EquityQuote equityQuote;
                    MdFeedData.Quote qbboData;
                    BigDecimal ask_price;
                    BigDecimal ask_size;
                    MdFeedData.L2Data l2Data;
                    java.util.List<BigDecimal> asks;
                    MdFeedData.Quote qbboData2;
                    BigDecimal bid_price;
                    BigDecimal bid_size;
                    MdFeedData.L2Data l2Data2;
                    java.util.List<BigDecimal> bids;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    LadderPriceLevelData ladderPriceLevelData = (LadderPriceLevelData) this.L$0;
                    if (ladderPriceLevelData.getL2KillSwitchEnabled() || (l2Data2 = ladderPriceLevelData.getL2Data()) == null || (bids = l2Data2.getBids()) == null) {
                        listListOf = null;
                    } else {
                        java.util.List<BigDecimal> list = bids;
                        java.util.List<BigDecimal> bid_sizes = ladderPriceLevelData.getL2Data().getBid_sizes();
                        if (bid_sizes == null) {
                            bid_sizes = CollectionsKt.emptyList();
                        }
                        listListOf = CollectionsKt.zip(list, bid_sizes);
                    }
                    java.util.List listListOf3 = (ladderPriceLevelData.getL2KillSwitchEnabled() || (qbboData2 = ladderPriceLevelData.getQbboData()) == null || (bid_price = qbboData2.getBid_price()) == null || (bid_size = ladderPriceLevelData.getQbboData().getBid_size()) == null) ? null : CollectionsKt.listOf(Tuples4.m3642to(bid_price, bid_size));
                    Tuples2 tuples2M3642to = Tuples4.m3642to(ladderPriceLevelData.getMdQuote().getBidPrice().getDecimalValue(), ladderPriceLevelData.getMdQuote().getBidSize());
                    if (ladderPriceLevelData.getL2KillSwitchEnabled() || (l2Data = ladderPriceLevelData.getL2Data()) == null || (asks = l2Data.getAsks()) == null) {
                        listListOf2 = null;
                    } else {
                        java.util.List<BigDecimal> list2 = asks;
                        java.util.List<BigDecimal> ask_sizes = ladderPriceLevelData.getL2Data().getAsk_sizes();
                        if (ask_sizes == null) {
                            ask_sizes = CollectionsKt.emptyList();
                        }
                        listListOf2 = CollectionsKt.zip(list2, ask_sizes);
                    }
                    java.util.List listListOf4 = (ladderPriceLevelData.getL2KillSwitchEnabled() || (qbboData = ladderPriceLevelData.getQbboData()) == null || (ask_price = qbboData.getAsk_price()) == null || (ask_size = ladderPriceLevelData.getQbboData().getAsk_size()) == null) ? null : CollectionsKt.listOf(Tuples4.m3642to(ask_price, ask_size));
                    Tuples2 tuples2M3642to2 = Tuples4.m3642to(ladderPriceLevelData.getMdQuote().getAskPrice().getDecimalValue(), ladderPriceLevelData.getMdQuote().getAskSize());
                    if (listListOf == null) {
                        listListOf = listListOf3 == null ? CollectionsKt.listOf(tuples2M3642to) : listListOf3;
                    }
                    if (listListOf2 == null) {
                        listListOf2 = listListOf4 == null ? CollectionsKt.listOf(tuples2M3642to2) : listListOf4;
                    }
                    MdFeedData.Quote qbboData3 = ladderPriceLevelData.getQbboData();
                    if (qbboData3 == null || (equityQuote = EquityQuote.INSTANCE.toEquityQuote(qbboData3)) == null) {
                        equityQuote = EquityQuote.INSTANCE.toEquityQuote(ladderPriceLevelData.getMdQuote());
                    }
                    LadderPriceData ladderPriceData = new LadderPriceData(listListOf, listListOf2, equityQuote);
                    boolean z = ladderPriceLevelData.getL2Data() == null;
                    EquityTradeLadderDuxo equityTradeLadderDuxo = this.this$0;
                    equityTradeLadderDuxo.applyMutation(new AnonymousClass1(ladderPriceData, equityTradeLadderDuxo, z, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$5$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$14$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ LadderPriceData $ladderPriceData;
                    final /* synthetic */ boolean $shouldShowL2DataMissingBanner;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ EquityTradeLadderDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LadderPriceData ladderPriceData, EquityTradeLadderDuxo equityTradeLadderDuxo, boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$ladderPriceData = ladderPriceData;
                        this.this$0 = equityTradeLadderDuxo;
                        this.$shouldShowL2DataMissingBanner = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ladderPriceData, this.this$0, this.$shouldShowL2DataMissingBanner, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default(((EquityTradeLadderDataState) this.L$0).m1993x4c92f064(this.$ladderPriceData, (EquityTradeLadderBinManager.BinConfiguration) this.this$0.binConfiguration.getValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, this.$shouldShowL2DataMissingBanner, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268402687, null);
                    }
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {963}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    NbboSummaryStore nbboSummaryStore = this.this$0.nbboSummaryStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(nbboSummaryStore.streamNbboSummary(uuid)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/nbbo/models/db/NbboSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<NbboSummary, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(NbboSummary nbboSummary, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(nbboSummary, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499881 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ NbboSummary $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499881(NbboSummary nbboSummary, Continuation<? super C499881> continuation) {
                        super(2, continuation);
                        this.$it = nbboSummary;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499881 c499881 = new C499881(this.$it, continuation);
                        c499881.L$0 = obj;
                        return c499881;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499881) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$it, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -2049, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499881((NbboSummary) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$16", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {971}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<OrderStatusEvent> flowStreamSubmittedOrderStatusEvents = this.this$0.equityTradeService.streamSubmittedOrderStatusEvents();
                    final EquityTradeLadderDuxo equityTradeLadderDuxo = this.this$0;
                    FlowCollector<? super OrderStatusEvent> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo.onCreate.6.16.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((OrderStatusEvent) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(OrderStatusEvent orderStatusEvent, Continuation<? super Unit> continuation) {
                            equityTradeLadderDuxo.handleOrderStatusEvents(orderStatusEvent);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamSubmittedOrderStatusEvents.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$17", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {977}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$17$1, reason: invalid class name */
            static final class AnonymousClass1<T> implements FlowCollector {
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo) {
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((OrderStatusAlert) obj, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(final OrderStatusAlert orderStatusAlert, Continuation<? super Unit> continuation) {
                    if (orderStatusAlert instanceof OrderStatusAlert.PdtSnackbar) {
                        EquityTradeLadderDuxo equityTradeLadderDuxo = this.this$0;
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ALERT_16;
                        StringResource.Companion companion = StringResource.INSTANCE;
                        StringResource stringResourceInvoke = companion.invoke(((OrderStatusAlert.PdtSnackbar) orderStatusAlert).getPdt().getTitle());
                        StringResource stringResourceInvoke2 = companion.invoke(C15889R.string.equity_pdt_snackbar_action_text, new Object[0]);
                        final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.this$0;
                        equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.Snackbar(serverToBentoAssetMapper2, stringResourceInvoke, stringResourceInvoke2, new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$17$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EquityTradeLadderDuxo.C158366.AnonymousClass17.AnonymousClass1.emit$lambda$1(orderStatusAlert, equityTradeLadderDuxo2);
                            }
                        }, false, 16, null));
                    } else {
                        if (!(orderStatusAlert instanceof OrderStatusAlert.PdtAlert)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.submit(new EquityTradeLadderEvent.ServerDrivenAlert(((OrderStatusAlert.PdtAlert) orderStatusAlert).getPdt()));
                    }
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit emit$lambda$1(OrderStatusAlert orderStatusAlert, EquityTradeLadderDuxo equityTradeLadderDuxo) {
                    Uri action = ((ActionButton) CollectionsKt.first((java.util.List) ((OrderStatusAlert.PdtSnackbar) orderStatusAlert).getPdt().getActionButtons())).getAction();
                    if (action != null) {
                        equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.LaunchDeepLink(action));
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<OrderStatusAlert> flowStreamOrderStatusAlerts = this.this$0.equityTradeService.streamOrderStatusAlerts();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (flowStreamOrderStatusAlerts.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1009}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.postTradeLadderFtuxStatePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tooltipState", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityPostTradeLadderFtuxState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(equityPostTradeLadderFtuxState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499891 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ EquityPostTradeLadderFtuxState $tooltipState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499891(EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState, Continuation<? super C499891> continuation) {
                        super(2, continuation);
                        this.$tooltipState = equityPostTradeLadderFtuxState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499891 c499891 = new C499891(this.$tooltipState, continuation);
                        c499891.L$0 = obj;
                        return c499891;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499891) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, this.$tooltipState, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268434431, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499891((EquityPostTradeLadderFtuxState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1019}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$19$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499901 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499901(boolean z, Continuation<? super C499901> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499901 c499901 = new C499901(this.$it, continuation);
                        c499901.L$0 = obj;
                        return c499901;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499901) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, this.$it, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268419071, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499901(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{ProfitAndLossAverageCostRetirementExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1027}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$20$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499921 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499921(boolean z, Continuation<? super C499921> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499921 c499921 = new C499921(this.$it, continuation);
                        c499921.L$0 = obj;
                        return c499921;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499921) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, this.$it, false, -1, 201326591, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499921(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityLadderAutoSendKillSwitch.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1040}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21, reason: invalid class name */
        static final class AnonymousClass21 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass21(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass21> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass21(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass21) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityLadderShortingKillSwitch.INSTANCE}, false, null, 6, null), ExperimentsKt.isShortingEnabled$default(this.this$0.experimentsStore, false, 1, null), new AnonymousClass1(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "killSwitchEnabled", "shortingEnabled"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                    return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.Z$0 = z;
                    anonymousClass1.Z$1 = z2;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return boxing.boxBoolean(!this.Z$0 && this.Z$1);
                }
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shortingEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$21$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $shortingEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$shortingEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$shortingEnabled, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        boolean z;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
                        if (this.$shortingEnabled) {
                            Instrument instrument = equityTradeLadderDataState.getInstrument();
                            if ((instrument != null ? instrument.getShortSaleTradability() : null) == Tradability.TRADABLE) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -16385, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1053}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22, reason: invalid class name */
        static final class AnonymousClass22 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $accountNumberStream;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass22(SharedFlow<String> sharedFlow, EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass22> continuation) {
                super(2, continuation);
                this.$accountNumberStream = sharedFlow;
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass22(this.$accountNumberStream, this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass22) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C15807xeb04a122(null, this.this$0, this.$instrumentId));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BuySellData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BuySellData buySellData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(buySellData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$22$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ BuySellData $buySellData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BuySellData buySellData, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$buySellData = buySellData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$buySellData, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, this.$buySellData, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -16777217, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BuySellData) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1064}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23, reason: invalid class name */
        static final class AnonymousClass23 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass23(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, Continuation<? super AnonymousClass23> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass23(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass23) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ShortingInfoStore shortingInfoStore = this.this$0.shortingInfoStore;
                    UUID uuid = this.$instrumentId;
                    Intrinsics.checkNotNull(uuid);
                    Flow<ShortingInfo> flowStreamShortingInfo = shortingInfoStore.streamShortingInfo(uuid);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamShortingInfo, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ShortingInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ShortingInfo shortingInfo, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(shortingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$23$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499931 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ ShortingInfo $shortingInfo;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499931(ShortingInfo shortingInfo, Continuation<? super C499931> continuation) {
                        super(2, continuation);
                        this.$shortingInfo = shortingInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499931 c499931 = new C499931(this.$shortingInfo, continuation);
                        c499931.L$0 = obj;
                        return c499931;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499931) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, this.$shortingInfo, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -33554433, 268435455, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499931((ShortingInfo) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1074}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24, reason: invalid class name */
        static final class AnonymousClass24 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass24(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass24> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass24(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass24) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$24$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499941 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499941(boolean z, Continuation<? super C499941> continuation) {
                        super(2, continuation);
                        this.$state = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499941 c499941 = new C499941(this.$state, continuation);
                        c499941.L$0 = obj;
                        return c499941;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499941) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, this.$state, false, false, false, false, -1, 260046847, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499941(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1084}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25, reason: invalid class name */
        static final class AnonymousClass25 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass25(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass25> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass25(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass25) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$25$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499951 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499951(boolean z, Continuation<? super C499951> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499951 c499951 = new C499951(this.$it, continuation);
                        c499951.L$0 = obj;
                        return c499951;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499951) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, this.$it, false, false, false, -1, 251658239, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499951(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1094}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26, reason: invalid class name */
        static final class AnonymousClass26 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass26(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass26> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass26(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass26) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$26$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499961 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499961(boolean z, Continuation<? super C499961> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499961 c499961 = new C499961(this.$it, continuation);
                        c499961.L$0 = obj;
                        return c499961;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499961) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, this.$it, false, false, -1, 234881023, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499961(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$27", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1108}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$27, reason: invalid class name */
        static final class AnonymousClass27 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass27(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass27> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass27(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass27) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityTradeLadderExperiment.INSTANCE, EquityTradeLadderExperiment2.INSTANCE}, false, ExperimentQueryMode.ANY_ARE_MEMBER, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$27$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$27$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        this.this$0.submit(EquityTradeLadderEvent.Exit.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$28", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$28, reason: invalid class name */
        static final class AnonymousClass28 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass28(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass28> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass28(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass28) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquityTradeLadderKillswitchExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$28$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$28$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        this.this$0.submit(EquityTradeLadderEvent.Exit.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1130}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29, reason: invalid class name */
        static final class AnonymousClass29 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass29(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass29> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass29(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass29) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow stateFlow = this.this$0.getStateFlow();
                    final Flow<LadderState> flow = new Flow<LadderState>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super LadderState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C158092(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$map$1$2 */
                        public static final class C158092<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$map$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C158092.this.emit(null, this);
                                }
                            }

                            public C158092(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    LadderState ladderState = ((EquityTradeLadderViewState) obj).getLadderState();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(ladderState, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    Flow<Object> flow2 = new Flow<Object>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$filterIsInstance$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$29$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof LadderState.LadderData) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    this.label = 1;
                    if (FlowKt.first(flow2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.performanceLogger.completeSpan(PerformanceMetricEventData.Name.SCREEN_LOAD, this.this$0.getScreenLoadContextualId(), EquityTradeLadderDuxoKt.LADDER_L2_DATA_LOADED_METRIC);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1142}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30, reason: invalid class name */
        static final class AnonymousClass30 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass30(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass30> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass30(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass30) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow stateFlow = this.this$0.getStateFlow();
                    final Flow<EquityTradeLadderViewState.BottomBarData> flow = new Flow<EquityTradeLadderViewState.BottomBarData>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EquityTradeLadderViewState.BottomBarData> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C158122(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$map$1$2 */
                        public static final class C158122<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$map$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C158122.this.emit(null, this);
                                }
                            }

                            public C158122(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    EquityTradeLadderViewState.BottomBarData bottomBarData = ((EquityTradeLadderViewState) obj).getBottomBarData();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(bottomBarData, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    final Flow<Object> flow2 = new Flow<Object>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filterIsInstance$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof EquityTradeLadderViewState.BottomBarData.MarketOrderData) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    Flow<EquityTradeLadderViewState.BottomBarData.MarketOrderData> flow3 = new Flow<EquityTradeLadderViewState.BottomBarData.MarketOrderData>() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EquityTradeLadderViewState.BottomBarData.MarketOrderData> flowCollector, Continuation continuation) {
                            Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filter$1$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$30$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData = (EquityTradeLadderViewState.BottomBarData.MarketOrderData) obj;
                                    if (marketOrderData.getBuyButtonState().getEnabled() || marketOrderData.getSellButtonState().getEnabled()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    this.label = 1;
                    if (FlowKt.first(flow3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.performanceLogger.completeSpan(PerformanceMetricEventData.Name.SCREEN_LOAD, this.this$0.getScreenLoadContextualId(), EquityTradeLadderDuxoKt.LADDER_MARKET_BUTTONS_LOADED_METRIC);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1154}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31, reason: invalid class name */
        static final class AnonymousClass31 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradeLadderDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass31(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass31> continuation) {
                super(2, continuation);
                this.this$0 = equityTradeLadderDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass31(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass31) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowShouldShowUpsell = this.this$0.equityUpsellService.shouldShowUpsell(UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowShouldShowUpsell, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EquityTradeLadderDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradeLadderDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradeLadderDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradeLadderDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$31$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499981 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499981(boolean z, Continuation<? super C499981> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499981 c499981 = new C499981(this.$it, continuation);
                        c499981.L$0 = obj;
                        return c499981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                        return ((C499981) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, this.$it, -1, 134217727, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499981(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onMarketBuyClicked() {
        final EquityLadderOrderState orderState;
        EquityTradeLadderViewState.BottomBarData bottomBarData = ((EquityTradeLadderViewState) getStateFlow().getValue()).getBottomBarData();
        EquityTradeLadderViewState.BottomBarData.MarketOrderData marketOrderData = bottomBarData instanceof EquityTradeLadderViewState.BottomBarData.MarketOrderData ? (EquityTradeLadderViewState.BottomBarData.MarketOrderData) bottomBarData : null;
        if ((marketOrderData == null || marketOrderData.getBuyButtonState().getEnabled()) && (orderState = ((EquityTradeLadderViewState) getStateFlow().getValue()).getOrderState()) != null) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onMarketBuyClicked$lambda$10(orderState, this, (EquityTradeLadderDataState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMarketBuyClicked$lambda$10(EquityLadderOrderState equityLadderOrderState, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (equityLadderOrderState.getAutoSendOrders() && !ds.getShowSubmitBuy()) {
            equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onMarketBuyClicked$2$1(null));
        } else {
            if (equityTradeLadderDuxo.tradeInFlight) {
                return Unit.INSTANCE;
            }
            equityTradeLadderDuxo.tradeInFlight = true;
            equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onMarketBuyClicked$2$2(null));
            equityTradeLadderDuxo.handleSubmitOrder(equityLadderOrderState, EquityOrderSide.BUY, null, null, ds.getMarketBuysEnabled(), ds.getSubzeroEnabled());
        }
        return Unit.INSTANCE;
    }

    public final void onMarketSellClicked() {
        final EquityLadderOrderState orderState = ((EquityTradeLadderViewState) getStateFlow().getValue()).getOrderState();
        if (orderState == null) {
            return;
        }
        StringResource sellCheckString = this.equityTradeService.getSellCheckString(orderState.getBuySellData(), orderState.getAllowShorting(), OrderType.MARKET, null);
        if (sellCheckString == null && orderState.getSellEnabled()) {
            withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradeLadderDuxo.onMarketSellClicked$lambda$12(this.f$0, orderState, (EquityTradeLadderDataState) obj);
                }
            });
        } else if (sellCheckString != null) {
            submit(new EquityTradeLadderEvent.Snackbar(null, sellCheckString, null, null, false, 13, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMarketSellClicked$lambda$12(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityLadderOrderState equityLadderOrderState, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (equityTradeLadderDuxo.handleSubzeroOnboarding(equityLadderOrderState.getSellOrderSide(), equityLadderOrderState.getAccount().getType(), equityLadderOrderState.getAccount().getAccountNumber(), equityLadderOrderState.getInstrument().getId())) {
            return Unit.INSTANCE;
        }
        if (equityLadderOrderState.getAutoSendOrders() && !ds.getShowSubmitSell()) {
            equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onMarketSellClicked$2$1(null));
        } else {
            if (equityTradeLadderDuxo.tradeInFlight) {
                return Unit.INSTANCE;
            }
            equityTradeLadderDuxo.tradeInFlight = true;
            equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onMarketSellClicked$2$2(null));
            equityTradeLadderDuxo.handleSubmitOrder(equityLadderOrderState, equityLadderOrderState.getSellOrderSide(), null, null, ds.getMarketBuysEnabled(), ds.getSubzeroEnabled());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$1 */
    static final class C158431 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158431(Continuation<? super C158431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158431 c158431 = new C158431(continuation);
            c158431.L$0 = obj;
            return c158431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158431) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -536870913, 268435455, null);
        }
    }

    public final void onNbboRefreshed() {
        applyMutation(new C158431(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158442(null), 3, null);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2196}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$2 */
    static final class C158442 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C158442(Continuation<? super C158442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158442(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuidFromString = UUID.fromString(((EquityTradeLadderFragmentKey) EquityTradeLadderDuxo.INSTANCE.getArgs((HasSavedState) EquityTradeLadderDuxo.this)).getInstrumentId());
                NbboSummaryStore nbboSummaryStore = EquityTradeLadderDuxo.this.nbboSummaryStore;
                Intrinsics.checkNotNull(uuidFromString);
                Single<Response<ApiNbboSummary>> singleRefresh = nbboSummaryStore.refresh(uuidFromString);
                this.label = 1;
                if (RxAwait3.await(singleRefresh, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityTradeLadderDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$2$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onNbboRefreshed$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -536870913, 268435455, null);
            }
        }
    }

    public final void onQuantitySelectorClicked() {
        setScreenState(new LadderScreenState.BottomSheet.QuantitySelector(false, null, 3, null), true);
        applyMutation(new C158471(null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantitySelectorClicked$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantitySelectorClicked$1 */
    static final class C158471 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158471(Continuation<? super C158471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158471 c158471 = new C158471(continuation);
            c158471.L$0 = obj;
            return c158471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158471) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1073741825, 268435455, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantitySelectorDismiss$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantitySelectorDismiss$1 */
    static final class C158481 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158481(Continuation<? super C158481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158481 c158481 = new C158481(continuation);
            c158481.L$0 = obj;
            return c158481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158481) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1073741825, 268435455, null);
        }
    }

    public final void onQuantitySelectorDismiss() {
        applyMutation(new C158481(null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantityUpdated$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantityUpdated$1 */
    static final class C158491 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ BigDecimal $quantity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158491(BigDecimal bigDecimal, Continuation<? super C158491> continuation) {
            super(2, continuation);
            this.$quantity = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158491 c158491 = new C158491(this.$quantity, continuation);
            c158491.L$0 = obj;
            return c158491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158491) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, this.$quantity, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268435447, null);
        }
    }

    public final void onQuantityUpdated(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        applyMutation(new C158491(quantity, null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantityInputModeChanged$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onQuantityInputModeChanged$1 */
    static final class C158461 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ TradeQuantity $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158461(TradeQuantity tradeQuantity, Continuation<? super C158461> continuation) {
            super(2, continuation);
            this.$mode = tradeQuantity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158461 c158461 = new C158461(this.$mode, continuation);
            c158461.L$0 = obj;
            return c158461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158461) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, this.$mode, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268435439, null);
        }
    }

    public final void onQuantityInputModeChanged(TradeQuantity mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        applyMutation(new C158461(mode, null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onSettingsVisibilityChanged$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onSettingsVisibilityChanged$1 */
    static final class C158501 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ boolean $visibility;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158501(boolean z, Continuation<? super C158501> continuation) {
            super(2, continuation);
            this.$visibility = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158501 c158501 = new C158501(this.$visibility, continuation);
            c158501.L$0 = obj;
            return c158501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158501) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            LadderScreenState ladderSettings;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            if (this.$visibility) {
                ladderSettings = new LadderScreenState.BottomSheet.LadderSettings(false, null, 3, null);
            } else {
                ladderSettings = LadderScreenState.Ladder.INSTANCE;
            }
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, ladderSettings, null, null, false, false, null, null, null, this.$visibility, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -67108865, 268435451, null);
        }
    }

    public final void onSettingsVisibilityChanged(boolean visibility) {
        applyMutation(new C158501(visibility, null));
    }

    public final void onFlattenClicked() {
        final EquityLadderOrderState orderState = ((EquityTradeLadderViewState) getStateFlow().getValue()).getOrderState();
        if (orderState == null) {
            return;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradeLadderDuxo.onFlattenClicked$lambda$13(this.f$0, orderState, (EquityTradeLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFlattenClicked$lambda$13(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityLadderOrderState equityLadderOrderState, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Account account = ds.getAccount();
        String accountNumber = account != null ? account.getAccountNumber() : null;
        if (accountNumber != null) {
            BuildersKt__Builders_commonKt.launch$default(equityTradeLadderDuxo.getLifecycleScope(), null, null, new EquityTradeLadderDuxo$onFlattenClicked$1$1(equityTradeLadderDuxo, ds, accountNumber, equityLadderOrderState, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void onOpenOrdersClicked() {
        UUID uuidFromString = UUID.fromString(((EquityTradeLadderFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId());
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter = AccountsHistoryAccountTypeFilter.RHS;
        Intrinsics.checkNotNull(uuidFromString);
        submit(new EquityTradeLadderEvent.LaunchFragment(new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, null, new AccountsHistoryContract.InstrumentFilter(uuidFromString, AccountsHistoryContract.InstrumentFilterType.EQUITY), null, true, null, 42, null)));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onOrderCheckAction$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1468}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onOrderCheckAction$1 */
    static final class C158451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EquityTradeLadderEvent.OrderCheckAlert $alert;
        final /* synthetic */ ServerDrivenButton $button;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158451(ServerDrivenButton serverDrivenButton, EquityTradeLadderEvent.OrderCheckAlert orderCheckAlert, Continuation<? super C158451> continuation) {
            super(2, continuation);
            this.$button = serverDrivenButton;
            this.$alert = orderCheckAlert;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158451(this.$button, this.$alert, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityTradeLadderDuxo equityTradeLadderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderDuxo equityTradeLadderDuxo2 = EquityTradeLadderDuxo.this;
                EquityTradeService equityTradeService = equityTradeLadderDuxo2.equityTradeService;
                ServerDrivenButton serverDrivenButton = this.$button;
                EquityOrderIntent equityOrderIntent = this.$alert.getEquityOrderIntent();
                this.L$0 = equityTradeLadderDuxo2;
                this.label = 1;
                Object objHandlerOrderCheckAction = equityTradeService.handlerOrderCheckAction(serverDrivenButton, equityOrderIntent, this);
                if (objHandlerOrderCheckAction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                equityTradeLadderDuxo = equityTradeLadderDuxo2;
                obj = objHandlerOrderCheckAction;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) obj);
            return Unit.INSTANCE;
        }
    }

    public final void onOrderCheckAction(EquityTradeLadderEvent.OrderCheckAlert alert, ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(button, "button");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158451(button, alert, null), 3, null);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onDirectOrderCheckAction$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1477}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onDirectOrderCheckAction$1 */
    static final class C158371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericAction $action;
        final /* synthetic */ EquityOrderIntent $equityOrderIntent;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158371(GenericAction genericAction, EquityOrderIntent equityOrderIntent, Continuation<? super C158371> continuation) {
            super(2, continuation);
            this.$action = genericAction;
            this.$equityOrderIntent = equityOrderIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158371(this.$action, this.$equityOrderIntent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityTradeLadderDuxo equityTradeLadderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderDuxo equityTradeLadderDuxo2 = EquityTradeLadderDuxo.this;
                EquityTradeService equityTradeService = equityTradeLadderDuxo2.equityTradeService;
                GenericAction genericAction = this.$action;
                EquityOrderIntent equityOrderIntent = this.$equityOrderIntent;
                this.L$0 = equityTradeLadderDuxo2;
                this.label = 1;
                Object objHandlerDirectOrderCheckAction = equityTradeService.handlerDirectOrderCheckAction(genericAction, equityOrderIntent, this);
                if (objHandlerDirectOrderCheckAction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                equityTradeLadderDuxo = equityTradeLadderDuxo2;
                obj = objHandlerDirectOrderCheckAction;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) obj);
            return Unit.INSTANCE;
        }
    }

    public final void onDirectOrderCheckAction(EquityOrderIntent equityOrderIntent, GenericAction action) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158371(action, equityOrderIntent, null), 3, null);
    }

    public final void onPnlClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradeLadderDuxo.onPnlClick$lambda$14(this.f$0, (EquityTradeLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPnlClick$lambda$14(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!Position5.getHasPosition(ds.getPosition())) {
            return Unit.INSTANCE;
        }
        EventLogger.DefaultImpls.logTap$default(equityTradeLadderDuxo.eventLogger, null, equityTradeLadderDuxo.ladderScreen, new Component(Component.ComponentType.BUTTON, "EQUITIES_PNL_SWITCHER", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ds.getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), false, 41, null);
        equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.HapticFeedbacks(1));
        equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$onPnlClick$1$1(null));
        return Unit.INSTANCE;
    }

    public final void setScreenState(final LadderScreenState state, final boolean advance) {
        Intrinsics.checkNotNullParameter(state, "state");
        withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradeLadderDuxo.setScreenState$lambda$15(this.f$0, state, advance, (EquityTradeLadderDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setScreenState$lambda$15(EquityTradeLadderDuxo equityTradeLadderDuxo, LadderScreenState ladderScreenState, boolean z, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!equityTradeLadderDuxo.screenStateQueue.isEmpty() || !Intrinsics.areEqual(ds.getLadderScreenState(), LadderScreenState.Ladder.INSTANCE)) {
            equityTradeLadderDuxo.screenStateQueue.add(ladderScreenState);
            if (z) {
                equityTradeLadderDuxo.advanceScreenState(null);
            }
        } else {
            equityTradeLadderDuxo.advanceScreenState(ladderScreenState);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$advanceScreenState$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$advanceScreenState$1 */
    static final class C158151 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ LadderScreenState $newScreenState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158151(LadderScreenState ladderScreenState, Continuation<? super C158151> continuation) {
            super(2, continuation);
            this.$newScreenState = ladderScreenState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158151 c158151 = new C158151(this.$newScreenState, continuation);
            c158151.L$0 = obj;
            return c158151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158151) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, this.$newScreenState, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -67108865, 268435455, null);
        }
    }

    public final void advanceScreenState(LadderScreenState state) {
        if (state == null && (state = this.screenStateQueue.removeFirstOrNull()) == null) {
            state = LadderScreenState.Ladder.INSTANCE;
        }
        applyMutation(new C158151(state, null));
    }

    public final void onAutoSendAgreementSigned(boolean showConfirmationToast) {
        if (showConfirmationToast) {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHECKMARK_16;
            StringResource.Companion companion = StringResource.INSTANCE;
            submit(new EquityTradeLadderEvent.Snackbar(serverToBentoAssetMapper2, companion.invoke(C41061R.string.auto_send_enabled_tooltip, new Object[0]), companion.invoke(C41061R.string.settings, new Object[0]), new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityTradeLadderDuxo.onAutoSendAgreementSigned$lambda$16(this.f$0);
                }
            }, false, 16, null));
        }
        onAutoSendToggled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAutoSendAgreementSigned$lambda$16(EquityTradeLadderDuxo equityTradeLadderDuxo) {
        equityTradeLadderDuxo.setScreenState(new LadderScreenState.BottomSheet.LadderSettings(false, null, 3, null), true);
        return Unit.INSTANCE;
    }

    public final void onAutosendUpsellDismissed() {
        EquityUpsellService.setUpsellLastSeen$default(this.equityUpsellService, UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, 0L, 4, null);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onAutoSendToggled$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1574}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onAutoSendToggled$1 */
    static final class C158301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158301(boolean z, Continuation<? super C158301> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158301(this.$checked, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UserInteractionEventData.Action action;
            C158301 c158301;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventLogger eventLogger = EquityTradeLadderDuxo.this.eventLogger;
                Screen screen = EquityTradeLadderDuxo.this.ladderScreen;
                Component component = new Component(Component.ComponentType.TOGGLE, "LadderSettingsBottomSheetAutoSend", null, 4, null);
                if (this.$checked) {
                    action = UserInteractionEventData.Action.TOGGLE_ON;
                } else {
                    action = UserInteractionEventData.Action.TOGGLE_OFF;
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, null, false, 56, null);
                TradeSettingsStore tradeSettingsStore = EquityTradeLadderDuxo.this.tradeSettingsStore;
                TradeSettingsStore4 tradeSettingsStore4 = TradeSettingsStore4.LADDER;
                TradeSettingsStore3.Equity equity = new TradeSettingsStore3.Equity(null);
                boolean z = this.$checked;
                String serverValue = IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND.getServerValue();
                this.label = 1;
                c158301 = this;
                obj = tradeSettingsStore.setAutoSendStateEvent(tradeSettingsStore4, equity, z, serverValue, c158301);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c158301 = this;
            }
            TradeSettingsStore2 tradeSettingsStore2 = (TradeSettingsStore2) obj;
            if (Intrinsics.areEqual(tradeSettingsStore2, TradeSettingsStore2.ExpiredAgreement.INSTANCE)) {
                EquityTradeLadderDuxo.this.setScreenState(new LadderScreenState.BottomSheet.AutoSendRenew(false, new LadderScreenState.BottomSheet.LadderSettings(true, null, 2, null), 1, null), true);
            } else if (Intrinsics.areEqual(tradeSettingsStore2, TradeSettingsStore2.NotSignedAgreement.INSTANCE)) {
                EquityTradeLadderDuxo.this.setScreenState(new LadderScreenState.SlideUp.IdentiAgreement(IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND, false, false, new LadderScreenState.BottomSheet.LadderSettings(false, null, 3, null)), true);
            } else if (!(tradeSettingsStore2 instanceof TradeSettingsStore2.AutosendIsOnAgreementNotSigned) && !(tradeSettingsStore2 instanceof TradeSettingsStore2.State)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void onAutoSendToggled(boolean checked) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158301(checked, null), 3, null);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$showNextPostTradeFtuxState$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$showNextPostTradeFtuxState$1 */
    static final class C158601 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158601(Continuation<? super C158601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158601 c158601 = EquityTradeLadderDuxo.this.new C158601(continuation);
            c158601.L$0 = obj;
            return c158601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158601) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxStateNextState;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityPostTradeLadderFtuxState postTradeLadderFtuxState = equityTradeLadderDataState.getPostTradeLadderFtuxState();
            if (postTradeLadderFtuxState != null && (equityPostTradeLadderFtuxStateNextState = postTradeLadderFtuxState.nextState()) != null) {
                EquityTradeLadderDuxo.this.postTradeLadderFtuxStatePref.set(equityPostTradeLadderFtuxStateNextState);
                EquityTradeLadderDataState equityTradeLadderDataStateCopy$default = EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, equityPostTradeLadderFtuxStateNextState, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268434431, null);
                if (equityTradeLadderDataStateCopy$default != null) {
                    return equityTradeLadderDataStateCopy$default;
                }
            }
            return equityTradeLadderDataState;
        }
    }

    public final void showNextPostTradeFtuxState() {
        applyMutation(new C158601(null));
    }

    public final void onNuxSeen() {
        this.ladderNuxScreenProvider.setLadderNuxSeen();
    }

    public final void onNewNuxBackClicked() {
        setScreenState(LadderScreenState.NuxLoading.INSTANCE, true);
    }

    public final void onExistingNuxBackClicked() {
        setScreenState(LadderScreenState.Ladder.INSTANCE, true);
    }

    public final void onNewNuxContinueClicked() {
        setScreenState(LadderScreenState.Ftux.INSTANCE, true);
    }

    public final void onExistingNuxContinueClicked() {
        setScreenState(LadderScreenState.Ladder.INSTANCE, true);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onLoadingNuxSeen$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1644}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onLoadingNuxSeen$1 */
    static final class C158421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C158421(Continuation<? super C158421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityTradeLadderDuxo.this.setScreenState(LadderScreenState.Ladder.INSTANCE, true);
            return Unit.INSTANCE;
        }
    }

    public final void onLoadingNuxSeen() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158421(null), 3, null);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onLadderEducationCtaClick$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onLadderEducationCtaClick$1 */
    static final class C158411 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ EquityTradeLadderFtuxProgressState $ftuxProgressState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158411(EquityTradeLadderFtuxProgressState equityTradeLadderFtuxProgressState, Continuation<? super C158411> continuation) {
            super(2, continuation);
            this.$ftuxProgressState = equityTradeLadderFtuxProgressState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158411 c158411 = new C158411(this.$ftuxProgressState, continuation);
            c158411.L$0 = obj;
            return c158411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158411) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, this.$ftuxProgressState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -9, 268435455, null);
        }
    }

    public final void onLadderEducationCtaClick() {
        applyMutation(new C158411(this.ladderFtuxManager.getFirstFtuxPage(true), null));
        setScreenState(LadderScreenState.Ftux.INSTANCE, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOrderThrowable(Throwable throwable) {
        StringResource stringResourceInvoke;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse != null) {
            String fieldError = errorResponseExtractErrorResponse.getFieldError("title");
            if (fieldError != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(fieldError);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_error_title, new Object[0]);
            }
            submit(new EquityTradeLadderEvent.ShowDialog(stringResourceInvoke, StringResource.INSTANCE.invoke(String.valueOf(errorResponseExtractErrorResponse.getDisplayMessage()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOrderStatusEvents(OrderStatusEvent event) {
        EquityOrderIntent orderIntent = event.getOrderIntent();
        applyMutation(new C158191(event, this, orderIntent, orderIntent.getRefId(), orderIntent.getExistingOrder(), null));
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderStatusEvents$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderStatusEvents$1 */
    static final class C158191 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ OrderStatusEvent $event;
        final /* synthetic */ Order $existingOrder;
        final /* synthetic */ EquityOrderIntent $orderIntent;
        final /* synthetic */ UUID $refId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158191(OrderStatusEvent orderStatusEvent, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityOrderIntent equityOrderIntent, UUID uuid, Order order, Continuation<? super C158191> continuation) {
            super(2, continuation);
            this.$event = orderStatusEvent;
            this.this$0 = equityTradeLadderDuxo;
            this.$orderIntent = equityOrderIntent;
            this.$refId = uuid;
            this.$existingOrder = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158191 c158191 = new C158191(this.$event, this.this$0, this.$orderIntent, this.$refId, this.$existingOrder, continuation);
            c158191.L$0 = obj;
            return c158191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158191) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x01a5  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            OrderStatusEvent orderStatusEvent = this.$event;
            if (orderStatusEvent instanceof OrderStatusEvent.Aborted) {
                Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
                UUID uuid = this.$refId;
                Order order = this.$existingOrder;
                uiPendingOrdersMap.remove(uuid);
                if (order != null && uiPendingOrdersMap.containsKey(order.getId())) {
                    uiPendingOrdersMap.put(order.getId(), new PendingFilledOrder(order));
                }
                Unit unit = Unit.INSTANCE;
                return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
            }
            if (orderStatusEvent instanceof OrderStatusEvent.Failed) {
                this.this$0.handleOrderThrowable(((OrderStatusEvent.Failed) orderStatusEvent).getThrowable());
                Map<UUID, EquityPendingOrder3> uiPendingOrdersMap2 = equityTradeLadderDataState.getUiPendingOrdersMap();
                UUID uuid2 = this.$refId;
                Order order2 = this.$existingOrder;
                uiPendingOrdersMap2.remove(uuid2);
                if (order2 != null && uiPendingOrdersMap2.containsKey(order2.getId())) {
                    uiPendingOrdersMap2.put(order2.getId(), new PendingFilledOrder(order2));
                }
                Unit unit2 = Unit.INSTANCE;
                return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap2, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
            }
            if (!(orderStatusEvent instanceof OrderStatusEvent.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((OrderStatusEvent.Success) orderStatusEvent).getOrder().isError()) {
                StringResource orderConfirmationStatusString = OrderConfirmationStatusString.getOrderConfirmationStatusString(((OrderStatusEvent.Success) this.$event).getOrder(), this.$orderIntent.getInstrument().getSymbol());
                Order order3 = ((OrderStatusEvent.Success) this.$event).getOrder();
                String symbol = this.$orderIntent.getInstrument().getSymbol();
                Instrument instrument = equityTradeLadderDataState.getInstrument();
                if (instrument != null) {
                    boolean z = instrument.isPreIpo();
                    this.this$0.submit(new EquityTradeLadderEvent.ShowDialog(orderConfirmationStatusString, OrderConfirmationDescription.getOrderConfirmationDescriptionString$default(order3, symbol, z, null, 4, null)));
                }
            }
            Order.Configuration configuration$default = Order.Configuration.Companion.getConfiguration$default(Order.Configuration.INSTANCE, ((OrderStatusEvent.Success) this.$event).getOrder().getType(), ((OrderStatusEvent.Success) this.$event).getOrder().getTrigger(), null, null, 12, null);
            if (((OrderStatusEvent.Success) this.$event).getOrder().getState() == EquityOrderState.QUEUED && configuration$default == Order.Configuration.MARKET) {
                EquityTradeLadderDuxo equityTradeLadderDuxo = this.this$0;
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(C15889R.string.equity_ladder_market_order_queued, new Object[0]);
                StringResource stringResourceInvoke2 = companion.invoke(C15889R.string.equity_ladder_market_order_queued_action, new Object[0]);
                final EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.this$0;
                final OrderStatusEvent orderStatusEvent2 = this.$event;
                equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.Snackbar(null, stringResourceInvoke, stringResourceInvoke2, new Function0() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderStatusEvents$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradeLadderDuxo.C158191.invokeSuspend$lambda$2(equityTradeLadderDuxo2, orderStatusEvent2);
                    }
                }, false, 1, null));
            }
            final EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.this$0;
            final OrderStatusEvent orderStatusEvent3 = this.$event;
            equityTradeLadderDuxo3.withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderStatusEvents$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityTradeLadderDuxo.C158191.invokeSuspend$lambda$3(orderStatusEvent3, equityTradeLadderDuxo3, (EquityTradeLadderDataState) obj2);
                }
            });
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap3 = equityTradeLadderDataState.getUiPendingOrdersMap();
            UUID uuid3 = this.$refId;
            OrderStatusEvent orderStatusEvent4 = this.$event;
            if (uiPendingOrdersMap3.containsKey(uuid3)) {
                uiPendingOrdersMap3.remove(uuid3);
                OrderStatusEvent.Success success = (OrderStatusEvent.Success) orderStatusEvent4;
                uiPendingOrdersMap3.put(success.getOrder().getId(), new PendingFilledOrder(success.getOrder()));
            }
            Unit unit3 = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap3, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(EquityTradeLadderDuxo equityTradeLadderDuxo, OrderStatusEvent orderStatusEvent) {
            equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.LaunchFragment(LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ORDER, ((OrderStatusEvent.Success) orderStatusEvent).getOrder().getId(), null, false, 12, null)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(OrderStatusEvent orderStatusEvent, EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState equityTradeLadderDataState) {
            OrderStatusEvent.Success success = (OrderStatusEvent.Success) orderStatusEvent;
            if (!success.getOrderIntent().getAutoSend() && equityTradeLadderDataState.getShouldShowAutoSendUpsell() && !Intrinsics.areEqual(equityTradeLadderDuxo.lastSuccessOrderId, success.getOrder().getId())) {
                EquityUpsellService.setUpsellViewCount$default(equityTradeLadderDuxo.equityUpsellService, UpsellLocation.LADDER, EquityUpsell.POST_TRADE_AUTO_SEND, 0, 4, null);
                equityTradeLadderDuxo.setScreenState(LadderScreenState.AutoSendUpsell.INSTANCE, true);
            }
            equityTradeLadderDuxo.lastSuccessOrderId = success.getOrder().getId();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$generateNewRefId$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$generateNewRefId$1 */
    static final class C158181 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ UUID $refId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158181(UUID uuid, Continuation<? super C158181> continuation) {
            super(2, continuation);
            this.$refId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158181 c158181 = new C158181(this.$refId, continuation);
            c158181.L$0 = obj;
            return c158181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158181) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, this.$refId, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, true, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -4194305, 268434943, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID generateNewRefId() {
        UUID uuidRandomUUID = UUID.randomUUID();
        applyMutation(new C158181(uuidRandomUUID, null));
        Intrinsics.checkNotNull(uuidRandomUUID);
        return uuidRandomUUID;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleSubmitOrder$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1799}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleSubmitOrder$1 */
    static final class C158291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BigDecimal $limitPrice;
        final /* synthetic */ boolean $marketBuysEnabled;
        final /* synthetic */ EquityOrderSide $orderSide;
        final /* synthetic */ EquityLadderOrderState $orderState;
        final /* synthetic */ BigDecimal $stopPrice;
        final /* synthetic */ boolean $subzeroEnabled;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158291(EquityLadderOrderState equityLadderOrderState, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, Continuation<? super C158291> continuation) {
            super(2, continuation);
            this.$orderState = equityLadderOrderState;
            this.$orderSide = equityOrderSide;
            this.$limitPrice = bigDecimal;
            this.$stopPrice = bigDecimal2;
            this.$marketBuysEnabled = z;
            this.$subzeroEnabled = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158291(this.$orderState, this.$orderSide, this.$limitPrice, this.$stopPrice, this.$marketBuysEnabled, this.$subzeroEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityTradeLadderDuxo equityTradeLadderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityTradeLadderDuxo equityTradeLadderDuxo2 = EquityTradeLadderDuxo.this;
                UUID uuidGenerateNewRefId = equityTradeLadderDuxo2.generateNewRefId();
                EquityLadderOrderState equityLadderOrderState = this.$orderState;
                EquityOrderSide equityOrderSide = this.$orderSide;
                BigDecimal bigDecimal = this.$limitPrice;
                BigDecimal bigDecimal2 = this.$stopPrice;
                boolean z = this.$marketBuysEnabled;
                boolean z2 = this.$subzeroEnabled;
                this.L$0 = equityTradeLadderDuxo2;
                this.label = 1;
                obj = EquityTradeLadderDuxo.submitOrder$default(equityTradeLadderDuxo2, uuidGenerateNewRefId, equityLadderOrderState, equityOrderSide, bigDecimal, bigDecimal2, z, z2, null, null, this, 384, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                equityTradeLadderDuxo = equityTradeLadderDuxo2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) obj);
            return Unit.INSTANCE;
        }
    }

    private final void handleSubmitOrder(EquityLadderOrderState orderState, EquityOrderSide orderSide, BigDecimal limitPrice, BigDecimal stopPrice, boolean marketBuysEnabled, boolean subzeroEnabled) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158291(orderState, orderSide, limitPrice, stopPrice, marketBuysEnabled, subzeroEnabled, null), 3, null);
    }

    static /* synthetic */ Object submitOrder$default(EquityTradeLadderDuxo equityTradeLadderDuxo, UUID uuid, EquityLadderOrderState equityLadderOrderState, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, Boolean bool, BigDecimal bigDecimal3, Continuation continuation, int i, Object obj) {
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bigDecimal3 = null;
        }
        return equityTradeLadderDuxo.submitOrder(uuid, equityLadderOrderState, equityOrderSide, bigDecimal, bigDecimal2, z, z2, bool, bigDecimal3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object submitOrder(UUID uuid, EquityLadderOrderState equityLadderOrderState, EquityOrderSide equityOrderSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2, Boolean bool, BigDecimal bigDecimal3, Continuation<? super OrderSubmitResult> continuation) {
        EquityOrderIntent equityOrderIntent = EquityLadderOrderState2.toEquityOrderIntent(equityLadderOrderState, uuid, equityOrderSide, bigDecimal, bigDecimal2, null, CollectionsKt.emptyList(), boxing.boxBoolean(false), bool, bigDecimal3);
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.ACTION_COMPLETION, null, uuid, EquityOrderContext2.toPerformanceContext(equityOrderIntent, equityLadderOrderState.getAutoSendOrders(), z, z2), 2, null);
        if (bigDecimal != null || bigDecimal2 != null) {
            applyMutation(new C158612(equityOrderIntent, null));
        }
        return this.equityTradeService.validateAndSubmit(equityOrderIntent, continuation);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$submitOrder$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$submitOrder$2 */
    static final class C158612 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ EquityOrderIntent $intent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158612(EquityOrderIntent equityOrderIntent, Continuation<? super C158612> continuation) {
            super(2, continuation);
            this.$intent = equityOrderIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158612 c158612 = new C158612(this.$intent, continuation);
            c158612.L$0 = obj;
            return c158612;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158612) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            EquityOrderIntent equityOrderIntent = this.$intent;
            uiPendingOrdersMap.put(equityOrderIntent.getRefId(), new PendingPlacedOrder(equityOrderIntent));
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    private final boolean handleSubzeroOnboarding(EquityOrderSide tradeSide, com.robinhood.models.api.AccountType accountType, String accountNumber, UUID instrumentId) {
        SubzeroOnboardingHandler3 subzeroOnboardingHandler3Handle = this.subzeroOnboardingHandler.handle(tradeSide, accountType, accountNumber, instrumentId, SubzeroOnboardingHandler2.LADDER);
        if (subzeroOnboardingHandler3Handle instanceof SubzeroOnboardingHandler3.DeepLink) {
            submit(new EquityTradeLadderEvent.LaunchDeepLink(Uri.parse(((SubzeroOnboardingHandler3.DeepLink) subzeroOnboardingHandler3Handle).getDeeplink())));
            return true;
        }
        if (Intrinsics.areEqual(subzeroOnboardingHandler3Handle, SubzeroOnboardingHandler3.NoAction.INSTANCE) || Intrinsics.areEqual(subzeroOnboardingHandler3Handle, SubzeroOnboardingHandler3.SellShort.INSTANCE)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOrderSubmitResult(OrderSubmitResult orderSubmitResult) {
        this.tradeInFlight = false;
        if (orderSubmitResult instanceof OrderSubmitResult.ChangeTradingSessionAction) {
            applyMutation(new C158201(orderSubmitResult, null));
            setScreenState(new LadderScreenState.BottomSheet.NestedSettingsBottomSheet.EquityTradingSession(false, LadderScreenState.Ladder.INSTANCE, 1, null), true);
        } else if ((orderSubmitResult instanceof OrderSubmitResult.EditLimitOrderAction) || (orderSubmitResult instanceof OrderSubmitResult.EditStopOrderAction)) {
            applyMutation(new C158222(orderSubmitResult, orderSubmitResult.getOrderIntent().getExistingOrder(), null));
        } else if (orderSubmitResult instanceof OrderSubmitResult.DisplayOrderCheck) {
            OrderSubmitResult.DisplayOrderCheck displayOrderCheck = (OrderSubmitResult.DisplayOrderCheck) orderSubmitResult;
            if (displayOrderCheck.getOrderCheckAlert() instanceof VisibleEquityOrderChecksAlert) {
                applyMutation(new C158233(null));
                submit(new EquityTradeLadderEvent.OrderCheckAlert(displayOrderCheck.getOrderCheckAlert(), displayOrderCheck.getOrderIntent()));
            }
        } else if (orderSubmitResult instanceof OrderSubmitResult.LaunchTradeFlow) {
            submit(new EquityTradeLadderEvent.HapticFeedbacks(16));
            applyMutation(new C158244(null));
            submit(new EquityTradeLadderEvent.LaunchActivity(((OrderSubmitResult.LaunchTradeFlow) orderSubmitResult).getIntentKey()));
        } else if (orderSubmitResult instanceof OrderSubmitResult.ShowDialogFragment) {
            applyMutation(new C158255(orderSubmitResult, null));
            OrderSubmitResult.ShowDialogFragment showDialogFragment = (OrderSubmitResult.ShowDialogFragment) orderSubmitResult;
            submit(new EquityTradeLadderEvent.OrderCheckBottomSheet(showDialogFragment.getOrderIntent(), showDialogFragment.getDialogFragmentKey(), showDialogFragment.getTag()));
        } else if (orderSubmitResult instanceof OrderSubmitResult.NotifyAutoSendSuccess) {
            submit(new EquityTradeLadderEvent.HapticFeedbacks(16));
            applyMutation(new C158266(null));
        } else if (orderSubmitResult instanceof OrderSubmitResult.DeepLink) {
            applyMutation(new C158277(orderSubmitResult, null));
            submit(new EquityTradeLadderEvent.LaunchDeepLink(((OrderSubmitResult.DeepLink) orderSubmitResult).getUri()));
        } else if (orderSubmitResult instanceof OrderSubmitResult.Error) {
            OrderSubmitResult.Error error = (OrderSubmitResult.Error) orderSubmitResult;
            StringResource errorMessage = error.getErrorMessage();
            if (errorMessage != null) {
                submit(new EquityTradeLadderEvent.Snackbar(ServerToBentoAssetMapper2.ALERT_16, errorMessage, null, null, false, 12, null));
            }
            applyMutation(new C158289(orderSubmitResult, error.getOrderIntent().getExistingOrder(), null));
        } else {
            if (!(orderSubmitResult instanceof OrderSubmitResult.NoAction)) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C1582110(orderSubmitResult, ((OrderSubmitResult.NoAction) orderSubmitResult).getOrderIntent().getExistingOrder(), null));
        }
        if ((orderSubmitResult instanceof OrderSubmitResult.NotifyAutoSendSuccess) || (orderSubmitResult instanceof OrderSubmitResult.LaunchTradeFlow)) {
            this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.ACTION_COMPLETION, orderSubmitResult.getOrderIntent().getRefId());
        } else {
            this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.ACTION_COMPLETION, orderSubmitResult.getOrderIntent().getRefId());
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$1 */
    static final class C158201 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158201(OrderSubmitResult orderSubmitResult, Continuation<? super C158201> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158201 c158201 = new C158201(this.$this_handleOrderSubmitResult, continuation);
            c158201.L$0 = obj;
            return c158201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158201) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            Integer mostRecentSelectedRowIndex = equityTradeLadderDataState.getMostRecentSelectedRowIndex();
            if (mostRecentSelectedRowIndex != null) {
                OrderSubmitResult orderSubmitResult = this.$this_handleOrderSubmitResult;
                int iIntValue = mostRecentSelectedRowIndex.intValue();
                EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
                Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
                OrderSubmitResult.ChangeTradingSessionAction changeTradingSessionAction = (OrderSubmitResult.ChangeTradingSessionAction) orderSubmitResult;
                uiPendingOrdersMap.remove(changeTradingSessionAction.getOrderIntent().getRefId());
                BigDecimal selectedPrice = changeTradingSessionAction.getOrderIntent().getSelectedPrice();
                if (selectedPrice == null) {
                    LadderPriceLevels ladderPriceLevels = equityTradeLadderDataState.getLadderPriceLevels();
                    selectedPrice = ladderPriceLevels != null ? ladderPriceLevels.getPrice(iIntValue) : null;
                }
                EquityTradeLadderDataState equityTradeLadderDataStateCopy$default = EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, boxing.boxInt(iIntValue), selectedPrice, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, true, false, false, false, false, false, false, false, -1, 267124732, null);
                if (equityTradeLadderDataStateCopy$default != null) {
                    return equityTradeLadderDataStateCopy$default;
                }
            }
            return equityTradeLadderDataState;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$2 */
    static final class C158222 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ Order $order;
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158222(OrderSubmitResult orderSubmitResult, Order order, Continuation<? super C158222> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
            this.$order = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158222 c158222 = new C158222(this.$this_handleOrderSubmitResult, this.$order, continuation);
            c158222.L$0 = obj;
            return c158222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158222) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            OrderSubmitResult orderSubmitResult = this.$this_handleOrderSubmitResult;
            Order order = this.$order;
            uiPendingOrdersMap.remove(orderSubmitResult.getOrderIntent().getRefId());
            if (order != null) {
                uiPendingOrdersMap.put(order.getId(), new PendingFilledOrder(order));
            }
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$3 */
    static final class C158233 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158233(Continuation<? super C158233> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158233 c158233 = new C158233(continuation);
            c158233.L$0 = obj;
            return c158233;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158233) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((EquityTradeLadderDataState) this.L$0).copyToClearSelectionState();
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$4", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$4 */
    static final class C158244 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158244(Continuation<? super C158244> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158244 c158244 = new C158244(continuation);
            c158244.L$0 = obj;
            return c158244;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158244) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((EquityTradeLadderDataState) this.L$0).copyToClearSelectionState();
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$5", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$5 */
    static final class C158255 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158255(OrderSubmitResult orderSubmitResult, Continuation<? super C158255> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158255 c158255 = new C158255(this.$this_handleOrderSubmitResult, continuation);
            c158255.L$0 = obj;
            return c158255;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158255) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            uiPendingOrdersMap.remove(((OrderSubmitResult.ShowDialogFragment) this.$this_handleOrderSubmitResult).getOrderIntent().getRefId());
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$6", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$6 */
    static final class C158266 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158266(Continuation<? super C158266> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158266 c158266 = new C158266(continuation);
            c158266.L$0 = obj;
            return c158266;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158266) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((EquityTradeLadderDataState) this.L$0).copyToClearSelectionState();
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$7", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$7 */
    static final class C158277 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158277(OrderSubmitResult orderSubmitResult, Continuation<? super C158277> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158277 c158277 = new C158277(this.$this_handleOrderSubmitResult, continuation);
            c158277.L$0 = obj;
            return c158277;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158277) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            uiPendingOrdersMap.remove(((OrderSubmitResult.DeepLink) this.$this_handleOrderSubmitResult).getOrderIntent().getRefId());
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$9", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$9 */
    static final class C158289 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ Order $order;
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158289(OrderSubmitResult orderSubmitResult, Order order, Continuation<? super C158289> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
            this.$order = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158289 c158289 = new C158289(this.$this_handleOrderSubmitResult, this.$order, continuation);
            c158289.L$0 = obj;
            return c158289;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158289) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            OrderSubmitResult orderSubmitResult = this.$this_handleOrderSubmitResult;
            Order order = this.$order;
            uiPendingOrdersMap.remove(((OrderSubmitResult.Error) orderSubmitResult).getOrderIntent().getRefId());
            if (order != null) {
                uiPendingOrdersMap.put(order.getId(), new PendingFilledOrder(order));
            }
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$10", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$handleOrderSubmitResult$10 */
    static final class C1582110 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ Order $order;
        final /* synthetic */ OrderSubmitResult $this_handleOrderSubmitResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1582110(OrderSubmitResult orderSubmitResult, Order order, Continuation<? super C1582110> continuation) {
            super(2, continuation);
            this.$this_handleOrderSubmitResult = orderSubmitResult;
            this.$order = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1582110 c1582110 = new C1582110(this.$this_handleOrderSubmitResult, this.$order, continuation);
            c1582110.L$0 = obj;
            return c1582110;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C1582110) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            OrderSubmitResult orderSubmitResult = this.$this_handleOrderSubmitResult;
            Order order = this.$order;
            uiPendingOrdersMap.remove(((OrderSubmitResult.NoAction) orderSubmitResult).getOrderIntent().getRefId());
            if (order != null) {
                uiPendingOrdersMap.put(order.getId(), new PendingFilledOrder(order));
            }
            Unit unit = Unit.INSTANCE;
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    private final void cancelOrder(EquityTradeLadderDataState state) {
        Set<UUID> orderIds;
        withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradeLadderDuxo.cancelOrder$lambda$18(this.f$0, (EquityTradeLadderDataState) obj);
            }
        });
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = state.getSelectedPendingOrders();
        if (selectedPendingOrders == null || (orderIds = selectedPendingOrders.getOrderIds()) == null) {
            return;
        }
        Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = state.getUiPendingOrdersMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<UUID, EquityPendingOrder3> entry : uiPendingOrdersMap.entrySet()) {
            if (orderIds.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof EquityPendingOrder6) {
                arrayList.add(obj);
            }
        }
        submit(new EquityTradeLadderEvent.HapticFeedbacks(16));
        applyMutation(new C158162(arrayList, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158173(arrayList, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelOrder$lambda$18(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(equityTradeLadderDuxo.eventLogger, new UserInteractionEventData(null, equityTradeLadderDuxo.ladderScreen, null, UserInteractionEventData.Action.LADDER_CANCEL_ORDER, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ds.getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), null, null, 101, null), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$2 */
    static final class C158162 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ java.util.List<EquityPendingOrder6> $pendingOrdersToDelete;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C158162(java.util.List<? extends EquityPendingOrder6> list, Continuation<? super C158162> continuation) {
            super(2, continuation);
            this.$pendingOrdersToDelete = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158162 c158162 = new C158162(this.$pendingOrdersToDelete, continuation);
            c158162.L$0 = obj;
            return c158162;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158162) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            java.util.List<EquityPendingOrder6> list = this.$pendingOrdersToDelete;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (EquityPendingOrder6 equityPendingOrder6 : list) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(equityPendingOrder6.getOrder().getId(), new PendingCanceledOrder(equityPendingOrder6.getOrder()));
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, MapsKt.toMutableMap(MapsKt.plus(uiPendingOrdersMap, linkedHashMap)), null, false, false, false, false, false, false, false, false, -1, 268173311, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2065}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$3 */
    static final class C158173 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ java.util.List<EquityPendingOrder6> $pendingOrdersToDelete;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C158173(java.util.List<? extends EquityPendingOrder6> list, EquityTradeLadderDuxo equityTradeLadderDuxo, Continuation<? super C158173> continuation) {
            super(2, continuation);
            this.$pendingOrdersToDelete = list;
            this.this$0 = equityTradeLadderDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158173 c158173 = new C158173(this.$pendingOrdersToDelete, this.this$0, continuation);
            c158173.L$0 = obj;
            return c158173;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158173) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:19:0x006f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Iterator it;
            EquityTradeLadderDuxo equityTradeLadderDuxo;
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                java.util.List<EquityPendingOrder6> list = this.$pendingOrdersToDelete;
                EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.this$0;
                coroutineScope = coroutineScope2;
                it = list.iterator();
                equityTradeLadderDuxo = equityTradeLadderDuxo2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Order order = (Order) this.L$3;
                it = (Iterator) this.L$2;
                equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$cancelOrder$3$1$2$1(order, null));
                } else {
                    equityTradeLadderDuxo.applyMutation(new EquityTradeLadderDuxo$cancelOrder$3$1$3$1(order, null));
                    if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                        equityTradeLadderDuxo.submit(new EquityTradeLadderEvent.ApiOrNetworkError(thM28553exceptionOrNullimpl));
                    } else {
                        CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                    }
                }
                if (it.hasNext()) {
                    order = ((EquityPendingOrder6) it.next()).getOrder();
                    Result.Companion companion2 = Result.INSTANCE;
                    long j = EquityTradeLadderDuxo.TIMEOUT;
                    EquityTradeLadderDuxo$cancelOrder$3$1$1$1 equityTradeLadderDuxo$cancelOrder$3$1$1$1 = new EquityTradeLadderDuxo$cancelOrder$3$1$1$1(equityTradeLadderDuxo, order, null);
                    this.L$0 = coroutineScope;
                    this.L$1 = equityTradeLadderDuxo;
                    this.L$2 = it;
                    this.L$3 = order;
                    this.label = 1;
                    if (Timeout6.m28789withTimeoutKLykuaI(j, equityTradeLadderDuxo$cancelOrder$3$1$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                    Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl2 != null) {
                    }
                    if (it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final void replaceOrder(EquityTradeLadderDataState state) {
        java.util.List<LadderState.LadderData.UiPendingOrder> orders;
        LadderState.LadderData.UiPendingOrder uiPendingOrder;
        UUID id;
        Order order;
        Integer orderDraggedOverIndex;
        withDataState(new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityTradeLadderDuxo.replaceOrder$lambda$20(this.f$0, (EquityTradeLadderDataState) obj);
            }
        });
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = state.getSelectedPendingOrders();
        if (selectedPendingOrders == null || (orders = selectedPendingOrders.getOrders()) == null || (uiPendingOrder = (LadderState.LadderData.UiPendingOrder) CollectionsKt.firstOrNull((java.util.List) orders)) == null || (id = uiPendingOrder.getId()) == null) {
            return;
        }
        EquityPendingOrder3 equityPendingOrder3 = state.getUiPendingOrdersMap().get(id);
        EquityPendingOrder6 equityPendingOrder6 = equityPendingOrder3 instanceof EquityPendingOrder6 ? (EquityPendingOrder6) equityPendingOrder3 : null;
        if (equityPendingOrder6 == null || (order = equityPendingOrder6.getOrder()) == null || (orderDraggedOverIndex = state.getOrderDraggedOverIndex()) == null) {
            return;
        }
        int iIntValue = orderDraggedOverIndex.intValue();
        LadderPriceLevels ladderPriceLevels = state.getLadderPriceLevels();
        BigDecimal price = ladderPriceLevels != null ? ladderPriceLevels.getPrice(iIntValue) : null;
        if (price == null) {
            return;
        }
        submit(new EquityTradeLadderEvent.HapticFeedbacks(16));
        applyMutation(new C158582(id, price, order, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C158593(state, id, order, price, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceOrder$lambda$20(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(equityTradeLadderDuxo.eventLogger, new UserInteractionEventData(null, equityTradeLadderDuxo.ladderScreen, null, UserInteractionEventData.Action.LADDER_MODIFY_ORDER, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ds.getEquitiesLadderContext(), null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16127, null), null, null, 101, null), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$2 */
    static final class C158582 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        final /* synthetic */ Order $pendingOrder;
        final /* synthetic */ BigDecimal $targetPrice;
        final /* synthetic */ UUID $toBeReplacedOrderId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158582(UUID uuid, BigDecimal bigDecimal, Order order, Continuation<? super C158582> continuation) {
            super(2, continuation);
            this.$toBeReplacedOrderId = uuid;
            this.$targetPrice = bigDecimal;
            this.$pendingOrder = order;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158582 c158582 = new C158582(this.$toBeReplacedOrderId, this.$targetPrice, this.$pendingOrder, continuation);
            c158582.L$0 = obj;
            return c158582;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158582) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
            EquityTradeLadderDataState equityTradeLadderDataStateCopyToClearSelectionState = equityTradeLadderDataState.copyToClearSelectionState();
            Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
            UUID uuid = this.$toBeReplacedOrderId;
            uiPendingOrdersMap.put(uuid, new PendingReplacedOrder(uuid, this.$targetPrice, this.$pendingOrder));
            return EquityTradeLadderDataState.copy$default(equityTradeLadderDataStateCopyToClearSelectionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 267124735, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2153}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$3 */
    static final class C158593 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Order $pendingOrder;
        final /* synthetic */ EquityTradeLadderDataState $state;
        final /* synthetic */ BigDecimal $targetPrice;
        final /* synthetic */ UUID $toBeReplacedOrderId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158593(EquityTradeLadderDataState equityTradeLadderDataState, UUID uuid, Order order, BigDecimal bigDecimal, Continuation<? super C158593> continuation) {
            super(2, continuation);
            this.$state = equityTradeLadderDataState;
            this.$toBeReplacedOrderId = uuid;
            this.$pendingOrder = order;
            this.$targetPrice = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityTradeLadderDuxo.this.new C158593(this.$state, this.$toBeReplacedOrderId, this.$pendingOrder, this.$targetPrice, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C158593) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objValidateAndSubmit;
            EquityTradeLadderDuxo equityTradeLadderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityLadderOrderState orderState = ((EquityTradeLadderViewState) EquityTradeLadderDuxo.this.getStateFlow().getValue()).getOrderState();
                if (orderState != null && this.$state.getAccount() != null && this.$state.getMarketHours() != null) {
                    EquityOrderIntent equityOrderIntent$default = EquityLadderOrderState2.toEquityOrderIntent$default(orderState, this.$toBeReplacedOrderId, this.$pendingOrder.getSide(), this.$pendingOrder.getPrice() != null ? this.$targetPrice : null, this.$pendingOrder.getStopPrice() != null ? this.$targetPrice : null, this.$pendingOrder, CollectionsKt.emptyList(), null, null, this.$pendingOrder.getQuantity(), 192, null);
                    EquityTradeLadderDuxo equityTradeLadderDuxo2 = EquityTradeLadderDuxo.this;
                    EquityTradeService equityTradeService = equityTradeLadderDuxo2.equityTradeService;
                    this.L$0 = equityTradeLadderDuxo2;
                    this.label = 1;
                    objValidateAndSubmit = equityTradeService.validateAndSubmit(equityOrderIntent$default, this);
                    if (objValidateAndSubmit == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    equityTradeLadderDuxo = equityTradeLadderDuxo2;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            objValidateAndSubmit = obj;
            equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) objValidateAndSubmit);
            EquityTradeLadderDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityTradeLadderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$3$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$replaceOrder$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
                return ((AnonymousClass1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, true, false, false, false, false, false, false, false, -1, 267386879, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelOrdersFallback(String accountNumber, Set<UUID> orderIds) {
        Iterator<T> it = orderIds.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), Dispatchers.getIO(), null, new EquityTradeLadderDuxo$cancelOrdersFallback$1$1(this, (UUID) it.next(), accountNumber, null), 2, null);
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo$LadderPriceLevelData;", "", "l2Data", "Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;", "qbboData", "Lcom/robinhood/websocket/md/models/MdFeedData$Quote;", "mdQuote", "Lcom/robinhood/models/db/Quote;", "l2KillSwitchEnabled", "", "intervalLevels", "", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;Lcom/robinhood/websocket/md/models/MdFeedData$Quote;Lcom/robinhood/models/db/Quote;ZLjava/util/List;)V", "getL2Data", "()Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;", "getQbboData", "()Lcom/robinhood/websocket/md/models/MdFeedData$Quote;", "getMdQuote", "()Lcom/robinhood/models/db/Quote;", "getL2KillSwitchEnabled", "()Z", "getIntervalLevels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LadderPriceLevelData {
        public static final int $stable = 8;
        private final java.util.List<BigDecimal> intervalLevels;
        private final MdFeedData.L2Data l2Data;
        private final boolean l2KillSwitchEnabled;
        private final Quote mdQuote;
        private final MdFeedData.Quote qbboData;

        public static /* synthetic */ LadderPriceLevelData copy$default(LadderPriceLevelData ladderPriceLevelData, MdFeedData.L2Data l2Data, MdFeedData.Quote quote, Quote quote2, boolean z, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                l2Data = ladderPriceLevelData.l2Data;
            }
            if ((i & 2) != 0) {
                quote = ladderPriceLevelData.qbboData;
            }
            if ((i & 4) != 0) {
                quote2 = ladderPriceLevelData.mdQuote;
            }
            if ((i & 8) != 0) {
                z = ladderPriceLevelData.l2KillSwitchEnabled;
            }
            if ((i & 16) != 0) {
                list = ladderPriceLevelData.intervalLevels;
            }
            java.util.List list2 = list;
            Quote quote3 = quote2;
            return ladderPriceLevelData.copy(l2Data, quote, quote3, z, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final MdFeedData.L2Data getL2Data() {
            return this.l2Data;
        }

        /* renamed from: component2, reason: from getter */
        public final MdFeedData.Quote getQbboData() {
            return this.qbboData;
        }

        /* renamed from: component3, reason: from getter */
        public final Quote getMdQuote() {
            return this.mdQuote;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getL2KillSwitchEnabled() {
            return this.l2KillSwitchEnabled;
        }

        public final java.util.List<BigDecimal> component5() {
            return this.intervalLevels;
        }

        public final LadderPriceLevelData copy(MdFeedData.L2Data l2Data, MdFeedData.Quote qbboData, Quote mdQuote, boolean l2KillSwitchEnabled, java.util.List<? extends BigDecimal> intervalLevels) {
            Intrinsics.checkNotNullParameter(mdQuote, "mdQuote");
            return new LadderPriceLevelData(l2Data, qbboData, mdQuote, l2KillSwitchEnabled, intervalLevels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderPriceLevelData)) {
                return false;
            }
            LadderPriceLevelData ladderPriceLevelData = (LadderPriceLevelData) other;
            return Intrinsics.areEqual(this.l2Data, ladderPriceLevelData.l2Data) && Intrinsics.areEqual(this.qbboData, ladderPriceLevelData.qbboData) && Intrinsics.areEqual(this.mdQuote, ladderPriceLevelData.mdQuote) && this.l2KillSwitchEnabled == ladderPriceLevelData.l2KillSwitchEnabled && Intrinsics.areEqual(this.intervalLevels, ladderPriceLevelData.intervalLevels);
        }

        public int hashCode() {
            MdFeedData.L2Data l2Data = this.l2Data;
            int iHashCode = (l2Data == null ? 0 : l2Data.hashCode()) * 31;
            MdFeedData.Quote quote = this.qbboData;
            int iHashCode2 = (((((iHashCode + (quote == null ? 0 : quote.hashCode())) * 31) + this.mdQuote.hashCode()) * 31) + Boolean.hashCode(this.l2KillSwitchEnabled)) * 31;
            java.util.List<BigDecimal> list = this.intervalLevels;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "LadderPriceLevelData(l2Data=" + this.l2Data + ", qbboData=" + this.qbboData + ", mdQuote=" + this.mdQuote + ", l2KillSwitchEnabled=" + this.l2KillSwitchEnabled + ", intervalLevels=" + this.intervalLevels + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LadderPriceLevelData(MdFeedData.L2Data l2Data, MdFeedData.Quote quote, Quote mdQuote, boolean z, java.util.List<? extends BigDecimal> list) {
            Intrinsics.checkNotNullParameter(mdQuote, "mdQuote");
            this.l2Data = l2Data;
            this.qbboData = quote;
            this.mdQuote = mdQuote;
            this.l2KillSwitchEnabled = z;
            this.intervalLevels = list;
        }

        public final MdFeedData.L2Data getL2Data() {
            return this.l2Data;
        }

        public final MdFeedData.Quote getQbboData() {
            return this.qbboData;
        }

        public final Quote getMdQuote() {
            return this.mdQuote;
        }

        public final boolean getL2KillSwitchEnabled() {
            return this.l2KillSwitchEnabled;
        }

        public final java.util.List<BigDecimal> getIntervalLevels() {
            return this.intervalLevels;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "Lcom/robinhood/android/equities/contracts/tradeladder/EquityTradeLadderFragmentKey;", "<init>", "()V", "TIMEOUT", "Lkotlin/time/Duration;", "J", "ONE_SECOND", "", "FLATTEN_TIMEOUT", EquityTradeLadderDuxo.EQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY, "", "getEQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY$annotations", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityTradeLadderDuxo, EquityTradeLadderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEQUITIES_LADDER_FTUX_SAVED_STATE_HANDLE_KEY$annotations() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityTradeLadderFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EquityTradeLadderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityTradeLadderFragmentKey getArgs(EquityTradeLadderDuxo equityTradeLadderDuxo) {
            return (EquityTradeLadderFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, equityTradeLadderDuxo);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        TIMEOUT = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
    }
}
