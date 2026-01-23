package com.twilio.util;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: commonUtilsAndroid.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m3636d2 = {"generateUUID", "", "getCurrentThreadId", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.CommonUtilsAndroidKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class commonUtilsAndroid {
    public static final String generateUUID() {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final String getCurrentThreadId() {
        return String.valueOf(Thread.currentThread().getId());
    }
}
