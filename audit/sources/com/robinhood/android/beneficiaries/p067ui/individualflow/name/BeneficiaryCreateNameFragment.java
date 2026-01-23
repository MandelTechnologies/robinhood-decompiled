package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateNameBinding;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.beneficiaries.p067ui.individualflow.name.BeneficiaryCreateNameFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.common.strings.C32428R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.text.CharacterSetInputFilter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryCreateNameFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 12\u00020\u0001:\u000201B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateNameBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateNameBinding;", "viewBinding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onBackPressed", "", "Callbacks", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateNameFragment extends BaseBeneficiaryCreateStepFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    private final BeneficiaryCreateStep step;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateNameFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateNameFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateNameBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Callbacks;", "", "onNameCompleted", "", "firstName", "", "lastName", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onNameCompleted(String firstName, String lastName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$7$lambda$6$lambda$4(int i) {
        return i == 6;
    }

    public BeneficiaryCreateNameFragment() {
        super(C9637R.layout.fragment_beneficiary_create_name);
        this.step = BeneficiaryCreateStep.NAME;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, BeneficiaryCreateNameDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateNameFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_NAME_INPUT, null, ((ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((Fragment) this)).getName_view_model().getLogging_identifier(), null, 10, null);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public BeneficiaryCreateStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public ApiCreateBeneficiaryConfiguration getConfiguration() {
        return (ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((Fragment) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryCreateNameDuxo getDuxo() {
        return (BeneficiaryCreateNameDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentBeneficiaryCreateNameBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateNameBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentBeneficiaryCreateNameBinding viewBinding = getViewBinding();
        RhTextView rhTextView = viewBinding.beneficiaryCreateNameTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getTitle());
        String subtitle_markdown = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getSubtitle_markdown();
        if (subtitle_markdown != null) {
            viewBinding.beneficiaryCreateNameSubtitle.setText(getMarkwon().toMarkdown(subtitle_markdown));
            RhTextView beneficiaryCreateNameSubtitle = viewBinding.beneficiaryCreateNameSubtitle;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateNameSubtitle, "beneficiaryCreateNameSubtitle");
            beneficiaryCreateNameSubtitle.setVisibility(0);
        }
        String string2 = getString(C32428R.string.onboarding_valid_english_characters_charset);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CharacterSetInputFilter characterSetInputFilter = new CharacterSetInputFilter(StringsKt.toSet(string2), false);
        RdsTextInputEditText rdsTextInputEditText = viewBinding.beneficiaryCreateNameFirstNameEdt;
        rdsTextInputEditText.setHint(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getFirst_name_hint());
        rdsTextInputEditText.setFilters(new CharacterSetInputFilter[]{characterSetInputFilter});
        Intrinsics.checkNotNull(rdsTextInputEditText);
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(rdsTextInputEditText), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateNameFragment.onViewCreated$lambda$7$lambda$2$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        Editable text = rdsTextInputEditText.getText();
        if (text == null || text.length() == 0) {
            rdsTextInputEditText.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getFirst_name_value());
        }
        RdsTextInputEditText rdsTextInputEditText2 = viewBinding.beneficiaryCreateNameLastNameEdt;
        rdsTextInputEditText2.setHint(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getLast_name_hint());
        rdsTextInputEditText2.setFilters(new CharacterSetInputFilter[]{characterSetInputFilter});
        Intrinsics.checkNotNull(rdsTextInputEditText2);
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(rdsTextInputEditText2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateNameFragment.onViewCreated$lambda$7$lambda$6$lambda$3(this.f$0, (CharSequence) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.editorActions(rdsTextInputEditText2, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BeneficiaryCreateNameFragment.onViewCreated$lambda$7$lambda$6$lambda$4(((Integer) obj).intValue()));
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateNameFragment.onViewCreated$lambda$7$lambda$6$lambda$5(viewBinding, ((Integer) obj).intValue());
            }
        });
        Editable text2 = rdsTextInputEditText2.getText();
        if (text2 == null || text2.length() == 0) {
            rdsTextInputEditText2.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getName_view_model().getLast_name_value());
        }
        BaseFragment.collectDuxoState$default(this, null, new C97352(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$2$lambda$1(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment, CharSequence firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        beneficiaryCreateNameFragment.getDuxo().setFirstName(StringsKt.trim(firstName.toString()).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$3(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment, CharSequence lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        beneficiaryCreateNameFragment.getDuxo().setLastName(StringsKt.trim(lastName.toString()).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(FragmentBeneficiaryCreateNameBinding fragmentBeneficiaryCreateNameBinding, int i) {
        fragmentBeneficiaryCreateNameBinding.beneficiaryCreateNameContinue.performClick();
        return Unit.INSTANCE;
    }

    /* compiled from: BeneficiaryCreateNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2", m3645f = "BeneficiaryCreateNameFragment.kt", m3646l = {112}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2 */
    static final class C97352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97352(Continuation<? super C97352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryCreateNameFragment.this.new C97352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<BeneficiaryCreateNameViewState> stateFlow = BeneficiaryCreateNameFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<FullName>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2", m3645f = "BeneficiaryCreateNameFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                FullName fullName = ((BeneficiaryCreateNameViewState) obj).getFullName();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(fullName, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super FullName> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(BeneficiaryCreateNameFragment.this);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: BeneficiaryCreateNameFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ BeneficiaryCreateNameFragment this$0;

            AnonymousClass2(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment) {
                this.this$0 = beneficiaryCreateNameFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((FullName) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(FullName fullName, Continuation<? super Unit> continuation) {
                RdsButton beneficiaryCreateNameContinue = this.this$0.getViewBinding().beneficiaryCreateNameContinue;
                Intrinsics.checkNotNullExpressionValue(beneficiaryCreateNameContinue, "beneficiaryCreateNameContinue");
                if (fullName == null) {
                    beneficiaryCreateNameContinue.setOnClickListener(null);
                    beneficiaryCreateNameContinue.setEnabled(false);
                } else {
                    final String firstName = fullName.getFirstName();
                    final String lastName = fullName.getLastName();
                    final BeneficiaryCreateNameFragment beneficiaryCreateNameFragment = this.this$0;
                    OnClickListeners.onClick(beneficiaryCreateNameContinue, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$onViewCreated$2$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BeneficiaryCreateNameFragment.C97352.AnonymousClass2.emit$lambda$0(beneficiaryCreateNameFragment, firstName, lastName);
                        }
                    });
                    beneficiaryCreateNameContinue.setEnabled(true);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$0(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment, String str, String str2) {
                View viewRequireView = beneficiaryCreateNameFragment.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
                beneficiaryCreateNameFragment.getCallbacks().onNameCompleted(str, str2);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText beneficiaryCreateNameFirstNameEdt = getViewBinding().beneficiaryCreateNameFirstNameEdt;
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateNameFirstNameEdt, "beneficiaryCreateNameFirstNameEdt");
        BaseFragment.keyboardFocusOn$default(this, beneficiaryCreateNameFirstNameEdt, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
        return super.onBackPressed();
    }

    /* compiled from: BeneficiaryCreateNameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateNameFragment, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment) {
            return (ApiCreateBeneficiaryConfiguration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateNameFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateNameFragment newInstance(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            return (BeneficiaryCreateNameFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiCreateBeneficiaryConfiguration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateNameFragment beneficiaryCreateNameFragment, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateNameFragment, apiCreateBeneficiaryConfiguration);
        }
    }
}
