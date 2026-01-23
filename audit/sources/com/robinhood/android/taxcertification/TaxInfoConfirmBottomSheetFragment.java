package com.robinhood.android.taxcertification;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcertification.databinding.FragmentTaxInfoConfirmBottomSheetBinding;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TaxInfoConfirmBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TaxInfoConfirmBottomSheetFragment extends BaseBottomSheetDialogFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TaxInfoConfirmBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TaxInfoConfirmBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* compiled from: TaxInfoConfirmBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", "", "onCheckSsnClicked", "", "onContactSupportClicked", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCheckSsnClicked();

        void onContactSupportClicked();
    }

    public TaxInfoConfirmBottomSheetFragment() {
        super(C29286R.layout.fragment_tax_info_confirm_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, TaxInfoConfirmBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
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
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentTaxInfoConfirmBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTaxInfoConfirmBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((LegacyFragmentKey.VerifyTaxInfo) companion.getArgs((Fragment) this)).getShowSsn()) {
            i = C29286R.string.tax_info_confirm_bottom_sheet_message_with_ssn;
        } else {
            i = C29286R.string.tax_info_confirm_bottom_sheet_message_without_ssn;
        }
        if (((LegacyFragmentKey.VerifyTaxInfo) companion.getArgs((Fragment) this)).getShowSsn()) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO_HELP, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CHECK_SSN, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        FragmentTaxInfoConfirmBottomSheetBinding binding = getBinding();
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, root, 0.0f, 2, null);
        binding.taxInfoConfirmSheetMessage.setText(i);
        RdsRowView taxInfoConfirmSheetSsnRow = binding.taxInfoConfirmSheetSsnRow;
        Intrinsics.checkNotNullExpressionValue(taxInfoConfirmSheetSsnRow, "taxInfoConfirmSheetSsnRow");
        taxInfoConfirmSheetSsnRow.setVisibility(((LegacyFragmentKey.VerifyTaxInfo) companion.getArgs((Fragment) this)).getShowSsn() ? 0 : 8);
        RdsButton taxInfoConfirmSheetDismissCta = binding.taxInfoConfirmSheetDismissCta;
        Intrinsics.checkNotNullExpressionValue(taxInfoConfirmSheetDismissCta, "taxInfoConfirmSheetDismissCta");
        OnClickListeners.onClick(taxInfoConfirmSheetDismissCta, new TaxInfoConfirmBottomSheetFragment3(this));
        RdsRowView taxInfoConfirmSheetSsnRow2 = binding.taxInfoConfirmSheetSsnRow;
        Intrinsics.checkNotNullExpressionValue(taxInfoConfirmSheetSsnRow2, "taxInfoConfirmSheetSsnRow");
        OnClickListeners.onClick(taxInfoConfirmSheetSsnRow2, new Function0() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxInfoConfirmBottomSheetFragment.onViewCreated$lambda$2$lambda$0(this.f$0);
            }
        });
        RdsRowView taxInfoConfirmSheetContactSupportRow = binding.taxInfoConfirmSheetContactSupportRow;
        Intrinsics.checkNotNullExpressionValue(taxInfoConfirmSheetContactSupportRow, "taxInfoConfirmSheetContactSupportRow");
        OnClickListeners.onClick(taxInfoConfirmSheetContactSupportRow, new Function0() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxInfoConfirmBottomSheetFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$0(TaxInfoConfirmBottomSheetFragment taxInfoConfirmBottomSheetFragment) {
        taxInfoConfirmBottomSheetFragment.getCallbacks().onCheckSsnClicked();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(taxInfoConfirmBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CHECK_SSN, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        taxInfoConfirmBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(TaxInfoConfirmBottomSheetFragment taxInfoConfirmBottomSheetFragment) {
        taxInfoConfirmBottomSheetFragment.getCallbacks().onContactSupportClicked();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(taxInfoConfirmBottomSheetFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONTACT_SUPPORT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        taxInfoConfirmBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: TaxInfoConfirmBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", "<init>", "()V", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<TaxInfoConfirmBottomSheetFragment, LegacyFragmentKey.VerifyTaxInfo, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.VerifyTaxInfo getArgs(TaxInfoConfirmBottomSheetFragment taxInfoConfirmBottomSheetFragment) {
            return (LegacyFragmentKey.VerifyTaxInfo) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, taxInfoConfirmBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((LegacyFragmentKey.VerifyTaxInfo) parcelable, (LegacyFragmentKey.VerifyTaxInfo) fragment, i);
        }

        public <C extends Fragment & Callbacks> TaxInfoConfirmBottomSheetFragment newInstance(LegacyFragmentKey.VerifyTaxInfo verifyTaxInfo, C c, int i) {
            return (TaxInfoConfirmBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, verifyTaxInfo, c, i);
        }
    }
}
