package com.robinhood.android.common.recurring.trade;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderExplanationBottomSheetBinding;
import com.robinhood.android.common.recurring.trade.explanation.AmountLabelExplanationUiModel;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringOrderExplanationBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderExplanationBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderExplanationBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderExplanationBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useParentFragmentScarletContextWrapper", "", "getUseParentFragmentScarletContextWrapper", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Args", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderExplanationBottomSheetFragment extends BaseBottomSheetDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean useParentFragmentScarletContextWrapper;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderExplanationBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderExplanationBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringOrderExplanationBottomSheetFragment() {
        super(C11595R.layout.fragment_recurring_order_explanation_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderExplanationBottomSheetFragment2.INSTANCE);
        this.useParentFragmentScarletContextWrapper = true;
    }

    private final FragmentRecurringOrderExplanationBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringOrderExplanationBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    protected boolean getUseParentFragmentScarletContextWrapper() {
        return this.useParentFragmentScarletContextWrapper;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentRecurringOrderExplanationBottomSheetBinding binding = getBinding();
        RhTextView rhTextView = binding.explanation;
        rhTextView.setMovementMethod(LinkMovementMethod.getInstance());
        AmountLabelExplanationUiModel.BottomSheet explanationModel = ((Args) INSTANCE.getArgs((Fragment) this)).getExplanationModel();
        Resources resources = rhTextView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(explanationModel.getText(resources, new Function1() { // from class: com.robinhood.android.common.recurring.trade.RecurringOrderExplanationBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderExplanationBottomSheetFragment.onViewCreated$lambda$2$lambda$1$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        }));
        RdsButton dismissBtn = binding.dismissBtn;
        Intrinsics.checkNotNullExpressionValue(dismissBtn, "dismissBtn");
        OnClickListeners.onClick(dismissBtn, new RecurringOrderExplanationBottomSheetFragment3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1$lambda$0(RecurringOrderExplanationBottomSheetFragment recurringOrderExplanationBottomSheetFragment, int i) {
        WebUtils.viewUrl$default(recurringOrderExplanationBottomSheetFragment.requireContext(), i, 0, 4, (Object) null);
        recurringOrderExplanationBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderExplanationBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderExplanationBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "explanationModel", "Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$BottomSheet;", "<init>", "(Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$BottomSheet;)V", "getExplanationModel", "()Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanationUiModel$BottomSheet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AmountLabelExplanationUiModel.BottomSheet explanationModel;

        /* compiled from: RecurringOrderExplanationBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(AmountLabelExplanationUiModel.BottomSheet.CREATOR.createFromParcel(parcel));
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
            this.explanationModel.writeToParcel(dest, flags);
        }

        public Args(AmountLabelExplanationUiModel.BottomSheet explanationModel) {
            Intrinsics.checkNotNullParameter(explanationModel, "explanationModel");
            this.explanationModel = explanationModel;
        }

        public final AmountLabelExplanationUiModel.BottomSheet getExplanationModel() {
            return this.explanationModel;
        }
    }

    /* compiled from: RecurringOrderExplanationBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderExplanationBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderExplanationBottomSheetFragment;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderExplanationBottomSheetFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderExplanationBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecurringOrderExplanationBottomSheetFragment recurringOrderExplanationBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderExplanationBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderExplanationBottomSheetFragment newInstance(Args args) {
            return (RecurringOrderExplanationBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderExplanationBottomSheetFragment recurringOrderExplanationBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderExplanationBottomSheetFragment, args);
        }
    }
}
