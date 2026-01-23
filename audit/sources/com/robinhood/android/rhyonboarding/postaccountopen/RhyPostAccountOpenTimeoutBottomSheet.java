package com.robinhood.android.rhyonboarding.postaccountopen;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.C27634R;
import com.robinhood.android.rhyonboarding.databinding.FragmentRhyPostAccountOpenTimeoutBottomSheetBinding;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyPostAccountOpenTimeoutBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenTimeoutBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenTimeoutBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenTimeoutBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenTimeoutBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenTimeoutBottomSheet$Callbacks;", "callbacks$delegate", "useParentFragmentScarletContextWrapper", "", "getUseParentFragmentScarletContextWrapper", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyPostAccountOpenTimeoutBottomSheet extends BaseBottomSheetDialogFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyPostAccountOpenTimeoutBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/rhyonboarding/databinding/FragmentRhyPostAccountOpenTimeoutBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyPostAccountOpenTimeoutBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenTimeoutBottomSheet$Callbacks;", 0))};
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean useParentFragmentScarletContextWrapper;

    /* compiled from: RhyPostAccountOpenTimeoutBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenTimeoutBottomSheet$Callbacks;", "", "onOpenAccountTimeoutExit", "", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOpenAccountTimeoutExit();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RhyPostAccountOpenTimeoutBottomSheet() {
        super(C27634R.layout.fragment_rhy_post_account_open_timeout_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyPostAccountOpenTimeoutBottomSheet2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenTimeoutBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.useParentFragmentScarletContextWrapper = true;
    }

    private final FragmentRhyPostAccountOpenTimeoutBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyPostAccountOpenTimeoutBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected boolean getUseParentFragmentScarletContextWrapper() {
        return this.useParentFragmentScarletContextWrapper;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
        RdsButton rhyTimeoutPrimaryButton = getBinding().rhyTimeoutPrimaryButton;
        Intrinsics.checkNotNullExpressionValue(rhyTimeoutPrimaryButton, "rhyTimeoutPrimaryButton");
        OnClickListeners.onClick(rhyTimeoutPrimaryButton, new Function0() { // from class: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenTimeoutBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyPostAccountOpenTimeoutBottomSheet.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RhyPostAccountOpenTimeoutBottomSheet rhyPostAccountOpenTimeoutBottomSheet) {
        rhyPostAccountOpenTimeoutBottomSheet.getCallbacks().onOpenAccountTimeoutExit();
        return Unit.INSTANCE;
    }
}
