package com.robinhood.utils.compose.reorderable;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Reorder.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"reorder", "", "T", "startIndex", "", "targetIndex", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.reorderable.ReorderKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Reorder {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> reorder(List<? extends T> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i == i2) {
            return list;
        }
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(i2, mutableList.remove(i));
        return mutableList;
    }
}
