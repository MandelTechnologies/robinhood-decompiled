package com.robinhood.utils.text;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreakIterators.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"count", "", "Ljava/text/BreakIterator;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.text.BreakIteratorsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BreakIterators {
    public static final int count(BreakIterator breakIterator) {
        Intrinsics.checkNotNullParameter(breakIterator, "<this>");
        breakIterator.first();
        int i = 0;
        while (breakIterator.next() != -1) {
            i++;
        }
        return i;
    }
}
