package com.robinhood.android.cortex.digest.portfolio;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations2;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations3;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations4;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations6;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations9;
import com.robinhood.android.cortex.digest.portfolio.agreement.PortfolioDigestAgreementComposable;
import com.robinhood.android.cortex.digest.portfolio.detail.PortfolioDigestDetailComposableKt;
import com.robinhood.android.cortex.digest.portfolio.error.PortfolioDigestErrorDialogComposable;
import com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackSheetComposable;
import com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposable;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
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
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: PortfolioDigestNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestNavGraph {
    public static final PortfolioDigestNavGraph INSTANCE = new PortfolioDigestNavGraph();

    /* renamed from: lambda$-18613556, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f8748lambda$18613556 = ComposableLambda3.composableLambdaInstance(-18613556, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$-18613556$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-18613556, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$-18613556.<anonymous> (PortfolioDigestNavGraph.kt:68)");
            }
            PortfolioDigestSplashComposableKt.PortfolioDigestSplashComposable((PortfolioDigestDestinations9.Args) ComposableCompanion.args(entry), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1242399165, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f8747lambda$1242399165 = ComposableLambda3.composableLambdaInstance(-1242399165, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$-1242399165$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1242399165, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$-1242399165.<anonymous> (PortfolioDigestNavGraph.kt:72)");
            }
            PortfolioDigestAgreementComposable.PortfolioDigestAgreementComposable((PortfolioDigestDestinations.Args) ComposableCompanion.args(entry), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-594171708, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f8750lambda$594171708 = ComposableLambda3.composableLambdaInstance(-594171708, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$-594171708$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-594171708, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$-594171708.<anonymous> (PortfolioDigestNavGraph.kt:76)");
            }
            PortfolioDigestDetailComposableKt.PortfolioDigestDetailComposable((PortfolioDigestDestinations4.Args) ComposableCompanion.args(entry), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$54055749 = ComposableLambda3.composableLambdaInstance(54055749, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$54055749$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(54055749, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$54055749.<anonymous> (PortfolioDigestNavGraph.kt:83)");
            }
            PortfolioDigestArticleSourceOverflowComposable.PortfolioDigestArticleSourceOverflowComposable((PortfolioDigestDestinations2.Args) ComposableCompanion.args(entry), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$345620130 = ComposableLambda3.composableLambdaInstance(345620130, false, new Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(column5, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Column5 bottomSheet, NavBackStackEntry entry, LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "$this$bottomSheet");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(345620130, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$345620130.<anonymous> (PortfolioDigestNavGraph.kt:90)");
            }
            PortfolioDigestDestinations3.Args args = (PortfolioDigestDestinations3.Args) ComposableCompanion.args(entry);
            Screen screen = new Screen(args.getSourceScreen(), null, null, null, 14, null);
            String accountNumber = args.getAccountNumber();
            String digestId = args.getDigestId();
            String source = args.getSource();
            if (source == null) {
                source = "";
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            String str = null;
            String str2 = null;
            Context.ProductTag productTag = null;
            int i5 = 0;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Screen screen2 = null;
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
            SocialTradingContext socialTradingContext = null;
            ByteString byteString = null;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(i2, i3, i4, str, objArr2, str2, objArr, productTag, i5, str3, str4, str5, screen2, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, new CortexPortfolioDigestContext(accountNumber, digestId, source, null, 8, null), socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 14335, null), new Component(Component.ComponentType.BOTTOM_SHEET, "cortex_digest_article_source_sheet", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(277108173, true, new AnonymousClass1(args, navigator), composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: PortfolioDigestNavGraph.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ PortfolioDigestDestinations3.Args $args;
            final /* synthetic */ LifecycleAwareNavigator $navigator;

            AnonymousClass1(PortfolioDigestDestinations3.Args args, LifecycleAwareNavigator lifecycleAwareNavigator) {
                this.$args = args;
                this.$navigator = lifecycleAwareNavigator;
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
                    ComposerKt.traceEventStart(277108173, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$345620130.<anonymous>.<anonymous> (PortfolioDigestNavGraph.kt:109)");
                }
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null));
                ArticleSource articleSource = this.$args.getArticleSource();
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$navigator);
                final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR (r3v1 'objRememberedValue' java.lang.Object) = (r1v2 'lifecycleAwareNavigator' com.robinhood.android.navigation.compose.LifecycleAwareNavigator A[DONT_INLINE]) A[MD:(com.robinhood.android.navigation.compose.LifecycleAwareNavigator):void (m)] (LINE:115) call: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.compose.LifecycleAwareNavigator):void type: CONSTRUCTOR in method: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r8 & 3
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r7.getSkipping()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r7.skipToGroupEnd()
                        return
                    L10:
                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r0 == 0) goto L1f
                        r0 = -1
                        java.lang.String r1 = "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$345620130.<anonymous>.<anonymous> (PortfolioDigestNavGraph.kt:109)"
                        r2 = 277108173(0x108455cd, float:5.2197017E-29)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r8, r0, r1)
                    L1f:
                        androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p011ui.Modifier.INSTANCE
                        r0 = 1
                        r1 = 0
                        androidx.compose.ui.Modifier r8 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.logScreenTransitions$default(r8, r1, r0, r1)
                        androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(r8)
                        com.robinhood.android.cortex.digest.portfolio.PortfolioDigestArticleSourceSheetDest$Args r8 = r6.$args
                        com.robinhood.android.cortex.models.ArticleSource r0 = r8.getArticleSource()
                        r8 = 5004770(0x4c5de2, float:7.013177E-39)
                        r7.startReplaceGroup(r8)
                        com.robinhood.android.navigation.compose.LifecycleAwareNavigator r8 = r6.$navigator
                        boolean r8 = r7.changed(r8)
                        com.robinhood.android.navigation.compose.LifecycleAwareNavigator r1 = r6.$navigator
                        java.lang.Object r3 = r7.rememberedValue()
                        if (r8 != 0) goto L4d
                        androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.INSTANCE
                        java.lang.Object r8 = r8.getEmpty()
                        if (r3 != r8) goto L55
                    L4d:
                        com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$345620130$1$1$$ExternalSyntheticLambda0
                        r3.<init>(r1)
                        r7.updateRememberedValue(r3)
                    L55:
                        r1 = r3
                        kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                        r7.endReplaceGroup()
                        r4 = 0
                        r5 = 0
                        r3 = r7
                        com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposable.CortexArticleSourceSheetComposable(r0, r1, r2, r3, r4, r5)
                        boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r7 == 0) goto L6a
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L6a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavGraph6.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) {
                    LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
                    return Unit.INSTANCE;
                }
            }
        });
        private static Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$893822105 = ComposableLambda3.composableLambdaInstance(893822105, false, new Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$893822105$1
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(column5, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(Column5 bottomSheet, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(bottomSheet, "$this$bottomSheet");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(893822105, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$893822105.<anonymous> (PortfolioDigestNavGraph.kt:125)");
                }
                final PortfolioDigestDestinations6.Args args = (PortfolioDigestDestinations6.Args) ComposableCompanion.args(entry);
                Screen screen = new Screen(args.getSourceScreen(), null, null, null, 14, null);
                String accountNumber = args.getAccountNumber();
                String digestId = args.getDigestId();
                String source = args.getSource();
                if (source == null) {
                    source = "";
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                String str = null;
                String str2 = null;
                Context.ProductTag productTag = null;
                int i5 = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Screen screen2 = null;
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
                SocialTradingContext socialTradingContext = null;
                ByteString byteString = null;
                int i6 = -1;
                int i7 = -1;
                int i8 = -1;
                int i9 = -1;
                int i10 = -1;
                int i11 = -1;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(i2, i3, i4, str, objArr2, str2, objArr, productTag, i5, str3, str4, str5, screen2, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, new CortexPortfolioDigestContext(accountNumber, digestId, source, null, 8, null), socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 14335, null), new Component(Component.ComponentType.BOTTOM_SHEET, "cortex_digest_feedback_sheet", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(-521659132, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$893822105$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-521659132, i12, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$893822105.<anonymous>.<anonymous> (PortfolioDigestNavGraph.kt:144)");
                        }
                        PortfolioDigestFeedbackSheetComposable.PortfolioDigestFeedbackSheetComposable(args, null, composer2, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-338737256, reason: not valid java name */
        private static Function4<NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f8749lambda$338737256 = ComposableLambda3.composableLambdaInstance(-338737256, false, new Function4<NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt$lambda$-338737256$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-338737256, i, -1, "com.robinhood.android.cortex.digest.portfolio.ComposableSingletons$PortfolioDigestNavGraphKt.lambda$-338737256.<anonymous> (PortfolioDigestNavGraph.kt:152)");
                }
                PortfolioDigestErrorDialogComposable.PortfolioDigestErrorDialogComposable((PortfolioDigestDestinations5.Args) ComposableCompanion.args(entry), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: getLambda$-1242399165$feature_cortex_digest_portfolio_externalDebug */
        public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1863x65a0c569() {
            return f8747lambda$1242399165;
        }

        /* renamed from: getLambda$-18613556$feature_cortex_digest_portfolio_externalDebug */
        public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1864xfbcea172() {
            return f8748lambda$18613556;
        }

        /* renamed from: getLambda$-338737256$feature_cortex_digest_portfolio_externalDebug */
        public final Function4<NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1865x519bacb1() {
            return f8749lambda$338737256;
        }

        /* renamed from: getLambda$-594171708$feature_cortex_digest_portfolio_externalDebug */
        public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1866x24cca225() {
            return f8750lambda$594171708;
        }

        /* renamed from: getLambda$345620130$feature_cortex_digest_portfolio_externalDebug */
        public final Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1867xd660a26e() {
            return lambda$345620130;
        }

        public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$54055749$feature_cortex_digest_portfolio_externalDebug() {
            return lambda$54055749;
        }

        /* renamed from: getLambda$893822105$feature_cortex_digest_portfolio_externalDebug */
        public final Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1868xea21bd70() {
            return lambda$893822105;
        }
    }
