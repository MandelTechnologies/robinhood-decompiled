package com.google.accompanist.placeholder;

import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.util.MathHelpers;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PlaceholderHighlight.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m3636d2 = {"Lcom/google/accompanist/placeholder/Shimmer;", "Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "Landroidx/compose/ui/graphics/Color;", "highlightColor", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "", "animationSpec", "progressForMaxAlpha", "<init>", "(JLandroidx/compose/animation/core/InfiniteRepeatableSpec;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "progress", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Brush;", "brush-d16Qtg0", "(FJ)Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "F", "placeholder_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final /* data */ class Shimmer implements PlaceholderHighlight {
    private final InfiniteRepeatableSpec<Float> animationSpec;
    private final long highlightColor;
    private final float progressForMaxAlpha;

    public /* synthetic */ Shimmer(long j, InfiniteRepeatableSpec infiniteRepeatableSpec, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, infiniteRepeatableSpec, f);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shimmer)) {
            return false;
        }
        Shimmer shimmer = (Shimmer) other;
        return Color.m6707equalsimpl0(this.highlightColor, shimmer.highlightColor) && Intrinsics.areEqual(this.animationSpec, shimmer.animationSpec) && Float.compare(this.progressForMaxAlpha, shimmer.progressForMaxAlpha) == 0;
    }

    public int hashCode() {
        return (((Color.m6713hashCodeimpl(this.highlightColor) * 31) + this.animationSpec.hashCode()) * 31) + Float.hashCode(this.progressForMaxAlpha);
    }

    public String toString() {
        return "Shimmer(highlightColor=" + ((Object) Color.m6714toStringimpl(this.highlightColor)) + ", animationSpec=" + this.animationSpec + ", progressForMaxAlpha=" + this.progressForMaxAlpha + ')';
    }

    private Shimmer(long j, InfiniteRepeatableSpec<Float> animationSpec, float f) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.highlightColor = j;
        this.animationSpec = animationSpec;
        this.progressForMaxAlpha = f;
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    public InfiniteRepeatableSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    /* renamed from: brush-d16Qtg0 */
    public Brush mo9204brushd16Qtg0(float progress, long size) {
        return Brush.Companion.m6680radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(this.highlightColor, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(this.highlightColor), Color.m6701boximpl(Color.m6705copywmQWz5c$default(this.highlightColor, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))}), OffsetKt.Offset(0.0f, 0.0f), RangesKt.coerceAtLeast(Math.max(Size.m6583getWidthimpl(size), Size.m6580getHeightimpl(size)) * progress * 2, 0.01f), 0, 8, (Object) null);
    }

    @Override // com.google.accompanist.placeholder.PlaceholderHighlight
    public float alpha(float progress) {
        float f = this.progressForMaxAlpha;
        if (progress <= f) {
            return MathHelpers.lerp(0.0f, 1.0f, progress / f);
        }
        return MathHelpers.lerp(1.0f, 0.0f, (progress - f) / (1.0f - f));
    }
}
