package com.robinhood.android.mcw.currencyconverter.util;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: Formatters.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0004"}, m3636d2 = {"withGroupSeparators", "", "withoutGroupSeparators", "withoutTrailingZeros", "feature-mcw-currency-converter_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.currencyconverter.util.FormattersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Formatters {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String withGroupSeparators(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
        String str4 = String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf(Long.parseLong((String) listSplit$default.get(0)))}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        if (str3 != null) {
            str2 = "." + str3;
            if (str2 == null) {
                str2 = "";
            }
        }
        return str4 + str2;
    }

    public static final String withoutGroupSeparators(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(str, ",", "", false, 4, (Object) null);
    }

    public static final String withoutTrailingZeros(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        String str2 = (String) listSplit$default.get(0);
        String str3 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
        return (str3 == null || str3.length() == 0 || Intrinsics.areEqual(str3, "0") || Intrinsics.areEqual(str3, "00")) ? str2 : str;
    }
}
