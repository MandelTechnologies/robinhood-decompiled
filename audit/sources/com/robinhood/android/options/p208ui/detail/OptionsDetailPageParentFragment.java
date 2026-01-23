package com.robinhood.android.options.p208ui.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.charts.BentoExtensions;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment;
import com.robinhood.android.common.options.tradebar.OptionsTradeBarSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageParentFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\bH\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "bodyFragment", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment;", "getBodyFragment", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment;", "tradebarFragment", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "getTradebarFragment", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTradebarHeightUpdated", "newHeight", "", "onTradebarDataFetched", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$PassIn;", "setDirectionOverlay", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsDetailPageParentFragment extends BaseFragment implements OptionsDetailPageTradebarFragment.Callbacks, OptionsDetailPageFragment.Callbacks, RegionGated {
    public static final String TAG_ODP_BODY = "TAG_ODP_BODY";
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

    public OptionsDetailPageParentFragment() {
        super(C22993R.layout.fragment_options_detail_page_parent);
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

    private final OptionsDetailPageFragment getBodyFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(TAG_ODP_BODY);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.options.ui.detail.OptionsDetailPageFragment");
        return (OptionsDetailPageFragment) fragmentFindFragmentByTag;
    }

    private final OptionsDetailPageTradebarFragment getTradebarFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("TAG_TRADE_BAR");
        if (fragmentFindFragmentByTag instanceof OptionsDetailPageTradebarFragment) {
            return (OptionsDetailPageTradebarFragment) fragmentFindFragmentByTag;
        }
        return null;
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
            getChildFragmentManager().beginTransaction().add(C22993R.id.trade_bar_fragment, (OptionsDetailPageTradebarFragment) OptionsDetailPageTradebarFragment.INSTANCE.newInstance((Parcelable) new OptionsDetailPageTradebarFragment.Args(null, OptionsTradeBarSource.ODP, false, false, 1, null)), "TAG_TRADE_BAR").commit();
            getChildFragmentManager().beginTransaction().add(C22993R.id.body_fragment, (OptionsDetailPageFragment) OptionsDetailPageFragment.INSTANCE.newInstance((Parcelable) new OptionsDetailPageFragment.Args(((OptionsDetailPageFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchMode())), TAG_ODP_BODY).commit();
        }
    }

    @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment.Callbacks
    public void onTradebarHeightUpdated(int newHeight) {
        getBodyFragment().onTradebarHeightUpdated(newHeight);
    }

    @Override // com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.Callbacks
    public void onTradebarDataFetched(OptionsDetailPageTradebarDataState.DataFetchMode.PassIn data) {
        Intrinsics.checkNotNullParameter(data, "data");
        OptionsDetailPageTradebarFragment tradebarFragment = getTradebarFragment();
        if (tradebarFragment != null) {
            tradebarFragment.onTradebarDataFetched(data);
        }
    }

    @Override // com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.Callbacks
    public void setDirectionOverlay(Direction pageDirection) {
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(viewRequireView), BentoExtensions.getOverlay(pageDirection), null, 2, null);
    }

    /* compiled from: OptionsDetailPageParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageParentFragment;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageFragmentKey;", "<init>", "()V", OptionsDetailPageParentFragment.TAG_ODP_BODY, "", "TAG_TRADE_BAR", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionsDetailPageParentFragment, OptionsDetailPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionsDetailPageFragmentKey optionsDetailPageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionsDetailPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionsDetailPageFragmentKey getArgs(OptionsDetailPageParentFragment optionsDetailPageParentFragment) {
            return (OptionsDetailPageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionsDetailPageParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsDetailPageParentFragment newInstance(OptionsDetailPageFragmentKey optionsDetailPageFragmentKey) {
            return (OptionsDetailPageParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionsDetailPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsDetailPageParentFragment optionsDetailPageParentFragment, OptionsDetailPageFragmentKey optionsDetailPageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionsDetailPageParentFragment, optionsDetailPageFragmentKey);
        }
    }
}
