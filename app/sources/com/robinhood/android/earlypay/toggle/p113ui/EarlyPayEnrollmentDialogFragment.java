package com.robinhood.android.earlypay.toggle.p113ui;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.earlypay.C14433R;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EarlyPayEnrollmentDialogFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\t\u0010\u0014\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", EarlyPayEnrollmentDialogFragment.ARG_ENROLL, "", "getEnroll", "()Z", "enroll$delegate", "Lkotlin/Lazy;", "onPositiveButtonClick", "", "onNegativeButtonClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Builder", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentDialogFragment extends RhDialogFragment implements RegionGated {
    private static final String ARG_ENROLL = "enroll";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayEnrollmentDialogFragment$special$$inlined$targetFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment targetFragment = CallbacksProperty.getTargetFragment();
            if (targetFragment != null) {
                return targetFragment;
            }
            throw new IllegalStateException("Required value was null.");
        }
    });

    /* renamed from: enroll$delegate, reason: from kotlin metadata */
    private final Lazy enroll = Fragments2.argument(this, ARG_ENROLL);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyPayEnrollmentDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyPayEnrollmentDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", "", "onEarlyPayEnrollmentUpdateConfirmed", "", "enrolled", "", "onEarlyPayEnrollmentUpdateDismissed", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEarlyPayEnrollmentUpdateConfirmed(boolean enrolled);

        void onEarlyPayEnrollmentUpdateDismissed(boolean enrolled);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean getEnroll() {
        return ((Boolean) this.enroll.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        dismiss();
        getCallbacks().onEarlyPayEnrollmentUpdateConfirmed(getEnroll());
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
        getCallbacks().onEarlyPayEnrollmentUpdateDismissed(!getEnroll());
    }

    /* compiled from: EarlyPayEnrollmentDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "isEnrolling", "", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "()Z", "createDialogFragment", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment;", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        private final boolean isEnrolling;
        private final Fragment targetedFragment;

        /* renamed from: isEnrolling, reason: from getter */
        public final boolean getIsEnrolling() {
            return this.isEnrolling;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Fragment targetedFragment, boolean z) {
            Intrinsics.checkNotNullParameter(targetedFragment, "targetedFragment");
            Context contextRequireContext = targetedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            super(contextRequireContext);
            this.targetedFragment = targetedFragment;
            this.isEnrolling = z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public EarlyPayEnrollmentDialogFragment createDialogFragment() {
            EarlyPayEnrollmentDialogFragment earlyPayEnrollmentDialogFragment = new EarlyPayEnrollmentDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(EarlyPayEnrollmentDialogFragment.ARG_ENROLL, this.isEnrolling);
            earlyPayEnrollmentDialogFragment.setArguments(bundle);
            earlyPayEnrollmentDialogFragment.setTargetFragment(this.targetedFragment, 0);
            return earlyPayEnrollmentDialogFragment;
        }
    }

    /* compiled from: EarlyPayEnrollmentDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0006\u001a\u00020\u0007\"\f\b\u0000\u0010\b*\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Companion;", "", "<init>", "()V", "ARG_ENROLL", "", "showUpdateConfirmation", "", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayEnrollmentDialogFragment$Callbacks;", "fragmentCallback", "isEnrolling", "", "(Landroidx/fragment/app/Fragment;Z)V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> void showUpdateConfirmation(C fragmentCallback, boolean isEnrolling) {
            Intrinsics.checkNotNullParameter(fragmentCallback, "fragmentCallback");
            if (isEnrolling) {
                RhDialogFragment.Builder negativeButton = new Builder(fragmentCallback, true).setUseDesignSystemOverlay(true).setId(C14433R.id.dialog_early_pay_enroll).setTitle(C14433R.string.early_pay_enable_dialog_title, new Object[0]).setMessage(C14433R.string.early_pay_enable_dialog_message, new Object[0]).setPositiveButton(C14433R.string.early_pay_enable_dialog_positive_cta, new Object[0]).setNegativeButton(C14433R.string.early_pay_maybe_later, new Object[0]);
                FragmentManager parentFragmentManager = fragmentCallback.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "early-pay-enrollment", false, 4, null);
                return;
            }
            RhDialogFragment.Builder negativeButton2 = new Builder(fragmentCallback, false).setUseDesignSystemOverlay(true).setId(C14433R.id.dialog_early_pay_unenroll).setTitle(C14433R.string.early_pay_disable_dialog_title, new Object[0]).setMessage(C14433R.string.early_pay_disable_dialog_message, new Object[0]).setPositiveButton(C14433R.string.early_pay_disable_dialog_positive_cta, new Object[0]).setNegativeButton(C14433R.string.early_pay_disable_dialog_negative_cta, new Object[0]);
            FragmentManager parentFragmentManager2 = fragmentCallback.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton2, parentFragmentManager2, "early-pay-unenrollment", false, 4, null);
        }
    }
}
