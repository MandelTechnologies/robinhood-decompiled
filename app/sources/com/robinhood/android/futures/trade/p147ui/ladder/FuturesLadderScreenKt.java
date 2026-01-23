package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.android.futures.trade.analytics.LadderAnalytics;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderScreenKt;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderEvent;
import com.robinhood.android.futures.trade.p147ui.ladder.OrderSpec;
import com.robinhood.android.futures.trade.p147ui.ladder.ftux.LadderFtuxUi3;
import com.robinhood.android.linking.MobileLinkingData;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
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
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aY\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"FuturesLadderScreen", "", "state", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "ladderCallbacks", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;", "onCloseClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "mobileLinkingData", "Lcom/robinhood/android/linking/MobileLinkingData;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;Lcom/robinhood/android/udf/event/Event;Lcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;II)V", "LadderScaffold", "animateTopAndBottomBarVisibility", "", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState;Lcom/robinhood/android/udf/event/Event;ZLcom/robinhood/android/futures/trade/ui/ladder/LadderCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/linking/MobileLinkingData;Landroidx/compose/runtime/Composer;II)V", "LoadingLadderUi", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MarketdataOnlyDialog", "onDismissed", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewLoadingLadderUi", "(Landroidx/compose/runtime/Composer;I)V", "feature-futures-trade_externalDebug", "snackbarEvent", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$Snackbar;", "showMarketdataOnlyDialog", "centerAtIndexEvent", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$CenterAtIndex;", "showFtuxTooltip"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class FuturesLadderScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesLadderScreen$lambda$3(FuturesLadderViewState futuresLadderViewState, Event event, LadderCallbacks ladderCallbacks, Function0 function0, Modifier modifier, MobileLinkingData mobileLinkingData, int i, int i2, Composer composer, int i3) {
        FuturesLadderScreen(futuresLadderViewState, event, ladderCallbacks, function0, modifier, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderScaffold$lambda$35(FuturesLadderViewState futuresLadderViewState, Event event, boolean z, LadderCallbacks ladderCallbacks, Function0 function0, Modifier modifier, MobileLinkingData mobileLinkingData, int i, int i2, Composer composer, int i3) {
        LadderScaffold(futuresLadderViewState, event, z, ladderCallbacks, function0, modifier, mobileLinkingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingLadderUi$lambda$38(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingLadderUi(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketdataOnlyDialog$lambda$39(Function0 function0, int i, Composer composer, int i2) {
        MarketdataOnlyDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingLadderUi$lambda$40(int i, Composer composer, int i2) {
        PreviewLoadingLadderUi(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7 A[PHI: r12
      0x00a7: PHI (r12v13 int) = (r12v0 int), (r12v6 int), (r12v7 int) binds: [B:58:0x00a5, B:68:0x00bf, B:67:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FuturesLadderScreen(final FuturesLadderViewState state, final Event<LadderEvent> event, final LadderCallbacks ladderCallbacks, final Function0<Unit> onCloseClick, Modifier modifier, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        final MobileLinkingData mobileLinkingData2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        MobileLinkingData mobileLinkingData3 = mobileLinkingData;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(ladderCallbacks, "ladderCallbacks");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1557548413);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(ladderCallbacks) : composerStartRestartGroup.changedInstance(ladderCallbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            int i6 = 196608;
            if (i4 != 0) {
                i3 |= i6;
            } else if ((196608 & i) == 0) {
                i6 = (262144 & i) == 0 ? composerStartRestartGroup.changed(mobileLinkingData3) : composerStartRestartGroup.changedInstance(mobileLinkingData3) ? 131072 : 65536;
                i3 |= i6;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    mobileLinkingData3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1557548413, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen (FuturesLadderScreen.kt:70)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                mobileLinkingData2 = mobileLinkingData3;
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1905974318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.FuturesLadderScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1905974318, i7, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous> (FuturesLadderScreen.kt:75)");
                        }
                        final FuturesLadderViewState futuresLadderViewState = state;
                        final Modifier modifier6 = modifier5;
                        final LadderCallbacks ladderCallbacks2 = ladderCallbacks;
                        final Event<LadderEvent> event2 = event;
                        final Function0<Unit> function0 = onCloseClick;
                        final MobileLinkingData mobileLinkingData4 = mobileLinkingData2;
                        final SnapshotState<Boolean> snapshotState2 = snapshotState;
                        LadderStyleKt.WithLadderStyle(ComposableLambda3.rememberComposableLambda(-1314505804, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.FuturesLadderScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1314505804, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous> (FuturesLadderScreen.kt:76)");
                                }
                                LadderAnalytics.WithLadderAnalytics(Screen.Name.FUTURES_LADDER_SCREEN, futuresLadderViewState.getLoggingContext(), ComposableLambda3.rememberComposableLambda(1664764901, true, new C501511(futuresLadderViewState, modifier6, ladderCallbacks2, event2, function0, mobileLinkingData4, snapshotState2), composer3, 54), composer3, 390);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: FuturesLadderScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C501511 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<Boolean> $animateTopAndBottomBarVisibility$delegate;
                                final /* synthetic */ Event<LadderEvent> $eventState;
                                final /* synthetic */ LadderCallbacks $ladderCallbacks;
                                final /* synthetic */ MobileLinkingData $mobileLinkingData;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Function0<Unit> $onCloseClick;
                                final /* synthetic */ FuturesLadderViewState $state;

                                C501511(FuturesLadderViewState futuresLadderViewState, Modifier modifier, LadderCallbacks ladderCallbacks, Event<LadderEvent> event, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
                                    this.$state = futuresLadderViewState;
                                    this.$modifier = modifier;
                                    this.$ladderCallbacks = ladderCallbacks;
                                    this.$eventState = event;
                                    this.$onCloseClick = function0;
                                    this.$mobileLinkingData = mobileLinkingData;
                                    this.$animateTopAndBottomBarVisibility$delegate = snapshotState;
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
                                        ComposerKt.traceEventStart(1664764901, i, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous>.<anonymous> (FuturesLadderScreen.kt:80)");
                                    }
                                    LadderFtuxProgressState ftuxProgressState = this.$state.getFtuxProgressState();
                                    Modifier modifier = this.$modifier;
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return FuturesLadderScreenKt.C175291.AnonymousClass1.C501511.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    AnimatedContentKt.AnimatedContent(ftuxProgressState, modifier, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-780866151, true, new AnonymousClass2(this.$ladderCallbacks, ftuxProgressState, this.$state, this.$eventState, this.$onCloseClick, this.$mobileLinkingData, this.$animateTopAndBottomBarVisibility$delegate), composer, 54), composer, 1573248, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
                                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                    if (AnimatedContent.getTargetState() == 0) {
                                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(tweenSpecTween$default, 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(tweenSpecTween$default, 0.0f, 2, null));
                                    }
                                    return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                                }

                                /* compiled from: FuturesLadderScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function4<AnimatedContentScope, LadderFtuxProgressState, Composer, Integer, Unit> {
                                    final /* synthetic */ SnapshotState<Boolean> $animateTopAndBottomBarVisibility$delegate;
                                    final /* synthetic */ Event<LadderEvent> $eventState;
                                    final /* synthetic */ LadderCallbacks $ladderCallbacks;
                                    final /* synthetic */ LadderFtuxProgressState $ladderFtuxProgressState;
                                    final /* synthetic */ MobileLinkingData $mobileLinkingData;
                                    final /* synthetic */ Function0<Unit> $onCloseClick;
                                    final /* synthetic */ FuturesLadderViewState $state;

                                    AnonymousClass2(LadderCallbacks ladderCallbacks, LadderFtuxProgressState ladderFtuxProgressState, FuturesLadderViewState futuresLadderViewState, Event<LadderEvent> event, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
                                        this.$ladderCallbacks = ladderCallbacks;
                                        this.$ladderFtuxProgressState = ladderFtuxProgressState;
                                        this.$state = futuresLadderViewState;
                                        this.$eventState = event;
                                        this.$onCloseClick = function0;
                                        this.$mobileLinkingData = mobileLinkingData;
                                        this.$animateTopAndBottomBarVisibility$delegate = snapshotState;
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, LadderFtuxProgressState ladderFtuxProgressState, Composer composer, Integer num) {
                                        invoke(animatedContentScope, ladderFtuxProgressState, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(AnimatedContentScope AnimatedContent, LadderFtuxProgressState ladderFtuxProgressState, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-780866151, i, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesLadderScreen.kt:93)");
                                        }
                                        if (ladderFtuxProgressState != null) {
                                            composer.startReplaceGroup(-1240484037);
                                            LadderCallbacks ladderCallbacks = this.$ladderCallbacks;
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer.changedInstance(ladderCallbacks);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$1$1(ladderCallbacks);
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                            LadderCallbacks ladderCallbacks2 = this.$ladderCallbacks;
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance2 = composer.changedInstance(ladderCallbacks2);
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$2$1(ladderCallbacks2);
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                                            composer.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance3 = composer.changedInstance(this.$ladderCallbacks);
                                            final LadderCallbacks ladderCallbacks3 = this.$ladderCallbacks;
                                            final SnapshotState<Boolean> snapshotState = this.$animateTopAndBottomBarVisibility$delegate;
                                            Object objRememberedValue3 = composer.rememberedValue();
                                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return FuturesLadderScreenKt.C175291.AnonymousClass1.C501511.AnonymousClass2.invoke$lambda$3$lambda$2(ladderCallbacks3, snapshotState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer.endReplaceGroup();
                                            int i2 = 0;
                                            int i3 = 0;
                                            int i4 = 0;
                                            String str = null;
                                            String str2 = null;
                                            String str3 = null;
                                            String str4 = null;
                                            int i5 = 0;
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
                                            int i7 = -1;
                                            int i8 = -1;
                                            int i9 = -1;
                                            int i10 = -1;
                                            int i11 = -4097;
                                            Object[] objArr = 0 == true ? 1 : 0;
                                            Object[] objArr2 = 0 == true ? 1 : 0;
                                            Object[] objArr3 = 0 == true ? 1 : 0;
                                            LadderFtuxUi3.LadderFtuxUi(ladderFtuxProgressState, function0, function02, (Function0) objRememberedValue3, WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, null, null, new Context(i2, i3, i4, str, str2, str3, str4, objArr2, i5, objArr3, str5, objArr, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, new FuturesLadderContext(0, 0, 0, null, LoggingUtils6.toNuxProgressLoggingContext(this.$ladderFtuxProgressState), null, 47, null), loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 16383, null), null, null, 55, null), true, true, true, false, false, null, 112, null), 0.0f, 1, null)), composer, (i >> 3) & 14, 0);
                                            composer.endReplaceGroup();
                                        } else {
                                            composer.startReplaceGroup(-1239097004);
                                            FuturesLadderScreenKt.LadderScaffold(this.$state, this.$eventState, FuturesLadderScreenKt.FuturesLadderScreen$lambda$1(this.$animateTopAndBottomBarVisibility$delegate), this.$ladderCallbacks, this.$onCloseClick, null, this.$mobileLinkingData, composer, MobileLinkingData.$stable << 18, 32);
                                            composer.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(LadderCallbacks ladderCallbacks, SnapshotState snapshotState) {
                                        FuturesLadderScreenKt.FuturesLadderScreen$lambda$2(snapshotState, true);
                                        ladderCallbacks.exitFtux();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                mobileLinkingData2 = mobileLinkingData3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FuturesLadderScreenKt.FuturesLadderScreen$lambda$3(state, event, ladderCallbacks, onCloseClick, modifier3, mobileLinkingData2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        int i62 = 196608;
        if (i4 != 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i5 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            mobileLinkingData2 = mobileLinkingData3;
            final Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1905974318, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.FuturesLadderScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1905974318, i7, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous> (FuturesLadderScreen.kt:75)");
                    }
                    final FuturesLadderViewState futuresLadderViewState = state;
                    final Modifier modifier6 = modifier52;
                    final LadderCallbacks ladderCallbacks2 = ladderCallbacks;
                    final Event<LadderEvent> event2 = event;
                    final Function0<Unit> function0 = onCloseClick;
                    final MobileLinkingData mobileLinkingData4 = mobileLinkingData2;
                    final SnapshotState<Boolean> snapshotState22 = snapshotState2;
                    LadderStyleKt.WithLadderStyle(ComposableLambda3.rememberComposableLambda(-1314505804, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.FuturesLadderScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1314505804, i8, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous> (FuturesLadderScreen.kt:76)");
                            }
                            LadderAnalytics.WithLadderAnalytics(Screen.Name.FUTURES_LADDER_SCREEN, futuresLadderViewState.getLoggingContext(), ComposableLambda3.rememberComposableLambda(1664764901, true, new C501511(futuresLadderViewState, modifier6, ladderCallbacks2, event2, function0, mobileLinkingData4, snapshotState22), composer3, 54), composer3, 390);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: FuturesLadderScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C501511 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState<Boolean> $animateTopAndBottomBarVisibility$delegate;
                            final /* synthetic */ Event<LadderEvent> $eventState;
                            final /* synthetic */ LadderCallbacks $ladderCallbacks;
                            final /* synthetic */ MobileLinkingData $mobileLinkingData;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function0<Unit> $onCloseClick;
                            final /* synthetic */ FuturesLadderViewState $state;

                            C501511(FuturesLadderViewState futuresLadderViewState, Modifier modifier, LadderCallbacks ladderCallbacks, Event<LadderEvent> event, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
                                this.$state = futuresLadderViewState;
                                this.$modifier = modifier;
                                this.$ladderCallbacks = ladderCallbacks;
                                this.$eventState = event;
                                this.$onCloseClick = function0;
                                this.$mobileLinkingData = mobileLinkingData;
                                this.$animateTopAndBottomBarVisibility$delegate = snapshotState;
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
                                    ComposerKt.traceEventStart(1664764901, i, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous>.<anonymous> (FuturesLadderScreen.kt:80)");
                                }
                                LadderFtuxProgressState ftuxProgressState = this.$state.getFtuxProgressState();
                                Modifier modifier = this.$modifier;
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return FuturesLadderScreenKt.C175291.AnonymousClass1.C501511.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AnimatedContentKt.AnimatedContent(ftuxProgressState, modifier, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-780866151, true, new AnonymousClass2(this.$ladderCallbacks, ftuxProgressState, this.$state, this.$eventState, this.$onCloseClick, this.$mobileLinkingData, this.$animateTopAndBottomBarVisibility$delegate), composer, 54), composer, 1573248, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                if (AnimatedContent.getTargetState() == 0) {
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
                                    return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(tweenSpecTween$default, 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(tweenSpecTween$default, 0.0f, 2, null));
                                }
                                return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                            }

                            /* compiled from: FuturesLadderScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function4<AnimatedContentScope, LadderFtuxProgressState, Composer, Integer, Unit> {
                                final /* synthetic */ SnapshotState<Boolean> $animateTopAndBottomBarVisibility$delegate;
                                final /* synthetic */ Event<LadderEvent> $eventState;
                                final /* synthetic */ LadderCallbacks $ladderCallbacks;
                                final /* synthetic */ LadderFtuxProgressState $ladderFtuxProgressState;
                                final /* synthetic */ MobileLinkingData $mobileLinkingData;
                                final /* synthetic */ Function0<Unit> $onCloseClick;
                                final /* synthetic */ FuturesLadderViewState $state;

                                AnonymousClass2(LadderCallbacks ladderCallbacks, LadderFtuxProgressState ladderFtuxProgressState, FuturesLadderViewState futuresLadderViewState, Event<LadderEvent> event, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
                                    this.$ladderCallbacks = ladderCallbacks;
                                    this.$ladderFtuxProgressState = ladderFtuxProgressState;
                                    this.$state = futuresLadderViewState;
                                    this.$eventState = event;
                                    this.$onCloseClick = function0;
                                    this.$mobileLinkingData = mobileLinkingData;
                                    this.$animateTopAndBottomBarVisibility$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, LadderFtuxProgressState ladderFtuxProgressState, Composer composer, Integer num) {
                                    invoke(animatedContentScope, ladderFtuxProgressState, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(AnimatedContentScope AnimatedContent, LadderFtuxProgressState ladderFtuxProgressState, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-780866151, i, -1, "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesLadderScreen.kt:93)");
                                    }
                                    if (ladderFtuxProgressState != null) {
                                        composer.startReplaceGroup(-1240484037);
                                        LadderCallbacks ladderCallbacks = this.$ladderCallbacks;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(ladderCallbacks);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$1$1(ladderCallbacks);
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                        LadderCallbacks ladderCallbacks2 = this.$ladderCallbacks;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(ladderCallbacks2);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$2$1(ladderCallbacks2);
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance3 = composer.changedInstance(this.$ladderCallbacks);
                                        final LadderCallbacks ladderCallbacks3 = this.$ladderCallbacks;
                                        final SnapshotState snapshotState = this.$animateTopAndBottomBarVisibility$delegate;
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$FuturesLadderScreen$1$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return FuturesLadderScreenKt.C175291.AnonymousClass1.C501511.AnonymousClass2.invoke$lambda$3$lambda$2(ladderCallbacks3, snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer.endReplaceGroup();
                                        int i2 = 0;
                                        int i3 = 0;
                                        int i4 = 0;
                                        String str = null;
                                        String str2 = null;
                                        String str3 = null;
                                        String str4 = null;
                                        int i5 = 0;
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
                                        int i7 = -1;
                                        int i8 = -1;
                                        int i9 = -1;
                                        int i10 = -1;
                                        int i11 = -4097;
                                        Object[] objArr = 0 == true ? 1 : 0;
                                        Object[] objArr2 = 0 == true ? 1 : 0;
                                        Object[] objArr3 = 0 == true ? 1 : 0;
                                        LadderFtuxUi3.LadderFtuxUi(ladderFtuxProgressState, function0, function02, (Function0) objRememberedValue3, WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, null, null, new Context(i2, i3, i4, str, str2, str3, str4, objArr2, i5, objArr3, str5, objArr, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, new FuturesLadderContext(0, 0, 0, null, LoggingUtils6.toNuxProgressLoggingContext(this.$ladderFtuxProgressState), null, 47, null), loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 16383, null), null, null, 55, null), true, true, true, false, false, null, 112, null), 0.0f, 1, null)), composer, (i >> 3) & 14, 0);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(-1239097004);
                                        FuturesLadderScreenKt.LadderScaffold(this.$state, this.$eventState, FuturesLadderScreenKt.FuturesLadderScreen$lambda$1(this.$animateTopAndBottomBarVisibility$delegate), this.$ladderCallbacks, this.$onCloseClick, null, this.$mobileLinkingData, composer, MobileLinkingData.$stable << 18, 32);
                                        composer.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(LadderCallbacks ladderCallbacks, SnapshotState snapshotState) {
                                    FuturesLadderScreenKt.FuturesLadderScreen$lambda$2(snapshotState, true);
                                    ladderCallbacks.exitFtux();
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FuturesLadderScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FuturesLadderScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean LadderScaffold$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderEvent.CenterAtIndex LadderScaffold$lambda$17(SnapshotState<LadderEvent.CenterAtIndex> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderScaffold$lambda$21(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LadderEvent.Snackbar LadderScaffold$lambda$6(SnapshotState<LadderEvent.Snackbar> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderScaffold$lambda$18(SnapshotState<LadderEvent.CenterAtIndex> snapshotState, LadderEvent.CenterAtIndex centerAtIndex) {
        snapshotState.setValue(centerAtIndex);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4 A[PHI: r15
      0x00c4: PHI (r15v17 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:68:0x00c2, B:79:0x00dd, B:78:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderScaffold(final FuturesLadderViewState state, final Event<LadderEvent> event, final boolean z, LadderCallbacks ladderCallbacks, final Function0<Unit> onCloseClick, Modifier modifier, MobileLinkingData mobileLinkingData, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotState snapshotState;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        MutableTransitionState mutableTransitionState;
        MutableTransitionState mutableTransitionState2;
        boolean z2;
        FuturesLadderViewState.SettingsBottomSheetData settingsData;
        LadderEvent.Snackbar snackbarLadderScaffold$lambda$6;
        final Modifier modifier3;
        final MobileLinkingData mobileLinkingData2;
        LadderEvent.Snackbar snackbar;
        EventConsumer<LadderEvent> eventConsumerInvoke;
        EventConsumer<LadderEvent> eventConsumerInvoke2;
        EventConsumer<LadderEvent> eventConsumerInvoke3;
        EventConsumer<LadderEvent> eventConsumerInvoke4;
        EventConsumer<LadderEvent> eventConsumerInvoke5;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final LadderCallbacks ladderCallbacks2 = ladderCallbacks;
        MobileLinkingData mobileLinkingData3 = mobileLinkingData;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(ladderCallbacks2, "ladderCallbacks");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-734067677);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(ladderCallbacks2) : composerStartRestartGroup.changedInstance(ladderCallbacks2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            int i7 = 1572864;
            if (i4 != 0) {
                i3 |= i7;
            } else if ((1572864 & i) == 0) {
                i7 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(mobileLinkingData3) : composerStartRestartGroup.changedInstance(mobileLinkingData3) ? 1048576 : 524288;
                i3 |= i7;
            }
            i5 = i3;
            if ((599187 & i5) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    mobileLinkingData3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-734067677, i5, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold (FuturesLadderScreen.kt:144)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SnackbarHostState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnackbarHostState snackbarHostState = (SnackbarHostState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (event != null) {
                    if ((event.getData() instanceof LadderEvent.NoFuturesAccountError) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14789invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14789invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                Navigator.DefaultImpls.startActivity$default(navigator, context, new FuturesOnboardingActivityKey("FUTURES_LADDER_SCREEN", false, null, 6, null), null, false, null, null, 60, null);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (event != null) {
                    if ((event.getData() instanceof LadderEvent.Snackbar) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14790invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14790invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                snapshotState2.setValue((LadderEvent.Snackbar) event.getData());
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                if (event != null) {
                    if ((event.getData() instanceof LadderEvent.MarketdataOnlyError) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14791invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14791invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                FuturesLadderScreenKt.LadderScaffold$lambda$12(snapshotState, true);
                            }
                        });
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(-1064363239);
                if (LadderScaffold$lambda$11(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FuturesLadderScreenKt.LadderScaffold$lambda$15$lambda$14(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MarketdataOnlyDialog((Function0) objRememberedValue8, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                if (event != null) {
                    if ((event.getData() instanceof LadderEvent.CenterAtIndex) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14792invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14792invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                FuturesLadderScreenKt.LadderScaffold$lambda$18(snapshotState3, (LadderEvent.CenterAtIndex) event.getData());
                            }
                        });
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                if (event != null) {
                    if ((event.getData() instanceof LadderEvent.ShowFtuxTooltip) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14793invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14793invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                FuturesLadderScreenKt.LadderScaffold$lambda$22(snapshotState4, true);
                            }
                        });
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                Object obj = objRememberedValue7;
                if (objRememberedValue7 == companion.getEmpty()) {
                    MutableTransitionState mutableTransitionState3 = new MutableTransitionState(Boolean.FALSE);
                    mutableTransitionState3.setTargetState(Boolean.TRUE);
                    composerStartRestartGroup.updateRememberedValue(mutableTransitionState3);
                    obj = mutableTransitionState3;
                }
                mutableTransitionState = (MutableTransitionState) obj;
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = false;
                if (mutableTransitionState.isIdle() && !((Boolean) mutableTransitionState.getCurrentState()).booleanValue() && z) {
                    mutableTransitionState2 = mutableTransitionState;
                    z2 = true;
                } else {
                    mutableTransitionState2 = mutableTransitionState;
                    z2 = false;
                }
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                MobileLinkingData mobileLinkingData4 = mobileLinkingData3;
                final boolean z4 = z2;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-684746265, true, new C175317(mutableTransitionState2, z2, state, ladderCallbacks2, onCloseClick, mobileLinkingData4, snapshotState4), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1045205976, true, new C175328(mutableTransitionState2, z, state, ladderCallbacks2), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1405665687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.LadderScaffold.9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1405665687, i9, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:192)");
                        }
                        SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer3, 6, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function3<PaddingValues, Composer, Integer, Unit> function3 = new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.LadderScaffold.10
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer3, int i9) {
                        int i10;
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i9 & 6) == 0) {
                            i10 = i9 | (composer3.changed(contentPadding) ? 4 : 2);
                        } else {
                            i10 = i9;
                        }
                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1112025230, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:264)");
                        }
                        FuturesLadderViewState.LadderData ladder = state.getLadder();
                        if (ladder == null) {
                            composer3.startReplaceGroup(-1260773463);
                            FuturesLadderScreenKt.LoadingLadderUi(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 6, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1260648905);
                            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(RangesKt.coerceAtLeast(state.getLadder().getLastPriceIndex() - 1, 0), 0, composer3, 0, 2);
                            LadderEvent.CenterAtIndex centerAtIndexLadderScaffold$lambda$17 = FuturesLadderScreenKt.LadderScaffold$lambda$17(snapshotState3);
                            composer3.startReplaceGroup(790627447);
                            if (centerAtIndexLadderScaffold$lambda$17 != null) {
                                CoroutineScope coroutineScope2 = coroutineScope;
                                FuturesLadderScreenKt.LadderScaffold$lambda$18(snapshotState3, null);
                                composer3.startReplaceGroup(-1633490746);
                                boolean zChanged = composer3.changed(lazyListStateRememberLazyListState) | composer3.changed(centerAtIndexLadderScaffold$lambda$17);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new FuturesLadderScreenKt$LadderScaffold$10$1$1$1(lazyListStateRememberLazyListState, centerAtIndexLadderScaffold$lambda$17, null);
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                composer3.endReplaceGroup();
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, (Function2) objRememberedValue9, 3, null);
                            }
                            composer3.endReplaceGroup();
                            LadderKt.LadderUi(ladder, lazyListStateRememberLazyListState, z4, ladderCallbacks2, PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, null, null, 14, null), null, state.getLoggingContext(), null, null, 53, null), true, true, true, false, false, null, 112, null), 0.0f, 1, null), contentPadding), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                ladderCallbacks2 = ladderCallbacks2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1112025230, true, function3, composerStartRestartGroup, 54), composerStartRestartGroup, 805309872, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                Composer composer3 = composerStartRestartGroup;
                settingsData = state.getSettingsData();
                composer3.startReplaceGroup(-1064169354);
                Composer composer4 = composer3;
                if (settingsData != null) {
                    composer3.startReplaceGroup(5004770);
                    int i9 = i5 & 7168;
                    boolean z5 = i9 == 2048 || ((i5 & 4096) != 0 && composer3.changedInstance(ladderCallbacks2));
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (z5 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new FuturesLadderScreenKt$LadderScaffold$11$1$1(ladderCallbacks2);
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue9;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    boolean z6 = i9 == 2048 || ((i5 & 4096) != 0 && composer3.changedInstance(ladderCallbacks2));
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (z6 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new FuturesLadderScreenKt$LadderScaffold$11$2$1(ladderCallbacks2);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue10;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    boolean z7 = i9 == 2048 || ((i5 & 4096) != 0 && composer3.changedInstance(ladderCallbacks2));
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (z7 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FuturesLadderScreenKt.LadderScaffold$lambda$32$lambda$29$lambda$28(ladderCallbacks2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    Function0 function0 = (Function0) objRememberedValue11;
                    composer3.endReplaceGroup();
                    Function1 function1 = (Function1) kFunction;
                    composer3.startReplaceGroup(5004770);
                    if (i9 == 2048 || ((i5 & 4096) != 0 && composer3.changedInstance(ladderCallbacks2))) {
                        z3 = true;
                    }
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (z3 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FuturesLadderScreenKt.LadderScaffold$lambda$32$lambda$31$lambda$30(ladderCallbacks2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    composer3.endReplaceGroup();
                    LadderSettingsBottomSheetKt.LadderSettingsBottomSheet(settingsData, function0, function1, (Function0) objRememberedValue12, (Function1) kFunction2, null, null, composer3, StringResource.$stable, 96);
                    composer4 = composer3;
                    Unit unit6 = Unit.INSTANCE;
                }
                composer4.endReplaceGroup();
                snackbarLadderScaffold$lambda$6 = LadderScaffold$lambda$6(snapshotState2);
                if (snackbarLadderScaffold$lambda$6 != null) {
                    String text = StringResources4.getText(snackbarLadderScaffold$lambda$6.getMsg(), composer4, StringResource.$stable);
                    composer4.startReplaceGroup(-1633490746);
                    boolean zChanged = composer4.changed(text);
                    Object objRememberedValue13 = composer4.rememberedValue();
                    if (zChanged || objRememberedValue13 == companion.getEmpty()) {
                        snackbar = null;
                        objRememberedValue13 = new FuturesLadderScreenKt$LadderScaffold$12$1$1(snackbarHostState, text, null);
                        composer4.updateRememberedValue(objRememberedValue13);
                    } else {
                        snackbar = null;
                    }
                    composer4.endReplaceGroup();
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (Function2) objRememberedValue13, 3, null);
                    snapshotState2.setValue(snackbar);
                    Unit unit7 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                mobileLinkingData2 = mobileLinkingData4;
                composer2 = composer4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                mobileLinkingData2 = mobileLinkingData3;
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return FuturesLadderScreenKt.LadderScaffold$lambda$35(state, event, z, ladderCallbacks2, onCloseClick, modifier3, mobileLinkingData2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i2 & 64;
        int i72 = 1572864;
        if (i4 != 0) {
        }
        i5 = i3;
        if ((599187 & i5) == 599186) {
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final SnackbarHostState snackbarHostState2 = (SnackbarHostState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (event != null) {
            }
            if (event != null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1064363239);
            if (LadderScaffold$lambda$11(snapshotState)) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            final SnapshotState<LadderEvent.CenterAtIndex> snapshotState32 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 != companion.getEmpty()) {
            }
            final SnapshotState snapshotState42 = (SnapshotState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            Object obj2 = objRememberedValue7;
            if (objRememberedValue7 == companion.getEmpty()) {
            }
            mutableTransitionState = (MutableTransitionState) obj2;
            composerStartRestartGroup.endReplaceGroup();
            boolean z32 = false;
            if (mutableTransitionState.isIdle()) {
                mutableTransitionState2 = mutableTransitionState;
                z2 = false;
                Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU();
                MobileLinkingData mobileLinkingData42 = mobileLinkingData3;
                final boolean z42 = z2;
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-684746265, true, new C175317(mutableTransitionState2, z2, state, ladderCallbacks2, onCloseClick, mobileLinkingData42, snapshotState42), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-1045205976, true, new C175328(mutableTransitionState2, z, state, ladderCallbacks2), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(-1405665687, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.LadderScaffold.9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer32, Integer num) {
                        invoke(composer32, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer32, int i92) {
                        if ((i92 & 3) == 2 && composer32.getSkipping()) {
                            composer32.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1405665687, i92, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:192)");
                        }
                        SnackbarHostKt.SnackbarHost(snackbarHostState2, null, null, composer32, 6, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function3<PaddingValues, Composer, Integer, Unit> function32 = new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt.LadderScaffold.10
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer32, Integer num) {
                        invoke(paddingValues, composer32, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues contentPadding, Composer composer32, int i92) {
                        int i10;
                        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                        if ((i92 & 6) == 0) {
                            i10 = i92 | (composer32.changed(contentPadding) ? 4 : 2);
                        } else {
                            i10 = i92;
                        }
                        if ((i10 & 19) == 18 && composer32.getSkipping()) {
                            composer32.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1112025230, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:264)");
                        }
                        FuturesLadderViewState.LadderData ladder = state.getLadder();
                        if (ladder == null) {
                            composer32.startReplaceGroup(-1260773463);
                            FuturesLadderScreenKt.LoadingLadderUi(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer32, 6, 0);
                            composer32.endReplaceGroup();
                        } else {
                            composer32.startReplaceGroup(-1260648905);
                            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(RangesKt.coerceAtLeast(state.getLadder().getLastPriceIndex() - 1, 0), 0, composer32, 0, 2);
                            LadderEvent.CenterAtIndex centerAtIndexLadderScaffold$lambda$17 = FuturesLadderScreenKt.LadderScaffold$lambda$17(snapshotState32);
                            composer32.startReplaceGroup(790627447);
                            if (centerAtIndexLadderScaffold$lambda$17 != null) {
                                CoroutineScope coroutineScope22 = coroutineScope2;
                                FuturesLadderScreenKt.LadderScaffold$lambda$18(snapshotState32, null);
                                composer32.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composer32.changed(lazyListStateRememberLazyListState) | composer32.changed(centerAtIndexLadderScaffold$lambda$17);
                                Object objRememberedValue92 = composer32.rememberedValue();
                                if (zChanged2 || objRememberedValue92 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue92 = new FuturesLadderScreenKt$LadderScaffold$10$1$1$1(lazyListStateRememberLazyListState, centerAtIndexLadderScaffold$lambda$17, null);
                                    composer32.updateRememberedValue(objRememberedValue92);
                                }
                                composer32.endReplaceGroup();
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, (Function2) objRememberedValue92, 3, null);
                            }
                            composer32.endReplaceGroup();
                            LadderKt.LadderUi(ladder, lazyListStateRememberLazyListState, z42, ladderCallbacks2, PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, null, null, 14, null), null, state.getLoggingContext(), null, null, 53, null), true, true, true, false, false, null, 112, null), 0.0f, 1, null), contentPadding), composer32, 0, 0);
                            composer32.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                ladderCallbacks2 = ladderCallbacks2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding2, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda32, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-1112025230, true, function32, composerStartRestartGroup, 54), composerStartRestartGroup, 805309872, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                Composer composer32 = composerStartRestartGroup;
                settingsData = state.getSettingsData();
                composer32.startReplaceGroup(-1064169354);
                Composer composer42 = composer32;
                if (settingsData != null) {
                }
                composer42.endReplaceGroup();
                snackbarLadderScaffold$lambda$6 = LadderScaffold$lambda$6(snapshotState22);
                if (snackbarLadderScaffold$lambda$6 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                mobileLinkingData2 = mobileLinkingData42;
                composer2 = composer42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderScaffold$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderScaffold$lambda$15$lambda$14(SnapshotState snapshotState) {
        LadderScaffold$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderScaffold$lambda$22(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: FuturesLadderScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$7 */
    static final class C175317 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $animateQuantityBarsEntry;
        final /* synthetic */ LadderCallbacks $ladderCallbacks;
        final /* synthetic */ MobileLinkingData $mobileLinkingData;
        final /* synthetic */ Function0<Unit> $onCloseClick;
        final /* synthetic */ SnapshotState<Boolean> $showFtuxTooltip$delegate;
        final /* synthetic */ FuturesLadderViewState $state;
        final /* synthetic */ MutableTransitionState<Boolean> $topAndBottomBarAnimationState;

        C175317(MutableTransitionState<Boolean> mutableTransitionState, boolean z, FuturesLadderViewState futuresLadderViewState, LadderCallbacks ladderCallbacks, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
            this.$topAndBottomBarAnimationState = mutableTransitionState;
            this.$animateQuantityBarsEntry = z;
            this.$state = futuresLadderViewState;
            this.$ladderCallbacks = ladderCallbacks;
            this.$onCloseClick = function0;
            this.$mobileLinkingData = mobileLinkingData;
            this.$showFtuxTooltip$delegate = snapshotState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$1$lambda$0(int i) {
            return -i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            EnterTransition none;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-684746265, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:196)");
            }
            MutableTransitionState<Boolean> mutableTransitionState = this.$topAndBottomBarAnimationState;
            composer.startReplaceGroup(-911159867);
            if (this.$animateQuantityBarsEntry) {
                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 333, null, 5, null), 0.0f, 2, null);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 333, FuturesLadderFragment.INSTANCE.getLADDER_COMPONENTS_ENTRY_EASING(), 1, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$7$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(FuturesLadderScreenKt.C175317.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                none = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
            } else {
                none = EnterTransition.INSTANCE.getNone();
            }
            EnterTransition enterTransition = none;
            composer.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, (Modifier) null, enterTransition, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1208633023, true, new AnonymousClass2(this.$state, this.$ladderCallbacks, this.$onCloseClick, this.$mobileLinkingData, this.$showFtuxTooltip$delegate), composer, 54), composer, MutableTransitionState.$stable | 196608, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: FuturesLadderScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$7$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            final /* synthetic */ LadderCallbacks $ladderCallbacks;
            final /* synthetic */ MobileLinkingData $mobileLinkingData;
            final /* synthetic */ Function0<Unit> $onCloseClick;
            final /* synthetic */ SnapshotState<Boolean> $showFtuxTooltip$delegate;
            final /* synthetic */ FuturesLadderViewState $state;

            AnonymousClass2(FuturesLadderViewState futuresLadderViewState, LadderCallbacks ladderCallbacks, Function0<Unit> function0, MobileLinkingData mobileLinkingData, SnapshotState<Boolean> snapshotState) {
                this.$state = futuresLadderViewState;
                this.$ladderCallbacks = ladderCallbacks;
                this.$onCloseClick = function0;
                this.$mobileLinkingData = mobileLinkingData;
                this.$showFtuxTooltip$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1208633023, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous>.<anonymous> (FuturesLadderScreen.kt:215)");
                }
                FuturesLadderViewState.TopBarData topbar = this.$state.getTopbar();
                boolean zLadderScaffold$lambda$21 = FuturesLadderScreenKt.LadderScaffold$lambda$21(this.$showFtuxTooltip$delegate);
                LadderCallbacks ladderCallbacks = this.$ladderCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(ladderCallbacks);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FuturesLadderScreenKt$LadderScaffold$7$2$1$1(ladderCallbacks);
                    composer.updateRememberedValue(objRememberedValue);
                }
                KFunction kFunction = (KFunction) objRememberedValue;
                composer.endReplaceGroup();
                LadderCallbacks ladderCallbacks2 = this.$ladderCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(ladderCallbacks2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new FuturesLadderScreenKt$LadderScaffold$7$2$2$1(ladderCallbacks2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                KFunction kFunction2 = (KFunction) objRememberedValue2;
                composer.endReplaceGroup();
                LadderCallbacks ladderCallbacks3 = this.$ladderCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(ladderCallbacks3);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new FuturesLadderScreenKt$LadderScaffold$7$2$3$1(ladderCallbacks3);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                KFunction kFunction3 = (KFunction) objRememberedValue3;
                composer.endReplaceGroup();
                LadderCallbacks ladderCallbacks4 = this.$ladderCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(ladderCallbacks4);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new FuturesLadderScreenKt$LadderScaffold$7$2$4$1(ladderCallbacks4);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                KFunction kFunction4 = (KFunction) objRememberedValue4;
                composer.endReplaceGroup();
                Function0 function0 = (Function0) kFunction;
                Function0<Unit> function02 = this.$onCloseClick;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(this.$ladderCallbacks);
                final LadderCallbacks ladderCallbacks5 = this.$ladderCallbacks;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$7$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesLadderScreenKt.C175317.AnonymousClass2.invoke$lambda$5$lambda$4(ladderCallbacks5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function03 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                Function0 function04 = (Function0) kFunction2;
                Function0 function05 = (Function0) kFunction3;
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$showFtuxTooltip$delegate;
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$7$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesLadderScreenKt.C175317.AnonymousClass2.invoke$lambda$7$lambda$6(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                LadderTopBar7.LadderTopBar(topbar, zLadderScaffold$lambda$21, function0, function02, function03, function04, function05, (Function0) objRememberedValue6, (Function0) kFunction4, null, this.$mobileLinkingData, composer, 12582912, MobileLinkingData.$stable, 512);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$5$lambda$4(LadderCallbacks ladderCallbacks) {
                ladderCallbacks.onSettingsVisibilityChange(true);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState) {
                FuturesLadderScreenKt.LadderScaffold$lambda$22(snapshotState, false);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: FuturesLadderScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$8 */
    static final class C175328 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $animateTopAndBottomBarVisibility;
        final /* synthetic */ LadderCallbacks $ladderCallbacks;
        final /* synthetic */ FuturesLadderViewState $state;
        final /* synthetic */ MutableTransitionState<Boolean> $topAndBottomBarAnimationState;

        C175328(MutableTransitionState<Boolean> mutableTransitionState, boolean z, FuturesLadderViewState futuresLadderViewState, LadderCallbacks ladderCallbacks) {
            this.$topAndBottomBarAnimationState = mutableTransitionState;
            this.$animateTopAndBottomBarVisibility = z;
            this.$state = futuresLadderViewState;
            this.$ladderCallbacks = ladderCallbacks;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$1$lambda$0(int i) {
            return i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            EnterTransition none;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1045205976, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous> (FuturesLadderScreen.kt:232)");
            }
            MutableTransitionState<Boolean> mutableTransitionState = this.$topAndBottomBarAnimationState;
            composer.startReplaceGroup(579408845);
            if (this.$animateTopAndBottomBarVisibility) {
                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 333, null, 5, null), 0.0f, 2, null);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 333, FuturesLadderFragment.INSTANCE.getLADDER_COMPONENTS_ENTRY_EASING(), 1, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$8$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(FuturesLadderScreenKt.C175328.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                none = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue));
            } else {
                none = EnterTransition.INSTANCE.getNone();
            }
            EnterTransition enterTransition = none;
            composer.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, (Modifier) null, enterTransition, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(848173312, true, new AnonymousClass2(this.$state, this.$ladderCallbacks), composer, 54), composer, MutableTransitionState.$stable | 196608, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: FuturesLadderScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$8$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            final /* synthetic */ LadderCallbacks $ladderCallbacks;
            final /* synthetic */ FuturesLadderViewState $state;

            AnonymousClass2(FuturesLadderViewState futuresLadderViewState, LadderCallbacks ladderCallbacks) {
                this.$state = futuresLadderViewState;
                this.$ladderCallbacks = ladderCallbacks;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(848173312, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderScaffold.<anonymous>.<anonymous> (FuturesLadderScreen.kt:251)");
                }
                FuturesLadderViewState.BottomPanelData bottomPanel = this.$state.getBottomPanel();
                LadderCallbacks ladderCallbacks = this.$ladderCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(ladderCallbacks);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new FuturesLadderScreenKt$LadderScaffold$8$2$1$1(ladderCallbacks);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$ladderCallbacks);
                final LadderCallbacks ladderCallbacks2 = this.$ladderCallbacks;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$8$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesLadderScreenKt.C175328.AnonymousClass2.invoke$lambda$2$lambda$1(ladderCallbacks2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.$ladderCallbacks);
                final LadderCallbacks ladderCallbacks3 = this.$ladderCallbacks;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$8$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuturesLadderScreenKt.C175328.AnonymousClass2.invoke$lambda$4$lambda$3(ladderCallbacks3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                LadderBottomPanel6.LadderBottomPanel(bottomPanel, function0, function02, (Function0) objRememberedValue3, null, composer, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1(LadderCallbacks ladderCallbacks) {
                ladderCallbacks.onPlaceOrder(new OrderSpec.MarketOrderSpec(FuturesOrderSide.BUY));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(LadderCallbacks ladderCallbacks) {
                ladderCallbacks.onPlaceOrder(new OrderSpec.MarketOrderSpec(FuturesOrderSide.SELL));
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderScaffold$lambda$32$lambda$29$lambda$28(LadderCallbacks ladderCallbacks) {
        ladderCallbacks.onSettingsVisibilityChange(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderScaffold$lambda$32$lambda$31$lambda$30(LadderCallbacks ladderCallbacks) {
        ladderCallbacks.onLadderEducationCtaClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingLadderUi(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(14624701);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(14624701, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.LoadingLadderUi (FuturesLadderScreen.kt:330)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesLadderScreenKt.LoadingLadderUi$lambda$37$lambda$36((LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifier3, null, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 & 14) | 805502976, 478);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesLadderScreenKt.LoadingLadderUi$lambda$38(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingLadderUi$lambda$37$lambda$36(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, Integer.MAX_VALUE, null, null, ComposableSingletons$FuturesLadderScreenKt.INSTANCE.m14760getLambda$490208677$feature_futures_trade_externalDebug(), 6, null);
        return Unit.INSTANCE;
    }

    private static final void MarketdataOnlyDialog(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        Composer composerStartRestartGroup = composer.startRestartGroup(956156064);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956156064, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.MarketdataOnlyDialog (FuturesLadderScreen.kt:350)");
            }
            function02 = function0;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C17286R.string.marketdata_only_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C17286R.string.marketdata_only_dialog_body, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesLadderScreenKt.MarketdataOnlyDialog$lambda$39(function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewLoadingLadderUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(436227528);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(436227528, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewLoadingLadderUi (FuturesLadderScreen.kt:364)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableSingletons$FuturesLadderScreenKt.INSTANCE.m14759getLambda$1336892144$feature_futures_trade_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesLadderScreenKt.PreviewLoadingLadderUi$lambda$40(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
