package com.robinhood.android.acatsin.partials.cash;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInPartialCashAssetBinding;
import com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetEvent;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInPartialCashAssetFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialCashAssetBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialCashAssetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetEvent;", "setNumpadVisibility", "isVisible", "", "setEditingAssetUi", "cashAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "showMarginDisabledBottomSheet", "Args", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialCashAssetFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPartialCashAssetFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialCashAssetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInPartialCashAssetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInPartialCashAssetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiAcatsAsset.CashAsset.CashType.values().length];
            try {
                iArr[UiAcatsAsset.CashAsset.CashType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiAcatsAsset.CashAsset.CashType.MARGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AcatsInPartialCashAssetFragment() {
        super(C7686R.layout.fragment_acats_in_partial_cash_asset);
        this.duxo = DuxosKt.duxo(this, AcatsInPartialCashAssetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AcatsInPartialCashAssetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAssetPageCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInPartialCashAssetDuxo getDuxo() {
        return (AcatsInPartialCashAssetDuxo) this.duxo.getValue();
    }

    private final FragmentAcatsInPartialCashAssetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInPartialCashAssetBinding) value;
    }

    private final AcatsInAssetPageCallbacks getCallbacks() {
        return (AcatsInAssetPageCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getAssetToModify() == null) {
            RhToolbars.setCenteredTitle(toolbar, C7686R.string.acats_in_cash_input_add_title);
        } else {
            RhToolbars.setCenteredTitle(toolbar, C7686R.string.acats_in_cash_input_edit_title);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C79791(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C79802(null), 1, null);
        final FragmentAcatsInPartialCashAssetBinding binding = getBinding();
        ConstraintLayout amountRow = binding.amountRow;
        Intrinsics.checkNotNullExpressionValue(amountRow, "amountRow");
        OnClickListeners.onClick(amountRow, new Function0() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialCashAssetFragment.onViewCreated$lambda$4$lambda$0(binding);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(binding.numpad.getKeyEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInPartialCashAssetFragment3(binding.amountInput));
        LifecycleHost.DefaultImpls.bind$default(this, binding.amountInput.getAmountObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialCashAssetFragment.onViewCreated$lambda$4$lambda$1(this.f$0, (Optional) obj);
            }
        });
        binding.cashTypeRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialCashAssetFragment.onViewCreated$lambda$4$lambda$2(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        binding.quantityRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialCashAssetFragment.onViewCreated$lambda$4$lambda$3(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* compiled from: AcatsInPartialCashAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$1", m3645f = "AcatsInPartialCashAssetFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$1 */
    static final class C79791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79791(Continuation<? super C79791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialCashAssetFragment.this.new C79791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPartialCashAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInPartialCashAssetFragment $tmp0;

            AnonymousClass1(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment) {
                this.$tmp0 = acatsInPartialCashAssetFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInPartialCashAssetFragment.class, "bind", "bind(Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C79791.invokeSuspend$bind(this.$tmp0, acatsInPartialCashAssetViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInPartialCashAssetViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, Continuation continuation) {
            acatsInPartialCashAssetFragment.bind(acatsInPartialCashAssetViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInPartialCashAssetViewState> stateFlow = AcatsInPartialCashAssetFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPartialCashAssetFragment.this);
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
    }

    /* compiled from: AcatsInPartialCashAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$2", m3645f = "AcatsInPartialCashAssetFragment.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$2 */
    static final class C79802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79802(Continuation<? super C79802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialCashAssetFragment.this.new C79802(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInPartialCashAssetEvent>> eventFlow = AcatsInPartialCashAssetFragment.this.getDuxo().getEventFlow();
                final AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment = AcatsInPartialCashAssetFragment.this;
                FlowCollector<? super Event<AcatsInPartialCashAssetEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment.onViewCreated.2.1
                    public final Object emit(final Event<AcatsInPartialCashAssetEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInPartialCashAssetEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment2 = acatsInPartialCashAssetFragment;
                            if ((event.getData() instanceof AcatsInPartialCashAssetEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Resources.NotFoundException {
                                        m10763invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10763invoke(Object it) throws Resources.NotFoundException {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInPartialCashAssetFragment2.handleEvent((AcatsInPartialCashAssetEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInPartialCashAssetEvent>) obj2, (Continuation<? super Unit>) continuation);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$0(FragmentAcatsInPartialCashAssetBinding fragmentAcatsInPartialCashAssetBinding) {
        fragmentAcatsInPartialCashAssetBinding.amountInput.requestFocus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$1(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        acatsInPartialCashAssetFragment.getDuxo().updateAmountEntered((Money) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$2(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        UiAcatsAsset.CashAsset.CashType cashType;
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.cash_row) {
            cashType = UiAcatsAsset.CashAsset.CashType.CASH;
        } else {
            cashType = i == C7686R.id.margin_row ? UiAcatsAsset.CashAsset.CashType.MARGIN : null;
        }
        acatsInPartialCashAssetFragment.getDuxo().updateCashType(cashType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        acatsInPartialCashAssetFragment.getDuxo().updateIsEntireBalance(i == C7686R.id.entire_balance_row);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final AcatsInPartialCashAssetViewState state) {
        setNumpadVisibility(state.getShouldShowInput());
        FragmentAcatsInPartialCashAssetBinding binding = getBinding();
        binding.cashRow.setCheckedProgrammatically(state.getCashType() == UiAcatsAsset.CashAsset.CashType.CASH);
        RdsRadioButtonRowView marginRow = binding.marginRow;
        Intrinsics.checkNotNullExpressionValue(marginRow, "marginRow");
        marginRow.setVisibility(state.isMarginSupported() ? 0 : 8);
        binding.marginRow.setCheckedProgrammatically(state.getCashType() == UiAcatsAsset.CashAsset.CashType.MARGIN);
        ConstraintLayout amountRow = binding.amountRow;
        Intrinsics.checkNotNullExpressionValue(amountRow, "amountRow");
        amountRow.setVisibility(state.getShouldShowInput() ? 0 : 8);
        if (state.getShouldShowInput()) {
            binding.amountRow.requestFocus();
        }
        binding.addToListBtn.setEnabled(state.getCanContinue());
        RdsButton addToListBtn = binding.addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        OnClickListeners.onClick(addToListBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialCashAssetFragment.bind$lambda$9$lambda$6(state, this);
            }
        });
        binding.updateAssetBtn.setEnabled(state.getCanContinue());
        RdsButton updateAssetBtn = binding.updateAssetBtn;
        Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
        OnClickListeners.onClick(updateAssetBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialCashAssetFragment.bind$lambda$9$lambda$8(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9$lambda$6(AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment) {
        UiAcatsAsset.CashAsset assetEntered = acatsInPartialCashAssetViewState.getAssetEntered();
        if (assetEntered != null) {
            acatsInPartialCashAssetFragment.getCallbacks().onAssetEntered(assetEntered);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9$lambda$8(AcatsInPartialCashAssetViewState acatsInPartialCashAssetViewState, AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment) {
        UiAcatsAsset.CashAsset assetEntered = acatsInPartialCashAssetViewState.getAssetEntered();
        if (assetEntered != null) {
            acatsInPartialCashAssetFragment.getCallbacks().onAssetUpdated(assetEntered);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInPartialCashAssetEvent event) throws Resources.NotFoundException {
        if (event instanceof AcatsInPartialCashAssetEvent.ShowMarginDisabledBottomSheetEvent) {
            showMarginDisabledBottomSheet(((AcatsInPartialCashAssetEvent.ShowMarginDisabledBottomSheetEvent) event).getState());
        } else {
            if (!(event instanceof AcatsInPartialCashAssetEvent.PopulateEditingAssetInfoEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            setEditingAssetUi(((AcatsInPartialCashAssetEvent.PopulateEditingAssetInfoEvent) event).getCashAsset());
        }
    }

    private final void setNumpadVisibility(boolean isVisible) {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        SimpleSlide simpleSlide = new SimpleSlide(0, 1, null);
        simpleSlide.addTarget(getBinding().numpad);
        simpleSlide.addTarget(getBinding().addToListBtn);
        simpleSlide.addTarget(getBinding().updateAssetBtn);
        simpleSlide.addTarget(getBinding().deleteFromListBtn);
        transitionSet.addTransition(simpleSlide);
        Transitions2.add(transitionSet, new ChangeBounds());
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        RdsNumpadView numpad = getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(isVisible ? 0 : 8);
    }

    private final void setEditingAssetUi(final UiAcatsAsset.CashAsset cashAsset) {
        FragmentAcatsInPartialCashAssetBinding binding = getBinding();
        binding.amountInput.setAmount(cashAsset.getAmount());
        int i = WhenMappings.$EnumSwitchMapping$0[cashAsset.getCashType().ordinal()];
        if (i == 1) {
            binding.cashRow.setChecked(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.marginRow.setChecked(true);
        }
        if (cashAsset.getAmount() == null) {
            binding.entireBalanceRow.setChecked(true);
        } else {
            binding.specificAmountRow.setChecked(true);
        }
        RdsButton deleteFromListBtn = binding.deleteFromListBtn;
        Intrinsics.checkNotNullExpressionValue(deleteFromListBtn, "deleteFromListBtn");
        OnClickListeners.onClick(deleteFromListBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.cash.AcatsInPartialCashAssetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialCashAssetFragment.setEditingAssetUi$lambda$13$lambda$12(this.f$0, cashAsset);
            }
        });
        RdsButton addToListBtn = binding.addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        addToListBtn.setVisibility(8);
        RdsButton updateAssetBtn = binding.updateAssetBtn;
        Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
        updateAssetBtn.setVisibility(0);
        RdsButton deleteFromListBtn2 = binding.deleteFromListBtn;
        Intrinsics.checkNotNullExpressionValue(deleteFromListBtn2, "deleteFromListBtn");
        deleteFromListBtn2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEditingAssetUi$lambda$13$lambda$12(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, UiAcatsAsset.CashAsset cashAsset) {
        acatsInPartialCashAssetFragment.getCallbacks().onAssetRemoved(cashAsset);
        return Unit.INSTANCE;
    }

    private final void showMarginDisabledBottomSheet(AcatsInPartialCashAssetViewState state) throws Resources.NotFoundException {
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        int marginDialogId = state.getMarginDialogId();
        StringResource marginDialogTitle = state.getMarginDialogTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = marginDialogTitle.getText(resources);
        StringResource marginDialogDescription = state.getMarginDialogDescription();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        CharSequence text2 = marginDialogDescription.getText(resources2);
        StringResource marginDialogPrimaryButton = state.getMarginDialogPrimaryButton();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(marginDialogId, text, null, text2, null, marginDialogPrimaryButton.getText(resources3), null, getString(C11048R.string.general_label_got_it), null, false, false, null, null, null, false, false, false, false, null, null, null, 2096980, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "margin-not-enabled");
    }

    /* compiled from: AcatsInPartialCashAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment$Args;", "Landroid/os/Parcelable;", "isMarginSupported", "", "rhsAccountNumber", "", "accountNumber", "assetToModify", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "isMarginPreselected", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;Z)V", "()Z", "getRhsAccountNumber", "()Ljava/lang/String;", "getAccountNumber", "getAssetToModify", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final UiAcatsAsset.CashAsset assetToModify;
        private final boolean isMarginPreselected;
        private final boolean isMarginSupported;
        private final String rhsAccountNumber;

        /* compiled from: AcatsInPartialCashAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                UiAcatsAsset.CashAsset cashAsset;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String string2 = parcel.readString();
                boolean z5 = z2;
                String string3 = parcel.readString();
                UiAcatsAsset.CashAsset cashAssetCreateFromParcel = parcel.readInt() == 0 ? null : UiAcatsAsset.CashAsset.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z3 = z5;
                    cashAsset = cashAssetCreateFromParcel;
                } else {
                    cashAsset = cashAssetCreateFromParcel;
                    z3 = z;
                }
                return new Args(z4, string2, string3, cashAsset, z3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, String str2, UiAcatsAsset.CashAsset cashAsset, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isMarginSupported;
            }
            if ((i & 2) != 0) {
                str = args.rhsAccountNumber;
            }
            if ((i & 4) != 0) {
                str2 = args.accountNumber;
            }
            if ((i & 8) != 0) {
                cashAsset = args.assetToModify;
            }
            if ((i & 16) != 0) {
                z2 = args.isMarginPreselected;
            }
            boolean z3 = z2;
            String str3 = str2;
            return args.copy(z, str, str3, cashAsset, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsMarginSupported() {
            return this.isMarginSupported;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAcatsAsset.CashAsset getAssetToModify() {
            return this.assetToModify;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsMarginPreselected() {
            return this.isMarginPreselected;
        }

        public final Args copy(boolean isMarginSupported, String rhsAccountNumber, String accountNumber, UiAcatsAsset.CashAsset assetToModify, boolean isMarginPreselected) {
            return new Args(isMarginSupported, rhsAccountNumber, accountNumber, assetToModify, isMarginPreselected);
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
            return this.isMarginSupported == args.isMarginSupported && Intrinsics.areEqual(this.rhsAccountNumber, args.rhsAccountNumber) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.assetToModify, args.assetToModify) && this.isMarginPreselected == args.isMarginPreselected;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isMarginSupported) * 31;
            String str = this.rhsAccountNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.accountNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UiAcatsAsset.CashAsset cashAsset = this.assetToModify;
            return ((iHashCode3 + (cashAsset != null ? cashAsset.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMarginPreselected);
        }

        public String toString() {
            return "Args(isMarginSupported=" + this.isMarginSupported + ", rhsAccountNumber=" + this.rhsAccountNumber + ", accountNumber=" + this.accountNumber + ", assetToModify=" + this.assetToModify + ", isMarginPreselected=" + this.isMarginPreselected + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isMarginSupported ? 1 : 0);
            dest.writeString(this.rhsAccountNumber);
            dest.writeString(this.accountNumber);
            UiAcatsAsset.CashAsset cashAsset = this.assetToModify;
            if (cashAsset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cashAsset.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isMarginPreselected ? 1 : 0);
        }

        public Args(boolean z, String str, String str2, UiAcatsAsset.CashAsset cashAsset, boolean z2) {
            this.isMarginSupported = z;
            this.rhsAccountNumber = str;
            this.accountNumber = str2;
            this.assetToModify = cashAsset;
            this.isMarginPreselected = z2;
        }

        public /* synthetic */ Args(boolean z, String str, String str2, UiAcatsAsset.CashAsset cashAsset, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, str, str2, (i & 8) != 0 ? null : cashAsset, (i & 16) != 0 ? false : z2);
        }

        public final boolean isMarginSupported() {
            return this.isMarginSupported;
        }

        public final String getRhsAccountNumber() {
            return this.rhsAccountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UiAcatsAsset.CashAsset getAssetToModify() {
            return this.assetToModify;
        }

        public final boolean isMarginPreselected() {
            return this.isMarginPreselected;
        }
    }

    /* compiled from: AcatsInPartialCashAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment;", "Lcom/robinhood/android/acatsin/partials/cash/AcatsInPartialCashAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsInPartialCashAssetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPartialCashAssetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPartialCashAssetFragment newInstance(Args args) {
            return (AcatsInPartialCashAssetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPartialCashAssetFragment acatsInPartialCashAssetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPartialCashAssetFragment, args);
        }
    }
}
