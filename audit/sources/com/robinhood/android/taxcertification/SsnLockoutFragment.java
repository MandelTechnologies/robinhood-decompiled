package com.robinhood.android.taxcertification;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.taxcertification.SsnLockoutViewState2;
import com.robinhood.android.taxcertification.VerifyTaxInfoDestination;
import com.robinhood.android.taxcertification.databinding.FragmentSsnLockoutBinding;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SsnLockoutFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnLockoutFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/taxcertification/databinding/FragmentSsnLockoutBinding;", "getBinding", "()Lcom/robinhood/android/taxcertification/databinding/FragmentSsnLockoutBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/taxcertification/SsnLockoutDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcertification/SsnLockoutDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "receiver", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "getReceiver", "()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "receiver$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindViewState", "", "state", "Lcom/robinhood/android/taxcertification/SsnLockoutViewState;", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SsnLockoutFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SsnLockoutFragment.class, "binding", "getBinding()Lcom/robinhood/android/taxcertification/databinding/FragmentSsnLockoutBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SsnLockoutFragment.class, "receiver", "getReceiver()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: receiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 receiver;

    public SsnLockoutFragment() {
        super(C29286R.layout.fragment_ssn_lockout);
        this.binding = ViewBinding5.viewBinding(this, SsnLockoutFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SsnLockoutDuxo.class);
        this.receiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(VerifyTaxInfoDestination.Receiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.taxcertification.SsnLockoutFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final FragmentSsnLockoutBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSsnLockoutBinding) value;
    }

    private final SsnLockoutDuxo getDuxo() {
        return (SsnLockoutDuxo) this.duxo.getValue();
    }

    private final VerifyTaxInfoDestination.Receiver getReceiver() {
        return (VerifyTaxInfoDestination.Receiver) this.receiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton ssnLockoutCancelCta = getBinding().ssnLockoutCancelCta;
        Intrinsics.checkNotNullExpressionValue(ssnLockoutCancelCta, "ssnLockoutCancelCta");
        OnClickListeners.onClick(ssnLockoutCancelCta, new Function0() { // from class: com.robinhood.android.taxcertification.SsnLockoutFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SsnLockoutFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton ssnLockoutSubmitPhotoCta = getBinding().ssnLockoutSubmitPhotoCta;
        Intrinsics.checkNotNullExpressionValue(ssnLockoutSubmitPhotoCta, "ssnLockoutSubmitPhotoCta");
        OnClickListeners.onClick(ssnLockoutSubmitPhotoCta, new C292892(getDuxo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SsnLockoutFragment ssnLockoutFragment) {
        ssnLockoutFragment.getReceiver().navigateToDestination(VerifyTaxInfoDestination.GoHome.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: SsnLockoutFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnLockoutFragment$onViewCreated$2 */
    /* synthetic */ class C292892 extends FunctionReferenceImpl implements Function0<Unit> {
        C292892(Object obj) {
            super(0, obj, SsnLockoutDuxo.class, "makeNationalIdRequest", "makeNationalIdRequest()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SsnLockoutDuxo) this.receiver).makeNationalIdRequest();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C292881(this));
    }

    /* compiled from: SsnLockoutFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.SsnLockoutFragment$onStart$1 */
    /* synthetic */ class C292881 extends AdaptedFunctionReference implements Function1<SsnLockoutViewState, Unit> {
        C292881(Object obj) {
            super(1, obj, SsnLockoutFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/taxcertification/SsnLockoutViewState;)Ljava/lang/Object;", 8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SsnLockoutViewState ssnLockoutViewState) {
            invoke2(ssnLockoutViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SsnLockoutViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SsnLockoutFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindViewState(SsnLockoutViewState state) {
        getBinding().ssnLockoutSubmitPhotoCta.setLoading(state.getLoading());
        requireToolbar().setLoadingViewVisible(state.getLoading());
        UiEvent<SsnLockoutViewState2> event = state.getEvent();
        SsnLockoutViewState2 ssnLockoutViewState2Consume = event != null ? event.consume() : null;
        if (ssnLockoutViewState2Consume instanceof SsnLockoutViewState2.Error) {
            return Boolean.valueOf(AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((SsnLockoutViewState2.Error) ssnLockoutViewState2Consume).getThrowable(), false, 2, null));
        }
        if (ssnLockoutViewState2Consume instanceof SsnLockoutViewState2.NationalIdRequest) {
            getReceiver().navigateToDestination(new VerifyTaxInfoDestination.DocUpload(((SsnLockoutViewState2.NationalIdRequest) ssnLockoutViewState2Consume).getRequest()));
            return Unit.INSTANCE;
        }
        if (ssnLockoutViewState2Consume != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SsnLockoutFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/SsnLockoutFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/taxcertification/SsnLockoutFragment;", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SsnLockoutFragment newInstance() {
            return new SsnLockoutFragment();
        }
    }
}
