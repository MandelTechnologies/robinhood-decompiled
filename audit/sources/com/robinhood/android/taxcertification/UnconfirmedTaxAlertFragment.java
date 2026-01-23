package com.robinhood.android.taxcertification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.tax.contracts.TaxCertification;
import com.robinhood.android.taxcertification.databinding.FragmentUnconfirmedTaxAlertBinding;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: UnconfirmedTaxAlertFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/UnconfirmedTaxAlertFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/taxcertification/databinding/FragmentUnconfirmedTaxAlertBinding;", "getBinding", "()Lcom/robinhood/android/taxcertification/databinding/FragmentUnconfirmedTaxAlertBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UnconfirmedTaxAlertFragment extends BaseDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UnconfirmedTaxAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/taxcertification/databinding/FragmentUnconfirmedTaxAlertBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;

    public UnconfirmedTaxAlertFragment() {
        super(C29286R.layout.fragment_unconfirmed_tax_alert);
        this.binding = ViewBinding5.viewBinding(this, UnconfirmedTaxAlertFragment2.INSTANCE);
    }

    private final FragmentUnconfirmedTaxAlertBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentUnconfirmedTaxAlertBinding) value;
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
        RdsButton confirmButton = getBinding().confirmButton;
        Intrinsics.checkNotNullExpressionValue(confirmButton, "confirmButton");
        OnClickListeners.onClick(confirmButton, new Function0() { // from class: com.robinhood.android.taxcertification.UnconfirmedTaxAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnconfirmedTaxAlertFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton dismissButton = getBinding().dismissButton;
        Intrinsics.checkNotNullExpressionValue(dismissButton, "dismissButton");
        OnClickListeners.onClick(dismissButton, new Function0() { // from class: com.robinhood.android.taxcertification.UnconfirmedTaxAlertFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnconfirmedTaxAlertFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(UnconfirmedTaxAlertFragment unconfirmedTaxAlertFragment) {
        Navigator navigator = unconfirmedTaxAlertFragment.getNavigator();
        Context contextRequireContext = unconfirmedTaxAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new TaxCertification(null, 1, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(UnconfirmedTaxAlertFragment unconfirmedTaxAlertFragment) {
        unconfirmedTaxAlertFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: UnconfirmedTaxAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/UnconfirmedTaxAlertFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$UnconfirmedTaxInfo;", "<init>", "()V", "createDialogFragment", "Lcom/robinhood/android/taxcertification/UnconfirmedTaxAlertFragment;", "key", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.UnconfirmedTaxInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public UnconfirmedTaxAlertFragment createDialogFragment(LegacyDialogFragmentKey.UnconfirmedTaxInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new UnconfirmedTaxAlertFragment();
        }
    }
}
