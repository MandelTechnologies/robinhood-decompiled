package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterBanner;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.RichText;
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
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.view.Bindable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: AccountCenterUpsellBannerView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\r\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0017R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterUpsellBannerView;", "Lcom/robinhood/compose/app/GenericComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$ReferralBanner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "uiState", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterBanner;", "bind", "", "state", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountCenterUpsellBannerView extends Hammer_AccountCenterUpsellBannerView implements Bindable<UiTypedAccountCenterItem.ReferralBanner> {
    public static final int $stable = 8;
    public Navigator navigator;
    private final SnapshotState<ApiAccountCenterBanner> uiState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(AccountCenterUpsellBannerView accountCenterUpsellBannerView, int i, Composer composer, int i2) {
        accountCenterUpsellBannerView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(AccountCenterUpsellBannerView accountCenterUpsellBannerView, int i, Composer composer, int i2) {
        accountCenterUpsellBannerView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountCenterUpsellBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterUpsellBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiTypedAccountCenterItem.ReferralBanner state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.uiState.setValue(state.getContent());
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(245480355);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(245480355, i2, -1, "com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView.Content (AccountCenterUpsellBannerView.kt:43)");
            }
            final ApiAccountCenterBanner value = this.uiState.getValue();
            if (value == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountCenterUpsellBannerView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this)), null, ComposableLambda3.rememberComposableLambda(117773013, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(Composer composer2, int i3) {
                    String text;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(117773013, i3, -1, "com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView.Content.<anonymous> (AccountCenterUpsellBannerView.kt:48)");
                    }
                    Screen screen = new Screen(Screen.Name.ACCOUNT_CENTER, null, null, null, 14, null);
                    Component.ComponentType componentType = Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER;
                    String logging_identifier = value.getLogging_identifier();
                    Component component = new Component(componentType, logging_identifier, null, 4, null);
                    String text2 = value.getTitle().getText();
                    if (value.getSubtitle() != null) {
                        RichText subtitle = value.getSubtitle();
                        Intrinsics.checkNotNull(subtitle);
                        text = subtitle.getText();
                    } else {
                        text = "";
                    }
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    String str = null;
                    String str2 = null;
                    Context.ProductTag productTag = null;
                    int i7 = 0;
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
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -1;
                    int i11 = -1;
                    int i12 = -5;
                    int i13 = -1;
                    Object[] objArr = 0 == true ? 1 : 0;
                    Object[] objArr2 = 0 == true ? 1 : 0;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(i4, i5, i6, objArr2, str, objArr, str2, productTag, i7, str3, str4, str5, screen2, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, new UpsellBannerContext(text2, text, null, 4, null), referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i8, i9, i10, i11, i12, i13, 16383, null), component, null, 37, null), ComposableLambda3.rememberComposableLambda(-1481086208, true, new AnonymousClass1(value, this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AccountCenterUpsellBannerView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView$Content$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ApiAccountCenterBanner $data;
                    final /* synthetic */ AccountCenterUpsellBannerView this$0;

                    AnonymousClass1(ApiAccountCenterBanner apiAccountCenterBanner, AccountCenterUpsellBannerView accountCenterUpsellBannerView) {
                        this.$data = apiAccountCenterBanner;
                        this.this$0 = accountCenterUpsellBannerView;
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
                            ComposerKt.traceEventStart(-1481086208, i, -1, "com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView.Content.<anonymous>.<anonymous> (AccountCenterUpsellBannerView.kt:63)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, true, null, 77, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierAutoLogEvents$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                        ApiAccountCenterBanner apiAccountCenterBanner = this.$data;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AccountCenterUpsellBannerView accountCenterUpsellBannerView = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView$Content$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountCenterUpsellBannerView.C83061.AnonymousClass1.invoke$lambda$1$lambda$0(accountCenterUpsellBannerView, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        AccountCenterUpsellBannerComposable.AccountCenterUpsellBannerComposable(modifierM5145paddingqDBjuR0, apiAccountCenterBanner, (Function1) objRememberedValue, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AccountCenterUpsellBannerView accountCenterUpsellBannerView, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator navigator = accountCenterUpsellBannerView.getNavigator();
                        android.content.Context context = accountCenterUpsellBannerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(it), null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.accountcenter.views.AccountCenterUpsellBannerView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountCenterUpsellBannerView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
