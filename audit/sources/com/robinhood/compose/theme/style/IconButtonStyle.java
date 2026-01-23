package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IconButtonStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/IconButtonStyle;", "", InstantRetirementSplashScreen.PrimaryButtonTag, "Lcom/robinhood/compose/theme/style/IconButtonStyle$Style;", InstantRetirementSplashScreen.SecondaryButtonTag, "<init>", "(Lcom/robinhood/compose/theme/style/IconButtonStyle$Style;Lcom/robinhood/compose/theme/style/IconButtonStyle$Style;)V", "getPrimary", "()Lcom/robinhood/compose/theme/style/IconButtonStyle$Style;", "getSecondary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StateColor", "Colors", "Style", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IconButtonStyle {
    public static final int $stable = 0;
    private final Style primary;
    private final Style secondary;

    public static /* synthetic */ IconButtonStyle copy$default(IconButtonStyle iconButtonStyle, Style style, Style style2, int i, Object obj) {
        if ((i & 1) != 0) {
            style = iconButtonStyle.primary;
        }
        if ((i & 2) != 0) {
            style2 = iconButtonStyle.secondary;
        }
        return iconButtonStyle.copy(style, style2);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getSecondary() {
        return this.secondary;
    }

    public final IconButtonStyle copy(Style primary, Style secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        return new IconButtonStyle(primary, secondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonStyle)) {
            return false;
        }
        IconButtonStyle iconButtonStyle = (IconButtonStyle) other;
        return Intrinsics.areEqual(this.primary, iconButtonStyle.primary) && Intrinsics.areEqual(this.secondary, iconButtonStyle.secondary);
    }

    public int hashCode() {
        return (this.primary.hashCode() * 31) + this.secondary.hashCode();
    }

    public String toString() {
        return "IconButtonStyle(primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }

    public IconButtonStyle(Style primary, Style secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.primary = primary;
        this.secondary = secondary;
    }

    public final Style getPrimary() {
        return this.primary;
    }

    public final Style getSecondary() {
        return this.secondary;
    }

    /* compiled from: IconButtonStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "disabledColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabledColor-0d7_KjU", "()J", "J", "getDisabledColor-0d7_KjU", "get", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StateColor {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long enabledColor;

        public /* synthetic */ StateColor(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ StateColor m21784copyOWjLjI$default(StateColor stateColor, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stateColor.enabledColor;
            }
            if ((i & 2) != 0) {
                j2 = stateColor.disabledColor;
            }
            return stateColor.m21787copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final StateColor m21787copyOWjLjI(long enabledColor, long disabledColor) {
            return new StateColor(enabledColor, disabledColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateColor)) {
                return false;
            }
            StateColor stateColor = (StateColor) other;
            return Color.m6707equalsimpl0(this.enabledColor, stateColor.enabledColor) && Color.m6707equalsimpl0(this.disabledColor, stateColor.disabledColor);
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.enabledColor) * 31) + Color.m6713hashCodeimpl(this.disabledColor);
        }

        public String toString() {
            return "StateColor(enabledColor=" + Color.m6714toStringimpl(this.enabledColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ")";
        }

        private StateColor(long j, long j2) {
            this.enabledColor = j;
            this.disabledColor = j2;
        }

        /* renamed from: getEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m21789getEnabledColor0d7_KjU() {
            return this.enabledColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21788getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        public final SnapshotState4<Color> get(boolean z, Composer composer, int i) {
            long j;
            composer.startReplaceGroup(-1757258394);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757258394, i, -1, "com.robinhood.compose.theme.style.IconButtonStyle.StateColor.get (IconButtonStyle.kt:18)");
            }
            if (z) {
                j = this.enabledColor;
            } else {
                j = this.disabledColor;
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(j), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: IconButtonStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/IconButtonStyle$Colors;", "", "backgroundColor", "Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;", "foregroundColor", "borderColor", "<init>", "(Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;)V", "getBackgroundColor", "()Lcom/robinhood/compose/theme/style/IconButtonStyle$StateColor;", "getForegroundColor", "getBorderColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final StateColor backgroundColor;
        private final StateColor borderColor;
        private final StateColor foregroundColor;

        public static /* synthetic */ Colors copy$default(Colors colors, StateColor stateColor, StateColor stateColor2, StateColor stateColor3, int i, Object obj) {
            if ((i & 1) != 0) {
                stateColor = colors.backgroundColor;
            }
            if ((i & 2) != 0) {
                stateColor2 = colors.foregroundColor;
            }
            if ((i & 4) != 0) {
                stateColor3 = colors.borderColor;
            }
            return colors.copy(stateColor, stateColor2, stateColor3);
        }

        /* renamed from: component1, reason: from getter */
        public final StateColor getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final StateColor getForegroundColor() {
            return this.foregroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final StateColor getBorderColor() {
            return this.borderColor;
        }

        public final Colors copy(StateColor backgroundColor, StateColor foregroundColor, StateColor borderColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
            return new Colors(backgroundColor, foregroundColor, borderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Intrinsics.areEqual(this.backgroundColor, colors.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, colors.foregroundColor) && Intrinsics.areEqual(this.borderColor, colors.borderColor);
        }

        public int hashCode() {
            int iHashCode = ((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31;
            StateColor stateColor = this.borderColor;
            return iHashCode + (stateColor == null ? 0 : stateColor.hashCode());
        }

        public String toString() {
            return "Colors(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", borderColor=" + this.borderColor + ")";
        }

        public Colors(StateColor backgroundColor, StateColor foregroundColor, StateColor stateColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
            this.backgroundColor = backgroundColor;
            this.foregroundColor = foregroundColor;
            this.borderColor = stateColor;
        }

        public final StateColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public final StateColor getForegroundColor() {
            return this.foregroundColor;
        }

        public final StateColor getBorderColor() {
            return this.borderColor;
        }
    }

    /* compiled from: IconButtonStyle.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/IconButtonStyle$Style;", "", "colors", "Lcom/robinhood/compose/theme/style/IconButtonStyle$Colors;", "<init>", "(Lcom/robinhood/compose/theme/style/IconButtonStyle$Colors;)V", "getColors", "()Lcom/robinhood/compose/theme/style/IconButtonStyle$Colors;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Style {
        public static final int $stable = 0;
        private final Colors colors;

        public static /* synthetic */ Style copy$default(Style style, Colors colors, int i, Object obj) {
            if ((i & 1) != 0) {
                colors = style.colors;
            }
            return style.copy(colors);
        }

        /* renamed from: component1, reason: from getter */
        public final Colors getColors() {
            return this.colors;
        }

        public final Style copy(Colors colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new Style(colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Style) && Intrinsics.areEqual(this.colors, ((Style) other).colors);
        }

        public int hashCode() {
            return this.colors.hashCode();
        }

        public String toString() {
            return "Style(colors=" + this.colors + ")";
        }

        public Style(Colors colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.colors = colors;
        }

        public final Colors getColors() {
            return this.colors;
        }
    }
}
