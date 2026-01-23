package com.robinhood.android.support.call;

import android.app.Activity;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.settings.extensions.NotificationManagers;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.models.api.BannerIcon2;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.IssueToast;
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
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: CallAssignedSnackbarManager.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;", "", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "activity", "Landroid/app/Activity;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "snackbarHandler", "Lcom/robinhood/android/support/call/CallAssignedSnackbarManager$SnackbarHandler;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Landroid/app/Activity;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/common/util/GcmManager;Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;Lcom/robinhood/android/support/call/CallAssignedSnackbarManager$SnackbarHandler;)V", "observable", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/Issue$Phone;", "kotlin.jvm.PlatformType", "start", "shouldShowCallAssignedSnackbar", "", "SnackbarHandler", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CallAssignedSnackbarManager {
    public static final int $stable = 8;
    private final Activity activity;
    private final EventLogger eventLogger;
    private final GcmManager gcmManager;
    private final Observable<Issue.Phone> observable;
    private final SnackbarHandler snackbarHandler;
    private final SupportPhoneIssueStore supportPhoneIssueStore;

    public CallAssignedSnackbarManager(AuthManager authManager, Activity activity, EventLogger eventLogger, GcmManager gcmManager, SupportPhoneIssueStore supportPhoneIssueStore, SnackbarHandler snackbarHandler) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(snackbarHandler, "snackbarHandler");
        this.activity = activity;
        this.eventLogger = eventLogger;
        this.gcmManager = gcmManager;
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.snackbarHandler = snackbarHandler;
        Observable observableSwitchMap = Observable.just(Boolean.valueOf(authManager.isLoggedIn())).filter(new Predicate() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$observable$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$observable$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Issue>> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.supportPhoneIssueStore.streamActiveIssue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable map = ObservablesKt.filterIsPresent(observableSwitchMap).map(new Function() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$special$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Issue issue = (Issue) it;
                return Optional3.asOptional(issue instanceof Issue.Phone ? (Issue.Phone) issue : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CallAssignedSnackbarManager$special$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap2 = ObservablesKt.filterIsPresent(map).switchMap(new Function() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$observable$4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Issue.Phone> apply(final Issue.Phone phoneIssue) {
                Intrinsics.checkNotNullParameter(phoneIssue, "phoneIssue");
                return this.this$0.supportPhoneIssueStore.streamPhoneIssueAssigned(phoneIssue).map(new Function() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$observable$4.1
                    @Override // io.reactivex.functions.Function
                    public final Issue.Phone apply(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return phoneIssue;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        Observable<Issue.Phone> observableRefCount = ObservablesAndroid.observeOnMainThread(observableSwitchMap2).doOnNext(new Consumer() { // from class: com.robinhood.android.support.call.CallAssignedSnackbarManager$observable$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final void accept(Issue.Phone phone) {
                if (this.this$0.shouldShowCallAssignedSnackbar()) {
                    SupportPhoneIssueStore supportPhoneIssueStore2 = this.this$0.supportPhoneIssueStore;
                    Intrinsics.checkNotNull(phone);
                    supportPhoneIssueStore2.clearPhoneIssueAssigned(phone);
                    IssueToast toast = phone.getToast();
                    if (toast != null) {
                        CallAssignedSnackbarManager callAssignedSnackbarManager = this.this$0;
                        EventLogger eventLogger2 = callAssignedSnackbarManager.eventLogger;
                        UserInteractionEventData.Action action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                        Component component = new Component(Component.ComponentType.CX_CALL_ASSIGNED_TOAST, null, null, 6, null);
                        String string2 = phone.getInquiryId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        String str4 = null;
                        ListsContext listsContext = null;
                        DirectDepositSwitcherContext directDepositSwitcherContext = null;
                        OrderKind orderKind = null;
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
                        ByteString byteString = null;
                        int i5 = -262145;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = -1;
                        int i10 = -1;
                        Object[] objArr = 0 == true ? 1 : 0;
                        Object[] objArr2 = 0 == true ? 1 : 0;
                        Object[] objArr3 = 0 == true ? 1 : 0;
                        Object[] objArr4 = 0 == true ? 1 : 0;
                        Object[] objArr5 = 0 == true ? 1 : 0;
                        Object[] objArr6 = 0 == true ? 1 : 0;
                        Object[] objArr7 = 0 == true ? 1 : 0;
                        Object[] objArr8 = 0 == true ? 1 : 0;
                        Object[] objArr9 = 0 == true ? 1 : 0;
                        Object[] objArr10 = 0 == true ? 1 : 0;
                        Object[] objArr11 = 0 == true ? 1 : 0;
                        Object[] objArr12 = 0 == true ? 1 : 0;
                        Object[] objArr13 = 0 == true ? 1 : 0;
                        Object[] objArr14 = 0 == true ? 1 : 0;
                        EventLogger.DefaultImpls.logAppear$default(eventLogger2, action, null, component, null, new Context(i, i2, i3, objArr, objArr3, str, objArr4, objArr5, i4, str2, str4, objArr6, objArr7, str3, objArr8, objArr9, objArr10, objArr11, new CXIssue(string2, null, null, null, str, null, null, null, str2, 0, null, null, str3, null, null, null, null, 0, null, false, null, false, null, 8388606, null), objArr12, listsContext, objArr13, directDepositSwitcherContext, objArr14, orderKind, objArr2, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str5, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str6, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null), 10, null);
                        callAssignedSnackbarManager.snackbarHandler.showIssueAssignedSnackbar(toast);
                    }
                }
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        this.observable = observableRefCount;
    }

    public final Observable<?> start() {
        return this.observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowCallAssignedSnackbar() {
        if (!this.gcmManager.isRegistered()) {
            return true;
        }
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(this.activity);
        if (notificationManager.areNotificationsEnabled()) {
            return Build.VERSION.SDK_INT >= 26 && NotificationManagers.getContactChannelOrDefault(notificationManager).getImportance() == 0;
        }
        return true;
    }

    /* compiled from: CallAssignedSnackbarManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/support/call/CallAssignedSnackbarManager$SnackbarHandler;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "showIssueAssignedSnackbar", "", "toast", "Lcom/robinhood/models/ui/IssueToast;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SnackbarHandler {
        public static final int $stable = 8;
        private final Activity activity;

        public SnackbarHandler(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        public final void showIssueAssignedSnackbar(IssueToast toast) {
            Intrinsics.checkNotNullParameter(toast, "toast");
            RdsSnackbar.INSTANCE.make(Snackbars.INSTANCE.findRoot(this.activity), RichTexts.toSpannableString$default(toast.getDisplayDescription(), this.activity, null, false, null, 14, null), (int) Durations.INSTANCE.getFIVE_SECONDS().toMillis()).setLeadingIcon(BannerIcon2.getDrawable(toast.getIcon())).show();
        }
    }
}
