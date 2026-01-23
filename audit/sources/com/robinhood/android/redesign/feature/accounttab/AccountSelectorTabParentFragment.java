package com.robinhood.android.redesign.feature.accounttab;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.redesign.accounttab.AccountSelectorFragmentKey;
import com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorTabParentFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorTabParentFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/shared/home/contracts/AccountSelectorTabLinkIntentHandler;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showRootFragment", "handleDeeplinkAccountTabSwitch", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "Companion", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountSelectorTabParentFragment extends BaseTabFragment implements Scrollable, AccountSelectorTabLinkIntentHandler {
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseTabFragment.$stable;

    public AccountSelectorTabParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            showRootFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getRootFragment() != null) {
            handleDeeplink();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        setRootFragment((AccountSelectorFragment) AccountSelectorFragment.INSTANCE.newInstance(INSTANCE.getArgs((Fragment) this)));
        notifyFragmentChanged();
        handleDeeplink();
    }

    @Override // com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler
    public void handleDeeplinkAccountTabSwitch(TabLinkIntentKey tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        ActivityResultCaller rootFragment = getRootFragment();
        Intrinsics.checkNotNull(rootFragment, "null cannot be cast to non-null type com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler");
        ((AccountSelectorTabLinkIntentHandler) rootFragment).handleDeeplinkAccountTabSwitch(tabIntentKey);
    }

    /* compiled from: AccountSelectorTabParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorTabParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorTabParentFragment;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorFragmentKey;", "<init>", "()V", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountSelectorTabParentFragment, AccountSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountSelectorFragmentKey accountSelectorFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountSelectorFragmentKey getArgs(AccountSelectorTabParentFragment accountSelectorTabParentFragment) {
            return (AccountSelectorFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountSelectorTabParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSelectorTabParentFragment newInstance(AccountSelectorFragmentKey accountSelectorFragmentKey) {
            return (AccountSelectorTabParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSelectorTabParentFragment accountSelectorTabParentFragment, AccountSelectorFragmentKey accountSelectorFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountSelectorTabParentFragment, accountSelectorFragmentKey);
        }
    }
}
