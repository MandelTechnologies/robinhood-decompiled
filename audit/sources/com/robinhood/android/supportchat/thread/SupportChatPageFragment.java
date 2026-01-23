package com.robinhood.android.supportchat.thread;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.support.contracts.SupportChatPageFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatPageFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/SupportChatPageFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportChatPageFragment extends BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public SupportChatPageFragment() {
        super(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, ((SupportChatPageFragmentKey) INSTANCE.getArgs((Fragment) this)).getKey(), false, false, true, true, null, false, null, null, 844, null);
            requireActivity().onBackPressed();
        }
    }

    /* compiled from: SupportChatPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/SupportChatPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/supportchat/thread/SupportChatPageFragment;", "Lcom/robinhood/shared/support/contracts/SupportChatPageFragmentKey;", "<init>", "()V", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SupportChatPageFragment, SupportChatPageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SupportChatPageFragmentKey supportChatPageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, supportChatPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SupportChatPageFragmentKey getArgs(SupportChatPageFragment supportChatPageFragment) {
            return (SupportChatPageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, supportChatPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SupportChatPageFragment newInstance(SupportChatPageFragmentKey supportChatPageFragmentKey) {
            return (SupportChatPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, supportChatPageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SupportChatPageFragment supportChatPageFragment, SupportChatPageFragmentKey supportChatPageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, supportChatPageFragment, supportChatPageFragmentKey);
        }
    }
}
