package com.robinhood.utils.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConstraintLayouts.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"setDimensionRatioHeightConstrained", "", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "widthRatio", "", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ConstraintLayoutsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ConstraintLayouts {
    public static final void setDimensionRatioHeightConstrained(ConstraintLayout.LayoutParams layoutParams, float f) {
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        layoutParams.dimensionRatio = "H," + f + ":1";
    }
}
