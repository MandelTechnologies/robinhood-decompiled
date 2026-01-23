package com.robinhood.shared.compose.color;

import android.graphics.Shader;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LinearGradientColor.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/compose/color/LinearGradientColor;", "", "angle", "", "colorStops", "", "Lkotlin/Pair;", "Landroidx/compose/ui/graphics/Color;", "<init>", "(FLjava/util/List;)V", "getAngle", "()F", "getColorStops", "()Ljava/util/List;", "getBrush", "Landroidx/compose/ui/graphics/Brush;", "rectToDrawOn", "Landroidx/compose/ui/geometry/Rect;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-color_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final /* data */ class LinearGradientColor {
    public static final int $stable = 8;
    private final float angle;
    private final List<Tuples2<Float, Color>> colorStops;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinearGradientColor copy$default(LinearGradientColor linearGradientColor, float f, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = linearGradientColor.angle;
        }
        if ((i & 2) != 0) {
            list = linearGradientColor.colorStops;
        }
        return linearGradientColor.copy(f, list);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAngle() {
        return this.angle;
    }

    public final List<Tuples2<Float, Color>> component2() {
        return this.colorStops;
    }

    public final LinearGradientColor copy(float angle, List<Tuples2<Float, Color>> colorStops) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        return new LinearGradientColor(angle, colorStops);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradientColor)) {
            return false;
        }
        LinearGradientColor linearGradientColor = (LinearGradientColor) other;
        return Float.compare(this.angle, linearGradientColor.angle) == 0 && Intrinsics.areEqual(this.colorStops, linearGradientColor.colorStops);
    }

    public int hashCode() {
        return (Float.hashCode(this.angle) * 31) + this.colorStops.hashCode();
    }

    public String toString() {
        return "LinearGradientColor(angle=" + this.angle + ", colorStops=" + this.colorStops + ")";
    }

    public LinearGradientColor(float f, List<Tuples2<Float, Color>> colorStops) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.angle = f;
        this.colorStops = colorStops;
        if (colorStops.isEmpty()) {
            throw new IllegalStateException("colorStops cannot be empty");
        }
    }

    public final float getAngle() {
        return this.angle;
    }

    public final List<Tuples2<Float, Color>> getColorStops() {
        return this.colorStops;
    }

    public static /* synthetic */ Brush getBrush$default(LinearGradientColor linearGradientColor, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return linearGradientColor.getBrush(rect);
    }

    public final Brush getBrush(final Rect rectToDrawOn) {
        if (this.colorStops.size() > 1) {
            return new Brush5() { // from class: com.robinhood.shared.compose.color.LinearGradientColor.getBrush.1
                @Override // androidx.compose.p011ui.graphics.Brush5
                /* renamed from: createShader-uvyYCjk */
                public Shader mo6692createShaderuvyYCjk(long size) {
                    Rect rectM6592toRectuvyYCjk = rectToDrawOn;
                    if (rectM6592toRectuvyYCjk == null) {
                        rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(size);
                    }
                    Tuples2<Offset, Offset> linearGradientShaderOffsets = LinearGradientColor2.getLinearGradientShaderOffsets(rectM6592toRectuvyYCjk, this.getAngle());
                    long packedValue = linearGradientShaderOffsets.component1().getPackedValue();
                    long packedValue2 = linearGradientShaderOffsets.component2().getPackedValue();
                    List<Tuples2<Float, Color>> colorStops = this.getColorStops();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops, 10));
                    Iterator<T> it = colorStops.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Color.m6701boximpl(((Color) ((Tuples2) it.next()).getSecond()).getValue()));
                    }
                    List<Tuples2<Float, Color>> colorStops2 = this.getColorStops();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops2, 10));
                    Iterator<T> it2 = colorStops2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Float.valueOf(((Number) ((Tuples2) it2.next()).getFirst()).floatValue()));
                    }
                    return androidx.compose.p011ui.graphics.Shader.m6831LinearGradientShaderVjE6UOU$default(packedValue, packedValue2, arrayList, arrayList2, 0, 16, null);
                }
            };
        }
        return new SolidColor(this.colorStops.get(0).component2().getValue(), null);
    }
}
