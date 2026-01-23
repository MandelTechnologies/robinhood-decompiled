package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0003!\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u0017H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Callbacks;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "", "bind", "state", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DirectDepositPaycheckRecurringInvestmentsConfirmationFragment extends GenericActionableInformationFragment implements RegionGated {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.class);

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Callbacks;", "", "onDirectDepositCompletedForPaycheckRecurringInvestment", "", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositCompletedForPaycheckRecurringInvestment();
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectDepositSource.values().length];
            try {
                iArr[DirectDepositSource.ALREADY_SET_UP_DD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_ACCOUNT_ROUTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_FORM_HR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DirectDepositSource.SWITCHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo getDuxo() {
        return (DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        Callbacks callbacks = (Callbacks) getParentFragment();
        if (callbacks != null) {
            return callbacks;
        }
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.Callbacks");
        return (Callbacks) componentRequireActivity;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        DirectDepositSource directDepositSource = ((Args) companion.getArgs((Fragment) this)).getDirectDepositSource();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[directDepositSource.ordinal()];
        if (i3 == 1) {
            i = C11131R.drawable.svg_direct_deposit;
        } else {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11131R.drawable.svg_fireworks;
        }
        setIllustration(toDrawableIllustration(i));
        int i4 = iArr[((Args) companion.getArgs((Fragment) this)).getDirectDepositSource().ordinal()];
        if (i4 == 1) {
            i2 = C11131R.string.f3981xa5ce8a7a;
        } else if (i4 == 2 || i4 == 3) {
            i2 = C11131R.string.direct_deposit_paycheck_recurring_investment_success_title;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C11131R.string.f3986xcb08744a;
        }
        setTitle(toText(i2));
        setPrimaryAction(toText(C11048R.string.general_label_done));
        onPrimaryActionClick(new C262591(getCallbacks()));
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$onViewCreated$1 */
    /* synthetic */ class C262591 extends FunctionReferenceImpl implements Function0<Unit> {
        C262591(Object obj) {
            super(0, obj, Callbacks.class, "onDirectDepositCompletedForPaycheckRecurringInvestment", "onDirectDepositCompletedForPaycheckRecurringInvestment()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onDirectDepositCompletedForPaycheckRecurringInvestment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C262581(this));
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$onStart$1 */
    /* synthetic */ class C262581 extends FunctionReferenceImpl implements Function1<DirectDepositPaycheckRecurringInvestmentsConfirmationViewState, Unit> {
        C262581(Object obj) {
            super(1, obj, DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.class, "bind", "bind(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectDepositPaycheckRecurringInvestmentsConfirmationViewState directDepositPaycheckRecurringInvestmentsConfirmationViewState) throws Resources.NotFoundException {
            invoke2(directDepositPaycheckRecurringInvestmentsConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectDepositPaycheckRecurringInvestmentsConfirmationViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectDepositPaycheckRecurringInvestmentsConfirmationFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onDirectDepositCompletedForPaycheckRecurringInvestment();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DirectDepositPaycheckRecurringInvestmentsConfirmationViewState state) throws Resources.NotFoundException {
        GenericActionableInformationFragment.TextType.Formatted text;
        StringResource description = state.getDescription();
        if (description != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CharSequence text2 = description.getText(resources);
            if (text2 == null || (text = toText(text2)) == null) {
                return;
            }
            setDescription(text);
        }
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Args;", "Landroid/os/Parcelable;", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "paycheckInvestmentScheduleId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;Ljava/util/UUID;)V", "getDirectDepositSource", "()Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "getPaycheckInvestmentScheduleId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DirectDepositSource directDepositSource;
        private final UUID paycheckInvestmentScheduleId;

        /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DirectDepositSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
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
            dest.writeString(this.directDepositSource.name());
            dest.writeSerializable(this.paycheckInvestmentScheduleId);
        }

        public Args(DirectDepositSource directDepositSource, UUID paycheckInvestmentScheduleId) {
            Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
            Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleId, "paycheckInvestmentScheduleId");
            this.directDepositSource = directDepositSource;
            this.paycheckInvestmentScheduleId = paycheckInvestmentScheduleId;
        }

        public final DirectDepositSource getDirectDepositSource() {
            return this.directDepositSource;
        }

        public final UUID getPaycheckInvestmentScheduleId() {
            return this.paycheckInvestmentScheduleId;
        }
    }

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationFragment$Args;", "<init>", "()V", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectDepositPaycheckRecurringInvestmentsConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectDepositPaycheckRecurringInvestmentsConfirmationFragment directDepositPaycheckRecurringInvestmentsConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directDepositPaycheckRecurringInvestmentsConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectDepositPaycheckRecurringInvestmentsConfirmationFragment newInstance(Args args) {
            return (DirectDepositPaycheckRecurringInvestmentsConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectDepositPaycheckRecurringInvestmentsConfirmationFragment directDepositPaycheckRecurringInvestmentsConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directDepositPaycheckRecurringInvestmentsConfirmationFragment, args);
        }
    }
}
