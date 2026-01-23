package com.robinhood.android.cash.flat.cashback.p071ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.flat.cashback.p071ui.FlatCashbackInstantAccessFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.FlatCashbackUpsellFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.rad.FlatCashbackRadOnboardingFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.DirectDepositV3Contract;
import com.robinhood.android.rhy.contracts.FlatCashbackOnboardingContract;
import com.robinhood.scarlet.ScarletContextWrapper;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FlatCashbackOnboardingFlowFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001-B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\t\u0010'\u001a\u00020\nH\u0096\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Callbacks;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment$Callbacks;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessFragment$Callbacks;", "Lcom/robinhood/android/cash/flat/cashback/ui/rad/FlatCashbackRadOnboardingFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDirectDepositSelected", "onRecurringAchSelected", "onDirectDepositFlowCompleted", "completionType", "Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$CompletionType;", "onRecurringDepositSuccess", "onInstantAccessConfirmed", "openInstantAccessFragment", "accessSource", "Lcom/robinhood/android/cash/flat/cashback/ui/AccessSource;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackOnboardingFlowFragment extends BaseFragment implements RegionGated, DirectDepositV3Contract.Callbacks, FlatCashbackUpsellFragment.Callbacks, FlatCashbackInstantAccessFragment.Callbacks, FlatCashbackRadOnboardingFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FlatCashbackOnboardingFlowFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FlatCashbackOnboardingContract.EntryPoint.values().length];
            try {
                iArr[FlatCashbackOnboardingContract.EntryPoint.UPSELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlatCashbackOnboardingContract.EntryPoint.DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlatCashbackOnboardingContract.EntryPoint.RECURRING_ACH_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DirectDepositV3Contract.CompletionType.values().length];
            try {
                iArr2[DirectDepositV3Contract.CompletionType.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DirectDepositV3Contract.CompletionType.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public FlatCashbackOnboardingFlowFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.duxo = DuxosKt.duxo(this, FlatCashbackOnboardingFlowDuxo.class);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FlatCashbackOnboardingFlowDuxo getDuxo() {
        return (FlatCashbackOnboardingFlowDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[((FlatCashbackOnboardingContract.Key) INSTANCE.getArgs((Fragment) this)).getSource().ordinal()];
            if (i == 1) {
                setFragment(C11048R.id.fragment_container, new FlatCashbackUpsellFragment());
            } else if (i == 2) {
                onDirectDepositSelected();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                onRecurringAchSelected();
            }
        }
    }

    @Override // com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment.Callbacks
    public void onDirectDepositSelected() {
        setOrReplaceFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), DirectDepositV3Contract.Key.INSTANCE, null, 2, null));
        getDuxo().loadEligibleOffers(TrialRequest3.DD_CONTEXT);
    }

    @Override // com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment.Callbacks
    public void onRecurringAchSelected() {
        setOrReplaceFragment(C11048R.id.fragment_container, new FlatCashbackRadOnboardingFragment());
    }

    @Override // com.robinhood.android.rhy.contracts.DirectDepositV3Contract.Callbacks
    public void onDirectDepositFlowCompleted(DirectDepositV3Contract.CompletionType completionType) {
        Intrinsics.checkNotNullParameter(completionType, "completionType");
        int i = WhenMappings.$EnumSwitchMapping$1[completionType.ordinal()];
        if (i == 1) {
            openInstantAccessFragment(TrialRequest2.AUTOMATIC_DIRECT_DEPOSIT);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            openInstantAccessFragment(TrialRequest2.MANUAL_DIRECT_DEPOSIT);
        }
    }

    @Override // com.robinhood.android.cash.flat.cashback.ui.rad.FlatCashbackRadOnboardingFragment.Callbacks
    public void onRecurringDepositSuccess() {
        openInstantAccessFragment(TrialRequest2.RECURRING_ACH_DEPOSIT);
    }

    @Override // com.robinhood.android.cash.flat.cashback.ui.FlatCashbackInstantAccessFragment.Callbacks
    public void onInstantAccessConfirmed() {
        requireActivity().finish();
    }

    private final void openInstantAccessFragment(TrialRequest2 accessSource) {
        FlatCashbackInstantAccessFragment.Args args;
        BaseFlatCashbackViewState baseFlatCashbackViewState = (BaseFlatCashbackViewState) getDuxo().getStateFlow().getValue();
        if (baseFlatCashbackViewState instanceof BaseFlatCashbackViewState.Loaded) {
            args = new FlatCashbackInstantAccessFragment.Args(accessSource, TrialRequest3.getTrialEligibility(((FlatCashbackOnboardingFlowViewState) ((BaseFlatCashbackViewState.Loaded) baseFlatCashbackViewState).getLoadedViewState()).getOfferId(), accessSource));
        } else {
            args = new FlatCashbackInstantAccessFragment.Args(accessSource, null);
        }
        replaceFragment(FlatCashbackInstantAccessFragment.INSTANCE.newInstance((Parcelable) args));
    }

    /* compiled from: FlatCashbackOnboardingFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackOnboardingFlowFragment;", "Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$Key;", "<init>", "()V", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<FlatCashbackOnboardingFlowFragment, FlatCashbackOnboardingContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FlatCashbackOnboardingContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FlatCashbackOnboardingContract.Key getArgs(FlatCashbackOnboardingFlowFragment flatCashbackOnboardingFlowFragment) {
            return (FlatCashbackOnboardingContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, flatCashbackOnboardingFlowFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FlatCashbackOnboardingFlowFragment newInstance(FlatCashbackOnboardingContract.Key key) {
            return (FlatCashbackOnboardingFlowFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FlatCashbackOnboardingFlowFragment flatCashbackOnboardingFlowFragment, FlatCashbackOnboardingContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, flatCashbackOnboardingFlowFragment, key);
        }
    }
}
