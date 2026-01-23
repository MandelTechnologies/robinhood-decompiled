package com.robinhood.android.equity.ordercheck.p122ui;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertView;
import com.robinhood.android.equityvalidation.C16020R;
import com.robinhood.android.equityvalidation.databinding.FragmentEquityOrderChecksAlertBinding;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EquityOrderChecksAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/equityvalidation/databinding/FragmentEquityOrderChecksAlertBinding;", "getBinding", "()Lcom/robinhood/android/equityvalidation/databinding/FragmentEquityOrderChecksAlertBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "Callbacks", "Companion", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityOrderChecksAlertFragment extends BaseDialogFragment implements EquityOrderChecksAlertView.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityOrderChecksAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/equityvalidation/databinding/FragmentEquityOrderChecksAlertBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityOrderChecksAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ClientComponentButtonView.Callbacks {
    }

    public EquityOrderChecksAlertFragment() {
        super(C16020R.layout.fragment_equity_order_checks_alert);
        this.binding = ViewBinding5.viewBinding(this, EquityOrderChecksAlertFragment2.INSTANCE);
    }

    private final FragmentEquityOrderChecksAlertBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEquityOrderChecksAlertBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().alertView.bind(((LegacyDialogFragmentKey.EquityOrderChecksAlert) INSTANCE.getArgs((Fragment) this)).getAlert(), this);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        dismiss();
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return ((ClientComponentButtonView.Callbacks) parentFragment).onActionClicked(button);
        }
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof Callbacks) {
            return ((ClientComponentButtonView.Callbacks) activity).onActionClicked(button);
        }
        return false;
    }

    /* compiled from: EquityOrderChecksAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$EquityOrderChecksAlert;", "<init>", "()V", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<EquityOrderChecksAlertFragment, LegacyDialogFragmentKey.EquityOrderChecksAlert> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public EquityOrderChecksAlertFragment createDialogFragment(LegacyDialogFragmentKey.EquityOrderChecksAlert equityOrderChecksAlert) {
            return (EquityOrderChecksAlertFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, equityOrderChecksAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.EquityOrderChecksAlert getArgs(EquityOrderChecksAlertFragment equityOrderChecksAlertFragment) {
            return (LegacyDialogFragmentKey.EquityOrderChecksAlert) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, equityOrderChecksAlertFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityOrderChecksAlertFragment newInstance(LegacyDialogFragmentKey.EquityOrderChecksAlert equityOrderChecksAlert) {
            return (EquityOrderChecksAlertFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, equityOrderChecksAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityOrderChecksAlertFragment equityOrderChecksAlertFragment, LegacyDialogFragmentKey.EquityOrderChecksAlert equityOrderChecksAlert) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, equityOrderChecksAlertFragment, equityOrderChecksAlert);
        }
    }
}
