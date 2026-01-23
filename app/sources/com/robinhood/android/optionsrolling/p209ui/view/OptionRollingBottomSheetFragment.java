package com.robinhood.android.optionsrolling.p209ui.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyFragment;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyViewState;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionRollingBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "<init>", "()V", "primaryButtonLabel", "", "getPrimaryButtonLabel", "()Ljava/lang/CharSequence;", "callbacks", "Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "Callbacks", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionRollingBottomSheetFragment extends RhBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsrolling.ui.view.OptionRollingBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionRollingBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionRollingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Callbacks;", "", "onGoBack", "", "onViewAccountHistory", "onUpgradeInstant", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onGoBack();

        void onUpgradeInstant();

        void onViewAccountHistory();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected CharSequence getPrimaryButtonLabel() {
        String string2 = getString(C24772R.string.options_rolling_bottom_sheet_go_back);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        getCallbacks().onGoBack();
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        Bundle passthroughArgs = getPassthroughArgs();
        OptionRollingStrategyViewState.RollingBlockingState rollingBlockingState = passthroughArgs != null ? (OptionRollingStrategyViewState.RollingBlockingState) Bundles.getTypedSerializable(passthroughArgs, OptionRollingStrategyFragment.BOTTOM_SHEET_BUNDLE) : null;
        if (rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_BROKERAGE || rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_IRA || rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_BROKERAGE_INSTANT_CASH || rollingBlockingState == OptionRollingStrategyViewState.RollingBlockingState.CASH_ACCOUNT_IRA_INSTANT_CASH) {
            getCallbacks().onUpgradeInstant();
        } else {
            getCallbacks().onViewAccountHistory();
        }
    }

    /* compiled from: OptionRollingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$Args;", "<init>", "()V", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionRollingBottomSheetFragment, RhBottomSheetDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RhBottomSheetDialogFragment.Args getArgs(OptionRollingBottomSheetFragment optionRollingBottomSheetFragment) {
            return (RhBottomSheetDialogFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionRollingBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionRollingBottomSheetFragment newInstance(RhBottomSheetDialogFragment.Args args) {
            return (OptionRollingBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionRollingBottomSheetFragment optionRollingBottomSheetFragment, RhBottomSheetDialogFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionRollingBottomSheetFragment, args);
        }
    }
}
