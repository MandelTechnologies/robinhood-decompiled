package com.robinhood.android.earlypay.toggle.p113ui;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.earlypay.C14433R;
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

/* compiled from: EarlyPayInfoDialogFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\t\u0010\r\u001a\u00020\u000eH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onNegativeButtonClick", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Builder", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPayInfoDialogFragment extends RhDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayInfoDialogFragment$special$$inlined$targetFragmentCallbacks$1
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
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyPayInfoDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyPayInfoDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", "", "onEarlyPayLearnMoreClicked", "", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEarlyPayLearnMoreClicked();
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

    @Override // com.robinhood.android.common.p088ui.RhDialogFragment
    protected void onNegativeButtonClick() {
        dismiss();
        getCallbacks().onEarlyPayLearnMoreClicked();
    }

    /* compiled from: EarlyPayInfoDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Builder;", "Lcom/robinhood/android/common/ui/RhDialogFragment$Builder;", "targetedFragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "createDialogFragment", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment;", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
        public EarlyPayInfoDialogFragment createDialogFragment() {
            EarlyPayInfoDialogFragment earlyPayInfoDialogFragment = new EarlyPayInfoDialogFragment();
            earlyPayInfoDialogFragment.setTargetFragment(this.targetedFragment, 0);
            return earlyPayInfoDialogFragment;
        }
    }

    /* compiled from: EarlyPayInfoDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u0005\"\f\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u0002H\u0006¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Companion;", "", "<init>", "()V", "show", "", "C", "Landroidx/fragment/app/Fragment;", "Lcom/robinhood/android/earlypay/toggle/ui/EarlyPayInfoDialogFragment$Callbacks;", "fragmentCallback", "(Landroidx/fragment/app/Fragment;)V", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <C extends Fragment & Callbacks> void show(C fragmentCallback) {
            Intrinsics.checkNotNullParameter(fragmentCallback, "fragmentCallback");
            RhDialogFragment.Builder negativeButton = new Builder(fragmentCallback).setUseDesignSystemOverlay(true).setId(C14433R.id.dialog_early_pay_info).setMessage(C14433R.string.early_pay_enable_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_got_it, new Object[0]).setNegativeButton(C11048R.string.general_action_learn_more, new Object[0]);
            FragmentManager parentFragmentManager = fragmentCallback.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "early-pay-info", false, 4, null);
        }
    }
}
