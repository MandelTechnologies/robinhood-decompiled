package com.robinhood.android.common.recurring.amount.type;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PaycheckInvestmentScheduleStore;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RecurringOrderAmountTypeLoadingFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "paycheckInvestmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "getPaycheckInvestmentScheduleStore", "()Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;", "setPaycheckInvestmentScheduleStore", "(Lcom/robinhood/librobinhood/data/store/PaycheckInvestmentScheduleStore;)V", "<set-?>", "", "hasLoadedPaycheckInvestmentSchedules", "getHasLoadedPaycheckInvestmentSchedules", "()Z", "setHasLoadedPaycheckInvestmentSchedules", "(Z)V", "hasLoadedPaycheckInvestmentSchedules$delegate", "Lkotlin/properties/ReadWriteProperty;", "callbacks", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isCrypto", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeLoadingFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: hasLoadedPaycheckInvestmentSchedules$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasLoadedPaycheckInvestmentSchedules;
    public PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringOrderAmountTypeLoadingFragment.class, "hasLoadedPaycheckInvestmentSchedules", "getHasLoadedPaycheckInvestmentSchedules()Z", 0)), Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountTypeLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderAmountTypeLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Callbacks;", "", "onAmountTypeSelectionRequired", "", "existingSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "onAmountTypeSelectionComplete", "wasAmountTypePreselected", "", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountTypeSelectionComplete(boolean wasAmountTypePreselected, AmountType amountType, List<UiPaycheckInvestmentSchedule> existingSchedules);

        void onAmountTypeSelectionRequired(List<UiPaycheckInvestmentSchedule> existingSchedules);
    }

    public RecurringOrderAmountTypeLoadingFragment() {
        super(C11595R.layout.fragment_recurring_order_amount_type_loading);
        this.hasLoadedPaycheckInvestmentSchedules = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeLoadingFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final PaycheckInvestmentScheduleStore getPaycheckInvestmentScheduleStore() {
        PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore = this.paycheckInvestmentScheduleStore;
        if (paycheckInvestmentScheduleStore != null) {
            return paycheckInvestmentScheduleStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paycheckInvestmentScheduleStore");
        return null;
    }

    public final void setPaycheckInvestmentScheduleStore(PaycheckInvestmentScheduleStore paycheckInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(paycheckInvestmentScheduleStore, "<set-?>");
        this.paycheckInvestmentScheduleStore = paycheckInvestmentScheduleStore;
    }

    private final boolean getHasLoadedPaycheckInvestmentSchedules() {
        return ((Boolean) this.hasLoadedPaycheckInvestmentSchedules.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setHasLoadedPaycheckInvestmentSchedules(boolean z) {
        this.hasLoadedPaycheckInvestmentSchedules.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
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
    public void onResume() {
        super.onResume();
        if (getHasLoadedPaycheckInvestmentSchedules()) {
            onBackPressed();
            return;
        }
        Observable<List<UiPaycheckInvestmentSchedule>> observableTake = getPaycheckInvestmentScheduleStore().getPaycheckInvestmentSchedulesWithoutDirectDepositRelationship().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight$default(observableTake, 350L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeLoadingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountTypeLoadingFragment.onResume$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(RecurringOrderAmountTypeLoadingFragment recurringOrderAmountTypeLoadingFragment, List list) {
        recurringOrderAmountTypeLoadingFragment.setHasLoadedPaycheckInvestmentSchedules(true);
        if (list.isEmpty()) {
            Callbacks callbacks = recurringOrderAmountTypeLoadingFragment.getCallbacks();
            Intrinsics.checkNotNull(list);
            callbacks.onAmountTypeSelectionRequired(list);
        } else {
            Callbacks callbacks2 = recurringOrderAmountTypeLoadingFragment.getCallbacks();
            Intrinsics.checkNotNull(list);
            callbacks2.onAmountTypeSelectionComplete(true, ((UiPaycheckInvestmentSchedule) CollectionsKt.first(list)).getInvestmentScheduleAmount().getAmountType(), list);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringOrderAmountTypeLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderAmountTypeLoadingFragment, RecurringOrderAmountTypeArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringOrderAmountTypeArgs getArgs(RecurringOrderAmountTypeLoadingFragment recurringOrderAmountTypeLoadingFragment) {
            return (RecurringOrderAmountTypeArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderAmountTypeLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderAmountTypeLoadingFragment newInstance(RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            return (RecurringOrderAmountTypeLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringOrderAmountTypeArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderAmountTypeLoadingFragment recurringOrderAmountTypeLoadingFragment, RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderAmountTypeLoadingFragment, recurringOrderAmountTypeArgs);
        }
    }
}
