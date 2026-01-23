package com.robinhood.android.earlypay.enrollment.p110ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.earlypay.databinding.FragmentEarlyPayEnrollmentBinding;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentAdapterContainer;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentFragment;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EarlyPayEnrollmentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003HIJB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000202H\u0016J\b\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016J\u0010\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0002J\t\u0010B\u001a\u00020>H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b.\u0010/R\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "binding", "Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayEnrollmentBinding;", "getBinding", "()Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayEnrollmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "loadingView", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "loadingView$delegate", "buttonContainer", "getButtonContainer", "buttonContainer$delegate", "duxo", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDuxo;", "getDuxo", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Callbacks;", "callbacks$delegate", "adapterContainer", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentAdapterContainer;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDestroyView", "onResume", "onDisclosureClicked", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent$Disclosure;", "earlyPayHeaderInViewFlow", "Lkotlinx/coroutines/flow/Flow;", "", "refreshUi", "state", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentFragment extends BaseFragment implements RegionGated, EarlyPayEnrollmentAdapterContainer.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final EarlyPayEnrollmentAdapterContainer adapterContainer;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: buttonContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 buttonContainer;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentFragment.class, "binding", "getBinding()Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayEnrollmentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentFragment.class, "loadingView", "getLoadingView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentFragment.class, "buttonContainer", "getButtonContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Callbacks;", "", "onEnrollmentSuccess", "", "onEnrollmentSkipped", "takeUserIntoDirectDeposits", "onAlreadySetupDirectDeposits", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAlreadySetupDirectDeposits();

        void onEnrollmentSkipped();

        void onEnrollmentSuccess();

        void takeUserIntoDirectDeposits();
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EarlyPayEnrollmentViewState.SecondaryButtonState.values().length];
            try {
                iArr[EarlyPayEnrollmentViewState.SecondaryButtonState.ALREADY_SET_UP_RHY_DD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EarlyPayEnrollmentViewState.SecondaryButtonState.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EarlyPayEnrollmentFragment() {
        super(C14433R.layout.fragment_early_pay_enrollment);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, EarlyPayEnrollmentFragment2.INSTANCE);
        this.recyclerView = bindView(C14433R.id.early_pay_enrollment_recycler_view);
        this.loadingView = bindView(C14433R.id.early_pay_enrollment_loading_view);
        this.buttonContainer = bindView(C14433R.id.early_pay_enrollment_button_container);
        this.duxo = OldDuxos.oldDuxo(this, EarlyPayEnrollmentDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof EarlyPayEnrollmentFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapterContainer = new EarlyPayEnrollmentAdapterContainer(this);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarlyPayEnrollmentFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
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

    private final FragmentEarlyPayEnrollmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEarlyPayEnrollmentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[1]);
    }

    private final View getLoadingView() {
        return (View) this.loadingView.getValue(this, $$delegatedProperties[2]);
    }

    private final View getButtonContainer() {
        return (View) this.buttonContainer.getValue(this, $$delegatedProperties[3]);
    }

    private final EarlyPayEnrollmentDuxo getDuxo() {
        return (EarlyPayEnrollmentDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[4]);
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment) {
        RhToolbar rhToolbar = earlyPayEnrollmentFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, earlyPayEnrollmentFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 48, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout earlyPayEnrollmentButtonContainer = getBinding().earlyPayEnrollmentButtonContainer;
        Intrinsics.checkNotNullExpressionValue(earlyPayEnrollmentButtonContainer, "earlyPayEnrollmentButtonContainer");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(earlyPayEnrollmentButtonContainer, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ToolbarScrollAnimator.subscribe$default(getToolbarScrollAnimator(), getRecyclerView(), this, null, 4, null);
        getRecyclerView().setItemAnimator(new DefaultItemAnimator() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.onViewCreated.1
            @Override // androidx.recyclerview.widget.SimpleItemAnimator
            public void onChangeFinished(RecyclerView.ViewHolder item, boolean oldItem) {
                View view2;
                if (item == null || (view2 = item.itemView) == null) {
                    return;
                }
                if (!(view2 instanceof FaqRowView) || oldItem) {
                    view2 = null;
                }
                if (view2 != null && EarlyPayEnrollmentFragment.this.getRecyclerView().getBottom() < view2.getBottom()) {
                    EarlyPayEnrollmentFragment.this.getRecyclerView().smoothScrollBy(0, view2.getBottom() - EarlyPayEnrollmentFragment.this.getRecyclerView().getBottom());
                }
            }
        });
        getLifecycleScope().launchWhenStarted(new C144462(null));
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$onViewCreated$2", m3645f = "EarlyPayEnrollmentFragment.kt", m3646l = {98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$onViewCreated$2 */
    static final class C144462 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C144462(Continuation<? super C144462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EarlyPayEnrollmentFragment.this.new C144462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C144462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(EarlyPayEnrollmentFragment.this.earlyPayHeaderInViewFlow());
                final EarlyPayEnrollmentFragment earlyPayEnrollmentFragment = EarlyPayEnrollmentFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                        int themeColor;
                        RhToolbar rhToolbar = earlyPayEnrollmentFragment.getRhToolbar();
                        if (rhToolbar != null) {
                            EarlyPayEnrollmentFragment earlyPayEnrollmentFragment2 = earlyPayEnrollmentFragment;
                            if (z) {
                                themeColor = 0;
                            } else {
                                Context contextRequireContext = earlyPayEnrollmentFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackground1);
                            }
                            rhToolbar.setBackgroundColor(themeColor);
                            rhToolbar.setBackgroundAlpha(z ? 0.0f : 1.0f);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144441(this));
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$onStart$1 */
    /* synthetic */ class C144441 extends FunctionReferenceImpl implements Function1<EarlyPayEnrollmentViewState, Unit> {
        C144441(Object obj) {
            super(1, obj, EarlyPayEnrollmentFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EarlyPayEnrollmentViewState earlyPayEnrollmentViewState) {
            invoke2(earlyPayEnrollmentViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EarlyPayEnrollmentViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EarlyPayEnrollmentFragment) this.receiver).refreshUi(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getRecyclerView().clearOnScrollListeners();
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
    }

    @Override // com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentAdapterContainer.Callbacks
    public void onDisclosureClicked(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(disclosure.getTitle()).setMessage(disclosure.getContent()).setPositiveButton(C11048R.string.general_label_done, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "early-pay-disclosure", false, 4, null);
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$earlyPayHeaderInViewFlow$1", m3645f = "EarlyPayEnrollmentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$earlyPayHeaderInViewFlow$1 */
    static final class C144421 extends ContinuationImpl7 implements Function2<Produce4<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C144421(Continuation<? super C144421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144421 c144421 = EarlyPayEnrollmentFragment.this.new C144421(continuation);
            c144421.L$0 = obj;
            return c144421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super Boolean> produce4, Continuation<? super Unit> continuation) {
            return ((C144421) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.recyclerview.widget.RecyclerView$OnScrollListener, com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$earlyPayHeaderInViewFlow$1$recyclerViewScrollListener$1] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final EarlyPayEnrollmentFragment earlyPayEnrollmentFragment = EarlyPayEnrollmentFragment.this;
                final ?? r1 = new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$earlyPayHeaderInViewFlow$1$recyclerViewScrollListener$1
                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                        super.onScrolled(recyclerView, dx, dy);
                        View viewFindChildViewUnder = recyclerView.findChildViewUnder(0.0f, earlyPayEnrollmentFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height));
                        produce4.mo8337trySendJP2dKIU(Boolean.valueOf(viewFindChildViewUnder != null ? viewFindChildViewUnder instanceof EarlyPayHeaderView : false));
                    }
                };
                EarlyPayEnrollmentFragment.this.getRecyclerView().addOnScrollListener(r1);
                final EarlyPayEnrollmentFragment earlyPayEnrollmentFragment2 = EarlyPayEnrollmentFragment.this;
                Function0 function0 = new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$earlyPayHeaderInViewFlow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EarlyPayEnrollmentFragment.C144421.invokeSuspend$lambda$0(earlyPayEnrollmentFragment2, r1);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment, EarlyPayEnrollmentFragment3 earlyPayEnrollmentFragment3) {
            earlyPayEnrollmentFragment.getRecyclerView().removeOnScrollListener(earlyPayEnrollmentFragment3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> earlyPayHeaderInViewFlow() {
        return FlowKt.callbackFlow(new C144421(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(EarlyPayEnrollmentViewState state) {
        EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContentConsume;
        getLoadingView().setVisibility(state.isLoading() ? 0 : 8);
        getButtonContainer().setVisibility(state.getShowEnrollmentButtons() ? 0 : 8);
        if (state.getShowEnrollmentButtons()) {
            FragmentEarlyPayEnrollmentBinding binding = getBinding();
            RdsButton rdsButton = binding.earlyPayEnrollmentPrimaryBtn;
            final EarlyPayEnrollmentViewState.PrimaryButtonState primaryButtonState = state.getPrimaryButtonState();
            Intrinsics.checkNotNull(primaryButtonState);
            rdsButton.setText(primaryButtonState.getText());
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EarlyPayEnrollmentFragment.refreshUi$lambda$5$lambda$2$lambda$1(this.f$0, primaryButtonState);
                }
            });
            RdsButton rdsButton2 = binding.earlyPayEnrollmentSecondaryBtn;
            final EarlyPayEnrollmentViewState.SecondaryButtonState secondaryButtonState = state.getSecondaryButtonState();
            Intrinsics.checkNotNull(secondaryButtonState);
            rdsButton2.setText(secondaryButtonState.getText());
            Intrinsics.checkNotNull(rdsButton2);
            OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EarlyPayEnrollmentFragment.refreshUi$lambda$5$lambda$4$lambda$3(this.f$0, secondaryButtonState);
                }
            });
        }
        UiEvent<EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent> content = state.getContent();
        if (content != null && (earlyPayEnrollmentContentConsume = content.consume()) != null) {
            this.adapterContainer.bindContent(earlyPayEnrollmentContentConsume);
            getRecyclerView().setAdapter(this.adapterContainer.getCompositeAdapter());
        }
        EarlyPayEnrollmentViewState.PostEnrollmentAction postEnrollmentAction = state.getPostEnrollmentAction();
        if (Intrinsics.areEqual(postEnrollmentAction, EarlyPayEnrollmentViewState.PostEnrollmentAction.DirectDeposit.INSTANCE)) {
            getCallbacks().takeUserIntoDirectDeposits();
        } else if (Intrinsics.areEqual(postEnrollmentAction, EarlyPayEnrollmentViewState.PostEnrollmentAction.Finish.INSTANCE)) {
            getCallbacks().onEnrollmentSuccess();
        } else if (postEnrollmentAction != null) {
            throw new NoWhenBranchMatchedException();
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getEnrollmentError());
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getContentError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$5$lambda$2$lambda$1(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment, EarlyPayEnrollmentViewState.PrimaryButtonState primaryButtonState) {
        EarlyPayEnrollmentFragmentLogging.logCtaTap(earlyPayEnrollmentFragment, primaryButtonState.getLoggingAction());
        earlyPayEnrollmentFragment.getDuxo().enroll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$5$lambda$4$lambda$3(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment, EarlyPayEnrollmentViewState.SecondaryButtonState secondaryButtonState) {
        EarlyPayEnrollmentFragmentLogging.logCtaTap(earlyPayEnrollmentFragment, secondaryButtonState.getLoggingAction());
        int i = WhenMappings.$EnumSwitchMapping$0[secondaryButtonState.ordinal()];
        if (i == 1) {
            earlyPayEnrollmentFragment.getCallbacks().onAlreadySetupDirectDeposits();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            earlyPayEnrollmentFragment.getDuxo().skipEnrollment();
            earlyPayEnrollmentFragment.getCallbacks().onEnrollmentSkipped();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Args;", "Landroid/os/Parcelable;", "hideActions", "", "<init>", "(Z)V", "getHideActions", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean hideActions;

        /* compiled from: EarlyPayEnrollmentFragment.kt */
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
            dest.writeInt(this.hideActions ? 1 : 0);
        }

        public Args(boolean z) {
            this.hideActions = z;
        }

        public final boolean getHideActions() {
            return this.hideActions;
        }
    }

    /* compiled from: EarlyPayEnrollmentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Args;", "<init>", "()V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EarlyPayEnrollmentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, earlyPayEnrollmentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EarlyPayEnrollmentFragment newInstance(Args args) {
            return (EarlyPayEnrollmentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EarlyPayEnrollmentFragment earlyPayEnrollmentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, earlyPayEnrollmentFragment, args);
        }
    }
}
