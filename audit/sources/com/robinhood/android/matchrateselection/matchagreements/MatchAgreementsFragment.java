package com.robinhood.android.matchrateselection.matchagreements;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsEvent;
import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment;
import com.robinhood.android.models.retirement.api.contributions.ApiAgreementsViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImage3;
import com.robinhood.android.retirement.match.MatchAgreementState;
import com.robinhood.android.retirement.match.MatchAgreementsScreen4;
import com.robinhood.android.retirement.match.MatchAgreementsScreen5;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.rosetta.eventlogging.AccountType;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CountryGatingContext;
import com.robinhood.rosetta.eventlogging.CryptoAssetContext;
import com.robinhood.rosetta.eventlogging.CryptoGiftContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoQuickTradeButtonContext;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.DappBrowserContext;
import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.robinhood.rosetta.eventlogging.DayTradeCardContext;
import com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.DisclosureDropdown;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.EquityScreenerContext;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.FXRate;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
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
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.LoginContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MarginHealthState;
import com.robinhood.rosetta.eventlogging.MarginUpgradeContext;
import com.robinhood.rosetta.eventlogging.NCWTokenVisibilityContext;
import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.NcwMultichainTokenContext;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.robinhood.rosetta.eventlogging.NcwTransferContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.NotificationContext;
import com.robinhood.rosetta.eventlogging.OnboardingWelcomeTakeoverScreenContext;
import com.robinhood.rosetta.eventlogging.OptionOrderBidAskBarContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.OptionSimulatedReturnsContext;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
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
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.PortfolioSharingContext;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.ReferralInviteContext;
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
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
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
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MatchAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J\r\u0010$\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0003¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001cH\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00063²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsDuxo;", "getDuxo", "()Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "RolloverHeader", MarkdownText4.TagImageUrl, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "onClickAgreeCta", "onSweepAgreementToggled", "enabled", "handleEvent", "event", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent;", "Callbacks", "Args", "Companion", "feature-match-rate-selection_externalDebug", "viewState", "Lcom/robinhood/android/retirement/match/MatchAgreementState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchAgreementsFragment extends GenericComposeFragment implements MatchAgreementsScreen4 {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchAgreementsDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchAgreementsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MatchAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Callbacks;", "", "onAgreementsSigned", "", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAgreementsSigned();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MatchAgreementsFragment matchAgreementsFragment, int i, Composer composer, int i2) {
        matchAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverHeader$lambda$4(MatchAgreementsFragment matchAgreementsFragment, String str, int i, Composer composer, int i2) {
        matchAgreementsFragment.RolloverHeader(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchAgreementsDuxo getDuxo() {
        return (MatchAgreementsDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint() != ApiMatchRateSelection6.ROLLOVER;
    }

    /* compiled from: MatchAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$onViewCreated$1", m3645f = "MatchAgreementsFragment.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$onViewCreated$1 */
    static final class C216071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C216071(Continuation<? super C216071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchAgreementsFragment.this.new C216071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C216071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MatchAgreementsEvent>> eventFlow = MatchAgreementsFragment.this.getDuxo().getEventFlow();
                final MatchAgreementsFragment matchAgreementsFragment = MatchAgreementsFragment.this;
                FlowCollector<? super Event<MatchAgreementsEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchAgreementsEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchAgreementsEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchAgreementsEvent> eventConsumerInvoke;
                        if (event != null) {
                            final MatchAgreementsFragment matchAgreementsFragment2 = matchAgreementsFragment;
                            if ((event.getData() instanceof MatchAgreementsEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m16462invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16462invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        matchAgreementsFragment2.handleEvent((MatchAgreementsEvent) event.getData());
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C216071(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-487652558);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487652558, i2, -1, "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent (MatchAgreementsFragment.kt:70)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(585741629, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(585741629, i3, -1, "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.<anonymous> (MatchAgreementsFragment.kt:73)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS, null, ((Args) MatchAgreementsFragment.INSTANCE.getArgs((Fragment) MatchAgreementsFragment.this)).getEntryPoint().getServerValue(), null, 10, null), null, null, null, null, 61, null);
                    final MatchAgreementsFragment matchAgreementsFragment = MatchAgreementsFragment.this;
                    final SnapshotState4<MatchAgreementState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1851771688, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1851771688, i4, -1, "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.<anonymous>.<anonymous> (MatchAgreementsFragment.kt:81)");
                            }
                            MatchAgreementState matchAgreementStateComposeContent$lambda$0 = MatchAgreementsFragment.ComposeContent$lambda$0(snapshotState4);
                            MatchAgreementsFragment matchAgreementsFragment2 = matchAgreementsFragment;
                            Function3<Modifier, Composer, Integer, Unit> lambda$1540493316$feature_match_rate_selection_externalDebug = MatchAgreementsFragment2.INSTANCE.getLambda$1540493316$feature_match_rate_selection_externalDebug();
                            Modifier modifierNavigationBarsPadding = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierNavigationBarsPadding, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            if (((Args) MatchAgreementsFragment.INSTANCE.getArgs((Fragment) matchAgreementsFragment)).getEntryPoint() == ApiMatchRateSelection6.ROLLOVER) {
                                modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifierNavigationBarsPadding);
                            }
                            Modifier modifierThen = modifierM5146paddingqDBjuR0$default.then(modifierNavigationBarsPadding);
                            final MatchAgreementsFragment matchAgreementsFragment3 = matchAgreementsFragment;
                            final SnapshotState4<MatchAgreementState> snapshotState42 = snapshotState4;
                            MatchAgreementsScreen5.MatchAgreementsScreen(matchAgreementStateComposeContent$lambda$0, matchAgreementsFragment2, lambda$1540493316$feature_match_rate_selection_externalDebug, modifierThen, ComposableLambda3.rememberComposableLambda(1762927517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1762927517, i5, -1, "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MatchAgreementsFragment.kt:101)");
                                    }
                                    MatchAgreementsFragment matchAgreementsFragment4 = matchAgreementsFragment3;
                                    ApiAgreementsViewModel agreementsViewModel = MatchAgreementsFragment.ComposeContent$lambda$0(snapshotState42).getAgreementsViewModel();
                                    matchAgreementsFragment4.RolloverHeader(agreementsViewModel != null ? agreementsViewModel.getHeader_image() : null, composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, MatchAgreementState.$stable | 24960, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchAgreementsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchAgreementState ComposeContent$lambda$0(SnapshotState4<MatchAgreementState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RolloverHeader(String str, Composer composer, final int i) {
        int i2;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1238112500);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1238112500, i2, -1, "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment.RolloverHeader (MatchAgreementsFragment.kt:109)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchAgreementsFragment.RolloverHeader$lambda$3$lambda$2(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                str2 = str;
                Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(str2, (Function0) objRememberedValue, null, null, composerStartRestartGroup, i2 & 14, 12);
            } else {
                str2 = str;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchAgreementsFragment.RolloverHeader$lambda$4(this.f$0, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverHeader$lambda$3$lambda$2(MatchAgreementsFragment matchAgreementsFragment) {
        matchAgreementsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.retirement.match.MatchAgreementsScreen4
    public void onClickAgreeCta() {
        getDuxo().onAgreementsAccepted();
    }

    @Override // com.robinhood.android.retirement.match.MatchAgreementsScreen4
    public void onSweepAgreementToggled(boolean enabled) {
        getDuxo().setSweepState(enabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleEvent(MatchAgreementsEvent event) throws Throwable {
        if (event instanceof MatchAgreementsEvent.AgreementsSigned) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i4 = 0;
            String str4 = null;
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
            Object[] objArr = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.GOLD_UPGRADE_SUCCESS, new Screen(Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS, null, null, null, 14, null), null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, objArr, str2, str3, Context.ProductTag.GOLD, i4, str4, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint().getServerValue(), str5, screen, str6, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str7, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str8, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, new GoldUpgradeContext(Boolean.FALSE, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, GoldUpgradeType.RETIREMENT_GOLD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -524289, -33554433, -1, 16383, null), false, 44, null);
            getCallbacks().onAgreementsSigned();
            return;
        }
        if (!(event instanceof MatchAgreementsEvent.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        MatchAgreementsEvent.Error error = (MatchAgreementsEvent.Error) event;
        if (error.getNavigateBackAfterDismiss()) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getError(), true, false, 0, null, 56, null);
            return;
        }
        ActivityErrorHandler.Companion companion2 = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion2, fragmentActivityRequireActivity2, error.getError(), false, false, 0, null, 60, null);
    }

    /* compiled from: MatchAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Args;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "<init>", "(Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiMatchRateSelection6 entryPoint;

        /* compiled from: MatchAgreementsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ApiMatchRateSelection6.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiMatchRateSelection6 apiMatchRateSelection6, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMatchRateSelection6 = args.entryPoint;
            }
            return args.copy(apiMatchRateSelection6);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMatchRateSelection6 getEntryPoint() {
            return this.entryPoint;
        }

        public final Args copy(ApiMatchRateSelection6 entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.entryPoint == ((Args) other).entryPoint;
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return "Args(entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPoint.name());
        }

        public Args(ApiMatchRateSelection6 entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        public final ApiMatchRateSelection6 getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Args;", "<init>", "()V", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchAgreementsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchAgreementsFragment matchAgreementsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchAgreementsFragment newInstance(Args args) {
            return (MatchAgreementsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchAgreementsFragment matchAgreementsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchAgreementsFragment, args);
        }
    }
}
