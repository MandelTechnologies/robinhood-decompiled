package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScaleFactor.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, m3636d2 = {"Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/layout/ScaleFactor;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.layout.ScaleFactorKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ScaleFactor2 {
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m7279timesUQTWf7w(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m7280timesmw2e94(long j, long j2) {
        return m7279timesUQTWf7w(j2, j);
    }
}
