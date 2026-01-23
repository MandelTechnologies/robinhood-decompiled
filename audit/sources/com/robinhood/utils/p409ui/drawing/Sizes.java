package com.robinhood.utils.p409ui.drawing;

import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sizes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n¨\u0006\u0004"}, m3636d2 = {"component1", "", "Landroid/util/Size;", "component2", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.drawing.SizesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Sizes {
    public static final int component1(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getWidth();
    }

    public static final int component2(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getHeight();
    }
}
