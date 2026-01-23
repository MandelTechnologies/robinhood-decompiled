package com.robinhood.android.designsystem.progress;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.plt.contract.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: RdsProgressBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "getPltManager", "()Lcom/robinhood/android/plt/contract/PltManager;", "setPltManager", "(Lcom/robinhood/android/plt/contract/PltManager;)V", "visibilityFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "onAttachedToWindow", "", "onVisibilityAggregated", "isVisible", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RdsProgressBar extends Hammer_RdsProgressBar {
    public PltManager pltManager;
    private final SharedFlow2<Boolean> visibilityFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.visibilityFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
    }

    public final PltManager getPltManager() {
        PltManager pltManager = this.pltManager;
        if (pltManager != null) {
            return pltManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pltManager");
        return null;
    }

    public final void setPltManager(PltManager pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "<set-?>");
        this.pltManager = pltManager;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewsKt.trackLoadingStateForLoadingViews$default(this, getPltManager(), this.visibilityFlow, null, 4, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);
        this.visibilityFlow.tryEmit(Boolean.valueOf(isVisible));
    }
}
