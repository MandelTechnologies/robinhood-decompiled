package com.robinhood.android.common.util.extensions;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.utils.extensions.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseBottomSheetDialogFragments.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001e\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"enforceMaxHeight", "", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "contentContainer", "Landroid/view/View;", "maxHeightMultiplier", "", "enforceScreenMaxHeight", "enforceConstraintMaxHeight", "BOTTOM_SHEET_HEIGHT_MULTIPLIER", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragmentsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BaseBottomSheetDialogFragments {
    private static final float BOTTOM_SHEET_HEIGHT_MULTIPLIER = 0.85f;

    public static /* synthetic */ void enforceMaxHeight$default(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, View view, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        enforceMaxHeight(baseBottomSheetDialogFragment, view, f);
    }

    public static final void enforceMaxHeight(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, View contentContainer, float f) {
        Intrinsics.checkNotNullParameter(baseBottomSheetDialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(contentContainer, "contentContainer");
        if (contentContainer.getParent() instanceof ConstraintLayout) {
            enforceConstraintMaxHeight(baseBottomSheetDialogFragment, contentContainer, f);
        } else {
            enforceScreenMaxHeight(baseBottomSheetDialogFragment, contentContainer, f);
        }
    }

    static /* synthetic */ void enforceScreenMaxHeight$default(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, View view, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        enforceScreenMaxHeight(baseBottomSheetDialogFragment, view, f);
    }

    private static final void enforceScreenMaxHeight(final BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, final View view, float f) {
        Intrinsics.checkNotNullExpressionValue(baseBottomSheetDialogFragment.requireActivity(), "requireActivity(...)");
        final int i = (int) (Activity.getDisplayMetrics(r0).heightPixels * f);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragmentsKt.enforceScreenMaxHeight.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Dialog dialog;
                Window window;
                if (view.getMeasuredHeight() <= i || (dialog = baseBottomSheetDialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
                    return;
                }
                int i2 = i;
                window.setGravity(80);
                window.setLayout(-1, i2);
            }
        });
    }

    static /* synthetic */ void enforceConstraintMaxHeight$default(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, View view, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.85f;
        }
        enforceConstraintMaxHeight(baseBottomSheetDialogFragment, view, f);
    }

    private static final void enforceConstraintMaxHeight(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, View view, float f) {
        Intrinsics.checkNotNullExpressionValue(baseBottomSheetDialogFragment.requireActivity(), "requireActivity(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintMaxHeight = (int) (Activity.getDisplayMetrics(r1).heightPixels * f);
    }
}
