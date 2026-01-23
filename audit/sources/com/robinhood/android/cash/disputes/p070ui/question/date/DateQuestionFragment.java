package com.robinhood.android.cash.disputes.p070ui.question.date;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.InitialValueObservable;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.FragmentDateQuestionBinding;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.view.DateSelectionView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.ApiDispute;
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
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import okio.ByteString;
import p479j$.time.LocalDate;

/* compiled from: DateQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002[ZB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0007J!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0016J&\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0!H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001f\u0010:\u001a\u000605j\u0002`68BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR/\u0010T\u001a\u0004\u0018\u00010\u00172\b\u0010N\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u001aR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeToolbarSkipText;", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$SingleDateCallbacks;", "<init>", "()V", "", "skipQuestion", "answerQuestion", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "onDateSelected", "(Lj$/time/LocalDate;)V", "", "onDismissUnsupportedFeatureDialog", "()Z", "addToolbarSkipContainer", "", "skipText", "Lkotlin/Function0;", "clickAction", "setDisputeSkipButtonText", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "isSkipButtonEnabled", "setDisputeSkipButtonEnabled", "(Z)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventContext$delegate", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionDuxo;", "duxo$delegate", "getDuxo", "()Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionDuxo;", "duxo", "Lcom/robinhood/android/cash/disputes/databinding/FragmentDateQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/FragmentDateQuestionBinding;", "binding", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "callbacks", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "selectedDateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "<set-?>", "selectedDate$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSelectedDate", "()Lj$/time/LocalDate;", "setSelectedDate", RecurringDatePickerActivity.ARG_SELECTED_DATE, "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Args", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DateQuestionFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, DisputeToolbarSkipText, DateSelectionView.SingleDateCallbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final /* synthetic */ DisputeToolbarSkipText2 $$delegate_1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;

    /* renamed from: selectedDate$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedDate;
    private final BehaviorRelay<LocalDate> selectedDateRelay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DateQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/FragmentDateQuestionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DateQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DateQuestionFragment.class, RecurringDatePickerActivity.ARG_SELECTED_DATE, "getSelectedDate()Ljava/time/LocalDate;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void addToolbarSkipContainer(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.$$delegate_1.addToolbarSkipContainer(toolbar);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void setDisputeSkipButtonEnabled(boolean isSkipButtonEnabled) {
        this.$$delegate_1.setDisputeSkipButtonEnabled(isSkipButtonEnabled);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText
    public void setDisputeSkipButtonText(String skipText, Function0<Unit> clickAction) {
        Intrinsics.checkNotNullParameter(skipText, "skipText");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.$$delegate_1.setDisputeSkipButtonText(skipText, clickAction);
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

    public DateQuestionFragment() {
        super(C10007R.layout.fragment_date_question);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.$$delegate_1 = new DisputeToolbarSkipText2();
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DateQuestionFragment.eventScreen_delegate$lambda$0(this.f$0);
            }
        });
        this.eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DateQuestionFragment.eventContext_delegate$lambda$1(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, DateQuestionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DateQuestionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DisputeQuestionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DisputeQuestionCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        BehaviorRelay<LocalDate> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.selectedDateRelay = behaviorRelayCreate;
        this.selectedDate = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[2]);
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
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(DateQuestionFragment dateQuestionFragment) {
        Screen.Name name = Screen.Name.DISPUTES_DATE_ENTRY_QUESTION;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) dateQuestionFragment)).getQuestion().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context eventContext_delegate$lambda$1(DateQuestionFragment dateQuestionFragment) {
        Companion companion = INSTANCE;
        String serverValue = ((Args) companion.getArgs((Fragment) dateQuestionFragment)).getDisputeReason().getServerValue();
        String string2 = ((Args) companion.getArgs((Fragment) dateQuestionFragment)).getQuestion().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        ByteString byteString = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
        String str7 = null;
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
        return new Context(i, i2, i3, str, str2, 0 == true ? 1 : 0, str3, objArr, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, new TransactionDisputeContext(serverValue, string2, ((Args) companion.getArgs((Fragment) dateQuestionFragment)).getQuestion().getDisplayTitle(), byteString, 8, null), networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    private final DateQuestionDuxo getDuxo() {
        return (DateQuestionDuxo) this.duxo.getValue();
    }

    private final FragmentDateQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDateQuestionBinding) value;
    }

    private final DisputeQuestionCallbacks getCallbacks() {
        return (DisputeQuestionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final LocalDate getSelectedDate() {
        return (LocalDate) this.selectedDate.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSelectedDate(LocalDate localDate) {
        this.selectedDate.setValue(this, $$delegatedProperties[2], localDate);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getQuestion().getType() != DisputeQuestionnaire.Question.UserInput.Type.DATE) {
            throw new IllegalStateException("Check failed.");
        }
        DateSelectionView dateSelectionView = getBinding().dateQuestionDateSelection;
        dateSelectionView.setSingleDateCallbacks(this);
        Intrinsics.checkNotNull(dateSelectionView);
        ViewsKt.eventData$default(dateSelectionView, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DateQuestionFragment.onViewCreated$lambda$4$lambda$2(this.f$0);
            }
        }, 1, null);
        LocalDate selectedDate = getSelectedDate();
        if (selectedDate != null) {
            DateSelectionView.setDateSelection$default(dateSelectionView, selectedDate, null, false, 6, null);
        }
        RdsButton rdsButton = getBinding().dateQuestionContinueButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DateQuestionFragment.onViewCreated$lambda$6$lambda$5(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new DateQuestionFragment3(this));
        Observables observables = Observables.INSTANCE;
        RdsTextInputEditText dateQuestionInput = getBinding().dateQuestionInput;
        Intrinsics.checkNotNullExpressionValue(dateQuestionInput, "dateQuestionInput");
        InitialValueObservable<CharSequence> initialValueObservableTextChanges = RxTextView.textChanges(dateQuestionInput);
        Observable observableStartWith = ObservablesKt.toOptionals(this.selectedDateRelay).startWith((Observable) Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        Observable observableDistinctUntilChanged = observables.combineLatest(initialValueObservableTextChanges, observableStartWith).map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment.onViewCreated.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<? extends CharSequence, ? extends Optional<LocalDate>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Boolean.valueOf((StringsKt.isBlank(tuples2.component1()) || tuples2.component2().getOrNull() == null) ? false : true);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionFragment.onViewCreated$lambda$7(this.f$0, (Boolean) obj);
            }
        });
        Observable<DateQuestionViewState> observableDistinctUntilChanged2 = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DateQuestionFragment.onViewCreated$lambda$12(this.f$0, (DateQuestionViewState) obj);
            }
        });
        DisputeQuestionResponse previousQuestionResponse = getCallbacks().getPreviousQuestionResponse(((Args) companion.getArgs((Fragment) this)).getQuestion().getId());
        DisputeQuestionResponse.Date date = (DisputeQuestionResponse.Date) (previousQuestionResponse instanceof DisputeQuestionResponse.Date ? previousQuestionResponse : null);
        if (date != null) {
            getDuxo().updatePreFillValues(date);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$2(DateQuestionFragment dateQuestionFragment) {
        return new UserInteractionEventDescriptor(null, null, null, dateQuestionFragment.getEventContext(), new Component(Component.ComponentType.DATE_RANGE_BUTTON, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$5(DateQuestionFragment dateQuestionFragment) {
        return new UserInteractionEventDescriptor(null, null, null, dateQuestionFragment.getEventContext(), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(DateQuestionFragment dateQuestionFragment, Boolean bool) {
        RdsButton rdsButton = dateQuestionFragment.getBinding().dateQuestionContinueButton;
        Intrinsics.checkNotNull(bool);
        rdsButton.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(DateQuestionFragment dateQuestionFragment, DateQuestionViewState dateQuestionViewState) {
        ResponseValidationResult responseValidationResultConsume;
        String strConsume;
        LocalDate localDateConsume;
        dateQuestionFragment.getBinding().dateQuestionTitle.setText(dateQuestionViewState.getTitleText());
        RhTextView rhTextView = dateQuestionFragment.getBinding().dateQuestionSubtitle;
        rhTextView.setText(dateQuestionViewState.getSubtitleText());
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(dateQuestionViewState.isSubtitleVisible() ? 0 : 8);
        dateQuestionFragment.getBinding().dateQuestionDateSelection.setEarliestAvailableDate(dateQuestionViewState.getEarliestAvailableDate());
        dateQuestionFragment.getBinding().dateQuestionContinueButton.setLoading(dateQuestionViewState.getIsValidationRequestLoading());
        dateQuestionFragment.setDisputeSkipButtonEnabled(dateQuestionViewState.isSkipButtonEnabled());
        UiEvent<LocalDate> datePreFillEvent = dateQuestionViewState.getDatePreFillEvent();
        if (datePreFillEvent != null && (localDateConsume = datePreFillEvent.consume()) != null) {
            DateSelectionView.setDateSelection$default(dateQuestionFragment.getBinding().dateQuestionDateSelection, localDateConsume, null, false, 6, null);
        }
        UiEvent<String> textPreFillEvent = dateQuestionViewState.getTextPreFillEvent();
        if (textPreFillEvent != null && (strConsume = textPreFillEvent.consume()) != null) {
            dateQuestionFragment.getBinding().dateQuestionInput.setText(strConsume);
        }
        UiEvent<ResponseValidationResult> validationResultEvent = dateQuestionViewState.getValidationResultEvent();
        if (validationResultEvent != null && (responseValidationResultConsume = validationResultEvent.consume()) != null) {
            if (responseValidationResultConsume instanceof ResponseValidationResult.Success) {
                dateQuestionFragment.getCallbacks().onQuestionAnswered(((ResponseValidationResult.Success) responseValidationResultConsume).getValidatedQuestionResponse());
            } else {
                if (!(responseValidationResultConsume instanceof ResponseValidationResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ResponseValidationResult.Error error = (ResponseValidationResult.Error) responseValidationResultConsume;
                if (error.getErrorMessage() != null) {
                    FragmentActivity fragmentActivityRequireActivity = dateQuestionFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Snackbars.showLarge(fragmentActivityRequireActivity, error.getErrorMessage(), 0);
                } else {
                    AbsErrorHandler.handleError$default(dateQuestionFragment.getActivityErrorHandler(), error.getThrowable(), false, 2, null);
                }
            }
        }
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
        RdsTextInputEditText dateQuestionInput = getBinding().dateQuestionInput;
        Intrinsics.checkNotNullExpressionValue(dateQuestionInput, "dateQuestionInput");
        com.robinhood.utils.extensions.ViewsKt.hideKeyboard$default(dateQuestionInput, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        String displaySkipText = ((Args) INSTANCE.getArgs((Fragment) this)).getQuestion().getDisplaySkipText();
        if (displaySkipText != null) {
            addToolbarSkipContainer(toolbar);
            setDisputeSkipButtonText(displaySkipText, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DateQuestionFragment.configureToolbar$lambda$15$lambda$14(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$15$lambda$14(DateQuestionFragment dateQuestionFragment) {
        dateQuestionFragment.skipQuestion();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.cash.disputes.view.DateSelectionView.SingleDateCallbacks
    public void onDateSelected(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.selectedDateRelay.accept(date);
        setSelectedDate(date);
    }

    private final void skipQuestion() {
        DisputeQuestionCallbacks callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onQuestionAnswered(new DisputeQuestionResponse.Skip(((Args) companion.getArgs((Fragment) this)).getQuestion(), ((Args) companion.getArgs((Fragment) this)).getQuestion().getNextId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void answerQuestion() {
        LocalDate value = this.selectedDateRelay.getValue();
        String string2 = StringsKt.trim(String.valueOf(getBinding().dateQuestionInput.getText())).toString();
        if (value == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (StringsKt.isBlank(string2)) {
            throw new IllegalStateException("Check failed.");
        }
        DateQuestionDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.validateResponse(new DisputeQuestionResponse.Date(((Args) companion.getArgs((Fragment) this)).getQuestion(), ((Args) companion.getArgs((Fragment) this)).getQuestion().getNextId(), value, string2));
    }

    /* compiled from: DateQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "transactionIds", "", "Ljava/util/UUID;", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Ljava/util/List;Lcom/robinhood/models/api/minerva/ApiDispute$Reason;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "getTransactionIds", "()Ljava/util/List;", "getDisputeReason", "()Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDispute.Reason disputeReason;
        private final DisputeQuestionnaire.Question.UserInput question;
        private final java.util.List<UUID> transactionIds;

        /* compiled from: DateQuestionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DisputeQuestionnaire.Question.UserInput userInput = (DisputeQuestionnaire.Question.UserInput) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(userInput, arrayList, ApiDispute.Reason.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, DisputeQuestionnaire.Question.UserInput userInput, java.util.List list, ApiDispute.Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                userInput = args.question;
            }
            if ((i & 2) != 0) {
                list = args.transactionIds;
            }
            if ((i & 4) != 0) {
                reason = args.disputeReason;
            }
            return args.copy(userInput, list, reason);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question.UserInput getQuestion() {
            return this.question;
        }

        public final java.util.List<UUID> component2() {
            return this.transactionIds;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }

        public final Args copy(DisputeQuestionnaire.Question.UserInput question, java.util.List<UUID> transactionIds, ApiDispute.Reason disputeReason) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            return new Args(question, transactionIds, disputeReason);
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
            return Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.transactionIds, args.transactionIds) && this.disputeReason == args.disputeReason;
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + this.transactionIds.hashCode()) * 31) + this.disputeReason.hashCode();
        }

        public String toString() {
            return "Args(question=" + this.question + ", transactionIds=" + this.transactionIds + ", disputeReason=" + this.disputeReason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            java.util.List<UUID> list = this.transactionIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeString(this.disputeReason.name());
        }

        public Args(DisputeQuestionnaire.Question.UserInput question, java.util.List<UUID> transactionIds, ApiDispute.Reason disputeReason) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
            this.question = question;
            this.transactionIds = transactionIds;
            this.disputeReason = disputeReason;
        }

        public final DisputeQuestionnaire.Question.UserInput getQuestion() {
            return this.question;
        }

        public final java.util.List<UUID> getTransactionIds() {
            return this.transactionIds;
        }

        public final ApiDispute.Reason getDisputeReason() {
            return this.disputeReason;
        }
    }

    /* compiled from: DateQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment;", "Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DateQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DateQuestionFragment dateQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dateQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DateQuestionFragment newInstance(Args args) {
            return (DateQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DateQuestionFragment dateQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dateQuestionFragment, args);
        }
    }
}
