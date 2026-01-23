package com.robinhood.utils.p409ui.edge2edge;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApplyWindowInsets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m3636d2 = {"applyWindowInsetsAsPadding", "", "Landroid/view/View;", "sides", "Lcom/robinhood/utils/ui/edge2edge/InsetSides;", "applyWindowInsetsAsPadding-qNU9l24", "(Landroid/view/View;I)V", "applyWindowInsetsAsMargin", "applyWindowInsetsAsMargin-qNU9l24", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.edge2edge.ApplyWindowInsetsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ApplyWindowInsets {
    /* renamed from: applyWindowInsetsAsPadding-qNU9l24, reason: not valid java name */
    public static final void m26664applyWindowInsetsAsPaddingqNU9l24(View applyWindowInsetsAsPadding, final int i) {
        Intrinsics.checkNotNullParameter(applyWindowInsetsAsPadding, "$this$applyWindowInsetsAsPadding");
        WindowInsetsListener2.doOnApplyWindowInsets(applyWindowInsetsAsPadding, new WindowInsetsListener() { // from class: com.robinhood.utils.ui.edge2edge.ApplyWindowInsetsKt$applyWindowInsetsAsPadding$1
            @Override // com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets, RelativePadding initialPadding) {
                int i2;
                int i3;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                boolean z = view.getLayoutDirection() == 1;
                if (InsetSides.m26672getStartimpl(i)) {
                    i2 = z ? insets2.right : insets2.left;
                } else {
                    i2 = 0;
                }
                int i4 = InsetSides.m26673getTopimpl(i) ? insets2.top : 0;
                if (InsetSides.m26671getEndimpl(i)) {
                    i3 = z ? insets2.left : insets2.right;
                } else {
                    i3 = 0;
                }
                RelativePadding.INSTANCE.setPaddingRelative(view, initialPadding.plus(i2, i4, i3, InsetSides.m26670getBottomimpl(i) ? insets2.bottom : 0));
                return insets;
            }
        });
    }

    /* renamed from: applyWindowInsetsAsMargin-qNU9l24, reason: not valid java name */
    public static final void m26663applyWindowInsetsAsMarginqNU9l24(View applyWindowInsetsAsMargin, final int i) {
        Intrinsics.checkNotNullParameter(applyWindowInsetsAsMargin, "$this$applyWindowInsetsAsMargin");
        WindowInsetsListener2.doOnApplyWindowInsets(applyWindowInsetsAsMargin, new WindowInsetsListener() { // from class: com.robinhood.utils.ui.edge2edge.ApplyWindowInsetsKt$applyWindowInsetsAsMargin$1
            @Override // com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets, RelativePadding relativePadding) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullParameter(relativePadding, "<unused var>");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                boolean z = view.getLayoutDirection() == 1;
                int i2 = i;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (InsetSides.m26672getStartimpl(i2)) {
                        marginLayoutParams.setMarginStart(z ? insets2.right : insets2.left);
                    }
                    if (InsetSides.m26673getTopimpl(i2)) {
                        marginLayoutParams.topMargin = insets2.top;
                    }
                    if (InsetSides.m26671getEndimpl(i2)) {
                        marginLayoutParams.setMarginEnd(z ? insets2.left : insets2.right);
                    }
                    if (InsetSides.m26670getBottomimpl(i2)) {
                        marginLayoutParams.bottomMargin = insets2.bottom;
                    }
                    view.setLayoutParams(marginLayoutParams);
                    return insets;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        });
    }
}
