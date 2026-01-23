package com.robinhood.utils.extensions;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentValues.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"put", "", "Landroid/content/ContentValues;", "name", "", "input", "", "Ljava/util/Date;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ContentValuesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ContentValues {
    public static final void put(android.content.ContentValues contentValues, String name, Object obj) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        contentValues.put(name, Any2.toOutput(obj));
    }

    public static final void put(android.content.ContentValues contentValues, String name, Date date) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        contentValues.put(name, Long.valueOf(Date3.toOutput(date)));
    }
}
