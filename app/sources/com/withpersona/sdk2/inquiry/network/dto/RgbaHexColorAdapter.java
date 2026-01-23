package com.withpersona.sdk2.inquiry.network.dto;

import android.graphics.Color;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RgbaHexColorAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/RgbaHexColorAdapter;", "", "<init>", "()V", "toJson", "", "rgba", "", "(Ljava/lang/Integer;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljava/lang/Integer;", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RgbaHexColorAdapter {
    public static final RgbaHexColorAdapter INSTANCE = new RgbaHexColorAdapter();

    private RgbaHexColorAdapter() {
    }

    @ToJson
    public final String toJson(@RgbaHexColorAdapter2 Integer rgba) {
        throw new IllegalStateException("Should not be called");
    }

    @RgbaHexColorAdapter2
    @FromJson
    public final Integer fromJson(String rgba) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(rgba, "rgba");
        String upperCase = StringsKt.trim(rgba).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String strRemovePrefix = StringsKt.removePrefix(upperCase, "#");
        int length = strRemovePrefix.length();
        if (length != 6) {
            if (length != 8 || (longOrNull = StringsKt.toLongOrNull(strRemovePrefix, 16)) == null) {
                return null;
            }
            long jLongValue = longOrNull.longValue();
            return Integer.valueOf(Color.argb((int) (jLongValue & 255), (int) ((jLongValue >> 24) & 255), (int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255)));
        }
        Integer intOrNull = StringsKt.toIntOrNull(strRemovePrefix, 16);
        if (intOrNull == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        return Integer.valueOf(Color.rgb((iIntValue >> 16) & 255, (iIntValue >> 8) & 255, iIntValue & 255));
    }
}
