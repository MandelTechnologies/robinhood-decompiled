package com.robinhood.android.cash.disputes.p070ui.transaction;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.FragmentTransactionSelectionBinding;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionMultiSelectionAdapter;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionSelectionFragment;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionSingleSelectionAdapter;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionValidationResult;
import com.robinhood.android.cash.disputes.p070ui.transaction.review.TransactionReviewActivity;
import com.robinhood.android.cash.disputes.view.DateSelectionView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
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
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import okio.ByteString;
import p479j$.time.LocalDate;

/* compiled from: TransactionSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003ghfB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\bJ#\u0010\u001a\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00108\u001a\u000602j\u0002`38BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR%\u0010M\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u001c0I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bK\u0010LR\"\u0010Q\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010O0O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001c0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR/\u0010\\\u001a\u0004\u0018\u00010\u00182\b\u0010U\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R/\u0010`\u001a\u0004\u0018\u00010\u00182\b\u0010U\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\"\u0004\b_\u0010[R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionMultiSelectionAdapter$Callbacks;", "<init>", "()V", "", "showDuplicateTransactionErrorSnackbar", "", "isReviewButtonVisible", "toggleReviewTransactionButtonVisibility", "(Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "Lkotlin/Pair;", "j$/time/LocalDate", "dateRange", "onDateRangeSelected", "(Lkotlin/Pair;)V", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "transaction", "onSingleTransactionSelected", "(Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "", "transactions", "onMultipleTransactionsSelected", "(Ljava/util/List;)V", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventContext$delegate", "Lkotlin/Lazy;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionDuxo;", "duxo$delegate", "getDuxo", "()Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionDuxo;", "duxo", "Lcom/robinhood/android/cash/disputes/databinding/FragmentTransactionSelectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/FragmentTransactionSelectionBinding;", "binding", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Callbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Callbacks;", "callbacks", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "adapter$delegate", "getAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "adapter", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/cash/disputes/ui/transaction/review/TransactionReviewActivity$Args;", "kotlin.jvm.PlatformType", "transactionReviewLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "selectedTransactions", "Ljava/util/List;", "<set-?>", "selectedDateStart$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSelectedDateStart", "()Lj$/time/LocalDate;", "setSelectedDateStart", "(Lj$/time/LocalDate;)V", "selectedDateStart", "selectedDateEnd$delegate", "getSelectedDateEnd", "setSelectedDateEnd", "selectedDateEnd", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionSelectionFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, DateSelectionView.DateRangeCallbacks, TransactionSingleSelectionAdapter.Callbacks, TransactionMultiSelectionAdapter.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext;
    public EventLogger eventLogger;
    private final Screen eventScreen;

    /* renamed from: selectedDateEnd$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedDateEnd;

    /* renamed from: selectedDateStart$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedDateStart;
    private List<SettledCardTransaction> selectedTransactions;
    private final ActivityResultLauncher<TransactionReviewActivity.Args> transactionReviewLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransactionSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/FragmentTransactionSelectionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TransactionSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransactionSelectionFragment.class, "selectedDateStart", "getSelectedDateStart()Ljava/time/LocalDate;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransactionSelectionFragment.class, "selectedDateEnd", "getSelectedDateEnd()Ljava/time/LocalDate;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TransactionSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Callbacks;", "", "onTransactionsSelected", "", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTransactionsSelected(List<SettledCardTransaction> transactions);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public TransactionSelectionFragment() {
        super(C10007R.layout.fragment_transaction_selection);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.DISPUTES_TRANSACTION_SELECTION, null, null, null, 14, null);
        this.eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.eventContext_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, TransactionSelectionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, TransactionSelectionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof TransactionSelectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.adapter_delegate$lambda$1(this.f$0);
            }
        });
        ActivityResultLauncher<TransactionReviewActivity.Args> activityResultLauncherRegisterForActivityResult = registerForActivityResult(TransactionReviewActivity.ResultContract.INSTANCE, new ActivityResultCallback() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$transactionReviewLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransactionReviewActivity.Result result) {
                List<SettledCardTransaction> transactions;
                if (result == null || (transactions = result.getTransactions()) == null) {
                    return;
                }
                TransactionSelectionFragment transactionSelectionFragment = this.this$0;
                GenericListAdapter adapter = transactionSelectionFragment.getAdapter();
                if (adapter instanceof TransactionMultiSelectionAdapter) {
                    ((TransactionMultiSelectionAdapter) adapter).setSelectedTransactions(transactions);
                } else if (adapter instanceof TransactionSingleSelectionAdapter) {
                    ((TransactionSingleSelectionAdapter) adapter).setSelectedTransaction((SettledCardTransaction) CollectionsKt.firstOrNull((List) transactions));
                }
                transactionSelectionFragment.getDuxo().setSelectedTransactions(transactions);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transactionReviewLauncher = activityResultLauncherRegisterForActivityResult;
        this.selectedTransactions = CollectionsKt.emptyList();
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.selectedDateStart = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[2]);
        this.selectedDateEnd = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[3]);
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
        return this.eventScreen;
    }

    private final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context eventContext_delegate$lambda$0(TransactionSelectionFragment transactionSelectionFragment) {
        String str = null;
        String str2 = null;
        ByteString byteString = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
        ByteString byteString2 = null;
        int i5 = -1;
        int i6 = -4097;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new Context(i, i2, i3, str2, 0 == true ? 1 : 0, str3, objArr, productTag, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, new TransactionDisputeContext(((Args) INSTANCE.getArgs((Fragment) transactionSelectionFragment)).getDisputeReason().getServerValue(), str, str2, byteString, 14, null), networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionSelectionDuxo getDuxo() {
        return (TransactionSelectionDuxo) this.duxo.getValue();
    }

    private final FragmentTransactionSelectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransactionSelectionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GenericListAdapter<?, SettledCardTransaction> getAdapter() {
        return (GenericListAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericListAdapter adapter_delegate$lambda$1(TransactionSelectionFragment transactionSelectionFragment) {
        if (((Args) INSTANCE.getArgs((Fragment) transactionSelectionFragment)).getTransactionSelectionSettings().getCanSelectMultiple()) {
            return new TransactionMultiSelectionAdapter(transactionSelectionFragment, transactionSelectionFragment.getEventContext());
        }
        return new TransactionSingleSelectionAdapter(transactionSelectionFragment, transactionSelectionFragment.getEventContext());
    }

    private final LocalDate getSelectedDateStart() {
        return (LocalDate) this.selectedDateStart.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSelectedDateStart(LocalDate localDate) {
        this.selectedDateStart.setValue(this, $$delegatedProperties[2], localDate);
    }

    private final LocalDate getSelectedDateEnd() {
        return (LocalDate) this.selectedDateEnd.getValue(this, $$delegatedProperties[3]);
    }

    private final void setSelectedDateEnd(LocalDate localDate) {
        this.selectedDateEnd.setValue(this, $$delegatedProperties[3], localDate);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().transactionSelectionTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getTransactionSelectionSettings().getDisplayTitle());
        RhTextView transactionSelectionSubtitle = getBinding().transactionSelectionSubtitle;
        Intrinsics.checkNotNullExpressionValue(transactionSelectionSubtitle, "transactionSelectionSubtitle");
        TextViewsKt.setVisibilityText(transactionSelectionSubtitle, ((Args) companion.getArgs((Fragment) this)).getTransactionSelectionSettings().getDisplayText());
        DateSelectionView dateSelectionView = getBinding().transactionSelectionDateSelection;
        dateSelectionView.setDateRangeCallbacks(this);
        Intrinsics.checkNotNull(dateSelectionView);
        ViewsKt.eventData$default(dateSelectionView, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        }, 1, null);
        LocalDate selectedDateStart = getSelectedDateStart();
        LocalDate selectedDateEnd = getSelectedDateEnd();
        if (selectedDateStart != null && selectedDateEnd != null) {
            DateSelectionView.setDateSelection$default(dateSelectionView, selectedDateStart, selectedDateEnd, false, 4, null);
        }
        RecyclerView recyclerView = getBinding().transactionSelectionRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, getAdapter());
        RdsButton rdsButton = getBinding().transactionSelectionReviewButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.onViewCreated$lambda$7$lambda$5(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.onViewCreated$lambda$7$lambda$6(this.f$0);
            }
        });
        RdsButton rdsButton2 = getBinding().transactionSelectionContinueButton;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.onViewCreated$lambda$10$lambda$8(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSelectionFragment.onViewCreated$lambda$10$lambda$9(this.f$0);
            }
        });
        if (((Args) companion.getArgs((Fragment) this)).getTransactionSelectionSettings().getCanSelectMultiple()) {
            Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment.onViewCreated.5
                @Override // io.reactivex.functions.Function
                public final Optional<SettledCardTransaction> apply(TransactionSelectionViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(it.getPreSelectedTransaction());
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransactionSelectionFragment.onViewCreated$lambda$11(this.f$0, (Optional) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionFragment.onViewCreated$lambda$18(this.f$0, (TransactionSelectionViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment.onViewCreated.8
            @Override // io.reactivex.functions.Function
            public final Optional<LocalDate> apply(TransactionSelectionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getEarliestAvailableDate());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionFragment.onViewCreated$lambda$19(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment.onViewCreated.10
            @Override // io.reactivex.functions.Function
            public final Boolean apply(TransactionSelectionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isReviewButtonVisible());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionFragment.onViewCreated$lambda$20(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment.onViewCreated.12
            @Override // io.reactivex.functions.Function
            public final List<SettledCardTransaction> apply(TransactionSelectionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSortedCardTransactions();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSelectionFragment.onViewCreated$lambda$21(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$2(TransactionSelectionFragment transactionSelectionFragment) {
        return new UserInteractionEventDescriptor(null, null, null, transactionSelectionFragment.getEventContext(), new Component(Component.ComponentType.DATE_RANGE_BUTTON, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$5(TransactionSelectionFragment transactionSelectionFragment) {
        Context eventContext = transactionSelectionFragment.getEventContext();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String string2 = transactionSelectionFragment.getString(C10007R.string.dispute_logging_id_transaction_selection_review);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new UserInteractionEventDescriptor(null, null, null, eventContext, new Component(componentType, string2, null, 4, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(TransactionSelectionFragment transactionSelectionFragment) {
        ActivityResultLauncher<TransactionReviewActivity.Args> activityResultLauncher = transactionSelectionFragment.transactionReviewLauncher;
        Companion companion = INSTANCE;
        activityResultLauncher.launch(new TransactionReviewActivity.Args(((Args) companion.getArgs((Fragment) transactionSelectionFragment)).getDisputeReason(), transactionSelectionFragment.selectedTransactions, ((Args) companion.getArgs((Fragment) transactionSelectionFragment)).getPreSelectedTransactionId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$10$lambda$8(TransactionSelectionFragment transactionSelectionFragment) {
        return new UserInteractionEventDescriptor(null, null, null, transactionSelectionFragment.getEventContext(), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9(TransactionSelectionFragment transactionSelectionFragment) {
        transactionSelectionFragment.getDuxo().validateSelectedTransactions();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(TransactionSelectionFragment transactionSelectionFragment, Optional optional) {
        SettledCardTransaction settledCardTransaction = (SettledCardTransaction) optional.component1();
        GenericListAdapter<?, SettledCardTransaction> adapter = transactionSelectionFragment.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.cash.disputes.ui.transaction.TransactionMultiSelectionAdapter");
        ((TransactionMultiSelectionAdapter) adapter).setPreSelectedTransaction(settledCardTransaction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(TransactionSelectionFragment transactionSelectionFragment, TransactionSelectionViewState state) {
        TransactionValidationResult transactionValidationResultConsume;
        Tuples2<LocalDate, LocalDate> tuples2Consume;
        Intrinsics.checkNotNullParameter(state, "state");
        transactionSelectionFragment.selectedTransactions = state.getSelectedTransactions();
        RhTextView rhTextView = transactionSelectionFragment.getBinding().transactionSelectionEmptyTitle;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(state.isEmptyStateVisible() ? 0 : 8);
        StringResource emptyStateTitleRes = state.getEmptyStateTitleRes();
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(emptyStateTitleRes.getText(resources));
        RhTextView rhTextView2 = transactionSelectionFragment.getBinding().transactionSelectionEmptyDescription;
        Intrinsics.checkNotNull(rhTextView2);
        rhTextView2.setVisibility(state.isEmptyStateVisible() ? 0 : 8);
        StringResource emptyStateDescriptionRes = state.getEmptyStateDescriptionRes();
        Resources resources2 = rhTextView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(emptyStateDescriptionRes.getText(resources2));
        ImageView imageView = transactionSelectionFragment.getBinding().transactionSelectionEmptyImage;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(state.isEmptyStateVisible() ? 0 : 8);
        Integer emptyStateImageTopMarginRes = state.getEmptyStateImageTopMarginRes();
        com.robinhood.utils.extensions.ViewsKt.setMarginTop(imageView, emptyStateImageTopMarginRes != null ? Integer.valueOf(imageView.getResources().getDimensionPixelSize(emptyStateImageTopMarginRes.intValue())).intValue() : 0);
        transactionSelectionFragment.getBinding().transactionSelectionReviewButton.setText(transactionSelectionFragment.getResources().getQuantityString(C10007R.plurals.dispute_review_selected_transactions, state.getSelectedTransactionCount()));
        RecyclerView transactionSelectionRecyclerView = transactionSelectionFragment.getBinding().transactionSelectionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(transactionSelectionRecyclerView, "transactionSelectionRecyclerView");
        transactionSelectionRecyclerView.setVisibility(state.isTransactionListVisible() ? 0 : 8);
        transactionSelectionFragment.getBinding().transactionSelectionContinueButton.setEnabled(state.isContinueEnabled());
        UiEvent<Tuples2<LocalDate, LocalDate>> initialDateRangeSelectionEvent = state.getInitialDateRangeSelectionEvent();
        if (initialDateRangeSelectionEvent != null && (tuples2Consume = initialDateRangeSelectionEvent.consume()) != null) {
            transactionSelectionFragment.getBinding().transactionSelectionDateSelection.setDateSelection(tuples2Consume.getFirst(), tuples2Consume.getSecond(), true);
        }
        UiEvent<TransactionValidationResult> transactionValidationResultEvent = state.getTransactionValidationResultEvent();
        if (transactionValidationResultEvent != null && (transactionValidationResultConsume = transactionValidationResultEvent.consume()) != null) {
            if (transactionValidationResultConsume instanceof TransactionValidationResult.Success) {
                transactionSelectionFragment.getCallbacks().onTransactionsSelected(((TransactionValidationResult.Success) transactionValidationResultConsume).getValidatedTransactions());
            } else {
                if (!(transactionValidationResultConsume instanceof TransactionValidationResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                transactionSelectionFragment.showDuplicateTransactionErrorSnackbar();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$19(TransactionSelectionFragment transactionSelectionFragment, Optional optional) {
        transactionSelectionFragment.getBinding().transactionSelectionDateSelection.setEarliestAvailableDate((LocalDate) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$20(TransactionSelectionFragment transactionSelectionFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        transactionSelectionFragment.toggleReviewTransactionButtonVisibility(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$21(TransactionSelectionFragment transactionSelectionFragment, List list) {
        transactionSelectionFragment.getAdapter().submitList(list);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), null, null, getEventContext(), 13, null);
    }

    @Override // com.robinhood.android.cash.disputes.view.DateSelectionView.DateRangeCallbacks
    public void onDateRangeSelected(Tuples2<LocalDate, LocalDate> dateRange) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        setSelectedDateStart(dateRange.getFirst());
        setSelectedDateEnd(dateRange.getSecond());
        getDuxo().updateSelectedDateRange(dateRange.getFirst(), dateRange.getSecond());
    }

    @Override // com.robinhood.android.cash.disputes.ui.transaction.TransactionSingleSelectionAdapter.Callbacks
    public void onSingleTransactionSelected(SettledCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        getDuxo().setSelectedTransactions(CollectionsKt.listOf(transaction));
    }

    @Override // com.robinhood.android.cash.disputes.ui.transaction.TransactionMultiSelectionAdapter.Callbacks
    public void onMultipleTransactionsSelected(List<SettledCardTransaction> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        getDuxo().setSelectedTransactions(transactions);
    }

    private final void showDuplicateTransactionErrorSnackbar() {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        CoordinatorLayout transactionSelectionSnackbarContainer = getBinding().transactionSelectionSnackbarContainer;
        Intrinsics.checkNotNullExpressionValue(transactionSelectionSnackbarContainer, "transactionSelectionSnackbarContainer");
        RdsSnackbar rdsSnackbarMake = companion.make(transactionSelectionSnackbarContainer, C10007R.string.dispute_transaction_selection_duplicate_error, 0);
        rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_info_16dp);
        rdsSnackbarMake.show();
    }

    private final void toggleReviewTransactionButtonVisibility(boolean isReviewButtonVisible) {
        ConstraintLayout transactionSelectionRootLayout = getBinding().transactionSelectionRootLayout;
        Intrinsics.checkNotNullExpressionValue(transactionSelectionRootLayout, "transactionSelectionRootLayout");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$toggleReviewTransactionButtonVisibility$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$toggleReviewTransactionButtonVisibility$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        if (isReviewButtonVisible) {
            Fade fade = new Fade();
            fade.addTarget(getBinding().transactionSelectionReviewButton);
            fade.setDuration(150L);
            transitionSet.addTransition(fade);
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget((View) getBinding().transactionSelectionRecyclerView);
        autoTransition.setDuration(isReviewButtonVisible ? 150L : 100L);
        transitionSet.addTransition(autoTransition);
        TransitionManager.beginDelayedTransition(transactionSelectionRootLayout, transitionSet);
        RdsButton transactionSelectionReviewButton = getBinding().transactionSelectionReviewButton;
        Intrinsics.checkNotNullExpressionValue(transactionSelectionReviewButton, "transactionSelectionReviewButton");
        transactionSelectionReviewButton.setVisibility(isReviewButtonVisible ? 0 : 8);
    }

    /* compiled from: TransactionSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Args;", "Landroid/os/Parcelable;", "transactionSelectionSettings", "Lcom/robinhood/models/ui/DisputeQuestionnaire$TransactionSelectionSettings;", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "preSelectedTransactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$TransactionSelectionSettings;Lcom/robinhood/models/api/minerva/ApiDispute$Reason;Ljava/util/UUID;)V", "getTransactionSelectionSettings", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$TransactionSelectionSettings;", "getDisputeReason", "()Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "getPreSelectedTransactionId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDispute.Reason disputeReason;
        private final UUID preSelectedTransactionId;
        private final DisputeQuestionnaire.TransactionSelectionSettings transactionSelectionSettings;

        /* compiled from: TransactionSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DisputeQuestionnaire.TransactionSelectionSettings) parcel.readParcelable(Args.class.getClassLoader()), ApiDispute.Reason.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DisputeQuestionnaire.TransactionSelectionSettings transactionSelectionSettings, ApiDispute.Reason reason, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionSelectionSettings = args.transactionSelectionSettings;
            }
            if ((i & 2) != 0) {
                reason = args.disputeReason;
            }
            if ((i & 4) != 0) {
                uuid = args.preSelectedTransactionId;
            }
            return args.copy(transactionSelectionSettings, reason, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.TransactionSelectionSettings getTransactionSelectionSettings() {
            return this.transactionSelectionSettings;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getPreSelectedTransactionId() {
            return this.preSelectedTransactionId;
        }

        public final Args copy(DisputeQuestionnaire.TransactionSelectionSettings transactionSelectionSettings, ApiDispute.Reason disputeReason, UUID preSelectedTransactionId) {
            Intrinsics.checkNotNullParameter(transactionSelectionSettings, "transactionSelectionSettings");
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            return new Args(transactionSelectionSettings, disputeReason, preSelectedTransactionId);
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
            return Intrinsics.areEqual(this.transactionSelectionSettings, args.transactionSelectionSettings) && this.disputeReason == args.disputeReason && Intrinsics.areEqual(this.preSelectedTransactionId, args.preSelectedTransactionId);
        }

        public int hashCode() {
            int iHashCode = ((this.transactionSelectionSettings.hashCode() * 31) + this.disputeReason.hashCode()) * 31;
            UUID uuid = this.preSelectedTransactionId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Args(transactionSelectionSettings=" + this.transactionSelectionSettings + ", disputeReason=" + this.disputeReason + ", preSelectedTransactionId=" + this.preSelectedTransactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transactionSelectionSettings, flags);
            dest.writeString(this.disputeReason.name());
            dest.writeSerializable(this.preSelectedTransactionId);
        }

        public Args(DisputeQuestionnaire.TransactionSelectionSettings transactionSelectionSettings, ApiDispute.Reason disputeReason, UUID uuid) {
            Intrinsics.checkNotNullParameter(transactionSelectionSettings, "transactionSelectionSettings");
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            this.transactionSelectionSettings = transactionSelectionSettings;
            this.disputeReason = disputeReason;
            this.preSelectedTransactionId = uuid;
        }

        public final DisputeQuestionnaire.TransactionSelectionSettings getTransactionSelectionSettings() {
            return this.transactionSelectionSettings;
        }

        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }

        public final UUID getPreSelectedTransactionId() {
            return this.preSelectedTransactionId;
        }
    }

    /* compiled from: TransactionSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSelectionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TransactionSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(TransactionSelectionFragment transactionSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, transactionSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransactionSelectionFragment newInstance(Args args) {
            return (TransactionSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransactionSelectionFragment transactionSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, transactionSelectionFragment, args);
        }
    }
}
