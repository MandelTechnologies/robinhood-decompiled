package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelper2;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: RowColumnMeasurePolicy.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.RowColumnMeasurePolicyKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class RowColumnMeasurePolicy2 {
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        char c;
        char c2;
        int i10;
        int iMax;
        int iMax2;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i11;
        long j;
        int i12;
        int i13 = i4;
        long j2 = i5;
        int i14 = i7 - i6;
        int[] iArr2 = new int[i14];
        int i15 = 0;
        int i16 = i6;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f = 0.0f;
        while (true) {
            int i22 = 1;
            if (i16 >= i7) {
                break;
            }
            Measurable measurable = list.get(i16);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (i19 == 0 && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                i22 = i15;
            }
            if (weight > 0.0f) {
                f += weight;
                i20++;
                i11 = i16;
                j = j2;
            } else {
                if (i13 != Integer.MAX_VALUE && rowColumnParentData != null) {
                    rowColumnParentData.getFlowLayoutData();
                }
                int i23 = i3 - i21;
                Placeable placeableMo7239measureBRTryo0 = placeableArr[i16];
                if (placeableMo7239measureBRTryo0 == null) {
                    int i24 = i3 != Integer.MAX_VALUE ? i23 < 0 ? i15 : i23 : Integer.MAX_VALUE;
                    i11 = i16;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    j = j2;
                    i12 = i18;
                    placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(RowColumnMeasurePolicy.m5153createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy2, 0, 0, i24, i13, false, 16, null));
                } else {
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i11 = i16;
                    j = j2;
                    i12 = i18;
                }
                int iMainAxisSize = rowColumnMeasurePolicy2.mainAxisSize(placeableMo7239measureBRTryo0);
                int iCrossAxisSize = rowColumnMeasurePolicy2.crossAxisSize(placeableMo7239measureBRTryo0);
                iArr2[i11 - i6] = iMainAxisSize;
                int i25 = i23 - iMainAxisSize;
                if (i25 < 0) {
                    i25 = 0;
                }
                int iMin = Math.min(i5, i25);
                i21 += iMainAxisSize + iMin;
                int iMax3 = Math.max(i12, iCrossAxisSize);
                placeableArr[i11] = placeableMo7239measureBRTryo0;
                i18 = iMax3;
                i17 = iMin;
            }
            i16 = i11 + 1;
            i19 = i22;
            j2 = j;
            i15 = 0;
        }
        RowColumnMeasurePolicy rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
        long j3 = j2;
        int i26 = i18;
        if (i20 == 0) {
            i21 -= i17;
            i9 = 0;
        } else {
            long j4 = j3 * (i20 - 1);
            long jRound = ((i3 != Integer.MAX_VALUE ? i3 : i) - i21) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f2 = jRound / f;
            for (int i27 = i6; i27 < i7; i27++) {
                jRound -= Math.round(RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list.get(i27))) * f2);
            }
            int i28 = i6;
            int i29 = 0;
            while (i28 < i7) {
                if (placeableArr[i28] == null) {
                    Measurable measurable2 = list.get(i28);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (i13 != Integer.MAX_VALUE && rowColumnParentData2 != null) {
                        rowColumnParentData2.getFlowLayoutData();
                    }
                    if (!(weight2 > 0.0f)) {
                        InlineClassHelper2.throwIllegalStateException("All weights <= 0 should have placeables");
                    }
                    int sign = MathKt.getSign(jRound);
                    long j5 = jRound - sign;
                    int iMax4 = Math.max(0, Math.round(weight2 * f2) + sign);
                    if (RowColumnImplKt.getFill(rowColumnParentData2)) {
                        c = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c2 = 65535;
                            i10 = iMax4;
                        }
                        rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                        Placeable placeableMo7239measureBRTryo02 = measurable2.mo7239measureBRTryo0(rowColumnMeasurePolicy3.mo5105createConstraintsxF2OJ5Q(i10, 0, iMax4, i13, true));
                        int iMainAxisSize2 = rowColumnMeasurePolicy3.mainAxisSize(placeableMo7239measureBRTryo02);
                        int iCrossAxisSize2 = rowColumnMeasurePolicy3.crossAxisSize(placeableMo7239measureBRTryo02);
                        iArr2[i28 - i6] = iMainAxisSize2;
                        i29 += iMainAxisSize2;
                        int iMax5 = Math.max(i26, iCrossAxisSize2);
                        placeableArr[i28] = placeableMo7239measureBRTryo02;
                        i26 = iMax5;
                        jRound = j5;
                    } else {
                        c = 65535;
                    }
                    c2 = c;
                    i10 = 0;
                    rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                    Placeable placeableMo7239measureBRTryo022 = measurable2.mo7239measureBRTryo0(rowColumnMeasurePolicy3.mo5105createConstraintsxF2OJ5Q(i10, 0, iMax4, i13, true));
                    int iMainAxisSize22 = rowColumnMeasurePolicy3.mainAxisSize(placeableMo7239measureBRTryo022);
                    int iCrossAxisSize22 = rowColumnMeasurePolicy3.crossAxisSize(placeableMo7239measureBRTryo022);
                    iArr2[i28 - i6] = iMainAxisSize22;
                    i29 += iMainAxisSize22;
                    int iMax52 = Math.max(i26, iCrossAxisSize22);
                    placeableArr[i28] = placeableMo7239measureBRTryo022;
                    i26 = iMax52;
                    jRound = j5;
                }
                i28++;
                i13 = i4;
            }
            i9 = (int) (i29 + j4);
            int i30 = i3 - i21;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i30) {
                i9 = i30;
            }
        }
        int i31 = i26;
        if (i19 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i32 = i6; i32 < i7; i32++) {
                Placeable placeable = placeableArr[i32];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable));
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int iCrossAxisSize3 = rowColumnMeasurePolicy3.crossAxisSize(placeable);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numCalculateAlignmentLinePosition$foundation_layout_release.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iCrossAxisSize3;
                    }
                    iMax2 = Math.max(iMax2, iCrossAxisSize3 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i33 = i21 + i9;
        if (i33 < 0) {
            i33 = 0;
        }
        int iMax6 = Math.max(i33, i);
        int iMax7 = Math.max(i31, Math.max(i2, iMax2 + iMax));
        int[] iArr3 = new int[i14];
        rowColumnMeasurePolicy3.populateMainAxisPositions(iMax6, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy3.placeHelper(placeableArr, measureScope, iMax, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }
}
