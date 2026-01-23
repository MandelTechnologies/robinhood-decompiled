package com.robinhood.android.common.recurring.amount.type;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment;
import com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeLoadingFragment;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import kotlin.Metadata;
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

/* compiled from: RecurringOrderAmountTypeShimFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u0002/0B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\rH\u0016J\u0016\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016J&\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020.2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeLoadingFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "hasSelectedAmountType", "getHasSelectedAmountType", "()Z", "setHasSelectedAmountType", "(Z)V", "hasSelectedAmountType$delegate", "Lkotlin/properties/ReadWriteProperty;", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "isCrypto", RecurringOrderConfirmationFragment.ARG_IS_BROKERAGE_CASH_TRANSFER, "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onAmountTypeSelectionRequired", "existingSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "onAmountTypeSelectionComplete", "wasAmountTypePreselected", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "Callbacks", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeShimFragment extends BaseFragment implements RecurringOrderAmountTypeLoadingFragment.Callbacks, RecurringOrderAmountTypeFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: hasSelectedAmountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasSelectedAmountType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringOrderAmountTypeShimFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecurringOrderAmountTypeShimFragment.class, "hasSelectedAmountType", "getHasSelectedAmountType()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringOrderAmountTypeShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Callbacks;", "", "onAmountTypeSelectionComplete", "", "wasAmountTypePreselected", "", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "existingSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountTypeSelectionComplete(boolean wasAmountTypePreselected, AmountType amountType, List<UiPaycheckInvestmentSchedule> existingSchedules);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return false;
    }

    public RecurringOrderAmountTypeShimFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeShimFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.hasSelectedAmountType = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean getHasSelectedAmountType() {
        return ((Boolean) this.hasSelectedAmountType.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setHasSelectedAmountType(boolean z) {
        this.hasSelectedAmountType.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return ((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) this)).getAssetType().isCrypto();
    }

    private final boolean isBrokerageCashTransfer() {
        return ((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) this)).isBrokerageCashTransfer();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (isBrokerageCashTransfer()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        BaseFragment baseFragment;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            Companion companion = INSTANCE;
            if (((RecurringOrderAmountTypeArgs) companion.getArgs((Fragment) this)).getDirectDepositRelationshipId() == null) {
                baseFragment = (BaseFragment) RecurringOrderAmountTypeLoadingFragment.INSTANCE.newInstance(companion.getArgs((Fragment) this));
            } else {
                baseFragment = (BaseFragment) RecurringOrderAmountTypeFragment.INSTANCE.newInstance(companion.getArgs((Fragment) this));
            }
            setFragment(i, baseFragment);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ((getCurrentFragment() instanceof RecurringOrderAmountTypeLoadingFragment) && getHasSelectedAmountType()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeShimFragment.onResume.1
                @Override // java.lang.Runnable
                public final void run() {
                    Fragment fragmentRequireParentFragment = RecurringOrderAmountTypeShimFragment.this.requireParentFragment();
                    Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
                    ((BaseFragment) fragmentRequireParentFragment).onBackPressed();
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        ScarletManager scarletManager;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (!isBrokerageCashTransfer() || (rhToolbar = getRhToolbar()) == null || (scarletManager = ScarletManager2.getScarletManager(rhToolbar)) == null) {
            return;
        }
        ScarletManager.putOverlay$default(scarletManager, AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeLoadingFragment.Callbacks
    public void onAmountTypeSelectionRequired(List<UiPaycheckInvestmentSchedule> existingSchedules) {
        Intrinsics.checkNotNullParameter(existingSchedules, "existingSchedules");
        replaceFragment(RecurringOrderAmountTypeFragment.INSTANCE.newInstance((Parcelable) RecurringOrderAmountTypeArgs.copy$default((RecurringOrderAmountTypeArgs) INSTANCE.getArgs((Fragment) this), null, false, null, null, null, null, existingSchedules, 63, null)));
    }

    @Override // com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeLoadingFragment.Callbacks, com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeFragment.Callbacks
    public void onAmountTypeSelectionComplete(boolean wasAmountTypePreselected, AmountType amountType, List<UiPaycheckInvestmentSchedule> existingSchedules) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(existingSchedules, "existingSchedules");
        setHasSelectedAmountType(true);
        getCallbacks().onAmountTypeSelectionComplete(wasAmountTypePreselected, amountType, existingSchedules);
    }

    /* compiled from: RecurringOrderAmountTypeShimFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeShimFragment;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecurringOrderAmountTypeShimFragment, RecurringOrderAmountTypeArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringOrderAmountTypeArgs getArgs(RecurringOrderAmountTypeShimFragment recurringOrderAmountTypeShimFragment) {
            return (RecurringOrderAmountTypeArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recurringOrderAmountTypeShimFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecurringOrderAmountTypeShimFragment newInstance(RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            return (RecurringOrderAmountTypeShimFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, recurringOrderAmountTypeArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecurringOrderAmountTypeShimFragment recurringOrderAmountTypeShimFragment, RecurringOrderAmountTypeArgs recurringOrderAmountTypeArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recurringOrderAmountTypeShimFragment, recurringOrderAmountTypeArgs);
        }
    }
}
