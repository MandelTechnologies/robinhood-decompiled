package com.robinhood.android.acatsin.partials.equity;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInEquityAssetBinding;
import com.robinhood.android.acatsin.borrowingfee.BorrowingFeeBottomSheetFragment;
import com.robinhood.android.acatsin.borrowingfee.BorrowingFeeBottomSheetKey;
import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetEvent;
import com.robinhood.android.acatsin.util.PositionAmountFormatting;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInPartialEquityAssetFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u0003./0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInEquityAssetBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInEquityAssetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "setViewState", "state", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent;", "showBorrowingFeeBottomSheet", "feeData", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "setNumpadVisibility", "isVisible", "", "setEditingUi", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "Callbacks", "Args", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialEquityAssetFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPartialEquityAssetFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInEquityAssetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInPartialEquityAssetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Callbacks;", "Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "onEditStockSymbolClicked", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends AcatsInAssetPageCallbacks {
        void onEditStockSymbolClicked();
    }

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAcatsTransfer.Asset.Direction.values().length];
            try {
                iArr[ApiAcatsTransfer.Asset.Direction.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.Direction.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AcatsInPartialEquityAssetFragment() {
        super(C7686R.layout.fragment_acats_in_equity_asset);
        this.duxo = DuxosKt.duxo(this, AcatsInPartialEquityAssetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AcatsInPartialEquityAssetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$special$$inlined$parentFragmentCallbacks$1
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
    public final AcatsInPartialEquityAssetDuxo getDuxo() {
        return (AcatsInPartialEquityAssetDuxo) this.duxo.getValue();
    }

    private final FragmentAcatsInEquityAssetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInEquityAssetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C79931(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C79942(null), 1, null);
        FragmentAcatsInEquityAssetBinding binding = getBinding();
        binding.stockSymbolTxt.setText(((Args) INSTANCE.getArgs((Fragment) this)).getSymbol());
        RdsTextButton editStockBtn = binding.editStockBtn;
        Intrinsics.checkNotNullExpressionValue(editStockBtn, "editStockBtn");
        OnClickListeners.onClick(editStockBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialEquityAssetFragment.onViewCreated$lambda$4$lambda$0(this.f$0);
            }
        });
        binding.positionRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialEquityAssetFragment.onViewCreated$lambda$4$lambda$1(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        ImageView borrowingFeeInfoIcon = binding.borrowingFeeInfoIcon;
        Intrinsics.checkNotNullExpressionValue(borrowingFeeInfoIcon, "borrowingFeeInfoIcon");
        OnClickListeners.onClick(borrowingFeeInfoIcon, new Function0() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialEquityAssetFragment.onViewCreated$lambda$4$lambda$2(this.f$0);
            }
        });
        binding.sharesRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialEquityAssetFragment.onViewCreated$lambda$4$lambda$3(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(binding.numpad.getKeyEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInPartialEquityAssetFragment3(binding.amountInput));
        RhEditText amountInput = binding.amountInput;
        Intrinsics.checkNotNullExpressionValue(amountInput, "amountInput");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxTextView.textChanges(amountInput).skipInitialValue()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInPartialEquityAssetFragment4(getDuxo()));
    }

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$1", m3645f = "AcatsInPartialEquityAssetFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$1 */
    static final class C79931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79931(Continuation<? super C79931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialEquityAssetFragment.this.new C79931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPartialEquityAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInPartialEquityAssetFragment $tmp0;

            AnonymousClass1(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment) {
                this.$tmp0 = acatsInPartialEquityAssetFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInPartialEquityAssetFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C79931.invokeSuspend$setViewState(this.$tmp0, acatsInPartialEquityAssetViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInPartialEquityAssetViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation continuation) {
            acatsInPartialEquityAssetFragment.setViewState(acatsInPartialEquityAssetViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInPartialEquityAssetViewState> stateFlow = AcatsInPartialEquityAssetFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPartialEquityAssetFragment.this);
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

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$2", m3645f = "AcatsInPartialEquityAssetFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$2 */
    static final class C79942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79942(Continuation<? super C79942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialEquityAssetFragment.this.new C79942(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInPartialEquityAssetEvent>> eventFlow = AcatsInPartialEquityAssetFragment.this.getDuxo().getEventFlow();
                final AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment = AcatsInPartialEquityAssetFragment.this;
                FlowCollector<? super Event<AcatsInPartialEquityAssetEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment.onViewCreated.2.1
                    public final Object emit(final Event<AcatsInPartialEquityAssetEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInPartialEquityAssetEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment2 = acatsInPartialEquityAssetFragment;
                            if ((event.getData() instanceof AcatsInPartialEquityAssetEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10765invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10765invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInPartialEquityAssetFragment2.handleEvent((AcatsInPartialEquityAssetEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInPartialEquityAssetEvent>) obj2, (Continuation<? super Unit>) continuation);
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
    public static final Unit onViewCreated$lambda$4$lambda$0(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment) {
        acatsInPartialEquityAssetFragment.getCallbacks().onEditStockSymbolClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$1(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.long_position_btn) {
            acatsInPartialEquityAssetFragment.getDuxo().setPositionType(ApiAcatsTransfer.Asset.Direction.LONG);
        } else if (i == C7686R.id.short_position_btn) {
            acatsInPartialEquityAssetFragment.getDuxo().setPositionType(ApiAcatsTransfer.Asset.Direction.SHORT);
        } else {
            throw new IllegalStateException(("Unknown id " + i).toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$2(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment) {
        acatsInPartialEquityAssetFragment.getDuxo().showBorrowingFeeBottomSheet();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.all_shares_btn) {
            acatsInPartialEquityAssetFragment.getDuxo().setAllSharesChecked(true);
        } else if (i == C7686R.id.specify_amount_btn) {
            acatsInPartialEquityAssetFragment.getDuxo().setAllSharesChecked(false);
        } else {
            throw new IllegalStateException(("Unknown id " + i).toString());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ScarletManager.removeOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AcatsInPartialEquityAssetViewState state) {
        String string2;
        UiAcatsAsset.EquityAsset equityAssetConsume;
        setNumpadVisibility(state.getShowAmountEntryUi());
        FragmentAcatsInEquityAssetBinding binding = getBinding();
        RdsHeaderRowView positionTypeHeader = binding.positionTypeHeader;
        Intrinsics.checkNotNullExpressionValue(positionTypeHeader, "positionTypeHeader");
        Companion companion = INSTANCE;
        positionTypeHeader.setVisibility(((Args) companion.getArgs((Fragment) this)).getHasSubzeroExperiment() ? 0 : 8);
        NewRdsRadioGroup positionRadioGroup = binding.positionRadioGroup;
        Intrinsics.checkNotNullExpressionValue(positionRadioGroup, "positionRadioGroup");
        positionRadioGroup.setVisibility(((Args) companion.getArgs((Fragment) this)).getHasSubzeroExperiment() ? 0 : 8);
        ImageView borrowingFeeInfoIcon = binding.borrowingFeeInfoIcon;
        Intrinsics.checkNotNullExpressionValue(borrowingFeeInfoIcon, "borrowingFeeInfoIcon");
        borrowingFeeInfoIcon.setVisibility(Intrinsics.areEqual(state.isShortPositionAvailable(), Boolean.TRUE) ? 0 : 8);
        int i = WhenMappings.$EnumSwitchMapping$0[state.getSelectedPosition().ordinal()];
        if (i == 1) {
            binding.longPositionBtn.setChecked(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.shortPositionBtn.setChecked(true);
        }
        binding.shortPositionBtn.setEnabled(state.getEnableShortPositionButton());
        LinearLayout borrowingFeeContainer = binding.borrowingFeeContainer;
        Intrinsics.checkNotNullExpressionValue(borrowingFeeContainer, "borrowingFeeContainer");
        borrowingFeeContainer.setVisibility(((Args) companion.getArgs((Fragment) this)).getHasSubzeroExperiment() ? 0 : 8);
        binding.borrowingFeeContainer.setEnabled(state.getEnableShortPositionButton());
        RhTextView rhTextView = binding.borrowingFeeText;
        if (state.isShortPositionAvailable() == null) {
            string2 = getString(C11048R.string.general_status_loading);
        } else if (state.isShortPositionAvailable().booleanValue()) {
            BigDecimal borrowFee = state.getBorrowFee();
            string2 = borrowFee != null ? getString(C7686R.string.acats_in_borrowing_fee_rate, Formats.getLeadingZeroesHundredthPercentFormat().format(borrowFee)) : null;
        } else {
            string2 = getString(C7686R.string.acats_in_short_position_unavailable);
        }
        rhTextView.setText(string2);
        RhTextView shareAmountLabel = binding.shareAmountLabel;
        Intrinsics.checkNotNullExpressionValue(shareAmountLabel, "shareAmountLabel");
        shareAmountLabel.setVisibility(state.getShowAmountEntryUi() ? 0 : 8);
        RhEditText amountInput = binding.amountInput;
        Intrinsics.checkNotNullExpressionValue(amountInput, "amountInput");
        amountInput.setVisibility(state.getShowAmountEntryUi() ? 0 : 8);
        View divider = binding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(state.getShowAmountEntryUi() ? 0 : 8);
        RhTextView quantityDisclaimerTxt = binding.quantityDisclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(quantityDisclaimerTxt, "quantityDisclaimerTxt");
        quantityDisclaimerTxt.setVisibility(state.getShowAmountEntryUi() ? 0 : 8);
        if (state.getShowAmountEntryUi()) {
            if (!Intrinsics.areEqual(String.valueOf(binding.amountInput.getText()), state.getAmountText())) {
                RhEditText amountInput2 = binding.amountInput;
                Intrinsics.checkNotNullExpressionValue(amountInput2, "amountInput");
                TextViewsKt.setTextAndUpdateCursor(amountInput2, state.getAmountText());
            }
            binding.amountInput.requestFocus();
        }
        binding.addToListBtn.setEnabled(state.getEnableAddToListButton());
        RdsButton addToListBtn = binding.addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        OnClickListeners.onClick(addToListBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialEquityAssetFragment.setViewState$lambda$9$lambda$6(this.f$0, state);
            }
        });
        binding.updateAssetBtn.setEnabled(state.getEnableAddToListButton());
        RdsButton updateAssetBtn = binding.updateAssetBtn;
        Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
        OnClickListeners.onClick(updateAssetBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialEquityAssetFragment.setViewState$lambda$9$lambda$7(this.f$0, state);
            }
        });
        UiEvent<UiAcatsAsset.EquityAsset> populateEditUiEvent = state.getPopulateEditUiEvent();
        if (populateEditUiEvent == null || (equityAssetConsume = populateEditUiEvent.consume()) == null) {
            return;
        }
        setEditingUi(equityAssetConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$9$lambda$6(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState) {
        acatsInPartialEquityAssetFragment.getCallbacks().onAssetEntered(acatsInPartialEquityAssetViewState.getAsset());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$9$lambda$7(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState) {
        acatsInPartialEquityAssetFragment.getCallbacks().onAssetUpdated(acatsInPartialEquityAssetViewState.getAsset());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInPartialEquityAssetEvent event) {
        if (event instanceof AcatsInPartialEquityAssetEvent.PopulateEditUi) {
            setEditingUi(((AcatsInPartialEquityAssetEvent.PopulateEditUi) event).getAsset());
        } else {
            if (!(event instanceof AcatsInPartialEquityAssetEvent.ShowBorrowingFeeBottomSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            showBorrowingFeeBottomSheet(((AcatsInPartialEquityAssetEvent.ShowBorrowingFeeBottomSheet) event).getFeeData());
        }
    }

    private final void showBorrowingFeeBottomSheet(UiShortPositionFeeData feeData) {
        if (getChildFragmentManager().findFragmentByTag(BorrowingFeeBottomSheetFragment.DIALOG_TAG) != null) {
            return;
        }
        BorrowingFeeBottomSheetFragment borrowingFeeBottomSheetFragment = (BorrowingFeeBottomSheetFragment) BorrowingFeeBottomSheetFragment.INSTANCE.newInstance((Parcelable) new BorrowingFeeBottomSheetKey(extensions2.toImmutableList(CollectionsKt.listOf(feeData))));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        borrowingFeeBottomSheetFragment.show(childFragmentManager, BorrowingFeeBottomSheetFragment.DIALOG_TAG);
    }

    private final void setNumpadVisibility(boolean isVisible) {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$1
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
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$2
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
        simpleSlide.addTarget(getBinding().quantityDisclaimerTxt);
        transitionSet.addTransition(simpleSlide);
        Transitions2.add(transitionSet, new ChangeBounds());
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        RdsNumpadView numpad = getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(isVisible ? 0 : 8);
    }

    private final void setEditingUi(final UiAcatsAsset.EquityAsset asset) {
        FragmentAcatsInEquityAssetBinding binding = getBinding();
        int i = WhenMappings.$EnumSwitchMapping$0[asset.getDirection().ordinal()];
        if (i == 1) {
            binding.longPositionBtn.setChecked(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.shortPositionBtn.setChecked(true);
        }
        if (asset.getNumShares() == null) {
            binding.allSharesBtn.setChecked(true);
        } else {
            binding.specifyAmountBtn.setChecked(true);
        }
        String strValueOf = asset.getNumShares() != null ? String.valueOf(PositionAmountFormatting.formatQuantityForDisplay(asset.getNumShares().intValue(), asset.isShortPosition())) : null;
        RhEditText amountInput = binding.amountInput;
        Intrinsics.checkNotNullExpressionValue(amountInput, "amountInput");
        TextViewsKt.setTextAndUpdateCursor(amountInput, strValueOf);
        binding.amountInput.requestFocus();
        RdsTextButton editStockBtn = binding.editStockBtn;
        Intrinsics.checkNotNullExpressionValue(editStockBtn, "editStockBtn");
        editStockBtn.setVisibility(8);
        RdsButton addToListBtn = binding.addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        addToListBtn.setVisibility(8);
        RdsButton updateAssetBtn = binding.updateAssetBtn;
        Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
        updateAssetBtn.setVisibility(0);
        RdsButton deleteFromListBtn = binding.deleteFromListBtn;
        Intrinsics.checkNotNullExpressionValue(deleteFromListBtn, "deleteFromListBtn");
        deleteFromListBtn.setVisibility(0);
        RdsButton deleteFromListBtn2 = binding.deleteFromListBtn;
        Intrinsics.checkNotNullExpressionValue(deleteFromListBtn2, "deleteFromListBtn");
        OnClickListeners.onClick(deleteFromListBtn2, new Function0() { // from class: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialEquityAssetFragment.setEditingUi$lambda$13$lambda$12(this.f$0, asset);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEditingUi$lambda$13$lambda$12(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, UiAcatsAsset.EquityAsset equityAsset) {
        acatsInPartialEquityAssetFragment.getCallbacks().onAssetRemoved(equityAsset);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "symbol", "", "name", "assetToModify", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "hasSubzeroExperiment", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getName", "getAssetToModify", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "getHasSubzeroExperiment", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiAcatsAsset.EquityAsset assetToModify;
        private final boolean hasSubzeroExperiment;
        private final UUID instrumentId;
        private final String name;
        private final String symbol;

        /* compiled from: AcatsInPartialEquityAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiAcatsAsset.EquityAsset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, String str, String str2, UiAcatsAsset.EquityAsset equityAsset, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 2) != 0) {
                str = args.symbol;
            }
            if ((i & 4) != 0) {
                str2 = args.name;
            }
            if ((i & 8) != 0) {
                equityAsset = args.assetToModify;
            }
            if ((i & 16) != 0) {
                z = args.hasSubzeroExperiment;
            }
            boolean z2 = z;
            String str3 = str2;
            return args.copy(uuid, str, str3, equityAsset, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAcatsAsset.EquityAsset getAssetToModify() {
            return this.assetToModify;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }

        public final Args copy(UUID instrumentId, String symbol, String name, UiAcatsAsset.EquityAsset assetToModify, boolean hasSubzeroExperiment) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Args(instrumentId, symbol, name, assetToModify, hasSubzeroExperiment);
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
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.symbol, args.symbol) && Intrinsics.areEqual(this.name, args.name) && Intrinsics.areEqual(this.assetToModify, args.assetToModify) && this.hasSubzeroExperiment == args.hasSubzeroExperiment;
        }

        public int hashCode() {
            int iHashCode = ((((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31;
            UiAcatsAsset.EquityAsset equityAsset = this.assetToModify;
            return ((iHashCode + (equityAsset == null ? 0 : equityAsset.hashCode())) * 31) + Boolean.hashCode(this.hasSubzeroExperiment);
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", name=" + this.name + ", assetToModify=" + this.assetToModify + ", hasSubzeroExperiment=" + this.hasSubzeroExperiment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.symbol);
            dest.writeString(this.name);
            UiAcatsAsset.EquityAsset equityAsset = this.assetToModify;
            if (equityAsset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                equityAsset.writeToParcel(dest, flags);
            }
            dest.writeInt(this.hasSubzeroExperiment ? 1 : 0);
        }

        public Args(UUID instrumentId, String symbol, String name, UiAcatsAsset.EquityAsset equityAsset, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            this.instrumentId = instrumentId;
            this.symbol = symbol;
            this.name = name;
            this.assetToModify = equityAsset;
            this.hasSubzeroExperiment = z;
        }

        public /* synthetic */ Args(UUID uuid, String str, String str2, UiAcatsAsset.EquityAsset equityAsset, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, str2, (i & 8) != 0 ? null : equityAsset, (i & 16) != 0 ? false : z);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getName() {
            return this.name;
        }

        public final UiAcatsAsset.EquityAsset getAssetToModify() {
            return this.assetToModify;
        }

        public final boolean getHasSubzeroExperiment() {
            return this.hasSubzeroExperiment;
        }
    }

    /* compiled from: AcatsInPartialEquityAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsInPartialEquityAssetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPartialEquityAssetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPartialEquityAssetFragment newInstance(Args args) {
            return (AcatsInPartialEquityAssetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPartialEquityAssetFragment acatsInPartialEquityAssetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPartialEquityAssetFragment, args);
        }
    }
}
