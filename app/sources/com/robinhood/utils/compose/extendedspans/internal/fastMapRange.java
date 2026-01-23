package com.robinhood.utils.compose.extendedspans.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: fastMapRange.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, m3636d2 = {"fastMapRange", "", "R", "start", "", "end", "transform", "Lkotlin/Function1;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.extendedspans.internal.FastMapRangeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class fastMapRange {
    public static final <R> List<R> fastMapRange(int i, int i2, Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList((i2 - i) + 1);
        if (i <= i2) {
            while (true) {
                arrayList.add(transform.invoke(Integer.valueOf(i)));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
