package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsetsUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "", "cb", "onInsetsChanged", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", "applyTopInset", "applyBottomInset", "applyLeftInset", "applyRightInset", "applyInsetsAsPadding", "(Landroid/view/View;ZZZZ)V", "requestApplyInsetsWhenAttached", "(Landroid/view/View;)V", "supportsCustomNavigationBar", "Z", "getSupportsCustomNavigationBar", "()Z", "supportsCustomStatusBar", "getSupportsCustomStatusBar", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class InsetsUtils {
    private static final boolean supportsCustomNavigationBar;
    private static final boolean supportsCustomStatusBar;

    public static final boolean getSupportsCustomNavigationBar() {
        return supportsCustomNavigationBar;
    }

    static {
        supportsCustomNavigationBar = Build.VERSION.SDK_INT >= 30;
        supportsCustomStatusBar = true;
    }

    public static final void onInsetsChanged(View view, final Function1<? super WindowInsetsCompat, Unit> cb) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(cb, "cb");
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return InsetsUtils.onInsetsChanged$lambda$0(cb, view2, windowInsetsCompat);
            }
        });
        if (view.isAttachedToWindow()) {
            return;
        }
        requestApplyInsetsWhenAttached(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onInsetsChanged$lambda$0(Function1 function1, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        function1.invoke(insets);
        return insets;
    }

    public static /* synthetic */ void applyInsetsAsPadding$default(View view, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        applyInsetsAsPadding(view, z, z2, z3, z4);
    }

    public static final void applyInsetsAsPadding(final View view, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        onInsetsChanged(view, new Function1() { // from class: com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InsetsUtils.applyInsetsAsPadding$lambda$1(view, z3, z, z4, z2, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyInsetsAsPadding$lambda$1(View view, boolean z, boolean z2, boolean z3, boolean z4, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.bottom;
        int paddingTop = insetsIgnoringVisibility.top;
        int iMax = Integer.max(insetsIgnoringVisibility.bottom, i);
        int paddingLeft = insetsIgnoringVisibility.left;
        int paddingRight = insetsIgnoringVisibility.right;
        if (!z) {
            paddingLeft = view.getPaddingLeft();
        }
        if (!z2) {
            paddingTop = view.getPaddingTop();
        }
        if (!z3) {
            paddingRight = view.getPaddingRight();
        }
        if (!z4) {
            iMax = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, iMax);
        return Unit.INSTANCE;
    }

    public static final void requestApplyInsetsWhenAttached(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt.requestApplyInsetsWhenAttached.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    v.removeOnAttachStateChangeListener(this);
                    v.requestApplyInsets();
                }
            });
        }
    }
}
