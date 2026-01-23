package com.robinhood.android.common.p088ui;

import android.content.Context;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_BasePreferenceFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/Hammer_BasePreferenceFragment;", "Lcom/robinhood/android/common/ui/RxPreferenceFragment;", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManagerHolder;", "<init>", "()V", "injected", "", "inject", "", "onAttach", "context", "Landroid/content/Context;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes2.dex */
public abstract class Hammer_BasePreferenceFragment extends RxPreferenceFragment implements FragmentComponentManagerHolder {
    public static final int $stable = 8;
    private boolean injected;

    public /* synthetic */ Hammer_BasePreferenceFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Hammer_BasePreferenceFragment() {
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_BasePreferenceFragment2 hammer_BasePreferenceFragment2 = (Hammer_BasePreferenceFragment2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.common.ui.BasePreferenceFragment");
        hammer_BasePreferenceFragment2.inject((BasePreferenceFragment) this);
        this.injected = true;
    }

    @Override // com.robinhood.android.common.p088ui.RxPreferenceFragment, com.robinhood.android.common.p088ui.Hammer_RxPreferenceFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        inject();
    }
}
