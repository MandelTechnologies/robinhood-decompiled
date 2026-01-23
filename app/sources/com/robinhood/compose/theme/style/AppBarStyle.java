package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBarStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/AppBarStyle;", "", "colors", "Lcom/robinhood/compose/theme/style/AppBarStyle$Colors;", "<init>", "(Lcom/robinhood/compose/theme/style/AppBarStyle$Colors;)V", "getColors", "()Lcom/robinhood/compose/theme/style/AppBarStyle$Colors;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Colors", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AppBarStyle {
    public static final int $stable = 0;
    private final Colors colors;

    public static /* synthetic */ AppBarStyle copy$default(AppBarStyle appBarStyle, Colors colors, int i, Object obj) {
        if ((i & 1) != 0) {
            colors = appBarStyle.colors;
        }
        return appBarStyle.copy(colors);
    }

    /* renamed from: component1, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    public final AppBarStyle copy(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new AppBarStyle(colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppBarStyle) && Intrinsics.areEqual(this.colors, ((AppBarStyle) other).colors);
    }

    public int hashCode() {
        return this.colors.hashCode();
    }

    public String toString() {
        return "AppBarStyle(colors=" + this.colors + ")";
    }

    public AppBarStyle(Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
    }

    public final Colors getColors() {
        return this.colors;
    }

    /* compiled from: AppBarStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/AppBarStyle$Colors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getForegroundColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/theme/style/AppBarStyle$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final long foregroundColor;

        public /* synthetic */ Colors(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ Colors m21680copyOWjLjI$default(Colors colors, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.backgroundColor;
            }
            if ((i & 2) != 0) {
                j2 = colors.foregroundColor;
            }
            return colors.m21683copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getForegroundColor() {
            return this.foregroundColor;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final Colors m21683copyOWjLjI(long backgroundColor, long foregroundColor) {
            return new Colors(backgroundColor, foregroundColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.backgroundColor, colors.backgroundColor) && Color.m6707equalsimpl0(this.foregroundColor, colors.foregroundColor);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.foregroundColor);
        }

        public String toString() {
            return "Colors(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", foregroundColor=" + Color.m6714toStringimpl(this.foregroundColor) + ")";
        }

        private Colors(long j, long j2) {
            this.backgroundColor = j;
            this.foregroundColor = j2;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m21684getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getForegroundColor-0d7_KjU, reason: not valid java name */
        public final long m21685getForegroundColor0d7_KjU() {
            return this.foregroundColor;
        }
    }
}
