package com.robinhood.shared.login.passwordreset;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.shared.login.passwordreset.PasswordResetEmailSentFragment;
import com.robinhood.shared.login.passwordreset.PasswordResetFragment;
import com.robinhood.shared.security.contracts.PasswordResetFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasswordResetParentFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetFragment$Callbacks;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPasswordResetEmailSent", "email", "", "Companion", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PasswordResetParentFragment extends BaseFragment implements PasswordResetFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public PasswordResetParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PasswordResetFragment.INSTANCE.newInstance());
        }
    }

    @Override // com.robinhood.shared.login.passwordreset.PasswordResetFragment.Callbacks
    public void onPasswordResetEmailSent(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        replaceFragment(PasswordResetEmailSentFragment.INSTANCE.newInstance((Parcelable) new PasswordResetEmailSentFragment.Args(email)));
    }

    /* compiled from: PasswordResetParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetParentFragment;", "Lcom/robinhood/shared/security/contracts/PasswordResetFragmentKey;", "<init>", "()V", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PasswordResetParentFragment, PasswordResetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PasswordResetFragmentKey passwordResetFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, passwordResetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PasswordResetFragmentKey getArgs(PasswordResetParentFragment passwordResetParentFragment) {
            return (PasswordResetFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, passwordResetParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PasswordResetParentFragment newInstance(PasswordResetFragmentKey passwordResetFragmentKey) {
            return (PasswordResetParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, passwordResetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PasswordResetParentFragment passwordResetParentFragment, PasswordResetFragmentKey passwordResetFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, passwordResetParentFragment, passwordResetFragmentKey);
        }
    }
}
