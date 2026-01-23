package com.robinhood.android.ticker;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WrappedTicker.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/ticker/TickerTextState;", "", "text", "", "textColor", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Lcom/robinhood/android/ticker/TickerTextState$Style;", "contentDescription", "forceRefresh", "", "<init>", "(Ljava/lang/String;JLcom/robinhood/android/ticker/TickerTextState$Style;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTextColor-0d7_KjU", "()J", "J", "getStyle", "()Lcom/robinhood/android/ticker/TickerTextState$Style;", "getContentDescription", "getForceRefresh", "()Z", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "copy", "copy-iJQMabo", "(Ljava/lang/String;JLcom/robinhood/android/ticker/TickerTextState$Style;Ljava/lang/String;Z)Lcom/robinhood/android/ticker/TickerTextState;", "equals", "other", "hashCode", "", "toString", "Style", "lib-ticker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TickerTextState {
    public static final int $stable = 0;
    private final String contentDescription;
    private final boolean forceRefresh;
    private final Style style;
    private final String text;
    private final long textColor;

    public /* synthetic */ TickerTextState(String str, long j, Style style, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, style, str2, z);
    }

    /* renamed from: copy-iJQMabo$default, reason: not valid java name */
    public static /* synthetic */ TickerTextState m19238copyiJQMabo$default(TickerTextState tickerTextState, String str, long j, Style style, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tickerTextState.text;
        }
        if ((i & 2) != 0) {
            j = tickerTextState.textColor;
        }
        if ((i & 4) != 0) {
            style = tickerTextState.style;
        }
        if ((i & 8) != 0) {
            str2 = tickerTextState.contentDescription;
        }
        if ((i & 16) != 0) {
            z = tickerTextState.forceRefresh;
        }
        boolean z2 = z;
        Style style2 = style;
        return tickerTextState.m19240copyiJQMabo(str, j, style2, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    /* renamed from: copy-iJQMabo, reason: not valid java name */
    public final TickerTextState m19240copyiJQMabo(String text, long textColor, Style style, String contentDescription, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new TickerTextState(text, textColor, style, contentDescription, forceRefresh, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickerTextState)) {
            return false;
        }
        TickerTextState tickerTextState = (TickerTextState) other;
        return Intrinsics.areEqual(this.text, tickerTextState.text) && Color.m6707equalsimpl0(this.textColor, tickerTextState.textColor) && this.style == tickerTextState.style && Intrinsics.areEqual(this.contentDescription, tickerTextState.contentDescription) && this.forceRefresh == tickerTextState.forceRefresh;
    }

    public int hashCode() {
        return (((((((this.text.hashCode() * 31) + Color.m6713hashCodeimpl(this.textColor)) * 31) + this.style.hashCode()) * 31) + this.contentDescription.hashCode()) * 31) + Boolean.hashCode(this.forceRefresh);
    }

    public String toString() {
        return "TickerTextState(text=" + this.text + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ", style=" + this.style + ", contentDescription=" + this.contentDescription + ", forceRefresh=" + this.forceRefresh + ")";
    }

    private TickerTextState(String text, long j, Style style, String contentDescription, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.text = text;
        this.textColor = j;
        this.style = style;
        this.contentDescription = contentDescription;
        this.forceRefresh = z;
    }

    public /* synthetic */ TickerTextState(String str, long j, Style style, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, style, (i & 8) != 0 ? str : str2, (i & 16) != 0 ? false : z, null);
    }

    public final String getText() {
        return this.text;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m19241getTextColor0d7_KjU() {
        return this.textColor;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final boolean getForceRefresh() {
        return this.forceRefresh;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WrappedTicker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/ticker/TickerTextState$Style;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_LARGE", "DISPLAY_MEDIUM", "REGULAR_LARGE", "REGULAR_LARGE_BOLD", "REGULAR_MEDIUM", "REGULAR_MEDIUM_BOLD", "REGULAR_MEDIUM_LARGER", "REGULAR_SMALL_BOLD", "REGULAR_SMALL", "lib-ticker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Style {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style DISPLAY_LARGE = new Style("DISPLAY_LARGE", 0);
        public static final Style DISPLAY_MEDIUM = new Style("DISPLAY_MEDIUM", 1);
        public static final Style REGULAR_LARGE = new Style("REGULAR_LARGE", 2);
        public static final Style REGULAR_LARGE_BOLD = new Style("REGULAR_LARGE_BOLD", 3);
        public static final Style REGULAR_MEDIUM = new Style("REGULAR_MEDIUM", 4);
        public static final Style REGULAR_MEDIUM_BOLD = new Style("REGULAR_MEDIUM_BOLD", 5);
        public static final Style REGULAR_MEDIUM_LARGER = new Style("REGULAR_MEDIUM_LARGER", 6);
        public static final Style REGULAR_SMALL_BOLD = new Style("REGULAR_SMALL_BOLD", 7);
        public static final Style REGULAR_SMALL = new Style("REGULAR_SMALL", 8);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{DISPLAY_LARGE, DISPLAY_MEDIUM, REGULAR_LARGE, REGULAR_LARGE_BOLD, REGULAR_MEDIUM, REGULAR_MEDIUM_BOLD, REGULAR_MEDIUM_LARGER, REGULAR_SMALL_BOLD, REGULAR_SMALL};
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        private Style(String str, int i) {
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(styleArr$values);
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }
}
