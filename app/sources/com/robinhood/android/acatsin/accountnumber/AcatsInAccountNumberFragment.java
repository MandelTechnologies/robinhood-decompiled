package com.robinhood.android.acatsin.accountnumber;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInAccountNumberBinding;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberContract;
import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberEvent;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.staticcontent.p258ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
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
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInAccountNumberFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAccountNumberBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAccountNumberBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showAccountNumberBottomSheet", "contentfulId", "", "setViewState", "viewState", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberEvent;", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAccountNumberFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInAccountNumberFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInAccountNumberBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInAccountNumberFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Callbacks;", 0))};

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

    public AcatsInAccountNumberFragment() {
        super(C7686R.layout.fragment_acats_in_account_number, null, AcatsFlowStep.ENTER_ACCOUNT_NUMBER, 2, null);
        this.duxo = DuxosKt.duxo(this, AcatsInAccountNumberDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AcatsInAccountNumberFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAccountNumberContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInAccountNumberContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberFragment;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInAccountNumberFragment, AcatsInAccountNumberContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInAccountNumberContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInAccountNumberContract.Key getArgs(AcatsInAccountNumberFragment acatsInAccountNumberFragment) {
            return (AcatsInAccountNumberContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInAccountNumberFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInAccountNumberFragment newInstance(AcatsInAccountNumberContract.Key key) {
            return (AcatsInAccountNumberFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInAccountNumberFragment acatsInAccountNumberFragment, AcatsInAccountNumberContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInAccountNumberFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInAccountNumberDuxo getDuxo() {
        return (AcatsInAccountNumberDuxo) this.duxo.getValue();
    }

    private final FragmentAcatsInAccountNumberBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInAccountNumberBinding) value;
    }

    private final AcatsInAccountNumberContract.Callbacks getCallbacks() {
        return (AcatsInAccountNumberContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_ACCOUNT_NUMBER_ENTRY;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInAccountNumberContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInAccountNumberContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInAccountNumberContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((AcatsInAccountNumberContract.Key) INSTANCE.getArgs((Fragment) this)).isAcatsRetry()) {
            return;
        }
        super.configureToolbar(toolbar);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C77541(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C77552(null), 1, null);
        getBinding().accountNumberEdt.setFilters(new InputFilter[]{new InputFilter() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment.onViewCreated.3
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
                for (int i5 = 0; i5 < charSequenceSubSequence.length(); i5++) {
                    if (CharsKt.isSurrogate(charSequenceSubSequence.charAt(i5))) {
                        return "";
                    }
                }
                return null;
            }
        }});
        RdsTextInputEditText accountNumberEdt = getBinding().accountNumberEdt;
        Intrinsics.checkNotNullExpressionValue(accountNumberEdt, "accountNumberEdt");
        Observable<CharSequence> observableShare = RxTextView.textChanges(accountNumberEdt).share();
        Intrinsics.checkNotNull(observableShare);
        LifecycleHost.DefaultImpls.bind$default(this, observableShare, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAccountNumberFragment.onViewCreated$lambda$0(this.f$0, (CharSequence) obj);
            }
        });
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        Observable<R> observableWithLatestFrom = RxView.clicks(continueBtn).withLatestFrom(observableShare, (BiFunction<? super Unit, ? super U, ? extends R>) new BiFunction() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment.onViewCreated.5
            @Override // io.reactivex.functions.BiFunction
            public final CharSequence apply(Unit unit, CharSequence accountNumber) {
                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return accountNumber;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableWithLatestFrom, "withLatestFrom(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableWithLatestFrom, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInAccountNumberFragment.onViewCreated$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* compiled from: AcatsInAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$1", m3645f = "AcatsInAccountNumberFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$1 */
    static final class C77541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77541(Continuation<? super C77541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAccountNumberFragment.this.new C77541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInAccountNumberFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInAccountNumberFragment $tmp0;

            AnonymousClass1(AcatsInAccountNumberFragment acatsInAccountNumberFragment) {
                this.$tmp0 = acatsInAccountNumberFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInAccountNumberFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInAccountNumberViewState acatsInAccountNumberViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C77541.invokeSuspend$setViewState(this.$tmp0, acatsInAccountNumberViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInAccountNumberViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInAccountNumberViewState> stateFlow = AcatsInAccountNumberFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInAccountNumberFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInAccountNumberFragment acatsInAccountNumberFragment, AcatsInAccountNumberViewState acatsInAccountNumberViewState, Continuation continuation) throws Resources.NotFoundException {
            acatsInAccountNumberFragment.setViewState(acatsInAccountNumberViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsInAccountNumberFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$2", m3645f = "AcatsInAccountNumberFragment.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$2 */
    static final class C77552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77552(Continuation<? super C77552> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAccountNumberFragment.this.new C77552(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInAccountNumberEvent>> eventFlow = AcatsInAccountNumberFragment.this.getDuxo().getEventFlow();
                final AcatsInAccountNumberFragment acatsInAccountNumberFragment = AcatsInAccountNumberFragment.this;
                FlowCollector<? super Event<AcatsInAccountNumberEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInAccountNumberEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsInAccountNumberEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInAccountNumberEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInAccountNumberFragment acatsInAccountNumberFragment2 = acatsInAccountNumberFragment;
                            if ((event.getData() instanceof AcatsInAccountNumberEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10697invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10697invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInAccountNumberFragment2.handleEvent((AcatsInAccountNumberEvent) event.getData());
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
    public static final Unit onViewCreated$lambda$0(AcatsInAccountNumberFragment acatsInAccountNumberFragment, CharSequence charSequence) {
        RdsButton rdsButton = acatsInAccountNumberFragment.getBinding().continueBtn;
        Intrinsics.checkNotNull(charSequence);
        rdsButton.setEnabled(!StringsKt.isBlank(charSequence));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AcatsInAccountNumberFragment acatsInAccountNumberFragment, CharSequence charSequence) {
        acatsInAccountNumberFragment.getDuxo().validateAccountNumber(charSequence.toString());
        FragmentActivity fragmentActivityRequireActivity = acatsInAccountNumberFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    private final void showAccountNumberBottomSheet(String contentfulId) throws Resources.NotFoundException {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragment;
        if (getChildFragmentManager().findFragmentByTag("account_number") == null) {
            if (contentfulId != null) {
                OtherMarkdownBottomSheetDialogFragment.Companion companion = OtherMarkdownBottomSheetDialogFragment.INSTANCE;
                String string2 = getResources().getString(C7686R.string.acats_account_number_cant_find_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = getResources().getString(C7686R.string.acats_account_number_cant_find_body);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = getResources().getString(C11048R.string.general_label_got_it);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                baseBottomSheetDialogFragment = (BaseBottomSheetDialogFragment) companion.newInstance((Parcelable) new OtherMarkdownBottomSheetDialogFragment.Args(contentfulId, string2, string3, string4));
            } else {
                baseBottomSheetDialogFragment = (BaseBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, getResources().getString(C7686R.string.acats_account_number_cant_find_title), null, getResources().getString(C7686R.string.acats_account_number_cant_find_body), null, getResources().getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseBottomSheetDialogFragment.show(childFragmentManager, "account_number");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AcatsInAccountNumberViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        RhTextView accountNumberPageSubtitleTxt = getBinding().accountNumberPageSubtitleTxt;
        Intrinsics.checkNotNullExpressionValue(accountNumberPageSubtitleTxt, "accountNumberPageSubtitleTxt");
        StringResource subtitleText = viewState.getSubtitleText();
        if (subtitleText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = subtitleText.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(accountNumberPageSubtitleTxt, text);
        ImageView contraBrokerChip = getBinding().contraBrokerChip;
        Intrinsics.checkNotNullExpressionValue(contraBrokerChip, "contraBrokerChip");
        contraBrokerChip.setVisibility(viewState.getContraBrokerageLogo() != null ? 0 : 8);
        Bitmap contraBrokerageLogo = viewState.getContraBrokerageLogo();
        if (contraBrokerageLogo != null) {
            getBinding().contraBrokerChip.setImageBitmap(contraBrokerageLogo);
        }
        getBinding().contraBrokerNameAndAccountType.setText(viewState.getBrokerName());
        RdsTextInputEditText rdsTextInputEditText = getBinding().accountNumberEdt;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rdsTextInputEditText.setHint(viewState.getAccountNumberHint(resources2));
        RhTextView accountNumberValidationHint = getBinding().accountNumberValidationHint;
        Intrinsics.checkNotNullExpressionValue(accountNumberValidationHint, "accountNumberValidationHint");
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        TextViewsKt.setVisibilityText(accountNumberValidationHint, viewState.getValidationHint(resources3));
        RdsTextButton rdsTextButton = getBinding().accountNumberCantFind;
        Intrinsics.checkNotNull(rdsTextButton);
        ViewsKt.eventData$default(rdsTextButton, false, new Function0() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInAccountNumberFragment.setViewState$lambda$5$lambda$3();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInAccountNumberFragment.setViewState$lambda$5$lambda$4(this.f$0, viewState);
            }
        });
        getBinding().continueBtn.setLoading(viewState.isButtonLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setViewState$lambda$5$lambda$3() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$5$lambda$4(AcatsInAccountNumberFragment acatsInAccountNumberFragment, AcatsInAccountNumberViewState acatsInAccountNumberViewState) throws Resources.NotFoundException {
        acatsInAccountNumberFragment.showAccountNumberBottomSheet(acatsInAccountNumberViewState.getFindAccountNumberContentId());
        return Unit.INSTANCE;
    }

    public final void handleEvent(AcatsInAccountNumberEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AcatsInAccountNumberEvent.AccountNumberToValidationResponseEvent) {
            AcatsInAccountNumberEvent.AccountNumberToValidationResponseEvent accountNumberToValidationResponseEvent = (AcatsInAccountNumberEvent.AccountNumberToValidationResponseEvent) event;
            UiAcatsValidationResponse response = accountNumberToValidationResponseEvent.getResponse();
            GenericAlert error = response != null ? response.getError() : null;
            if (error != null) {
                Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(error, false, false, C7686R.id.dialog_id_account_number_validation_error, 6, (DefaultConstructorMarker) null), null, 2, null).show(getChildFragmentManager(), "account-number-error-alert");
                return;
            } else {
                getCallbacks().onAccountNumberEntered(accountNumberToValidationResponseEvent.getAccountNumber());
                return;
            }
        }
        if (event instanceof AcatsInAccountNumberEvent.NetworkErrorEvent) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsInAccountNumberEvent.NetworkErrorEvent) event).getThrowable(), false, 2, null);
        }
    }
}
