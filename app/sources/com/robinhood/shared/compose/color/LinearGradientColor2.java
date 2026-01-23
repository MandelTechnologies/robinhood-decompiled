package com.robinhood.shared.compose.color;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LinearGradientColor.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getLinearGradientShaderOffsets", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "angle", "", "lib-compose-color_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.compose.color.LinearGradientColorKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class LinearGradientColor2 {
    public static final Tuples2<Offset, Offset> getLinearGradientShaderOffsets(Rect rect, float f) {
        double d;
        Intrinsics.checkNotNullParameter(rect, "<this>");
        double d2 = ((90.0f - f) / 180.0f) * 3.141592653589793d;
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d2);
        char c = (dSin < 0.0d || dCos < 0.0d) ? (dSin < 0.0d || dCos >= 0.0d) ? (dSin >= 0.0d || dCos >= 0.0d) ? (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c == 1 || c == 3) {
            double d3 = d2 % 3.141592653589793d;
            d = (d3 == 0.0d || Math.signum(d3) == Math.signum(3.141592653589793d)) ? d3 : 3.141592653589793d + d3;
        } else {
            double d4 = d2 % 3.141592653589793d;
            if (d4 != 0.0d && Math.signum(d4) != Math.signum(3.141592653589793d)) {
                d4 += 3.141592653589793d;
            }
            d = 3.141592653589793d - d4;
        }
        double d5 = 2;
        double dSqrt = (((float) Math.sqrt(((float) Math.pow(rect.getRight() - rect.getLeft(), d5)) + ((float) Math.pow(rect.getBottom() - rect.getTop(), d5)))) / 2.0f) * Math.cos(((float) Math.atan2(rect.getBottom() - rect.getTop(), rect.getRight() - rect.getLeft())) - d);
        float fCos = (float) (Math.cos(d) * dSqrt);
        float fSin = (float) (dSqrt * Math.sin(d));
        long jM6535constructorimpl = c != 1 ? c != 2 ? c != 3 ? Offset.m6535constructorimpl((Float.floatToRawIntBits(fCos) << 32) | (Float.floatToRawIntBits(fSin) & 4294967295L)) : Offset.m6535constructorimpl((Float.floatToRawIntBits(-fCos) << 32) | (Float.floatToRawIntBits(fSin) & 4294967295L)) : Offset.m6535constructorimpl((Float.floatToRawIntBits(-fCos) << 32) | (Float.floatToRawIntBits(-fSin) & 4294967295L)) : Offset.m6535constructorimpl((Float.floatToRawIntBits(fCos) << 32) | (Float.floatToRawIntBits(-fSin) & 4294967295L));
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jM6535constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L))) & 4294967295L));
        float f2 = 2;
        long jM6535constructorimpl3 = Offset.m6535constructorimpl((Float.floatToRawIntBits(((rect.getRight() - rect.getLeft()) / f2) + rect.getLeft()) << 32) | (Float.floatToRawIntBits(((rect.getBottom() - rect.getTop()) / f2) + rect.getTop()) & 4294967295L));
        return Tuples4.m3642to(Offset.m6534boximpl(Offset.m6547plusMKHz9U(jM6535constructorimpl2, jM6535constructorimpl3)), Offset.m6534boximpl(Offset.m6547plusMKHz9U(jM6535constructorimpl, jM6535constructorimpl3)));
    }
}
