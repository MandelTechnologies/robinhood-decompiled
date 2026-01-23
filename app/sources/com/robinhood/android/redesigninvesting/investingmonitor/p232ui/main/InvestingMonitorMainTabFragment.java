package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorMainTabFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorMainTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showRootFragment", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorMainTabFragment extends BaseTabFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseTabFragment.$stable;

    public InvestingMonitorMainTabFragment() {
        super(C11048R.layout.parent_fragment_container);
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

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        setRootFragment((InvestingMonitorFragment) InvestingMonitorFragment.INSTANCE.newInstance(INSTANCE.getArgs((Fragment) this)));
        notifyFragmentChanged();
        handleDeeplink();
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: InvestingMonitorMainTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorMainTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorMainTabFragment;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/InvestingMonitorFragmentKey;", "<init>", "()V", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<InvestingMonitorMainTabFragment, InvestingMonitorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InvestingMonitorFragmentKey investingMonitorFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, investingMonitorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestingMonitorFragmentKey getArgs(InvestingMonitorMainTabFragment investingMonitorMainTabFragment) {
            return (InvestingMonitorFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, investingMonitorMainTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestingMonitorMainTabFragment newInstance(InvestingMonitorFragmentKey investingMonitorFragmentKey) {
            return (InvestingMonitorMainTabFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, investingMonitorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestingMonitorMainTabFragment investingMonitorMainTabFragment, InvestingMonitorFragmentKey investingMonitorFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, investingMonitorMainTabFragment, investingMonitorFragmentKey);
        }
    }
}
