package com.robinhood.shared.crypto.transfer.verification;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
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
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.ConciergePlusSupportContext;
import com.robinhood.rosetta.eventlogging.ConciergeSupportContext;
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
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferHistoryFragmentKey;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey3;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable3;
import com.robinhood.utils.extensions.Uuids;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.extensions2;
import okio.ByteString;

/* compiled from: VerificationParentComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a)\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"VerificationParentComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VerificationParentContent", "navController", "Landroidx/navigation/NavHostController;", "duxo", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDuxo;", "(Landroidx/navigation/NavHostController;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentDuxo;Landroidx/compose/runtime/Composer;II)V", "Loading", "terminalDestinations", "", "", "feature-crypto-transfer_externalDebug", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "viewState", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationParentContentViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerificationParentComposable3 {
    private static final Set<String> terminalDestinations = SetsKt.setOf((Object[]) new String[]{VerificationNavigationDestinations5.INSTANCE.getRoutePath(), VerificationNavigationDestinations4.INSTANCE.getRoutePath()});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationParentComposable$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        VerificationParentComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationParentContent$lambda$2(NavHostController navHostController, Modifier modifier, VerificationParentContentDuxo verificationParentContentDuxo, int i, int i2, Composer composer, int i3) {
        VerificationParentContent(navHostController, modifier, verificationParentContentDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void VerificationParentComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(465086656);
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
                ComposerKt.traceEventStart(465086656, i3, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable (VerificationParentComposable.kt:43)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-676068232, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-676068232, i5, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable.<anonymous> (VerificationParentComposable.kt:45)");
                    }
                    final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composer2, 0);
                    OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer2, BackHandler5.$stable);
                    final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                    Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(modifier3);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierImePadding, ComposableLambda3.rememberComposableLambda(-653508804, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-653508804, i7, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable.<anonymous>.<anonymous> (VerificationParentComposable.kt:54)");
                            }
                            final NavHostController navHostController = navHostControllerRememberNavController;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1439554601, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    NavDestination destination;
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1439554601, i8, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable.<anonymous>.<anonymous>.<anonymous> (VerificationParentComposable.kt:56)");
                                    }
                                    SnapshotState4<NavBackStackEntry> snapshotState4CurrentBackStackEntryAsState = NavHostController2.currentBackStackEntryAsState(navHostController, composer4, 0);
                                    composer4.startReplaceGroup(432506900);
                                    NavBackStackEntry navBackStackEntryInvoke$lambda$0 = invoke$lambda$0(snapshotState4CurrentBackStackEntryAsState);
                                    String strStringResource = Intrinsics.areEqual((navBackStackEntryInvoke$lambda$0 == null || (destination = navBackStackEntryInvoke$lambda$0.getDestination()) == null) ? null : destination.getRoute(), VerificationNavigationDestinations6.INSTANCE.getRoutePath()) ? StringResources_androidKt.stringResource(C37934R.string.withdrawal_exchange_title, composer4, 0) : "";
                                    composer4.endReplaceGroup();
                                    AnimatedContentKt.AnimatedContent(strStringResource, null, null, null, null, null, VerificationParentComposable.INSTANCE.m25174getLambda$1284103489$feature_crypto_transfer_externalDebug(), composer4, 1572864, 62);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                private static final NavBackStackEntry invoke$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState4) {
                                    return snapshotState4.getValue();
                                }
                            }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(-1266200707, true, new AnonymousClass2(navHostControllerRememberNavController, onBackPressedDispatcher), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: VerificationParentComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentComposable$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                            final /* synthetic */ NavHostController $navController;

                            AnonymousClass2(NavHostController navHostController, OnBackPressedDispatcher onBackPressedDispatcher) {
                                this.$navController = navHostController;
                                this.$backPressedDispatcher = onBackPressedDispatcher;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(OnBackPressedDispatcher onBackPressedDispatcher) {
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.onBackPressed();
                                }
                                return Unit.INSTANCE;
                            }

                            private static final NavBackStackEntry invoke$lambda$0(SnapshotState4<NavBackStackEntry> snapshotState4) {
                                return snapshotState4.getValue();
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                int i2;
                                NavDestination destination;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1266200707, i2, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable.<anonymous>.<anonymous>.<anonymous> (VerificationParentComposable.kt:69)");
                                }
                                SnapshotState4<NavBackStackEntry> snapshotState4CurrentBackStackEntryAsState = NavHostController2.currentBackStackEntryAsState(this.$navController, composer, 0);
                                NavBackStackEntry navBackStackEntryInvoke$lambda$0 = invoke$lambda$0(snapshotState4CurrentBackStackEntryAsState);
                                String route = (navBackStackEntryInvoke$lambda$0 == null || (destination = navBackStackEntryInvoke$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                                if (invoke$lambda$0(snapshotState4CurrentBackStackEntryAsState) == null) {
                                    composer.startReplaceGroup(1312820623);
                                    composer.endReplaceGroup();
                                } else if (CollectionsKt.contains(VerificationParentComposable3.terminalDestinations, route)) {
                                    composer.startReplaceGroup(1313000950);
                                    composer.endReplaceGroup();
                                } else if (Intrinsics.areEqual(route, NavGraph.INSTANCE.findStartDestination(this.$navController.getGraph()).getRoute())) {
                                    composer.startReplaceGroup(1313232954);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                                    final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentComposable$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return VerificationParentComposable3.C384881.AnonymousClass1.AnonymousClass2.invoke$lambda$2$lambda$1(onBackPressedDispatcher);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                    composer.endReplaceGroup();
                                } else if (this.$navController.getPreviousBackStackEntry() != null) {
                                    composer.startReplaceGroup(1313447691);
                                    NavHostController navHostController = this.$navController;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(navHostController);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new VerificationParentComposable4(navHostController);
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(1313603590);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composer2, 54), null, null, null, 0, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer2, 6), ComposableLambda3.rememberComposableLambda(1880022663, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i7 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1880022663, i7, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentComposable.<anonymous>.<anonymous> (VerificationParentComposable.kt:96)");
                            }
                            VerificationParentComposable3.VerificationParentContent(navHostControllerRememberNavController, PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationParentComposable3.VerificationParentComposable$lambda$0(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationParentContentViewState VerificationParentContent$lambda$1(SnapshotState4<VerificationParentContentViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationParentContent(final NavHostController navController, Modifier modifier, VerificationParentContentDuxo verificationParentContentDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        VerificationParentContentDuxo verificationParentContentDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        final VerificationParentContentDuxo verificationParentContentDuxo3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-270682609);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    verificationParentContentDuxo2 = verificationParentContentDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(verificationParentContentDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    verificationParentContentDuxo2 = verificationParentContentDuxo;
                }
                i3 |= i5;
            } else {
                verificationParentContentDuxo2 = verificationParentContentDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(VerificationParentContentDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        verificationParentContentDuxo3 = (VerificationParentContentDuxo) baseDuxo;
                        i3 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-270682609, i3, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent (VerificationParentComposable.kt:106)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(verificationParentContentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    final Activity activity = (Activity) objConsume;
                    Modifier modifier5 = modifier3;
                    AnimatedContentKt.AnimatedContent(Boolean.valueOf(VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoaded()), modifier5, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1026181204, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentContent.1
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                            invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1026181204, i6, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous> (VerificationParentComposable.kt:113)");
                            }
                            if (!z) {
                                composer2.startReplaceGroup(612999348);
                                VerificationParentComposable3.Loading(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(613167523);
                                com.robinhood.android.navigation.Navigator navigator = (com.robinhood.android.navigation.Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                                Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                String stringOrEmpty = Uuids.toStringOrEmpty(VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingContext().getCurrencyId());
                                String string2 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingContext().getSessionId().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String string3 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getLoggingContext().getTransferId().toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                int i7 = 0;
                                int i8 = 0;
                                int i9 = 0;
                                String str4 = null;
                                String str5 = null;
                                int i10 = 0;
                                String str6 = null;
                                NewsFeedItem newsFeedItem = null;
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
                                CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
                                SocialTradingContext socialTradingContext = null;
                                ByteString byteString = null;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -257;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                Object[] objArr = 0 == true ? 1 : 0;
                                Object[] objArr2 = 0 == true ? 1 : 0;
                                Object[] objArr3 = 0 == true ? 1 : 0;
                                Object[] objArr4 = 0 == true ? 1 : 0;
                                Object[] objArr5 = 0 == true ? 1 : 0;
                                Object[] objArr6 = 0 == true ? 1 : 0;
                                Object[] objArr7 = 0 == true ? 1 : 0;
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(i7, i8, i9, str, str4, str5, str2, objArr2, i10, objArr3, objArr4, str6, objArr5, str3, objArr6, objArr7, newsFeedItem, objArr, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, new CryptoTransferContext(stringOrEmpty, string2, str, 0.0d, str2, null, null, null, null, string3, null, str3, null, null, 15868, null), cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i11, i12, i13, i14, i15, i16, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(1121565499, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, verificationParentContentDuxo3, activity, navigator, context, navController), composer2, 54), composer2, 48);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: VerificationParentComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ Activity $activity;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ VerificationParentContentDuxo $duxo;
                            final /* synthetic */ NavHostController $navController;
                            final /* synthetic */ com.robinhood.android.navigation.Navigator $navigator;
                            final /* synthetic */ SnapshotState4<VerificationParentContentViewState> $viewState$delegate;

                            AnonymousClass1(SnapshotState4<VerificationParentContentViewState> snapshotState4, VerificationParentContentDuxo verificationParentContentDuxo, Activity activity, com.robinhood.android.navigation.Navigator navigator, Context context, NavHostController navHostController) {
                                this.$viewState$delegate = snapshotState4;
                                this.$duxo = verificationParentContentDuxo;
                                this.$activity = activity;
                                this.$navigator = navigator;
                                this.$context = context;
                                this.$navController = navHostController;
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
                                    ComposerKt.traceEventStart(1121565499, i, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous>.<anonymous> (VerificationParentComposable.kt:129)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$activity) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                final VerificationParentContentDuxo verificationParentContentDuxo = this.$duxo;
                                final SnapshotState4<VerificationParentContentViewState> snapshotState4 = this.$viewState$delegate;
                                final Activity activity = this.$activity;
                                final com.robinhood.android.navigation.Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Function2 function2 = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5(verificationParentContentDuxo, snapshotState4, activity, navigator, context, (NavGraphBuilder) obj, (NavHostController) obj2);
                                        }
                                    };
                                    composer.updateRememberedValue(function2);
                                    objRememberedValue = function2;
                                }
                                composer.endReplaceGroup();
                                GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), VerificationNavigationDestinations7.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, (ComposableDestination.$stable << 6) | 24576, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5(VerificationParentContentDuxo verificationParentContentDuxo, final SnapshotState4 snapshotState4, final Activity activity, final com.robinhood.android.navigation.Navigator navigator, final Context context, NavGraphBuilder persistentSetOf, NavHostController navController) {
                                Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                                Intrinsics.checkNotNullParameter(navController, "navController");
                                VerificationNavGraph.verificationNavGraph(persistentSetOf, navController, VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getVerificationId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getType(), new VerificationParentComposable5(verificationParentContentDuxo), new VerificationParentComposable6(verificationParentContentDuxo), new VerificationParentComposable7(verificationParentContentDuxo), new VerificationParentComposable8(verificationParentContentDuxo), new VerificationParentComposable9(verificationParentContentDuxo), new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$0(activity);
                                    }
                                }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$1(activity);
                                    }
                                }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$3(snapshotState4, navigator, context);
                                    }
                                }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(navigator, context);
                                    }
                                });
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$0(Activity activity) {
                                NavigationActivityResultContract3.finishWithResult$default(activity, CryptoTransferVerificationIntentKey3.Completed.INSTANCE, 0, 2, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$1(Activity activity) {
                                activity.finish();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$3(SnapshotState4 snapshotState4, com.robinhood.android.navigation.Navigator navigator, Context context) {
                                UUID transferId = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId();
                                if (transferId != null) {
                                    Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoTransferHistoryFragmentKey(transferId, true), false, false, false, null, true, null, false, false, null, null, 4028, null);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4(com.robinhood.android.navigation.Navigator navigator, Context context) {
                                Navigators3.showContactSupportTriageFragment$default(navigator, context, null, false, 4, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 1572864, 60);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                }
                verificationParentContentDuxo3 = verificationParentContentDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<VerificationParentContentViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(verificationParentContentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity2 = (Activity) objConsume2;
                Modifier modifier52 = modifier3;
                AnimatedContentKt.AnimatedContent(Boolean.valueOf(VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getLoaded()), modifier52, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1026181204, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentContent.1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1026181204, i6, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous> (VerificationParentComposable.kt:113)");
                        }
                        if (!z) {
                            composer2.startReplaceGroup(612999348);
                            VerificationParentComposable3.Loading(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(613167523);
                            com.robinhood.android.navigation.Navigator navigator = (com.robinhood.android.navigation.Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            String stringOrEmpty = Uuids.toStringOrEmpty(VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getLoggingContext().getCurrencyId());
                            String string2 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getLoggingContext().getSessionId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getLoggingContext().getTransferId().toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            String str4 = null;
                            String str5 = null;
                            int i10 = 0;
                            String str6 = null;
                            NewsFeedItem newsFeedItem = null;
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
                            CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
                            SocialTradingContext socialTradingContext = null;
                            ByteString byteString = null;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -257;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            Object[] objArr = 0 == true ? 1 : 0;
                            Object[] objArr2 = 0 == true ? 1 : 0;
                            Object[] objArr3 = 0 == true ? 1 : 0;
                            Object[] objArr4 = 0 == true ? 1 : 0;
                            Object[] objArr5 = 0 == true ? 1 : 0;
                            Object[] objArr6 = 0 == true ? 1 : 0;
                            Object[] objArr7 = 0 == true ? 1 : 0;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(i7, i8, i9, str, str4, str5, str2, objArr2, i10, objArr3, objArr4, str6, objArr5, str3, objArr6, objArr7, newsFeedItem, objArr, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, new CryptoTransferContext(stringOrEmpty, string2, str, 0.0d, str2, null, null, null, null, string3, null, str3, null, null, 15868, null), cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i11, i12, i13, i14, i15, i16, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(1121565499, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle2, verificationParentContentDuxo3, activity2, navigator, context, navController), composer2, 54), composer2, 48);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: VerificationParentComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ VerificationParentContentDuxo $duxo;
                        final /* synthetic */ NavHostController $navController;
                        final /* synthetic */ com.robinhood.android.navigation.Navigator $navigator;
                        final /* synthetic */ SnapshotState4<VerificationParentContentViewState> $viewState$delegate;

                        AnonymousClass1(SnapshotState4<VerificationParentContentViewState> snapshotState4, VerificationParentContentDuxo verificationParentContentDuxo, Activity activity, com.robinhood.android.navigation.Navigator navigator, Context context, NavHostController navHostController) {
                            this.$viewState$delegate = snapshotState4;
                            this.$duxo = verificationParentContentDuxo;
                            this.$activity = activity;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$navController = navHostController;
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
                                ComposerKt.traceEventStart(1121565499, i, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous>.<anonymous> (VerificationParentComposable.kt:129)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$activity) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final VerificationParentContentDuxo verificationParentContentDuxo = this.$duxo;
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            final Activity activity = this.$activity;
                            final com.robinhood.android.navigation.Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Function2 function2 = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5(verificationParentContentDuxo, snapshotState4, activity, navigator, context, (NavGraphBuilder) obj, (NavHostController) obj2);
                                    }
                                };
                                composer.updateRememberedValue(function2);
                                objRememberedValue = function2;
                            }
                            composer.endReplaceGroup();
                            GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), VerificationNavigationDestinations7.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, (ComposableDestination.$stable << 6) | 24576, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5(VerificationParentContentDuxo verificationParentContentDuxo, final SnapshotState4 snapshotState4, final Activity activity, final com.robinhood.android.navigation.Navigator navigator, final Context context, NavGraphBuilder persistentSetOf, NavHostController navController) {
                            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                            Intrinsics.checkNotNullParameter(navController, "navController");
                            VerificationNavGraph.verificationNavGraph(persistentSetOf, navController, VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getVerificationId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getType(), new VerificationParentComposable5(verificationParentContentDuxo), new VerificationParentComposable6(verificationParentContentDuxo), new VerificationParentComposable7(verificationParentContentDuxo), new VerificationParentComposable8(verificationParentContentDuxo), new VerificationParentComposable9(verificationParentContentDuxo), new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$0(activity);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$1(activity);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$3(snapshotState4, navigator, context);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(navigator, context);
                                }
                            });
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$0(Activity activity) {
                            NavigationActivityResultContract3.finishWithResult$default(activity, CryptoTransferVerificationIntentKey3.Completed.INSTANCE, 0, 2, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$1(Activity activity) {
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$3(SnapshotState4 snapshotState4, com.robinhood.android.navigation.Navigator navigator, Context context) {
                            UUID transferId = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId();
                            if (transferId != null) {
                                Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoTransferHistoryFragmentKey(transferId, true), false, false, false, null, true, null, false, false, null, null, 4028, null);
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(com.robinhood.android.navigation.Navigator navigator, Context context) {
                            Navigators3.showContactSupportTriageFragment$default(navigator, context, null, false, 4, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 1572864, 60);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                verificationParentContentDuxo3 = verificationParentContentDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerificationParentComposable3.VerificationParentContent$lambda$2(navController, modifier4, verificationParentContentDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                    verificationParentContentDuxo3 = verificationParentContentDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<VerificationParentContentViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(verificationParentContentDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object objConsume22 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity22 = (Activity) objConsume22;
                Modifier modifier522 = modifier3;
                AnimatedContentKt.AnimatedContent(Boolean.valueOf(VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle22).getLoaded()), modifier522, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1026181204, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt.VerificationParentContent.1
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1026181204, i6, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous> (VerificationParentComposable.kt:113)");
                        }
                        if (!z) {
                            composer2.startReplaceGroup(612999348);
                            VerificationParentComposable3.Loading(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 6, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(613167523);
                            com.robinhood.android.navigation.Navigator navigator = (com.robinhood.android.navigation.Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                            Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            String stringOrEmpty = Uuids.toStringOrEmpty(VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle22).getLoggingContext().getCurrencyId());
                            String string2 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle22).getLoggingContext().getSessionId().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4CollectAsStateWithLifecycle22).getLoggingContext().getTransferId().toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            String str4 = null;
                            String str5 = null;
                            int i10 = 0;
                            String str6 = null;
                            NewsFeedItem newsFeedItem = null;
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
                            CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
                            SocialTradingContext socialTradingContext = null;
                            ByteString byteString = null;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -257;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            Object[] objArr = 0 == true ? 1 : 0;
                            Object[] objArr2 = 0 == true ? 1 : 0;
                            Object[] objArr3 = 0 == true ? 1 : 0;
                            Object[] objArr4 = 0 == true ? 1 : 0;
                            Object[] objArr5 = 0 == true ? 1 : 0;
                            Object[] objArr6 = 0 == true ? 1 : 0;
                            Object[] objArr7 = 0 == true ? 1 : 0;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(i7, i8, i9, str, str4, str5, str2, objArr2, i10, objArr3, objArr4, str6, objArr5, str3, objArr6, objArr7, newsFeedItem, objArr, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, new CryptoTransferContext(stringOrEmpty, string2, str, 0.0d, str2, null, null, null, null, string3, null, str3, null, null, 15868, null), cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i11, i12, i13, i14, i15, i16, 16383, null), null, null, 55, null), ComposableLambda3.rememberComposableLambda(1121565499, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle22, verificationParentContentDuxo3, activity22, navigator, context, navController), composer2, 54), composer2, 48);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: VerificationParentComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Activity $activity;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ VerificationParentContentDuxo $duxo;
                        final /* synthetic */ NavHostController $navController;
                        final /* synthetic */ com.robinhood.android.navigation.Navigator $navigator;
                        final /* synthetic */ SnapshotState4<VerificationParentContentViewState> $viewState$delegate;

                        AnonymousClass1(SnapshotState4<VerificationParentContentViewState> snapshotState4, VerificationParentContentDuxo verificationParentContentDuxo, Activity activity, com.robinhood.android.navigation.Navigator navigator, Context context, NavHostController navHostController) {
                            this.$viewState$delegate = snapshotState4;
                            this.$duxo = verificationParentContentDuxo;
                            this.$activity = activity;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$navController = navHostController;
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
                                ComposerKt.traceEventStart(1121565499, i, -1, "com.robinhood.shared.crypto.transfer.verification.VerificationParentContent.<anonymous>.<anonymous> (VerificationParentComposable.kt:129)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$duxo) | composer.changedInstance(this.$activity) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final VerificationParentContentDuxo verificationParentContentDuxo = this.$duxo;
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            final Activity activity = this.$activity;
                            final com.robinhood.android.navigation.Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                Function2 function2 = new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5(verificationParentContentDuxo, snapshotState4, activity, navigator, context, (NavGraphBuilder) obj, (NavHostController) obj2);
                                    }
                                };
                                composer.updateRememberedValue(function2);
                                objRememberedValue = function2;
                            }
                            composer.endReplaceGroup();
                            GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), VerificationNavigationDestinations7.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierFillMaxSize$default, composer, (ComposableDestination.$stable << 6) | 24576, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5(VerificationParentContentDuxo verificationParentContentDuxo, final SnapshotState4 snapshotState4, final Activity activity, final com.robinhood.android.navigation.Navigator navigator, final Context context, NavGraphBuilder persistentSetOf, NavHostController navController) {
                            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                            Intrinsics.checkNotNullParameter(navController, "navController");
                            VerificationNavGraph.verificationNavGraph(persistentSetOf, navController, VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getVerificationId(), VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getType(), new VerificationParentComposable5(verificationParentContentDuxo), new VerificationParentComposable6(verificationParentContentDuxo), new VerificationParentComposable7(verificationParentContentDuxo), new VerificationParentComposable8(verificationParentContentDuxo), new VerificationParentComposable9(verificationParentContentDuxo), new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$0(activity);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$1(activity);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$3(snapshotState4, navigator, context);
                                }
                            }, new Function0() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$VerificationParentContent$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return VerificationParentComposable3.C384901.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(navigator, context);
                                }
                            });
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$0(Activity activity) {
                            NavigationActivityResultContract3.finishWithResult$default(activity, CryptoTransferVerificationIntentKey3.Completed.INSTANCE, 0, 2, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$1(Activity activity) {
                            activity.finish();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$3(SnapshotState4 snapshotState4, com.robinhood.android.navigation.Navigator navigator, Context context) {
                            UUID transferId = VerificationParentComposable3.VerificationParentContent$lambda$1(snapshotState4).getTransferId();
                            if (transferId != null) {
                                Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoTransferHistoryFragmentKey(transferId, true), false, false, false, null, true, null, false, false, null, null, 4028, null);
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(com.robinhood.android.navigation.Navigator navigator, Context context) {
                            Navigators3.showContactSupportTriageFragment$default(navigator, context, null, false, 4, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 1572864, 60);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(final Modifier modifier, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(51413234);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if ((i2 & 1) != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51413234, i, -1, "com.robinhood.shared.crypto.transfer.verification.Loading (VerificationParentComposable.kt:180)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.verification.VerificationParentComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationParentComposable3.Loading$lambda$3(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
