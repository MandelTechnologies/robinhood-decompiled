package com.robinhood.android.beneficiaries.p067ui.individualflow.dob;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateDobBinding;
import com.robinhood.android.beneficiaries.extension.Fragments;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQuery;

/* compiled from: BeneficiaryCreateDobFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateDobBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateDobBinding;", "viewBinding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setViewState", "viewState", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobViewState;", "Callbacks", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateDobFragment extends BaseBeneficiaryCreateStepFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    private final BeneficiaryCreateStep step;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateDobFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateDobFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateDobBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateDobFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Callbacks;", "", "j$/time/LocalDate", "dob", "", "onDobCompleted", "(Lj$/time/LocalDate;)V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDobCompleted(LocalDate dob);
    }

    public BeneficiaryCreateDobFragment() {
        super(C9637R.layout.fragment_beneficiary_create_dob);
        this.step = BeneficiaryCreateStep.DOB;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, BeneficiaryCreateDobDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateDobFragment5.INSTANCE);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_DOB_INPUT, null, ((ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((Fragment) this)).getDob_view_model().getLogging_identifier(), null, 10, null);
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final BeneficiaryCreateDobDuxo getDuxo() {
        return (BeneficiaryCreateDobDuxo) this.duxo.getValue();
    }

    private final FragmentBeneficiaryCreateDobBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateDobBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RhTextView rhTextView = getViewBinding().beneficiaryCreateDobTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getTitle());
        String subtitle_markdown = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getSubtitle_markdown();
        if (subtitle_markdown != null) {
            getViewBinding().beneficiaryCreateDobSubtitle.setText(getMarkwon().toMarkdown(subtitle_markdown));
            RhTextView beneficiaryCreateDobSubtitle = getViewBinding().beneficiaryCreateDobSubtitle;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateDobSubtitle, "beneficiaryCreateDobSubtitle");
            beneficiaryCreateDobSubtitle.setVisibility(0);
        }
        getViewBinding().beneficiaryCreateDobEdt.setHint(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getDob_hint());
        getViewBinding().beneficiaryCreateDobEdt.setTemplate(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getDob_template(), ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getDob_hint());
        getViewBinding().beneficiaryCreateNumpadContainer.useDefaultKeyHandler();
        getViewBinding().beneficiaryCreateNumpadContainer.setButtonEnabled(false);
        final DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getAndroid_format_template());
        final RdsFormattedEditText rdsFormattedEditText = getViewBinding().beneficiaryCreateDobEdt;
        Intrinsics.checkNotNull(rdsFormattedEditText);
        Observable map = RxTextView.textChanges(rdsFormattedEditText).map(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$onViewCreated$2$1
            @Override // io.reactivex.functions.Function
            public final Tuples2<String, Boolean> apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(rdsFormattedEditText.getTypedText(), Boolean.valueOf(rdsFormattedEditText.isValid()));
            }
        }).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$onViewCreated$2$2
            @Override // io.reactivex.functions.Function
            public final Optional<LocalDate> apply(Tuples2<String, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                String strComponent1 = tuples2.component1();
                if (tuples2.component2().booleanValue()) {
                    try {
                        return Optional3.asOptional(dateTimeFormatterOfPattern.parse(strComponent1, new TemporalQuery() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$onViewCreated$2$2.1
                            @Override // p479j$.time.temporal.TemporalQuery
                            public final LocalDate queryFrom(TemporalAccessor temporalAccessor) {
                                return LocalDate.from(temporalAccessor);
                            }
                        }));
                    } catch (DateTimeException unused) {
                        return Optional2.INSTANCE;
                    }
                }
                return Optional2.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateDobFragment.onViewCreated$lambda$3$lambda$2(this.f$0, (Optional) obj);
            }
        });
        if (rdsFormattedEditText.getTypedText().length() == 0) {
            LocalDate dob_value = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getDob_view_model().getDob_value();
            rdsFormattedEditText.setText(dob_value != null ? dateTimeFormatterOfPattern.format(dob_value) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(final BeneficiaryCreateDobFragment beneficiaryCreateDobFragment, Optional optional) {
        final LocalDate localDate = (LocalDate) optional.component1();
        if (localDate == null) {
            beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateNumpadContainer.setButtonEnabled(false);
            beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateNumpadContainer.setOnButtonClick(null);
        } else {
            beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateNumpadContainer.setButtonEnabled(true);
            beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateNumpadContainer.setOnButtonClick(new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeneficiaryCreateDobFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f$0, localDate);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(BeneficiaryCreateDobFragment beneficiaryCreateDobFragment, LocalDate localDate) {
        beneficiaryCreateDobFragment.getDuxo().validateDob(localDate);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C97181(this));
        Observable<BeneficiaryCreateDobViewState> states = getDuxo().getStates();
        final C97192 c97192 = new PropertyReference1Impl() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment.onResume.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((BeneficiaryCreateDobViewState) obj).isInputEnabled());
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c97192) { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c97192, "function");
                this.function = c97192;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateDobFragment.onResume$lambda$4(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: BeneficiaryCreateDobFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment$onResume$1 */
    /* synthetic */ class C97181 extends FunctionReferenceImpl implements Function1<BeneficiaryCreateDobViewState, Unit> {
        C97181(Object obj) {
            super(1, obj, BeneficiaryCreateDobFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BeneficiaryCreateDobViewState beneficiaryCreateDobViewState) throws Throwable {
            invoke2(beneficiaryCreateDobViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BeneficiaryCreateDobViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BeneficiaryCreateDobFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(BeneficiaryCreateDobFragment beneficiaryCreateDobFragment, Boolean bool) {
        RdsFormattedEditText rdsFormattedEditText = beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateDobEdt;
        Intrinsics.checkNotNull(bool);
        rdsFormattedEditText.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            beneficiaryCreateDobFragment.getViewBinding().beneficiaryCreateDobEdt.requestFocus();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(BeneficiaryCreateDobViewState viewState) throws Throwable {
        GenericAlertContent<GenericAction> genericAlertContentConsume;
        Throwable thConsume;
        LocalDate localDateConsume;
        UiEvent<LocalDate> success = viewState.getSuccess();
        if (success != null && (localDateConsume = success.consume()) != null) {
            getCallbacks().onDobCompleted(localDateConsume);
        }
        UiEvent<Throwable> error = viewState.getError();
        if (error != null && (thConsume = error.consume()) != null && !AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            throw thConsume;
        }
        UiEvent<GenericAlertContent<GenericAction>> validationError = viewState.getValidationError();
        if (validationError != null && (genericAlertContentConsume = validationError.consume()) != null) {
            setSheetListener(Fragments.showSduiAlertSheet(this, genericAlertContentConsume, getMarkwon()));
        }
        getViewBinding().beneficiaryCreateNumpadContainer.setButtonLoading(viewState.isLoading());
    }

    /* compiled from: BeneficiaryCreateDobFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateDobFragment, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateDobFragment beneficiaryCreateDobFragment) {
            return (ApiCreateBeneficiaryConfiguration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateDobFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateDobFragment newInstance(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            return (BeneficiaryCreateDobFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiCreateBeneficiaryConfiguration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateDobFragment beneficiaryCreateDobFragment, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateDobFragment, apiCreateBeneficiaryConfiguration);
        }
    }
}
