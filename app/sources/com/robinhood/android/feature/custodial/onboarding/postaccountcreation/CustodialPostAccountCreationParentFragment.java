package com.robinhood.android.feature.custodial.onboarding.postaccountcreation;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.naming.EditAccountNicknameFragmentKey;
import com.robinhood.android.account.contracts.naming.EditNicknameCallback;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.custodial.contracts.CustodialPostAccountCreationKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CustodialPostAccountCreationParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/postaccountcreation/CustodialPostAccountCreationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/account/contracts/naming/AccountEditNicknameCallback;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAccountNicknameUpdated", "launchPostAccountCreationCelebration", "Companion", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.custodial.onboarding.postaccountcreation.CustodialPostAccountCreationFragment, reason: use source file name */
/* loaded from: classes3.dex */
public final class CustodialPostAccountCreationParentFragment extends BaseFragment implements EditNicknameCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public CustodialPostAccountCreationParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            if (((CustodialPostAccountCreationKey) companion.getArgs((Fragment) this)).getEditNickname()) {
                setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new EditAccountNicknameFragmentKey(((CustodialPostAccountCreationKey) companion.getArgs((Fragment) this)).getAccountNumber(), null), null, 2, null));
            } else {
                launchPostAccountCreationCelebration();
            }
        }
    }

    @Override // com.robinhood.android.account.contracts.naming.EditNicknameCallback
    public void onAccountNicknameUpdated() {
        launchPostAccountCreationCelebration();
    }

    private final void launchPostAccountCreationCelebration() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MicrogramRouterFragmentKey(new RemoteMicrogramApplication(((CustodialPostAccountCreationKey) companion.getArgs((Fragment) this)).getMicrogramApp(), null, 2, null), "robinhood://deeplink?account_number=" + ((CustodialPostAccountCreationKey) companion.getArgs((Fragment) this)).getAccountNumber(), null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
    }

    /* compiled from: CustodialPostAccountCreationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/custodial/onboarding/postaccountcreation/CustodialPostAccountCreationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/custodial/onboarding/postaccountcreation/CustodialPostAccountCreationFragment;", "Lcom/robinhood/android/custodial/contracts/CustodialPostAccountCreationKey;", "<init>", "()V", "feature-custodial-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.custodial.onboarding.postaccountcreation.CustodialPostAccountCreationFragment$Companion, reason: from kotlin metadata */
    public static final class Companion implements FragmentResolverWithArgsCompanion<CustodialPostAccountCreationParentFragment, CustodialPostAccountCreationKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CustodialPostAccountCreationKey custodialPostAccountCreationKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, custodialPostAccountCreationKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CustodialPostAccountCreationKey getArgs(CustodialPostAccountCreationParentFragment custodialPostAccountCreationParentFragment) {
            return (CustodialPostAccountCreationKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, custodialPostAccountCreationParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CustodialPostAccountCreationParentFragment newInstance(CustodialPostAccountCreationKey custodialPostAccountCreationKey) {
            return (CustodialPostAccountCreationParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, custodialPostAccountCreationKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CustodialPostAccountCreationParentFragment custodialPostAccountCreationParentFragment, CustodialPostAccountCreationKey custodialPostAccountCreationKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, custodialPostAccountCreationParentFragment, custodialPostAccountCreationKey);
        }
    }
}
