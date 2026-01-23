package com.robinhood.android.common.recurring.intro;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringInvestmentBottomSheetBinding;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Callbacks;", "callbacks$delegate", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onSelectFrequency", "updatedFrequency", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentBottomSheetFragment extends BaseBottomSheetDialogFragment {
    private static final String ARG_INVESTMENT_FREQUENCY = "investment_frequency";
    private static final String ARG_IS_CRYPTO = "is_crypto";
    private final GenericListAdapter<RdsRowView, ApiInvestmentSchedule.Frequency> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: frequency$delegate, reason: from kotlin metadata */
    private final Lazy frequency;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringInvestmentBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringInvestmentBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringInvestmentBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Callbacks;", "", "onUpdateFrequency", "", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUpdateFrequency(ApiInvestmentSchedule.Frequency frequency);
    }

    public RecurringInvestmentBottomSheetFragment() {
        super(C11595R.layout.fragment_recurring_investment_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, RecurringInvestmentBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.frequency = Fragments2.argument(this, ARG_INVESTMENT_FREQUENCY);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecurringInvestmentBottomSheetFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (ApiInvestmentSchedule.Frequency) obj2);
            }
        });
    }

    private final FragmentRecurringInvestmentBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringInvestmentBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final ApiInvestmentSchedule.Frequency getFrequency() {
        return (ApiInvestmentSchedule.Frequency) this.frequency.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final RecurringInvestmentBottomSheetFragment recurringInvestmentBottomSheetFragment, RdsRowView of, final ApiInvestmentSchedule.Frequency item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RdsRowView.bind$default(of, InvestmentFrequenciesUtils.toInvestmentDropdownText(item, resources), null, null, null, null, 30, null);
        of.setTrailingIconDrawable(item == recurringInvestmentBottomSheetFragment.getFrequency() ? ViewsKt.getDrawable(of, C20690R.drawable.ic_rds_checkmark_16dp) : null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.common.recurring.intro.RecurringInvestmentBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringInvestmentBottomSheetFragment.adapter$lambda$1$lambda$0(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(RecurringInvestmentBottomSheetFragment recurringInvestmentBottomSheetFragment, ApiInvestmentSchedule.Frequency frequency) {
        recurringInvestmentBottomSheetFragment.onSelectFrequency(frequency);
        return Unit.INSTANCE;
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
        this.adapter.submitList(CollectionsKt.toList(ApiInvestmentSchedule.Frequency.INSTANCE.getDeterministicValues()));
        RecyclerView bottomSheetFragmentList = getBinding().bottomSheetFragmentList;
        Intrinsics.checkNotNullExpressionValue(bottomSheetFragmentList, "bottomSheetFragmentList");
        bindAdapter(bottomSheetFragmentList, this.adapter);
    }

    private final void onSelectFrequency(ApiInvestmentSchedule.Frequency updatedFrequency) {
        getCallbacks().onUpdateFrequency(updatedFrequency);
        dismiss();
    }

    /* compiled from: RecurringInvestmentBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment$Companion;", "", "<init>", "()V", "ARG_INVESTMENT_FREQUENCY", "", "ARG_IS_CRYPTO", "newInstance", "Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentBottomSheetFragment;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RecurringInvestmentBottomSheetFragment newInstance(ApiInvestmentSchedule.Frequency frequency, boolean isCrypto) {
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            RecurringInvestmentBottomSheetFragment recurringInvestmentBottomSheetFragment = new RecurringInvestmentBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(RecurringInvestmentBottomSheetFragment.ARG_INVESTMENT_FREQUENCY, frequency);
            bundle.putSerializable(RecurringInvestmentBottomSheetFragment.ARG_IS_CRYPTO, Boolean.valueOf(isCrypto));
            recurringInvestmentBottomSheetFragment.setArguments(bundle);
            return recurringInvestmentBottomSheetFragment;
        }
    }
}
