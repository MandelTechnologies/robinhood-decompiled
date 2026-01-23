package com.robinhood.utils.compose.extensions;

import androidx.compose.p011ui.graphics.Color2;
import androidx.core.graphics.ColorUtils;
import kotlin.Metadata;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"blendWith", "Landroidx/compose/ui/graphics/Color;", "other", "ratio", "", "blendWith-jxsXWHM", "(JJF)J", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.compose.extensions.ColorsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Colors8 {
    /* renamed from: blendWith-jxsXWHM, reason: not valid java name */
    public static final long m26601blendWithjxsXWHM(long j, long j2, float f) {
        return Color2.Color(ColorUtils.blendARGB(Color2.m6735toArgb8_81llA(j), Color2.m6735toArgb8_81llA(j2), f));
    }
}
