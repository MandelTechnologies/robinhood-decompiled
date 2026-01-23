package com.robinhood.shared.accountactivityexporter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.shared.account.contracts.AccountActivityExporterFragmentKey;
import com.robinhood.shared.accountactivityexporter.AccountActivityExporterFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccountActivityExporterParentFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "launchAccountExportRequest", "Companion", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountActivityExporterParentFragment extends BaseFragment implements AccountActivityExporterFragment.Callbacks {
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public AccountActivityExporterParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, new AccountActivityExporterFragment());
        }
    }

    @Override // com.robinhood.shared.accountactivityexporter.AccountActivityExporterFragment.Callbacks
    public void launchAccountExportRequest() {
        replaceFragment(new AccountActivityExporterRequestFragment());
    }

    /* compiled from: AccountActivityExporterParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterParentFragment;", "Lcom/robinhood/shared/account/contracts/AccountActivityExporterFragmentKey;", "<init>", "()V", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountActivityExporterParentFragment, AccountActivityExporterFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountActivityExporterFragmentKey accountActivityExporterFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountActivityExporterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountActivityExporterFragmentKey getArgs(AccountActivityExporterParentFragment accountActivityExporterParentFragment) {
            return (AccountActivityExporterFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountActivityExporterParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountActivityExporterParentFragment newInstance(AccountActivityExporterFragmentKey accountActivityExporterFragmentKey) {
            return (AccountActivityExporterParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountActivityExporterFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountActivityExporterParentFragment accountActivityExporterParentFragment, AccountActivityExporterFragmentKey accountActivityExporterFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountActivityExporterParentFragment, accountActivityExporterFragmentKey);
        }
    }
}
