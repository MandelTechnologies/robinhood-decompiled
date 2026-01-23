package com.robinhood.android.designsystem.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsButtonContainerView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsButtonContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "button", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "setButton", "(Lcom/robinhood/android/designsystem/button/RdsButton;)V", "onViewAdded", "", "child", "Landroid/view/View;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsButtonContainerView extends FrameLayout {
    public RdsButton button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsButtonContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final RdsButton getButton() {
        RdsButton rdsButton = this.button;
        if (rdsButton != null) {
            return rdsButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("button");
        return null;
    }

    public final void setButton(RdsButton rdsButton) {
        Intrinsics.checkNotNullParameter(rdsButton, "<set-?>");
        this.button = rdsButton;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        super.onViewAdded(child);
        Intrinsics.checkNotNull(child, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsButton");
        setButton((RdsButton) child);
    }
}
