package com.robinhood.android.lib.pathfinder.pages;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.support.contracts.ReviewCallDetailsFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutboundVoicePageFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/pages/OutboundVoicePageFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OutboundVoicePageFragment extends BaseFragment {
    public AuthManager authManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OutboundVoicePageFragment() {
        super(0);
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new ReviewCallDetailsFragmentKey(((LegacyFragmentKey.OutboundVoicePage) companion.getArgs((Fragment) this)).getInquiryId(), null, ((UserViewStatePageContext.OutboundVoicePage) ((LegacyFragmentKey.OutboundVoicePage) companion.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getPhoneNumber(), true), false, false, false, getAuthManager().isLoggedIn(), null, false, null, null, 988, null);
            requireActivity().onBackPressed();
        }
    }

    /* compiled from: OutboundVoicePageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/pages/OutboundVoicePageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/lib/pathfinder/pages/OutboundVoicePageFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OutboundVoicePage;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OutboundVoicePageFragment, LegacyFragmentKey.OutboundVoicePage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.OutboundVoicePage outboundVoicePage) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, outboundVoicePage);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.OutboundVoicePage getArgs(OutboundVoicePageFragment outboundVoicePageFragment) {
            return (LegacyFragmentKey.OutboundVoicePage) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, outboundVoicePageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OutboundVoicePageFragment newInstance(LegacyFragmentKey.OutboundVoicePage outboundVoicePage) {
            return (OutboundVoicePageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, outboundVoicePage);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OutboundVoicePageFragment outboundVoicePageFragment, LegacyFragmentKey.OutboundVoicePage outboundVoicePage) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, outboundVoicePageFragment, outboundVoicePage);
        }
    }
}
