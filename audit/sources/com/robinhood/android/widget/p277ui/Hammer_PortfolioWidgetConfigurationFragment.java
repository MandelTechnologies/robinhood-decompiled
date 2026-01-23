package com.robinhood.android.widget.p277ui;

import android.content.Context;
import com.robinhood.android.common.p088ui.BasePreferenceFragment;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_PortfolioWidgetConfigurationFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/Hammer_PortfolioWidgetConfigurationFragment;", "Lcom/robinhood/android/common/ui/BasePreferenceFragment;", "Lcom/robinhood/hammer/android/fragment/FragmentComponentManagerHolder;", "<init>", "()V", "injected", "", "inject", "", "onAttach", "context", "Landroid/content/Context;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes9.dex */
public abstract class Hammer_PortfolioWidgetConfigurationFragment extends BasePreferenceFragment implements FragmentComponentManagerHolder {
    private boolean injected;

    public /* synthetic */ Hammer_PortfolioWidgetConfigurationFragment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Hammer_PortfolioWidgetConfigurationFragment() {
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_PortfolioWidgetConfigurationFragment2 hammer_PortfolioWidgetConfigurationFragment2 = (Hammer_PortfolioWidgetConfigurationFragment2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.widget.ui.PortfolioWidgetConfigurationFragment");
        hammer_PortfolioWidgetConfigurationFragment2.inject((PortfolioWidgetConfigurationFragment) this);
        this.injected = true;
    }

    @Override // com.robinhood.android.common.p088ui.Hammer_BasePreferenceFragment, com.robinhood.android.common.p088ui.RxPreferenceFragment, com.robinhood.android.common.p088ui.Hammer_RxPreferenceFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        inject();
    }
}
