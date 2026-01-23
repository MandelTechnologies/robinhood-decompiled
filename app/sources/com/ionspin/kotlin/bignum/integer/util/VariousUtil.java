package com.ionspin.kotlin.bignum.integer.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VariousUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0006¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"", "", "count", "", "times", "(CJ)Ljava/lang/String;", "bignum"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.ionspin.kotlin.bignum.integer.util.VariousUtilKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class VariousUtil {
    public static final String times(char c, long j) {
        StringBuilder sb = new StringBuilder();
        for (long j2 = 0; j2 < j; j2++) {
            sb.append(c);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
