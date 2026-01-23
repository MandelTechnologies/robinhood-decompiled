package com.robinhood.android.common.recurring.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.DialogRecurringInfoBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.recurring.contracts.RecurringInvestmentsInfo;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
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

/* compiled from: RecurringInfoBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringInfoBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringInfoBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInfoBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringInfoBottomSheetFragment() {
        super(C11595R.layout.dialog_recurring_info);
        this.binding = ViewBinding5.viewBinding(this, RecurringInfoBottomSheetFragment2.INSTANCE);
    }

    private final DialogRecurringInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DialogRecurringInfoBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((RecurringInvestmentsInfo) INSTANCE.getArgs((Fragment) this)).getHasCrypto()) {
            getBinding().dialogFragmentMessage.setText(C11595R.string.recurring_investment_info_bottom_sheet_message_with_crypto);
        } else {
            getBinding().dialogFragmentMessage.setText(C11595R.string.recurring_investment_info_bottom_sheet_message);
        }
        RdsButton dialogFragmentPositiveBtn = getBinding().dialogFragmentPositiveBtn;
        Intrinsics.checkNotNullExpressionValue(dialogFragmentPositiveBtn, "dialogFragmentPositiveBtn");
        OnClickListeners.onClick(dialogFragmentPositiveBtn, new Function0() { // from class: com.robinhood.android.common.recurring.bottomsheet.RecurringInfoBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInfoBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RecurringInfoBottomSheetFragment recurringInfoBottomSheetFragment) {
        recurringInfoBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringInfoBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringInfoBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/recurring/contracts/RecurringInvestmentsInfo;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/bottomsheet/RecurringInfoBottomSheetFragment;", "<init>", "()V", "createDialogFragment", "key", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<RecurringInvestmentsInfo>, FragmentWithArgsCompanion<RecurringInfoBottomSheetFragment, RecurringInvestmentsInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringInvestmentsInfo getArgs(RecurringInfoBottomSheetFragment recurringInfoBottomSheetFragment) {
            return (RecurringInvestmentsInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringInfoBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringInfoBottomSheetFragment newInstance(RecurringInvestmentsInfo recurringInvestmentsInfo) {
            return (RecurringInfoBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringInvestmentsInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringInfoBottomSheetFragment recurringInfoBottomSheetFragment, RecurringInvestmentsInfo recurringInvestmentsInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringInfoBottomSheetFragment, recurringInvestmentsInfo);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public RecurringInfoBottomSheetFragment createDialogFragment(RecurringInvestmentsInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (RecurringInfoBottomSheetFragment) newInstance((Parcelable) key);
        }
    }
}
