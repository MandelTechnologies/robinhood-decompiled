package com.robinhood.android.p273ui;

import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InboxTabFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/ui/InboxTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showRootFragment", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InboxTabFragment extends BaseTabFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseTabFragment.$stable;

    public InboxTabFragment() {
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
        handleDeeplink();
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        setRootFragment(getNavigator().createFragment(LegacyFragmentKey.InboxThreadList.INSTANCE, PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED));
    }

    /* compiled from: InboxTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ui/InboxTabFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/ui/InboxTabFragment;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InboxTabFragment newInstance() {
            return new InboxTabFragment();
        }
    }
}
