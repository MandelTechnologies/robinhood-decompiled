package com.robinhood.android.equities.tradesettings.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, m3636d2 = {"blankToNull", "", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StringsKt {
    public static final String blankToNull(String str) {
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }
}
