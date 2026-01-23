package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.ach.databinding.FragmentScheduleAutomaticDepositV2Binding;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ScheduleAutomaticDepositV2ViewState;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0003345B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020.H\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020.H\u0002J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020.H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Duxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/ach/databinding/FragmentScheduleAutomaticDepositV2Binding;", "getBinding", "()Lcom/robinhood/android/transfers/ach/databinding/FragmentScheduleAutomaticDepositV2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "bind", "state", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "bindToolbarTitle", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState$Loaded;", "bindTitle", "bindRadioGroup", "bindPrimaryCta", "bindSecondaryCta", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ScheduleAutomaticDepositV2Fragment extends BaseFragment implements RhDialogFragment.OnClickListener {
    private static final String ARG_FREQUENCY = "frequency_string";
    private static final String SKIP_DIALOG_TAG = "schedule-automatic-deposit-v2-skip-dialog";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ScheduleAutomaticDepositV2Fragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/ach/databinding/FragmentScheduleAutomaticDepositV2Binding;", 0)), Reflection.property1(new PropertyReference1Impl(ScheduleAutomaticDepositV2Fragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Callbacks;", "", "onScheduleAutomaticDepositFrequencySelected", "", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "onScheduleAutomaticDepositSkipped", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onScheduleAutomaticDepositFrequencySelected(ApiAutomaticDeposit.Frequency frequency);

        void onScheduleAutomaticDepositSkipped();
    }

    public ScheduleAutomaticDepositV2Fragment() {
        super(C30082R.layout.fragment_schedule_automatic_deposit_v2);
        this.duxo = DuxosKt.duxo(this, ScheduleAutomaticDepositV2Duxo.class);
        this.binding = ViewBinding5.viewBinding(this, ScheduleAutomaticDepositV2Fragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ScheduleAutomaticDepositV2Fragment.Callbacks) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleAutomaticDepositV2Duxo getDuxo() {
        return (ScheduleAutomaticDepositV2Duxo) this.duxo.getValue();
    }

    private final FragmentScheduleAutomaticDepositV2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentScheduleAutomaticDepositV2Binding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C301651(null), 1, null);
        bindRadioGroup();
    }

    /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$onViewCreated$1", m3645f = "ScheduleAutomaticDepositV2Fragment.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$onViewCreated$1 */
    static final class C301651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301651(Continuation<? super C301651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAutomaticDepositV2Fragment.this.new C301651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ScheduleAutomaticDepositV2Fragment $tmp0;

            AnonymousClass1(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment) {
                this.$tmp0 = scheduleAutomaticDepositV2Fragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ScheduleAutomaticDepositV2Fragment.class, "bind", "bind(Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(ScheduleAutomaticDepositV2ViewState scheduleAutomaticDepositV2ViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C301651.invokeSuspend$bind(this.$tmp0, scheduleAutomaticDepositV2ViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ScheduleAutomaticDepositV2ViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ScheduleAutomaticDepositV2ViewState> stateFlow = ScheduleAutomaticDepositV2Fragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ScheduleAutomaticDepositV2Fragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment, ScheduleAutomaticDepositV2ViewState scheduleAutomaticDepositV2ViewState, Continuation continuation) {
            scheduleAutomaticDepositV2Fragment.bind(scheduleAutomaticDepositV2ViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxFragment(toolbar, OnboardingProgress.RECURRING_AUTOMATIC_DEPOSIT_SCHEDULE, null, ((Args) INSTANCE.getArgs((Fragment) this)).getIsFromRhfOnboarding());
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C301641(null), 3, null);
    }

    /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$configureToolbar$1", m3645f = "ScheduleAutomaticDepositV2Fragment.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$configureToolbar$1 */
    static final class C301641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301641(Continuation<? super C301641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScheduleAutomaticDepositV2Fragment.this.new C301641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ScheduleAutomaticDepositV2ViewState> stateFlow = ScheduleAutomaticDepositV2Fragment.this.getDuxo().getStateFlow();
                final ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment = ScheduleAutomaticDepositV2Fragment.this;
                FlowCollector<? super ScheduleAutomaticDepositV2ViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment.configureToolbar.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ScheduleAutomaticDepositV2ViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ScheduleAutomaticDepositV2ViewState scheduleAutomaticDepositV2ViewState, Continuation<? super Unit> continuation) {
                        if (scheduleAutomaticDepositV2ViewState instanceof ScheduleAutomaticDepositV2ViewState.Loaded) {
                            scheduleAutomaticDepositV2Fragment.bindToolbarTitle((ScheduleAutomaticDepositV2ViewState.Loaded) scheduleAutomaticDepositV2ViewState);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30082R.id.dialog_id_schedule_automatic_deposit_v2_skip) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION, "skip", String.valueOf(passthroughArgs != null ? (ApiAutomaticDeposit.Frequency) Bundles.getTypedSerializable(passthroughArgs, ARG_FREQUENCY) : null), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            getCallbacks().onScheduleAutomaticDepositSkipped();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ScheduleAutomaticDepositV2ViewState state) {
        if (state instanceof ScheduleAutomaticDepositV2ViewState.Loaded) {
            getBinding().rdsLoadingView.hide();
            ScheduleAutomaticDepositV2ViewState.Loaded loaded = (ScheduleAutomaticDepositV2ViewState.Loaded) state;
            bindToolbarTitle(loaded);
            bindTitle(loaded);
            bindPrimaryCta(loaded);
            bindSecondaryCta(loaded);
            return;
        }
        getBinding().rdsLoadingView.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindToolbarTitle(ScheduleAutomaticDepositV2ViewState.Loaded state) {
        if (state.getShouldCleanupOnboardingRecurringContent()) {
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null) {
                rhToolbar.setTitle(C30082R.string.schedule_automatic_deposit_v2_toolbar_title_revamp);
            }
            RhToolbar rhToolbar2 = getRhToolbar();
            CharSequence title = rhToolbar2 != null ? rhToolbar2.getTitle() : null;
            RhToolbar rhToolbar3 = getRhToolbar();
            View viewAddCustomView$default = rhToolbar3 != null ? RhToolbar.addCustomView$default(rhToolbar3, C30082R.layout.include_transfer_toolbar_centered_title, true, 0, 4, null) : null;
            Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewAddCustomView$default).setText(title);
            return;
        }
        RhToolbar rhToolbar4 = getRhToolbar();
        if (rhToolbar4 != null) {
            rhToolbar4.setTitle(C30082R.string.schedule_automatic_deposit_v2_toolbar_title);
        }
    }

    private final void bindTitle(ScheduleAutomaticDepositV2ViewState.Loaded state) {
        if (state.getShouldCleanupOnboardingRecurringContent()) {
            getBinding().scheduleAutomaticDepositTitle.setGravity(17);
            getBinding().scheduleAutomaticDepositSubtitle.setGravity(17);
            getBinding().scheduleAutomaticDepositV2Description.setGravity(17);
        }
    }

    private final void bindRadioGroup() {
        getBinding().scheduleAutomaticDepositRadioGroup.onCheckedChanged(new Function2() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ScheduleAutomaticDepositV2Fragment.bindRadioGroup$lambda$1(this.f$0, (LegacyRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRadioGroup$lambda$1(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment, LegacyRdsRadioGroup onCheckedChanged, int i) {
        ApiAutomaticDeposit.Frequency frequency;
        Intrinsics.checkNotNullParameter(onCheckedChanged, "$this$onCheckedChanged");
        if (i == C30082R.id.automatic_deposit_frequency_weekly_row) {
            frequency = ApiAutomaticDeposit.Frequency.WEEKLY;
        } else if (i == C30082R.id.automatic_deposit_frequency_biweekly_row) {
            frequency = ApiAutomaticDeposit.Frequency.BIWEEKLY;
        } else if (i == C30082R.id.automatic_deposit_frequency_monthly_row) {
            frequency = ApiAutomaticDeposit.Frequency.MONTHLY;
        } else {
            if (i != C30082R.id.automatic_deposit_frequency_quarterly_row) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(i));
                throw new ExceptionsH();
            }
            frequency = ApiAutomaticDeposit.Frequency.QUARTERLY;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(scheduleAutomaticDepositV2Fragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION, AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, frequency.toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        scheduleAutomaticDepositV2Fragment.getDuxo().setSelectedFrequency(frequency);
        return Unit.INSTANCE;
    }

    private final void bindPrimaryCta(final ScheduleAutomaticDepositV2ViewState.Loaded state) {
        RdsButton rdsButton = getBinding().scheduleAutomaticDepositV2PrimaryCta;
        if (state.getShouldCleanupOnboardingRecurringContent()) {
            rdsButton.setText(getString(C11048R.string.general_label_continue));
        }
        rdsButton.setEnabled(state.getEnablePrimaryCta());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScheduleAutomaticDepositV2Fragment.bindPrimaryCta$lambda$3$lambda$2(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindPrimaryCta$lambda$3$lambda$2(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment, ScheduleAutomaticDepositV2ViewState.Loaded loaded) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(scheduleAutomaticDepositV2Fragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTED, "", String.valueOf(loaded.getSelectedFrequency()), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(scheduleAutomaticDepositV2Fragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION, "schedule", String.valueOf(loaded.getSelectedFrequency()), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        Callbacks callbacks = scheduleAutomaticDepositV2Fragment.getCallbacks();
        ApiAutomaticDeposit.Frequency selectedFrequency = loaded.getSelectedFrequency();
        if (selectedFrequency == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        callbacks.onScheduleAutomaticDepositFrequencySelected(selectedFrequency);
        return Unit.INSTANCE;
    }

    private final void bindSecondaryCta(final ScheduleAutomaticDepositV2ViewState.Loaded state) {
        RdsButton scheduleAutomaticDepositV2SecondaryCta = getBinding().scheduleAutomaticDepositV2SecondaryCta;
        Intrinsics.checkNotNullExpressionValue(scheduleAutomaticDepositV2SecondaryCta, "scheduleAutomaticDepositV2SecondaryCta");
        OnClickListeners.onClick(scheduleAutomaticDepositV2SecondaryCta, new Function0() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ScheduleAutomaticDepositV2Fragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScheduleAutomaticDepositV2Fragment.bindSecondaryCta$lambda$5(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSecondaryCta$lambda$5(ScheduleAutomaticDepositV2ViewState.Loaded loaded, ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment) {
        if (loaded.getSelectedFrequency() == null) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(scheduleAutomaticDepositV2Fragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION, "skip", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            scheduleAutomaticDepositV2Fragment.getCallbacks().onScheduleAutomaticDepositSkipped();
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable(ARG_FREQUENCY, loaded.getSelectedFrequency());
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = scheduleAutomaticDepositV2Fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder passthroughArgs = companion.create(contextRequireContext).setId(C30082R.id.dialog_id_schedule_automatic_deposit_v2_skip).setTitle(C30082R.string.schedule_automatic_deposit_v2_skip_dialog_title, new Object[0]).setMessage(C30082R.string.schedule_automatic_deposit_v2_skip_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_skip, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setUseDesignSystemOverlay(true).setPassthroughArgs(bundle);
            FragmentManager childFragmentManager = scheduleAutomaticDepositV2Fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, childFragmentManager, SKIP_DIALOG_TAG, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Args;", "Landroid/os/Parcelable;", "isFromRhfOnboarding", "", "<init>", "(Z)V", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isFromRhfOnboarding;

        /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isFromRhfOnboarding ? 1 : 0);
        }

        public Args(boolean z) {
            this.isFromRhfOnboarding = z;
        }

        /* renamed from: isFromRhfOnboarding, reason: from getter */
        public final boolean getIsFromRhfOnboarding() {
            return this.isFromRhfOnboarding;
        }
    }

    /* compiled from: ScheduleAutomaticDepositV2Fragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2Fragment$Args;", "<init>", "()V", "SKIP_DIALOG_TAG", "", "ARG_FREQUENCY", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ScheduleAutomaticDepositV2Fragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, scheduleAutomaticDepositV2Fragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ScheduleAutomaticDepositV2Fragment newInstance(Args args) {
            return (ScheduleAutomaticDepositV2Fragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ScheduleAutomaticDepositV2Fragment scheduleAutomaticDepositV2Fragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, scheduleAutomaticDepositV2Fragment, args);
        }
    }
}
