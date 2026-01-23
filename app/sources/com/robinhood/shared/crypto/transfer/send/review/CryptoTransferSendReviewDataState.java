package com.robinhood.shared.crypto.transfer.send.review;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.util.text.MessageFormatting;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
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
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.BreakingNewsContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
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
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

/* compiled from: CryptoTransferSendReviewDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\fJ\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0007HÂ\u0003J\t\u0010T\u001a\u00020\tHÂ\u0003J1\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010V\u001a\u00020\u00052\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020/HÖ\u0001J\t\u0010Y\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0019R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010*\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u000fR\u0014\u0010,\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0013R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b3\u0010\u0019R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b9\u0010\u0019R\u0016\u0010:\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0016\u0010<\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0019R\u0011\u0010>\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b>\u0010\u000fR\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010C\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\bH\u00101R\u0014\u0010I\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDataState;", "", "args", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;", "isLoading", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;ZLcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;)V", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;)V", "getArgs", "()Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle$feature_crypto_transfer_externalDebug", "assetCurrencyCode", "", "getAssetCurrencyCode$feature_crypto_transfer_externalDebug", "()Ljava/lang/String;", "totalFeesRowVisible", "getTotalFeesRowVisible$feature_crypto_transfer_externalDebug", PlaceTypes.ADDRESS, "getAddress$feature_crypto_transfer_externalDebug", "networkFeeMeta1", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "getNetworkFeeMeta1$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "networkFeeMeta2", "getNetworkFeeMeta2$feature_crypto_transfer_externalDebug", "totalMeta1", "getTotalMeta1$feature_crypto_transfer_externalDebug", "totalMeta2", "getTotalMeta2$feature_crypto_transfer_externalDebug", "helperText", "getHelperText", "memoVisible", "getMemoVisible$feature_crypto_transfer_externalDebug", MemoInputActivity.EXTRA_MEMO, "getMemo$feature_crypto_transfer_externalDebug", "submitButtonText", "", "getSubmitButtonText", "()I", "warningSheetTitle", "getWarningSheetTitle", "withdrawalId", "Ljava/util/UUID;", "getWithdrawalId", "()Ljava/util/UUID;", "warningSheetBody", "getWarningSheetBody", "selectedNetworkTypeName", "getSelectedNetworkTypeName", "selectedNetworkName", "getSelectedNetworkName", "isSubmitButtonEnabled", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "disclosureUrl", "getDisclosureUrl", "networkFeeSheetContentState", "Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;", "getNetworkFeeSheetContentState", "()Lcom/robinhood/shared/crypto/transfer/send/review/NetworkFeeSheetContentState;", "reviewDetailsState", "Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "getReviewDetailsState", "()Lcom/robinhood/shared/crypto/transfer/send/review/ReviewDetailsState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendReviewDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final CryptoTransferSendReviewFragment.Args args;
    private final CryptoInstrumentInputHelper cryptoInstrumentInputHelper;
    private final boolean isLoading;

    /* compiled from: CryptoTransferSendReviewDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.values().length];
            try {
                iArr[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.GOLD_ZERO_NETWORK_FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoInputMode.values().length];
            try {
                iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component4, reason: from getter */
    private final CryptoInstrumentInputHelper getCryptoInstrumentInputHelper() {
        return this.cryptoInstrumentInputHelper;
    }

    public static /* synthetic */ CryptoTransferSendReviewDataState copy$default(CryptoTransferSendReviewDataState cryptoTransferSendReviewDataState, CryptoTransferSendReviewFragment.Args args, boolean z, AppType appType, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            args = cryptoTransferSendReviewDataState.args;
        }
        if ((i & 2) != 0) {
            z = cryptoTransferSendReviewDataState.isLoading;
        }
        if ((i & 4) != 0) {
            appType = cryptoTransferSendReviewDataState.appType;
        }
        if ((i & 8) != 0) {
            cryptoInstrumentInputHelper = cryptoTransferSendReviewDataState.cryptoInstrumentInputHelper;
        }
        return cryptoTransferSendReviewDataState.copy(args, z, appType, cryptoInstrumentInputHelper);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTransferSendReviewFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoTransferSendReviewDataState copy(CryptoTransferSendReviewFragment.Args args, boolean isLoading, AppType appType, CryptoInstrumentInputHelper cryptoInstrumentInputHelper) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        return new CryptoTransferSendReviewDataState(args, isLoading, appType, cryptoInstrumentInputHelper);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendReviewDataState)) {
            return false;
        }
        CryptoTransferSendReviewDataState cryptoTransferSendReviewDataState = (CryptoTransferSendReviewDataState) other;
        return Intrinsics.areEqual(this.args, cryptoTransferSendReviewDataState.args) && this.isLoading == cryptoTransferSendReviewDataState.isLoading && this.appType == cryptoTransferSendReviewDataState.appType && Intrinsics.areEqual(this.cryptoInstrumentInputHelper, cryptoTransferSendReviewDataState.cryptoInstrumentInputHelper);
    }

    public int hashCode() {
        return (((((this.args.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.appType.hashCode()) * 31) + this.cryptoInstrumentInputHelper.hashCode();
    }

    public String toString() {
        return "CryptoTransferSendReviewDataState(args=" + this.args + ", isLoading=" + this.isLoading + ", appType=" + this.appType + ", cryptoInstrumentInputHelper=" + this.cryptoInstrumentInputHelper + ")";
    }

    public CryptoTransferSendReviewDataState(CryptoTransferSendReviewFragment.Args args, boolean z, AppType appType, CryptoInstrumentInputHelper cryptoInstrumentInputHelper) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        this.args = args;
        this.isLoading = z;
        this.appType = appType;
        this.cryptoInstrumentInputHelper = cryptoInstrumentInputHelper;
    }

    public final CryptoTransferSendReviewFragment.Args getArgs() {
        return this.args;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoTransferSendReviewDataState(AppType appType, CryptoTransferSendReviewFragment.Args args) {
        this(args, false, appType, new CryptoInstrumentInputHelper(args.getUiCurrencyPair()));
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(args, "args");
    }

    public final StringResource getTitle$feature_crypto_transfer_externalDebug() {
        if (this.args.isFullAmount()) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_review_title_total, this.args.getUiCurrencyPair().getAssetCurrency().getCode());
        }
        if (this.args.getCryptoInputMode() == CryptoInputMode.QUOTE_CURRENCY) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C37934R.string.crypto_send_fiat_amount;
            Money fiatEnteredAmountAtRequest = this.args.getWithdrawal().getFiatEnteredAmountAtRequest();
            if (fiatEnteredAmountAtRequest != null) {
                return companion.invoke(i, Money.format$default(fiatEnteredAmountAtRequest, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null), this.args.getUiCurrencyPair().getAssetCurrency().getName());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        CryptoInputMode cryptoInputMode = this.args.getCryptoInputMode();
        CryptoInputMode cryptoInputMode2 = CryptoInputMode.ASSET_CURRENCY;
        if (cryptoInputMode == cryptoInputMode2) {
            return StringResource.INSTANCE.invoke((CharSequence) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.args.getWithdrawal().getCryptoAmountTransferred(), null, cryptoInputMode2, true, false, false, false, 114, null).getFirst());
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final StringResource getSubtitle$feature_crypto_transfer_externalDebug() {
        if (this.args.isFullAmount()) {
            return StringResource.INSTANCE.invoke((CharSequence) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.args.getWithdrawal().getCryptoTotalAmountTransferred(), null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 114, null).getFirst());
        }
        if (this.args.getCryptoInputMode() == CryptoInputMode.QUOTE_CURRENCY) {
            return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getAssetCurrency(), (BigDecimal) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.args.getWithdrawal().getCryptoAmountTransferred(), null, CryptoInputMode.ASSET_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null).component2(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (this.args.getCryptoInputMode() == CryptoInputMode.ASSET_CURRENCY) {
            BigDecimal bigDecimalMultiply = this.args.getWithdrawal().getCryptoAmountTransferred().multiply(this.args.getWithdrawal().getFiatMarketRateAtRequest().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_fiat_amount_single_line, CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getQuoteCurrency(), bigDecimalMultiply, false, false, null, 0, null, null, false, false, false, true, 1022, null), this.args.getUiCurrencyPair().getAssetCurrency().getName());
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final String getAssetCurrencyCode$feature_crypto_transfer_externalDebug() {
        return this.args.getUiCurrencyPair().getDisplaySymbol();
    }

    public final boolean getTotalFeesRowVisible$feature_crypto_transfer_externalDebug() {
        return !this.args.isFullAmount();
    }

    public final String getAddress$feature_crypto_transfer_externalDebug() {
        StringBuilder sb = new StringBuilder();
        String strSubstring = this.args.getWithdrawal().getWithdrawalAddress().substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append("…");
        String strSubstring2 = this.args.getWithdrawal().getWithdrawalAddress().substring(this.args.getWithdrawal().getWithdrawalAddress().length() - 5, this.args.getWithdrawal().getWithdrawalAddress().length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public final NetworkFeeData getNetworkFeeMeta1$feature_crypto_transfer_externalDebug() {
        Tuples2 tuples2M3642to;
        CryptoTransferWithdrawal withdrawal = this.args.getWithdrawal();
        UiCurrencyPair uiCurrencyPair = this.args.getUiCurrencyPair();
        if (this.args.isFullAmount() || this.args.getCryptoInputMode() == CryptoInputMode.ASSET_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getAssetCurrency(), withdrawal.getCryptoNetworkBaseFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getAssetCurrency(), withdrawal.getCryptoNetworkFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null));
        } else if (this.args.getCryptoInputMode() == CryptoInputMode.QUOTE_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrency(), withdrawal.getCryptoNetworkBaseFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null), CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getQuoteCurrency(), withdrawal.getCryptoNetworkFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null));
        } else {
            throw new IllegalStateException("This should not be programmatically possible");
        }
        String str = (String) tuples2M3642to.component1();
        String str2 = (String) tuples2M3642to.component2();
        ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason networkFeeRefundReason = withdrawal.getNetworkFeeRefundReason();
        int i = networkFeeRefundReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkFeeRefundReason.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new NetworkFeeData.GoldRefund.Review(str2, str);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new NetworkFeeData.Default(str2);
    }

    public final NetworkFeeData getNetworkFeeMeta2$feature_crypto_transfer_externalDebug() {
        Tuples2 tuples2M3642to;
        CryptoTransferWithdrawal withdrawal = this.args.getWithdrawal();
        UiCurrencyPair uiCurrencyPair = this.args.getUiCurrencyPair();
        if (this.args.isFullAmount() || this.args.getCryptoInputMode() == CryptoInputMode.ASSET_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getQuoteCurrency(), this.args.getWithdrawal().getCryptoNetworkBaseFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null), CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getQuoteCurrency(), this.args.getWithdrawal().getCryptoNetworkFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null));
        } else if (this.args.getCryptoInputMode() == CryptoInputMode.QUOTE_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getAssetCurrency(), withdrawal.getCryptoNetworkBaseFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(uiCurrencyPair.getAssetCurrency(), withdrawal.getCryptoNetworkFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null));
        } else {
            throw new IllegalStateException("This should not be programmatically possible");
        }
        String str = (String) tuples2M3642to.component1();
        String str2 = (String) tuples2M3642to.component2();
        ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason networkFeeRefundReason = withdrawal.getNetworkFeeRefundReason();
        int i = networkFeeRefundReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkFeeRefundReason.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new NetworkFeeData.GoldRefund.Review(str2, str);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new NetworkFeeData.Default(str2);
    }

    public final String getTotalMeta1$feature_crypto_transfer_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.args.getCryptoInputMode().ordinal()];
        if (i == 1) {
            return Money.format$default(this.args.getWithdrawal().getFiatTotalAmountAtRequest(), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getAssetCurrency(), this.args.getWithdrawal().getCryptoTotalAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public final String getTotalMeta2$feature_crypto_transfer_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.args.getCryptoInputMode().ordinal()];
        if (i == 1) {
            return CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getAssetCurrency(), this.args.getWithdrawal().getCryptoTotalAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Money.format$default(this.args.getWithdrawal().getFiatTotalAmountAtRequest(), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null);
    }

    public final StringResource getHelperText() {
        if (this.args.isFullAmount()) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_review_subtractive_disclosure, CurrencyDefinitions.formatCurrency$default(this.args.getUiCurrencyPair().getAssetCurrency(), this.args.getWithdrawal().getCryptoTotalAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_review_additive_disclosure, new Object[0]);
    }

    public final boolean getMemoVisible$feature_crypto_transfer_externalDebug() {
        return this.args.getAddressTagConfig() != null;
    }

    public final StringResource getMemo$feature_crypto_transfer_externalDebug() {
        String addressTag = this.args.getWithdrawal().getAddressTag();
        if (addressTag == null || StringsKt.isBlank(addressTag)) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_send_review_memo_label_empty, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        String addressTag2 = this.args.getWithdrawal().getAddressTag();
        if (addressTag2 != null) {
            return companion.invoke(addressTag2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int getSubmitButtonText() {
        String addressTag;
        if (this.args.getAddressTagConfig() != null && ((addressTag = this.args.getWithdrawal().getAddressTag()) == null || StringsKt.isBlank(addressTag))) {
            return C37934R.string.crypto_transfer_send_review_submit_without_memo;
        }
        return C11048R.string.general_action_submit;
    }

    public final String getWarningSheetTitle() {
        CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet = this.args.getSubmitWarningSheet();
        if (submitWarningSheet != null) {
            return submitWarningSheet.getTitle();
        }
        return null;
    }

    public final UUID getWithdrawalId() {
        return this.args.getWithdrawal().getWithdrawalId();
    }

    public final String getWarningSheetBody() {
        String bodyMarkdown;
        CryptoTransferConfig.TransferWarnings.Stage.Warning submitWarningSheet = this.args.getSubmitWarningSheet();
        if (submitWarningSheet == null || (bodyMarkdown = submitWarningSheet.getBodyMarkdown()) == null) {
            return null;
        }
        return MessageFormatting.formatMessageWith(bodyMarkdown, MapsKt.mapOf(Tuples4.m3642to(PlaceTypes.ADDRESS, this.args.getWithdrawal().getWithdrawalAddress())));
    }

    private final String getSelectedNetworkTypeName() {
        ApiCryptoSupportedNetworks.CryptoNetwork.NetworkInfo network_info;
        ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork = this.args.getSelectedNetwork();
        if (selectedNetwork == null || (network_info = selectedNetwork.getNetwork_info()) == null) {
            return null;
        }
        return network_info.getType_name();
    }

    private final String getSelectedNetworkName() {
        ApiCryptoSupportedNetworks.CryptoNetwork.NetworkInfo network_info;
        ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork = this.args.getSelectedNetwork();
        if (selectedNetwork == null || (network_info = selectedNetwork.getNetwork_info()) == null) {
            return null;
        }
        return network_info.getName();
    }

    public final boolean isSubmitButtonEnabled() {
        return !this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context getLoggingContext() {
        String currencyIdString = this.args.getCurrencyIdString();
        String loggingSessionIdString = this.args.getLoggingSessionIdString();
        String stringOrEmpty = Uuids.toStringOrEmpty(getWithdrawalId());
        double d = 0.0d;
        String str = null;
        String str2 = null;
        Boolean r11 = null;
        Boolean r12 = null;
        CryptoTransferContext.SecurityContext securityContext = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ByteString byteString = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i4 = 0;
        Screen screen = null;
        Feedback feedback = null;
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
        String str10 = null;
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
        String str11 = null;
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
        int i5 = -1;
        int i6 = -1;
        int i7 = -257;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new Context(i, i2, i3, str6, str7, str8, str9, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, screen, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, feedback, objArr, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str10, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, new CryptoTransferContext(currencyIdString, loggingSessionIdString, Uuids.toStringOrEmpty(getWithdrawalId()), d, str, str2, r11, r12, securityContext, stringOrEmpty, str3, str4, str5, byteString, 15864, null), cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str11, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    public final Screen getLoggingScreen() {
        return new Screen(Screen.Name.CRYPTO_TRANSFER_SEND_REVIEW, null, this.args.getCurrencyIdString(), null, 10, null);
    }

    public final int getDisclosureUrl() {
        if (this.appType == AppType.RHC) {
            return C37934R.string.crypto_transfer_disclosure_url_rhc;
        }
        return C37934R.string.crypto_transfer_disclosure_url;
    }

    private final NetworkFeeSheetContentState getNetworkFeeSheetContentState() {
        return new NetworkFeeSheetContentState(this.appType);
    }

    public final ReviewDetailsState getReviewDetailsState() {
        return new ReviewDetailsState(getAssetCurrencyCode$feature_crypto_transfer_externalDebug(), getTitle$feature_crypto_transfer_externalDebug(), getSubtitle$feature_crypto_transfer_externalDebug(), getTotalFeesRowVisible$feature_crypto_transfer_externalDebug(), getAddress$feature_crypto_transfer_externalDebug(), getSelectedNetworkName(), getSelectedNetworkTypeName(), getNetworkFeeMeta1$feature_crypto_transfer_externalDebug(), getNetworkFeeMeta2$feature_crypto_transfer_externalDebug(), getNetworkFeeSheetContentState(), getTotalMeta1$feature_crypto_transfer_externalDebug(), getTotalMeta2$feature_crypto_transfer_externalDebug(), getMemoVisible$feature_crypto_transfer_externalDebug(), getMemo$feature_crypto_transfer_externalDebug());
    }
}
