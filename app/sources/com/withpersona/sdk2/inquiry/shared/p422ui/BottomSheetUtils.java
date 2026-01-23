package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BottomSheetUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, m3636d2 = {"setup", "", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "onCancel", "Lkotlin/Function0;", "bottomSheet", "Landroid/view/View;", "contentContainer", "tintView", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class BottomSheetUtils {
    public static final void setup(BottomSheetBehavior<?> bottomSheetBehavior, final Function0<Unit> onCancel, final View bottomSheet, View view, final View view2) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() { // from class: com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt.setup.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View bottomSheet2, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                if (newState == 4 || newState == 5) {
                    onCancel.invoke();
                    View view3 = view2;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View bottomSheet2, float slideOffset) {
                View view3;
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                if (slideOffset > 0.0f && (view3 = view2) != null) {
                    view3.setVisibility(0);
                }
                View view4 = view2;
                if (view4 != null) {
                    view4.setAlpha(RangesKt.coerceAtLeast(slideOffset, 0.0f));
                }
            }
        });
        bottomSheetBehavior.setSkipCollapsed(true);
        if (view != null) {
            bottomSheet = view;
        }
        InsetsUtils.onInsetsChanged(bottomSheet, new Function1() { // from class: com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomSheetUtils.setup$lambda$1(bottomSheet, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$1(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), Integer.max(insetsIgnoringVisibility.bottom, insets2.bottom));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = insetsIgnoringVisibility.top;
            view.setLayoutParams(marginLayoutParams);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
