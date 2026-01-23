package androidx.compose.p011ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScaleFactor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "", "packedValue", "constructor-impl", "(J)J", "", "getScaleX-impl", "(J)F", "getScaleX$annotations", "()V", "scaleX", "getScaleY-impl", "getScaleY$annotations", "scaleY", "Companion", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScaleFactor {
    private static final long Unspecified = m7276constructorimpl((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7276constructorimpl(long j) {
        return j;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m7277getScaleXimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m7278getScaleYimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
