package com.robinhood.android.acatsin.dtcentry;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInDtcEntryBinding;
import com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryContract;
import com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryEvent;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
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

/* compiled from: AcatsInDtcEntryFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0016J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInDtcEntryBinding;", "getBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInDtcEntryBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showDtcNumberBottomSheet", "onStart", "setViewState", "state", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInDtcEntryFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInDtcEntryFragment.class, "binding", "getBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInDtcEntryBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInDtcEntryFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInDtcEntryFragment() {
        super(C7725R.layout.fragment_acats_in_dtc_entry, null, AcatsFlowStep.MANUAL_BROKERAGE_ENTRY, 2, null);
        this.binding = ViewBinding5.viewBinding(this, AcatsInDtcEntryFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInDtcEntryDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInDtcEntryContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInDtcEntryContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInDtcEntryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryFragment;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInDtcEntryFragment, AcatsInDtcEntryContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInDtcEntryContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInDtcEntryContract.Key getArgs(AcatsInDtcEntryFragment acatsInDtcEntryFragment) {
            return (AcatsInDtcEntryContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInDtcEntryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInDtcEntryFragment newInstance(AcatsInDtcEntryContract.Key key) {
            return (AcatsInDtcEntryFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInDtcEntryFragment acatsInDtcEntryFragment, AcatsInDtcEntryContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInDtcEntryFragment, key);
        }
    }

    private final FragmentAcatsInDtcEntryBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInDtcEntryBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInDtcEntryDuxo getDuxo() {
        return (AcatsInDtcEntryDuxo) this.duxo.getValue();
    }

    private final AcatsInDtcEntryContract.Callbacks getCallbacks() {
        return (AcatsInDtcEntryContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_DTC_ENTRY, ((AcatsInDtcEntryContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().getSource(), null, null, 12, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInDtcEntryContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C79041(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C79052(null), 1, null);
        FragmentAcatsInDtcEntryBinding binding = getBinding();
        LifecycleHost.DefaultImpls.bind$default(this, binding.numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInDtcEntryFragment3(binding.dtcNumberEdt));
        RdsTextInputEditText dtcNumberEdt = binding.dtcNumberEdt;
        Intrinsics.checkNotNullExpressionValue(dtcNumberEdt, "dtcNumberEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(dtcNumberEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInDtcEntryFragment4(getDuxo()));
        RdsTextButton rdsTextButton = binding.learnDtcNumberTxt;
        Intrinsics.checkNotNull(rdsTextButton);
        ViewsKt.eventData$default(rdsTextButton, false, new Function0() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInDtcEntryFragment.onViewCreated$lambda$3$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInDtcEntryFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: AcatsInDtcEntryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$1", m3645f = "AcatsInDtcEntryFragment.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$1 */
    static final class C79041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79041(Continuation<? super C79041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInDtcEntryFragment.this.new C79041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInDtcEntryFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInDtcEntryFragment $tmp0;

            AnonymousClass1(AcatsInDtcEntryFragment acatsInDtcEntryFragment) {
                this.$tmp0 = acatsInDtcEntryFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInDtcEntryFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInDtcEntryViewState acatsInDtcEntryViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C79041.invokeSuspend$setViewState(this.$tmp0, acatsInDtcEntryViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInDtcEntryViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInDtcEntryFragment acatsInDtcEntryFragment, AcatsInDtcEntryViewState acatsInDtcEntryViewState, Continuation continuation) {
            acatsInDtcEntryFragment.setViewState(acatsInDtcEntryViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInDtcEntryViewState> stateFlow = AcatsInDtcEntryFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInDtcEntryFragment.this);
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

    /* compiled from: AcatsInDtcEntryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$2", m3645f = "AcatsInDtcEntryFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$2 */
    static final class C79052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79052(Continuation<? super C79052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInDtcEntryFragment.this.new C79052(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInDtcEntryEvent>> eventFlow = AcatsInDtcEntryFragment.this.getDuxo().getEventFlow();
                final AcatsInDtcEntryFragment acatsInDtcEntryFragment = AcatsInDtcEntryFragment.this;
                FlowCollector<? super Event<AcatsInDtcEntryEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInDtcEntryEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsInDtcEntryEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInDtcEntryEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInDtcEntryFragment acatsInDtcEntryFragment2 = acatsInDtcEntryFragment;
                            if ((event.getData() instanceof AcatsInDtcEntryEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10737invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10737invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInDtcEntryFragment2.handleEvent((AcatsInDtcEntryEvent) event.getData());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$3$lambda$2$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(AcatsInDtcEntryFragment acatsInDtcEntryFragment) {
        acatsInDtcEntryFragment.showDtcNumberBottomSheet();
        return Unit.INSTANCE;
    }

    private final void showDtcNumberBottomSheet() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, resources.getString(C7725R.string.acats_dtc_entry_help), null, resources.getString(C7725R.string.acats_dtc_entry_help_description), null, resources.getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "dtc_help");
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AcatsInDtcEntryViewState state) {
        boolean zIsContinueButtonEnabled = state.isContinueButtonEnabled();
        FragmentAcatsInDtcEntryBinding binding = getBinding();
        binding.continueBtn.setEnabled(zIsContinueButtonEnabled);
        binding.continueBtn.setLoading(state.isButtonLoading());
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        OnClickListeners.onClick(continueBtn, new Function0() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInDtcEntryFragment.setViewState$lambda$6$lambda$5(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$6$lambda$5(AcatsInDtcEntryViewState acatsInDtcEntryViewState, AcatsInDtcEntryFragment acatsInDtcEntryFragment) {
        String dtcNumber = acatsInDtcEntryViewState.getDtcNumber();
        if (dtcNumber != null) {
            acatsInDtcEntryFragment.getDuxo().validateDtcNumber(dtcNumber);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInDtcEntryEvent event) {
        if (event instanceof AcatsInDtcEntryEvent.ValidationResponseEvent) {
            AcatsInDtcEntryEvent.ValidationResponseEvent validationResponseEvent = (AcatsInDtcEntryEvent.ValidationResponseEvent) event;
            GenericAlert error = validationResponseEvent.getResponse().getError();
            if (error == null) {
                String dtcNumber = validationResponseEvent.getDtcNumber();
                if (dtcNumber != null) {
                    getCallbacks().onDtcNumberEntered(dtcNumber);
                    return;
                }
                return;
            }
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(error, false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "dtc-number-error-alert");
            return;
        }
        if (!(event instanceof AcatsInDtcEntryEvent.NetworkErrorEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsInDtcEntryEvent.NetworkErrorEvent) event).getError(), false, 2, null);
    }
}
