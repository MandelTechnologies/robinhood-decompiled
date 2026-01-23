package androidx.compose.p011ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HitTestResult.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "compareTo-9YPOF3E", "(JJ)I", "compareTo", "", "getDistance-impl", "(J)F", "distance", "", "isInLayer-impl", "(J)Z", "isInLayer", "isInExpandedBounds-impl", "isInExpandedBounds", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.DistanceAndFlags, reason: use source file name */
/* loaded from: classes4.dex */
public final class HitTestResult2 {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7289constructorimpl(long j) {
        return j;
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m7291isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m7292isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m7290getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m7288compareTo9YPOF3E(long j, long j2) {
        boolean zM7292isInLayerimpl = m7292isInLayerimpl(j);
        if (zM7292isInLayerimpl != m7292isInLayerimpl(j2)) {
            return zM7292isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m7290getDistanceimpl(j), m7290getDistanceimpl(j2)) >= 0.0f && m7291isInExpandedBoundsimpl(j) != m7291isInExpandedBoundsimpl(j2)) ? m7291isInExpandedBoundsimpl(j) ? -1 : 1 : (int) Math.signum(m7290getDistanceimpl(j) - m7290getDistanceimpl(j2));
    }
}
