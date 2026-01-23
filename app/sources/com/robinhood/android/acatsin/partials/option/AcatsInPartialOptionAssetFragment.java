package com.robinhood.android.acatsin.partials.option;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInPartialOptionAssetBinding;
import com.robinhood.android.acatsin.partials.AcatsInAssetPageCallbacks;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetEvent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
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
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AcatsInPartialOptionAssetFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u0001:\u0003012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialOptionAssetBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialOptionAssetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "focusOnNumContracts", "openNumpad", "allowDecimal", "", "viewOfFocus", "closeNumpad", "setNumpadVisibility", "isVisible", "setEditingAssetUi", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "Callbacks", "Args", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialOptionAssetFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPartialOptionAssetFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInPartialOptionAssetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInPartialOptionAssetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Callbacks;", "Lcom/robinhood/android/acatsin/partials/AcatsInAssetPageCallbacks;", "onEditOptionSymbolClicked", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends AcatsInAssetPageCallbacks {
        void onEditOptionSymbolClicked();
    }

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AcatsInPartialOptionAssetFragment() {
        super(C7686R.layout.fragment_acats_in_partial_option_asset);
        this.binding = ViewBinding5.viewBinding(this, AcatsInPartialOptionAssetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, AcatsInPartialOptionAssetDuxo.class);
    }

    private final FragmentAcatsInPartialOptionAssetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInPartialOptionAssetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInPartialOptionAssetDuxo getDuxo() {
        return (AcatsInPartialOptionAssetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ScarletManager.removeOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C80081(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C80092(null), 1, null);
        final FragmentAcatsInPartialOptionAssetBinding binding = getBinding();
        RhTextView rhTextView = binding.instrumentSymbolTxt;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getSymbol());
        RdsTextButton editBtn = binding.editBtn;
        Intrinsics.checkNotNullExpressionValue(editBtn, "editBtn");
        editBtn.setVisibility(!((Args) companion.getArgs((Fragment) this)).isEditMode() ? 0 : 8);
        RdsTextButton editBtn2 = binding.editBtn;
        Intrinsics.checkNotNullExpressionValue(editBtn2, "editBtn");
        OnClickListeners.onClick(editBtn2, new AcatsInPartialOptionAssetFragment3(getCallbacks()));
        binding.numpad.useDefaultKeyHandler();
        binding.numContractsEditText.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$3$2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                binding.numContractsEditText.performClick();
                this.focusOnNumContracts();
                return false;
            }
        });
        binding.strikePriceEditText.setOnAmountTouchListener(new Function0() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$0(binding, this);
            }
        });
        binding.expDateRowEditText.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$3$4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                binding.expDateRowEditText.performClick();
                binding.expDateRowEditText.requestFocus();
                AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment = this;
                RdsFormattedEditText expDateRowEditText = binding.expDateRowEditText;
                Intrinsics.checkNotNullExpressionValue(expDateRowEditText, "expDateRowEditText");
                acatsInPartialOptionAssetFragment.openNumpad(false, expDateRowEditText);
                return false;
            }
        });
        binding.positionRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$1(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        binding.quantityRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$2(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        binding.optionTypeRadioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$3(this.f$0, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        RdsTextInputEditText numContractsEditText = binding.numContractsEditText;
        Intrinsics.checkNotNullExpressionValue(numContractsEditText, "numContractsEditText");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(numContractsEditText).skipInitialValue(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$4(this.f$0, (CharSequence) obj);
            }
        });
        RdsFormattedEditText expDateRowEditText = binding.expDateRowEditText;
        Intrinsics.checkNotNullExpressionValue(expDateRowEditText, "expDateRowEditText");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(expDateRowEditText).skipInitialValue(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$5(binding, this, (CharSequence) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, binding.strikePriceEditText.getAmountObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInPartialOptionAssetFragment.onViewCreated$lambda$7$lambda$6(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$1", m3645f = "AcatsInPartialOptionAssetFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$1 */
    static final class C80081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80081(Continuation<? super C80081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialOptionAssetFragment.this.new C80081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPartialOptionAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInPartialOptionAssetFragment $tmp0;

            AnonymousClass1(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
                this.$tmp0 = acatsInPartialOptionAssetFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInPartialOptionAssetFragment.class, "bind", "bind(Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C80081.invokeSuspend$bind(this.$tmp0, acatsInPartialOptionAssetViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInPartialOptionAssetViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState, Continuation continuation) {
            acatsInPartialOptionAssetFragment.bind(acatsInPartialOptionAssetViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInPartialOptionAssetViewState> stateFlow = AcatsInPartialOptionAssetFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPartialOptionAssetFragment.this);
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

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$2", m3645f = "AcatsInPartialOptionAssetFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$2 */
    static final class C80092 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80092(Continuation<? super C80092> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialOptionAssetFragment.this.new C80092(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInPartialOptionAssetEvent>> eventFlow = AcatsInPartialOptionAssetFragment.this.getDuxo().getEventFlow();
                final AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment = AcatsInPartialOptionAssetFragment.this;
                FlowCollector<? super Event<AcatsInPartialOptionAssetEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment.onViewCreated.2.1
                    public final Object emit(final Event<AcatsInPartialOptionAssetEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInPartialOptionAssetEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment2 = acatsInPartialOptionAssetFragment;
                            if ((event.getData() instanceof AcatsInPartialOptionAssetEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10769invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10769invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInPartialOptionAssetFragment2.handleEvent((AcatsInPartialOptionAssetEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInPartialOptionAssetEvent>) obj2, (Continuation<? super Unit>) continuation);
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
    public static final Unit onViewCreated$lambda$7$lambda$0(FragmentAcatsInPartialOptionAssetBinding fragmentAcatsInPartialOptionAssetBinding, AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
        fragmentAcatsInPartialOptionAssetBinding.strikePriceEditText.requestAmountTextFocus();
        RhMoneyInputView strikePriceEditText = fragmentAcatsInPartialOptionAssetBinding.strikePriceEditText;
        Intrinsics.checkNotNullExpressionValue(strikePriceEditText, "strikePriceEditText");
        acatsInPartialOptionAssetFragment.openNumpad(true, strikePriceEditText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$1(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        ApiAcatsTransfer.Asset.Direction direction;
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.position_long_radio_btn) {
            direction = ApiAcatsTransfer.Asset.Direction.LONG;
        } else {
            if (i != C7686R.id.position_short_radio_btn) {
                throw new IllegalStateException(("Unknown id " + i).toString());
            }
            direction = ApiAcatsTransfer.Asset.Direction.SHORT;
        }
        acatsInPartialOptionAssetFragment.getDuxo().setDirection(direction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$2(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.quantity_all_contracts_radio_btn) {
            z = true;
        } else {
            if (i != C7686R.id.quantity_specific_amount_radio_btn) {
                throw new IllegalStateException(("Unknown id " + i).toString());
            }
            z = false;
        }
        acatsInPartialOptionAssetFragment.getDuxo().setIsAllContracts(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$3(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        OptionContractType optionContractType;
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        if (i == C7686R.id.call_radio_row) {
            optionContractType = OptionContractType.CALL;
        } else {
            if (i != C7686R.id.put_radio_row) {
                throw new IllegalStateException(("Unknown id " + i).toString());
            }
            optionContractType = OptionContractType.PUT;
        }
        acatsInPartialOptionAssetFragment.getDuxo().setOptionType(optionContractType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$4(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        acatsInPartialOptionAssetFragment.getDuxo().setNumContracts(text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$5(FragmentAcatsInPartialOptionAssetBinding fragmentAcatsInPartialOptionAssetBinding, AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (fragmentAcatsInPartialOptionAssetBinding.expDateRowEditText.isValid()) {
            acatsInPartialOptionAssetFragment.getDuxo().setExpirationDate(fragmentAcatsInPartialOptionAssetBinding.expDateRowEditText.getTypedText());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        acatsInPartialOptionAssetFragment.getDuxo().setStrikePrice((Money) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final AcatsInPartialOptionAssetViewState state) {
        Group numContractsRowGroup = getBinding().numContractsRowGroup;
        Intrinsics.checkNotNullExpressionValue(numContractsRowGroup, "numContractsRowGroup");
        boolean z = numContractsRowGroup.getVisibility() == 0;
        Group numContractsRowGroup2 = getBinding().numContractsRowGroup;
        Intrinsics.checkNotNullExpressionValue(numContractsRowGroup2, "numContractsRowGroup");
        numContractsRowGroup2.setVisibility(state.getShouldShowContractsRow() ? 0 : 8);
        if (!z && state.getShouldShowContractsRow()) {
            focusOnNumContracts();
        }
        getBinding().addToListBtn.setEnabled(state.isValidInput());
        getBinding().updateAssetBtn.setEnabled(state.isValidInput());
        if (state.isValidInput()) {
            getBinding().addToListBtn.setLoading(state.isButtonLoading());
            getBinding().updateAssetBtn.setLoading(state.isButtonLoading());
        }
        RdsButton addToListBtn = getBinding().addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        OnClickListeners.onClick(addToListBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialOptionAssetFragment.bind$lambda$9(state, this);
            }
        });
        RdsButton updateAssetBtn = getBinding().updateAssetBtn;
        Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
        OnClickListeners.onClick(updateAssetBtn, new Function0() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialOptionAssetFragment.bind$lambda$11(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState, AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
        UnvalidatedOptionContract unvalidatedOptionContract = acatsInPartialOptionAssetViewState.getUnvalidatedOptionContract();
        if (unvalidatedOptionContract != null) {
            acatsInPartialOptionAssetFragment.getDuxo().validateOptionContract(unvalidatedOptionContract);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$11(AcatsInPartialOptionAssetViewState acatsInPartialOptionAssetViewState, AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
        UnvalidatedOptionContract unvalidatedOptionContract = acatsInPartialOptionAssetViewState.getUnvalidatedOptionContract();
        if (unvalidatedOptionContract != null) {
            acatsInPartialOptionAssetFragment.getDuxo().validateOptionContract(unvalidatedOptionContract);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInPartialOptionAssetEvent event) {
        if (Intrinsics.areEqual(event, AcatsInPartialOptionAssetEvent.InvalidDateEvent.INSTANCE)) {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            RdsFormattedEditText expDateRowEditText = getBinding().expDateRowEditText;
            Intrinsics.checkNotNullExpressionValue(expDateRowEditText, "expDateRowEditText");
            String string2 = getString(C7686R.string.acats_in_option_input_exp_date_invalid_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            companion.make(expDateRowEditText, string2, -1).show();
            return;
        }
        if (event instanceof AcatsInPartialOptionAssetEvent.NetworkErrorEvent) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsInPartialOptionAssetEvent.NetworkErrorEvent) event).getThrowable(), false, 2, null);
            return;
        }
        if (event instanceof AcatsInPartialOptionAssetEvent.OptionValidatedEvent) {
            Companion companion2 = INSTANCE;
            if (((Args) companion2.getArgs((Fragment) this)).isEditMode()) {
                UiAcatsAsset.OptionAsset assetToModify = ((Args) companion2.getArgs((Fragment) this)).getAssetToModify();
                Intrinsics.checkNotNull(assetToModify);
                getCallbacks().onAssetRemoved(assetToModify);
                getCallbacks().onAssetEntered(((AcatsInPartialOptionAssetEvent.OptionValidatedEvent) event).getAsset());
                return;
            }
            getCallbacks().onAssetEntered(((AcatsInPartialOptionAssetEvent.OptionValidatedEvent) event).getAsset());
            return;
        }
        if (Intrinsics.areEqual(event, AcatsInPartialOptionAssetEvent.OptionValidationFailureEvent.INSTANCE)) {
            RhDialogFragment.Companion companion3 = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion3.create(contextRequireContext).setTitle(C7686R.string.acats_in_option_input_invalid_title, new Object[0]).setMessage(C7686R.string.acats_in_option_input_invalid_message, new Object[0]).setPositiveButton(C7686R.string.acats_in_option_input_invalid_positive_button, new Object[0]);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "option-invalid-dialog", false, 4, null);
            return;
        }
        if (!(event instanceof AcatsInPartialOptionAssetEvent.PopulateEditUiEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        setEditingAssetUi(((AcatsInPartialOptionAssetEvent.PopulateEditUiEvent) event).getAsset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusOnNumContracts() {
        getBinding().numContractsEditText.requestFocus();
        RdsTextInputEditText numContractsEditText = getBinding().numContractsEditText;
        Intrinsics.checkNotNullExpressionValue(numContractsEditText, "numContractsEditText");
        openNumpad(false, numContractsEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNumpad(boolean allowDecimal, final View viewOfFocus) {
        FragmentAcatsInPartialOptionAssetBinding binding = getBinding();
        binding.numpad.setDelimiterEnabled(allowDecimal);
        binding.numpad.setOnButtonClick(new Function0() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialOptionAssetFragment.openNumpad$lambda$13$lambda$12(viewOfFocus, this);
            }
        });
        setNumpadVisibility(true);
        if (((Args) INSTANCE.getArgs((Fragment) this)).isEditMode()) {
            RdsButton updateAssetBtn = getBinding().updateAssetBtn;
            Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
            updateAssetBtn.setVisibility(8);
            RdsButton deleteFromListBtn = getBinding().deleteFromListBtn;
            Intrinsics.checkNotNullExpressionValue(deleteFromListBtn, "deleteFromListBtn");
            deleteFromListBtn.setVisibility(8);
            return;
        }
        RdsButton addToListBtn = getBinding().addToListBtn;
        Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
        addToListBtn.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openNumpad$lambda$13$lambda$12(View view, AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
        view.clearFocus();
        acatsInPartialOptionAssetFragment.closeNumpad();
        return Unit.INSTANCE;
    }

    private final void closeNumpad() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).isEditMode()) {
            RdsButton updateAssetBtn = getBinding().updateAssetBtn;
            Intrinsics.checkNotNullExpressionValue(updateAssetBtn, "updateAssetBtn");
            updateAssetBtn.setVisibility(0);
            RdsButton deleteFromListBtn = getBinding().deleteFromListBtn;
            Intrinsics.checkNotNullExpressionValue(deleteFromListBtn, "deleteFromListBtn");
            deleteFromListBtn.setVisibility(0);
        } else {
            RdsButton addToListBtn = getBinding().addToListBtn;
            Intrinsics.checkNotNullExpressionValue(addToListBtn, "addToListBtn");
            addToListBtn.setVisibility(0);
        }
        setNumpadVisibility(false);
    }

    private final void setNumpadVisibility(boolean isVisible) {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$1
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
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$setNumpadVisibility$$inlined$beginDelayedTransition$2
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
        Transitions2.add(transitionSet, new SimpleSlide(0, 1, null));
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        RdsNumpadContainerView numpad = getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(isVisible ? 0 : 8);
    }

    private final void setEditingAssetUi(final UiAcatsAsset.OptionAsset asset) {
        FragmentAcatsInPartialOptionAssetBinding binding = getBinding();
        int i = WhenMappings.$EnumSwitchMapping$0[asset.getDirection().ordinal()];
        if (i == 1) {
            binding.positionLongRadioBtn.setChecked(true);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.positionShortRadioBtn.setChecked(true);
        }
        if (asset.getNumContracts() != null) {
            binding.quantitySpecificAmountRadioBtn.setChecked(true);
            RdsTextInputEditText numContractsEditText = binding.numContractsEditText;
            Intrinsics.checkNotNullExpressionValue(numContractsEditText, "numContractsEditText");
            TextViewsKt.setTextAndUpdateCursor(numContractsEditText, asset.getNumContracts().toString());
        } else {
            binding.quantityAllContractsRadioBtn.setChecked(true);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[asset.getOptionType().ordinal()];
        if (i2 == 1) {
            binding.putRadioRow.setChecked(true);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            binding.callRadioRow.setChecked(true);
        }
        String str = DateTimeFormatter.ofPattern("MMddyyyy").format(asset.getExpirationDate());
        RdsFormattedEditText expDateRowEditText = binding.expDateRowEditText;
        Intrinsics.checkNotNullExpressionValue(expDateRowEditText, "expDateRowEditText");
        TextViewsKt.setTextAndUpdateCursor(expDateRowEditText, str);
        binding.strikePriceEditText.setAmount(asset.getStrikePrice());
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
        OnClickListeners.onClick(deleteFromListBtn2, new Function0() { // from class: com.robinhood.android.acatsin.partials.option.AcatsInPartialOptionAssetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPartialOptionAssetFragment.setEditingAssetUi$lambda$16$lambda$15(this.f$0, asset);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEditingAssetUi$lambda$16$lambda$15(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, UiAcatsAsset.OptionAsset optionAsset) {
        acatsInPartialOptionAssetFragment.getCallbacks().onAssetRemoved(optionAsset);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "symbol", "", "assetToModify", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getAssetToModify", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "isEditMode", "", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiAcatsAsset.OptionAsset assetToModify;
        private final UUID instrumentId;
        private final String symbol;

        /* compiled from: AcatsInPartialOptionAssetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : UiAcatsAsset.OptionAsset.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, String str, UiAcatsAsset.OptionAsset optionAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 2) != 0) {
                str = args.symbol;
            }
            if ((i & 4) != 0) {
                optionAsset = args.assetToModify;
            }
            return args.copy(uuid, str, optionAsset);
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
        public final UiAcatsAsset.OptionAsset getAssetToModify() {
            return this.assetToModify;
        }

        public final Args copy(UUID instrumentId, String symbol, UiAcatsAsset.OptionAsset assetToModify) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new Args(instrumentId, symbol, assetToModify);
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
            return Intrinsics.areEqual(this.instrumentId, args.instrumentId) && Intrinsics.areEqual(this.symbol, args.symbol) && Intrinsics.areEqual(this.assetToModify, args.assetToModify);
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31;
            UiAcatsAsset.OptionAsset optionAsset = this.assetToModify;
            return iHashCode + (optionAsset == null ? 0 : optionAsset.hashCode());
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", assetToModify=" + this.assetToModify + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.symbol);
            UiAcatsAsset.OptionAsset optionAsset = this.assetToModify;
            if (optionAsset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                optionAsset.writeToParcel(dest, flags);
            }
        }

        public Args(UUID instrumentId, String symbol, UiAcatsAsset.OptionAsset optionAsset) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.instrumentId = instrumentId;
            this.symbol = symbol;
            this.assetToModify = optionAsset;
        }

        public /* synthetic */ Args(UUID uuid, String str, UiAcatsAsset.OptionAsset optionAsset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, (i & 4) != 0 ? null : optionAsset);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final UiAcatsAsset.OptionAsset getAssetToModify() {
            return this.assetToModify;
        }

        public final boolean isEditMode() {
            return this.assetToModify != null;
        }
    }

    /* compiled from: AcatsInPartialOptionAssetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AcatsInPartialOptionAssetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPartialOptionAssetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPartialOptionAssetFragment newInstance(Args args) {
            return (AcatsInPartialOptionAssetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPartialOptionAssetFragment acatsInPartialOptionAssetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPartialOptionAssetFragment, args);
        }
    }
}
