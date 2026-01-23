package com.robinhood.android.cash.cushion.error;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.cash.cushion.C9970R;
import com.robinhood.android.cash.cushion.databinding.CashCushionBrokerageRequiredDialogBinding;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CashCushionBrokerageRequiredDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/error/CashCushionBrokerageRequiredDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/cash/cushion/databinding/CashCushionBrokerageRequiredDialogBinding;", "getBinding", "()Lcom/robinhood/android/cash/cushion/databinding/CashCushionBrokerageRequiredDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashCushionBrokerageRequiredDialogFragment extends BaseDialogFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CashCushionBrokerageRequiredDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/cushion/databinding/CashCushionBrokerageRequiredDialogBinding;", 0))};
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CashCushionBrokerageRequiredDialogFragment() {
        super(C9970R.layout.cash_cushion_brokerage_required_dialog);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, CashCushionBrokerageRequiredDialogFragment2.INSTANCE);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final CashCushionBrokerageRequiredDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CashCushionBrokerageRequiredDialogBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton primaryBtn = getBinding().primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new Function0() { // from class: com.robinhood.android.cash.cushion.error.CashCushionBrokerageRequiredDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashCushionBrokerageRequiredDialogFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton cancelBtn = getBinding().cancelBtn;
        Intrinsics.checkNotNullExpressionValue(cancelBtn, "cancelBtn");
        OnClickListeners.onClick(cancelBtn, new C99842(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CashCushionBrokerageRequiredDialogFragment cashCushionBrokerageRequiredDialogFragment) {
        Navigator navigator = cashCushionBrokerageRequiredDialogFragment.getNavigator();
        Context contextRequireContext = cashCushionBrokerageRequiredDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, 12, null);
        intentCreateIntent$default.addFlags(131072);
        cashCushionBrokerageRequiredDialogFragment.startActivity(intentCreateIntent$default);
        cashCushionBrokerageRequiredDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: CashCushionBrokerageRequiredDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.cushion.error.CashCushionBrokerageRequiredDialogFragment$onViewCreated$2 */
    /* synthetic */ class C99842 extends FunctionReferenceImpl implements Function0<Unit> {
        C99842(Object obj) {
            super(0, obj, CashCushionBrokerageRequiredDialogFragment.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CashCushionBrokerageRequiredDialogFragment) this.receiver).dismiss();
        }
    }
}
