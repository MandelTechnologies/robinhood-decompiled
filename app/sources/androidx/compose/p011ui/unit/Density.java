package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Density.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, m3636d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* renamed from: toDpSize-k-rfVVM */
    default long mo5014toDpSizekrfVVM(long j) {
        if (j != 9205357640488583168L) {
            return Dp2.m8006DpSizeYgX7TsA(mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return Dp5.INSTANCE.m8028getUnspecifiedMYxV2XQ();
    }

    /* renamed from: toPx-0680j_4 */
    default float mo5016toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo5010roundToPx0680j_4(float f) {
        float fMo5016toPx0680j_4 = mo5016toPx0680j_4(f);
        if (Float.isInfinite(fMo5016toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo5016toPx0680j_4);
    }

    /* renamed from: toPx--R2X_6o */
    default float mo5015toPxR2X_6o(long j) {
        if (!TextUnit3.m8088equalsimpl0(TextUnit.m8073getTypeUIouoOA(j), TextUnit3.INSTANCE.m8093getSpUIouoOA())) {
            InlineClassHelper6.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo5016toPx0680j_4(mo5011toDpGaN1DYA(j));
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo5009roundToPxR2X_6o(long j) {
        return Math.round(mo5015toPxR2X_6o(j));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo5013toDpu2uoSUM(int i) {
        return C2002Dp.m7995constructorimpl(i / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo5020toSpkPz2Gy4(int i) {
        return mo5018toSp0xMU5do(mo5013toDpu2uoSUM(i));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo5012toDpu2uoSUM(float f) {
        return C2002Dp.m7995constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo5019toSpkPz2Gy4(float f) {
        return mo5018toSp0xMU5do(mo5012toDpu2uoSUM(f));
    }

    default Rect toRect(Dp4 dp4) {
        throw null;
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo5017toSizeXkaWNTQ(long j) {
        if (j != 9205357640488583168L) {
            float fMo5016toPx0680j_4 = mo5016toPx0680j_4(Dp5.m8024getWidthD9Ej5fM(j));
            float fMo5016toPx0680j_42 = mo5016toPx0680j_4(Dp5.m8023getHeightD9Ej5fM(j));
            return Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32));
        }
        return Size.INSTANCE.m6588getUnspecifiedNHjbRc();
    }
}
