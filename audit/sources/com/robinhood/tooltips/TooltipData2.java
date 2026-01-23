package com.robinhood.tooltips;

import android.view.View;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TooltipData.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toTarget", "Lcom/robinhood/tooltips/TooltipData$Target;", "Landroid/view/View;", "lib-design-system-tooltips_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.tooltips.TooltipDataKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TooltipData2 {
    public static final TooltipData.Target toTarget(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new TooltipData.Target(new TooltipData.Coordinates(iArr[0], iArr[1]), new TooltipData.Dimensions(view.getHeight(), view.getWidth()));
    }
}
