package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferConfirmationBinding;
import com.robinhood.android.transfers.ach.p265ui.RecurringDepositToolBarExtension;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationEvent;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferConfirmationViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.util.Money;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AchTransferConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u0001:\u0003@ABB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020$H\u0016J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0002J\u001a\u00107\u001a\u00020.2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010;\u001a\u00020.2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020$H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b \u0010!R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "refreshUi", "state", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;", "presentSurveyIfNeeded", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "processAction", "action", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState$Action;", "onViewTransfer", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AchTransferConfirmationFragment extends BaseFragment {
    public AnalyticsLogger analytics;
    private UnifiedBalances balances;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchTransferConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AchTransferConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "showInstantDepositPage", "", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void showInstantDepositPage(AchTransfer achTransfer);
    }

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AchTransferConfirmationViewState.Action.values().length];
            try {
                iArr[AchTransferConfirmationViewState.Action.SHOW_INSTANT_DEPOSIT_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AchTransferConfirmationViewState.Action.ON_VIEW_TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AchTransferConfirmationViewState.Action.FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AchTransferConfirmationFragment() {
        super(C30082R.layout.fragment_ach_transfer_confirmation);
        this.binding = ViewBinding5.viewBinding(this, AchTransferConfirmationFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AchTransferConfirmationDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AchTransferConfirmationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final FragmentAchTransferConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAchTransferConfirmationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AchTransferConfirmationDuxo getDuxo() {
        return (AchTransferConfirmationDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().detailText.setMovementMethod(LinkMovementMethod.getInstance());
        BaseFragment.collectDuxoState$default(this, null, new C301761(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C301772(null), 1, null);
    }

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1", m3645f = "AchTransferConfirmationFragment.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1 */
    static final class C301761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301761(Continuation<? super C301761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AchTransferConfirmationFragment.this.new C301761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.onStart(AchTransferConfirmationFragment.this.getDuxo().getStateFlow(), new AnonymousClass1(null)), new AnonymousClass2(null));
                final AchTransferConfirmationFragment achTransferConfirmationFragment = AchTransferConfirmationFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment.onViewCreated.1.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AchTransferConfirmationViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AchTransferConfirmationViewState achTransferConfirmationViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                        achTransferConfirmationFragment.refreshUi(achTransferConfirmationViewState);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowOnCompletion.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AchTransferConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1$1", m3645f = "AchTransferConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FlowCollector<? super AchTransferConfirmationViewState>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super AchTransferConfirmationViewState> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.ACH_TRANSFER_CONFIRMATION, true);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AchTransferConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1$2", m3645f = "AchTransferConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super AchTransferConfirmationViewState>, Throwable, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super AchTransferConfirmationViewState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.setBusy(IdlingResourceType.ACH_TRANSFER_CONFIRMATION, false);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$2", m3645f = "AchTransferConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$2 */
    static final class C301772 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C301772(Continuation<? super C301772> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C301772 c301772 = AchTransferConfirmationFragment.this.new C301772(continuation);
            c301772.L$0 = obj;
            return c301772;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301772) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AchTransferConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$2$1", m3645f = "AchTransferConfirmationFragment.kt", m3646l = {95}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AchTransferConfirmationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AchTransferConfirmationFragment achTransferConfirmationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = achTransferConfirmationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final AchTransferConfirmationFragment achTransferConfirmationFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment.onViewCreated.2.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<AchTransferConfirmationEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<AchTransferConfirmationEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<AchTransferConfirmationEvent> eventConsumerInvoke;
                            final AchTransferConfirmationFragment achTransferConfirmationFragment2 = achTransferConfirmationFragment;
                            if ((event.getData() instanceof AchTransferConfirmationEvent.LaunchNgGoldEarningsBottomSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$onViewCreated$2$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19592invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19592invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        Navigator.DefaultImpls.createDialogFragment$default(achTransferConfirmationFragment2.getNavigator(), ((AchTransferConfirmationEvent.LaunchNgGoldEarningsBottomSheet) event.getData()).getKey(), null, 2, null).show(achTransferConfirmationFragment2.getChildFragmentManager(), "accountSelectionDialog");
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AchTransferConfirmationFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.WITHDRAW_FUNDS);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        Companion companion = INSTANCE;
        if (!((Args) companion.getArgs((Fragment) this)).isQueuedDeposit()) {
            ToolbarExt2.configureMaxFragment(toolbar, OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_DONE, null, getCallbacks().isFromRhfOnboarding());
        }
        if (((Args) companion.getArgs((Fragment) this)).isFromOnboardingRadExp() && ((Args) companion.getArgs((Fragment) this)).getShouldCleanupOnboardingRecurringContent() && (rhToolbar = getRhToolbar()) != null) {
            RecurringDepositToolBarExtension.setRecurringDepositToolBar(rhToolbar);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        IavSource iavSource = ((Args) INSTANCE.getArgs((Fragment) this)).getIavSource();
        if (iavSource == null || !iavSource.isFromOnboarding()) {
            return null;
        }
        return "sign_up";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi(final AchTransferConfirmationViewState state) throws Resources.NotFoundException {
        LottieUrl lottieUrl;
        if (!state.getIsInputValid()) {
            throw new IllegalStateException("Check failed.");
        }
        presentSurveyIfNeeded(state);
        this.balances = state.getBalances$feature_legacy_ach_transfers_externalDebug();
        final AchTransferConfirmationViewState.Button doneButton = state.getDoneButton();
        RdsButton rdsButton = getBinding().doneButton;
        StringResource text = doneButton.getText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsButton.setText(text.getText(resources));
        RdsButton doneButton2 = getBinding().doneButton;
        Intrinsics.checkNotNullExpressionValue(doneButton2, "doneButton");
        OnClickListeners.onClick(doneButton2, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchTransferConfirmationFragment.refreshUi$lambda$0(this.f$0, doneButton);
            }
        });
        final AchTransferConfirmationViewState.Button detailButton = state.getDetailButton();
        if (detailButton != null) {
            RdsButton detailButton2 = getBinding().detailButton;
            Intrinsics.checkNotNullExpressionValue(detailButton2, "detailButton");
            detailButton2.setVisibility(0);
            RdsButton rdsButton2 = getBinding().detailButton;
            StringResource text2 = detailButton.getText();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rdsButton2.setText(text2.getText(resources2));
            RdsButton detailButton3 = getBinding().detailButton;
            Intrinsics.checkNotNullExpressionValue(detailButton3, "detailButton");
            OnClickListeners.onClick(detailButton3, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferConfirmationFragment.refreshUi$lambda$2$lambda$1(this.f$0, detailButton);
                }
            });
        } else {
            RdsButton detailButton4 = getBinding().detailButton;
            Intrinsics.checkNotNullExpressionValue(detailButton4, "detailButton");
            detailButton4.setVisibility(8);
        }
        getBinding().titleText.setText(getString(state.getTitleText()));
        Companion companion = INSTANCE;
        boolean z = ((Args) companion.getArgs((Fragment) this)).getTheme() != ColorTheme.DEFAULT;
        getBinding().confirmationCheckmarkImage.setVisibility((((Args) companion.getArgs((Fragment) this)).isFromOnboardingRadExp() && ((Args) companion.getArgs((Fragment) this)).getShouldCleanupOnboardingRecurringContent() && !z) ? 0 : 8);
        if (z && !((Args) companion.getArgs((Fragment) this)).isQueuedDeposit()) {
            LottieAnimationView confirmationAnimationView = getBinding().confirmationAnimationView;
            Intrinsics.checkNotNullExpressionValue(confirmationAnimationView, "confirmationAnimationView");
            if (DayNightChanges.isDay(getScarletManager())) {
                lottieUrl = LottieUrl.BRAND_REFRESH_RECURRING_DEPOSIT_LIGHT;
            } else {
                lottieUrl = LottieUrl.BRAND_REFRESH_RECURRING_DEPOSIT_DARK;
            }
            LottieAnimationViewsKt.setRemoteUrl(confirmationAnimationView, lottieUrl);
            getBinding().confirmationAnimationView.setVisibility(0);
        }
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        CharSequence detailText = state.getDetailText(resources3);
        RhTextView detailText2 = getBinding().detailText;
        Intrinsics.checkNotNullExpressionValue(detailText2, "detailText");
        if (state.getMessageDialog() != null && detailText != null) {
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            detailText = LearnMoresKt.buildTextWithLearnMore$default(resources4, detailText, false, null, false, getString(C11048R.string.general_action_learn_more_capitalized), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$refreshUi$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RhDialogFragment.Companion companion2 = RhDialogFragment.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    RhDialogFragment.Builder builderCreate = companion2.create(fragmentActivityRequireActivity);
                    StringResource title = state.getMessageDialog().getTitle();
                    Resources resources5 = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                    RhDialogFragment.Builder title2 = builderCreate.setTitle(title.getText(resources5));
                    StringResource message = state.getMessageDialog().getMessage();
                    Resources resources6 = this.this$0.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                    RhDialogFragment.Builder message2 = title2.setMessage(message.getText(resources6));
                    if (state.getMessageDialog().getNegativeButton() != null) {
                        RhDialogFragment.Builder id = message2.setId(state.getMessageDialog().getNegativeButton().getId());
                        StringResource text3 = state.getMessageDialog().getNegativeButton().getText();
                        Resources resources7 = this.this$0.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
                        id.setNegativeButton(text3.getText(resources7));
                    }
                    FragmentManager supportFragmentManager = this.this$0.requireActivity().getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(message2, supportFragmentManager, state.getMessageDialog().getTag(), false, 4, null);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
        TextViewsKt.setVisibilityText(detailText2, detailText);
        CharSequence charSequence = "";
        if (((Args) companion.getArgs((Fragment) this)).getAmountMoney() != null) {
            if (((Args) companion.getArgs((Fragment) this)).getAccount() != null) {
                RhTextView rhTextView = getBinding().amountTxt;
                StringResource amountText = state.getAmountText();
                if (amountText != null) {
                    Resources resources5 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                    CharSequence text3 = amountText.getText(resources5);
                    if (text3 == null) {
                        text3 = "";
                    }
                    rhTextView.setText(text3);
                    RhTextView rhTextView2 = getBinding().accountNameTxt;
                    StringResource accountNameText = state.getAccountNameText();
                    if (accountNameText != null) {
                        Resources resources6 = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
                        CharSequence text4 = accountNameText.getText(resources6);
                        if (text4 == null) {
                            text4 = "";
                        }
                        rhTextView2.setText(text4);
                        StringResource currentBalanceText = state.getCurrentBalanceText();
                        if (currentBalanceText != null) {
                            Resources resources7 = getResources();
                            Intrinsics.checkNotNullExpressionValue(resources7, "getResources(...)");
                            CharSequence text5 = currentBalanceText.getText(resources7);
                            if (text5 != null) {
                                getBinding().currentBalanceTxt.setText(text5);
                                getBinding().currentBalanceTxt.setVisibility(0);
                            }
                        }
                    }
                }
            }
            RhTextView rhTextView3 = getBinding().disclaimerText;
            StringResource disclaimerConfirmationText = state.getDisclaimerConfirmationText();
            if (disclaimerConfirmationText != null) {
                Resources resources8 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources8, "getResources(...)");
                CharSequence text6 = disclaimerConfirmationText.getText(resources8);
                if (text6 != null) {
                    charSequence = text6;
                }
            }
            rhTextView3.setText(charSequence);
        } else {
            if (((Args) companion.getArgs((Fragment) this)).isFromOnboardingRadExp() && ((Args) companion.getArgs((Fragment) this)).getShouldCleanupOnboardingRecurringContent()) {
                RhTextView rhTextView4 = getBinding().disclaimerText;
                StringResource disclaimerConfirmationText2 = state.getDisclaimerConfirmationText();
                if (disclaimerConfirmationText2 != null) {
                    Resources resources9 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources9, "getResources(...)");
                    CharSequence text7 = disclaimerConfirmationText2.getText(resources9);
                    if (text7 != null) {
                        charSequence = text7;
                    }
                }
                rhTextView4.setText(charSequence);
            }
            getBinding().accountInfo.setVisibility(8);
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.ACH_TRANSFER_CONFIRMATION, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$0(AchTransferConfirmationFragment achTransferConfirmationFragment, AchTransferConfirmationViewState.Button button) {
        achTransferConfirmationFragment.processAction(button.getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$2$lambda$1(AchTransferConfirmationFragment achTransferConfirmationFragment, AchTransferConfirmationViewState.Button button) {
        achTransferConfirmationFragment.processAction(button.getAction());
        return Unit.INSTANCE;
    }

    private final void presentSurveyIfNeeded(AchTransferConfirmationViewState state) {
        BigDecimal decimalValue;
        Money amount;
        if (this.balances != null || state.getBalances$feature_legacy_ach_transfers_externalDebug() == null) {
            return;
        }
        AchTransfer achTransfer = ((Args) INSTANCE.getArgs((Fragment) this)).getAchTransfer();
        if (achTransfer == null || (amount = achTransfer.getAmount()) == null || (decimalValue = amount.getDecimalValue()) == null) {
            decimalValue = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalSubtract = state.getBalances$feature_legacy_ach_transfers_externalDebug().getUsdEquity().getDecimalValue().subtract(state.getBalances$feature_legacy_ach_transfers_externalDebug().getGoldUsed());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (Intrinsics.areEqual(bigDecimalSubtract, decimalValue)) {
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.WITHDRAW_FUNDS_CHURN_100);
        }
        if (bigDecimalSubtract.multiply(new BigDecimal("0.9")).compareTo(decimalValue) < 0) {
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.WITHDRAW_FUNDS_CHURN_90);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_ach_transfer_instant_deposits_with_reversal) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_ach_transfer_instant_deposits_with_reversal) {
            UnifiedBalances unifiedBalances = this.balances;
            Intrinsics.checkNotNull(unifiedBalances);
            UUID reversal = unifiedBalances.getBrokerageBalances().getAccount().getInstantEligibility().getReversal();
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            LegacyDetailFragmentKey.Companion companion = LegacyDetailFragmentKey.INSTANCE;
            DetailType detailType = DetailType.ACH_TRANSFER;
            Intrinsics.checkNotNull(reversal);
            Navigator.DefaultImpls.showFragment$default(navigator, fragmentActivityRequireActivity, LegacyDetailFragmentKey.Companion.from$default(companion, detailType, reversal, null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void processAction(AchTransferConfirmationViewState.Action action) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            Callbacks callbacks = getCallbacks();
            AchTransfer achTransfer = ((Args) INSTANCE.getArgs((Fragment) this)).getAchTransfer();
            Intrinsics.checkNotNull(achTransfer);
            callbacks.showInstantDepositPage(achTransfer);
            return;
        }
        if (i == 2) {
            onViewTransfer();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
        }
    }

    private final void onViewTransfer() {
        AchTransfer achTransfer = ((Args) INSTANCE.getArgs((Fragment) this)).getAchTransfer();
        if (achTransfer != null) {
            Navigator navigator = getNavigator();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, fragmentActivityRequireActivity, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACH_TRANSFER, achTransfer.getId(), null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            requireActivity().finish();
        }
    }

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\u0085\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000205HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Args;", "Landroid/os/Parcelable;", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "isQueuedDeposit", "", "maxEarlyAccessAmount", "Ljava/math/BigDecimal;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "isFromOnboardingRadExp", "amountMoney", "Lcom/robinhood/models/util/Money;", "account", "Lcom/robinhood/models/api/IavAccount;", "shouldCleanupOnboardingRecurringContent", "unclearedDeposits", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AutomaticDeposit;ZLjava/math/BigDecimal;Lcom/robinhood/shared/transfers/contracts/context/IavSource;ZLcom/robinhood/models/util/Money;Lcom/robinhood/models/api/IavAccount;ZLjava/math/BigDecimal;Lcom/robinhood/models/api/ColorTheme;)V", "getAchTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "getAutomaticDeposit", "()Lcom/robinhood/models/db/AutomaticDeposit;", "()Z", "getMaxEarlyAccessAmount", "()Ljava/math/BigDecimal;", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getAmountMoney", "()Lcom/robinhood/models/util/Money;", "getAccount", "()Lcom/robinhood/models/api/IavAccount;", "getShouldCleanupOnboardingRecurringContent", "getUnclearedDeposits", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final IavAccount account;
        private final AchTransfer achTransfer;
        private final Money amountMoney;
        private final AutomaticDeposit automaticDeposit;
        private final IavSource iavSource;
        private final boolean isFromOnboardingRadExp;
        private final boolean isQueuedDeposit;
        private final BigDecimal maxEarlyAccessAmount;
        private final boolean shouldCleanupOnboardingRecurringContent;
        private final ColorTheme theme;
        private final BigDecimal unclearedDeposits;

        /* compiled from: AchTransferConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                BigDecimal bigDecimal;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AchTransfer achTransfer = (AchTransfer) parcel.readParcelable(Args.class.getClassLoader());
                AutomaticDeposit automaticDeposit = (AutomaticDeposit) parcel.readParcelable(Args.class.getClassLoader());
                boolean z3 = parcel.readInt() != 0;
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                IavSource iavSourceValueOf = parcel.readInt() == 0 ? null : IavSource.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z = false;
                    bigDecimal = bigDecimal2;
                    z2 = true;
                } else {
                    z = false;
                    bigDecimal = bigDecimal2;
                    z2 = false;
                }
                return new Args(achTransfer, automaticDeposit, z3, bigDecimal, iavSourceValueOf, z2, (Money) parcel.readParcelable(Args.class.getClassLoader()), (IavAccount) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? z : true, (BigDecimal) parcel.readSerializable(), ColorTheme.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AchTransfer achTransfer, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, IavSource iavSource, boolean z2, Money money, IavAccount iavAccount, boolean z3, BigDecimal bigDecimal2, ColorTheme colorTheme, int i, Object obj) {
            if ((i & 1) != 0) {
                achTransfer = args.achTransfer;
            }
            if ((i & 2) != 0) {
                automaticDeposit = args.automaticDeposit;
            }
            if ((i & 4) != 0) {
                z = args.isQueuedDeposit;
            }
            if ((i & 8) != 0) {
                bigDecimal = args.maxEarlyAccessAmount;
            }
            if ((i & 16) != 0) {
                iavSource = args.iavSource;
            }
            if ((i & 32) != 0) {
                z2 = args.isFromOnboardingRadExp;
            }
            if ((i & 64) != 0) {
                money = args.amountMoney;
            }
            if ((i & 128) != 0) {
                iavAccount = args.account;
            }
            if ((i & 256) != 0) {
                z3 = args.shouldCleanupOnboardingRecurringContent;
            }
            if ((i & 512) != 0) {
                bigDecimal2 = args.unclearedDeposits;
            }
            if ((i & 1024) != 0) {
                colorTheme = args.theme;
            }
            BigDecimal bigDecimal3 = bigDecimal2;
            ColorTheme colorTheme2 = colorTheme;
            IavAccount iavAccount2 = iavAccount;
            boolean z4 = z3;
            boolean z5 = z2;
            Money money2 = money;
            IavSource iavSource2 = iavSource;
            boolean z6 = z;
            return args.copy(achTransfer, automaticDeposit, z6, bigDecimal, iavSource2, z5, money2, iavAccount2, z4, bigDecimal3, colorTheme2);
        }

        /* renamed from: component1, reason: from getter */
        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        /* renamed from: component10, reason: from getter */
        public final BigDecimal getUnclearedDeposits() {
            return this.unclearedDeposits;
        }

        /* renamed from: component11, reason: from getter */
        public final ColorTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component2, reason: from getter */
        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsQueuedDeposit() {
            return this.isQueuedDeposit;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getMaxEarlyAccessAmount() {
            return this.maxEarlyAccessAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final IavSource getIavSource() {
            return this.iavSource;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFromOnboardingRadExp() {
            return this.isFromOnboardingRadExp;
        }

        /* renamed from: component7, reason: from getter */
        public final Money getAmountMoney() {
            return this.amountMoney;
        }

        /* renamed from: component8, reason: from getter */
        public final IavAccount getAccount() {
            return this.account;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShouldCleanupOnboardingRecurringContent() {
            return this.shouldCleanupOnboardingRecurringContent;
        }

        public final Args copy(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, boolean isQueuedDeposit, BigDecimal maxEarlyAccessAmount, IavSource iavSource, boolean isFromOnboardingRadExp, Money amountMoney, IavAccount account, boolean shouldCleanupOnboardingRecurringContent, BigDecimal unclearedDeposits, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new Args(achTransfer, automaticDeposit, isQueuedDeposit, maxEarlyAccessAmount, iavSource, isFromOnboardingRadExp, amountMoney, account, shouldCleanupOnboardingRecurringContent, unclearedDeposits, theme);
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
            return Intrinsics.areEqual(this.achTransfer, args.achTransfer) && Intrinsics.areEqual(this.automaticDeposit, args.automaticDeposit) && this.isQueuedDeposit == args.isQueuedDeposit && Intrinsics.areEqual(this.maxEarlyAccessAmount, args.maxEarlyAccessAmount) && this.iavSource == args.iavSource && this.isFromOnboardingRadExp == args.isFromOnboardingRadExp && Intrinsics.areEqual(this.amountMoney, args.amountMoney) && Intrinsics.areEqual(this.account, args.account) && this.shouldCleanupOnboardingRecurringContent == args.shouldCleanupOnboardingRecurringContent && Intrinsics.areEqual(this.unclearedDeposits, args.unclearedDeposits) && this.theme == args.theme;
        }

        public int hashCode() {
            AchTransfer achTransfer = this.achTransfer;
            int iHashCode = (achTransfer == null ? 0 : achTransfer.hashCode()) * 31;
            AutomaticDeposit automaticDeposit = this.automaticDeposit;
            int iHashCode2 = (((iHashCode + (automaticDeposit == null ? 0 : automaticDeposit.hashCode())) * 31) + Boolean.hashCode(this.isQueuedDeposit)) * 31;
            BigDecimal bigDecimal = this.maxEarlyAccessAmount;
            int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            IavSource iavSource = this.iavSource;
            int iHashCode4 = (((iHashCode3 + (iavSource == null ? 0 : iavSource.hashCode())) * 31) + Boolean.hashCode(this.isFromOnboardingRadExp)) * 31;
            Money money = this.amountMoney;
            int iHashCode5 = (iHashCode4 + (money == null ? 0 : money.hashCode())) * 31;
            IavAccount iavAccount = this.account;
            int iHashCode6 = (((iHashCode5 + (iavAccount == null ? 0 : iavAccount.hashCode())) * 31) + Boolean.hashCode(this.shouldCleanupOnboardingRecurringContent)) * 31;
            BigDecimal bigDecimal2 = this.unclearedDeposits;
            return ((iHashCode6 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + this.theme.hashCode();
        }

        public String toString() {
            return "Args(achTransfer=" + this.achTransfer + ", automaticDeposit=" + this.automaticDeposit + ", isQueuedDeposit=" + this.isQueuedDeposit + ", maxEarlyAccessAmount=" + this.maxEarlyAccessAmount + ", iavSource=" + this.iavSource + ", isFromOnboardingRadExp=" + this.isFromOnboardingRadExp + ", amountMoney=" + this.amountMoney + ", account=" + this.account + ", shouldCleanupOnboardingRecurringContent=" + this.shouldCleanupOnboardingRecurringContent + ", unclearedDeposits=" + this.unclearedDeposits + ", theme=" + this.theme + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.achTransfer, flags);
            dest.writeParcelable(this.automaticDeposit, flags);
            dest.writeInt(this.isQueuedDeposit ? 1 : 0);
            dest.writeSerializable(this.maxEarlyAccessAmount);
            IavSource iavSource = this.iavSource;
            if (iavSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iavSource.name());
            }
            dest.writeInt(this.isFromOnboardingRadExp ? 1 : 0);
            dest.writeParcelable(this.amountMoney, flags);
            dest.writeParcelable(this.account, flags);
            dest.writeInt(this.shouldCleanupOnboardingRecurringContent ? 1 : 0);
            dest.writeSerializable(this.unclearedDeposits);
            dest.writeString(this.theme.name());
        }

        public Args(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, IavSource iavSource, boolean z2, Money money, IavAccount iavAccount, boolean z3, BigDecimal bigDecimal2, ColorTheme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.achTransfer = achTransfer;
            this.automaticDeposit = automaticDeposit;
            this.isQueuedDeposit = z;
            this.maxEarlyAccessAmount = bigDecimal;
            this.iavSource = iavSource;
            this.isFromOnboardingRadExp = z2;
            this.amountMoney = money;
            this.account = iavAccount;
            this.shouldCleanupOnboardingRecurringContent = z3;
            this.unclearedDeposits = bigDecimal2;
            this.theme = theme;
        }

        public /* synthetic */ Args(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, boolean z, BigDecimal bigDecimal, IavSource iavSource, boolean z2, Money money, IavAccount iavAccount, boolean z3, BigDecimal bigDecimal2, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(achTransfer, automaticDeposit, z, bigDecimal, iavSource, (i & 32) != 0 ? false : z2, money, iavAccount, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : bigDecimal2, colorTheme);
        }

        public final AchTransfer getAchTransfer() {
            return this.achTransfer;
        }

        public final AutomaticDeposit getAutomaticDeposit() {
            return this.automaticDeposit;
        }

        public final boolean isQueuedDeposit() {
            return this.isQueuedDeposit;
        }

        public final BigDecimal getMaxEarlyAccessAmount() {
            return this.maxEarlyAccessAmount;
        }

        public final IavSource getIavSource() {
            return this.iavSource;
        }

        public final boolean isFromOnboardingRadExp() {
            return this.isFromOnboardingRadExp;
        }

        public final Money getAmountMoney() {
            return this.amountMoney;
        }

        public final IavAccount getAccount() {
            return this.account;
        }

        public final boolean getShouldCleanupOnboardingRecurringContent() {
            return this.shouldCleanupOnboardingRecurringContent;
        }

        public final BigDecimal getUnclearedDeposits() {
            return this.unclearedDeposits;
        }

        public final ColorTheme getTheme() {
            return this.theme;
        }
    }

    /* compiled from: AchTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchTransferConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AchTransferConfirmationFragment achTransferConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achTransferConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchTransferConfirmationFragment newInstance(Args args) {
            return (AchTransferConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchTransferConfirmationFragment achTransferConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achTransferConfirmationFragment, args);
        }
    }
}
