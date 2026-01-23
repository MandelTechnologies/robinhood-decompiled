package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.util.Money;
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
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoFeeTiers;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import okio.ByteString;

/* compiled from: CryptoFeeTierUpgradedDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b(J\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b*J-\u0010+\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0019\u0010\"\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedDataState;", "", "feeTierInfoResult", "Lkotlin/Result;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "canSkipNotificationPromptResult", "", "<init>", "(Lkotlin/Result;Lkotlin/Result;)V", "getFeeTierInfoResult-xLWZpok", "()Lkotlin/Result;", "getCanSkipNotificationPromptResult-xLWZpok", "feeRatesSection", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "getFeeRatesSection", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/FeeRatesSection;", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "descriptionText", "getDescriptionText", "helperText", "getHelperText$annotations", "()V", "getHelperText", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;", "getPrimaryButton", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/feeTierUpgraded/CryptoFeeTierUpgradedViewState$PrimaryButton;", "isContentLoading", "()Z", "showError", "getShowError", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component1-xLWZpok", "component2", "component2-xLWZpok", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoFeeTierUpgradedDataState {
    public static final int $stable = 8;
    private final Result<Boolean> canSkipNotificationPromptResult;
    private final Result<CryptoFeeTierInfo> feeTierInfoResult;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoFeeTierUpgradedDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoFeeTierUpgradedDataState copy$default(CryptoFeeTierUpgradedDataState cryptoFeeTierUpgradedDataState, Result result, Result result2, int i, Object obj) {
        if ((i & 1) != 0) {
            result = cryptoFeeTierUpgradedDataState.feeTierInfoResult;
        }
        if ((i & 2) != 0) {
            result2 = cryptoFeeTierUpgradedDataState.canSkipNotificationPromptResult;
        }
        return cryptoFeeTierUpgradedDataState.copy(result, result2);
    }

    public static /* synthetic */ void getHelperText$annotations() {
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<CryptoFeeTierInfo> m25894component1xLWZpok() {
        return this.feeTierInfoResult;
    }

    /* renamed from: component2-xLWZpok, reason: not valid java name */
    public final Result<Boolean> m25895component2xLWZpok() {
        return this.canSkipNotificationPromptResult;
    }

    public final CryptoFeeTierUpgradedDataState copy(Result<CryptoFeeTierInfo> feeTierInfoResult, Result<Boolean> canSkipNotificationPromptResult) {
        return new CryptoFeeTierUpgradedDataState(feeTierInfoResult, canSkipNotificationPromptResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierUpgradedDataState)) {
            return false;
        }
        CryptoFeeTierUpgradedDataState cryptoFeeTierUpgradedDataState = (CryptoFeeTierUpgradedDataState) other;
        return Intrinsics.areEqual(this.feeTierInfoResult, cryptoFeeTierUpgradedDataState.feeTierInfoResult) && Intrinsics.areEqual(this.canSkipNotificationPromptResult, cryptoFeeTierUpgradedDataState.canSkipNotificationPromptResult);
    }

    public int hashCode() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        int iM28554hashCodeimpl = (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31;
        Result<Boolean> result2 = this.canSkipNotificationPromptResult;
        return iM28554hashCodeimpl + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0);
    }

    public String toString() {
        return "CryptoFeeTierUpgradedDataState(feeTierInfoResult=" + this.feeTierInfoResult + ", canSkipNotificationPromptResult=" + this.canSkipNotificationPromptResult + ")";
    }

    public CryptoFeeTierUpgradedDataState(Result<CryptoFeeTierInfo> result, Result<Boolean> result2) {
        this.feeTierInfoResult = result;
        this.canSkipNotificationPromptResult = result2;
    }

    public /* synthetic */ CryptoFeeTierUpgradedDataState(Result result, Result result2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : result2);
    }

    /* renamed from: getFeeTierInfoResult-xLWZpok, reason: not valid java name */
    public final Result<CryptoFeeTierInfo> m25897getFeeTierInfoResultxLWZpok() {
        return this.feeTierInfoResult;
    }

    /* renamed from: getCanSkipNotificationPromptResult-xLWZpok, reason: not valid java name */
    public final Result<Boolean> m25896getCanSkipNotificationPromptResultxLWZpok() {
        return this.canSkipNotificationPromptResult;
    }

    public final CryptoFeeTierUpgradedViewState2 getFeeRatesSection() {
        CryptoFeeTierInfo cryptoFeeTierInfo;
        CryptoFeeTier nextFeeTier;
        String feeRateText;
        CryptoFeeTier currentFeeTier;
        String feeRateText2;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay feeRateDisplay = null;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
        } else {
            cryptoFeeTierInfo = null;
        }
        if (cryptoFeeTierInfo != null && cryptoFeeTierInfo.getNextFeeTier() == null) {
            return CryptoFeeTierUpgradedViewState2.Hidden.INSTANCE;
        }
        CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay feeRateDisplay2 = (cryptoFeeTierInfo == null || (currentFeeTier = cryptoFeeTierInfo.getCurrentFeeTier()) == null || (feeRateText2 = CryptoFeeTiers.getFeeRateText(currentFeeTier)) == null) ? null : new CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_current_fee_tier, new Object[0]), feeRateText2);
        if (cryptoFeeTierInfo != null && (nextFeeTier = cryptoFeeTierInfo.getNextFeeTier()) != null && (feeRateText = CryptoFeeTiers.getFeeRateText(nextFeeTier)) != null) {
            feeRateDisplay = new CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_next_fee_tier, new Object[0]), feeRateText);
        }
        return new CryptoFeeTierUpgradedViewState2.Show(feeRateDisplay2, feeRateDisplay);
    }

    public final StringResource getTitleText() {
        CryptoFeeTierInfo cryptoFeeTierInfo;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
        } else {
            cryptoFeeTierInfo = null;
        }
        if (cryptoFeeTierInfo != null) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_title, new Object[0]);
        }
        return null;
    }

    public final StringResource getDescriptionText() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C40095R.string.crypto_order_confirmation_fee_tier_upgraded_desc;
                CryptoFeeTier previousFeeTier = cryptoFeeTierInfo.getPreviousFeeTier();
                if (previousFeeTier != null) {
                    return companion.invoke(i, CryptoFeeTiers.getFeeRateText(previousFeeTier), CryptoFeeTiers.getFeeRateText(cryptoFeeTierInfo.getCurrentFeeTier()), Money.formatCompact$default(cryptoFeeTierInfo.getCurrentFeeTier().getMinVolume(), null, null, 0, 3, null), Integer.valueOf(cryptoFeeTierInfo.getEvaluationPeriodDays()));
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }

    public final StringResource getHelperText() {
        Long lockupPeriodInSec;
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null && (lockupPeriodInSec = cryptoFeeTierInfo.getLockupPeriodInSec()) != null) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_guaranteed_for_days, CryptoFeeTiers.getFeeRateText(cryptoFeeTierInfo.getCurrentFeeTier()), Integer.valueOf((int) Duration.INSTANCE.convert(lockupPeriodInSec.longValue(), DurationUnitJvm.SECONDS, DurationUnitJvm.DAYS)));
            }
        }
        return null;
    }

    public final CryptoFeeTierUpgradedViewState.PrimaryButton getPrimaryButton() {
        Result<Boolean> result;
        if (isContentLoading() || (result = this.canSkipNotificationPromptResult) == null) {
            return null;
        }
        Object value = result.getValue();
        if (Result.m28553exceptionOrNullimpl(value) != null) {
            return CryptoFeeTierUpgradedViewState.PrimaryButton.DONE;
        }
        if (((Boolean) value).booleanValue()) {
            return CryptoFeeTierUpgradedViewState.PrimaryButton.DONE;
        }
        return CryptoFeeTierUpgradedViewState.PrimaryButton.CONTINUE;
    }

    public final boolean isContentLoading() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            obj = (CryptoFeeTierInfo) (Result.m28555isFailureimpl(value) ? null : value);
        }
        return obj == null;
    }

    public final boolean getShowError() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        return result != null && Result.m28555isFailureimpl(result.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getEventContext() {
        Result<CryptoFeeTierInfo> result = this.feeTierInfoResult;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CryptoFeeTierInfo cryptoFeeTierInfo = (CryptoFeeTierInfo) value;
            if (cryptoFeeTierInfo != null) {
                ByteString byteString = null;
                String str = null;
                Context.ProductTag productTag = null;
                int i = 0;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Screen screen = null;
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
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                int i5 = -1;
                int i6 = -1;
                int i7 = -1;
                return new Context(0, 0, 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, str, productTag, i, str2, str3, str4, screen, str5, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str6, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str7, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, new CryptoPostTradeFeeTierUpgradedContext(cryptoFeeTierInfo.getCurrentFeeTier().getFeeRatio().doubleValue(), byteString, 2, null), legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i2, i3, i4, i5, i6, i7, 16382, null);
            }
        }
        return null;
    }
}
