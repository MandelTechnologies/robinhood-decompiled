package com.robinhood.android.iav.p154ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.iav.C18470R;
import com.robinhood.android.libs.iav.DebugFundYourAccountKey;
import com.robinhood.android.navigation.FragmentResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugFundYourAccountFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/DebugFundYourAccountFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DebugFundYourAccountFragment extends BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public DebugFundYourAccountFragment() {
        super(C18470R.layout.fragment_debug_fund_your_account);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((ComposeView) view.findViewById(C18470R.id.content)).setContent(DebugFundYourAccountFragment2.INSTANCE.getLambda$2063860255$feature_iav_externalDebug());
    }

    /* compiled from: DebugFundYourAccountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/DebugFundYourAccountFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/libs/iav/DebugFundYourAccountKey;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/iav/ui/DebugFundYourAccountFragment;", "key", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<DebugFundYourAccountKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public DebugFundYourAccountFragment createFragment(DebugFundYourAccountKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new DebugFundYourAccountFragment();
        }
    }
}
