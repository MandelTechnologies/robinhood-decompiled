package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCurrencyUtils;
import com.robinhood.android.transfers.p271ui.max.i18n.ToCurrencyConversionData;
import com.robinhood.android.transfers.p271ui.max.i18n.TransferMode;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.brokerage.Securities;
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
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: UkQueuedDepositDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b-\u0010 J\u0090\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010&R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b\u0010\u0010 R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b\u0011\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010*R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010,R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b\u0016\u0010 R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u001aR\u0013\u0010P\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010\u001cR\u0011\u0010Q\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010 R\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "", "Lcom/robinhood/models/util/Money;", "amount", "", "inputChars", "Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "mode", "", "animateInput", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "fxQuote", "j$/time/Instant", "lastUpdatedFxQuoteTime", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "disclosureResponse", "isCreatingTransfer", "isFetchingMandateStatus", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "pendingPostTransferPage", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "entryPoint", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;ZLcom/robinhood/models/fx/api/ApiFxQuote;Lj$/time/Instant;Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;ZZLcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;Z)V", "component1", "()Lcom/robinhood/models/util/Money;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "component4", "()Z", "component5", "()Lcom/robinhood/models/fx/api/ApiFxQuote;", "component6", "()Lj$/time/Instant;", "component7", "()Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "component8", "component9", "component10", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "component11", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "component12", "copy", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;ZLcom/robinhood/models/fx/api/ApiFxQuote;Lj$/time/Instant;Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;ZZLcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;Z)Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/util/Money;", "getAmount", "Ljava/lang/String;", "getInputChars", "Lcom/robinhood/android/transfers/ui/max/i18n/TransferMode;", "getMode", "Z", "getAnimateInput", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "getFxQuote", "Lj$/time/Instant;", "getLastUpdatedFxQuoteTime", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "getDisclosureResponse", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "getPendingPostTransferPage", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "getEntryPoint", "Lcom/robinhood/utils/resource/StringResource;", "getExpectedExchangeRate", "()Lcom/robinhood/utils/resource/StringResource;", "expectedExchangeRate", "getExpectedValue", "expectedValue", "getFormattedLastUpdatedFxQuote", "formattedLastUpdatedFxQuote", "isCreatingTransferOrFetchingMandateStatus", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getUserInteractionEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "userInteractionEventDescriptor", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class UkQueuedDepositDataState {
    public static final int $stable = 8;
    private final Money amount;
    private final boolean animateInput;
    private final ApiDisclosureUIResponse disclosureResponse;
    private final QueuedDepositContext.EntryPoint entryPoint;
    private final ApiFxQuote fxQuote;
    private final String inputChars;
    private final boolean isCreatingTransfer;
    private final boolean isFetchingMandateStatus;
    private final boolean isMcwEnabled;
    private final Instant lastUpdatedFxQuoteTime;
    private final TransferMode mode;
    private final UiPostTransferPage.UkQueuedDeposit pendingPostTransferPage;

    public static /* synthetic */ UkQueuedDepositDataState copy$default(UkQueuedDepositDataState ukQueuedDepositDataState, Money money, String str, TransferMode transferMode, boolean z, ApiFxQuote apiFxQuote, Instant instant, ApiDisclosureUIResponse apiDisclosureUIResponse, boolean z2, boolean z3, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, QueuedDepositContext.EntryPoint entryPoint, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            money = ukQueuedDepositDataState.amount;
        }
        if ((i & 2) != 0) {
            str = ukQueuedDepositDataState.inputChars;
        }
        if ((i & 4) != 0) {
            transferMode = ukQueuedDepositDataState.mode;
        }
        if ((i & 8) != 0) {
            z = ukQueuedDepositDataState.animateInput;
        }
        if ((i & 16) != 0) {
            apiFxQuote = ukQueuedDepositDataState.fxQuote;
        }
        if ((i & 32) != 0) {
            instant = ukQueuedDepositDataState.lastUpdatedFxQuoteTime;
        }
        if ((i & 64) != 0) {
            apiDisclosureUIResponse = ukQueuedDepositDataState.disclosureResponse;
        }
        if ((i & 128) != 0) {
            z2 = ukQueuedDepositDataState.isCreatingTransfer;
        }
        if ((i & 256) != 0) {
            z3 = ukQueuedDepositDataState.isFetchingMandateStatus;
        }
        if ((i & 512) != 0) {
            ukQueuedDeposit = ukQueuedDepositDataState.pendingPostTransferPage;
        }
        if ((i & 1024) != 0) {
            entryPoint = ukQueuedDepositDataState.entryPoint;
        }
        if ((i & 2048) != 0) {
            z4 = ukQueuedDepositDataState.isMcwEnabled;
        }
        QueuedDepositContext.EntryPoint entryPoint2 = entryPoint;
        boolean z5 = z4;
        boolean z6 = z3;
        UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit2 = ukQueuedDeposit;
        ApiDisclosureUIResponse apiDisclosureUIResponse2 = apiDisclosureUIResponse;
        boolean z7 = z2;
        ApiFxQuote apiFxQuote2 = apiFxQuote;
        Instant instant2 = instant;
        return ukQueuedDepositDataState.copy(money, str, transferMode, z, apiFxQuote2, instant2, apiDisclosureUIResponse2, z7, z6, ukQueuedDeposit2, entryPoint2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component10, reason: from getter */
    public final UiPostTransferPage.UkQueuedDeposit getPendingPostTransferPage() {
        return this.pendingPostTransferPage;
    }

    /* renamed from: component11, reason: from getter */
    public final QueuedDepositContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsMcwEnabled() {
        return this.isMcwEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputChars() {
        return this.inputChars;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferMode getMode() {
        return this.mode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getLastUpdatedFxQuoteTime() {
        return this.lastUpdatedFxQuoteTime;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiDisclosureUIResponse getDisclosureResponse() {
        return this.disclosureResponse;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFetchingMandateStatus() {
        return this.isFetchingMandateStatus;
    }

    public final UkQueuedDepositDataState copy(Money amount, String inputChars, TransferMode mode, boolean animateInput, ApiFxQuote fxQuote, Instant lastUpdatedFxQuoteTime, ApiDisclosureUIResponse disclosureResponse, boolean isCreatingTransfer, boolean isFetchingMandateStatus, UiPostTransferPage.UkQueuedDeposit pendingPostTransferPage, QueuedDepositContext.EntryPoint entryPoint, boolean isMcwEnabled) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new UkQueuedDepositDataState(amount, inputChars, mode, animateInput, fxQuote, lastUpdatedFxQuoteTime, disclosureResponse, isCreatingTransfer, isFetchingMandateStatus, pendingPostTransferPage, entryPoint, isMcwEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkQueuedDepositDataState)) {
            return false;
        }
        UkQueuedDepositDataState ukQueuedDepositDataState = (UkQueuedDepositDataState) other;
        return Intrinsics.areEqual(this.amount, ukQueuedDepositDataState.amount) && Intrinsics.areEqual(this.inputChars, ukQueuedDepositDataState.inputChars) && this.mode == ukQueuedDepositDataState.mode && this.animateInput == ukQueuedDepositDataState.animateInput && Intrinsics.areEqual(this.fxQuote, ukQueuedDepositDataState.fxQuote) && Intrinsics.areEqual(this.lastUpdatedFxQuoteTime, ukQueuedDepositDataState.lastUpdatedFxQuoteTime) && Intrinsics.areEqual(this.disclosureResponse, ukQueuedDepositDataState.disclosureResponse) && this.isCreatingTransfer == ukQueuedDepositDataState.isCreatingTransfer && this.isFetchingMandateStatus == ukQueuedDepositDataState.isFetchingMandateStatus && Intrinsics.areEqual(this.pendingPostTransferPage, ukQueuedDepositDataState.pendingPostTransferPage) && this.entryPoint == ukQueuedDepositDataState.entryPoint && this.isMcwEnabled == ukQueuedDepositDataState.isMcwEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((((this.amount.hashCode() * 31) + this.inputChars.hashCode()) * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.animateInput)) * 31;
        ApiFxQuote apiFxQuote = this.fxQuote;
        int iHashCode2 = (iHashCode + (apiFxQuote == null ? 0 : apiFxQuote.hashCode())) * 31;
        Instant instant = this.lastUpdatedFxQuoteTime;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        ApiDisclosureUIResponse apiDisclosureUIResponse = this.disclosureResponse;
        int iHashCode4 = (((((iHashCode3 + (apiDisclosureUIResponse == null ? 0 : apiDisclosureUIResponse.hashCode())) * 31) + Boolean.hashCode(this.isCreatingTransfer)) * 31) + Boolean.hashCode(this.isFetchingMandateStatus)) * 31;
        UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit = this.pendingPostTransferPage;
        return ((((iHashCode4 + (ukQueuedDeposit != null ? ukQueuedDeposit.hashCode() : 0)) * 31) + this.entryPoint.hashCode()) * 31) + Boolean.hashCode(this.isMcwEnabled);
    }

    public String toString() {
        return "UkQueuedDepositDataState(amount=" + this.amount + ", inputChars=" + this.inputChars + ", mode=" + this.mode + ", animateInput=" + this.animateInput + ", fxQuote=" + this.fxQuote + ", lastUpdatedFxQuoteTime=" + this.lastUpdatedFxQuoteTime + ", disclosureResponse=" + this.disclosureResponse + ", isCreatingTransfer=" + this.isCreatingTransfer + ", isFetchingMandateStatus=" + this.isFetchingMandateStatus + ", pendingPostTransferPage=" + this.pendingPostTransferPage + ", entryPoint=" + this.entryPoint + ", isMcwEnabled=" + this.isMcwEnabled + ")";
    }

    public UkQueuedDepositDataState(Money amount, String inputChars, TransferMode mode, boolean z, ApiFxQuote apiFxQuote, Instant instant, ApiDisclosureUIResponse apiDisclosureUIResponse, boolean z2, boolean z3, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, QueuedDepositContext.EntryPoint entryPoint, boolean z4) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.amount = amount;
        this.inputChars = inputChars;
        this.mode = mode;
        this.animateInput = z;
        this.fxQuote = apiFxQuote;
        this.lastUpdatedFxQuoteTime = instant;
        this.disclosureResponse = apiDisclosureUIResponse;
        this.isCreatingTransfer = z2;
        this.isFetchingMandateStatus = z3;
        this.pendingPostTransferPage = ukQueuedDeposit;
        this.entryPoint = entryPoint;
        this.isMcwEnabled = z4;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getInputChars() {
        return this.inputChars;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UkQueuedDepositDataState(com.robinhood.models.util.Money r16, java.lang.String r17, com.robinhood.android.transfers.p271ui.max.i18n.TransferMode r18, boolean r19, com.robinhood.models.p325fx.api.ApiFxQuote r20, p479j$.time.Instant r21, com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse r22, boolean r23, boolean r24, com.robinhood.models.p355ui.bonfire.UiPostTransferPage.UkQueuedDeposit r25, com.robinhood.rosetta.eventlogging.QueuedDepositContext.EntryPoint r26, boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 4
            if (r1 == 0) goto La
            com.robinhood.android.transfers.ui.max.i18n.TransferMode r1 = com.robinhood.android.transfers.p271ui.max.i18n.TransferMode.EDIT
            r5 = r1
            goto Lc
        La:
            r5 = r18
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r19
        L15:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L1c
            r7 = r3
            goto L1e
        L1c:
            r7 = r20
        L1e:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r8 = r3
            goto L26
        L24:
            r8 = r21
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2c
            r9 = r3
            goto L2e
        L2c:
            r9 = r22
        L2e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L34
            r10 = r2
            goto L36
        L34:
            r10 = r23
        L36:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3c
            r11 = r2
            goto L3e
        L3c:
            r11 = r24
        L3e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L44
            r12 = r3
            goto L46
        L44:
            r12 = r25
        L46:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L53
            r14 = r2
            r3 = r16
            r4 = r17
            r13 = r26
            r2 = r15
            goto L5c
        L53:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r13 = r26
        L5c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositDataState.<init>(com.robinhood.models.util.Money, java.lang.String, com.robinhood.android.transfers.ui.max.i18n.TransferMode, boolean, com.robinhood.models.fx.api.ApiFxQuote, j$.time.Instant, com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse, boolean, boolean, com.robinhood.models.ui.bonfire.UiPostTransferPage$UkQueuedDeposit, com.robinhood.rosetta.eventlogging.QueuedDepositContext$EntryPoint, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final TransferMode getMode() {
        return this.mode;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final ApiFxQuote getFxQuote() {
        return this.fxQuote;
    }

    public final Instant getLastUpdatedFxQuoteTime() {
        return this.lastUpdatedFxQuoteTime;
    }

    public final ApiDisclosureUIResponse getDisclosureResponse() {
        return this.disclosureResponse;
    }

    public final boolean isCreatingTransfer() {
        return this.isCreatingTransfer;
    }

    public final boolean isFetchingMandateStatus() {
        return this.isFetchingMandateStatus;
    }

    public final UiPostTransferPage.UkQueuedDeposit getPendingPostTransferPage() {
        return this.pendingPostTransferPage;
    }

    public final QueuedDepositContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean isMcwEnabled() {
        return this.isMcwEnabled;
    }

    public final StringResource getExpectedExchangeRate() {
        ApiFxQuote apiFxQuote = this.fxQuote;
        if (apiFxQuote != null) {
            Currency currency = Currencies.GBP;
            TransferDirection transferDirection = TransferDirection.DEPOSIT;
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            Money moneyConvertAmount = InternationalTransferCurrencyUtils.convertAmount(currency, transferDirection, new Money(currency, ONE), apiFxQuote);
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C30065R.string.default_fx_rate_symbol, "£1", "$" + moneyConvertAmount.getDecimalValue());
            if (stringResourceInvoke != null) {
                return stringResourceInvoke;
            }
        }
        return StringResource.INSTANCE.invoke(C30065R.string.fx_unavailable, new Object[0]);
    }

    public final Money getExpectedValue() {
        Money moneyConvertAmount;
        ApiFxQuote apiFxQuote = this.fxQuote;
        return (apiFxQuote == null || (moneyConvertAmount = InternationalTransferCurrencyUtils.convertAmount(Currencies.GBP, TransferDirection.DEPOSIT, this.amount, apiFxQuote)) == null) ? this.amount : moneyConvertAmount;
    }

    public final String getFormattedLastUpdatedFxQuote() {
        Instant instant = this.lastUpdatedFxQuoteTime;
        if (instant != null) {
            return InstantFormatter.LONG_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) instant);
        }
        return null;
    }

    public final boolean isCreatingTransferOrFetchingMandateStatus() {
        return this.isCreatingTransfer || this.isFetchingMandateStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        Screen screen = new Screen(Screen.Name.CREATE_QUEUED_DEPOSIT, null, null, null, 14, null);
        com.robinhood.rosetta.eventlogging.Money protobuf = Securities.toProtobuf(this.amount);
        QueuedDepositContext.EntryPoint entryPoint = this.entryPoint;
        int i = 61;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        MAXTransferContext.TransferAccount.ACHTransferAccountMetadata aCHTransferAccountMetadata = null;
        com.robinhood.rosetta.common.Currency currency = null;
        String str2 = null;
        ByteString byteString = null;
        MAXTransferContext.TransferAccount transferAccount = new MAXTransferContext.TransferAccount(str, MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT, aCHTransferAccountMetadata, currency, str2, byteString, i, defaultConstructorMarker);
        MAXTransferContext.TransferAccount transferAccount2 = new MAXTransferContext.TransferAccount(str, MAXTransferContext.TransferAccount.TransferAccountType.RHS, aCHTransferAccountMetadata, currency, str2, byteString, i, defaultConstructorMarker);
        ApiFxQuote apiFxQuote = this.fxQuote;
        MAXTransferContext.CurrencyConversionData currencyConversionData = apiFxQuote != null ? ToCurrencyConversionData.toCurrencyConversionData(apiFxQuote, Currencies.GBP, this.amount, TransferDirection.DEPOSIT) : null;
        QueuedDepositContext.AdditionalData additionalData = null;
        ByteString byteString2 = null;
        String str3 = CountryCode.COUNTRY_CODE_GB;
        Screen screen2 = null;
        String str4 = null;
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
        String str5 = null;
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
        String str6 = null;
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
        ByteString byteString3 = null;
        int i2 = -1;
        int i3 = -524289;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        return new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, screen2, str4, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str5, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, new QueuedDepositContext(protobuf, str3, transferAccount, transferAccount2, currencyConversionData, additionalData, entryPoint, byteString2, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null), rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str6, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString3, i2, i3, i4, i5, i6, i7, 16383, null), null, null, 53, null);
    }
}
