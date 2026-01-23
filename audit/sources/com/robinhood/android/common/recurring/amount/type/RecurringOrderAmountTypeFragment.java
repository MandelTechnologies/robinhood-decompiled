package com.robinhood.android.common.recurring.amount.type;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderAmountTypeBinding;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringOrderAmountTypeFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u00020#*\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeDuxo;", "getDuxo", "()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderAmountTypeBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderAmountTypeBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Callbacks;", "callbacks$delegate", "isCrypto", "", "()Z", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Landroid/view/View;", "bindViewState", "viewState", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState;", "bindAmountTypeOptionRow", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "isAmountTypeSelected", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountTypeFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderAmountTypeBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountTypeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderAmountTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Callbacks;", "", "onAmountTypeSelectionComplete", "", "wasAmountTypePreselected", "", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "existingSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountTypeSelectionComplete(boolean wasAmountTypePreselected, AmountType amountType, List<UiPaycheckInvestmentSchedule> existingSchedules);
    }

    public RecurringOrderAmountTypeFragment() {
        super(C11595R.layout.fragment_recurring_order_amount_type);
        this.duxo = OldDuxos.oldDuxo(this, RecurringOrderAmountTypeDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RecurringOrderAmountTypeFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final RecurringOrderAmountTypeDuxo getDuxo() {
        return (RecurringOrderAmountTypeDuxo) this.duxo.getValue();
    }

    private final FragmentRecurringOrderAmountTypeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecurringOrderAmountTypeBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return ((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) this)).getAssetType().isCrypto();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
        ScarletContextWrapper scarletContextWrapper = ((BaseFragment) fragmentRequireParentFragment).getScarletContextWrapper();
        Intrinsics.checkNotNull(scarletContextWrapper);
        return ContextSystemServices.getLayoutInflater(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentRecurringOrderAmountTypeBinding binding = getBinding();
        binding.amountTypeTitleText.setText(((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) this)).getActionType().getAmountTypeResId());
        RdsRowView amountTypeDollarAmountOptionRow = binding.amountTypeDollarAmountOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypeDollarAmountOptionRow, "amountTypeDollarAmountOptionRow");
        OnClickListeners.onClick(amountTypeDollarAmountOptionRow, new Function0() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountTypeFragment.onViewCreated$lambda$2$lambda$0(this.f$0);
            }
        });
        RdsRowView amountTypePercentageOptionRow = binding.amountTypePercentageOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypePercentageOptionRow, "amountTypePercentageOptionRow");
        OnClickListeners.onClick(amountTypePercentageOptionRow, new Function0() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountTypeFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new RecurringOrderAmountTypeFragment3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$0(RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment) {
        recurringOrderAmountTypeFragment.getDuxo().onAmountTypeSelected(AmountType.DOLLAR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment) {
        recurringOrderAmountTypeFragment.getDuxo().onAmountTypeSelected(AmountType.PERCENTAGE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final RecurringOrderAmountTypeViewState viewState) {
        FragmentRecurringOrderAmountTypeBinding binding = getBinding();
        RdsRowView amountTypeDollarAmountOptionRow = binding.amountTypeDollarAmountOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypeDollarAmountOptionRow, "amountTypeDollarAmountOptionRow");
        amountTypeDollarAmountOptionRow.setVisibility(viewState.isDollarAmountOptionRowVisible() ? 0 : 8);
        RdsRowView amountTypeDollarAmountOptionRow2 = binding.amountTypeDollarAmountOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypeDollarAmountOptionRow2, "amountTypeDollarAmountOptionRow");
        bindAmountTypeOptionRow(amountTypeDollarAmountOptionRow2, viewState.isDollarAmountOptionRowSelected());
        RdsRowView amountTypePercentageOptionRow = binding.amountTypePercentageOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypePercentageOptionRow, "amountTypePercentageOptionRow");
        amountTypePercentageOptionRow.setVisibility(viewState.isPercentageOptionRowVisible() ? 0 : 8);
        RdsRowView amountTypePercentageOptionRow2 = binding.amountTypePercentageOptionRow;
        Intrinsics.checkNotNullExpressionValue(amountTypePercentageOptionRow2, "amountTypePercentageOptionRow");
        bindAmountTypeOptionRow(amountTypePercentageOptionRow2, viewState.isPercentageOptionRowSelected());
        binding.amountTypeSelectedButton.setEnabled(viewState.isAmountTypeSelectedButtonEnabled());
        RdsButton amountTypeSelectedButton = binding.amountTypeSelectedButton;
        Intrinsics.checkNotNullExpressionValue(amountTypeSelectedButton, "amountTypeSelectedButton");
        OnClickListeners.onClick(amountTypeSelectedButton, new Function0() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringOrderAmountTypeFragment.bindViewState$lambda$4$lambda$3(viewState, this);
            }
        });
        RhTextView amountTypeFooter = binding.amountTypeFooter;
        Intrinsics.checkNotNullExpressionValue(amountTypeFooter, "amountTypeFooter");
        amountTypeFooter.setVisibility(viewState.isFooterVisible() ? 0 : 8);
        binding.amountTypeSubtitleText.setText(getResources().getText(viewState.getSubtitleRes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$4$lambda$3(RecurringOrderAmountTypeViewState recurringOrderAmountTypeViewState, RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment) {
        AmountType selectedAmountType = recurringOrderAmountTypeViewState.getSelectedAmountType();
        Intrinsics.checkNotNull(selectedAmountType);
        RecurringOrderAmountTypeFragmentLogging.logAmountTypeSelected(recurringOrderAmountTypeFragment, selectedAmountType, recurringOrderAmountTypeViewState.getRecurringContext());
        Callbacks callbacks = recurringOrderAmountTypeFragment.getCallbacks();
        List<UiPaycheckInvestmentSchedule> existingSchedules = ((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) recurringOrderAmountTypeFragment)).getExistingSchedules();
        if (existingSchedules == null) {
            existingSchedules = CollectionsKt.emptyList();
        }
        callbacks.onAmountTypeSelectionComplete(false, selectedAmountType, existingSchedules);
        return Unit.INSTANCE;
    }

    private final void bindAmountTypeOptionRow(RdsRowView rdsRowView, boolean z) {
        if (z) {
            rdsRowView.setTrailingIconResource(C20690R.drawable.ic_rds_checkmark_24dp);
        } else {
            rdsRowView.setTrailingIconDrawable(null);
        }
    }

    /* compiled from: RecurringOrderAmountTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderAmountTypeFragment, RecurringOrderAmountTypeArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringOrderAmountTypeArgs getArgs(RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment) {
            return (RecurringOrderAmountTypeArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderAmountTypeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderAmountTypeFragment newInstance(RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            return (RecurringOrderAmountTypeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringOrderAmountTypeArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderAmountTypeFragment recurringOrderAmountTypeFragment, RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderAmountTypeFragment, recurringOrderAmountTypeArgs);
        }
    }
}
