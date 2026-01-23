package com.robinhood.android.transfers.lib.validation;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.lib.limits.GetLimitTriggered;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiCountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
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
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.BreakingNewsContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
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
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.utils.Either;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: LimitsHubCheck.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck;", "Lcom/robinhood/android/transfers/lib/validation/TransferCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "input", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "Failure", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LimitsHubCheck implements TransferCheck {
    public static final LimitsHubCheck INSTANCE = new LimitsHubCheck();

    private LimitsHubCheck() {
    }

    @Override // com.robinhood.android.transfers.lib.validation.TransferCheck
    public ValidationFailure check(TransferValidationInput input) {
        ApiLimitsHubResponse transferLimits;
        Intrinsics.checkNotNullParameter(input, "input");
        CreateTransferLimitsState createTransferLimitsState = input.getCreateTransferLimitsState();
        CreateTransferLimitsState.LimitsRetrieved limitsRetrieved = createTransferLimitsState instanceof CreateTransferLimitsState.LimitsRetrieved ? (CreateTransferLimitsState.LimitsRetrieved) createTransferLimitsState : null;
        if (limitsRetrieved == null || (transferLimits = limitsRetrieved.getTransferLimits()) == null) {
            return null;
        }
        Either<ApiAmountLimit, ApiCountLimit> limitTriggered = GetLimitTriggered.getLimitTriggered(input.getAmount(), transferLimits);
        if (limitTriggered instanceof Either.Left) {
            ApiAmountLimit apiAmountLimit = (ApiAmountLimit) ((Either.Left) limitTriggered).getValue();
            MAXTransferContext.EntryPoint entryPoint = input.getEntryPoint();
            String entryPointLoggingIdentifier = input.getEntryPointLoggingIdentifier();
            UUID sessionId = input.getSessionId();
            BigDecimal amount = input.getAmount();
            TransferAccount sourceAccount = input.getSourceAccount();
            if (sourceAccount == null) {
                throw new IllegalStateException("Required value was null.");
            }
            TransferAccount sinkAccount = input.getSinkAccount();
            if (sinkAccount != null) {
                return new Failure.Amount(apiAmountLimit, entryPoint, entryPointLoggingIdentifier, sessionId, amount, sourceAccount, sinkAccount);
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (!(limitTriggered instanceof Either.Right)) {
            if (limitTriggered == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ApiCountLimit apiCountLimit = (ApiCountLimit) ((Either.Right) limitTriggered).getValue();
        MAXTransferContext.EntryPoint entryPoint2 = input.getEntryPoint();
        String entryPointLoggingIdentifier2 = input.getEntryPointLoggingIdentifier();
        BigDecimal amount2 = input.getAmount();
        UUID sessionId2 = input.getSessionId();
        TransferAccount sourceAccount2 = input.getSourceAccount();
        if (sourceAccount2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TransferAccount sinkAccount2 = input.getSinkAccount();
        if (sinkAccount2 != null) {
            return new Failure.Count(apiCountLimit, entryPoint2, entryPointLoggingIdentifier2, sessionId2, amount2, sourceAccount2, sinkAccount2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* compiled from: LimitsHubCheck.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure;", "Lcom/robinhood/android/transfers/lib/validation/ValidationFailure;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "getSinkAccount", "Count", "Amount", "HigherThanAllRemainingAmount", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$Amount;", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$Count;", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$HigherThanAllRemainingAmount;", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Failure extends ValidationFailure {
        BigDecimal getAmount();

        MAXTransferContext.EntryPoint getEntryPoint();

        String getEntryPointLoggingIdentifier();

        UUID getSessionId();

        TransferAccount getSinkAccount();

        TransferAccount getSourceAccount();

        /* compiled from: LimitsHubCheck.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$Count;", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure;", "countLimit", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiCountLimit;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "sessionId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiCountLimit;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getCountLimit", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiCountLimit;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getSessionId", "()Ljava/util/UUID;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Count implements Failure {
            private final BigDecimal amount;
            private final ApiCountLimit countLimit;
            private final MAXTransferContext.EntryPoint entryPoint;
            private final String entryPointLoggingIdentifier;
            private final UUID sessionId;
            private final TransferAccount sinkAccount;
            private final TransferAccount sourceAccount;

            public static /* synthetic */ Count copy$default(Count count, ApiCountLimit apiCountLimit, MAXTransferContext.EntryPoint entryPoint, String str, UUID uuid, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiCountLimit = count.countLimit;
                }
                if ((i & 2) != 0) {
                    entryPoint = count.entryPoint;
                }
                if ((i & 4) != 0) {
                    str = count.entryPointLoggingIdentifier;
                }
                if ((i & 8) != 0) {
                    uuid = count.sessionId;
                }
                if ((i & 16) != 0) {
                    bigDecimal = count.amount;
                }
                if ((i & 32) != 0) {
                    transferAccount = count.sourceAccount;
                }
                if ((i & 64) != 0) {
                    transferAccount2 = count.sinkAccount;
                }
                TransferAccount transferAccount3 = transferAccount;
                TransferAccount transferAccount4 = transferAccount2;
                BigDecimal bigDecimal2 = bigDecimal;
                String str2 = str;
                return count.copy(apiCountLimit, entryPoint, str2, uuid, bigDecimal2, transferAccount3, transferAccount4);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCountLimit getCountLimit() {
                return this.countLimit;
            }

            /* renamed from: component2, reason: from getter */
            public final MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            /* renamed from: component3, reason: from getter */
            public final String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getSessionId() {
                return this.sessionId;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            /* renamed from: component7, reason: from getter */
            public final TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            public final Count copy(ApiCountLimit countLimit, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount) {
                Intrinsics.checkNotNullParameter(countLimit, "countLimit");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
                return new Count(countLimit, entryPoint, entryPointLoggingIdentifier, sessionId, amount, sourceAccount, sinkAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Count)) {
                    return false;
                }
                Count count = (Count) other;
                return Intrinsics.areEqual(this.countLimit, count.countLimit) && this.entryPoint == count.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, count.entryPointLoggingIdentifier) && Intrinsics.areEqual(this.sessionId, count.sessionId) && Intrinsics.areEqual(this.amount, count.amount) && Intrinsics.areEqual(this.sourceAccount, count.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, count.sinkAccount);
            }

            public int hashCode() {
                return (((((((((((this.countLimit.hashCode() * 31) + this.entryPoint.hashCode()) * 31) + this.entryPointLoggingIdentifier.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode();
            }

            public String toString() {
                return "Count(countLimit=" + this.countLimit + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", sessionId=" + this.sessionId + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
            }

            public Count(ApiCountLimit countLimit, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount) {
                Intrinsics.checkNotNullParameter(countLimit, "countLimit");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
                this.countLimit = countLimit;
                this.entryPoint = entryPoint;
                this.entryPointLoggingIdentifier = entryPointLoggingIdentifier;
                this.sessionId = sessionId;
                this.amount = amount;
                this.sourceAccount = sourceAccount;
                this.sinkAccount = sinkAccount;
            }

            public final ApiCountLimit getCountLimit() {
                return this.countLimit;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public UUID getSessionId() {
                return this.sessionId;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public BigDecimal getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
            public void showAlert(BaseActivity activity, EventLogger eventLogger) {
                int i;
                SpannedString spannedString;
                int i2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                ApiTransferAccount.TransferAccountType type2 = getSourceAccount().getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
                if (type2 == transferAccountType || getSinkAccount().getType() == transferAccountType) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i3 = C30383R.string.limits_hub_count_error_dialog_message;
                    String strValueOf = String.valueOf(this.countLimit.getTotal_count());
                    String string2 = activity.getString(C30383R.string.limits_hub_error_dialog_ach_lower_case);
                    if (getSourceAccount().isExternal()) {
                        i = C8331R.string.transfer_deposits_label_lower_case;
                    } else {
                        i = C8331R.string.transfer_withdrawals_label_lower_case;
                    }
                    spannableStringBuilder.append((CharSequence) activity.getString(i3, strValueOf, string2, activity.getString(i), activity.getString(C30383R.string.limits_hub_business_label)));
                    spannableStringBuilder.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                    spannedString = new SpannedString(spannableStringBuilder);
                } else {
                    ApiTransferAccount.TransferAccountType type3 = getSourceAccount().getType();
                    ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.DEBIT_CARD;
                    if (type3 == transferAccountType2 || getSinkAccount().getType() == transferAccountType2) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i4 = C30383R.string.limits_hub_count_error_dialog_message;
                        String strValueOf2 = String.valueOf(this.countLimit.getTotal_count());
                        String string3 = activity.getString(C30383R.string.limits_hub_error_dialog_debit_card_lower_case);
                        if (getSourceAccount().getType().isExternal()) {
                            i2 = C8331R.string.transfer_deposits_label_lower_case;
                        } else {
                            i2 = C8331R.string.transfer_withdrawals_label_lower_case;
                        }
                        spannableStringBuilder2.append((CharSequence) activity.getString(i4, strValueOf2, string3, activity.getString(i2), activity.getString(C30383R.string.limits_hub_calendar_label)));
                        spannableStringBuilder2.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                        spannedString = new SpannedString(spannableStringBuilder2);
                    } else {
                        throw new IllegalStateException(("\n                        \"Unsupported transfer for limits hub check!\n                        \"Source account type: " + getSourceAccount().getType() + ", sink account " + getSinkAccount().getType() + "\")\n                        ").toString());
                    }
                }
                LogLimitsHubCheckFailure.logLimitsHubCheckFailure(eventLogger, getEntryPoint(), getEntryPointLoggingIdentifier(), getSessionId(), getAmount(), getSourceAccount(), getSinkAccount(), this);
                RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C30383R.id.dialog_id_limits_hub_check_failure).setTitle(C30383R.string.limits_hub_error_dialog_title, new Object[0]).setMessage(spannedString).setDismissOnLinkTextClick(true).setPositiveButton(C30383R.string.limits_hub_error_dialog_primary_button, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "limitsHubCheckCountFailure", false, 4, null);
            }
        }

        /* compiled from: LimitsHubCheck.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003JO\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$Amount;", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure;", "amountLimit", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "sessionId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAmountLimit", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getSessionId", "()Ljava/util/UUID;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "shouldShowWiresUpsellDialog", "", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Amount implements Failure {
            private final BigDecimal amount;
            private final ApiAmountLimit amountLimit;
            private final MAXTransferContext.EntryPoint entryPoint;
            private final String entryPointLoggingIdentifier;
            private final UUID sessionId;
            private final boolean shouldShowWiresUpsellDialog;
            private final TransferAccount sinkAccount;
            private final TransferAccount sourceAccount;

            public static /* synthetic */ Amount copy$default(Amount amount, ApiAmountLimit apiAmountLimit, MAXTransferContext.EntryPoint entryPoint, String str, UUID uuid, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiAmountLimit = amount.amountLimit;
                }
                if ((i & 2) != 0) {
                    entryPoint = amount.entryPoint;
                }
                if ((i & 4) != 0) {
                    str = amount.entryPointLoggingIdentifier;
                }
                if ((i & 8) != 0) {
                    uuid = amount.sessionId;
                }
                if ((i & 16) != 0) {
                    bigDecimal = amount.amount;
                }
                if ((i & 32) != 0) {
                    transferAccount = amount.sourceAccount;
                }
                if ((i & 64) != 0) {
                    transferAccount2 = amount.sinkAccount;
                }
                TransferAccount transferAccount3 = transferAccount;
                TransferAccount transferAccount4 = transferAccount2;
                BigDecimal bigDecimal2 = bigDecimal;
                String str2 = str;
                return amount.copy(apiAmountLimit, entryPoint, str2, uuid, bigDecimal2, transferAccount3, transferAccount4);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiAmountLimit getAmountLimit() {
                return this.amountLimit;
            }

            /* renamed from: component2, reason: from getter */
            public final MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            /* renamed from: component3, reason: from getter */
            public final String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getSessionId() {
                return this.sessionId;
            }

            /* renamed from: component5, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            /* renamed from: component7, reason: from getter */
            public final TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            public final Amount copy(ApiAmountLimit amountLimit, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount) {
                Intrinsics.checkNotNullParameter(amountLimit, "amountLimit");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
                return new Amount(amountLimit, entryPoint, entryPointLoggingIdentifier, sessionId, amount, sourceAccount, sinkAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Amount)) {
                    return false;
                }
                Amount amount = (Amount) other;
                return Intrinsics.areEqual(this.amountLimit, amount.amountLimit) && this.entryPoint == amount.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, amount.entryPointLoggingIdentifier) && Intrinsics.areEqual(this.sessionId, amount.sessionId) && Intrinsics.areEqual(this.amount, amount.amount) && Intrinsics.areEqual(this.sourceAccount, amount.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, amount.sinkAccount);
            }

            public int hashCode() {
                return (((((((((((this.amountLimit.hashCode() * 31) + this.entryPoint.hashCode()) * 31) + this.entryPointLoggingIdentifier.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.sourceAccount.hashCode()) * 31) + this.sinkAccount.hashCode();
            }

            public String toString() {
                return "Amount(amountLimit=" + this.amountLimit + ", entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", sessionId=" + this.sessionId + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
            }

            public Amount(ApiAmountLimit amountLimit, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount) {
                Intrinsics.checkNotNullParameter(amountLimit, "amountLimit");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
                this.amountLimit = amountLimit;
                this.entryPoint = entryPoint;
                this.entryPointLoggingIdentifier = entryPointLoggingIdentifier;
                this.sessionId = sessionId;
                this.amount = amount;
                this.sourceAccount = sourceAccount;
                this.sinkAccount = sinkAccount;
                this.shouldShowWiresUpsellDialog = getSourceAccount().getType() == ApiTransferAccount.TransferAccountType.ACH && getSinkAccount().getType() == ApiTransferAccount.TransferAccountType.RHS;
            }

            public final ApiAmountLimit getAmountLimit() {
                return this.amountLimit;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public UUID getSessionId() {
                return this.sessionId;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public BigDecimal getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
            public void showAlert(BaseActivity activity, EventLogger eventLogger) {
                int i;
                SpannedString spannedString;
                int i2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                if (this.shouldShowWiresUpsellDialog) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i3 = C30383R.string.limits_hub_amount_error_wires_upsell_dialog_message;
                    NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
                    BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.amountLimit.getTotal_amount());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
                    spannableStringBuilder.append((CharSequence) activity.getString(i3, strikePriceFormat.format(bigDecimalM822m)));
                    spannableStringBuilder.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                    spannedString = new SpannedString(spannableStringBuilder);
                } else {
                    ApiTransferAccount.TransferAccountType type2 = getSourceAccount().getType();
                    ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
                    if (type2 == transferAccountType || getSinkAccount().getType() == transferAccountType) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i4 = C30383R.string.limits_hub_amount_error_dialog_message;
                        String string2 = activity.getString(C30383R.string.limits_hub_error_dialog_ach_sentence_case);
                        if (getSourceAccount().isExternal()) {
                            i = C8331R.string.transfer_deposits_label_lower_case;
                        } else {
                            i = C8331R.string.transfer_withdrawals_label_lower_case;
                        }
                        String string3 = activity.getString(i);
                        NumberFormatter strikePriceFormat2 = Formats.getStrikePriceFormat();
                        BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.amountLimit.getTotal_amount());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m2, "stripTrailingZeros(...)");
                        spannableStringBuilder2.append((CharSequence) activity.getString(i4, string2, string3, strikePriceFormat2.format(bigDecimalM822m2), activity.getString(C30383R.string.limits_hub_business_label)));
                        spannableStringBuilder2.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                        spannedString = new SpannedString(spannableStringBuilder2);
                    } else {
                        ApiTransferAccount.TransferAccountType type3 = getSourceAccount().getType();
                        ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.DEBIT_CARD;
                        if (type3 == transferAccountType2 || getSinkAccount().getType() == transferAccountType2) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            int i5 = C30383R.string.limits_hub_amount_error_dialog_message;
                            String string4 = activity.getString(C30383R.string.limits_hub_error_dialog_debit_card_sentence_case);
                            if (getSourceAccount().getType().isExternal()) {
                                i2 = C8331R.string.transfer_deposits_label_lower_case;
                            } else {
                                i2 = C8331R.string.transfer_withdrawals_label_lower_case;
                            }
                            String string5 = activity.getString(i2);
                            NumberFormatter strikePriceFormat3 = Formats.getStrikePriceFormat();
                            BigDecimal bigDecimalM822m3 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.amountLimit.getTotal_amount());
                            Intrinsics.checkNotNullExpressionValue(bigDecimalM822m3, "stripTrailingZeros(...)");
                            spannableStringBuilder3.append((CharSequence) activity.getString(i5, string4, string5, strikePriceFormat3.format(bigDecimalM822m3), activity.getString(C30383R.string.limits_hub_calendar_label)));
                            spannableStringBuilder3.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                            spannedString = new SpannedString(spannableStringBuilder3);
                        } else {
                            throw new IllegalStateException(("\n                        \"Unsupported transfer for limits hub check!\n                        \"Source account type: " + getSourceAccount().getType() + ", sink account " + getSinkAccount().getType() + "\")\n                        ").toString());
                        }
                    }
                }
                SpannedString spannedString2 = spannedString;
                LogLimitsHubCheckFailure.logLimitsHubCheckFailure(eventLogger, getEntryPoint(), getEntryPointLoggingIdentifier(), getSessionId(), getAmount(), getSourceAccount(), getSinkAccount(), this);
                if (this.shouldShowWiresUpsellDialog) {
                    LogLimitsHubCheckFailure.logWireUpsellAmountError(eventLogger, getEntryPoint(), getEntryPointLoggingIdentifier(), getSessionId(), getAmount(), getSourceAccount(), getSinkAccount(), this);
                    RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C30383R.id.dialog_id_limits_hub_check_failure_wires_upsell).setTitle(C30383R.string.limits_hub_error_dialog_title, new Object[0]).setMessage(spannedString2).setDismissOnLinkTextClick(true).setPositiveButton(C30383R.string.limits_hub_amount_error_wires_upsell_dialog_primary_button, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "limitsHubCheckAmountFailureWiresUpsell", false, 4, null);
                    return;
                }
                RhDialogFragment.Builder negativeButton2 = RhDialogFragment.INSTANCE.create(activity).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C30383R.id.dialog_id_limits_hub_check_failure).setTitle(C30383R.string.limits_hub_error_dialog_title, new Object[0]).setMessage(spannedString2).setDismissOnLinkTextClick(true).setPositiveButton(C30383R.string.limits_hub_error_dialog_primary_button, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton2, supportFragmentManager2, "limitsHubCheckAmountFailure", false, 4, null);
            }
        }

        /* compiled from: LimitsHubCheck.kt */
        @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003Jg\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$HigherThanAllRemainingAmount;", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "sessionId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "amountLimit", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "outgoingWiresEnabled", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Ljava/lang/String;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;Z)V", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPointLoggingIdentifier", "()Ljava/lang/String;", "getSessionId", "()Ljava/util/UUID;", "getAmount", "()Ljava/math/BigDecimal;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getAmountLimit", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "getOutgoingWiresEnabled", "()Z", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class HigherThanAllRemainingAmount implements Failure {
            private final BigDecimal amount;
            private final ApiAmountLimit amountLimit;
            private final TransferDirectionV2 direction;
            private final MAXTransferContext.EntryPoint entryPoint;
            private final String entryPointLoggingIdentifier;
            private final boolean outgoingWiresEnabled;
            private final UUID sessionId;
            private final TransferAccount sinkAccount;
            private final TransferAccount sourceAccount;

            public static /* synthetic */ HigherThanAllRemainingAmount copy$default(HigherThanAllRemainingAmount higherThanAllRemainingAmount, MAXTransferContext.EntryPoint entryPoint, String str, UUID uuid, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, TransferDirectionV2 transferDirectionV2, ApiAmountLimit apiAmountLimit, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    entryPoint = higherThanAllRemainingAmount.entryPoint;
                }
                if ((i & 2) != 0) {
                    str = higherThanAllRemainingAmount.entryPointLoggingIdentifier;
                }
                if ((i & 4) != 0) {
                    uuid = higherThanAllRemainingAmount.sessionId;
                }
                if ((i & 8) != 0) {
                    bigDecimal = higherThanAllRemainingAmount.amount;
                }
                if ((i & 16) != 0) {
                    transferAccount = higherThanAllRemainingAmount.sourceAccount;
                }
                if ((i & 32) != 0) {
                    transferAccount2 = higherThanAllRemainingAmount.sinkAccount;
                }
                if ((i & 64) != 0) {
                    transferDirectionV2 = higherThanAllRemainingAmount.direction;
                }
                if ((i & 128) != 0) {
                    apiAmountLimit = higherThanAllRemainingAmount.amountLimit;
                }
                if ((i & 256) != 0) {
                    z = higherThanAllRemainingAmount.outgoingWiresEnabled;
                }
                ApiAmountLimit apiAmountLimit2 = apiAmountLimit;
                boolean z2 = z;
                TransferAccount transferAccount3 = transferAccount2;
                TransferDirectionV2 transferDirectionV22 = transferDirectionV2;
                TransferAccount transferAccount4 = transferAccount;
                UUID uuid2 = uuid;
                return higherThanAllRemainingAmount.copy(entryPoint, str, uuid2, bigDecimal, transferAccount4, transferAccount3, transferDirectionV22, apiAmountLimit2, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getSessionId() {
                return this.sessionId;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component5, reason: from getter */
            public final TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            /* renamed from: component7, reason: from getter */
            public final TransferDirectionV2 getDirection() {
                return this.direction;
            }

            /* renamed from: component8, reason: from getter */
            public final ApiAmountLimit getAmountLimit() {
                return this.amountLimit;
            }

            /* renamed from: component9, reason: from getter */
            public final boolean getOutgoingWiresEnabled() {
                return this.outgoingWiresEnabled;
            }

            public final HigherThanAllRemainingAmount copy(MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, TransferDirectionV2 direction, ApiAmountLimit amountLimit, boolean outgoingWiresEnabled) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(amountLimit, "amountLimit");
                return new HigherThanAllRemainingAmount(entryPoint, entryPointLoggingIdentifier, sessionId, amount, sourceAccount, sinkAccount, direction, amountLimit, outgoingWiresEnabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HigherThanAllRemainingAmount)) {
                    return false;
                }
                HigherThanAllRemainingAmount higherThanAllRemainingAmount = (HigherThanAllRemainingAmount) other;
                return this.entryPoint == higherThanAllRemainingAmount.entryPoint && Intrinsics.areEqual(this.entryPointLoggingIdentifier, higherThanAllRemainingAmount.entryPointLoggingIdentifier) && Intrinsics.areEqual(this.sessionId, higherThanAllRemainingAmount.sessionId) && Intrinsics.areEqual(this.amount, higherThanAllRemainingAmount.amount) && Intrinsics.areEqual(this.sourceAccount, higherThanAllRemainingAmount.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, higherThanAllRemainingAmount.sinkAccount) && this.direction == higherThanAllRemainingAmount.direction && Intrinsics.areEqual(this.amountLimit, higherThanAllRemainingAmount.amountLimit) && this.outgoingWiresEnabled == higherThanAllRemainingAmount.outgoingWiresEnabled;
            }

            public int hashCode() {
                int iHashCode = ((((((this.entryPoint.hashCode() * 31) + this.entryPointLoggingIdentifier.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.amount.hashCode()) * 31;
                TransferAccount transferAccount = this.sourceAccount;
                int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
                TransferAccount transferAccount2 = this.sinkAccount;
                return ((((((iHashCode2 + (transferAccount2 != null ? transferAccount2.hashCode() : 0)) * 31) + this.direction.hashCode()) * 31) + this.amountLimit.hashCode()) * 31) + Boolean.hashCode(this.outgoingWiresEnabled);
            }

            public String toString() {
                return "HigherThanAllRemainingAmount(entryPoint=" + this.entryPoint + ", entryPointLoggingIdentifier=" + this.entryPointLoggingIdentifier + ", sessionId=" + this.sessionId + ", amount=" + this.amount + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", direction=" + this.direction + ", amountLimit=" + this.amountLimit + ", outgoingWiresEnabled=" + this.outgoingWiresEnabled + ")";
            }

            public HigherThanAllRemainingAmount(MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount transferAccount, TransferAccount transferAccount2, TransferDirectionV2 direction, ApiAmountLimit amountLimit, boolean z) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
                Intrinsics.checkNotNullParameter(sessionId, "sessionId");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(amountLimit, "amountLimit");
                this.entryPoint = entryPoint;
                this.entryPointLoggingIdentifier = entryPointLoggingIdentifier;
                this.sessionId = sessionId;
                this.amount = amount;
                this.sourceAccount = transferAccount;
                this.sinkAccount = transferAccount2;
                this.direction = direction;
                this.amountLimit = amountLimit;
                this.outgoingWiresEnabled = z;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ HigherThanAllRemainingAmount(MAXTransferContext.EntryPoint entryPoint, String str, UUID uuid, BigDecimal bigDecimal, TransferAccount transferAccount, TransferAccount transferAccount2, TransferDirectionV2 transferDirectionV2, ApiAmountLimit apiAmountLimit, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                boolean z2;
                ApiAmountLimit apiAmountLimit2;
                TransferDirectionV2 transferDirectionV22;
                TransferAccount transferAccount3;
                transferAccount = (i & 16) != 0 ? null : transferAccount;
                if ((i & 32) != 0) {
                    z2 = z;
                    apiAmountLimit2 = apiAmountLimit;
                    transferDirectionV22 = transferDirectionV2;
                    transferAccount3 = null;
                } else {
                    z2 = z;
                    apiAmountLimit2 = apiAmountLimit;
                    transferDirectionV22 = transferDirectionV2;
                    transferAccount3 = transferAccount2;
                }
                this(entryPoint, str, uuid, bigDecimal, transferAccount, transferAccount3, transferDirectionV22, apiAmountLimit2, z2);
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public MAXTransferContext.EntryPoint getEntryPoint() {
                return this.entryPoint;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public String getEntryPointLoggingIdentifier() {
                return this.entryPointLoggingIdentifier;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public UUID getSessionId() {
                return this.sessionId;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public BigDecimal getAmount() {
                return this.amount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSourceAccount() {
                return this.sourceAccount;
            }

            @Override // com.robinhood.android.transfers.lib.validation.LimitsHubCheck.Failure
            public TransferAccount getSinkAccount() {
                return this.sinkAccount;
            }

            public final TransferDirectionV2 getDirection() {
                return this.direction;
            }

            public final ApiAmountLimit getAmountLimit() {
                return this.amountLimit;
            }

            public final boolean getOutgoingWiresEnabled() {
                return this.outgoingWiresEnabled;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.android.transfers.lib.validation.ValidationFailure
            public void showAlert(BaseActivity activity, EventLogger eventLogger) {
                int i;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                Money moneyForLogging = ExtensionsKt.toMoneyForLogging(getAmount());
                MAXTransferContext.EntryPoint entryPoint = getEntryPoint();
                String entryPointLoggingIdentifier = getEntryPointLoggingIdentifier();
                String string2 = getSessionId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                Context.ProductTag productTag = null;
                int i5 = 0;
                String str = null;
                NewsFeedItem newsFeedItem = null;
                DirectDepositContext directDepositContext = null;
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
                String str2 = null;
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
                String str3 = null;
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
                int i6 = -1;
                int i7 = -131073;
                int i8 = -1;
                int i9 = -1;
                int i10 = -1;
                int i11 = -1;
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
                Context context = new Context(i2, i3, i4, objArr2, objArr3, objArr4, objArr5, productTag, i5, str, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, newsFeedItem, objArr12, objArr13, objArr14, objArr15, directDepositContext, objArr, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str2, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, new MAXTransferContext(null, moneyForLogging, null, null, null, null, entryPoint, null, string2, null, null, null, null, null, null, entryPointLoggingIdentifier, null, null, null, null, 1015485, null), mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str3, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 16383, null);
                EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.CREATE_TRANSFER_V2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell-amount-too-high", 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0), null, context, 9, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = C30383R.string.limits_hub_amount_error_wires_upsell_dialog_message;
                NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
                BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.amountLimit.getTotal_amount());
                Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
                spannableStringBuilder.append((CharSequence) activity.getString(i12, strikePriceFormat.format(bigDecimalM822m)));
                spannableStringBuilder.append(activity.getText(C30383R.string.limits_hub_error_learn_more));
                RhDialogFragment.Builder dismissOnLinkTextClick = RhDialogFragment.INSTANCE.create(activity).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(C30383R.string.limits_hub_error_dialog_title, new Object[0]).setMessage(new SpannedString(spannableStringBuilder)).setDismissOnLinkTextClick(true);
                TransferDirectionV2 transferDirectionV2 = this.direction;
                if (transferDirectionV2 == TransferDirectionV2.INTER_ENTITY) {
                    RhDialogFragment.Builder id = dismissOnLinkTextClick.setId(C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_inter_entity);
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(id, supportFragmentManager, "limitsHubCheckAmountFailure", false, 4, null);
                    return;
                }
                TransferDirectionV2 transferDirectionV22 = TransferDirectionV2.DEPOSIT;
                if (transferDirectionV2 == transferDirectionV22) {
                    i = C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_deposit;
                } else if (this.outgoingWiresEnabled) {
                    i = C30383R.id.dialog_id_limits_hub_check_failure_amount_higher_withdrawal;
                } else {
                    i = C30383R.id.dialog_id_limits_hub_check_failure_amount_no_op;
                }
                dismissOnLinkTextClick.setId(i);
                if (this.direction == transferDirectionV22 || this.outgoingWiresEnabled) {
                    dismissOnLinkTextClick.setPositiveButton(C30383R.string.limits_hub_amount_error_wires_upsell_dialog_primary_button, new Object[0]).setNegativeButton(C11048R.string.general_label_close, new Object[0]);
                }
                FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(dismissOnLinkTextClick, supportFragmentManager2, "limitsHubCheckAmountFailure", false, 4, null);
            }
        }
    }
}
