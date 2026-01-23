package com.robinhood.android.login;

import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.shared.login.lib.p385ui.BaseLoginFragment;
import com.robinhood.shared.user.contracts.auth.LoginFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LoginFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/login/LoginFragment;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginFragment;", "<init>", "()V", "isAchromatic", "", "()Z", "emailPrefill", "", "getEmailPrefill", "()Ljava/lang/String;", "launchForgotEmail", "getLaunchForgotEmail", "Companion", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LoginFragment extends BaseLoginFragment {
    private final boolean isAchromatic = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseLoginFragment.$stable;

    @Override // com.robinhood.shared.login.lib.p385ui.BaseLoginFragment
    /* renamed from: isAchromatic, reason: from getter */
    protected boolean getIsAchromatic() {
        return this.isAchromatic;
    }

    @Override // com.robinhood.shared.login.lib.p385ui.BaseLoginFragment
    protected String getEmailPrefill() {
        return ((LoginFragmentKey) INSTANCE.getArgs((Fragment) this)).getEmail();
    }

    @Override // com.robinhood.shared.login.lib.p385ui.BaseLoginFragment
    protected boolean getLaunchForgotEmail() {
        return ((LoginFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchForgotEmail();
    }

    /* compiled from: LoginFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/login/LoginFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/login/LoginFragment;", "Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey;", "<init>", "()V", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoginFragment, LoginFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LoginFragmentKey loginFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, loginFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoginFragmentKey getArgs(LoginFragment loginFragment) {
            return (LoginFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loginFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoginFragment newInstance(LoginFragmentKey loginFragmentKey) {
            return (LoginFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, loginFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoginFragment loginFragment, LoginFragmentKey loginFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loginFragment, loginFragmentKey);
        }
    }
}
