package com.robinhood.android.equityscreener.table.data;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ColumnClasses.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"mergeColumns", "", "T", "other", "", "", "feature-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.table.data.ColumnClassesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ColumnClasses {
    public static final <T> List<T> mergeColumns(List<? extends T> list, Map<Integer, ? extends T> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list);
        for (Map.Entry<Integer, ? extends T> entry : other.entrySet()) {
            Integer key = entry.getKey();
            T value = entry.getValue();
            if (value != null) {
                mutableList.add(key != null ? RangesKt.coerceAtMost(key.intValue(), mutableList.size()) : mutableList.size(), value);
            }
        }
        return mutableList;
    }
}
