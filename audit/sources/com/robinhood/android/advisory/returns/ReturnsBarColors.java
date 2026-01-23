package com.robinhood.android.advisory.returns;

import androidx.compose.p011ui.graphics.Color;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0002\b\u001cJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0002\b\u001dJ\u001b\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u001b\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J\u001b\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J\u001b\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J»\u0001\u0010%\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsBarColors;", "", "front", "", "Lcom/robinhood/android/advisory/returns/BarColorState;", "", "Landroidx/compose/ui/graphics/Color;", "innerShadow", "leftSide", "rightSide", "frontBorder", "topShadow", "bottomShadow", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getFront", "()Ljava/util/Map;", "getInnerShadow", "getLeftSide", "getRightSide", "getFrontBorder", "getTopShadow", "getBottomShadow", "isSelected", "", "isDay", "innerShadow-WaAFU9c", "(ZZ)J", "topShadow-6MYuD4A", "bottomShadow-6MYuD4A", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReturnsBarColors {
    public static final int $stable = 8;
    private final Map<ReturnsChart2, Color> bottomShadow;
    private final Map<ReturnsChart2, List<Color>> front;
    private final Map<ReturnsChart2, List<Color>> frontBorder;
    private final Map<ReturnsChart2, Color> innerShadow;
    private final Map<ReturnsChart2, List<Color>> leftSide;
    private final Map<ReturnsChart2, List<Color>> rightSide;
    private final Map<ReturnsChart2, Color> topShadow;

    public static /* synthetic */ ReturnsBarColors copy$default(ReturnsBarColors returnsBarColors, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = returnsBarColors.front;
        }
        if ((i & 2) != 0) {
            map2 = returnsBarColors.innerShadow;
        }
        if ((i & 4) != 0) {
            map3 = returnsBarColors.leftSide;
        }
        if ((i & 8) != 0) {
            map4 = returnsBarColors.rightSide;
        }
        if ((i & 16) != 0) {
            map5 = returnsBarColors.frontBorder;
        }
        if ((i & 32) != 0) {
            map6 = returnsBarColors.topShadow;
        }
        if ((i & 64) != 0) {
            map7 = returnsBarColors.bottomShadow;
        }
        Map map8 = map6;
        Map map9 = map7;
        Map map10 = map5;
        Map map11 = map3;
        return returnsBarColors.copy(map, map2, map11, map4, map10, map8, map9);
    }

    public final Map<ReturnsChart2, List<Color>> component1() {
        return this.front;
    }

    public final Map<ReturnsChart2, Color> component2() {
        return this.innerShadow;
    }

    public final Map<ReturnsChart2, List<Color>> component3() {
        return this.leftSide;
    }

    public final Map<ReturnsChart2, List<Color>> component4() {
        return this.rightSide;
    }

    public final Map<ReturnsChart2, List<Color>> component5() {
        return this.frontBorder;
    }

    public final Map<ReturnsChart2, Color> component6() {
        return this.topShadow;
    }

    public final Map<ReturnsChart2, Color> component7() {
        return this.bottomShadow;
    }

    public final ReturnsBarColors copy(Map<ReturnsChart2, ? extends List<Color>> front, Map<ReturnsChart2, Color> innerShadow, Map<ReturnsChart2, ? extends List<Color>> leftSide, Map<ReturnsChart2, ? extends List<Color>> rightSide, Map<ReturnsChart2, ? extends List<Color>> frontBorder, Map<ReturnsChart2, Color> topShadow, Map<ReturnsChart2, Color> bottomShadow) {
        Intrinsics.checkNotNullParameter(front, "front");
        Intrinsics.checkNotNullParameter(innerShadow, "innerShadow");
        Intrinsics.checkNotNullParameter(leftSide, "leftSide");
        Intrinsics.checkNotNullParameter(rightSide, "rightSide");
        Intrinsics.checkNotNullParameter(frontBorder, "frontBorder");
        Intrinsics.checkNotNullParameter(topShadow, "topShadow");
        Intrinsics.checkNotNullParameter(bottomShadow, "bottomShadow");
        return new ReturnsBarColors(front, innerShadow, leftSide, rightSide, frontBorder, topShadow, bottomShadow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnsBarColors)) {
            return false;
        }
        ReturnsBarColors returnsBarColors = (ReturnsBarColors) other;
        return Intrinsics.areEqual(this.front, returnsBarColors.front) && Intrinsics.areEqual(this.innerShadow, returnsBarColors.innerShadow) && Intrinsics.areEqual(this.leftSide, returnsBarColors.leftSide) && Intrinsics.areEqual(this.rightSide, returnsBarColors.rightSide) && Intrinsics.areEqual(this.frontBorder, returnsBarColors.frontBorder) && Intrinsics.areEqual(this.topShadow, returnsBarColors.topShadow) && Intrinsics.areEqual(this.bottomShadow, returnsBarColors.bottomShadow);
    }

    public int hashCode() {
        return (((((((((((this.front.hashCode() * 31) + this.innerShadow.hashCode()) * 31) + this.leftSide.hashCode()) * 31) + this.rightSide.hashCode()) * 31) + this.frontBorder.hashCode()) * 31) + this.topShadow.hashCode()) * 31) + this.bottomShadow.hashCode();
    }

    public String toString() {
        return "ReturnsBarColors(front=" + this.front + ", innerShadow=" + this.innerShadow + ", leftSide=" + this.leftSide + ", rightSide=" + this.rightSide + ", frontBorder=" + this.frontBorder + ", topShadow=" + this.topShadow + ", bottomShadow=" + this.bottomShadow + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsBarColors(Map<ReturnsChart2, ? extends List<Color>> front, Map<ReturnsChart2, Color> innerShadow, Map<ReturnsChart2, ? extends List<Color>> leftSide, Map<ReturnsChart2, ? extends List<Color>> rightSide, Map<ReturnsChart2, ? extends List<Color>> frontBorder, Map<ReturnsChart2, Color> topShadow, Map<ReturnsChart2, Color> bottomShadow) {
        Intrinsics.checkNotNullParameter(front, "front");
        Intrinsics.checkNotNullParameter(innerShadow, "innerShadow");
        Intrinsics.checkNotNullParameter(leftSide, "leftSide");
        Intrinsics.checkNotNullParameter(rightSide, "rightSide");
        Intrinsics.checkNotNullParameter(frontBorder, "frontBorder");
        Intrinsics.checkNotNullParameter(topShadow, "topShadow");
        Intrinsics.checkNotNullParameter(bottomShadow, "bottomShadow");
        this.front = front;
        this.innerShadow = innerShadow;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.frontBorder = frontBorder;
        this.topShadow = topShadow;
        this.bottomShadow = bottomShadow;
    }

    public final Map<ReturnsChart2, List<Color>> getFront() {
        return this.front;
    }

    public final Map<ReturnsChart2, Color> getInnerShadow() {
        return this.innerShadow;
    }

    public final Map<ReturnsChart2, List<Color>> getLeftSide() {
        return this.leftSide;
    }

    public final Map<ReturnsChart2, List<Color>> getRightSide() {
        return this.rightSide;
    }

    public /* synthetic */ ReturnsBarColors(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, map2, map3, map4, (i & 16) != 0 ? MapsKt.emptyMap() : map5, (i & 32) != 0 ? MapsKt.emptyMap() : map6, (i & 64) != 0 ? MapsKt.emptyMap() : map7);
    }

    public final Map<ReturnsChart2, List<Color>> getFrontBorder() {
        return this.frontBorder;
    }

    public final Map<ReturnsChart2, Color> getTopShadow() {
        return this.topShadow;
    }

    public final Map<ReturnsChart2, Color> getBottomShadow() {
        return this.bottomShadow;
    }

    public final List<Color> front(boolean isSelected, boolean isDay) {
        List<Color> list = this.front.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* renamed from: innerShadow-WaAFU9c, reason: not valid java name */
    public final long m11254innerShadowWaAFU9c(boolean isSelected, boolean isDay) {
        Color color = this.innerShadow.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
        return color != null ? color.getValue() : Color.INSTANCE.m6726getUnspecified0d7_KjU();
    }

    public final List<Color> frontBorder(boolean isSelected, boolean isDay) {
        List<Color> list = this.frontBorder.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Color> leftSide(boolean isSelected, boolean isDay) {
        List<Color> list = this.leftSide.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Color> rightSide(boolean isSelected, boolean isDay) {
        List<Color> list = this.rightSide.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* renamed from: topShadow-6MYuD4A, reason: not valid java name */
    public final Color m11255topShadow6MYuD4A(boolean isSelected, boolean isDay) {
        return this.topShadow.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
    }

    /* renamed from: bottomShadow-6MYuD4A, reason: not valid java name */
    public final Color m11253bottomShadow6MYuD4A(boolean isSelected, boolean isDay) {
        return this.bottomShadow.get(ReturnsChart2.INSTANCE.from(isSelected, isDay));
    }
}
