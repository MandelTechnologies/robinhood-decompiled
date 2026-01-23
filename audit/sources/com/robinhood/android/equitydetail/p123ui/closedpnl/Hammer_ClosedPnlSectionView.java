package com.robinhood.android.equitydetail.p123ui.closedpnl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_ClosedPnlSectionView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/closedpnl/Hammer_ClosedPnlSectionView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;Landroid/util/AttributeSet;)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes3.dex */
public abstract class Hammer_ClosedPnlSectionView extends LoggableSdpComposeView implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_ClosedPnlSectionView(ViewModelStoreOwner viewModelStoreOwner, Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStoreOwner, context, attributeSet);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ViewComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_ClosedPnlSectionView(ViewModelStoreOwner viewModelStoreOwner, Context context, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_ClosedPnlSectionView2 hammer_ClosedPnlSectionView2 = (Hammer_ClosedPnlSectionView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.closedpnl.ClosedPnlSectionView");
        hammer_ClosedPnlSectionView2.inject((ClosedPnlSectionView) this);
        this.injected = true;
    }
}
