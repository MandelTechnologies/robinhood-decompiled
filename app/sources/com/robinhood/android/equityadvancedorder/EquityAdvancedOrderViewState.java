package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderNumpadButtonState;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
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
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import okio.ByteString;
import rosetta.account.ManagementType;

/* compiled from: EquityAdvancedOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u0007\u0012\b\b\u0002\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÂ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u000bHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010}\u001a\u00020\u0007HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0014HÆ\u0003J\u0012\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0007HÂ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0007HÂ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0007HÆ\u0003Jâ\u0002\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00052\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0007HÆ\u0001J\u0015\u0010\u0096\u0001\u001a\u00020\u00072\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0098\u0001\u001a\u00030\u0099\u0001HÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010?R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010?R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010?R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00107R\u0011\u0010$\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010?R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010)\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bU\u0010?R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u00107R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0011\u0010.\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bY\u0010?R\u0011\u0010/\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010?R\u0011\u00100\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u0010?R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010?R\u0013\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010a\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0016\u0010k\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u00107R\u0014\u0010m\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010?R\u0019\u0010o\u001a\n\u0018\u00010pj\u0004\u0018\u0001`q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0013\u0010t\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bu\u00107¨\u0006\u009b\u0001"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;", "", "accountNumber", "", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "isKeyboardVisible", "", "numberOfSharesString", "limitPriceString", "editMode", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "editingField", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "loadingAccountSwitcher", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "marketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "rowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "checkOverrides", "", "bottomSheetState", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "tooltipWillBeShown", "primaryButtonEnabled", "primaryButtonLoading", "isShortPosition", "isReplaceOrder", "primaryButtonText", "advancedOrderSubmissionExperimentMember", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "showTextButton", "textButtonText", "sessionChangeAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "showOvernightShortAlert", "disableChangingOrderTypeForBuyToCloseSubOneSharePosition", "disableChangingOrderTypeForShortSaleAfterHours", "showTwentyFourHourButton", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trading/contracts/configuration/EditMode;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;ZLcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/equity/validation/EquityOrderContext;Ljava/util/List;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;ZZZZZLcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/models/db/OrderPositionEffect;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZZZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getNumberOfSharesString", "getLimitPriceString", "getEditMode", "()Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "getEditingField", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getLoadingAccountSwitcher", "()Z", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getCheckOverrides", "()Ljava/util/List;", "getBottomSheetState", "()Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "getTooltipWillBeShown", "getPrimaryButtonText", "getAdvancedOrderSubmissionExperimentMember", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getShowTextButton", "getTextButtonText", "getSessionChangeAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getShowOvernightShortAlert", "getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition", "getDisableChangingOrderTypeForShortSaleAfterHours", "getShowTwentyFourHourButton", "sharesQuantity", "Ljava/math/BigDecimal;", "getSharesQuantity", "()Ljava/math/BigDecimal;", "numpadState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;", "getNumpadState", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;", "textButtonState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;", "getTextButtonState", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadButtonState;", "primaryButtonState", "getPrimaryButtonState", "footerTextMarkdown", "getFooterTextMarkdown", "showKeyboardDelimiter", "getShowKeyboardDelimiter", "loggingEquityOrderContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingEquityOrderContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "toolbarTitle", "getToolbarTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "equals", "other", "hashCode", "", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityAdvancedOrderViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final InstrumentAccountSwitcherState accountSwitcherState;
    private final StringResource actionOrderTypeHeaderLabel;
    private final boolean advancedOrderSubmissionExperimentMember;
    private final EquityAdvancedOrderBottomSheetState bottomSheetState;
    private final List<String> checkOverrides;
    private final boolean disableChangingOrderTypeForBuyToCloseSubOneSharePosition;
    private final boolean disableChangingOrderTypeForShortSaleAfterHours;
    private final EquityOrderConfiguration2 editMode;
    private final EditingField editingField;
    private final EquityOrderContext equityOrderContext;
    private final boolean isKeyboardVisible;
    private final boolean isReplaceOrder;
    private final boolean isShortPosition;
    private final String limitPriceString;
    private final boolean loadingAccountSwitcher;
    private final OrderMarketHours marketHours;
    private final String numberOfSharesString;
    private final OrderForm6 orderFormState;
    private final OrderPositionEffect positionEffect;
    private final boolean primaryButtonEnabled;
    private final boolean primaryButtonLoading;
    private final StringResource primaryButtonText;
    private final ImmutableList<EquityOrderFormRowState> rowStates;
    private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
    private final boolean showOvernightShortAlert;
    private final boolean showTextButton;
    private final boolean showTwentyFourHourButton;
    private final StringResource textButtonText;
    private final OrderTimeInForce timeInForce;
    private final boolean tooltipWillBeShown;

    /* compiled from: EquityAdvancedOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component17, reason: from getter */
    private final boolean getPrimaryButtonEnabled() {
        return this.primaryButtonEnabled;
    }

    /* renamed from: component18, reason: from getter */
    private final boolean getPrimaryButtonLoading() {
        return this.primaryButtonLoading;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsKeyboardVisible() {
        return this.isKeyboardVisible;
    }

    public static /* synthetic */ EquityAdvancedOrderViewState copy$default(EquityAdvancedOrderViewState equityAdvancedOrderViewState, String str, StringResource stringResource, boolean z, String str2, String str3, EquityOrderConfiguration2 equityOrderConfiguration2, EditingField editingField, boolean z2, InstrumentAccountSwitcherState instrumentAccountSwitcherState, OrderMarketHours orderMarketHours, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, EquityOrderContext equityOrderContext, List list, EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, StringResource stringResource2, boolean z8, OrderForm6 orderForm6, OrderPositionEffect orderPositionEffect, boolean z9, StringResource stringResource3, GenericAlertContent genericAlertContent, boolean z10, boolean z11, boolean z12, boolean z13, int i, Object obj) {
        boolean z14;
        boolean z15;
        String str4 = (i & 1) != 0 ? equityAdvancedOrderViewState.accountNumber : str;
        StringResource stringResource4 = (i & 2) != 0 ? equityAdvancedOrderViewState.actionOrderTypeHeaderLabel : stringResource;
        boolean z16 = (i & 4) != 0 ? equityAdvancedOrderViewState.isKeyboardVisible : z;
        String str5 = (i & 8) != 0 ? equityAdvancedOrderViewState.numberOfSharesString : str2;
        String str6 = (i & 16) != 0 ? equityAdvancedOrderViewState.limitPriceString : str3;
        EquityOrderConfiguration2 equityOrderConfiguration22 = (i & 32) != 0 ? equityAdvancedOrderViewState.editMode : equityOrderConfiguration2;
        EditingField editingField2 = (i & 64) != 0 ? equityAdvancedOrderViewState.editingField : editingField;
        boolean z17 = (i & 128) != 0 ? equityAdvancedOrderViewState.loadingAccountSwitcher : z2;
        InstrumentAccountSwitcherState instrumentAccountSwitcherState2 = (i & 256) != 0 ? equityAdvancedOrderViewState.accountSwitcherState : instrumentAccountSwitcherState;
        OrderMarketHours orderMarketHours2 = (i & 512) != 0 ? equityAdvancedOrderViewState.marketHours : orderMarketHours;
        OrderTimeInForce orderTimeInForce2 = (i & 1024) != 0 ? equityAdvancedOrderViewState.timeInForce : orderTimeInForce;
        ImmutableList immutableList2 = (i & 2048) != 0 ? equityAdvancedOrderViewState.rowStates : immutableList;
        EquityOrderContext equityOrderContext2 = (i & 4096) != 0 ? equityAdvancedOrderViewState.equityOrderContext : equityOrderContext;
        List list2 = (i & 8192) != 0 ? equityAdvancedOrderViewState.checkOverrides : list;
        String str7 = str4;
        EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState2 = (i & 16384) != 0 ? equityAdvancedOrderViewState.bottomSheetState : equityAdvancedOrderBottomSheetState;
        boolean z18 = (i & 32768) != 0 ? equityAdvancedOrderViewState.tooltipWillBeShown : z3;
        boolean z19 = (i & 65536) != 0 ? equityAdvancedOrderViewState.primaryButtonEnabled : z4;
        boolean z20 = (i & 131072) != 0 ? equityAdvancedOrderViewState.primaryButtonLoading : z5;
        boolean z21 = (i & 262144) != 0 ? equityAdvancedOrderViewState.isShortPosition : z6;
        boolean z22 = (i & 524288) != 0 ? equityAdvancedOrderViewState.isReplaceOrder : z7;
        StringResource stringResource5 = (i & 1048576) != 0 ? equityAdvancedOrderViewState.primaryButtonText : stringResource2;
        boolean z23 = (i & 2097152) != 0 ? equityAdvancedOrderViewState.advancedOrderSubmissionExperimentMember : z8;
        OrderForm6 orderForm62 = (i & 4194304) != 0 ? equityAdvancedOrderViewState.orderFormState : orderForm6;
        OrderPositionEffect orderPositionEffect2 = (i & 8388608) != 0 ? equityAdvancedOrderViewState.positionEffect : orderPositionEffect;
        boolean z24 = (i & 16777216) != 0 ? equityAdvancedOrderViewState.showTextButton : z9;
        StringResource stringResource6 = (i & 33554432) != 0 ? equityAdvancedOrderViewState.textButtonText : stringResource3;
        GenericAlertContent genericAlertContent2 = (i & 67108864) != 0 ? equityAdvancedOrderViewState.sessionChangeAlertContent : genericAlertContent;
        boolean z25 = (i & 134217728) != 0 ? equityAdvancedOrderViewState.showOvernightShortAlert : z10;
        boolean z26 = (i & 268435456) != 0 ? equityAdvancedOrderViewState.disableChangingOrderTypeForBuyToCloseSubOneSharePosition : z11;
        boolean z27 = (i & 536870912) != 0 ? equityAdvancedOrderViewState.disableChangingOrderTypeForShortSaleAfterHours : z12;
        if ((i & 1073741824) != 0) {
            z15 = z27;
            z14 = equityAdvancedOrderViewState.showTwentyFourHourButton;
        } else {
            z14 = z13;
            z15 = z27;
        }
        return equityAdvancedOrderViewState.copy(str7, stringResource4, z16, str5, str6, equityOrderConfiguration22, editingField2, z17, instrumentAccountSwitcherState2, orderMarketHours2, orderTimeInForce2, immutableList2, equityOrderContext2, list2, equityAdvancedOrderBottomSheetState2, z18, z19, z20, z21, z22, stringResource5, z23, orderForm62, orderPositionEffect2, z24, stringResource6, genericAlertContent2, z25, z26, z15, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final OrderMarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final ImmutableList<EquityOrderFormRowState> component12() {
        return this.rowStates;
    }

    /* renamed from: component13, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final List<String> component14() {
        return this.checkOverrides;
    }

    /* renamed from: component15, reason: from getter */
    public final EquityAdvancedOrderBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getTooltipWillBeShown() {
        return this.tooltipWillBeShown;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsShortPosition() {
        return this.isShortPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getActionOrderTypeHeaderLabel() {
        return this.actionOrderTypeHeaderLabel;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsReplaceOrder() {
        return this.isReplaceOrder;
    }

    /* renamed from: component21, reason: from getter */
    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getAdvancedOrderSubmissionExperimentMember() {
        return this.advancedOrderSubmissionExperimentMember;
    }

    /* renamed from: component23, reason: from getter */
    public final OrderForm6 getOrderFormState() {
        return this.orderFormState;
    }

    /* renamed from: component24, reason: from getter */
    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getShowTextButton() {
        return this.showTextButton;
    }

    /* renamed from: component26, reason: from getter */
    public final StringResource getTextButtonText() {
        return this.textButtonText;
    }

    public final GenericAlertContent<GenericAction> component27() {
        return this.sessionChangeAlertContent;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getShowOvernightShortAlert() {
        return this.showOvernightShortAlert;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition() {
        return this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getDisableChangingOrderTypeForShortSaleAfterHours() {
        return this.disableChangingOrderTypeForShortSaleAfterHours;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getShowTwentyFourHourButton() {
        return this.showTwentyFourHourButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNumberOfSharesString() {
        return this.numberOfSharesString;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLimitPriceString() {
        return this.limitPriceString;
    }

    /* renamed from: component6, reason: from getter */
    public final EquityOrderConfiguration2 getEditMode() {
        return this.editMode;
    }

    /* renamed from: component7, reason: from getter */
    public final EditingField getEditingField() {
        return this.editingField;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    /* renamed from: component9, reason: from getter */
    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }

    public final EquityAdvancedOrderViewState copy(String accountNumber, StringResource actionOrderTypeHeaderLabel, boolean isKeyboardVisible, String numberOfSharesString, String limitPriceString, EquityOrderConfiguration2 editMode, EditingField editingField, boolean loadingAccountSwitcher, InstrumentAccountSwitcherState accountSwitcherState, OrderMarketHours marketHours, OrderTimeInForce timeInForce, ImmutableList<? extends EquityOrderFormRowState> rowStates, EquityOrderContext equityOrderContext, List<String> checkOverrides, EquityAdvancedOrderBottomSheetState bottomSheetState, boolean tooltipWillBeShown, boolean primaryButtonEnabled, boolean primaryButtonLoading, boolean isShortPosition, boolean isReplaceOrder, StringResource primaryButtonText, boolean advancedOrderSubmissionExperimentMember, OrderForm6 orderFormState, OrderPositionEffect positionEffect, boolean showTextButton, StringResource textButtonText, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, boolean showOvernightShortAlert, boolean disableChangingOrderTypeForBuyToCloseSubOneSharePosition, boolean disableChangingOrderTypeForShortSaleAfterHours, boolean showTwentyFourHourButton) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(actionOrderTypeHeaderLabel, "actionOrderTypeHeaderLabel");
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(textButtonText, "textButtonText");
        return new EquityAdvancedOrderViewState(accountNumber, actionOrderTypeHeaderLabel, isKeyboardVisible, numberOfSharesString, limitPriceString, editMode, editingField, loadingAccountSwitcher, accountSwitcherState, marketHours, timeInForce, rowStates, equityOrderContext, checkOverrides, bottomSheetState, tooltipWillBeShown, primaryButtonEnabled, primaryButtonLoading, isShortPosition, isReplaceOrder, primaryButtonText, advancedOrderSubmissionExperimentMember, orderFormState, positionEffect, showTextButton, textButtonText, sessionChangeAlertContent, showOvernightShortAlert, disableChangingOrderTypeForBuyToCloseSubOneSharePosition, disableChangingOrderTypeForShortSaleAfterHours, showTwentyFourHourButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvancedOrderViewState)) {
            return false;
        }
        EquityAdvancedOrderViewState equityAdvancedOrderViewState = (EquityAdvancedOrderViewState) other;
        return Intrinsics.areEqual(this.accountNumber, equityAdvancedOrderViewState.accountNumber) && Intrinsics.areEqual(this.actionOrderTypeHeaderLabel, equityAdvancedOrderViewState.actionOrderTypeHeaderLabel) && this.isKeyboardVisible == equityAdvancedOrderViewState.isKeyboardVisible && Intrinsics.areEqual(this.numberOfSharesString, equityAdvancedOrderViewState.numberOfSharesString) && Intrinsics.areEqual(this.limitPriceString, equityAdvancedOrderViewState.limitPriceString) && this.editMode == equityAdvancedOrderViewState.editMode && this.editingField == equityAdvancedOrderViewState.editingField && this.loadingAccountSwitcher == equityAdvancedOrderViewState.loadingAccountSwitcher && Intrinsics.areEqual(this.accountSwitcherState, equityAdvancedOrderViewState.accountSwitcherState) && this.marketHours == equityAdvancedOrderViewState.marketHours && this.timeInForce == equityAdvancedOrderViewState.timeInForce && Intrinsics.areEqual(this.rowStates, equityAdvancedOrderViewState.rowStates) && Intrinsics.areEqual(this.equityOrderContext, equityAdvancedOrderViewState.equityOrderContext) && Intrinsics.areEqual(this.checkOverrides, equityAdvancedOrderViewState.checkOverrides) && Intrinsics.areEqual(this.bottomSheetState, equityAdvancedOrderViewState.bottomSheetState) && this.tooltipWillBeShown == equityAdvancedOrderViewState.tooltipWillBeShown && this.primaryButtonEnabled == equityAdvancedOrderViewState.primaryButtonEnabled && this.primaryButtonLoading == equityAdvancedOrderViewState.primaryButtonLoading && this.isShortPosition == equityAdvancedOrderViewState.isShortPosition && this.isReplaceOrder == equityAdvancedOrderViewState.isReplaceOrder && Intrinsics.areEqual(this.primaryButtonText, equityAdvancedOrderViewState.primaryButtonText) && this.advancedOrderSubmissionExperimentMember == equityAdvancedOrderViewState.advancedOrderSubmissionExperimentMember && this.orderFormState == equityAdvancedOrderViewState.orderFormState && this.positionEffect == equityAdvancedOrderViewState.positionEffect && this.showTextButton == equityAdvancedOrderViewState.showTextButton && Intrinsics.areEqual(this.textButtonText, equityAdvancedOrderViewState.textButtonText) && Intrinsics.areEqual(this.sessionChangeAlertContent, equityAdvancedOrderViewState.sessionChangeAlertContent) && this.showOvernightShortAlert == equityAdvancedOrderViewState.showOvernightShortAlert && this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition == equityAdvancedOrderViewState.disableChangingOrderTypeForBuyToCloseSubOneSharePosition && this.disableChangingOrderTypeForShortSaleAfterHours == equityAdvancedOrderViewState.disableChangingOrderTypeForShortSaleAfterHours && this.showTwentyFourHourButton == equityAdvancedOrderViewState.showTwentyFourHourButton;
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.actionOrderTypeHeaderLabel.hashCode()) * 31) + Boolean.hashCode(this.isKeyboardVisible)) * 31;
        String str = this.numberOfSharesString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.limitPriceString;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.editMode.hashCode()) * 31;
        EditingField editingField = this.editingField;
        int iHashCode4 = (((iHashCode3 + (editingField == null ? 0 : editingField.hashCode())) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
        InstrumentAccountSwitcherState instrumentAccountSwitcherState = this.accountSwitcherState;
        int iHashCode5 = (((((iHashCode4 + (instrumentAccountSwitcherState == null ? 0 : instrumentAccountSwitcherState.hashCode())) * 31) + this.marketHours.hashCode()) * 31) + this.timeInForce.hashCode()) * 31;
        ImmutableList<EquityOrderFormRowState> immutableList = this.rowStates;
        int iHashCode6 = (iHashCode5 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        int iHashCode7 = (((iHashCode6 + (equityOrderContext == null ? 0 : equityOrderContext.hashCode())) * 31) + this.checkOverrides.hashCode()) * 31;
        EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState = this.bottomSheetState;
        int iHashCode8 = (((((((((((((((((((((((iHashCode7 + (equityAdvancedOrderBottomSheetState == null ? 0 : equityAdvancedOrderBottomSheetState.hashCode())) * 31) + Boolean.hashCode(this.tooltipWillBeShown)) * 31) + Boolean.hashCode(this.primaryButtonEnabled)) * 31) + Boolean.hashCode(this.primaryButtonLoading)) * 31) + Boolean.hashCode(this.isShortPosition)) * 31) + Boolean.hashCode(this.isReplaceOrder)) * 31) + this.primaryButtonText.hashCode()) * 31) + Boolean.hashCode(this.advancedOrderSubmissionExperimentMember)) * 31) + this.orderFormState.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + Boolean.hashCode(this.showTextButton)) * 31) + this.textButtonText.hashCode()) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
        return ((((((((iHashCode8 + (genericAlertContent != null ? genericAlertContent.hashCode() : 0)) * 31) + Boolean.hashCode(this.showOvernightShortAlert)) * 31) + Boolean.hashCode(this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition)) * 31) + Boolean.hashCode(this.disableChangingOrderTypeForShortSaleAfterHours)) * 31) + Boolean.hashCode(this.showTwentyFourHourButton);
    }

    public String toString() {
        return "EquityAdvancedOrderViewState(accountNumber=" + this.accountNumber + ", actionOrderTypeHeaderLabel=" + this.actionOrderTypeHeaderLabel + ", isKeyboardVisible=" + this.isKeyboardVisible + ", numberOfSharesString=" + this.numberOfSharesString + ", limitPriceString=" + this.limitPriceString + ", editMode=" + this.editMode + ", editingField=" + this.editingField + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", accountSwitcherState=" + this.accountSwitcherState + ", marketHours=" + this.marketHours + ", timeInForce=" + this.timeInForce + ", rowStates=" + this.rowStates + ", equityOrderContext=" + this.equityOrderContext + ", checkOverrides=" + this.checkOverrides + ", bottomSheetState=" + this.bottomSheetState + ", tooltipWillBeShown=" + this.tooltipWillBeShown + ", primaryButtonEnabled=" + this.primaryButtonEnabled + ", primaryButtonLoading=" + this.primaryButtonLoading + ", isShortPosition=" + this.isShortPosition + ", isReplaceOrder=" + this.isReplaceOrder + ", primaryButtonText=" + this.primaryButtonText + ", advancedOrderSubmissionExperimentMember=" + this.advancedOrderSubmissionExperimentMember + ", orderFormState=" + this.orderFormState + ", positionEffect=" + this.positionEffect + ", showTextButton=" + this.showTextButton + ", textButtonText=" + this.textButtonText + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", showOvernightShortAlert=" + this.showOvernightShortAlert + ", disableChangingOrderTypeForBuyToCloseSubOneSharePosition=" + this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition + ", disableChangingOrderTypeForShortSaleAfterHours=" + this.disableChangingOrderTypeForShortSaleAfterHours + ", showTwentyFourHourButton=" + this.showTwentyFourHourButton + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityAdvancedOrderViewState(String accountNumber, StringResource actionOrderTypeHeaderLabel, boolean z, String str, String str2, EquityOrderConfiguration2 editMode, EditingField editingField, boolean z2, InstrumentAccountSwitcherState instrumentAccountSwitcherState, OrderMarketHours marketHours, OrderTimeInForce timeInForce, ImmutableList<? extends EquityOrderFormRowState> immutableList, EquityOrderContext equityOrderContext, List<String> checkOverrides, EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, StringResource primaryButtonText, boolean z8, OrderForm6 orderFormState, OrderPositionEffect positionEffect, boolean z9, StringResource textButtonText, GenericAlertContent<? extends GenericAction> genericAlertContent, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(actionOrderTypeHeaderLabel, "actionOrderTypeHeaderLabel");
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(textButtonText, "textButtonText");
        this.accountNumber = accountNumber;
        this.actionOrderTypeHeaderLabel = actionOrderTypeHeaderLabel;
        this.isKeyboardVisible = z;
        this.numberOfSharesString = str;
        this.limitPriceString = str2;
        this.editMode = editMode;
        this.editingField = editingField;
        this.loadingAccountSwitcher = z2;
        this.accountSwitcherState = instrumentAccountSwitcherState;
        this.marketHours = marketHours;
        this.timeInForce = timeInForce;
        this.rowStates = immutableList;
        this.equityOrderContext = equityOrderContext;
        this.checkOverrides = checkOverrides;
        this.bottomSheetState = equityAdvancedOrderBottomSheetState;
        this.tooltipWillBeShown = z3;
        this.primaryButtonEnabled = z4;
        this.primaryButtonLoading = z5;
        this.isShortPosition = z6;
        this.isReplaceOrder = z7;
        this.primaryButtonText = primaryButtonText;
        this.advancedOrderSubmissionExperimentMember = z8;
        this.orderFormState = orderFormState;
        this.positionEffect = positionEffect;
        this.showTextButton = z9;
        this.textButtonText = textButtonText;
        this.sessionChangeAlertContent = genericAlertContent;
        this.showOvernightShortAlert = z10;
        this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition = z11;
        this.disableChangingOrderTypeForShortSaleAfterHours = z12;
        this.showTwentyFourHourButton = z13;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final StringResource getActionOrderTypeHeaderLabel() {
        return this.actionOrderTypeHeaderLabel;
    }

    public final String getNumberOfSharesString() {
        return this.numberOfSharesString;
    }

    public final String getLimitPriceString() {
        return this.limitPriceString;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquityAdvancedOrderViewState(java.lang.String r36, com.robinhood.utils.resource.StringResource r37, boolean r38, java.lang.String r39, java.lang.String r40, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2 r41, com.robinhood.android.advancedorderbottomsheet.EditingField r42, boolean r43, com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState r44, com.robinhood.models.p320db.OrderMarketHours r45, com.robinhood.models.p320db.OrderTimeInForce r46, kotlinx.collections.immutable.ImmutableList r47, com.robinhood.android.equity.validation.EquityOrderContext r48, java.util.List r49, com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, com.robinhood.utils.resource.StringResource r56, boolean r57, com.robinhood.shared.trading.tradeflow.OrderForm6 r58, com.robinhood.models.p320db.OrderPositionEffect r59, boolean r60, com.robinhood.utils.resource.StringResource r61, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r62, boolean r63, boolean r64, boolean r65, boolean r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderViewState.<init>(java.lang.String, com.robinhood.utils.resource.StringResource, boolean, java.lang.String, java.lang.String, com.robinhood.android.trading.contracts.configuration.EditMode, com.robinhood.android.advancedorderbottomsheet.EditingField, boolean, com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState, com.robinhood.models.db.OrderMarketHours, com.robinhood.models.db.OrderTimeInForce, kotlinx.collections.immutable.ImmutableList, com.robinhood.android.equity.validation.EquityOrderContext, java.util.List, com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState, boolean, boolean, boolean, boolean, boolean, com.robinhood.utils.resource.StringResource, boolean, com.robinhood.shared.trading.tradeflow.OrderFormState, com.robinhood.models.db.OrderPositionEffect, boolean, com.robinhood.utils.resource.StringResource, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final EquityOrderConfiguration2 getEditMode() {
        return this.editMode;
    }

    public final EditingField getEditingField() {
        return this.editingField;
    }

    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }

    public final OrderMarketHours getMarketHours() {
        return this.marketHours;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final ImmutableList<EquityOrderFormRowState> getRowStates() {
        return this.rowStates;
    }

    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final EquityAdvancedOrderBottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final boolean getTooltipWillBeShown() {
        return this.tooltipWillBeShown;
    }

    public final boolean isShortPosition() {
        return this.isShortPosition;
    }

    public final boolean isReplaceOrder() {
        return this.isReplaceOrder;
    }

    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final boolean getAdvancedOrderSubmissionExperimentMember() {
        return this.advancedOrderSubmissionExperimentMember;
    }

    public final OrderForm6 getOrderFormState() {
        return this.orderFormState;
    }

    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    public final boolean getShowTextButton() {
        return this.showTextButton;
    }

    public final StringResource getTextButtonText() {
        return this.textButtonText;
    }

    public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
        return this.sessionChangeAlertContent;
    }

    public final boolean getShowOvernightShortAlert() {
        return this.showOvernightShortAlert;
    }

    public final boolean getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition() {
        return this.disableChangingOrderTypeForBuyToCloseSubOneSharePosition;
    }

    public final boolean getDisableChangingOrderTypeForShortSaleAfterHours() {
        return this.disableChangingOrderTypeForShortSaleAfterHours;
    }

    public final boolean getShowTwentyFourHourButton() {
        return this.showTwentyFourHourButton;
    }

    public final BigDecimal getSharesQuantity() {
        BigDecimal bigDecimalOrNull;
        String str = this.numberOfSharesString;
        if (str == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str)) == null || !BigDecimals7.isPositive(bigDecimalOrNull) || !BigDecimals7.isInteger(bigDecimalOrNull)) {
            return null;
        }
        return bigDecimalOrNull;
    }

    public final EquityAdvancedOrderNumpadState getNumpadState() {
        return new EquityAdvancedOrderNumpadState(getFooterTextMarkdown(), this.isKeyboardVisible, getShowKeyboardDelimiter(), getTextButtonState(), getPrimaryButtonState(), this.showTwentyFourHourButton);
    }

    private final EquityAdvancedOrderNumpadButtonState getTextButtonState() {
        EquityAdvancedOrderNumpadButtonState.ButtonState buttonState;
        StringResource stringResource = this.textButtonText;
        if (this.showTextButton) {
            buttonState = EquityAdvancedOrderNumpadButtonState.ButtonState.DEFAULT;
        } else {
            buttonState = EquityAdvancedOrderNumpadButtonState.ButtonState.GONE;
        }
        return new EquityAdvancedOrderNumpadButtonState(stringResource, buttonState);
    }

    private final EquityAdvancedOrderNumpadButtonState getPrimaryButtonState() {
        EquityAdvancedOrderNumpadButtonState.ButtonState buttonState;
        StringResource stringResource = this.primaryButtonText;
        if (this.orderFormState == OrderForm6.REVIEWING) {
            buttonState = EquityAdvancedOrderNumpadButtonState.ButtonState.GONE;
        } else if (this.primaryButtonLoading) {
            buttonState = EquityAdvancedOrderNumpadButtonState.ButtonState.LOADING;
        } else {
            buttonState = !this.primaryButtonEnabled ? EquityAdvancedOrderNumpadButtonState.ButtonState.DISABLED : EquityAdvancedOrderNumpadButtonState.ButtonState.DEFAULT;
        }
        return new EquityAdvancedOrderNumpadButtonState(stringResource, buttonState);
    }

    private final StringResource getFooterTextMarkdown() {
        if (this.editMode == EquityOrderConfiguration2.SIMPLE) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.marketHours.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C15237R.string.footer_24_hour_market, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C15237R.string.footer_extended_hours, new Object[0]);
        }
        if (i == 3 || i == 4 || i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getShowKeyboardDelimiter() {
        return this.editingField != EditingField.NUMBER_OF_WHOLE_SHARES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getLoggingEquityOrderContext() {
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        if (equityOrderContext == null) {
            return null;
        }
        String str = null;
        ManagementType managementType = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        Boolean bool = null;
        Boolean bool2 = null;
        String str3 = null;
        ByteString byteString = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        int i4 = 0;
        String str6 = null;
        String str7 = null;
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
        int i5 = -1;
        int i6 = -1;
        int i7 = -536870913;
        int i8 = -257;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new Context(i, i2, i3, 0 == true ? 1 : 0, str2, str4, str5, 0 == true ? 1 : 0, i4, str3, 0 == true ? 1 : 0, str6, objArr, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, this.equityOrderContext.toRosetta(), keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(equityOrderContext.getBrokerageAccountType()), str, managementType, str2, z, z2, bool, bool2, str3, byteString, 1022, null), brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    public final StringResource getToolbarTitle() {
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C29312R.string.order_type_limit_title, new Object[0]);
        if (this.isReplaceOrder) {
            return stringResourceInvoke;
        }
        return null;
    }
}
