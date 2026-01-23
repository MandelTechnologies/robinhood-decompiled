package com.withpersona.sdk2.inquiry.permissions;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetDialogView.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"com/withpersona/sdk2/inquiry/permissions/BottomSheetDialogView$initialize$1$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$initialize$1$2, reason: use source file name */
/* loaded from: classes18.dex */
public final class BottomSheetDialogView2 implements View.OnAttachStateChangeListener {
    final /* synthetic */ BottomSheetBehavior<FrameLayout> $behavior;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    BottomSheetDialogView2(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
        this.$behavior = bottomSheetBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.$behavior;
        view.postDelayed(new Runnable() { // from class: com.withpersona.sdk2.inquiry.permissions.BottomSheetDialogView$initialize$1$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                bottomSheetBehavior.setState(3);
            }
        }, 100L);
    }
}
