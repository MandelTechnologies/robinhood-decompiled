package com.robinhood.android.matcha.p177ui.review;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.ErrorHandling;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionEvent;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionFragment;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsBottomSheet;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.rosetta.converters.suv.VerificationWorkflowResults2;
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
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;

/* compiled from: MatchaReviewTransactionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003ABCB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000103H\u0016J\r\u00108\u001a\u00020\u0016H\u0017¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0016H\u0002J\u0012\u0010>\u001a\u00020\u00162\b\u0010?\u001a\u0004\u0018\u00010@H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006D²\u0006\n\u0010E\u001a\u00020FX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheet$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "memoLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onSourceOfFundsSelected", "sourceOfFunds", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "onBannerClick", "logVerificationResult", "result", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug", "state", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaReviewTransactionFragment extends GenericComposeFragment implements AutoLoggableFragment, SourceOfFundsBottomSheet.Callbacks {
    public EventLogger eventLogger;
    private final ActivityResultLauncher<Intent> memoLauncher;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaReviewTransactionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchaReviewTransactionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaReviewTransactionDuxo.class);
    private final Function2<UUID, Boolean, Unit> launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getNavigator();
        }
    }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MatchaReviewTransactionFragment.launchSuv$lambda$1(this.f$0);
        }
    }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MatchaReviewTransactionFragment.launchSuv$lambda$2(this.f$0);
        }
    });

    /* compiled from: MatchaReviewTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Callbacks;", "", "onTransactionSuccess", "", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTransactionSuccess(ConfirmationType confirmationType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11(MatchaReviewTransactionFragment matchaReviewTransactionFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        matchaReviewTransactionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public MatchaReviewTransactionFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$memoLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    this.this$0.getDuxo().updateMemo(data != null ? data.getStringExtra(MemoInputActivity.EXTRA_MEMO) : null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.memoLauncher = activityResultLauncherRegisterForActivityResult;
        this.useDesignSystemToolbar = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaReviewTransactionDuxo getDuxo() {
        return (MatchaReviewTransactionDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MatchaReviewTransactionFragment matchaReviewTransactionFragment) {
        VerificationWorkflowResult verificationWorkflowResult = VerificationWorkflowResult.APPROVED;
        matchaReviewTransactionFragment.logVerificationResult(verificationWorkflowResult);
        matchaReviewTransactionFragment.getDuxo().onVerificationResult(verificationWorkflowResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MatchaReviewTransactionFragment matchaReviewTransactionFragment) {
        VerificationWorkflowResult verificationWorkflowResult = VerificationWorkflowResult.DENIED;
        matchaReviewTransactionFragment.logVerificationResult(verificationWorkflowResult);
        matchaReviewTransactionFragment.getDuxo().onVerificationResult(verificationWorkflowResult);
        return Unit.INSTANCE;
    }

    private static final MatchaReviewTransactionViewState ComposeContent$lambda$3(SnapshotState4<MatchaReviewTransactionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_REVIEW_TRANSACTION, null, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        P2PContext p2PContext = new P2PContext(RosettaConverters.toProtobuf(((Args) companion.getArgs((Fragment) this)).getDirection()), RosettaConverters.toTargetType(((Args) companion.getArgs((Fragment) this)).getTransactor()), ((Args) companion.getArgs((Fragment) this)).getAmount().getDecimalValue().floatValue(), null, null, null, 56, null);
        String str = null;
        String str2 = null;
        String str3 = null;
        Context.ProductTag productTag = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        Screen screen = null;
        String str6 = null;
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
        int i2 = -1025;
        int i3 = -1;
        int i4 = -1;
        int i5 = -268435457;
        int i6 = -1;
        int i7 = -1;
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, 0 == true ? 1 : 0, str, str2, str3, productTag, i, str4, ((Args) companion.getArgs((Fragment) this)).getEntryPoint().getIdentifier(), str5, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i2, i3, i4, i5, i6, i7, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C214621(null), 1, null);
    }

    /* compiled from: MatchaReviewTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1", m3645f = "MatchaReviewTransactionFragment.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1 */
    static final class C214621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C214621(Continuation<? super C214621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewTransactionFragment.this.new C214621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MatchaReviewTransactionFragment.this.getDuxo().getEventFlow());
                final MatchaReviewTransactionFragment matchaReviewTransactionFragment = MatchaReviewTransactionFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchaReviewTransactionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchaReviewTransactionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchaReviewTransactionEvent> eventConsumerInvoke;
                        EventConsumer<MatchaReviewTransactionEvent> eventConsumerInvoke2;
                        EventConsumer<MatchaReviewTransactionEvent> eventConsumerInvoke3;
                        EventConsumer<MatchaReviewTransactionEvent> eventConsumerInvoke4;
                        final MatchaReviewTransactionFragment matchaReviewTransactionFragment2 = matchaReviewTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewTransactionEvent.SubmitResult) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16403invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16403invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewTransactionEvent.SubmitResult submitResult = (MatchaReviewTransactionEvent.SubmitResult) event.getData();
                                    if (!(submitResult instanceof MatchaReviewTransactionEvent.SubmitResult.Success)) {
                                        if (submitResult instanceof MatchaReviewTransactionEvent.SubmitResult.InsufficientFundsError) {
                                            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                            android.content.Context contextRequireContext = matchaReviewTransactionFragment2.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C21284R.id.dialog_id_matcha_transaction_error).setTitle(C21284R.string.matcha_transfer_insufficient_funds_title, new Object[0]).setMessage(C21284R.string.matcha_transfer_insufficient_funds_detail, new Object[0]).setPositiveButton(C21284R.string.matcha_transfer_insufficient_funds_action, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                                            FragmentManager childFragmentManager = matchaReviewTransactionFragment2.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                            RhDialogFragment.Builder.show$default(theme, childFragmentManager, "insufficient-funds-error", false, 4, null);
                                            return;
                                        }
                                        if (submitResult instanceof MatchaReviewTransactionEvent.SubmitResult.Error) {
                                            AbsErrorHandler.handleError$default(ErrorHandling.getMatchaErrorHandler(matchaReviewTransactionFragment2.requireBaseActivity()), ((MatchaReviewTransactionEvent.SubmitResult.Error) submitResult).getThrowable(), false, 2, null);
                                            return;
                                        }
                                        if (submitResult instanceof MatchaReviewTransactionEvent.SubmitResult.VerificationRequired) {
                                            MatchaReviewTransactionEvent.SubmitResult.VerificationRequired verificationRequired = (MatchaReviewTransactionEvent.SubmitResult.VerificationRequired) submitResult;
                                            matchaReviewTransactionFragment2.launchSuv.invoke(verificationRequired.getVerificationWorkflowId(), Boolean.valueOf(verificationRequired.isMigrated()));
                                            return;
                                        } else {
                                            if (!(submitResult instanceof MatchaReviewTransactionEvent.SubmitResult.VerificationComplete)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            MatchaReviewTransactionEvent.SubmitResult.VerificationComplete verificationComplete = (MatchaReviewTransactionEvent.SubmitResult.VerificationComplete) submitResult;
                                            if (verificationComplete instanceof MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.Approved) {
                                                matchaReviewTransactionFragment2.getCallbacks().onTransactionSuccess(((MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.Approved) submitResult).getConfirmationType());
                                                return;
                                            } else {
                                                if (!(verificationComplete instanceof MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.NotApproved) && !(verificationComplete instanceof MatchaReviewTransactionEvent.SubmitResult.VerificationComplete.Canceled)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                matchaReviewTransactionFragment2.requireActivity().finish();
                                                return;
                                            }
                                        }
                                    }
                                    matchaReviewTransactionFragment2.getCallbacks().onTransactionSuccess(((MatchaReviewTransactionEvent.SubmitResult.Success) submitResult).getConfirmationType());
                                }
                            });
                        }
                        final MatchaReviewTransactionFragment matchaReviewTransactionFragment3 = matchaReviewTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewTransactionEvent.AddMemo) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16404invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16404invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewTransactionEvent.AddMemo addMemo = (MatchaReviewTransactionEvent.AddMemo) event.getData();
                                    ActivityResultLauncher activityResultLauncher = matchaReviewTransactionFragment3.memoLauncher;
                                    MemoInputActivity.Companion companion = MemoInputActivity.INSTANCE;
                                    android.content.Context contextRequireContext = matchaReviewTransactionFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    activityResultLauncher.launch(companion.getIntentWithExtras(contextRequireContext, (Parcelable) addMemo.getArgs()));
                                }
                            });
                        }
                        final MatchaReviewTransactionFragment matchaReviewTransactionFragment4 = matchaReviewTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewTransactionEvent.ShowSourceOfFundsSelector) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16405invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16405invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    SourceOfFundsBottomSheet sourceOfFundsBottomSheet = (SourceOfFundsBottomSheet) SourceOfFundsBottomSheet.INSTANCE.newInstance((Parcelable) new SourceOfFundsBottomSheet.Args(((MatchaReviewTransactionEvent.ShowSourceOfFundsSelector) event.getData()).getSelectedAccount().getOrNull()));
                                    FragmentManager childFragmentManager = matchaReviewTransactionFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    sourceOfFundsBottomSheet.show(childFragmentManager, "source-of-funds-sheet");
                                }
                            });
                        }
                        final MatchaReviewTransactionFragment matchaReviewTransactionFragment5 = matchaReviewTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewTransactionEvent.LaunchTransferActivity) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16406invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16406invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewTransactionEvent.LaunchTransferActivity launchTransferActivity = (MatchaReviewTransactionEvent.LaunchTransferActivity) event.getData();
                                    Navigator navigator = matchaReviewTransactionFragment5.getNavigator();
                                    android.content.Context contextRequireContext = matchaReviewTransactionFragment5.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    ApiTransferAccount.TransferAccountType sourceOfFundsType = launchTransferActivity.getSourceOfFundsType();
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, null, sourceOfFundsType != null ? new TransferConfiguration.TransferAccountSelection(null, false, sourceOfFundsType, 3, null) : null, null, null, null, false, false, null, null, false, 8175, null)), null, false, null, null, 60, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C21284R.id.dialog_id_matcha_transaction_error) {
            getDuxo().launchTransferActivity();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        String str;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-576478413);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576478413, i2, -1, "com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment.ComposeContent (MatchaReviewTransactionFragment.kt:188)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            if (ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getShowLoading()) {
                composerStartRestartGroup.startReplaceGroup(1705961064);
                MatchaReviewComposable.SubmitLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1706046965);
                StringResource toolbarTitleText = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getToolbarTitleText();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = toolbarTitleText.getText(resources).toString();
                StringResource toolbarSubtitle = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getToolbarSubtitle();
                if (toolbarSubtitle != null) {
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    CharSequence text = toolbarSubtitle.getText(resources2);
                    String string3 = text != null ? text.toString() : null;
                    ProfileAvatarState avatar = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getAvatar();
                    StringResource primaryText = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getPrimaryText();
                    Resources resources3 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    String string4 = primaryText.getText(resources3).toString();
                    StringResource secondaryText = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getSecondaryText();
                    if (secondaryText != null) {
                        Resources resources4 = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                        CharSequence text2 = secondaryText.getText(resources4);
                        String string5 = text2 != null ? text2.toString() : null;
                        StringResource summaryText = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getSummaryText();
                        Resources resources5 = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                        String string6 = summaryText.getText(resources5).toString();
                        StringResource swipeHintText = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getSwipeHintText();
                        Resources resources6 = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                        String string7 = swipeHintText.getText(resources6).toString();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MatchaReviewTransactionFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        FragmentActivity fragmentActivityRequireActivity = requireActivity();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivityRequireActivity);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new MatchaReviewTransactionFragment2(fragmentActivityRequireActivity);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                        MatchaReviewTransactionDuxo duxo = getDuxo();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new MatchaReviewTransactionFragment3(duxo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        if (!ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).isSourceOfFundsEditable()) {
                            kFunction = null;
                        }
                        Function0 function03 = (Function0) kFunction;
                        MatchaReviewTransactionViewState2 bannerViewState = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getBannerViewState();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new MatchaReviewTransactionFragment4(this);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function04 = (Function0) ((KFunction) objRememberedValue4);
                        MatchaReviewTransactionViewState3 memoState = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getMemoState();
                        MatchaReviewTransactionDuxo duxo2 = getDuxo();
                        String str2 = string3;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo2);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance5) {
                            str = string2;
                        } else {
                            str = string2;
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            String str3 = str;
                            composer2 = composerStartRestartGroup;
                            MatchaReviewComposable.ReviewTransaction(false, str3, str2, avatar, string4, string5, string6, string7, function0, function02, function03, bannerViewState, function04, memoState, (Function0) ((KFunction) objRememberedValue5), composer2, 6, 0);
                            composer2.endReplaceGroup();
                        }
                        objRememberedValue5 = new MatchaReviewTransactionFragment5(duxo2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        composerStartRestartGroup.endReplaceGroup();
                        String str32 = str;
                        composer2 = composerStartRestartGroup;
                        MatchaReviewComposable.ReviewTransaction(false, str32, str2, avatar, string4, string5, string6, string7, function0, function02, function03, bannerViewState, function04, memoState, (Function0) ((KFunction) objRememberedValue5), composer2, 6, 0);
                        composer2.endReplaceGroup();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewTransactionFragment.ComposeContent$lambda$11(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(MatchaReviewTransactionFragment matchaReviewTransactionFragment) {
        EventLogger.DefaultImpls.logSwipe$default(matchaReviewTransactionFragment.getEventLogger(), UserInteractionEventData.Action.SUBMIT, matchaReviewTransactionFragment.getEventScreen(), null, null, matchaReviewTransactionFragment.getScreenEventContext(), false, 44, null);
        matchaReviewTransactionFragment.getDuxo().submit();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheet.Callbacks
    public void onSourceOfFundsSelected(TransferAccount sourceOfFunds) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        getDuxo().updateSelectedTransferAccount(sourceOfFunds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerClick() throws Resources.NotFoundException {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string2 = getResources().getString(C21284R.string.matcha_incentives_terms_link);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
    }

    private final void logVerificationResult(VerificationWorkflowResult result) {
        StepUpVerificationContext.WorkflowStatus protobuf;
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SUBMIT;
        Screen eventScreen = getEventScreen();
        com.robinhood.rosetta.eventlogging.Context screenEventContext = getScreenEventContext();
        if (result == null || (protobuf = VerificationWorkflowResults2.toProtobuf(result)) == null) {
            protobuf = StepUpVerificationContext.WorkflowStatus.CANCELLED;
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, action, eventScreen, null, null, com.robinhood.rosetta.eventlogging.Context.copy$default(screenEventContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new StepUpVerificationContext(protobuf, "", null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -262145, -1, -1, 16383, null), 12, null);
    }

    /* compiled from: MatchaReviewTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Args;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "requestId", "Ljava/util/UUID;", MemoInputActivity.EXTRA_MEMO, "", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/models/ui/Transactor;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getRequestId", "()Ljava/util/UUID;", "getMemo", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Money amount;
        private final Direction direction;
        private final MatchaTransaction.EntryPoint entryPoint;
        private final String memo;
        private final UUID requestId;
        private final SourceOfFunds sourceOfFunds;
        private final Transactor transactor;

        /* compiled from: MatchaReviewTransactionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Money) parcel.readParcelable(Args.class.getClassLoader()), (Transactor) parcel.readParcelable(Args.class.getClassLoader()), Direction.CREATOR.createFromParcel(parcel), (SourceOfFunds) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), MatchaTransaction.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeParcelable(this.transactor, flags);
            this.direction.writeToParcel(dest, flags);
            dest.writeParcelable(this.sourceOfFunds, flags);
            dest.writeSerializable(this.requestId);
            dest.writeString(this.memo);
            dest.writeString(this.entryPoint.name());
        }

        public Args(Money amount, Transactor transactor, Direction direction, SourceOfFunds sourceOfFunds, UUID uuid, String str, MatchaTransaction.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = amount;
            this.transactor = transactor;
            this.direction = direction;
            this.sourceOfFunds = sourceOfFunds;
            this.requestId = uuid;
            this.memo = str;
            this.entryPoint = entryPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Args(Money money, Transactor transactor, Direction direction, SourceOfFunds sourceOfFunds, UUID uuid, String str, MatchaTransaction.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            MatchaTransaction.EntryPoint entryPoint2;
            String str2;
            sourceOfFunds = (i & 8) != 0 ? null : sourceOfFunds;
            uuid = (i & 16) != 0 ? null : uuid;
            if ((i & 32) != 0) {
                entryPoint2 = entryPoint;
                str2 = null;
            } else {
                entryPoint2 = entryPoint;
                str2 = str;
            }
            this(money, transactor, direction, sourceOfFunds, uuid, str2, entryPoint2);
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final Transactor getTransactor() {
            return this.transactor;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final String getMemo() {
            return this.memo;
        }

        public final MatchaTransaction.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaReviewTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaReviewTransactionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaReviewTransactionFragment matchaReviewTransactionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaReviewTransactionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaReviewTransactionFragment newInstance(Args args) {
            return (MatchaReviewTransactionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaReviewTransactionFragment matchaReviewTransactionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaReviewTransactionFragment, args);
        }
    }
}
