package io.ktor.utils.p478io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringsJVM.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"", "", "dst", "", "dstOffset", "", "getCharsInternal", "(Ljava/lang/String;[CI)V", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.core.StringsJVMKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class StringsJVM {
    public static final void getCharsInternal(String str, char[] dst, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        str.getChars(0, str.length(), dst, i);
    }
}
