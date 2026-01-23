package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: TableCell.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableBidAskCellBodyShape;", "Landroidx/compose/ui/graphics/Shape;", "indicatorWidth", "", "<init>", "(F)V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableBidAskCellBodyShape, reason: use source file name */
/* loaded from: classes11.dex */
public final class TableCell implements Shape {
    public static final int $stable = 0;
    private final float indicatorWidth;

    @Override // androidx.compose.p011ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo4911createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        int i = (int) (size >> 32);
        int i2 = (int) (size & 4294967295L);
        if (Float.intBitsToFloat(i) <= Float.intBitsToFloat(i2)) {
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i) / 2;
            return new Outline.Rounded(RoundRect2.m6572RoundRectgG7oq9Y(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L))));
        }
        float f = 2;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) / f;
        float fCoerceAtMost = RangesKt.coerceAtMost(this.indicatorWidth, Float.intBitsToFloat(i) - fIntBitsToFloat4);
        boolean z = fCoerceAtMost > 0.0f;
        Path Path = AndroidPath_androidKt.Path();
        float fIntBitsToFloat5 = Float.intBitsToFloat(i) - fCoerceAtMost;
        if (z) {
            float fCos = ((float) (1 - Math.cos(1.0471975511965976d))) * fIntBitsToFloat4;
            Path.arcTo(new Rect(fIntBitsToFloat5, -fCos, (f * fCos) + fIntBitsToFloat5, fCos), 90.0f, 90.0f, false);
        } else {
            Path.moveTo(fIntBitsToFloat5, 0.0f);
        }
        Path.lineTo(fIntBitsToFloat4, 0.0f);
        float f2 = f * fIntBitsToFloat4;
        Path.arcTo(new Rect(0.0f, 0.0f, f2, Float.intBitsToFloat(i2)), 270.0f, -180.0f, false);
        Path.lineTo(Float.intBitsToFloat(i) - fIntBitsToFloat4, Float.intBitsToFloat(i2));
        Path.arcTo(new Rect(Float.intBitsToFloat(i) - f2, 0.0f, Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), 90.0f, z ? -120.0f : -180.0f, false);
        Path.close();
        return new Outline.Generic(Path);
    }

    public TableCell(float f) {
        this.indicatorWidth = f;
    }
}
