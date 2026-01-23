package com.robinhood.android.util.extensions;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: Cursors.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toList", "", "T", "Landroid/database/Cursor;", "mapper", "Lkotlin/Function1;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.util.extensions.CursorsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Cursors {
    public static final <T> List<T> toList(Cursor cursor, Function1<? super Cursor, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (cursor != null) {
            try {
                ArrayList arrayList = new ArrayList(cursor.getCount());
                if (cursor.moveToFirst()) {
                    do {
                        arrayList.add(mapper.invoke(cursor));
                    } while (cursor.moveToNext());
                }
                cursor.close();
                Closeable.closeFinally(cursor, null);
                return arrayList;
            } finally {
            }
        } else {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
