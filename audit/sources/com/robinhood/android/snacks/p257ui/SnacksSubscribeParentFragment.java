package com.robinhood.android.snacks.p257ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SnacksRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.snacks.C28692R;
import com.robinhood.android.snacks.p257ui.SnacksSplashFragment;
import com.robinhood.android.snacks.p257ui.SnacksSubscribeFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnacksSubscribeParentFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/snacks/ui/SnacksSplashFragment$Callbacks;", "Lcom/robinhood/android/snacks/ui/SnacksSubscribeFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSubscribeClicked", "onDisclosuresLinkClicked", "onDoneClicked", "onSubscribeError", "throwable", "", "onUpdateEmail", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SnacksSubscribeParentFragment extends BaseFragment implements RegionGated, SnacksSplashFragment.Callbacks, SnacksSubscribeFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

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

    public SnacksSubscribeParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(SnacksRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, SnacksSplashFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.android.snacks.ui.SnacksSplashFragment.Callbacks
    public void onSubscribeClicked() {
        replaceFragment(SnacksSubscribeFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.snacks.ui.SnacksSplashFragment.Callbacks, com.robinhood.android.snacks.ui.SnacksSubscribeFragment.Callbacks
    public void onDisclosuresLinkClicked() {
        WebUtils.viewUrl$default(requireActivity(), getString(C28692R.string.url_snacks_disclosure), 0, 4, (Object) null);
    }

    @Override // com.robinhood.android.snacks.ui.SnacksSubscribeFragment.Callbacks
    public void onDoneClicked() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.snacks.ui.SnacksSubscribeFragment.Callbacks
    public void onSubscribeError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), throwable, false, 2, null)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, C11048R.string.general_error_summary, -1);
        }
        popLastFragment();
    }

    @Override // com.robinhood.android.snacks.ui.SnacksSubscribeFragment.Callbacks
    public void onUpdateEmail() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_UPDATE_ACCOUNT, false, false, false, null, null, null, null, false, 510, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        fragmentActivityRequireActivity.finish();
    }

    /* compiled from: SnacksSubscribeParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/snacks/ui/SnacksSubscribeParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SnacksSubscribe;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-snacks_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.SnacksSubscribe> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SnacksSubscribe key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new SnacksSubscribeParentFragment();
        }
    }
}
