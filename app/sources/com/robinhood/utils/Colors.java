package com.robinhood.utils;

import androidx.core.graphics.ColorUtils;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.HexExtensions;
import kotlin.text.HexFormat;
import kotlin.text.StringsKt;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/Colors;", "", "<init>", "()V", "adjustColorForStatusBar", "", ResourceTypes.COLOR, "toArgbString", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Colors {
    public static final int $stable = 0;
    public static final Colors INSTANCE = new Colors();

    private Colors() {
    }

    @JvmStatic
    public static final int adjustColorForStatusBar(int color) {
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(color, fArr);
        fArr[2] = fArr[2] * 0.925f;
        return ColorUtils.HSLToColor(fArr);
    }

    public final String toArgbString(int color) {
        String hexString$default = HexExtensions.toHexString$default(color, (HexFormat) null, 1, (Object) null);
        int length = 8 - hexString$default.length();
        if (length > 0) {
            hexString$default = StringsKt.padStart(hexString$default, length, '0');
        }
        return "#" + hexString$default;
    }
}
