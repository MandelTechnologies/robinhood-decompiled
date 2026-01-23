package com.robinhood.android.common.recurring.agreement.paycheck;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementViewState;
import com.robinhood.android.common.recurring.databinding.FragmentPaycheckRecurringInvestmentAgreementBinding;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u0003/01B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\"H\u0016J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentPaycheckRecurringInvestmentAgreementBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentPaycheckRecurringInvestmentAgreementBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Callbacks;", "callbacks$delegate", "<set-?>", "", "hasUserAcceptedAgreement", "getHasUserAcceptedAgreement", "()Z", "setHasUserAcceptedAgreement", "(Z)V", "hasUserAcceptedAgreement$delegate", "Lkotlin/properties/ReadWriteProperty;", "isCrypto", "isCryptoOrder", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "bindViewState", "viewState", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "Callbacks", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PaycheckRecurringInvestmentAgreementFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: hasUserAcceptedAgreement$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasUserAcceptedAgreement;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentAgreementFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentPaycheckRecurringInvestmentAgreementBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaycheckRecurringInvestmentAgreementFragment.class, "hasUserAcceptedAgreement", "getHasUserAcceptedAgreement()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String AGREEMENT_URL = "https://cdn.robinhood.com/assets/robinhood/legal/robinhood-paycheck-recurring-investments-customer-agreement.pdf";

    /* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Callbacks;", "", "onPaycheckRecurringInvestmentAgreementAccepted", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPaycheckRecurringInvestmentAgreementAccepted();
    }

    public PaycheckRecurringInvestmentAgreementFragment() {
        super(C11595R.layout.fragment_paycheck_recurring_investment_agreement);
        this.binding = ViewBinding5.viewBinding(this, PaycheckRecurringInvestmentAgreementFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, PaycheckRecurringInvestmentAgreementDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.hasUserAcceptedAgreement = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
    }

    private final FragmentPaycheckRecurringInvestmentAgreementBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPaycheckRecurringInvestmentAgreementBinding) value;
    }

    private final PaycheckRecurringInvestmentAgreementDuxo getDuxo() {
        return (PaycheckRecurringInvestmentAgreementDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final boolean getHasUserAcceptedAgreement() {
        return ((Boolean) this.hasUserAcceptedAgreement.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setHasUserAcceptedAgreement(boolean z) {
        this.hasUserAcceptedAgreement.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return isCryptoOrder();
    }

    private final boolean isCryptoOrder() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getIsCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getIsBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentPaycheckRecurringInvestmentAgreementBinding binding = getBinding();
        RhTextView agreementFooter = binding.agreementFooter;
        Intrinsics.checkNotNullExpressionValue(agreementFooter, "agreementFooter");
        int i = C11595R.string.paycheck_recurring_footer;
        int i2 = C11595R.string.paycheck_recurring_footer_cta_text;
        String string2 = ViewsKt.getString(agreementFooter, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) agreementFooter, (CharSequence) string2, true, true, numValueOf != null ? ViewsKt.getString(agreementFooter, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment$onViewCreated$lambda$2$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.requireContext(), PaycheckRecurringInvestmentAgreementFragment.AGREEMENT_URL, 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
        RdsButton continueButton = binding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new PaycheckRecurringInvestmentAgreementFragment3(getDuxo()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDuxo().setHasUserAlreadyAcceptedAgreement(getHasUserAcceptedAgreement());
        if (getHasUserAcceptedAgreement()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment.onResume.1
                @Override // java.lang.Runnable
                public final void run() {
                    Fragment fragmentRequireParentFragment = PaycheckRecurringInvestmentAgreementFragment.this.requireParentFragment();
                    Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
                    ((BaseFragment) fragmentRequireParentFragment).onBackPressed();
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C116061(this));
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment$onStart$1 */
    /* synthetic */ class C116061 extends FunctionReferenceImpl implements Function1<PaycheckRecurringInvestmentAgreementViewState, Unit> {
        C116061(Object obj) {
            super(1, obj, PaycheckRecurringInvestmentAgreementFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckRecurringInvestmentAgreementViewState paycheckRecurringInvestmentAgreementViewState) {
            invoke2(paycheckRecurringInvestmentAgreementViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckRecurringInvestmentAgreementViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckRecurringInvestmentAgreementFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(PaycheckRecurringInvestmentAgreementViewState viewState) {
        FragmentPaycheckRecurringInvestmentAgreementBinding binding = getBinding();
        binding.continueButton.setLoading(viewState.getIsLoading());
        RhTextView agreementFooter = binding.agreementFooter;
        Intrinsics.checkNotNullExpressionValue(agreementFooter, "agreementFooter");
        agreementFooter.setVisibility(viewState.getIsFooterVisible() ? 0 : 8);
        if (Intrinsics.areEqual(viewState, PaycheckRecurringInvestmentAgreementViewState.AcceptedAgreement.INSTANCE)) {
            if (!getHasUserAcceptedAgreement()) {
                getCallbacks().onPaycheckRecurringInvestmentAgreementAccepted();
            }
            setHasUserAcceptedAgreement(true);
        } else {
            if (Intrinsics.areEqual(viewState, PaycheckRecurringInvestmentAgreementViewState.Loading.INSTANCE)) {
                return;
            }
            if (!(viewState instanceof PaycheckRecurringInvestmentAgreementViewState.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            PaycheckRecurringInvestmentAgreementViewState.Loaded loaded = (PaycheckRecurringInvestmentAgreementViewState.Loaded) viewState;
            binding.agreementTitle.setText(loaded.getTitle());
            binding.agreement.setText(loaded.getAgreement());
            binding.continueButton.setLoading(loaded.getIsLoading());
        }
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Args;", "Landroid/os/Parcelable;", "isCrypto", "", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "<init>", "(ZZ)V", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isBrokerageCashTransfer;
        private final boolean isCrypto;

        /* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isCrypto ? 1 : 0);
            dest.writeInt(this.isBrokerageCashTransfer ? 1 : 0);
        }

        public Args(boolean z, boolean z2) {
            this.isCrypto = z;
            this.isBrokerageCashTransfer = z2;
        }

        /* renamed from: isCrypto, reason: from getter */
        public final boolean getIsCrypto() {
            return this.isCrypto;
        }

        /* renamed from: isBrokerageCashTransfer, reason: from getter */
        public final boolean getIsBrokerageCashTransfer() {
            return this.isBrokerageCashTransfer;
        }
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080D¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementFragment$Args;", "<init>", "()V", "AGREEMENT_URL", "", "getAGREEMENT_URL$feature_lib_recurring_externalDebug$annotations", "getAGREEMENT_URL$feature_lib_recurring_externalDebug", "()Ljava/lang/String;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PaycheckRecurringInvestmentAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAGREEMENT_URL$feature_lib_recurring_externalDebug$annotations() {
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PaycheckRecurringInvestmentAgreementFragment paycheckRecurringInvestmentAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckRecurringInvestmentAgreementFragment newInstance(Args args) {
            return (PaycheckRecurringInvestmentAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckRecurringInvestmentAgreementFragment paycheckRecurringInvestmentAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, paycheckRecurringInvestmentAgreementFragment, args);
        }

        public final String getAGREEMENT_URL$feature_lib_recurring_externalDebug() {
            return PaycheckRecurringInvestmentAgreementFragment.AGREEMENT_URL;
        }
    }
}
