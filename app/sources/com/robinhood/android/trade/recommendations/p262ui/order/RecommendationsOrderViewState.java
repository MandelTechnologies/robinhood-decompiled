package com.robinhood.android.trade.recommendations.p262ui.order;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ImageSpan;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.trade.recommendations.C29895R;
import com.robinhood.android.transfers.contracts.CreateRetirementContribution;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.CurrencyContext2;
import com.robinhood.models.util.Money;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutAmount;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderSummary;
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
import com.robinhood.rosetta.eventlogging.TransferErrorContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UpsellBannerContext;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: RecommendationsOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b.\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 «\u00012\u00020\u0001:\b¨\u0001©\u0001ª\u0001«\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00032\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u0012J\u0012\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000fHÆ\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\u009c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0012\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0011HÆ\u0003J\u0012\u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0007HÂ\u0003J\n\u0010¡\u0001\u001a\u00020\u0007HÂ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÂ\u0003JÒ\u0001\u0010£\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00112\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0015\u0010¤\u0001\u001a\u00020\u00072\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¦\u0001\u001a\u00020IHÖ\u0001J\n\u0010§\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0014\u00107\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0014\u00109\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010$R\u0014\u0010;\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010$R\u0014\u0010=\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010$R\u0014\u0010?\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010*R\u0014\u0010A\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010*R\u0014\u0010C\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010*R\u0011\u0010E\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010$R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020I0H8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u0010$R\u0013\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bQ\u0010$R\u0014\u0010R\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010$R\u0013\u0010T\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010$R\u0011\u0010]\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b]\u0010$R\u0011\u0010^\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010$R\u0011\u0010_\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b_\u0010$R\u0013\u0010`\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\ba\u0010!R\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bb\u0010$R\u0011\u0010c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bc\u0010$R\u0011\u0010d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bd\u0010$R\u0011\u0010e\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bi\u0010$R\u001f\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010l0k8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\"\u0010o\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010l0k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR\u0013\u0010q\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\br\u0010!R!\u0010s\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010l\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bt\u0010nR\u0013\u0010u\u001a\u0004\u0018\u00010v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0019\u0010y\u001a\n\u0012\u0004\u0012\u00020z\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\b{\u0010KR\u0014\u0010|\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010$R\u0011\u0010}\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b~\u0010$R\u0016\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010\u0087\u0001\u001a\u00030\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006¬\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState;", "", "accountNumber", "", "currentState", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "isCheckoutReviewLoading", "", "checkoutReview", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;", "orderSummary", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderSummary;", "amount", "Lcom/robinhood/models/util/Money;", "amountCharArray", "", "amountError", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$Error;", "disclosureSigned", "exitFlowEvent", "", "requiredState", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$RequiredState;", "errorEvent", "", "launchTransferFlowEvent", "buyingPowerStale", "internalIsLoading", "source", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;ZLcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderSummary;Lcom/robinhood/models/util/Money;[CLcom/robinhood/udf/UiEvent;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$RequiredState;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrentState", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "()Z", "getCheckoutReview", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutReview;", "getOrderSummary", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsOrderSummary;", "getAmount", "()Lcom/robinhood/models/util/Money;", "getAmountCharArray", "()[C", "getAmountError", "()Lcom/robinhood/udf/UiEvent;", "getDisclosureSigned", "getExitFlowEvent", "getRequiredState", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$RequiredState;", "getErrorEvent", "getLaunchTransferFlowEvent", "hasInsufficientBuyingPower", "getHasInsufficientBuyingPower", "hasInsufficientBuyingPowerPlusInstant", "getHasInsufficientBuyingPowerPlusInstant", "hasEnteredMinAmount", "getHasEnteredMinAmount", "hasEnteredAboveMaxAmount", "getHasEnteredAboveMaxAmount", "hasLinkedFundingSource", "getHasLinkedFundingSource", "buyingPower", "getBuyingPower", "minInvestmentAmount", "getMinInvestmentAmount", "maxInvestmentAmount", "getMaxInvestmentAmount", "showQuickTradeBtns", "getShowQuickTradeBtns", "quickTradeAmounts", "", "", "getQuickTradeAmounts", "()Ljava/util/List;", "isLoading", "checkoutAmount", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "getCheckoutAmount", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "isBuyingPowerVisible", "hasLinkedAchRelationship", "getHasLinkedAchRelationship", "requiredMinDeposit", "Ljava/math/BigDecimal;", "getRequiredMinDeposit", "()Ljava/math/BigDecimal;", "listBias", "", "getListBias", "()F", "isListVisible", "isAmountVisible", "isBreakdownReviewVisible", "isOrderSummaryVisible", "orderSummarySubtitle", "getOrderSummarySubtitle", "isToolbarIconVisible", "isToolbarEditTextVisible", "isAmountInfoTextVisible", "reviewButtonAction", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$ReviewButtonAction;", "getReviewButtonAction", "()Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$ReviewButtonAction;", "isReviewButtonEnabled", "maxInvestmentAlertAndTag", "Lkotlin/Pair;", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "getMaxInvestmentAlertAndTag", "()Lkotlin/Pair;", "minInvestmentAlertAndTag", "getMinInvestmentAlertAndTag", "amountInfoString", "getAmountInfoString", "amountInfoAlert", "getAmountInfoAlert", "ctaStringResource", "Lcom/robinhood/utils/resource/StringResource;", "getCtaStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "checkoutReviewInstrumentIds", "Ljava/util/UUID;", "getCheckoutReviewInstrumentIds", "isRetirementAccount", "shouldLaunchContributionFlow", "getShouldLaunchContributionFlow", "contributionsIntentKey", "Lcom/robinhood/android/transfers/contracts/CreateRetirementContribution;", "getContributionsIntentKey", "()Lcom/robinhood/android/transfers/contracts/CreateRetirementContribution;", "transfersIntentKey", "Lcom/robinhood/android/transfers/contracts/Transfer;", "getTransfersIntentKey", "()Lcom/robinhood/android/transfers/contracts/Transfer;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getErrorString", "res", "Landroid/content/res/Resources;", "error", "getNbboRefreshText", "Landroid/text/SpannedString;", "loadingDrawable", "Landroid/graphics/drawable/Drawable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "ReviewButtonAction", "Error", "RequiredState", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class RecommendationsOrderViewState {
    private static final char[] INITIAL_STATE;
    public static final String MAX_AMOUNT_ALERT_TAG = "recs-max-amount-info-alert";
    public static final String MIN_AMOUNT_ALERT_TAG = "recs-min-amount-info-alert";
    private final String accountNumber;
    private final Money amount;
    private final char[] amountCharArray;
    private final UiEvent<Error> amountError;
    private final boolean buyingPowerStale;
    private final UiRecommendationsCheckoutReview checkoutReview;
    private final RecommendationsOrderState currentState;
    private final boolean disclosureSigned;
    private final UiEvent<Throwable> errorEvent;
    private final UiEvent<Unit> exitFlowEvent;
    private final boolean internalIsLoading;
    private final boolean isCheckoutReviewLoading;
    private final UiEvent<Unit> launchTransferFlowEvent;
    private final UiRecommendationsOrderSummary orderSummary;
    private final RequiredState requiredState;
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final BigDecimal MAX_AMOUNT = new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT);

    /* compiled from: RecommendationsOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[RecommendationsOrderState.values().length];
            try {
                iArr[RecommendationsOrderState.BREAKDOWN_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsOrderState.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Error.values().length];
            try {
                iArr3[Error.GREATER_THAN_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public RecommendationsOrderViewState() {
        this(null, null, false, null, null, null, null, null, false, null, null, null, null, false, false, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component14, reason: from getter */
    private final boolean getBuyingPowerStale() {
        return this.buyingPowerStale;
    }

    /* renamed from: component15, reason: from getter */
    private final boolean getInternalIsLoading() {
        return this.internalIsLoading;
    }

    /* renamed from: component16, reason: from getter */
    private final String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UiEvent<Unit> component10() {
        return this.exitFlowEvent;
    }

    /* renamed from: component11, reason: from getter */
    public final RequiredState getRequiredState() {
        return this.requiredState;
    }

    public final UiEvent<Throwable> component12() {
        return this.errorEvent;
    }

    public final UiEvent<Unit> component13() {
        return this.launchTransferFlowEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final RecommendationsOrderState getCurrentState() {
        return this.currentState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCheckoutReviewLoading() {
        return this.isCheckoutReviewLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final UiRecommendationsCheckoutReview getCheckoutReview() {
        return this.checkoutReview;
    }

    /* renamed from: component5, reason: from getter */
    public final UiRecommendationsOrderSummary getOrderSummary() {
        return this.orderSummary;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final char[] getAmountCharArray() {
        return this.amountCharArray;
    }

    public final UiEvent<Error> component8() {
        return this.amountError;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDisclosureSigned() {
        return this.disclosureSigned;
    }

    public final RecommendationsOrderViewState copy(String accountNumber, RecommendationsOrderState currentState, boolean isCheckoutReviewLoading, UiRecommendationsCheckoutReview checkoutReview, UiRecommendationsOrderSummary orderSummary, Money amount, char[] amountCharArray, UiEvent<Error> amountError, boolean disclosureSigned, UiEvent<Unit> exitFlowEvent, RequiredState requiredState, UiEvent<Throwable> errorEvent, UiEvent<Unit> launchTransferFlowEvent, boolean buyingPowerStale, boolean internalIsLoading, String source) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountCharArray, "amountCharArray");
        Intrinsics.checkNotNullParameter(source, "source");
        return new RecommendationsOrderViewState(accountNumber, currentState, isCheckoutReviewLoading, checkoutReview, orderSummary, amount, amountCharArray, amountError, disclosureSigned, exitFlowEvent, requiredState, errorEvent, launchTransferFlowEvent, buyingPowerStale, internalIsLoading, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsOrderViewState)) {
            return false;
        }
        RecommendationsOrderViewState recommendationsOrderViewState = (RecommendationsOrderViewState) other;
        return Intrinsics.areEqual(this.accountNumber, recommendationsOrderViewState.accountNumber) && this.currentState == recommendationsOrderViewState.currentState && this.isCheckoutReviewLoading == recommendationsOrderViewState.isCheckoutReviewLoading && Intrinsics.areEqual(this.checkoutReview, recommendationsOrderViewState.checkoutReview) && Intrinsics.areEqual(this.orderSummary, recommendationsOrderViewState.orderSummary) && Intrinsics.areEqual(this.amount, recommendationsOrderViewState.amount) && Intrinsics.areEqual(this.amountCharArray, recommendationsOrderViewState.amountCharArray) && Intrinsics.areEqual(this.amountError, recommendationsOrderViewState.amountError) && this.disclosureSigned == recommendationsOrderViewState.disclosureSigned && Intrinsics.areEqual(this.exitFlowEvent, recommendationsOrderViewState.exitFlowEvent) && Intrinsics.areEqual(this.requiredState, recommendationsOrderViewState.requiredState) && Intrinsics.areEqual(this.errorEvent, recommendationsOrderViewState.errorEvent) && Intrinsics.areEqual(this.launchTransferFlowEvent, recommendationsOrderViewState.launchTransferFlowEvent) && this.buyingPowerStale == recommendationsOrderViewState.buyingPowerStale && this.internalIsLoading == recommendationsOrderViewState.internalIsLoading && Intrinsics.areEqual(this.source, recommendationsOrderViewState.source);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.currentState.hashCode()) * 31) + Boolean.hashCode(this.isCheckoutReviewLoading)) * 31;
        UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = this.checkoutReview;
        int iHashCode2 = (iHashCode + (uiRecommendationsCheckoutReview == null ? 0 : uiRecommendationsCheckoutReview.hashCode())) * 31;
        UiRecommendationsOrderSummary uiRecommendationsOrderSummary = this.orderSummary;
        int iHashCode3 = (((((iHashCode2 + (uiRecommendationsOrderSummary == null ? 0 : uiRecommendationsOrderSummary.hashCode())) * 31) + this.amount.hashCode()) * 31) + Arrays.hashCode(this.amountCharArray)) * 31;
        UiEvent<Error> uiEvent = this.amountError;
        int iHashCode4 = (((iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.disclosureSigned)) * 31;
        UiEvent<Unit> uiEvent2 = this.exitFlowEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        RequiredState requiredState = this.requiredState;
        int iHashCode6 = (iHashCode5 + (requiredState == null ? 0 : requiredState.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.errorEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Unit> uiEvent4 = this.launchTransferFlowEvent;
        return ((((((iHashCode7 + (uiEvent4 != null ? uiEvent4.hashCode() : 0)) * 31) + Boolean.hashCode(this.buyingPowerStale)) * 31) + Boolean.hashCode(this.internalIsLoading)) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "RecommendationsOrderViewState(accountNumber=" + this.accountNumber + ", currentState=" + this.currentState + ", isCheckoutReviewLoading=" + this.isCheckoutReviewLoading + ", checkoutReview=" + this.checkoutReview + ", orderSummary=" + this.orderSummary + ", amount=" + this.amount + ", amountCharArray=" + Arrays.toString(this.amountCharArray) + ", amountError=" + this.amountError + ", disclosureSigned=" + this.disclosureSigned + ", exitFlowEvent=" + this.exitFlowEvent + ", requiredState=" + this.requiredState + ", errorEvent=" + this.errorEvent + ", launchTransferFlowEvent=" + this.launchTransferFlowEvent + ", buyingPowerStale=" + this.buyingPowerStale + ", internalIsLoading=" + this.internalIsLoading + ", source=" + this.source + ")";
    }

    public RecommendationsOrderViewState(String str, RecommendationsOrderState currentState, boolean z, UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview, UiRecommendationsOrderSummary uiRecommendationsOrderSummary, Money amount, char[] amountCharArray, UiEvent<Error> uiEvent, boolean z2, UiEvent<Unit> uiEvent2, RequiredState requiredState, UiEvent<Throwable> uiEvent3, UiEvent<Unit> uiEvent4, boolean z3, boolean z4, String source) {
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountCharArray, "amountCharArray");
        Intrinsics.checkNotNullParameter(source, "source");
        this.accountNumber = str;
        this.currentState = currentState;
        this.isCheckoutReviewLoading = z;
        this.checkoutReview = uiRecommendationsCheckoutReview;
        this.orderSummary = uiRecommendationsOrderSummary;
        this.amount = amount;
        this.amountCharArray = amountCharArray;
        this.amountError = uiEvent;
        this.disclosureSigned = z2;
        this.exitFlowEvent = uiEvent2;
        this.requiredState = requiredState;
        this.errorEvent = uiEvent3;
        this.launchTransferFlowEvent = uiEvent4;
        this.buyingPowerStale = z3;
        this.internalIsLoading = z4;
        this.source = source;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ RecommendationsOrderViewState(String str, RecommendationsOrderState recommendationsOrderState, boolean z, UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview, UiRecommendationsOrderSummary uiRecommendationsOrderSummary, Money money, char[] cArr, UiEvent uiEvent, boolean z2, UiEvent uiEvent2, RequiredState requiredState, UiEvent uiEvent3, UiEvent uiEvent4, boolean z3, boolean z4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Money money2;
        String str3 = (i & 1) != 0 ? null : str;
        RecommendationsOrderState recommendationsOrderState2 = (i & 2) != 0 ? RecommendationsOrderState.INPUT : recommendationsOrderState;
        boolean z5 = (i & 4) != 0 ? false : z;
        UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview2 = (i & 8) != 0 ? null : uiRecommendationsCheckoutReview;
        UiRecommendationsOrderSummary uiRecommendationsOrderSummary2 = (i & 16) != 0 ? null : uiRecommendationsOrderSummary;
        if ((i & 32) != 0) {
            Currency currency = Currencies.USD;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money2 = new Money(currency, ZERO);
        } else {
            money2 = money;
        }
        this(str3, recommendationsOrderState2, z5, uiRecommendationsCheckoutReview2, uiRecommendationsOrderSummary2, money2, (i & 64) != 0 ? INITIAL_STATE : cArr, (i & 128) != 0 ? null : uiEvent, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : uiEvent2, (i & 1024) != 0 ? null : requiredState, (i & 2048) != 0 ? null : uiEvent3, (i & 4096) == 0 ? uiEvent4 : null, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (i & 32768) != 0 ? "" : str2);
    }

    public final RecommendationsOrderState getCurrentState() {
        return this.currentState;
    }

    public final SpannedString getNbboRefreshText(Drawable loadingDrawable) {
        Intrinsics.checkNotNullParameter(loadingDrawable, "loadingDrawable");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = this.checkoutReview;
        spannableStringBuilder.append((CharSequence) (uiRecommendationsCheckoutReview != null ? uiRecommendationsCheckoutReview.getNbboRefreshActionCopy() : null));
        if (this.isCheckoutReviewLoading) {
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            ImageSpan imageSpan = new ImageSpan(loadingDrawable, Build.VERSION.SDK_INT >= 29 ? 2 : 0);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            spannableStringBuilder.setSpan(imageSpan, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public final boolean isCheckoutReviewLoading() {
        return this.isCheckoutReviewLoading;
    }

    public final UiRecommendationsCheckoutReview getCheckoutReview() {
        return this.checkoutReview;
    }

    public final UiRecommendationsOrderSummary getOrderSummary() {
        return this.orderSummary;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final char[] getAmountCharArray() {
        return this.amountCharArray;
    }

    public final UiEvent<Error> getAmountError() {
        return this.amountError;
    }

    public final boolean getDisclosureSigned() {
        return this.disclosureSigned;
    }

    public final UiEvent<Unit> getExitFlowEvent() {
        return this.exitFlowEvent;
    }

    public final RequiredState getRequiredState() {
        return this.requiredState;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final UiEvent<Unit> getLaunchTransferFlowEvent() {
        return this.launchTransferFlowEvent;
    }

    private final boolean getHasInsufficientBuyingPower() {
        return this.amount.compareTo(getBuyingPower()) > 0;
    }

    private final boolean getHasInsufficientBuyingPowerPlusInstant() {
        return this.amount.compareTo(getMaxInvestmentAmount()) > 0;
    }

    private final boolean getHasEnteredMinAmount() {
        return this.amount.compareTo(getMinInvestmentAmount()) >= 0;
    }

    private final boolean getHasEnteredAboveMaxAmount() {
        return this.amount.compareTo(getMaxInvestmentAmount()) > 0;
    }

    private final boolean getHasLinkedFundingSource() {
        return getHasLinkedAchRelationship();
    }

    private final Money getBuyingPower() {
        Money buyingPower;
        RequiredState requiredState = this.requiredState;
        return (requiredState == null || (buyingPower = requiredState.getBuyingPower()) == null) ? CurrencyContext2.getZero(Currencies.USD) : buyingPower;
    }

    private final Money getMinInvestmentAmount() {
        Money minInvestmentAmount;
        UiRecommendationsCheckoutAmount checkoutAmount = getCheckoutAmount();
        return (checkoutAmount == null || (minInvestmentAmount = checkoutAmount.getMinInvestmentAmount()) == null) ? CurrencyContext2.getZero(Currencies.USD) : minInvestmentAmount;
    }

    private final Money getMaxInvestmentAmount() {
        Money maxInvestmentAmount;
        UiRecommendationsCheckoutAmount checkoutAmount = getCheckoutAmount();
        return (checkoutAmount == null || (maxInvestmentAmount = checkoutAmount.getMaxInvestmentAmount()) == null) ? CurrencyContext2.getZero(Currencies.USD) : maxInvestmentAmount;
    }

    public final boolean getShowQuickTradeBtns() {
        UiRecommendationsCheckoutAmount checkoutAmount;
        List<Integer> suggestedInvestmentAmounts;
        return Arrays.equals(this.amountCharArray, INITIAL_STATE) && (checkoutAmount = getCheckoutAmount()) != null && (suggestedInvestmentAmounts = checkoutAmount.getSuggestedInvestmentAmounts()) != null && (suggestedInvestmentAmounts.isEmpty() ^ true);
    }

    public final List<Integer> getQuickTradeAmounts() {
        List<Integer> suggestedInvestmentAmounts;
        UiRecommendationsCheckoutAmount checkoutAmount = getCheckoutAmount();
        return (checkoutAmount == null || (suggestedInvestmentAmounts = checkoutAmount.getSuggestedInvestmentAmounts()) == null) ? CollectionsKt.emptyList() : suggestedInvestmentAmounts;
    }

    public final boolean isLoading() {
        return this.requiredState == null || this.internalIsLoading || this.buyingPowerStale;
    }

    public final UiRecommendationsCheckoutAmount getCheckoutAmount() {
        RequiredState requiredState = this.requiredState;
        if (requiredState != null) {
            return requiredState.getCheckoutAmount();
        }
        return null;
    }

    public final boolean isBuyingPowerVisible() {
        return this.currentState == RecommendationsOrderState.INPUT && BigDecimals7.isPositive(getBuyingPower().getDecimalValue());
    }

    private final boolean getHasLinkedAchRelationship() {
        RequiredState requiredState = this.requiredState;
        if (requiredState != null) {
            return requiredState.getHasLinkedAchRelationship();
        }
        return false;
    }

    public final BigDecimal getRequiredMinDeposit() {
        if (this.currentState == RecommendationsOrderState.BREAKDOWN_REVIEW && getHasInsufficientBuyingPower()) {
            return this.amount.minus(getBuyingPower()).getDecimalValue();
        }
        return null;
    }

    public final float getListBias() {
        return WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()] == 1 ? 0.0f : 1.0f;
    }

    public final boolean isListVisible() {
        return this.currentState == RecommendationsOrderState.BREAKDOWN_REVIEW;
    }

    public final boolean isAmountVisible() {
        return this.currentState != RecommendationsOrderState.BREAKDOWN_REVIEW;
    }

    public final boolean isBreakdownReviewVisible() {
        return this.currentState == RecommendationsOrderState.BREAKDOWN_REVIEW;
    }

    public final boolean isOrderSummaryVisible() {
        return this.currentState == RecommendationsOrderState.SWIPE_UP;
    }

    public final String getOrderSummarySubtitle() {
        UiRecommendationsOrderSummary uiRecommendationsOrderSummary = this.orderSummary;
        if (uiRecommendationsOrderSummary != null) {
            return uiRecommendationsOrderSummary.getSubtitle();
        }
        return null;
    }

    public final boolean isToolbarIconVisible() {
        RecommendationsOrderState recommendationsOrderState = this.currentState;
        return (recommendationsOrderState == RecommendationsOrderState.SWIPE_UP || recommendationsOrderState == RecommendationsOrderState.BREAKDOWN_REVIEW) ? false : true;
    }

    public final boolean isToolbarEditTextVisible() {
        return !isToolbarIconVisible();
    }

    public final boolean isAmountInfoTextVisible() {
        if (this.currentState != RecommendationsOrderState.INPUT || getAmountInfoString() == null) {
            return false;
        }
        UiEvent<Error> uiEvent = this.amountError;
        return uiEvent == null || uiEvent.getConsumed();
    }

    public final ReviewButtonAction getReviewButtonAction() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return ReviewButtonAction.NEXT;
            }
            return getHasInsufficientBuyingPowerPlusInstant() ? ReviewButtonAction.INSUFFICIENT_BP_PLUS_INSTANT_ALERT : ReviewButtonAction.NEXT;
        }
        if (getRequiredMinDeposit() != null && getHasLinkedFundingSource()) {
            return ReviewButtonAction.DEPOSIT;
        }
        if (getRequiredMinDeposit() != null && !getHasLinkedFundingSource()) {
            return ReviewButtonAction.LINK_BANK;
        }
        UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = this.checkoutReview;
        return (uiRecommendationsCheckoutReview == null || !uiRecommendationsCheckoutReview.getRequiresRhsMarginAgreement()) ? !this.disclosureSigned ? ReviewButtonAction.SIGN_DISCLOSURE : ReviewButtonAction.NEXT : ReviewButtonAction.SIGN_RHS_MARGIN_AGREEMENT;
    }

    public final boolean isReviewButtonEnabled() {
        return this.currentState != RecommendationsOrderState.INPUT || this.amount.compareTo(getMinInvestmentAmount()) >= 0;
    }

    public final Tuples2<String, GenericAlert> getMaxInvestmentAlertAndTag() {
        UiRecommendationsCheckoutAmount checkoutAmount = getCheckoutAmount();
        return Tuples4.m3642to(MAX_AMOUNT_ALERT_TAG, checkoutAmount != null ? checkoutAmount.getMaxInvestmentAlert() : null);
    }

    private final Tuples2<String, GenericAlert> getMinInvestmentAlertAndTag() {
        UiRecommendationsCheckoutAmount checkoutAmount = getCheckoutAmount();
        return Tuples4.m3642to(MIN_AMOUNT_ALERT_TAG, checkoutAmount != null ? checkoutAmount.getMinInvestmentAlert() : null);
    }

    public final String getAmountInfoString() {
        UiRecommendationsCheckoutAmount checkoutAmount;
        if (getHasEnteredMinAmount()) {
            if (!getHasEnteredAboveMaxAmount() || (checkoutAmount = getCheckoutAmount()) == null) {
                return null;
            }
            return checkoutAmount.getMaxInvestmentDescription();
        }
        UiRecommendationsCheckoutAmount checkoutAmount2 = getCheckoutAmount();
        if (checkoutAmount2 != null) {
            return checkoutAmount2.getMinInvestmentDescription();
        }
        return null;
    }

    public final Tuples2<String, GenericAlert> getAmountInfoAlert() {
        if (!getHasEnteredMinAmount()) {
            return getMinInvestmentAlertAndTag();
        }
        if (getHasEnteredAboveMaxAmount()) {
            return getMaxInvestmentAlertAndTag();
        }
        return null;
    }

    public final StringResource getCtaStringResource() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }
        if (getHasInsufficientBuyingPower()) {
            if (getHasLinkedFundingSource()) {
                i = C11048R.string.general_action_deposit_funds;
            } else {
                i = C29895R.string.recommendations_order_link_bank;
            }
        } else {
            i = C11048R.string.general_label_continue;
        }
        return StringResource.INSTANCE.invoke(i, new Object[0]);
    }

    public final List<UUID> getCheckoutReviewInstrumentIds() {
        List<UiRecommendationsCheckoutReview.OrderEntryRow> orderEntryRows;
        UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = this.checkoutReview;
        if (uiRecommendationsCheckoutReview == null || (orderEntryRows = uiRecommendationsCheckoutReview.getOrderEntryRows()) == null) {
            return null;
        }
        List<UiRecommendationsCheckoutReview.OrderEntryRow> list = orderEntryRows;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiRecommendationsCheckoutReview.OrderEntryRow) it.next()).getInstrumentId());
        }
        return arrayList;
    }

    private final boolean isRetirementAccount() {
        BrokerageAccountType brokerageAccountType;
        RequiredState requiredState = this.requiredState;
        return (requiredState == null || (brokerageAccountType = requiredState.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
    }

    public final boolean getShouldLaunchContributionFlow() {
        return isRetirementAccount();
    }

    public final CreateRetirementContribution getContributionsIntentKey() {
        BrokerageAccountType brokerageAccountType;
        BigDecimal requiredMinDeposit = getRequiredMinDeposit();
        TransferContext.RobinhoodAccountType robinhoodAccountTypeFrom = null;
        if (requiredMinDeposit == null) {
            return null;
        }
        String str = this.accountNumber;
        RequiredState requiredState = this.requiredState;
        if (requiredState != null && (brokerageAccountType = requiredState.getBrokerageAccountType()) != null) {
            robinhoodAccountTypeFrom = TransferContext.RobinhoodAccountType.INSTANCE.from(brokerageAccountType);
        }
        return new CreateRetirementContribution(requiredMinDeposit, str, robinhoodAccountTypeFrom, true, false, MAXTransferContext.EntryPoint.RECOMMENDATIONS_FOR_RETIREMENT);
    }

    public final Transfer getTransfersIntentKey() {
        ApiTransferAccount.TransferAccountType transferAccountType;
        BigDecimal requiredMinDeposit = getRequiredMinDeposit();
        if (requiredMinDeposit == null) {
            return null;
        }
        ApiTransferAccount.TransferAccountType transferAccountType2 = getHasLinkedAchRelationship() ? ApiTransferAccount.TransferAccountType.ACH : null;
        RequiredState requiredState = this.requiredState;
        BrokerageAccountType brokerageAccountType = requiredState != null ? requiredState.getBrokerageAccountType() : null;
        int i = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()];
        if (i == 1) {
            transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
        } else if (i == 2) {
            transferAccountType = ApiTransferAccount.TransferAccountType.IRA_ROTH;
        } else if (i == 3) {
            transferAccountType = ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL;
        } else {
            Preconditions preconditions = Preconditions.INSTANCE;
            RequiredState requiredState2 = this.requiredState;
            preconditions.failUnexpectedItemKotlin(requiredState2 != null ? requiredState2.getBrokerageAccountType() : null);
            throw new ExceptionsH();
        }
        return new Transfer(new TransferConfiguration.Recommendations(requiredMinDeposit, transferAccountType2 != null ? new TransferConfiguration.TransferAccountSelection(null, false, transferAccountType2, 3, null) : null, new TransferConfiguration.TransferAccountSelection(null, true, transferAccountType, 1, null), new ApiCreateTransferRequest.ApiPostTransferPageConfig(CollectionsKt.listOf(ApiPostTransferPage.PostTransferPageType.IRA_CONTRIBUTION_CELEBRATION))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getLoggingContext() {
        String str = this.source;
        RequiredState requiredState = this.requiredState;
        BrokerageAccountType brokerageAccountType = requiredState != null ? requiredState.getBrokerageAccountType() : null;
        RecommendationsContext.EntryPoint entryPoint = null;
        String str2 = null;
        String str3 = null;
        RecommendationsContext.RecommendationsType recommendationsType = null;
        ByteString byteString = null;
        String str4 = null;
        String str5 = null;
        Screen screen = null;
        String str6 = null;
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
        com.robinhood.rosetta.eventlogging.TransferContext transferContext = null;
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
        ByteString byteString2 = null;
        int i = -1;
        int i2 = -1;
        int i3 = -2;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        return new Context(0, 0, 0, null, str3, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, str4, str5, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, new RecommendationsContext(entryPoint, str2, str, str3, recommendationsType, String.valueOf(brokerageAccountType), byteString, 91, null), ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i, i2, i3, i4, i5, i6, 16383, null);
    }

    public final String getErrorString(Resources res, Error error) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(error, "error");
        int i = WhenMappings.$EnumSwitchMapping$2[error.ordinal()];
        if (i == 1) {
            return res.getString(C29895R.string.recommendations_order_dollar_input_error_max);
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$ReviewButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "NEXT", "INSUFFICIENT_BP_PLUS_INSTANT_ALERT", "SIGN_RHS_MARGIN_AGREEMENT", "SIGN_DISCLOSURE", "DEPOSIT", "LINK_BANK", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReviewButtonAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReviewButtonAction[] $VALUES;
        public static final ReviewButtonAction NEXT = new ReviewButtonAction("NEXT", 0);
        public static final ReviewButtonAction INSUFFICIENT_BP_PLUS_INSTANT_ALERT = new ReviewButtonAction("INSUFFICIENT_BP_PLUS_INSTANT_ALERT", 1);
        public static final ReviewButtonAction SIGN_RHS_MARGIN_AGREEMENT = new ReviewButtonAction("SIGN_RHS_MARGIN_AGREEMENT", 2);
        public static final ReviewButtonAction SIGN_DISCLOSURE = new ReviewButtonAction("SIGN_DISCLOSURE", 3);
        public static final ReviewButtonAction DEPOSIT = new ReviewButtonAction("DEPOSIT", 4);
        public static final ReviewButtonAction LINK_BANK = new ReviewButtonAction("LINK_BANK", 5);

        private static final /* synthetic */ ReviewButtonAction[] $values() {
            return new ReviewButtonAction[]{NEXT, INSUFFICIENT_BP_PLUS_INSTANT_ALERT, SIGN_RHS_MARGIN_AGREEMENT, SIGN_DISCLOSURE, DEPOSIT, LINK_BANK};
        }

        public static EnumEntries<ReviewButtonAction> getEntries() {
            return $ENTRIES;
        }

        private ReviewButtonAction(String str, int i) {
        }

        static {
            ReviewButtonAction[] reviewButtonActionArr$values = $values();
            $VALUES = reviewButtonActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(reviewButtonActionArr$values);
        }

        public static ReviewButtonAction valueOf(String str) {
            return (ReviewButtonAction) Enum.valueOf(ReviewButtonAction.class, str);
        }

        public static ReviewButtonAction[] values() {
            return (ReviewButtonAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$Error;", "", "<init>", "(Ljava/lang/String;I)V", "GREATER_THAN_MAX", "GENERIC", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error GREATER_THAN_MAX = new Error("GREATER_THAN_MAX", 0);
        public static final Error GENERIC = new Error("GENERIC", 1);

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{GREATER_THAN_MAX, GENERIC};
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i) {
        }

        static {
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorArr$values);
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* compiled from: RecommendationsOrderViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$RequiredState;", "", "buyingPower", "Lcom/robinhood/models/util/Money;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "hasLinkedAchRelationship", "", "checkoutAmount", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/BrokerageAccountType;ZLcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;)V", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getHasLinkedAchRelationship", "()Z", "getCheckoutAmount", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequiredState {
        public static final int $stable = 8;
        private final BrokerageAccountType brokerageAccountType;
        private final Money buyingPower;
        private final UiRecommendationsCheckoutAmount checkoutAmount;
        private final boolean hasLinkedAchRelationship;

        public static /* synthetic */ RequiredState copy$default(RequiredState requiredState, Money money, BrokerageAccountType brokerageAccountType, boolean z, UiRecommendationsCheckoutAmount uiRecommendationsCheckoutAmount, int i, Object obj) {
            if ((i & 1) != 0) {
                money = requiredState.buyingPower;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = requiredState.brokerageAccountType;
            }
            if ((i & 4) != 0) {
                z = requiredState.hasLinkedAchRelationship;
            }
            if ((i & 8) != 0) {
                uiRecommendationsCheckoutAmount = requiredState.checkoutAmount;
            }
            return requiredState.copy(money, brokerageAccountType, z, uiRecommendationsCheckoutAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getBuyingPower() {
            return this.buyingPower;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasLinkedAchRelationship() {
            return this.hasLinkedAchRelationship;
        }

        /* renamed from: component4, reason: from getter */
        public final UiRecommendationsCheckoutAmount getCheckoutAmount() {
            return this.checkoutAmount;
        }

        public final RequiredState copy(Money buyingPower, BrokerageAccountType brokerageAccountType, boolean hasLinkedAchRelationship, UiRecommendationsCheckoutAmount checkoutAmount) {
            Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(checkoutAmount, "checkoutAmount");
            return new RequiredState(buyingPower, brokerageAccountType, hasLinkedAchRelationship, checkoutAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequiredState)) {
                return false;
            }
            RequiredState requiredState = (RequiredState) other;
            return Intrinsics.areEqual(this.buyingPower, requiredState.buyingPower) && this.brokerageAccountType == requiredState.brokerageAccountType && this.hasLinkedAchRelationship == requiredState.hasLinkedAchRelationship && Intrinsics.areEqual(this.checkoutAmount, requiredState.checkoutAmount);
        }

        public int hashCode() {
            return (((((this.buyingPower.hashCode() * 31) + this.brokerageAccountType.hashCode()) * 31) + Boolean.hashCode(this.hasLinkedAchRelationship)) * 31) + this.checkoutAmount.hashCode();
        }

        public String toString() {
            return "RequiredState(buyingPower=" + this.buyingPower + ", brokerageAccountType=" + this.brokerageAccountType + ", hasLinkedAchRelationship=" + this.hasLinkedAchRelationship + ", checkoutAmount=" + this.checkoutAmount + ")";
        }

        public RequiredState(Money buyingPower, BrokerageAccountType brokerageAccountType, boolean z, UiRecommendationsCheckoutAmount checkoutAmount) {
            Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(checkoutAmount, "checkoutAmount");
            this.buyingPower = buyingPower;
            this.brokerageAccountType = brokerageAccountType;
            this.hasLinkedAchRelationship = z;
            this.checkoutAmount = checkoutAmount;
        }

        public final Money getBuyingPower() {
            return this.buyingPower;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final boolean getHasLinkedAchRelationship() {
            return this.hasLinkedAchRelationship;
        }

        public final UiRecommendationsCheckoutAmount getCheckoutAmount() {
            return this.checkoutAmount;
        }
    }

    /* compiled from: RecommendationsOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$Companion;", "", "<init>", "()V", "MIN_AMOUNT_ALERT_TAG", "", "MAX_AMOUNT_ALERT_TAG", "MAX_AMOUNT", "Ljava/math/BigDecimal;", "getMAX_AMOUNT", "()Ljava/math/BigDecimal;", "INITIAL_STATE", "", "getINITIAL_STATE", "()[C", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BigDecimal getMAX_AMOUNT() {
            return RecommendationsOrderViewState.MAX_AMOUNT;
        }

        public final char[] getINITIAL_STATE() {
            return RecommendationsOrderViewState.INITIAL_STATE;
        }
    }

    static {
        char[] charArray = "$0".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        INITIAL_STATE = charArray;
    }
}
