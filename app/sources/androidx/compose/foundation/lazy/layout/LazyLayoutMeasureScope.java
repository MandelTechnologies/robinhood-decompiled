package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.p011ui.unit.TextUnit3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyLayoutMeasureScope.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001b\u001a\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m3636d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo5262measure0kLqBqw(int index, long constraints);

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    default long mo5014toDpSizekrfVVM(long j) {
        if (j != 9205357640488583168L) {
            return Dp2.m8006DpSizeYgX7TsA(mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return Dp5.INSTANCE.m8028getUnspecifiedMYxV2XQ();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    default float mo5011toDpGaN1DYA(long j) {
        if (!TextUnit3.m8088equalsimpl0(TextUnit.m8073getTypeUIouoOA(j), TextUnit3.INSTANCE.m8093getSpUIouoOA())) {
            InlineClassHelper.throwIllegalStateException("Only Sp can convert to Px");
        }
        return C2002Dp.m7995constructorimpl(TextUnit.m8074getValueimpl(j) * getFontScale());
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    default float mo5013toDpu2uoSUM(int i) {
        return C2002Dp.m7995constructorimpl(i / getDensity());
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    default float mo5012toDpu2uoSUM(float f) {
        return C2002Dp.m7995constructorimpl(f / getDensity());
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    default long mo5019toSpkPz2Gy4(float f) {
        return TextUnit2.getSp(f / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    default long mo5020toSpkPz2Gy4(int i) {
        return TextUnit2.getSp(i / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    default long mo5018toSp0xMU5do(float f) {
        return TextUnit2.getSp(f / getFontScale());
    }

    @Override // androidx.compose.p011ui.unit.Density
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
