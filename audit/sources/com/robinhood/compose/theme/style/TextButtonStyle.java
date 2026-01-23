package com.robinhood.compose.theme.style;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextButtonStyle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextButtonStyle;", "", "m", "Lcom/robinhood/compose/theme/style/TextButtonStyle$Style;", Constants.RequestParamsKeys.SESSION_ID_KEY, "<init>", "(Lcom/robinhood/compose/theme/style/TextButtonStyle$Style;Lcom/robinhood/compose/theme/style/TextButtonStyle$Style;)V", "getM", "()Lcom/robinhood/compose/theme/style/TextButtonStyle$Style;", "getS", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StateColor", "Style", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TextButtonStyle {
    public static final int $stable = 0;
    private final Style m;
    private final Style s;

    public static /* synthetic */ TextButtonStyle copy$default(TextButtonStyle textButtonStyle, Style style, Style style2, int i, Object obj) {
        if ((i & 1) != 0) {
            style = textButtonStyle.m;
        }
        if ((i & 2) != 0) {
            style2 = textButtonStyle.s;
        }
        return textButtonStyle.copy(style, style2);
    }

    /* renamed from: component1, reason: from getter */
    public final Style getM() {
        return this.m;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getS() {
        return this.s;
    }

    public final TextButtonStyle copy(Style m, Style s) {
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(s, "s");
        return new TextButtonStyle(m, s);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextButtonStyle)) {
            return false;
        }
        TextButtonStyle textButtonStyle = (TextButtonStyle) other;
        return Intrinsics.areEqual(this.m, textButtonStyle.m) && Intrinsics.areEqual(this.s, textButtonStyle.s);
    }

    public int hashCode() {
        return (this.m.hashCode() * 31) + this.s.hashCode();
    }

    public String toString() {
        return "TextButtonStyle(m=" + this.m + ", s=" + this.s + ")";
    }

    public TextButtonStyle(Style m, Style s) {
        Intrinsics.checkNotNullParameter(m, "m");
        Intrinsics.checkNotNullParameter(s, "s");
        this.m = m;
        this.s = s;
    }

    public final Style getM() {
        return this.m;
    }

    public final Style getS() {
        return this.s;
    }

    /* compiled from: TextButtonStyle.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", "", "enabledColor", "Landroidx/compose/ui/graphics/Color;", "disabledColor", "enabledColorAlpha", "", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnabledColor-0d7_KjU", "()J", "J", "getDisabledColor-0d7_KjU", "getEnabledColorAlpha", "()F", "get", "Landroidx/compose/runtime/State;", "enabled", "", "pressed", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "copy", "copy-jxsXWHM", "(JJF)Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", "equals", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StateColor {
        public static final int $stable = 0;
        private final long disabledColor;
        private final long enabledColor;
        private final float enabledColorAlpha;

        public /* synthetic */ StateColor(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, f);
        }

        /* renamed from: copy-jxsXWHM$default, reason: not valid java name */
        public static /* synthetic */ StateColor m21964copyjxsXWHM$default(StateColor stateColor, long j, long j2, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stateColor.enabledColor;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = stateColor.disabledColor;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                f = stateColor.enabledColorAlpha;
            }
            return stateColor.m21967copyjxsXWHM(j3, j4, f);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getEnabledColor() {
            return this.enabledColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDisabledColor() {
            return this.disabledColor;
        }

        /* renamed from: component3, reason: from getter */
        public final float getEnabledColorAlpha() {
            return this.enabledColorAlpha;
        }

        /* renamed from: copy-jxsXWHM, reason: not valid java name */
        public final StateColor m21967copyjxsXWHM(long enabledColor, long disabledColor, float enabledColorAlpha) {
            return new StateColor(enabledColor, disabledColor, enabledColorAlpha, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateColor)) {
                return false;
            }
            StateColor stateColor = (StateColor) other;
            return Color.m6707equalsimpl0(this.enabledColor, stateColor.enabledColor) && Color.m6707equalsimpl0(this.disabledColor, stateColor.disabledColor) && Float.compare(this.enabledColorAlpha, stateColor.enabledColorAlpha) == 0;
        }

        public int hashCode() {
            return (((Color.m6713hashCodeimpl(this.enabledColor) * 31) + Color.m6713hashCodeimpl(this.disabledColor)) * 31) + Float.hashCode(this.enabledColorAlpha);
        }

        public String toString() {
            return "StateColor(enabledColor=" + Color.m6714toStringimpl(this.enabledColor) + ", disabledColor=" + Color.m6714toStringimpl(this.disabledColor) + ", enabledColorAlpha=" + this.enabledColorAlpha + ")";
        }

        private StateColor(long j, long j2, float f) {
            this.enabledColor = j;
            this.disabledColor = j2;
            this.enabledColorAlpha = f;
        }

        /* renamed from: getEnabledColor-0d7_KjU, reason: not valid java name */
        public final long m21969getEnabledColor0d7_KjU() {
            return this.enabledColor;
        }

        /* renamed from: getDisabledColor-0d7_KjU, reason: not valid java name */
        public final long m21968getDisabledColor0d7_KjU() {
            return this.disabledColor;
        }

        public final float getEnabledColorAlpha() {
            return this.enabledColorAlpha;
        }

        public final SnapshotState4<Color> get(boolean z, boolean z2, Composer composer, int i) {
            long jM6705copywmQWz5c$default;
            composer.startReplaceGroup(-190682870);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-190682870, i, -1, "com.robinhood.compose.theme.style.TextButtonStyle.StateColor.get (TextButtonStyle.kt:20)");
            }
            if (!z) {
                jM6705copywmQWz5c$default = this.disabledColor;
            } else if (z2) {
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(this.enabledColor, this.enabledColorAlpha, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM6705copywmQWz5c$default = this.enabledColor;
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM6705copywmQWz5c$default), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }

    /* compiled from: TextButtonStyle.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/TextButtonStyle$Style;", "", ResourceTypes.COLOR, "Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;Landroidx/compose/ui/text/TextStyle;)V", "getColor", "()Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Style {
        public static final int $stable = 0;
        private final StateColor color;
        private final androidx.compose.p011ui.text.TextStyle textStyle;

        public static /* synthetic */ Style copy$default(Style style, StateColor stateColor, androidx.compose.p011ui.text.TextStyle textStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                stateColor = style.color;
            }
            if ((i & 2) != 0) {
                textStyle = style.textStyle;
            }
            return style.copy(stateColor, textStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final StateColor getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final Style copy(StateColor color, androidx.compose.p011ui.text.TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            return new Style(color, textStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Intrinsics.areEqual(this.color, style.color) && Intrinsics.areEqual(this.textStyle, style.textStyle);
        }

        public int hashCode() {
            return (this.color.hashCode() * 31) + this.textStyle.hashCode();
        }

        public String toString() {
            return "Style(color=" + this.color + ", textStyle=" + this.textStyle + ")";
        }

        public Style(StateColor color, androidx.compose.p011ui.text.TextStyle textStyle) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.color = color;
            this.textStyle = textStyle;
        }

        public final StateColor getColor() {
            return this.color;
        }

        public final androidx.compose.p011ui.text.TextStyle getTextStyle() {
            return this.textStyle;
        }
    }
}
