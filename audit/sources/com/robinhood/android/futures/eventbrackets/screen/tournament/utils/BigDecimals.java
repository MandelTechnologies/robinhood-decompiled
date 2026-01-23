package com.robinhood.android.futures.eventbrackets.screen.tournament.utils;

import com.robinhood.android.lib.formats.Formats;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"formatIntegerWithoutGroupingFormat", "", "Ljava/math/BigDecimal;", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.utils.BigDecimalsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BigDecimals {
    public static final String formatIntegerWithoutGroupingFormat(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return Formats.getIntegerWithoutGroupingFormat$default(null, 1, null).format(bigDecimal);
        }
        return null;
    }
}
