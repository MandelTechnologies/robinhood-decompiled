package com.robinhood.utils.p409ui.color;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"hue", "", "", "getHue", "(I)F", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.color.ColorsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Colors9 {
    public static final float getHue(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return ArraysKt.first(fArr);
    }
}
