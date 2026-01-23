package com.robinhood.android.account.naming;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.naming.AccountNicknamesFragmentKey;
import com.robinhood.android.account.contracts.naming.EditAccountNicknameFragmentKey;
import com.robinhood.android.account.contracts.naming.EditNicknameCallback;
import com.robinhood.android.account.naming.list.AccountNicknameListFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameParentFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/account/naming/AccountNicknameParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorCallbacks;", "Lcom/robinhood/android/account/contracts/naming/AccountEditNicknameCallback;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAccountSelected", "accountNumber", "", "onAccountNicknameUpdated", "Companion", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNicknameParentFragment extends BaseFragment implements AccountSelectorCallbacks, EditNicknameCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public AccountNicknameParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, AccountNicknameListFragment.INSTANCE.newInstance((Parcelable) new AccountNicknameListFragment.Args(((AccountNicknamesFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource())));
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks
    public void onAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new EditAccountNicknameFragmentKey(accountNumber, ((AccountNicknamesFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource()), null, 2, null));
    }

    @Override // com.robinhood.android.account.contracts.naming.EditNicknameCallback
    public void onAccountNicknameUpdated() {
        requireBaseActivity().onBackPressed();
    }

    /* compiled from: AccountNicknameParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/naming/AccountNicknameParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/naming/AccountNicknameParentFragment;", "Lcom/robinhood/android/account/contracts/naming/AccountNicknamesFragmentKey;", "<init>", "()V", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountNicknameParentFragment, AccountNicknamesFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountNicknamesFragmentKey accountNicknamesFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountNicknamesFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountNicknamesFragmentKey getArgs(AccountNicknameParentFragment accountNicknameParentFragment) {
            return (AccountNicknamesFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountNicknameParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountNicknameParentFragment newInstance(AccountNicknamesFragmentKey accountNicknamesFragmentKey) {
            return (AccountNicknameParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountNicknamesFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountNicknameParentFragment accountNicknameParentFragment, AccountNicknamesFragmentKey accountNicknamesFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountNicknameParentFragment, accountNicknamesFragmentKey);
        }
    }
}
