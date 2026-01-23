package com.robinhood.android.taxcertification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.taxcertification.VerifyTaxInfoDestination;
import com.robinhood.android.taxcertification.databinding.FragmentCheckSsnBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: CheckSsnFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001cH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/taxcertification/CheckSsnFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/taxcertification/databinding/FragmentCheckSsnBinding;", "getBinding", "()Lcom/robinhood/android/taxcertification/databinding/FragmentCheckSsnBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/taxcertification/CheckSsnDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcertification/CheckSsnDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "receiver", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "getReceiver", "()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "receiver$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindInput", "onStart", "onResume", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "bindViewState", "state", "Lcom/robinhood/android/taxcertification/CheckSsnViewState;", "showSsnVerifiedDialog", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CheckSsnFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CheckSsnFragment.class, "binding", "getBinding()Lcom/robinhood/android/taxcertification/databinding/FragmentCheckSsnBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CheckSsnFragment.class, "receiver", "getReceiver()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SSN_VERIFIED_DIALOG_TAG = "ssnVerified";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: receiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 receiver;

    /* compiled from: CheckSsnFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckSsnViewState2.values().length];
            try {
                iArr[CheckSsnViewState2.PASSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckSsnViewState2.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckSsnViewState2.LOCKED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckSsnViewState2.OTHER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckSsnFragment() {
        super(C29286R.layout.fragment_check_ssn);
        this.binding = ViewBinding5.viewBinding(this, CheckSsnFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, CheckSsnDuxo.class);
        this.receiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(VerifyTaxInfoDestination.Receiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.taxcertification.CheckSsnFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
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

    private final FragmentCheckSsnBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCheckSsnBinding) value;
    }

    private final CheckSsnDuxo getDuxo() {
        return (CheckSsnDuxo) this.duxo.getValue();
    }

    private final VerifyTaxInfoDestination.Receiver getReceiver() {
        return (VerifyTaxInfoDestination.Receiver) this.receiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        bindInput();
    }

    private final void bindInput() {
        final FragmentCheckSsnBinding binding = getBinding();
        requireActivity().getWindow().setSoftInputMode(3);
        RdsTextInputEditText ssnInputEditText = binding.ssnInputEditText;
        Intrinsics.checkNotNullExpressionValue(ssnInputEditText, "ssnInputEditText");
        Observable<R> map = RxTextView.textChanges(ssnInputEditText).map(new Function() { // from class: com.robinhood.android.taxcertification.CheckSsnFragment$bindInput$1$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(binding.ssnInputEditText.isValid());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.taxcertification.CheckSsnFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckSsnFragment.bindInput$lambda$2$lambda$0(binding, (Boolean) obj);
            }
        });
        binding.checkSsnNumpad.useDefaultKeyHandler();
        RdsButton checkSsnCta = binding.checkSsnCta;
        Intrinsics.checkNotNullExpressionValue(checkSsnCta, "checkSsnCta");
        OnClickListeners.onClick(checkSsnCta, new Function0() { // from class: com.robinhood.android.taxcertification.CheckSsnFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckSsnFragment.bindInput$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInput$lambda$2$lambda$0(FragmentCheckSsnBinding fragmentCheckSsnBinding, Boolean bool) {
        RdsButton rdsButton = fragmentCheckSsnBinding.checkSsnCta;
        Intrinsics.checkNotNull(bool);
        rdsButton.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindInput$lambda$2$lambda$1(CheckSsnFragment checkSsnFragment) {
        checkSsnFragment.getDuxo().verifySsn(checkSsnFragment.getBinding().ssnInputEditText.getTypedText());
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(checkSsnFragment.getAnalytics(), "update_social_security_number", "continue", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C292791(this));
    }

    /* compiled from: CheckSsnFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.CheckSsnFragment$onStart$1 */
    /* synthetic */ class C292791 extends FunctionReferenceImpl implements Function1<CheckSsnViewState, Unit> {
        C292791(Object obj) {
            super(1, obj, CheckSsnFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/taxcertification/CheckSsnViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckSsnViewState checkSsnViewState) {
            invoke2(checkSsnViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CheckSsnViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CheckSsnFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getBinding().ssnInputEditText.requestFocus();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29286R.id.dialog_id_ssn_verified) {
            requireActivity().onBackPressed();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(CheckSsnViewState state) {
        CheckSsnViewState2 checkSsnViewState2Consume;
        FragmentCheckSsnBinding binding = getBinding();
        binding.checkSsnCta.setLoading(state.getLoading());
        requireToolbar().setLoadingViewVisible(state.getLoading());
        UiEvent<CheckSsnViewState2> result = state.getResult();
        if (result == null || (checkSsnViewState2Consume = result.consume()) == null) {
            checkSsnViewState2Consume = null;
        } else {
            AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), "update_social_security_number", checkSsnViewState2Consume.getAnalyticsString(), null, null, 12, null);
        }
        int i = checkSsnViewState2Consume == null ? -1 : WhenMappings.$EnumSwitchMapping$0[checkSsnViewState2Consume.ordinal()];
        if (i != -1) {
            if (i == 1) {
                showSsnVerifiedDialog();
                binding.ssnInputContainer.setErrorText(null);
                return;
            }
            if (i == 2) {
                binding.ssnInputContainer.setErrorText(getResources().getString(C29286R.string.check_ssn_error));
                return;
            }
            if (i == 3) {
                getReceiver().navigateToDestination(VerifyTaxInfoDestination.SsnLockout.INSTANCE);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                ConstraintLayout root = binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                companion.make(root, C11048R.string.error_description_something_went_wrong, 0).show();
            }
        }
    }

    private final void showSsnVerifiedDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(contextRequireContext).setId(C29286R.id.dialog_id_ssn_verified).setTitle(C29286R.string.check_ssn_verified_title, new Object[0]).setMessage(C29286R.string.check_ssn_verified_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, SSN_VERIFIED_DIALOG_TAG, false, 4, null);
    }

    /* compiled from: CheckSsnFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/CheckSsnFragment$Companion;", "", "<init>", "()V", "SSN_VERIFIED_DIALOG_TAG", "", "newInstance", "Lcom/robinhood/android/taxcertification/CheckSsnFragment;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CheckSsnFragment newInstance() {
            return new CheckSsnFragment();
        }
    }
}
