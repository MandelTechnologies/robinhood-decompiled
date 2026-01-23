package com.robinhood.utils.extensions;

import kotlin.Metadata;

/* compiled from: Primitives.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"toInt", "", "", "toBoolean", "strict", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PrimitivesKt {
    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static /* synthetic */ boolean toBoolean$default(int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return toBoolean(i, z);
    }

    public static final boolean toBoolean(int i, boolean z) {
        if (!z) {
            return i != 0;
        }
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        throw new NumberFormatException("Invalid boolean: " + i);
    }
}
