package com.robinhood.android.transfers.p271ui.max.accounts;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.WireTransferRegionGate;
import com.robinhood.android.retirement.contracts.RetirementExperiments;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.android.transfers.util.Selections2;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentPermissions;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentUserStatus;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.api.bonfire.wires.RecipientType2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
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
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentUserStatusStore;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import dispatch.core.Launch;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;
import okio.ByteString;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001<Bq\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010/\u001a\u000200H\u0016J\u0006\u00101\u001a\u000200J\u000e\u00102\u001a\u0002002\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u0002002\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u0002002\b\u00106\u001a\u0004\u0018\u000107J\u000e\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b,\u0010-¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "debitCardUserStatusStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountBannerStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentUserStatusStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "selecting", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screen$delegate", "Lkotlin/Lazy;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "component$delegate", "onStart", "", "forceRefreshAccounts", "updateEditingState", "isEditing", "", "accountDeleted", "id", "", "accountSelected", "wireAccountCreated", "wireAccountRequest", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferAccountsDuxo extends BaseDuxo4<TransferAccountsViewState> implements HasSavedState {
    public static final String OUTGOING_WIRE_RECIPIENT_TYPE_KEY = "outgoing_wire_recipient_type";
    private final AchRelationshipStore achRelationshipStore;

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final Lazy component;
    private final DebitCardInstrumentUserStatusStore debitCardUserStatusStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final MatchaTreatmentStore matchaTreatmentStore;
    private final RegionGateProvider regionGateProvider;
    private final RetirementMatchStore retirementMatchStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: screen$delegate, reason: from kotlin metadata */
    private final Lazy screen;
    private final TransferAccountDirection selecting;
    private final TransferAccountBannerStore transferAccountBannerStore;
    private final TransferAccountStore transferAccountStore;
    private final TransferWireAccountStore transferWireAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public TransferAccountsDuxo(AchRelationshipStore achRelationshipStore, DebitCardInstrumentUserStatusStore debitCardUserStatusStore, EventLogger eventLogger, ExperimentsStore experimentsStore, TransferAccountStore transferAccountStore, TransferAccountBannerStore transferAccountBannerStore, TransferWireAccountStore transferWireAccountStore, TransfersBonfireApi transfersBonfireApi, MatchaTreatmentStore matchaTreatmentStore, RetirementMatchStore retirementMatchStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(debitCardUserStatusStore, "debitCardUserStatusStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountBannerStore, "transferAccountBannerStore");
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        TransferAccountSelectionKey transferAccountSelectionKey = (TransferAccountSelectionKey) INSTANCE.getArgs(savedStateHandle);
        MAXTransferContext.EntryPoint entryPoint = transferAccountSelectionKey.getEntryPoint();
        boolean zIsSinkAccountFixed = transferAccountSelectionKey.isSinkAccountFixed();
        TransferAccountDirection direction = transferAccountSelectionKey.getDirection();
        List<TransferAccount> accounts2 = transferAccountSelectionKey.getAccounts();
        List<TransferAccount> listFilterForRecurringDepositsEligibility = transferAccountSelectionKey.getEntryPoint() == MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB ? TransferAccounts2.filterForRecurringDepositsEligibility(accounts2, transferAccountSelectionKey.getDirection()) : accounts2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterForRecurringDepositsEligibility, 10));
        for (Iterator it = listFilterForRecurringDepositsEligibility.iterator(); it.hasNext(); it = it) {
            arrayList.add(new TransferAccountsViewState.AccountTransferDisplayData((TransferAccount) it.next(), null));
        }
        TransferAccount transactingAccount = transferAccountSelectionKey.getTransactingAccount();
        IraContributionType iraContributionType = transferAccountSelectionKey.getIraContributionType();
        boolean fromRetirementContributionsV2 = transferAccountSelectionKey.getFromRetirementContributionsV2();
        Boolean useUkAddAccountExperience = transferAccountSelectionKey.getUseUkAddAccountExperience();
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(useUkAddAccountExperience, bool);
        boolean zAreEqual2 = Intrinsics.areEqual(transferAccountSelectionKey.isOutgoingWire(), bool);
        RecipientType recipientType = (RecipientType) savedStateHandle.get(OUTGOING_WIRE_RECIPIENT_TYPE_KEY);
        super(new TransferAccountsViewState(entryPoint, zIsSinkAccountFixed, transactingAccount, null, false, null, arrayList, direction, false, fromRetirementContributionsV2, null, iraContributionType, zAreEqual, Intrinsics.areEqual(transferAccountSelectionKey.isForFirstPartyOutgoingWires(), bool), recipientType == null ? transferAccountSelectionKey.getOutgoingWireRecipientType() : recipientType, false, false, false, zAreEqual2, null, transferAccountSelectionKey.getGuidedTransfersData(), 755000, null), duxoBundle);
        this.achRelationshipStore = achRelationshipStore;
        this.debitCardUserStatusStore = debitCardUserStatusStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.transferAccountStore = transferAccountStore;
        this.transferAccountBannerStore = transferAccountBannerStore;
        this.transferWireAccountStore = transferWireAccountStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.retirementMatchStore = retirementMatchStore;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
        this.selecting = ((TransferAccountSelectionKey) INSTANCE.getArgs((HasSavedState) this)).getDirection();
        this.screen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountsDuxo.screen_delegate$lambda$3();
            }
        });
        this.component = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferAccountsDuxo.component_delegate$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getScreen() {
        return (Screen) this.screen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen screen_delegate$lambda$3() {
        return new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Component getComponent() {
        return (Component) this.component.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component component_delegate$lambda$4() {
        return new Component(Component.ComponentType.ROW, null, null, 6, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable<List<TransferAccount>> observableStream;
        Object map;
        super.onStart();
        Companion companion = INSTANCE;
        Boolean boolIsOutgoingWire = ((TransferAccountSelectionKey) companion.getArgs((HasSavedState) this)).isOutgoingWire();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolIsOutgoingWire, bool) && ((TransferAccountSelectionKey) companion.getArgs((HasSavedState) this)).getOutgoingWireRecipientType() != null) {
            Observable observableDistinctUntilChanged = asObservable(getStateFlow()).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$accountDataObservable$1
                @Override // io.reactivex.functions.Function
                public final Optional<RecipientType> apply(TransferAccountsViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it.getOutgoingWireRecipientType());
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            map = ObservablesKt.filterIsPresent(observableDistinctUntilChanged).switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$accountDataObservable$2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends List<TransferAccount>> apply(RecipientType recipientType) {
                    Intrinsics.checkNotNullParameter(recipientType, "recipientType");
                    this.this$0.transferWireAccountStore.refresh(recipientType, false);
                    return this.this$0.transferWireAccountStore.streamOutgoingWiresAccountByRecipientType(recipientType);
                }
            });
        } else if (this.selecting == TransferAccountDirection.SOURCE && Intrinsics.areEqual(((TransferAccountSelectionKey) companion.getArgs((HasSavedState) this)).isForFirstPartyOutgoingWires(), bool)) {
            this.transferAccountStore.refresh(true);
            map = this.transferAccountStore.stream().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$accountDataObservable$3
                @Override // io.reactivex.functions.Function
                public final List<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    ArrayList arrayList = new ArrayList();
                    for (T t : accounts2) {
                        TransferAccount transferAccount = (TransferAccount) t;
                        if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS && !transferAccount.isManaged()) {
                            arrayList.add(t);
                        }
                    }
                    return arrayList;
                }
            });
        } else {
            if (this.selecting == TransferAccountDirection.SINK && Intrinsics.areEqual(((TransferAccountSelectionKey) companion.getArgs((HasSavedState) this)).isForFirstPartyOutgoingWires(), bool)) {
                observableStream = RxFactory.DefaultImpls.rxObservable$default(this, null, new TransferAccountsDuxo$onStart$accountDataObservable$4(this, null), 1, null);
            } else {
                this.transferAccountStore.refresh(true);
                observableStream = this.transferAccountStore.stream();
            }
            map = observableStream.map(new Function() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$accountDataObservable$5
                @Override // io.reactivex.functions.Function
                public final List<TransferAccount> apply(List<TransferAccount> accounts2) {
                    Intrinsics.checkNotNullParameter(accounts2, "accounts");
                    TransferAccountSelectionKey transferAccountSelectionKey = (TransferAccountSelectionKey) TransferAccountsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0);
                    return transferAccountSelectionKey.getEntryPoint() == MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB ? TransferAccounts2.filterForRecurringDepositsEligibility(accounts2, transferAccountSelectionKey.getDirection()) : accounts2;
                }
            });
        }
        this.transferAccountStore.refresh(true);
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(map);
        Observable observableDoOnNext = observables.combineLatest(map, this.matchaTreatmentStore.stream()).distinctUntilChanged().doOnNext(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo.onStart.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Tuples2<? extends List<TransferAccount>, MatchaTreatment> tuples2) {
                List<TransferAccount> listComponent1 = tuples2.component1();
                Intrinsics.checkNotNull(listComponent1);
                TransferAccountsDuxo transferAccountsDuxo = TransferAccountsDuxo.this;
                Iterator<T> it = listComponent1.iterator();
                while (it.hasNext()) {
                    String str = null;
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
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
                    int i6 = -262145;
                    int i7 = -1;
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -1;
                    EventLogger.DefaultImpls.logAppear$default(transferAccountsDuxo.eventLogger, null, transferAccountsDuxo.getScreen(), transferAccountsDuxo.getComponent(), null, new Context(i, i2, i3, str, str2, null, str3, productTag, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, new MAXTransferAccountSelectionContext(Selections2.toProtobuf(transferAccountsDuxo.selecting), Transfers.toProtobuf((TransferAccount) it.next()), null, 4, null), queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), 9, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnNext, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$5(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$6((Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountBannerStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$7(this.f$0, (ApiTransferBanners) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getHasReachedLinkedAchRelationshipsLimit(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map2 = this.debitCardUserStatusStore.poll().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final Optional<ApiPaymentInstrumentPermissions> apply(ApiPaymentInstrumentUserStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(it.getPermissions());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$9(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RetirementExperiments.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        if (((TransferAccountSelectionKey) companion.getArgs((HasSavedState) this)).getMatchRateTypeOverride() != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.retirementMatchStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferAccountsDuxo.onStart$lambda$12(this.f$0, (RetirementMatchRate) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, WireTransferRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferAccountsDuxo.onStart$lambda$13(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(TransferAccountsDuxo transferAccountsDuxo, Tuples2 tuples2) {
        Launch.launchIO$default(transferAccountsDuxo.getLifecycleScope(), null, null, new TransferAccountsDuxo$onStart$2$1((List) tuples2.component1(), transferAccountsDuxo, (MatchaTreatment) tuples2.component2(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(TransferAccountsDuxo transferAccountsDuxo, ApiTransferBanners transferBanners) {
        Intrinsics.checkNotNullParameter(transferBanners, "transferBanners");
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$4$1(transferBanners, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(TransferAccountsDuxo transferAccountsDuxo, boolean z) {
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$5$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(TransferAccountsDuxo transferAccountsDuxo, Optional optional) {
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$7$1(optional, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(TransferAccountsDuxo transferAccountsDuxo, boolean z) {
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$8$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12(TransferAccountsDuxo transferAccountsDuxo, RetirementMatchRate retirementMatch) {
        MatchRateBreakdown matchRateBreakdown;
        Object next;
        Intrinsics.checkNotNullParameter(retirementMatch, "retirementMatch");
        List<MatchRateBreakdown> matchRateBreakdowns = retirementMatch.getMatchRateBreakdowns();
        if (matchRateBreakdowns != null) {
            Iterator<T> it = matchRateBreakdowns.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((MatchRateBreakdown) next).getBreakdownType() == ((TransferAccountSelectionKey) INSTANCE.getArgs((HasSavedState) transferAccountsDuxo)).getMatchRateTypeOverride()) {
                    break;
                }
            }
            matchRateBreakdown = (MatchRateBreakdown) next;
        } else {
            matchRateBreakdown = null;
        }
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$9$1(matchRateBreakdown, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(TransferAccountsDuxo transferAccountsDuxo, boolean z) {
        transferAccountsDuxo.applyMutation(new TransferAccountsDuxo$onStart$10$1(z, null));
        return Unit.INSTANCE;
    }

    public final void forceRefreshAccounts() {
        this.transferAccountStore.refresh(true);
        this.achRelationshipStore.refresh(true);
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$updateEditingState$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$updateEditingState$1 */
    static final class C307231 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
        final /* synthetic */ boolean $isEditing;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307231(boolean z, Continuation<? super C307231> continuation) {
            super(2, continuation);
            this.$isEditing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307231 c307231 = new C307231(this.$isEditing, continuation);
            c307231.L$0 = obj;
            return c307231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
            return ((C307231) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, null, this.$isEditing, null, null, null, false, false, null, null, false, false, null, false, false, false, false, null, null, 2097135, null);
        }
    }

    public final void updateEditingState(boolean isEditing) {
        applyMutation(new C307231(isEditing, null));
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountDeleted$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountDeleted$1 */
    static final class C307181 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C307181(Continuation<? super C307181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307181 c307181 = new C307181(continuation);
            c307181.L$0 = obj;
            return c307181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
            return ((C307181) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, null, false, null, null, null, false, false, null, null, false, false, null, true, false, false, false, null, null, 2064383, null);
        }
    }

    public final void accountDeleted(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String selectedAccountId = ((TransferAccountSelectionKey) INSTANCE.getArgs((HasSavedState) this)).getSelectedAccountId();
        if (selectedAccountId == null || !StringsKt.contains$default((CharSequence) selectedAccountId, (CharSequence) id, false, 2, (Object) null)) {
            return;
        }
        applyMutation(new C307181(null));
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountSelected$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountSelected$1 */
    static final class C307191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307191(String str, Continuation<? super C307191> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferAccountsDuxo.this.new C307191(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C307191 c307191;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransfersBonfireApi transfersBonfireApi = TransferAccountsDuxo.this.transfersBonfireApi;
                TransferType transferType = TransferType.OUTGOING_WIRE;
                this.label = 1;
                c307191 = this;
                obj = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, null, transferType, c307191, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c307191 = this;
            }
            List<ApiTransferAccount> results = ((ApiTransferAccountsResponse) obj).getResults();
            String str = c307191.$id;
            Iterator<T> it = results.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((ApiTransferAccount) next).getAccount_id(), str)) {
                    break;
                }
            }
            ApiTransferAccount apiTransferAccount = (ApiTransferAccount) next;
            TransferAccountsDuxo.this.applyMutation(new AnonymousClass1(apiTransferAccount != null ? TransferAccount6.toDbModel(apiTransferAccount) : null, null));
            return Unit.INSTANCE;
        }

        /* compiled from: TransferAccountsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountSelected$1$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$accountSelected$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
            final /* synthetic */ TransferAccount $transferAccount;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransferAccount transferAccount, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$transferAccount = transferAccount;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transferAccount, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
                return ((AnonymousClass1) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, this.$transferAccount, false, null, null, null, false, false, null, null, false, false, null, false, false, false, false, null, null, 2097143, null);
            }
        }
    }

    public final void accountSelected(String id) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C307191(id, null), 3, null);
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$wireAccountCreated$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$wireAccountCreated$1 */
    static final class C307241 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
        final /* synthetic */ DidLinkAccountRequestDto $wireAccountRequest;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307241(DidLinkAccountRequestDto didLinkAccountRequestDto, Continuation<? super C307241> continuation) {
            super(2, continuation);
            this.$wireAccountRequest = didLinkAccountRequestDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307241 c307241 = new C307241(this.$wireAccountRequest, continuation);
            c307241.L$0 = obj;
            return c307241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
            return ((C307241) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, null, false, null, null, null, false, false, null, null, false, false, RecipientType2.dtoToRecipientType(this.$wireAccountRequest.getRecipient_type()), true, false, false, false, null, null, 2047999, null);
        }
    }

    public final void wireAccountCreated(DidLinkAccountRequestDto wireAccountRequest) {
        Intrinsics.checkNotNullParameter(wireAccountRequest, "wireAccountRequest");
        applyMutation(new C307241(wireAccountRequest, null));
    }

    /* compiled from: TransferAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsDuxo;", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "<init>", "()V", "OUTGOING_WIRE_RECIPIENT_TYPE_KEY", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<TransferAccountsDuxo, TransferAccountSelectionKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferAccountSelectionKey getArgs(SavedStateHandle savedStateHandle) {
            return (TransferAccountSelectionKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferAccountSelectionKey getArgs(TransferAccountsDuxo transferAccountsDuxo) {
            return (TransferAccountSelectionKey) DuxoCompanion.DefaultImpls.getArgs(this, transferAccountsDuxo);
        }
    }
}
