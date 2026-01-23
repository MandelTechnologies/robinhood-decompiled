package com.robinhood.idl.serialization;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: FloatingPointStrings.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"toStandardString", "", "", "", "core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.serialization.FloatingPointStringsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class FloatingPointStrings {
    public static final String toStandardString(float f) {
        String strValueOf = String.valueOf(f);
        if (StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null)) {
            return strValueOf;
        }
        return strValueOf + ".0";
    }

    public static final String toStandardString(double d) {
        String strValueOf = String.valueOf(d);
        if (StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null)) {
            return strValueOf;
        }
        return strValueOf + ".0";
    }
}
