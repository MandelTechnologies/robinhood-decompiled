package com.robinhood.utils.extensions;

import kotlin.Metadata;

/* compiled from: Ints.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"roundToClosestIncrement", "", "increment", "minValue", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.IntsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Ints2 {
    public static /* synthetic */ int roundToClosestIncrement$default(int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return roundToClosestIncrement(i, i2, i3);
    }

    public static final int roundToClosestIncrement(int i, int i2, int i3) {
        double d = i;
        double d2 = i2;
        return Math.max(i3, (int) (Math.rint(d / d2) * d2));
    }
}
