package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimState;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "bind", "state", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingShimFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentsDdOnboardingShimFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Callbacks;", "", "onReadyForPaycheckRecurringInvestmentsDdOnboarding", "", "state", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onReadyForPaycheckRecurringInvestmentsDdOnboarding(PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded state);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public PaycheckRecurringInvestmentsDdOnboardingShimFragment() {
        super(C26245R.layout.fragment_paycheck_recurring_investments_dd_onboarding_shim);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, PaycheckRecurringInvestmentsDdOnboardingShimDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PaycheckRecurringInvestmentsDdOnboardingShimFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final PaycheckRecurringInvestmentsDdOnboardingShimDuxo getDuxo() {
        return (PaycheckRecurringInvestmentsDdOnboardingShimDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C262751(this));
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment$onStart$1 */
    /* synthetic */ class C262751 extends FunctionReferenceImpl implements Function1<PaycheckRecurringInvestmentsDdOnboardingShimState, Unit> {
        C262751(Object obj) {
            super(1, obj, PaycheckRecurringInvestmentsDdOnboardingShimFragment.class, "bind", "bind(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckRecurringInvestmentsDdOnboardingShimState paycheckRecurringInvestmentsDdOnboardingShimState) {
            invoke2(paycheckRecurringInvestmentsDdOnboardingShimState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckRecurringInvestmentsDdOnboardingShimState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckRecurringInvestmentsDdOnboardingShimFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PaycheckRecurringInvestmentsDdOnboardingShimState state) {
        if (state instanceof PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded) {
            getCallbacks().onReadyForPaycheckRecurringInvestmentsDdOnboarding((PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded) state);
        } else if (!Intrinsics.areEqual(state, PaycheckRecurringInvestmentsDdOnboardingShimState.Loading.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Args;", "Landroid/os/Parcelable;", "retirementOnly", "", "canSkipCategorySelection", "<init>", "(ZZ)V", "getRetirementOnly", "()Z", "getCanSkipCategorySelection", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean canSkipCategorySelection;
        private final boolean retirementOnly;

        /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
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

        /* JADX WARN: Illegal instructions before constructor call */
        public Args() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.retirementOnly;
            }
            if ((i & 2) != 0) {
                z2 = args.canSkipCategorySelection;
            }
            return args.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRetirementOnly() {
            return this.retirementOnly;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanSkipCategorySelection() {
            return this.canSkipCategorySelection;
        }

        public final Args copy(boolean retirementOnly, boolean canSkipCategorySelection) {
            return new Args(retirementOnly, canSkipCategorySelection);
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
            return this.retirementOnly == args.retirementOnly && this.canSkipCategorySelection == args.canSkipCategorySelection;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.retirementOnly) * 31) + Boolean.hashCode(this.canSkipCategorySelection);
        }

        public String toString() {
            return "Args(retirementOnly=" + this.retirementOnly + ", canSkipCategorySelection=" + this.canSkipCategorySelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.retirementOnly ? 1 : 0);
            dest.writeInt(this.canSkipCategorySelection ? 1 : 0);
        }

        public Args(boolean z, boolean z2) {
            this.retirementOnly = z;
            this.canSkipCategorySelection = z2;
        }

        public /* synthetic */ Args(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getRetirementOnly() {
            return this.retirementOnly;
        }

        public final boolean getCanSkipCategorySelection() {
            return this.canSkipCategorySelection;
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Args;", "<init>", "()V", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PaycheckRecurringInvestmentsDdOnboardingShimFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PaycheckRecurringInvestmentsDdOnboardingShimFragment paycheckRecurringInvestmentsDdOnboardingShimFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsDdOnboardingShimFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckRecurringInvestmentsDdOnboardingShimFragment newInstance(Args args) {
            return (PaycheckRecurringInvestmentsDdOnboardingShimFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckRecurringInvestmentsDdOnboardingShimFragment paycheckRecurringInvestmentsDdOnboardingShimFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, paycheckRecurringInvestmentsDdOnboardingShimFragment, args);
        }
    }
}
