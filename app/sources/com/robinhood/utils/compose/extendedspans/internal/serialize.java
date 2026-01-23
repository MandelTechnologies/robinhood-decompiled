package com.robinhood.utils.compose.extendedspans.internal;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: serialize.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¨\u0006\u0005"}, m3636d2 = {"serialize", "", "Landroidx/compose/ui/graphics/Color;", "serialize-Y2TPw74", "deserializeToColor", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.compose.extendedspans.internal.SerializeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class serialize {
    /* renamed from: serialize-Y2TPw74, reason: not valid java name */
    public static final String m26600serializeY2TPw74(Color color) {
        return (color == null || color.getValue() == 16) ? "null" : String.valueOf(Color2.m6735toArgb8_81llA(color.getValue()));
    }

    public static final Color deserializeToColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "null")) {
            return null;
        }
        return Color.m6701boximpl(Color2.Color(Integer.parseInt(str)));
    }
}
