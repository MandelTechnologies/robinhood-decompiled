package com.robinhood.android.transfers.p271ui.retirement.contributions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.contracts.retirement.ContributionContract;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contributions.AccountSelectionData;
import com.robinhood.android.retirement.contributions.ContributionEditMode;
import com.robinhood.android.retirement.contributions.ContributionReviewCallbacks;
import com.robinhood.android.retirement.contributions.ContributionSink;
import com.robinhood.android.retirement.contributions.RetirementContributionScreen;
import com.robinhood.android.transfers.contracts.CreateRetirementContributionsDialogFragmentKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireContract;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionContract;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionResult;
import com.robinhood.android.transfers.contracts.TransferContract;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionRewardBottomSheet;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionEvent;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionFragment;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionViewState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.android.transfers.util.PreCreateLoggingEvents;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
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
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import p479j$.time.Year;

/* compiled from: CreateRetirementContributionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003z{|B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\r\u0010;\u001a\u000208H\u0017¢\u0006\u0002\u0010<J'\u0010=\u001a\u0002082\b\b\u0002\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0003¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020FH\u0016J\u001a\u0010G\u001a\u0002082\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u001a\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010KH\u0016J\u001a\u0010P\u001a\u00020F2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010KH\u0016J\b\u0010Q\u001a\u000208H\u0016J\b\u0010R\u001a\u000208H\u0016J\u0010\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u0002082\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u0002082\u0006\u0010W\u001a\u00020XH\u0016J\u0018\u0010Z\u001a\u0002082\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\H\u0002J\u0010\u0010]\u001a\u0002082\u0006\u0010^\u001a\u00020_H\u0016J\b\u0010`\u001a\u000208H\u0016J\u0010\u0010a\u001a\u0002082\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010b\u001a\u000208H\u0016J\u0010\u0010c\u001a\u0002082\u0006\u0010d\u001a\u00020eH\u0002J\u0018\u0010p\u001a\u0002082\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020NH\u0002J\t\u0010t\u001a\u00020FH\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR#\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u000603j\u0002`48VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R(\u0010f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020i \u001d*\n\u0012\u0004\u0012\u00020i\u0018\u00010h0h0gX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010j\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020k \u001d*\n\u0012\u0004\u0012\u00020k\u0018\u00010h0h0gX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010l\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020m \u001d*\n\u0012\u0004\u0012\u00020m\u0018\u00010h0h0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010n\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010o0o0gX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010u\u001a\b\u0012\u0004\u0012\u00020w0vX\u0096\u0005¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006}²\u0006\n\u0010~\u001a\u00020\u007fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionRewardBottomSheet$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "sessionId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "getSessionId", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "MainContent", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "onBackPressed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onGoldSelectionRowClicked", "onAmountClicked", "onFrequencyClicked", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onSourceAccountClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "onSinkAccountClicked", "openAccountSelector", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "onContributionTypeClicked", "sink", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "onTaxYearClicked", "onFrequencySelected", "onRewardReminderExitClick", "consumeEvent", "event", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "iraContributionQuestionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "transferLauncher", "Lcom/robinhood/android/transfers/contracts/Transfer;", "transferAccountSelectionLauncher", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "matchSelectionLauncher", "Landroid/content/Intent;", "showContributionBottomSheet", "amountSelected", "", "taxYear", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateRetirementContributionFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment, ContributionReviewCallbacks, ContributionRewardBottomSheet.Callbacks, TransferFrequencyBottomSheetCallbacks {
    public static final int $stable = 0;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> iraContributionQuestionnaireLauncher;
    public Markwon markwon;
    private final ActivityResultLauncher<Intent> matchSelectionLauncher;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferAccountSelectionKey>> transferAccountSelectionLauncher;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> transferLauncher;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateRetirementContributionFragment.class, "sessionId", "getSessionId()Ljava/util/UUID;", 0)), Reflection.property1(new PropertyReference1Impl(CreateRetirementContributionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionSubmitterCallbacks;", "onContinue", "", "bundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "showGoldRejoinFlow", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ContributionSubmitterCallbacks {
        void onContinue(ContributionBundle bundle, boolean showGoldRejoinFlow);
    }

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CreateRetirementContributionFragment createRetirementContributionFragment, int i, Composer composer, int i2) {
        createRetirementContributionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$2(CreateRetirementContributionFragment createRetirementContributionFragment, Modifier modifier, CreateRetirementContributionViewState.Loaded loaded, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        createRetirementContributionFragment.MainContent(modifier, loaded, scrollState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateRetirementContributionViewState ComposeContent$lambda$0(SnapshotState4<? extends CreateRetirementContributionViewState> snapshotState4) {
        return snapshotState4.getValue();
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

    public CreateRetirementContributionFragment() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
        this.duxo = DuxosKt.duxo(this, CreateRetirementContributionDuxo.class);
        this.eventScreen = new Screen(Screen.Name.CREATE_RETIREMENT_CONTRIBUTION, null, null, null, 14, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CreateRetirementContributionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<IraContributionQuestionnaireKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new IraContributionQuestionnaireContract(new Function0() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$iraContributionQuestionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(IraContributionQuestionnaireResult iraContributionQuestionnaireResult) {
                if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.UpdateTaxYear) {
                    this.this$0.getDuxo().setTaxYear(((IraContributionQuestionnaireResult.UpdateTaxYear) iraContributionQuestionnaireResult).getTaxYear());
                } else if (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution) {
                    IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) iraContributionQuestionnaireResult;
                    this.this$0.getDuxo().setSinkAccount(iraContribution.getAccount(), iraContribution);
                } else if (iraContributionQuestionnaireResult != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.iraContributionQuestionnaireLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new TransferContract(new Function0() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$transferLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.transferLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<TransferAccountSelectionKey>> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new TransferAccountSelectionContract(new Function0() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$transferAccountSelectionLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferAccountSelectionResult transferAccountSelectionResult) {
                if (transferAccountSelectionResult instanceof TransferAccountSelectionResult.Sink) {
                    CreateRetirementContributionDuxo duxo = this.this$0.getDuxo();
                    TransferAccountSelectionResult.Sink sink = (TransferAccountSelectionResult.Sink) transferAccountSelectionResult;
                    TransferAccount account = sink.getAccount();
                    if (account != null) {
                        duxo.setSinkAccount(account, sink.getIraContributionInfo());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (!(transferAccountSelectionResult instanceof TransferAccountSelectionResult.Source)) {
                    if (transferAccountSelectionResult != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                CreateRetirementContributionDuxo duxo2 = this.this$0.getDuxo();
                TransferAccount account2 = ((TransferAccountSelectionResult.Source) transferAccountSelectionResult).getAccount();
                if (account2 != null) {
                    duxo2.setSourceAccount(account2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.transferAccountSelectionLauncher = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$matchSelectionLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult activityResult) {
                Intrinsics.checkNotNullParameter(activityResult, "activityResult");
                if (activityResult.getResultCode() == -1) {
                    Intent data = activityResult.getData();
                    String stringExtra = data != null ? data.getStringExtra(MatchSelectionActivity.TRANSFER_ID_EXTRA) : null;
                    if (stringExtra != null) {
                        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        NavigationActivityResultContract3.finishWithResult(fragmentActivityRequireActivity, new ContributionContract.Result.Completed(stringExtra));
                        return;
                    }
                    this.this$0.requireActivity().finish();
                    return;
                }
                if (activityResult.getResultCode() == 999) {
                    this.this$0.getDuxo().setEditMode(false);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "registerForActivityResult(...)");
        this.matchSelectionLauncher = activityResultLauncherRegisterForActivityResult4;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final UUID getSessionId() {
        return (UUID) this.sessionId.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateRetirementContributionDuxo getDuxo() {
        return (CreateRetirementContributionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        String str = null;
        Money money = null;
        MAXTransferContext.TransferAccount transferAccount = null;
        MAXTransferContext.TransferAccount transferAccount2 = null;
        TransferContext.Frequency frequency = null;
        MAXTransferContext.IRAContributionData iRAContributionData = null;
        MAXTransferContext.IRADistributionData iRADistributionData = null;
        String str2 = null;
        MAXTransferContext.ACHTransferData aCHTransferData = null;
        List list = null;
        MAXTransferContext.IRARothConversionData iRARothConversionData = null;
        MAXTransferContext.TransferLimitValidationError transferLimitValidationError = null;
        MAXTransferContext.CurrencyConversionData currencyConversionData = null;
        String str3 = null;
        String str4 = null;
        MAXTransferContext.TransferV2Direction transferV2Direction = null;
        Money money2 = null;
        MAXTransferContext.TransferMethod transferMethod = null;
        ByteString byteString = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Context.ProductTag productTag = null;
        int i4 = 0;
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
        ByteString byteString2 = null;
        int i5 = -1;
        int i6 = -131073;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, productTag, i4, str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, directDepositContext, objArr, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str5, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, new MAXTransferContext(str, money, transferAccount, transferAccount2, frequency, iRAContributionData, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint(), iRADistributionData, str2, aCHTransferData, list, iRARothConversionData, transferLimitValidationError, currencyConversionData, str3, str4, transferV2Direction, money2, transferMethod, byteString, 1048511, null), mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str6, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201854557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201854557, i2, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent (CreateRetirementContributionFragment.kt:125)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ScaffoldKt.m5625Scaffold27mzLpw(modifierWindowInsetsPadding, null, ComposableLambda3.rememberComposableLambda(850941502, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(850941502, i4, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.<anonymous> (CreateRetirementContributionFragment.kt:134)");
                    }
                    final SnapshotState4<CreateRetirementContributionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-921069263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-921069263, i5, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.<anonymous>.<anonymous> (CreateRetirementContributionFragment.kt:136)");
                            }
                            BentoText2.m20747BentoText38GnDrw(CreateRetirementContributionFragment.ComposeContent$lambda$0(snapshotState4).getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8190);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(498229597, true, new AnonymousClass2(this), composer2, 54), null, null, false, topBarScrollStateRememberTopBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 390, 0, 1978);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CreateRetirementContributionFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ CreateRetirementContributionFragment this$0;

                    AnonymousClass2(CreateRetirementContributionFragment createRetirementContributionFragment) {
                        this.this$0 = createRetirementContributionFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(498229597, i, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.<anonymous>.<anonymous> (CreateRetirementContributionFragment.kt:142)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.this$0);
                        final CreateRetirementContributionFragment createRetirementContributionFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateRetirementContributionFragment.C310581.AnonymousClass2.invoke$lambda$1$lambda$0(createRetirementContributionFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CreateRetirementContributionFragment createRetirementContributionFragment) {
                        createRetirementContributionFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(-853067995, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer2, int i4) {
                    int i5;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer2.changed(paddingValues) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-853067995, i5, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.<anonymous> (CreateRetirementContributionFragment.kt:150)");
                    }
                    final CreateRetirementContributionViewState createRetirementContributionViewStateComposeContent$lambda$0 = CreateRetirementContributionFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    if (Intrinsics.areEqual(createRetirementContributionViewStateComposeContent$lambda$0, CreateRetirementContributionViewState.Loading.INSTANCE)) {
                        composer2.startReplaceGroup(540414515);
                        LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), false, false, 0, composer2, 0, 14);
                        composer2.endReplaceGroup();
                    } else if (Intrinsics.areEqual(createRetirementContributionViewStateComposeContent$lambda$0, CreateRetirementContributionViewState.Error.INSTANCE)) {
                        composer2.startReplaceGroup(540420162);
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        CreateRetirementContributionDuxo duxo = CreateRetirementContributionFragment.this.getDuxo();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(duxo);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new CreateRetirementContributionFragment2(duxo);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        ErrorScreenComposable.ErrorScreenComposable(modifierPadding, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(createRetirementContributionViewStateComposeContent$lambda$0 instanceof CreateRetirementContributionViewState.Loaded)) {
                            composer2.startReplaceGroup(540412505);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(540427898);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(CreateRetirementContributionFragment.this.getDuxo().getAnalyticsScreenName(), null, null, null, 14, null), null, null, null, null, 61, null);
                        final CreateRetirementContributionFragment createRetirementContributionFragment = CreateRetirementContributionFragment.this;
                        final ScrollState scrollState = scrollStateRememberScrollState;
                        final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-2143609190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.2.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2143609190, i6, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.ComposeContent.<anonymous>.<anonymous> (CreateRetirementContributionFragment.kt:165)");
                                }
                                createRetirementContributionFragment.MainContent(TopBarScrollState3.scrollableTopBarState(PaddingKt.padding(Modifier.INSTANCE, paddingValues), scrollState, topBarScrollState), (CreateRetirementContributionViewState.Loaded) createRetirementContributionViewStateComposeContent$lambda$0, scrollState, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 12582912, 32762);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateRetirementContributionFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$MainContent$editModeCallbacks$1] */
    public final void MainContent(Modifier modifier, final CreateRetirementContributionViewState.Loaded loaded, final ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1488371194);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loaded) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1488371194, i3, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.MainContent (CreateRetirementContributionFragment.kt:185)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1580580047, true, new C310601(loaded, this, new ContributionEditMode() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$MainContent$editModeCallbacks$1
                @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
                public void onUntilMaxClicked(BigDecimal amount, Year taxYear) {
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                    CreateRetirementContributionFragment createRetirementContributionFragment = this.this$0;
                    String string2 = amount.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    createRetirementContributionFragment.showContributionBottomSheet(string2, taxYear.getValue());
                }

                @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
                public void onChipPressed(KeypadChip chip) {
                    Intrinsics.checkNotNullParameter(chip, "chip");
                    this.this$0.getDuxo().onChipPress(chip);
                }

                @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
                public void onEditContinueClicked() {
                    this.this$0.getDuxo().onContinueClicked();
                }

                @Override // com.robinhood.android.retirement.contributions.ContributionEditMode
                public void onKeyPressed(KeyEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    this.this$0.getDuxo().consumeKeyEvent(event, loaded);
                }
            }, modifier3, scrollState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateRetirementContributionFragment.MainContent$lambda$2(this.f$0, modifier2, loaded, scrollState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$MainContent$1 */
    static final class C310601 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CreateRetirementContributionFragment3 $editModeCallbacks;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ CreateRetirementContributionViewState.Loaded $state;
        final /* synthetic */ CreateRetirementContributionFragment this$0;

        C310601(CreateRetirementContributionViewState.Loaded loaded, CreateRetirementContributionFragment createRetirementContributionFragment, CreateRetirementContributionFragment3 createRetirementContributionFragment3, Modifier modifier, ScrollState scrollState) {
            this.$state = loaded;
            this.this$0 = createRetirementContributionFragment;
            this.$editModeCallbacks = createRetirementContributionFragment3;
            this.$modifier = modifier;
            this.$scrollState = scrollState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1580580047, i, -1, "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.MainContent.<anonymous> (CreateRetirementContributionFragment.kt:212)");
            }
            CreateRetirementContributionViewState.Loaded loaded = this.$state;
            CreateRetirementContributionFragment createRetirementContributionFragment = this.this$0;
            CreateRetirementContributionFragment3 createRetirementContributionFragment3 = this.$editModeCallbacks;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.this$0) | composer.changedInstance(this.$state);
            final CreateRetirementContributionFragment createRetirementContributionFragment2 = this.this$0;
            final CreateRetirementContributionViewState.Loaded loaded2 = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$MainContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateRetirementContributionFragment.C310601.invoke$lambda$1$lambda$0(createRetirementContributionFragment2, loaded2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RetirementContributionScreen.RetirementContributionScreen(loaded, createRetirementContributionFragment, createRetirementContributionFragment3, (Function0) objRememberedValue, this.$modifier, this.$scrollState, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreateRetirementContributionFragment createRetirementContributionFragment, CreateRetirementContributionViewState.Loaded loaded) {
            createRetirementContributionFragment.getDuxo().onSubmitClicked(loaded);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().onBackPressed();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDuxo().setSessionId(getSessionId());
        BaseFragment.collectDuxoState$default(this, null, new C310641(null), 1, null);
    }

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$onViewCreated$1", m3645f = "CreateRetirementContributionFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$onViewCreated$1 */
    static final class C310641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310641(Continuation<? super C310641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRetirementContributionFragment.this.new C310641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<CreateRetirementContributionEvent>> eventFlow = CreateRetirementContributionFragment.this.getDuxo().getEventFlow();
                final CreateRetirementContributionFragment createRetirementContributionFragment = CreateRetirementContributionFragment.this;
                FlowCollector<? super Event<CreateRetirementContributionEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CreateRetirementContributionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CreateRetirementContributionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CreateRetirementContributionEvent> eventConsumerInvoke;
                        if (event != null) {
                            final CreateRetirementContributionFragment createRetirementContributionFragment2 = createRetirementContributionFragment;
                            if ((event.getData() instanceof CreateRetirementContributionEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m19943invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19943invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        createRetirementContributionFragment2.consumeEvent((CreateRetirementContributionEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30383R.id.dialog_id_ira_contribution_exceeded) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, "149", false, 4, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30383R.id.dialog_id_ira_contribution_no_enoki) {
            CreateRetirementContributionViewState value = getDuxo().getStateFlow().getValue();
            if (!(value instanceof CreateRetirementContributionViewState.Loaded)) {
                return true;
            }
            getDuxo().overrideNoEnokiAlert((CreateRetirementContributionViewState.Loaded) value);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onGoldSelectionRowClicked() {
        getDuxo().onGoldSelectionRowClicked();
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onAmountClicked() {
        getDuxo().setEditMode(true);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onFrequencyClicked(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new TransferFrequencyBottomSheetFragmentKey(false, frequency, null, 4, null), null, 2, null).show(getChildFragmentManager(), "createRetirementContributionFrequencyBottomSheet");
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onSourceAccountClicked(AccountSelectionData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        openAccountSelector(data, TransferAccountDirection.SOURCE);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onSinkAccountClicked(AccountSelectionData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        openAccountSelector(data, TransferAccountDirection.SINK);
    }

    private final void openAccountSelector(AccountSelectionData data, TransferAccountDirection direction) {
        String id;
        ContributionSink contributionSink = data.getContributionSink();
        Intrinsics.checkNotNull(contributionSink, "null cannot be cast to non-null type com.robinhood.android.retirement.contributions.ContributionSink.Account");
        TransferAccount account = ((ContributionSink.Account) contributionSink).getAccount();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[direction.ordinal()];
        if (i == 1) {
            TransferAccount sourceAccount = data.getSourceAccount();
            id = sourceAccount != null ? sourceAccount.getId() : null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            id = account.getId();
        }
        String str = id;
        int i2 = iArr[direction.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            account = data.getSourceAccount();
        }
        NavigationActivityResultContract3.launch$default(this.transferAccountSelectionLauncher, new TransferAccountSelectionKey(null, direction, data.getAccounts(), str, true, account, IraContributionType.ONE_TIME_CONTRIBUTION, true, data.getMatchRateTypeOverride(), null, null, null, null, null, null, null, 65025, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onContributionTypeClicked(ContributionSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditContributionType(((ContributionSink.Account) sink).getAccount(), IraContributionType.ONE_TIME_CONTRIBUTION), null, 2, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.retirement.contributions.ContributionReviewCallbacks
    public void onTaxYearClicked() {
        NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW), null, 2, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetCallbacks
    public void onFrequencySelected(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getDuxo().onFrequencySelected(frequency);
    }

    @Override // com.robinhood.android.transfers.ui.retirement.contributions.ContributionRewardBottomSheet.Callbacks
    public void onRewardReminderExitClick() {
        getUserLeapManager().setPendingSurvey(Survey.RETIREMENT_LEARN_AND_EARN_EXIT_FUNDING);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeEvent(final CreateRetirementContributionEvent event) throws Throwable {
        if (Intrinsics.areEqual(event, CreateRetirementContributionEvent.FinishEvent.INSTANCE)) {
            requireActivity().finish();
            return;
        }
        if (Intrinsics.areEqual(event, CreateRetirementContributionEvent.BackEvent.INSTANCE)) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            if (parentFragmentManager.getBackStackEntryCount() > 0) {
                parentFragmentManager.popBackStack();
                return;
            } else {
                requireActivity().finish();
                return;
            }
        }
        if (event instanceof CreateRetirementContributionEvent.ValidationFailureEvent) {
            ((CreateRetirementContributionEvent.ValidationFailureEvent) event).getFailure().showAlert(requireBaseActivity(), getEventLogger());
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.CreateContributionErrorEvent) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((CreateRetirementContributionEvent.CreateContributionErrorEvent) event).getError(), true, false, 0, null, 56, null);
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.CreateContributionSuccessEvent) {
            getUserLeapManager().track(TrackingEvent.FINISHED_CONTRIBUTION);
            getCallbacks().onSuccessfulContribution(((CreateRetirementContributionEvent.CreateContributionSuccessEvent) event).getPostTransferFlow());
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.SelectYearEvent) {
            NavigationActivityResultContract3.launch$default(this.iraContributionQuestionnaireLauncher, new IraContributionQuestionnaireKey(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.RADIO_BUTTON), null, 2, null), null, false, 6, null);
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.StartRolloverEvent) {
            NavigationActivityResultContract3.launch$default(this.transferLauncher, new Transfer(((CreateRetirementContributionEvent.StartRolloverEvent) event).getTransferConfiguration()), null, false, 6, null);
            requireActivity().finish();
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.ShowRewardReminder) {
            ContributionRewardBottomSheet contributionRewardBottomSheet = (ContributionRewardBottomSheet) ContributionRewardBottomSheet.INSTANCE.newInstance();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            contributionRewardBottomSheet.show(childFragmentManager, "CONTRIBUTION_REWARD_REMINDER");
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.LaunchGoldMatchFlow) {
            MatchSelectionActivity.Companion companion2 = MatchSelectionActivity.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            this.matchSelectionLauncher.launch(companion2.getIntentWithExtras(contextRequireContext, (Parcelable) ((CreateRetirementContributionEvent.LaunchGoldMatchFlow) event).getLaunchExtras()));
            return;
        }
        if (event instanceof CreateRetirementContributionEvent.ContinueInFullscreenMatchSelection) {
            getCallbacks().onContinue(((CreateRetirementContributionEvent.ContinueInFullscreenMatchSelection) event).getBundle(), ((Args) INSTANCE.getArgs((Fragment) this)).getShowGoldRejoinFlow());
        } else {
            if (!(event instanceof CreateRetirementContributionEvent.ShowAcatsClawbackAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            PreCreateLoggingEvents.logPreCreateBottomSheetAppeared(getEventLogger(), PreCreatePopupType.ACATS_CLAWBACK_ALERT, getEventScreen().getName());
            SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), ((CreateRetirementContributionEvent.ShowAcatsClawbackAlert) event).getAlertAction().getAlert(), new SduiActionHandler() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionFragment.consumeEvent.1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                public final boolean mo15941handle(DisplayRTPUpsellAction it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof DisplayRTPUpsellAction.Confirm) {
                        CreateRetirementContributionFragment.this.getDuxo().onAcatsClawbackAlertConfirmed(((CreateRetirementContributionEvent.ShowAcatsClawbackAlert) event).getBundle());
                    } else if (it instanceof DisplayRTPUpsellAction.Dismiss) {
                        CreateRetirementContributionFragment.this.getDuxo().onAcatsClawbackAlertDismissed();
                    }
                    return true;
                }
            }, (1016 & 8) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiAlertKt.presentSduiAlertSheet$lambda$0((String) obj);
                }
            } : null, (1016 & 16) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiAlertKt.presentSduiAlertSheet$lambda$1((String) obj);
                }
            } : null, (1016 & 32) != 0 ? new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (1016 & 64) != 0 ? false : false, (1016 & 128) != 0 ? false : false, (1016 & 256) != 0, (1016 & 512) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContributionBottomSheet(String amountSelected, int taxYear) {
        CreateRetirementContributionBottomSheet createRetirementContributionBottomSheet = (CreateRetirementContributionBottomSheet) CreateRetirementContributionBottomSheet.INSTANCE.newInstance((Parcelable) new CreateRetirementContributionsDialogFragmentKey(amountSelected, taxYear, false, 4, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        createRetirementContributionBottomSheet.show(childFragmentManager, "createRetirementContributionBottomSheet");
    }

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010\"Jz\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bB\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bC\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bD\u0010\"¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Args;", "Landroid/os/Parcelable;", "", "accountNumber", "Ljava/math/BigDecimal;", "amount", "", "showEnokiCelebration", "showFrequencyRow", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "matchRateTypeOverride", "j$/time/Year", "selectedTaxYear", "startInSubmitMode", "shouldContinueInsteadOfSubmit", "showGoldRejoinFlow", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;ZZLcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;Lj$/time/Year;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Z", "component4", "component5", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "component6", "()Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "component7", "()Lj$/time/Year;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;ZZLcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;Lj$/time/Year;ZZZ)Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Args;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Ljava/math/BigDecimal;", "getAmount", "Z", "getShowEnokiCelebration", "getShowFrequencyRow", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getEntryPoint", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "getMatchRateTypeOverride", "Lj$/time/Year;", "getSelectedTaxYear", "getStartInSubmitMode", "getShouldContinueInsteadOfSubmit", "getShowGoldRejoinFlow", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final BigDecimal amount;
        private final MAXTransferContext.EntryPoint entryPoint;
        private final ApiRetirementMatchResponse3 matchRateTypeOverride;
        private final Year selectedTaxYear;
        private final boolean shouldContinueInsteadOfSubmit;
        private final boolean showEnokiCelebration;
        private final boolean showFrequencyRow;
        private final boolean showGoldRejoinFlow;
        private final boolean startInSubmitMode;

        /* compiled from: CreateRetirementContributionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                MAXTransferContext.EntryPoint entryPoint;
                ApiRetirementMatchResponse3 apiRetirementMatchResponse3;
                Year year;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                MAXTransferContext.EntryPoint entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(parcel.readString());
                ApiRetirementMatchResponse3 apiRetirementMatchResponse3ValueOf = parcel.readInt() == 0 ? null : ApiRetirementMatchResponse3.valueOf(parcel.readString());
                Year year2 = (Year) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z3 = z2;
                    entryPoint = entryPointValueOf;
                    apiRetirementMatchResponse3 = apiRetirementMatchResponse3ValueOf;
                    year = year2;
                    z4 = z3;
                } else {
                    z3 = z2;
                    entryPoint = entryPointValueOf;
                    apiRetirementMatchResponse3 = apiRetirementMatchResponse3ValueOf;
                    year = year2;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z3;
                } else {
                    z5 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z5 = z;
                }
                return new Args(string2, bigDecimal, z6, z7, entryPoint, apiRetirementMatchResponse3, year, z4, z3, z5);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, BigDecimal bigDecimal, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, Year year, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                bigDecimal = args.amount;
            }
            if ((i & 4) != 0) {
                z = args.showEnokiCelebration;
            }
            if ((i & 8) != 0) {
                z2 = args.showFrequencyRow;
            }
            if ((i & 16) != 0) {
                entryPoint = args.entryPoint;
            }
            if ((i & 32) != 0) {
                apiRetirementMatchResponse3 = args.matchRateTypeOverride;
            }
            if ((i & 64) != 0) {
                year = args.selectedTaxYear;
            }
            if ((i & 128) != 0) {
                z3 = args.startInSubmitMode;
            }
            if ((i & 256) != 0) {
                z4 = args.shouldContinueInsteadOfSubmit;
            }
            if ((i & 512) != 0) {
                z5 = args.showGoldRejoinFlow;
            }
            boolean z6 = z4;
            boolean z7 = z5;
            Year year2 = year;
            boolean z8 = z3;
            MAXTransferContext.EntryPoint entryPoint2 = entryPoint;
            ApiRetirementMatchResponse3 apiRetirementMatchResponse32 = apiRetirementMatchResponse3;
            return args.copy(str, bigDecimal, z, z2, entryPoint2, apiRetirementMatchResponse32, year2, z8, z6, z7);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowGoldRejoinFlow() {
            return this.showGoldRejoinFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowEnokiCelebration() {
            return this.showEnokiCelebration;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowFrequencyRow() {
            return this.showFrequencyRow;
        }

        /* renamed from: component5, reason: from getter */
        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
            return this.matchRateTypeOverride;
        }

        /* renamed from: component7, reason: from getter */
        public final Year getSelectedTaxYear() {
            return this.selectedTaxYear;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getStartInSubmitMode() {
            return this.startInSubmitMode;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShouldContinueInsteadOfSubmit() {
            return this.shouldContinueInsteadOfSubmit;
        }

        public final Args copy(String accountNumber, BigDecimal amount, boolean showEnokiCelebration, boolean showFrequencyRow, MAXTransferContext.EntryPoint entryPoint, ApiRetirementMatchResponse3 matchRateTypeOverride, Year selectedTaxYear, boolean startInSubmitMode, boolean shouldContinueInsteadOfSubmit, boolean showGoldRejoinFlow) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(accountNumber, amount, showEnokiCelebration, showFrequencyRow, entryPoint, matchRateTypeOverride, selectedTaxYear, startInSubmitMode, shouldContinueInsteadOfSubmit, showGoldRejoinFlow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.amount, args.amount) && this.showEnokiCelebration == args.showEnokiCelebration && this.showFrequencyRow == args.showFrequencyRow && this.entryPoint == args.entryPoint && this.matchRateTypeOverride == args.matchRateTypeOverride && Intrinsics.areEqual(this.selectedTaxYear, args.selectedTaxYear) && this.startInSubmitMode == args.startInSubmitMode && this.shouldContinueInsteadOfSubmit == args.shouldContinueInsteadOfSubmit && this.showGoldRejoinFlow == args.showGoldRejoinFlow;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            BigDecimal bigDecimal = this.amount;
            int iHashCode2 = (((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.showEnokiCelebration)) * 31) + Boolean.hashCode(this.showFrequencyRow)) * 31) + this.entryPoint.hashCode()) * 31;
            ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.matchRateTypeOverride;
            int iHashCode3 = (iHashCode2 + (apiRetirementMatchResponse3 == null ? 0 : apiRetirementMatchResponse3.hashCode())) * 31;
            Year year = this.selectedTaxYear;
            return ((((((iHashCode3 + (year != null ? year.hashCode() : 0)) * 31) + Boolean.hashCode(this.startInSubmitMode)) * 31) + Boolean.hashCode(this.shouldContinueInsteadOfSubmit)) * 31) + Boolean.hashCode(this.showGoldRejoinFlow);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", amount=" + this.amount + ", showEnokiCelebration=" + this.showEnokiCelebration + ", showFrequencyRow=" + this.showFrequencyRow + ", entryPoint=" + this.entryPoint + ", matchRateTypeOverride=" + this.matchRateTypeOverride + ", selectedTaxYear=" + this.selectedTaxYear + ", startInSubmitMode=" + this.startInSubmitMode + ", shouldContinueInsteadOfSubmit=" + this.shouldContinueInsteadOfSubmit + ", showGoldRejoinFlow=" + this.showGoldRejoinFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.amount);
            dest.writeInt(this.showEnokiCelebration ? 1 : 0);
            dest.writeInt(this.showFrequencyRow ? 1 : 0);
            dest.writeString(this.entryPoint.name());
            ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.matchRateTypeOverride;
            if (apiRetirementMatchResponse3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(apiRetirementMatchResponse3.name());
            }
            dest.writeSerializable(this.selectedTaxYear);
            dest.writeInt(this.startInSubmitMode ? 1 : 0);
            dest.writeInt(this.shouldContinueInsteadOfSubmit ? 1 : 0);
            dest.writeInt(this.showGoldRejoinFlow ? 1 : 0);
        }

        public Args(String accountNumber, BigDecimal bigDecimal, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, Year year, boolean z3, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.accountNumber = accountNumber;
            this.amount = bigDecimal;
            this.showEnokiCelebration = z;
            this.showFrequencyRow = z2;
            this.entryPoint = entryPoint;
            this.matchRateTypeOverride = apiRetirementMatchResponse3;
            this.selectedTaxYear = year;
            this.startInSubmitMode = z3;
            this.shouldContinueInsteadOfSubmit = z4;
            this.showGoldRejoinFlow = z5;
        }

        public /* synthetic */ Args(String str, BigDecimal bigDecimal, boolean z, boolean z2, MAXTransferContext.EntryPoint entryPoint, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, Year year, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, entryPoint, (i & 32) != 0 ? null : apiRetirementMatchResponse3, (i & 64) != 0 ? null : year, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final boolean getShowEnokiCelebration() {
            return this.showEnokiCelebration;
        }

        public final boolean getShowFrequencyRow() {
            return this.showFrequencyRow;
        }

        public final MAXTransferContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
            return this.matchRateTypeOverride;
        }

        public final Year getSelectedTaxYear() {
            return this.selectedTaxYear;
        }

        public final boolean getStartInSubmitMode() {
            return this.startInSubmitMode;
        }

        public final boolean getShouldContinueInsteadOfSubmit() {
            return this.shouldContinueInsteadOfSubmit;
        }

        public final boolean getShowGoldRejoinFlow() {
            return this.showGoldRejoinFlow;
        }
    }

    /* compiled from: CreateRetirementContributionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreateRetirementContributionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CreateRetirementContributionFragment createRetirementContributionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, createRetirementContributionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateRetirementContributionFragment newInstance(Args args) {
            return (CreateRetirementContributionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateRetirementContributionFragment createRetirementContributionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, createRetirementContributionFragment, args);
        }
    }
}
