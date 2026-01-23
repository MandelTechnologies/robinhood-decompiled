package com.robinhood.android.search.highlights.p249ui.sportherocarousel.components;

import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BadgeTrapezoidalShape.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/components/BadgeTrapezoidalShape;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class BadgeTrapezoidalShape implements Shape {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo4911createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L));
        float f = fIntBitsToFloat / 104.0f;
        float f2 = fIntBitsToFloat2 / 20.0f;
        float f3 = f2 * 16.8f;
        float f4 = 89.8892f * f;
        float f5 = f2 * 18.8144f;
        float f6 = 87.5181f * f;
        float f7 = f2 * 20.0f;
        Path.moveTo(0.0f, 0.0f);
        Path.lineTo(fIntBitsToFloat, 0.0f);
        Path.lineTo(91.4f * f, f3);
        Path.cubicTo(f4, f5, f6, f7, f * 85.0f, fIntBitsToFloat2);
        Path.lineTo(f * 19.0f, fIntBitsToFloat2);
        Path.cubicTo(16.4819f * f, f7, f * 14.1108f, f5, f * 12.6f, f3);
        Path.lineTo(0.0f, 0.0f);
        Path.close();
        return new Outline.Generic(Path);
    }
}
