package com.robinhood.android.search.newsfeed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter;
import com.robinhood.disposer.ViewDisposerKt;
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
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.ByteString;

/* compiled from: NewsFeedCarousel.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u000289B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000200H\u0014J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u0003H\u0016J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000200H\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/newsfeed/model/Element$Carousel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "callbacks", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel$Callbacks;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", SduiFeatureDiscovery3.CAROUSEL_TAG, "getCarousel", "()Lcom/robinhood/android/newsfeed/model/Element$Carousel;", "setCarousel", "(Lcom/robinhood/android/newsfeed/model/Element$Carousel;)V", "titleTxt", "Landroid/widget/TextView;", "subtitleTxt", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarouselAdapter;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Ljava/util/UUID;", "Lcom/robinhood/android/newsfeed/model/Content;", "visibleAutoLoggableViewManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "onAttachedToWindow", "", "onDetachedFromWindow", "bind", "state", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "Callbacks", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedCarousel extends Hammer_NewsFeedCarousel implements Bindable<Element.Carousel>, DefaultLifecycleObserver {
    private final NewsFeedCarouselAdapter adapter;
    public AnalyticsLogger analytics;
    private Callbacks callbacks;
    private Element.Carousel carousel;
    private Lifecycle lifecycle;
    private final RecyclerView recyclerView;
    private final TextView subtitleTxt;
    private final TextView titleTxt;
    private final VisibleAutoLoggableViewManager<UUID, Content> visibleAutoLoggableViewManager;
    private final VisibleItemsManager<UUID, Content> visibleItemsManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewsFeedCarousel.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel$Callbacks;", "", "onContentAppear", "", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "onContentDisappear", "durationVisible", "", "onContentClick", "onContentRelatedInstrumentClick", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onContentRelatedAssetClick", "asset", "Lcom/robinhood/android/newsfeed/model/RelatedAsset;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContentAppear(Content content);

        void onContentClick(Content content);

        void onContentDisappear(Content content, long durationVisible);

        void onContentRelatedAssetClick(Content content, RelatedAsset asset);

        void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C27909R.layout.merge_news_feed_carousel, true);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedCarousel._init_$lambda$1(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C27909R.id.news_feed_carousel_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C27909R.id.news_feed_carousel_subtitle_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.subtitleTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C27909R.id.news_feed_carousel_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.recyclerView = recyclerView;
        NewsFeedCarouselAdapter newsFeedCarouselAdapter = new NewsFeedCarouselAdapter();
        this.adapter = newsFeedCarouselAdapter;
        recyclerView.setAdapter(newsFeedCarouselAdapter);
        recyclerView.addItemDecoration(new NewsFeedCarouselAdapter.PaddingItemDecoration(context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        newsFeedCarouselAdapter.setCallbacks(new NewsFeedCarouselAdapter.Callbacks() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.3
            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter.Callbacks
            public void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument) {
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Callbacks callbacks = NewsFeedCarousel.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedInstrumentClick(content, instrument);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter.Callbacks
            public void onContentRelatedAssetClick(Content article, RelatedAsset asset) {
                Intrinsics.checkNotNullParameter(article, "article");
                Intrinsics.checkNotNullParameter(asset, "asset");
                Callbacks callbacks = NewsFeedCarousel.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentRelatedAssetClick(article, asset);
                }
            }

            @Override // com.robinhood.android.search.newsfeed.view.NewsFeedCarouselAdapter.Callbacks
            public void onContentClick(Content content) {
                Intrinsics.checkNotNullParameter(content, "content");
                Callbacks callbacks = NewsFeedCarousel.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentClick(content);
                }
            }
        });
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        VisibleItemsManager<UUID, Content> visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedCarousel._init_$lambda$4(this.f$0));
            }
        }, new C280885(newsFeedCarouselAdapter), new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedCarousel._init_$lambda$5((Content) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        visibleItemsManager.setCallbacks(new VisibleItemsManager.Callbacks<Content>() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.7
            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemAppeared(Content item) {
                Intrinsics.checkNotNullParameter(item, "item");
                Callbacks callbacks = NewsFeedCarousel.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentAppear(item);
                }
            }

            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemDisappeared(Content item, long durationVisible) {
                Intrinsics.checkNotNullParameter(item, "item");
                Callbacks callbacks = NewsFeedCarousel.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onContentDisappear(item, durationVisible);
                }
            }
        });
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2);
        this.visibleAutoLoggableViewManager = new VisibleAutoLoggableViewManager<>(layoutManager2, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedCarousel._init_$lambda$6(this.f$0));
            }
        }, new C280909(newsFeedCarouselAdapter), new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedCarousel._init_$lambda$7((Content) obj);
            }
        }, false, false, 48, null);
        newsFeedCarouselAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel.11
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                NewsFeedCarousel.this.visibleItemsManager.update();
                NewsFeedCarousel.this.visibleAutoLoggableViewManager.update();
            }
        });
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public final Element.Carousel getCarousel() {
        return this.carousel;
    }

    public final void setCarousel(Element.Carousel carousel) {
        this.carousel = carousel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final UserInteractionEventDescriptor _init_$lambda$1(NewsFeedCarousel newsFeedCarousel) {
        Element.Carousel carousel = newsFeedCarousel.carousel;
        if (carousel == null) {
            return null;
        }
        String str = null;
        Component component = new Component(Component.ComponentType.CAROUSEL, carousel.getTitle(), null, 4, null);
        NewsFeedItem newsFeedItem = new NewsFeedItem(null, NewsFeedItem.ContentType.CAROUSEL, null, str, carousel.getContents().size(), null, 45, null);
        int i = 0;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Screen screen = null;
        String str7 = null;
        Asset asset = null;
        List list = null;
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
        ByteString byteString = null;
        int i4 = -65538;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(carousel.getRank() + 1, i, i2, str, str2, 0 == true ? 1 : 0, str3, objArr, i3, str4, str5, str6, screen, str7, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str8, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str9, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i4, i5, i6, i7, i8, i9, 16383, null), component, null, 39, null);
    }

    /* compiled from: NewsFeedCarousel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$5 */
    /* synthetic */ class C280885 extends FunctionReferenceImpl implements Function1<Integer, Content> {
        C280885(Object obj) {
            super(1, obj, NewsFeedCarouselAdapter.class, "getItem", "getItem(I)Lcom/robinhood/android/newsfeed/model/Content;", 0);
        }

        public final Content invoke(int i) {
            return ((NewsFeedCarouselAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Content invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$4(NewsFeedCarousel newsFeedCarousel) {
        return newsFeedCarousel.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID _init_$lambda$5(Content VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getId();
    }

    /* compiled from: NewsFeedCarousel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$9 */
    /* synthetic */ class C280909 extends FunctionReferenceImpl implements Function1<Integer, Content> {
        C280909(Object obj) {
            super(1, obj, NewsFeedCarouselAdapter.class, "getItem", "getItem(I)Lcom/robinhood/android/newsfeed/model/Content;", 0);
        }

        public final Content invoke(int i) {
            return ((NewsFeedCarouselAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Content invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$6(NewsFeedCarousel newsFeedCarousel) {
        return newsFeedCarousel.adapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID _init_$lambda$7(Content VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return VisibleAutoLoggableViewManager.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(RxRecyclerView.scrollEvents(this.recyclerView), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedCarousel.onAttachedToWindow$lambda$8(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        ViewDisposerKt.bindTo$default(RxRecyclerView.scrollStateChanges(this.recyclerView), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedCarousel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedCarousel.onAttachedToWindow$lambda$9(this.f$0, ((Integer) obj).intValue());
            }
        });
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(NewsFeedCarousel newsFeedCarousel, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newsFeedCarousel.visibleItemsManager.update();
        newsFeedCarousel.visibleAutoLoggableViewManager.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$9(NewsFeedCarousel newsFeedCarousel, int i) {
        if (1 == i) {
            ViewsKt.logScroll(newsFeedCarousel);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
        onStop();
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Element.Carousel state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.carousel = state;
        this.titleTxt.setText(state.getTitle());
        this.subtitleTxt.setText(state.getSubtitle());
        TextView textView = this.subtitleTxt;
        String subtitle = state.getSubtitle();
        textView.setVisibility(subtitle == null || StringsKt.isBlank(subtitle) ? 8 : 0);
        this.adapter.submitList(state.getContents());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.visibleItemsManager.update();
        this.visibleAutoLoggableViewManager.update();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onStop();
    }

    private final void onStop() {
        this.visibleItemsManager.clear();
        this.visibleAutoLoggableViewManager.clear();
    }

    /* compiled from: NewsFeedCarousel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedCarousel;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<NewsFeedCarousel> {
        private final /* synthetic */ Inflater<NewsFeedCarousel> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public NewsFeedCarousel inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (NewsFeedCarousel) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C27909R.layout.include_news_feed_carousel);
        }
    }
}
