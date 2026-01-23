package com.robinhood.android.options.simulatedreturn;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment;
import com.robinhood.android.common.options.tradebar.OptionsTradeBarSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.options.contracts.OptionsSimulatedReturnFragmentKey;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.scarlet.ScarletContextWrapper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnParentFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "bodyFragment", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment;", "getBodyFragment", "()Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnFragment;", "tradeBarFragment", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "getTradeBarFragment", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onAttach", "context", "Landroid/content/Context;", "onTradebarHeightUpdated", "newHeight", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnParentFragment extends BaseFragment implements OptionsDetailPageTradebarFragment.Callbacks, RegionGated {
    public static final String TAG_OPR_BODY = "TAG_OPR_BODY";
    public static final String TAG_TRADE_BAR = "TAG_TRADE_BAR";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final boolean hasBottomBar;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionsSimulatedReturnParentFragment() {
        super(C23755R.layout.fragment_options_simulated_return_parent);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.hasBottomBar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    private final OptionsSimulatedReturnFragment getBodyFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(TAG_OPR_BODY);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment");
        return (OptionsSimulatedReturnFragment) fragmentFindFragmentByTag;
    }

    private final OptionsDetailPageTradebarFragment getTradeBarFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("TAG_TRADE_BAR");
        if (fragmentFindFragmentByTag instanceof OptionsDetailPageTradebarFragment) {
            return (OptionsDetailPageTradebarFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if (!OptionsSimulatedReturnUtils.isDeviceSmallForOptionsSimulatedReturn(fragmentActivityRequireActivity)) {
                getChildFragmentManager().beginTransaction().add(C23755R.id.trade_bar_fragment, (OptionsDetailPageTradebarFragment) OptionsDetailPageTradebarFragment.INSTANCE.newInstance((Parcelable) new OptionsDetailPageTradebarFragment.Args(((OptionsSimulatedReturnFragmentKey) INSTANCE.getArgs((Fragment) this)).getFixedAccountNumber(), OptionsTradeBarSource.SIMULATED_RETURNS, true, true)), "TAG_TRADE_BAR").commit();
            }
            getChildFragmentManager().beginTransaction().add(C23755R.id.body_fragment, (OptionsSimulatedReturnFragment) OptionsSimulatedReturnFragment.INSTANCE.newInstance((Parcelable) new OptionsSimulatedReturnFragment.Args((OptionsSimulatedReturnFragmentKey) INSTANCE.getArgs((Fragment) this))), TAG_OPR_BODY).commit();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OptionsDetailPageTradebarFragment tradeBarFragment = getTradeBarFragment();
        if (tradeBarFragment != null) {
            Companion companion = INSTANCE;
            tradeBarFragment.passInTradebarSelfFetchData(new OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch(((OptionsSimulatedReturnFragmentKey) companion.getArgs((Fragment) this)).getActiveChartSpan(), ((OptionsSimulatedReturnFragmentKey) companion.getArgs((Fragment) this)).getStrategyCode(), ((OptionsSimulatedReturnFragmentKey) companion.getArgs((Fragment) this)).isLegContext()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment.Callbacks
    public void onTradebarHeightUpdated(int newHeight) {
        getBodyFragment().onTradebarHeightUpdated(newHeight);
    }

    /* compiled from: OptionsSimulatedReturnParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/simulatedreturn/OptionsSimulatedReturnParentFragment;", "Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "<init>", "()V", OptionsSimulatedReturnParentFragment.TAG_OPR_BODY, "", "TAG_TRADE_BAR", "feature-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionsSimulatedReturnParentFragment, OptionsSimulatedReturnFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionsSimulatedReturnFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionsSimulatedReturnFragmentKey getArgs(OptionsSimulatedReturnParentFragment optionsSimulatedReturnParentFragment) {
            return (OptionsSimulatedReturnFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionsSimulatedReturnParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsSimulatedReturnParentFragment newInstance(OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey) {
            return (OptionsSimulatedReturnParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionsSimulatedReturnFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsSimulatedReturnParentFragment optionsSimulatedReturnParentFragment, OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionsSimulatedReturnParentFragment, optionsSimulatedReturnFragmentKey);
        }
    }
}
