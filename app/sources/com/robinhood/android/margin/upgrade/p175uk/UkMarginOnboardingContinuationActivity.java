package com.robinhood.android.margin.upgrade.p175uk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistFragment;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.margin.SetMarginLimitActivityResult;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.margin.contracts.MarginLimitActivityKey;
import com.robinhood.android.margin.contracts.UkMarginOnboardingContinuationIntentKey;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeIneligibleFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks;
import com.robinhood.android.margin.upgrade.p175uk.UkMarginOnboardingViewState2;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingQuestionnaireFragment;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UkMarginOnboardingContinuationActivity.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001SB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020 H\u0016J\b\u0010*\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020 H\u0016J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020 H\u0016J\b\u00105\u001a\u00020 H\u0016J \u00106\u001a\u00020 2\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020(H\u0016J\b\u0010?\u001a\u00020 H\u0016J\u001c\u0010@\u001a\u00020 2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\b\u0010D\u001a\u00020 H\u0016J\u0012\u0010E\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u00010FH\u0002J\u0012\u0010G\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020KH\u0002J\t\u0010L\u001a\u00020MH\u0096\u0001R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OX\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingContinuationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Callbacks;", "Lcom/robinhood/shared/questionnaire/libquestionnaire/ReviewInvestorProfileCallbacks;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", "<init>", "()V", "bindings", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBindings", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "setMarginLimitLauncher", "Lcom/robinhood/android/margin/contracts/MarginLimitActivityKey;", "ukMarginDepositLauncher", "Landroid/content/Intent;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "launchInvestorProfileQuestionnaire", "productContext", "", "launchInvestorProfileReview", "onInvestorProfileReviewed", "onMarginEligibilityPassed", "onMarginEligibilityCanceled", "onRetryMarginKnowledgeTest", "onRatesContinue", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "onRatesIneligible", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "onRatesShowInvestorProfile", "onRatesDismiss", "onMarginUpgradeSuccess", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "onMarginUpgradeError", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "onDoneClicked", "onDepositClicked", "minAmount", "Ljava/math/BigDecimal;", "recommendedAmount", "onSetBorrowingLimitClicked", "handleQuestionnaireResult", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult;", "handleSetMarginLimitResult", "Lcom/robinhood/android/lib/margin/SetMarginLimitActivityResult;", "handleDuxoEvent", "event", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UkMarginOnboardingContinuationActivity extends BaseActivity implements RegionGated, UkMarginOnboardingQuestionnaireFragment.Callbacks, ReviewInvestorProfileCallbacks, MarginEligibilityChecklistFragment.Callbacks, MarginUpgradeRatesFragment.Callbacks, MarginUpgradeCallbacks, MarginUpgradeConfirmationFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> questionnaireLauncher;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<MarginLimitActivityKey>> setMarginLimitLauncher;
    private final ActivityResultLauncher<Intent> ukMarginDepositLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkMarginOnboardingContinuationActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public UkMarginOnboardingContinuationActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.$$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, UkMarginOnboardingContinuationActivity2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, UkMarginOnboardingDuxo.class);
        this.questionnaireLauncher = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$questionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) throws Throwable {
                this.this$0.handleQuestionnaireResult(questionnaireContract2);
            }
        });
        this.setMarginLimitLauncher = registerForActivityResult(new SetMarginLimitContract(new Function0() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$setMarginLimitLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(SetMarginLimitActivityResult setMarginLimitActivityResult) {
                this.this$0.handleSetMarginLimitResult(setMarginLimitActivityResult);
            }
        });
        this.ukMarginDepositLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$ukMarginDepositLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.onDoneClicked();
                }
            }
        });
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UkMarginOnboardingDuxo getDuxo() {
        return (UkMarginOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C11223R.string.margin_investing_toolbar_title);
        RdsSegmentedProgressBar progressBar = toolbar.getProgressBar();
        progressBar.setVisibility(0);
        progressBar.setNumSegments(6);
        RdsSegmentedProgressBar.setProgress$default(progressBar, 0, 0.0f, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        initEdgeToEdge(false);
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            replaceFragment(UkMarginOnboardingQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkMarginOnboardingQuestionnaireFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), QuestionnaireContexts.SUITABILITY, false, 4, null)));
            BaseActivity.collectDuxoState$default(this, null, new C212191(null), 1, null);
        }
    }

    /* compiled from: UkMarginOnboardingContinuationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$onCreate$1", m3645f = "UkMarginOnboardingContinuationActivity.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$onCreate$1 */
    static final class C212191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212191(Continuation<? super C212191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingContinuationActivity.this.new C212191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(UkMarginOnboardingContinuationActivity.this.getDuxo().getEventFlow());
                final UkMarginOnboardingContinuationActivity ukMarginOnboardingContinuationActivity = UkMarginOnboardingContinuationActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<UkMarginOnboardingViewState2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<UkMarginOnboardingViewState2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<UkMarginOnboardingViewState2> eventConsumerInvoke;
                        final UkMarginOnboardingContinuationActivity ukMarginOnboardingContinuationActivity2 = ukMarginOnboardingContinuationActivity;
                        if ((event.getData() instanceof UkMarginOnboardingViewState2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingContinuationActivity$onCreate$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16256invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16256invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ukMarginOnboardingContinuationActivity2.handleDuxoEvent((UkMarginOnboardingViewState2) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void launchInvestorProfileQuestionnaire(String productContext) {
        int i;
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        int i2 = C11223R.string.margin_investing_toolbar_title;
        int iHashCode = productContext.hashCode();
        if (iHashCode != -931256531) {
            if (iHashCode != 308375707) {
                i = (iHashCode == 584618365 && productContext.equals(QuestionnaireContexts.SUITABILITY)) ? 1 : 0;
            } else if (productContext.equals(QuestionnaireContexts.MARGIN_EXPERIENCE)) {
                i = 2;
            }
        } else if (productContext.equals(QuestionnaireContexts.MARGIN_KNOWLEDGE)) {
            i = 3;
        }
        NavigationActivityResultContract3.launch$default(this.questionnaireLauncher, new Questionnaire(false, productContext, ((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), null, null, null, false, true, true, false, false, null, null, true, true, false, false, false, new QuestionnaireProgressBarData(i2, i, 6), null, 761464, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment.Callbacks
    public void launchInvestorProfileReview() {
        RdsSegmentedProgressBar progressBar;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null && (progressBar = rhToolbar.getProgressBar()) != null) {
            progressBar.setVisibility(0);
            progressBar.setNumSegments(6);
            RdsSegmentedProgressBar.setProgress$default(progressBar, 2, 0.5f, false, 4, null);
        }
        replaceFragment(MarginUpgradeInvestorProfileReviewFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeInvestorProfileReviewFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), false, true, null, 10, null)));
    }

    @Override // com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks
    public void onInvestorProfileReviewed() {
        getBindings().rdsLoadingView.show();
        getDuxo().checkSuitability();
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onMarginEligibilityPassed() {
        getBindings().rdsLoadingView.show();
        getDuxo().fetchAndShowTieredMarginRates();
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onMarginEligibilityCanceled() {
        finish();
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onRetryMarginKnowledgeTest() {
        replaceFragment(UkMarginOnboardingQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkMarginOnboardingQuestionnaireFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), QuestionnaireContexts.MARGIN_KNOWLEDGE, true)));
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesContinue(MarginEligibilityChecklistViewState4 marginFlow) {
        RdsSegmentedProgressBar progressBar;
        Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null && (progressBar = rhToolbar.getProgressBar()) != null) {
            RdsSegmentedProgressBar.setProgress$default(progressBar, 6, 0.5f, false, 4, null);
        }
        replaceFragment(MarginUpgradeAgreementFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeAgreementFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), false, true, false, null, marginFlow, 26, null)));
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesIneligible(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new IllegalStateException("onRatesIneligible() should not be called for UK users");
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesShowInvestorProfile() {
        throw new IllegalStateException("onRatesShowInvestorProfile() should not be called for UK users");
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesDismiss() {
        finish();
    }

    @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
    public void onMarginUpgradeSuccess(Money newBuyingPower, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName) {
        Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
        Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(MarginUpgradeConfirmationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeConfirmationFragment.Args(newBuyingPower, C21137R.string.margin_upgrade_review_disclosure, displayName, false, true, null, marginFlow, 40, null)));
    }

    @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
    public void onMarginUpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(MarginUpgradeErrorFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeErrorFragment.Args(result, errorReason, false)));
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onDoneClicked() {
        finish();
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onDepositClicked(BigDecimal minAmount, BigDecimal recommendedAmount) {
        ActivityResultLauncher<Intent> activityResultLauncher = this.ukMarginDepositLauncher;
        Navigator navigator = getNavigator();
        if (minAmount == null) {
            minAmount = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = minAmount;
        Intrinsics.checkNotNull(bigDecimal);
        if (recommendedAmount == null) {
            recommendedAmount = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = recommendedAmount;
        Intrinsics.checkNotNull(bigDecimal2);
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, this, new Transfer(new TransferConfiguration.MarginDeposit(bigDecimal2, bigDecimal, MAXTransferContext.EntryPoint.MARGIN_ONBOARDING, null, 8, null)), null, false, 12, null));
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onSetBorrowingLimitClicked() {
        getBindings().rdsLoadingView.show();
        getDuxo().fetchAndShowSetMarginLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleQuestionnaireResult(QuestionnaireContract2 result) throws Throwable {
        getBindings().rdsLoadingView.show();
        if (result instanceof QuestionnaireContract2.Completed) {
            replaceFragment(ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Hero(true, true, null, 4, null), null, 2, null)));
            String productContext = ((QuestionnaireContract2.Completed) result).getProductContext();
            int iHashCode = productContext.hashCode();
            if (iHashCode == -931256531) {
                if (productContext.equals(QuestionnaireContexts.MARGIN_KNOWLEDGE)) {
                    getDuxo().checkPostKnowledgeQuestionnaire();
                    return;
                }
                return;
            } else if (iHashCode == 308375707) {
                if (productContext.equals(QuestionnaireContexts.MARGIN_EXPERIENCE)) {
                    getDuxo().checkPostExperienceQuestionnaire();
                    return;
                }
                return;
            } else {
                if (iHashCode == 584618365 && productContext.equals(QuestionnaireContexts.SUITABILITY)) {
                    getDuxo().checkSuitability();
                    return;
                }
                return;
            }
        }
        if (result instanceof QuestionnaireContract2.Canceled) {
            finish();
        } else if (result instanceof QuestionnaireContract2.Error) {
            getActivityErrorHandler().invoke2(((QuestionnaireContract2.Error) result).getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSetMarginLimitResult(SetMarginLimitActivityResult result) {
        if (result instanceof SetMarginLimitActivityResult.Complete) {
            getBindings().rdsLoadingView.show();
            popEntireFragmentBackstack();
            getDuxo().fetchNewMarginLimitAndShowConfirmation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(UkMarginOnboardingViewState2 event) {
        if (event instanceof UkMarginOnboardingViewState2.Exit) {
            finish();
        } else if (event instanceof UkMarginOnboardingViewState2.MarginUpgradeBlocked) {
            replaceFragmentWithoutAnimation(MarginUpgradeIneligibleFragment.INSTANCE.newInstance((Parcelable) ((UkMarginOnboardingViewState2.MarginUpgradeBlocked) event).getMarginUpgradeBlocked()));
        } else if (event instanceof UkMarginOnboardingViewState2.LaunchExperienceQuestionnaire) {
            replaceFragmentWithoutAnimation(UkMarginOnboardingQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkMarginOnboardingQuestionnaireFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), QuestionnaireContexts.MARGIN_EXPERIENCE, true)));
        } else if (event instanceof UkMarginOnboardingViewState2.LaunchKnowledgeQuestionnaire) {
            replaceFragmentWithoutAnimation(UkMarginOnboardingQuestionnaireFragment.INSTANCE.newInstance((Parcelable) new UkMarginOnboardingQuestionnaireFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), QuestionnaireContexts.MARGIN_KNOWLEDGE, true)));
        } else if (event instanceof UkMarginOnboardingViewState2.LaunchEligibilityChecks) {
            replaceFragmentWithoutAnimation(MarginEligibilityChecklistFragment.INSTANCE.newInstance((Parcelable) new MarginEligibilityChecklistFragment.Args(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), true)));
        } else if (event instanceof UkMarginOnboardingViewState2.LaunchTieredRates) {
            UkMarginOnboardingViewState2.LaunchTieredRates launchTieredRates = (UkMarginOnboardingViewState2.LaunchTieredRates) event;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = true;
            boolean z4 = false;
            String str = null;
            String str2 = null;
            EnableMarginInvestingKey2 enableMarginInvestingKey2 = null;
            boolean z5 = false;
            replaceFragmentWithoutAnimation(MarginUpgradeRatesFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeRatesFragment.Args(launchTieredRates.getAccountNumber(), launchTieredRates.getDisplayName(), z, z2, z3, z4, str, str2, enableMarginInvestingKey2, z5, launchTieredRates.getMarginFlow(), 1004, null)));
        } else if (event instanceof UkMarginOnboardingViewState2.LaunchSetMarginLimit) {
            NavigationActivityResultContract3.launch$default(this.setMarginLimitLauncher, new MarginLimitActivityKey(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), true, false, null, 12, null), null, false, 6, null);
        } else {
            if (!(event instanceof UkMarginOnboardingViewState2.LaunchConfirmationWithNewBuyingPower)) {
                throw new NoWhenBranchMatchedException();
            }
            UkMarginOnboardingViewState2.LaunchConfirmationWithNewBuyingPower launchConfirmationWithNewBuyingPower = (UkMarginOnboardingViewState2.LaunchConfirmationWithNewBuyingPower) event;
            replaceFragmentWithoutAnimation(MarginUpgradeConfirmationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeConfirmationFragment.Args(launchConfirmationWithNewBuyingPower.getNewBuyingPower(), C21137R.string.margin_upgrade_review_disclosure, launchConfirmationWithNewBuyingPower.getDisplayName(), false, true, null, launchConfirmationWithNewBuyingPower.getMarginFlow(), 40, null)));
        }
        getBindings().rdsLoadingView.hide();
    }

    /* compiled from: UkMarginOnboardingContinuationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingContinuationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingContinuationActivity;", "Lcom/robinhood/android/margin/contracts/UkMarginOnboardingContinuationIntentKey;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<UkMarginOnboardingContinuationActivity, UkMarginOnboardingContinuationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UkMarginOnboardingContinuationIntentKey getExtras(UkMarginOnboardingContinuationActivity ukMarginOnboardingContinuationActivity) {
            return (UkMarginOnboardingContinuationIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, ukMarginOnboardingContinuationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, UkMarginOnboardingContinuationIntentKey ukMarginOnboardingContinuationIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, ukMarginOnboardingContinuationIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, UkMarginOnboardingContinuationIntentKey ukMarginOnboardingContinuationIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, ukMarginOnboardingContinuationIntentKey);
        }
    }
}
