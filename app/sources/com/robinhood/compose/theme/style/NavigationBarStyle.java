package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationBarStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/NavigationBarStyle$Colors;", "<init>", "(Lcom/robinhood/compose/theme/style/NavigationBarStyle$Colors;)V", "getColors", "()Lcom/robinhood/compose/theme/style/NavigationBarStyle$Colors;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NavigationBarStyle {
    public static final int $stable = 0;
    private final Colors colors;

    public static /* synthetic */ NavigationBarStyle copy$default(NavigationBarStyle navigationBarStyle, Colors colors, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = navigationBarStyle.colors;
        }
        return navigationBarStyle.copy(colors);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    public final NavigationBarStyle copy(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new NavigationBarStyle(colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigationBarStyle) && Intrinsics.areEqual(this.colors, ((NavigationBarStyle) other).colors);
    }

    public int hashCode() {
        return this.colors.hashCode();
    }

    public String toString() {
        return "NavigationBarStyle(colors=" + this.colors + ")";
    }

    public NavigationBarStyle(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
    }

    public final Colors getColors() {
        return this.colors;
    }

    /* compiled from: NavigationBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/NavigationBarStyle$Colors;", "", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "indicatorColor", "unselectedColor", "disabledColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSelectedColor-0d7_KjU", "()J", "J", "getIndicatorColor-0d7_KjU", "getUnselectedColor-0d7_KjU", "getDisabledColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Lcom/robinhood/compose/theme/style/NavigationBarStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long indicatorColor;
        private final long selectedColor;
        private final long unselectedColor;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4);
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Colors m21808copyjRlVdoo$default(Colors colors, long j, long j2, long j3, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.selectedColor;
            }
            long j5 = j;
            if ((i & 2) != 0) {
                j2 = colors.indicatorColor;
            }
            long j6 = j2;
            if ((i & 4) != 0) {
                j3 = colors.unselectedColor;
            }
            return colors.m21813copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? colors.disabledColor : j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getSelectedColor() {
            return this.selectedColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getIndicatorColor() {
            return this.indicatorColor;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getUnselectedColor() {
            return this.unselectedColor;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Colors m21813copyjRlVdoo(long selectedColor, long indicatorColor, long unselectedColor, long disabledColor) {
            return new Colors(selectedColor, indicatorColor, unselectedColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.selectedColor, colors.selectedColor) && Color.m6707equalsimpl0(this.indicatorColor, colors.indicatorColor) && Color.m6707equalsimpl0(this.unselectedColor, colors.unselectedColor) && Color.m6707equalsimpl0(this.disabledColor, colors.disabledColor);
        }

        public int hashCode() {
            return (((((Color.m6713hashCodeimpl(this.selectedColor) * 31) + Color.m6713hashCodeimpl(this.indicatorColor)) * 31) + Color.m6713hashCodeimpl(this.unselectedColor)) * 31) + Color.m6713hashCodeimpl(this.disabledColor);
        }

        public String toString() {
            return "Colors(selectedColor=" + Color.m6714toStringimpl(this.selectedColor) + ", indicatorColor=" + Color.m6714toStringimpl(this.indicatorColor) + ", unselectedColor=" + Color.m6714toStringimpl(this.unselectedColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ")";
        }

        private Colors(long j, long j2, long j3, long j4) {
            this.selectedColor = j;
            this.indicatorColor = j2;
            this.unselectedColor = j3;
            this.disabledColor = j4;
        }

        /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
        public final long m21816getSelectedColor0d7_KjU() {
            return this.selectedColor;
        }

        /* renamed from: getIndicatorColor-0d7_KjU, reason: not valid java name */
        public final long m21815getIndicatorColor0d7_KjU() {
            return this.indicatorColor;
        }

        /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
        public final long m21817getUnselectedColor0d7_KjU() {
            return this.unselectedColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21814getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }
    }
}
