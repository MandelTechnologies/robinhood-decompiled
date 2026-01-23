package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WithdrawalLockDialogFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0003\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onPositiveButtonClick", "", "onNegativeButtonClick", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Builder", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WithdrawalLockDialogFragment extends RhDialogFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WithdrawalLockDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.mcduckling.ui.WithdrawalLockDialogFragment$special$$inlined$targetFragmentCallbacks$1
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

    /* compiled from: WithdrawalLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", "", "onWithdrawalLockingConfirmed", "", "onWithdrawalLockingDismissed", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onWithdrawalLockingConfirmed();

        void onWithdrawalLockingDismissed();
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

    /* compiled from: WithdrawalLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "createDialogFragment", "Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Builder extends RhDialogFragment.Builder {
        private final Fragment targetedFragment;

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(Fragment targetedFragment) {
            Intrinsics.checkNotNullParameter(targetedFragment, "targetedFragment");
            Context contextRequireContext = targetedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            super(contextRequireContext);
            this.targetedFragment = targetedFragment;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.android.common.ui.RhDialogFragment.Builder
        public WithdrawalLockDialogFragment createDialogFragment() {
            WithdrawalLockDialogFragment withdrawalLockDialogFragment = new WithdrawalLockDialogFragment();
            withdrawalLockDialogFragment.setTargetFragment(this.targetedFragment, 0);
            return withdrawalLockDialogFragment;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onPositiveButtonClick() {
        dismiss();
        getCallbacks().onWithdrawalLockingConfirmed();
    }

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
        getCallbacks().onWithdrawalLockingDismissed();
    }

    /* compiled from: WithdrawalLockDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u0005\"\f\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u0002H\u0006¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Companion;", "", "<init>", "()V", "showWithdrawalLockConfirmation", "", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> void showWithdrawalLockConfirmation(C fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            RhDialogFragment.Builder negativeButton = new Builder(fragment).setId(C11257R.id.dialog_move_money_lock_withdrawals_confirmation).setImage(C11257R.drawable.ic_withdrawal_lock).setTitle(C11257R.string.routing_account_actions_lock_withdrawals_switch_label, new Object[0]).setMessage(C11257R.string.f3992x985e8392, new Object[0]).setPositiveButton(C11257R.string.routing_account_actions_lock_withdrawals_switch_label, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "lock-withdrawals-confirmation", false, 4, null);
        }
    }
}
