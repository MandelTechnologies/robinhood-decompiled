package com.robinhood.android.beneficiaries.p067ui.individualflow.email;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateEmailBinding;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: BeneficiaryCreateEmailFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateEmailBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateEmailBinding;", "viewBinding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onBackPressed", "", "Callbacks", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateEmailFragment extends BaseBeneficiaryCreateStepFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;
    private final BeneficiaryCreateStep step;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateEmailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateEmailFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateEmailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Callbacks;", "", "onSubmitEmail", "", "email", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitEmail(String email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$6$lambda$4(int i) {
        return i == 6;
    }

    public BeneficiaryCreateEmailFragment() {
        super(C9637R.layout.fragment_beneficiary_create_email);
        this.step = BeneficiaryCreateStep.EMAIL;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateEmailFragment3.INSTANCE);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_EMAIL_INPUT, null, ((ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((Fragment) this)).getEmail_view_model().getLogging_identifier(), null, 10, null);
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

    private final FragmentBeneficiaryCreateEmailBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateEmailBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RhTextView rhTextView = getViewBinding().beneficiaryCreateEmailTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getEmail_view_model().getTitle());
        String subtitle_markdown = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getEmail_view_model().getSubtitle_markdown();
        if (subtitle_markdown != null) {
            getViewBinding().beneficiaryCreateEmailSubtitle.setText(getMarkwon().toMarkdown(subtitle_markdown));
            RhTextView beneficiaryCreateEmailSubtitle = getViewBinding().beneficiaryCreateEmailSubtitle;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateEmailSubtitle, "beneficiaryCreateEmailSubtitle");
            beneficiaryCreateEmailSubtitle.setVisibility(0);
        }
        RdsButton rdsButton = getViewBinding().beneficiaryCreateEmailContinue;
        if (((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getAccount_view_model() == null) {
            i = C9637R.string.beneficiary_create_save;
        } else {
            i = C11048R.string.general_label_continue;
        }
        rdsButton.setText(i);
        RdsButton beneficiaryCreateEmailContinue = getViewBinding().beneficiaryCreateEmailContinue;
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateEmailContinue, "beneficiaryCreateEmailContinue");
        ViewsKt.eventData$default(beneficiaryCreateEmailContinue, false, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryCreateEmailFragment.onViewCreated$lambda$1();
            }
        }, 1, null);
        final RdsTextInputEditText rdsTextInputEditText = getViewBinding().beneficiaryCreateNameEmailEdt;
        rdsTextInputEditText.setHint(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getEmail_view_model().getEmail_hint());
        Intrinsics.checkNotNull(rdsTextInputEditText);
        Observable observableDistinctUntilChanged = RxTextView.textChanges(rdsTextInputEditText).map(new Function() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$onViewCreated$3$1
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.trim(it.toString()).toString();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateEmailFragment.onViewCreated$lambda$6$lambda$3(this.f$0, rdsTextInputEditText, (String) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.editorActions(rdsTextInputEditText, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BeneficiaryCreateEmailFragment.onViewCreated$lambda$6$lambda$4(((Integer) obj).intValue()));
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateEmailFragment.onViewCreated$lambda$6$lambda$5(this.f$0, ((Integer) obj).intValue());
            }
        });
        Editable text = rdsTextInputEditText.getText();
        if (text == null || text.length() == 0) {
            rdsTextInputEditText.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getEmail_view_model().getEmail_value());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$1() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SAVE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$3(final BeneficiaryCreateEmailFragment beneficiaryCreateEmailFragment, final RdsTextInputEditText rdsTextInputEditText, final String str) {
        Validation validation = Validation.INSTANCE;
        Intrinsics.checkNotNull(str);
        if (validation.isEmailValid(str)) {
            RdsButton beneficiaryCreateEmailContinue = beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateEmailContinue, "beneficiaryCreateEmailContinue");
            OnClickListeners.onClick(beneficiaryCreateEmailContinue, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeneficiaryCreateEmailFragment.onViewCreated$lambda$6$lambda$3$lambda$2(this.f$0, rdsTextInputEditText, str);
                }
            });
            beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue.setEnabled(true);
        } else {
            beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue.setOnClickListener(null);
            beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$3$lambda$2(BeneficiaryCreateEmailFragment beneficiaryCreateEmailFragment, RdsTextInputEditText rdsTextInputEditText, String str) {
        View viewRequireView = beneficiaryCreateEmailFragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        com.robinhood.utils.extensions.ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
        rdsTextInputEditText.setEnabled(false);
        beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue.setLoading(true);
        Callbacks callbacks = beneficiaryCreateEmailFragment.getCallbacks();
        Intrinsics.checkNotNull(str);
        callbacks.onSubmitEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(BeneficiaryCreateEmailFragment beneficiaryCreateEmailFragment, int i) {
        beneficiaryCreateEmailFragment.getViewBinding().beneficiaryCreateEmailContinue.performClick();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText beneficiaryCreateNameEmailEdt = getViewBinding().beneficiaryCreateNameEmailEdt;
        Intrinsics.checkNotNullExpressionValue(beneficiaryCreateNameEmailEdt, "beneficiaryCreateNameEmailEdt");
        BaseFragment.keyboardFocusOn$default(this, beneficiaryCreateNameEmailEdt, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        com.robinhood.utils.extensions.ViewsKt.hideKeyboard$default(viewRequireView, false, 1, null);
        return super.onBackPressed();
    }

    /* compiled from: BeneficiaryCreateEmailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateEmailFragment, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateEmailFragment beneficiaryCreateEmailFragment) {
            return (ApiCreateBeneficiaryConfiguration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateEmailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateEmailFragment newInstance(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            return (BeneficiaryCreateEmailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiCreateBeneficiaryConfiguration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateEmailFragment beneficiaryCreateEmailFragment, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateEmailFragment, apiCreateBeneficiaryConfiguration);
        }
    }
}
