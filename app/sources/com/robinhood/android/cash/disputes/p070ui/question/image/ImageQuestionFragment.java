package com.robinhood.android.cash.disputes.p070ui.question.image;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.FragmentImageQuestionBinding;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeToolbarSkipText2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.image.FileTypeBottomSheet;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionAdapter;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionViewState;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.android.cash.disputes.util.DisputeFileSelectionUtil;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
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
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import okio.ByteString;

/* compiled from: ImageQuestionFragment.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002pqB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0016J\"\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J-\u0010C\u001a\u0002032\u0006\u0010>\u001a\u00020?2\u000e\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0016¢\u0006\u0002\u0010IJ\b\u0010J\u001a\u000203H\u0016J\b\u0010K\u001a\u000203H\u0016J\b\u0010L\u001a\u000203H\u0016J\u0010\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u000203H\u0002J\b\u0010Q\u001a\u000203H\u0002J\b\u0010R\u001a\u000203H\u0002J\b\u0010S\u001a\u000203H\u0002J\u001a\u0010T\u001a\u0002032\b\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010W\u001a\u0002032\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YH\u0002J\b\u0010[\u001a\u000203H\u0002J\b\u0010\\\u001a\u000203H\u0002J\b\u0010]\u001a\u000203H\u0002J\b\u0010^\u001a\u000203H\u0002J\b\u0010_\u001a\u000203H\u0002J\u0010\u0010`\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010a\u001a\u0002032\u0006\u0010>\u001a\u00020?H\u0002J\u0011\u0010b\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0096\u0001J\t\u0010c\u001a\u00020dH\u0096\u0001J\u0011\u0010e\u001a\u0002032\u0006\u0010f\u001a\u00020dH\u0096\u0001J\u001f\u0010g\u001a\u0002032\u0006\u0010h\u001a\u00020F2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002030jH\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0015\u001a\u00060\u0016j\u0002`\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0014\u001a\u0004\b-\u0010.R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010k\u001a\b\u0012\u0004\u0012\u00020m0lX\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeToolbarSkipText;", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileTypeBottomSheet$Callbacks;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext$delegate", "duxo", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionDuxo;", "duxo$delegate", "binding", "Lcom/robinhood/android/cash/disputes/databinding/FragmentImageQuestionBinding;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/FragmentImageQuestionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter;", "getAdapter", "()Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter;", "adapter$delegate", "cameraFileUri", "Landroid/net/Uri;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onCameraUploadTypeSelected", "onPhotosUploadTypeSelected", "onPdfUploadTypeSelected", "onFileItemClicked", "fileSelectionItem", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "startCameraActivity", "showFileSelectionBottomSheet", "skipQuestion", "answerQuestion", "addFileFromIntentResult", "fileType", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;", "addFilesFromPreFill", "preFillFiles", "", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "showMaxFilesDialog", "showFileSizeErrorDialog", "showFileSelectionError", "showCameraNotFoundError", "showCameraPermissionRequiredError", "logExternalActivityAppearEvent", "logExternalActivityDisappearEvent", "addToolbarSkipContainer", "onDismissUnsupportedFeatureDialog", "", "setDisputeSkipButtonEnabled", "isSkipButtonEnabled", "setDisputeSkipButtonText", "skipText", "clickAction", "Lkotlin/Function0;", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ImageQuestionFragment extends BaseFragment implements RegionGated, AutoLoggableFragment, DisputeToolbarSkipText, FileTypeBottomSheet.Callbacks, ImageQuestionAdapter.Callbacks {
    private static final int CAMERA_IMAGE_SELECTION_REQUEST = 3;
    private static final int CAMERA_PERMISSION_REQUEST = 4;
    private static final String DIALOG_FILE_TYPE_BOTTOM_SHEET = "fileTypeBottomSheet";
    private static final int FILE_PREVIEW_REQUEST = 5;
    private static final int IMAGE_SELECTION_REQUEST = 1;
    private static final int PDF_SELECTION_REQUEST = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final /* synthetic */ DisputeToolbarSkipText2 $$delegate_1;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private Uri cameraFileUri;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ImageQuestionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/FragmentImageQuestionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ImageQuestionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ImageQuestionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImageQuestionViewState.UploadButtonAction.values().length];
            try {
                iArr[ImageQuestionViewState.UploadButtonAction.FILE_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageQuestionViewState.UploadButtonAction.MAX_FILES_REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisputeFileData.Type.values().length];
            try {
                iArr2[DisputeFileData.Type.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DisputeFileData.Type.PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

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

    public ImageQuestionFragment() {
        super(C10007R.layout.fragment_image_question);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.$$delegate_1 = new DisputeToolbarSkipText2();
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.eventScreen_delegate$lambda$0(this.f$0);
            }
        });
        this.eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.eventContext_delegate$lambda$1(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, ImageQuestionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ImageQuestionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DisputeQuestionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$special$$inlined$hostActivityCallbacks$1
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
        this.adapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.adapter_delegate$lambda$2(this.f$0);
            }
        });
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
    public static final Screen eventScreen_delegate$lambda$0(ImageQuestionFragment imageQuestionFragment) {
        Screen.Name name;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) imageQuestionFragment)).getQuestion().getType() == DisputeQuestionnaire.Question.UserInput.Type.FREE_RESPONSE_IMAGE) {
            name = Screen.Name.DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD;
        } else {
            name = Screen.Name.DISPUTES_MEDIA_UPLOAD_QUESTION;
        }
        String string2 = ((Args) companion.getArgs((Fragment) imageQuestionFragment)).getQuestion().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context eventContext_delegate$lambda$1(ImageQuestionFragment imageQuestionFragment) {
        Companion companion = INSTANCE;
        String serverValue = ((Args) companion.getArgs((Fragment) imageQuestionFragment)).getDisputeReason().getServerValue();
        String string2 = ((Args) companion.getArgs((Fragment) imageQuestionFragment)).getQuestion().getId().toString();
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
        return new Context(i, i2, i3, str, str2, 0 == true ? 1 : 0, str3, objArr, i4, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, new TransactionDisputeContext(serverValue, string2, ((Args) companion.getArgs((Fragment) imageQuestionFragment)).getQuestion().getDisplayTitle(), byteString, 8, null), networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString2, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    private final ImageQuestionDuxo getDuxo() {
        return (ImageQuestionDuxo) this.duxo.getValue();
    }

    private final FragmentImageQuestionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentImageQuestionBinding) value;
    }

    private final DisputeQuestionCallbacks getCallbacks() {
        return (DisputeQuestionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final ImageQuestionAdapter getAdapter() {
        return (ImageQuestionAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionAdapter adapter_delegate$lambda$2(ImageQuestionFragment imageQuestionFragment) {
        return new ImageQuestionAdapter(imageQuestionFragment, imageQuestionFragment.getEventLogger(), imageQuestionFragment.getEventScreen(), imageQuestionFragment.getEventContext());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        DisputeQuestionnaire.Question.UserInput.Type type2 = ((Args) companion.getArgs((Fragment) this)).getQuestion().getType();
        DisputeQuestionnaire.Question.UserInput.Type type3 = DisputeQuestionnaire.Question.UserInput.Type.FREE_RESPONSE_IMAGE;
        if (type2 == type3) {
            if (((Args) companion.getArgs((Fragment) this)).getQuestion().getType() != type3) {
                throw new IllegalStateException("Check failed.");
            }
            RdsTextInputContainerView imageQuestionTextInputContainer = getBinding().imageQuestionTextInputContainer;
            Intrinsics.checkNotNullExpressionValue(imageQuestionTextInputContainer, "imageQuestionTextInputContainer");
            imageQuestionTextInputContainer.setVisibility(0);
        } else {
            if (((Args) companion.getArgs((Fragment) this)).getQuestion().getType() != DisputeQuestionnaire.Question.UserInput.Type.IMAGE) {
                throw new IllegalStateException("Check failed.");
            }
            RdsTextInputContainerView imageQuestionTextInputContainer2 = getBinding().imageQuestionTextInputContainer;
            Intrinsics.checkNotNullExpressionValue(imageQuestionTextInputContainer2, "imageQuestionTextInputContainer");
            imageQuestionTextInputContainer2.setVisibility(8);
        }
        RecyclerView imageQuestionRecyclerView = getBinding().imageQuestionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(imageQuestionRecyclerView, "imageQuestionRecyclerView");
        bindAdapter(imageQuestionRecyclerView, getAdapter());
        RdsButton rdsButton = getBinding().imageQuestionContinueButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.onViewCreated$lambda$4$lambda$3(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new ImageQuestionFragment3(this));
        RdsButton imageQuestionUploadButton = getBinding().imageQuestionUploadButton;
        Intrinsics.checkNotNullExpressionValue(imageQuestionUploadButton, "imageQuestionUploadButton");
        ViewsKt.eventData$default(imageQuestionUploadButton, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.onViewCreated$lambda$5(this.f$0);
            }
        }, 1, null);
        getDuxo().observeFileSelections(getAdapter().getSelectedFilesRelay());
        RdsTextInputEditText imageQuestionTextInput = getBinding().imageQuestionTextInput;
        Intrinsics.checkNotNullExpressionValue(imageQuestionTextInput, "imageQuestionTextInput");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(imageQuestionTextInput).map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment.onViewCreated.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return Boolean.valueOf(StringsKt.isBlank(text));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionFragment.onViewCreated$lambda$6(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionFragment.onViewCreated$lambda$12(this.f$0, (ImageQuestionViewState) obj);
            }
        });
        DisputeQuestionResponse previousQuestionResponse = getCallbacks().getPreviousQuestionResponse(((Args) companion.getArgs((Fragment) this)).getQuestion().getId());
        DisputeQuestionResponse.Media media = (DisputeQuestionResponse.Media) (previousQuestionResponse instanceof DisputeQuestionResponse.Media ? previousQuestionResponse : null);
        if (media != null) {
            getDuxo().updatePreFillText(media);
            addFilesFromPreFill(media.getFiles());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$3(ImageQuestionFragment imageQuestionFragment) {
        return new UserInteractionEventDescriptor(null, null, null, imageQuestionFragment.getEventContext(), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5(ImageQuestionFragment imageQuestionFragment) {
        Context eventContext = imageQuestionFragment.getEventContext();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String string2 = imageQuestionFragment.getString(C10007R.string.dispute_logging_id_upload_media);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new UserInteractionEventDescriptor(null, null, null, eventContext, new Component(componentType, string2, null, 4, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(ImageQuestionFragment imageQuestionFragment, Boolean bool) {
        ImageQuestionDuxo duxo = imageQuestionFragment.getDuxo();
        Intrinsics.checkNotNull(bool);
        duxo.updateIsTextInputBlank(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(final ImageQuestionFragment imageQuestionFragment, final ImageQuestionViewState viewState) {
        ResponseValidationResult responseValidationResultConsume;
        String strConsume;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        imageQuestionFragment.getBinding().imageQuestionTitle.setText(viewState.getTitleText());
        RhTextView rhTextView = imageQuestionFragment.getBinding().imageQuestionSubtitle;
        rhTextView.setText(viewState.getSubtitleText());
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(viewState.isSubtitleVisible() ? 0 : 8);
        RecyclerView imageQuestionRecyclerView = imageQuestionFragment.getBinding().imageQuestionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(imageQuestionRecyclerView, "imageQuestionRecyclerView");
        imageQuestionRecyclerView.setVisibility(viewState.isRecyclerViewInvisible() ? 4 : 0);
        RdsButton imageQuestionUploadButton = imageQuestionFragment.getBinding().imageQuestionUploadButton;
        Intrinsics.checkNotNullExpressionValue(imageQuestionUploadButton, "imageQuestionUploadButton");
        OnClickListeners.onClick(imageQuestionUploadButton, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionFragment.onViewCreated$lambda$12$lambda$8(viewState, imageQuestionFragment);
            }
        });
        RdsButton rdsButton = imageQuestionFragment.getBinding().imageQuestionContinueButton;
        rdsButton.setEnabled(viewState.isContinueButtonEnabled());
        rdsButton.setLoading(viewState.getIsValidationRequestLoading());
        imageQuestionFragment.setDisputeSkipButtonEnabled(viewState.isSkipButtonEnabled());
        UiEvent<String> textPreFillEvent = viewState.getTextPreFillEvent();
        if (textPreFillEvent != null && (strConsume = textPreFillEvent.consume()) != null) {
            imageQuestionFragment.getBinding().imageQuestionTextInput.setText(strConsume);
        }
        UiEvent<ResponseValidationResult> validationResultEvent = viewState.getValidationResultEvent();
        if (validationResultEvent != null && (responseValidationResultConsume = validationResultEvent.consume()) != null) {
            if (responseValidationResultConsume instanceof ResponseValidationResult.Success) {
                imageQuestionFragment.getCallbacks().onQuestionAnswered(((ResponseValidationResult.Success) responseValidationResultConsume).getValidatedQuestionResponse());
            } else {
                if (!(responseValidationResultConsume instanceof ResponseValidationResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ResponseValidationResult.Error error = (ResponseValidationResult.Error) responseValidationResultConsume;
                if (error.getErrorMessage() != null) {
                    FragmentActivity fragmentActivityRequireActivity = imageQuestionFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Snackbars.showLarge(fragmentActivityRequireActivity, error.getErrorMessage(), 0);
                } else {
                    AbsErrorHandler.handleError$default(imageQuestionFragment.getActivityErrorHandler(), error.getThrowable(), false, 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12$lambda$8(ImageQuestionViewState imageQuestionViewState, ImageQuestionFragment imageQuestionFragment) {
        int i = WhenMappings.$EnumSwitchMapping$0[imageQuestionViewState.getUploadButtonAction().ordinal()];
        if (i == 1) {
            imageQuestionFragment.showFileSelectionBottomSheet();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            imageQuestionFragment.showMaxFilesDialog();
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
        RdsTextInputEditText imageQuestionTextInput = getBinding().imageQuestionTextInput;
        Intrinsics.checkNotNullExpressionValue(imageQuestionTextInput, "imageQuestionTextInput");
        com.robinhood.utils.extensions.ViewsKt.hideKeyboard$default(imageQuestionTextInput, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        String displaySkipText = ((Args) INSTANCE.getArgs((Fragment) this)).getQuestion().getDisplaySkipText();
        if (displaySkipText != null) {
            addToolbarSkipContainer(toolbar);
            setDisputeSkipButtonText(displaySkipText, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageQuestionFragment.configureToolbar$lambda$15$lambda$14(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$15$lambda$14(ImageQuestionFragment imageQuestionFragment) {
        EventLogger.DefaultImpls.logTap$default(imageQuestionFragment.getEventLogger(), null, imageQuestionFragment.getEventScreen(), new Component(Component.ComponentType.SKIP_BUTTON, null, null, 6, null), null, imageQuestionFragment.getEventContext(), false, 41, null);
        imageQuestionFragment.skipQuestion();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (requestCode == 1) {
                addFileFromIntentResult(data, DisputeFileData.Type.IMAGE);
            } else if (requestCode == 2) {
                addFileFromIntentResult(data, DisputeFileData.Type.PDF);
            } else if (requestCode == 3) {
                Intent intent = new Intent();
                intent.setData(this.cameraFileUri);
                addFileFromIntentResult(intent, DisputeFileData.Type.IMAGE);
            }
        }
        logExternalActivityDisappearEvent(requestCode);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 4) {
            if (grantResults.length == 0) {
                return;
            }
            if (ArraysKt.first(grantResults) == 0) {
                startCameraActivity();
            } else {
                showCameraPermissionRequiredError();
            }
        }
    }

    @Override // com.robinhood.android.cash.disputes.ui.question.image.FileTypeBottomSheet.Callbacks
    public void onCameraUploadTypeSelected() {
        Compat compat = Compat.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (compat.checkSelfPermission(fragmentActivityRequireActivity, "android.permission.CAMERA")) {
            startCameraActivity();
        } else {
            requestPermissionsCompat(4, "android.permission.CAMERA");
        }
    }

    @Override // com.robinhood.android.cash.disputes.ui.question.image.FileTypeBottomSheet.Callbacks
    public void onPhotosUploadTypeSelected() {
        startActivityForResult(DisputeFileSelectionUtil.INSTANCE.getImagePickerIntent(), 1);
        logExternalActivityAppearEvent(1);
    }

    @Override // com.robinhood.android.cash.disputes.ui.question.image.FileTypeBottomSheet.Callbacks
    public void onPdfUploadTypeSelected() {
        startActivityForResult(DisputeFileSelectionUtil.INSTANCE.getPdfPickerIntent(), 2);
        logExternalActivityAppearEvent(2);
    }

    @Override // com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionAdapter.Callbacks
    public void onFileItemClicked(FileSelectionItem fileSelectionItem) {
        Intent imageViewerIntent;
        Intrinsics.checkNotNullParameter(fileSelectionItem, "fileSelectionItem");
        int i = WhenMappings.$EnumSwitchMapping$1[fileSelectionItem.getFileData().getType().ordinal()];
        if (i == 1) {
            imageViewerIntent = DisputeFileSelectionUtil.INSTANCE.getImageViewerIntent(fileSelectionItem.getFileData().getUri());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            imageViewerIntent = DisputeFileSelectionUtil.INSTANCE.getPdfViewerIntent(fileSelectionItem.getFileData().getUri());
        }
        try {
            startActivityForResult(imageViewerIntent, 5);
            logExternalActivityAppearEvent(5);
        } catch (ActivityNotFoundException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    private final void startCameraActivity() {
        DisputeFileSelectionUtil disputeFileSelectionUtil = DisputeFileSelectionUtil.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Uri uriCreateCameraImageUri = disputeFileSelectionUtil.createCameraImageUri(contextRequireContext);
        if (uriCreateCameraImageUri != null) {
            this.cameraFileUri = uriCreateCameraImageUri;
            try {
                startActivityForResult(disputeFileSelectionUtil.getCameraIntent(uriCreateCameraImageUri), 3);
                return;
            } catch (ActivityNotFoundException unused) {
                showCameraNotFoundError();
                return;
            }
        }
        showFileSelectionError();
    }

    private final void showFileSelectionBottomSheet() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(DIALOG_FILE_TYPE_BOTTOM_SHEET);
        FileTypeBottomSheet fileTypeBottomSheetNewInstance = fragmentFindFragmentByTag instanceof FileTypeBottomSheet ? (FileTypeBottomSheet) fragmentFindFragmentByTag : null;
        if (fileTypeBottomSheetNewInstance == null) {
            fileTypeBottomSheetNewInstance = FileTypeBottomSheet.INSTANCE.newInstance(new FileTypeBottomSheet.Args(getEventContext()));
        }
        if (fileTypeBottomSheetNewInstance.isAdded()) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        fileTypeBottomSheetNewInstance.show(childFragmentManager, DIALOG_FILE_TYPE_BOTTOM_SHEET);
    }

    private final void skipQuestion() {
        DisputeQuestionCallbacks callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onQuestionAnswered(new DisputeQuestionResponse.Skip(((Args) companion.getArgs((Fragment) this)).getQuestion(), ((Args) companion.getArgs((Fragment) this)).getQuestion().getNextId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void answerQuestion() {
        java.util.List listEmptyList;
        String string2 = StringsKt.trim(String.valueOf(getBinding().imageQuestionTextInput.getText())).toString();
        if (StringsKt.isBlank(string2)) {
            string2 = null;
        }
        ImageQuestionDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        DisputeQuestionnaire.Question.UserInput question = ((Args) companion.getArgs((Fragment) this)).getQuestion();
        UUID nextId = ((Args) companion.getArgs((Fragment) this)).getQuestion().getNextId();
        java.util.List<FileSelectionItem> value = getAdapter().getSelectedFilesRelay().getValue();
        if (value == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            java.util.List<FileSelectionItem> list = value;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((FileSelectionItem) it.next()).getFileData());
            }
        }
        duxo.validateResponse(new DisputeQuestionResponse.Media(question, nextId, listEmptyList, string2));
    }

    private final void addFileFromIntentResult(Intent data, DisputeFileData.Type fileType) {
        DisputeFileSelectionUtil disputeFileSelectionUtil = DisputeFileSelectionUtil.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(disputeFileSelectionUtil.loadFileFromContentRequestIntent(contextRequireContext, data, fileType)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionFragment.addFileFromIntentResult$lambda$19(this.f$0, (DisputeFileSelectionUtil.FileSelectionResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionFragment.addFileFromIntentResult$lambda$20(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFileFromIntentResult$lambda$19(ImageQuestionFragment imageQuestionFragment, DisputeFileSelectionUtil.FileSelectionResult fileSelectionResult) {
        Intrinsics.checkNotNullParameter(fileSelectionResult, "fileSelectionResult");
        if (Intrinsics.areEqual(fileSelectionResult, DisputeFileSelectionUtil.FileSelectionResult.FileLoadingError.INSTANCE)) {
            imageQuestionFragment.showFileSelectionError();
        } else if (Intrinsics.areEqual(fileSelectionResult, DisputeFileSelectionUtil.FileSelectionResult.FileTooLargeError.INSTANCE)) {
            imageQuestionFragment.showFileSizeErrorDialog();
        } else {
            if (!(fileSelectionResult instanceof DisputeFileSelectionUtil.FileSelectionResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            imageQuestionFragment.getAdapter().addItem(((DisputeFileSelectionUtil.FileSelectionResult.Success) fileSelectionResult).getFileSelectionItem());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFileFromIntentResult$lambda$20(ImageQuestionFragment imageQuestionFragment, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 6, null);
        imageQuestionFragment.showFileSelectionError();
        return Unit.INSTANCE;
    }

    private final void addFilesFromPreFill(java.util.List<DisputeFileData> preFillFiles) {
        if (preFillFiles != null) {
            getAdapter().clearItems();
            DisputeFileSelectionUtil disputeFileSelectionUtil = DisputeFileSelectionUtil.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Single<R> map = disputeFileSelectionUtil.loadFilesFromPreviousSelections(contextRequireContext, preFillFiles).map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment.addFilesFromPreFill.1
                @Override // io.reactivex.functions.Function
                public final java.util.List<FileSelectionItem> apply(java.util.List<? extends DisputeFileSelectionUtil.FileSelectionResult> fileResults) {
                    Intrinsics.checkNotNullParameter(fileResults, "fileResults");
                    ArrayList arrayList = new ArrayList();
                    for (T t : fileResults) {
                        if (t instanceof DisputeFileSelectionUtil.FileSelectionResult.Success) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((DisputeFileSelectionUtil.FileSelectionResult.Success) it.next()).getFileSelectionItem());
                    }
                    return arrayList2;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageQuestionFragment.addFilesFromPreFill$lambda$21(this.f$0, (java.util.List) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageQuestionFragment.addFilesFromPreFill$lambda$22((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFilesFromPreFill$lambda$21(ImageQuestionFragment imageQuestionFragment, java.util.List list) {
        ImageQuestionAdapter adapter = imageQuestionFragment.getAdapter();
        Intrinsics.checkNotNull(list);
        adapter.addPreFillItemsIfEmpty(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFilesFromPreFill$lambda$22(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 6, null);
        return Unit.INSTANCE;
    }

    private final void showMaxFilesDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C10007R.id.dialog_id_dispute_max_files).setTitle(C10007R.string.dispute_dialog_max_files_title, new Object[0]).setMessage(C10007R.string.dispute_dialog_max_files_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "maxFilesDialog", false, 4, null);
    }

    private final void showFileSizeErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C10007R.id.dialog_id_dispute_file_size_error).setTitle(C10007R.string.dispute_dialog_file_size_error_title, new Object[0]).setMessage(C10007R.string.dispute_dialog_file_size_error_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "fileSizeErrorDialog", false, 4, null);
    }

    private final void showFileSelectionError() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, C10007R.string.dispute_file_selection_error, 0);
    }

    private final void showCameraNotFoundError() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, C10007R.string.dispute_camera_not_found_error, -1);
    }

    private final void showCameraPermissionRequiredError() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, C10007R.string.dispute_camera_permission_required, 0);
    }

    private final void logExternalActivityAppearEvent(int requestCode) {
        if (requestCode == 1) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.PHOTO_LIBRARY, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        } else if (requestCode == 2) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.FILE_BROWSER, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        } else {
            if (requestCode != 5) {
                return;
            }
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.MEDIA_VIEWER, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        }
    }

    private final void logExternalActivityDisappearEvent(int requestCode) {
        if (requestCode == 1) {
            EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(Screen.Name.PHOTO_LIBRARY, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        } else if (requestCode == 2) {
            EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(Screen.Name.FILE_BROWSER, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        } else {
            if (requestCode != 5) {
                return;
            }
            EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, new Screen(Screen.Name.MEDIA_VIEWER, null, null, null, 14, null), null, null, getEventContext(), 13, null);
        }
    }

    /* compiled from: ImageQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "transactionIds", "", "Ljava/util/UUID;", "disputeReason", "Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Ljava/util/List;Lcom/robinhood/models/api/minerva/ApiDispute$Reason;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "getTransactionIds", "()Ljava/util/List;", "getDisputeReason", "()Lcom/robinhood/models/api/minerva/ApiDispute$Reason;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiDispute.Reason disputeReason;
        private final DisputeQuestionnaire.Question.UserInput question;
        private final java.util.List<UUID> transactionIds;

        /* compiled from: ImageQuestionFragment.kt */
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

    /* compiled from: ImageQuestionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment$Args;", "<init>", "()V", "DIALOG_FILE_TYPE_BOTTOM_SHEET", "", "IMAGE_SELECTION_REQUEST", "", "PDF_SELECTION_REQUEST", "CAMERA_IMAGE_SELECTION_REQUEST", "CAMERA_PERMISSION_REQUEST", "FILE_PREVIEW_REQUEST", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ImageQuestionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ImageQuestionFragment imageQuestionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, imageQuestionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ImageQuestionFragment newInstance(Args args) {
            return (ImageQuestionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ImageQuestionFragment imageQuestionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, imageQuestionFragment, args);
        }
    }
}
