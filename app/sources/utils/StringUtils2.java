package utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StringUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"doubleOrZero", "", "", "getDoubleOrZero", "(Ljava/lang/String;)D", "intOrZero", "", "getIntOrZero", "(Ljava/lang/String;)I", "longOrZero", "", "getLongOrZero", "(Ljava/lang/String;)J", "utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: utils.StringUtilsKt, reason: use source file name */
/* loaded from: classes28.dex */
public final class StringUtils2 {
    public static final int getIntOrZero(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (int) getDoubleOrZero(str);
    }

    public static final long getLongOrZero(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (long) getDoubleOrZero(str);
    }

    public static final double getDoubleOrZero(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double doubleOrNull = StringsKt.toDoubleOrNull(str);
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return 0.0d;
    }
}
