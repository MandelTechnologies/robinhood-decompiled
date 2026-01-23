package com.robinhood.android.margin.upgrade.rates;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.font.FontWeight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeRatesVisualState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003 !\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState;", "", "header", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Row;", "rows", "", com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer.f10637type, "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Footer;", "highlightRowStyle", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "<init>", "(Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Row;Ljava/util/List;Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Footer;Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;)V", "getHeader", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Row;", "getRows", "()Ljava/util/List;", "getFooter", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Footer;", "getHighlightRowStyle", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Row", "Footer", "HighlightRowStyle", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginUpgradeRatesVisualState {
    public static final int $stable = 8;
    private final Footer footer;
    private final Row header;
    private final HighlightRowStyle highlightRowStyle;
    private final List<Row> rows;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginUpgradeRatesVisualState copy$default(MarginUpgradeRatesVisualState marginUpgradeRatesVisualState, Row row, List list, Footer footer, HighlightRowStyle highlightRowStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            row = marginUpgradeRatesVisualState.header;
        }
        if ((i & 2) != 0) {
            list = marginUpgradeRatesVisualState.rows;
        }
        if ((i & 4) != 0) {
            footer = marginUpgradeRatesVisualState.footer;
        }
        if ((i & 8) != 0) {
            highlightRowStyle = marginUpgradeRatesVisualState.highlightRowStyle;
        }
        return marginUpgradeRatesVisualState.copy(row, list, footer, highlightRowStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final Row getHeader() {
        return this.header;
    }

    public final List<Row> component2() {
        return this.rows;
    }

    /* renamed from: component3, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* renamed from: component4, reason: from getter */
    public final HighlightRowStyle getHighlightRowStyle() {
        return this.highlightRowStyle;
    }

    public final MarginUpgradeRatesVisualState copy(Row header, List<Row> rows, Footer footer, HighlightRowStyle highlightRowStyle) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(highlightRowStyle, "highlightRowStyle");
        return new MarginUpgradeRatesVisualState(header, rows, footer, highlightRowStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginUpgradeRatesVisualState)) {
            return false;
        }
        MarginUpgradeRatesVisualState marginUpgradeRatesVisualState = (MarginUpgradeRatesVisualState) other;
        return Intrinsics.areEqual(this.header, marginUpgradeRatesVisualState.header) && Intrinsics.areEqual(this.rows, marginUpgradeRatesVisualState.rows) && Intrinsics.areEqual(this.footer, marginUpgradeRatesVisualState.footer) && Intrinsics.areEqual(this.highlightRowStyle, marginUpgradeRatesVisualState.highlightRowStyle);
    }

    public int hashCode() {
        int iHashCode = ((this.header.hashCode() * 31) + this.rows.hashCode()) * 31;
        Footer footer = this.footer;
        return ((iHashCode + (footer == null ? 0 : footer.hashCode())) * 31) + this.highlightRowStyle.hashCode();
    }

    public String toString() {
        return "MarginUpgradeRatesVisualState(header=" + this.header + ", rows=" + this.rows + ", footer=" + this.footer + ", highlightRowStyle=" + this.highlightRowStyle + ")";
    }

    public MarginUpgradeRatesVisualState(Row header, List<Row> rows, Footer footer, HighlightRowStyle highlightRowStyle) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(highlightRowStyle, "highlightRowStyle");
        this.header = header;
        this.rows = rows;
        this.footer = footer;
        this.highlightRowStyle = highlightRowStyle;
    }

    public final Row getHeader() {
        return this.header;
    }

    public final List<Row> getRows() {
        return this.rows;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final HighlightRowStyle getHighlightRowStyle() {
        return this.highlightRowStyle;
    }

    /* compiled from: MarginUpgradeRatesVisualState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Row;", "", "title", "", "value", "isHighlighted", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "unselectedRowFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/font/FontWeight;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getValue", "()Z", "getTextColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getUnselectedRowFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "component3", "component4", "component4-QN2ZGVo", "component5", "copy", "copy-8wvRk98", "equals", "other", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 0;
        private final boolean isHighlighted;
        private final Color textColor;
        private final String title;
        private final FontWeight unselectedRowFontWeight;
        private final String value;

        public /* synthetic */ Row(String str, String str2, boolean z, Color color, FontWeight fontWeight, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, color, fontWeight);
        }

        /* renamed from: copy-8wvRk98$default, reason: not valid java name */
        public static /* synthetic */ Row m16251copy8wvRk98$default(Row row, String str, String str2, boolean z, Color color, FontWeight fontWeight, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.title;
            }
            if ((i & 2) != 0) {
                str2 = row.value;
            }
            if ((i & 4) != 0) {
                z = row.isHighlighted;
            }
            if ((i & 8) != 0) {
                color = row.textColor;
            }
            if ((i & 16) != 0) {
                fontWeight = row.unselectedRowFontWeight;
            }
            FontWeight fontWeight2 = fontWeight;
            boolean z2 = z;
            return row.m16253copy8wvRk98(str, str2, z2, color, fontWeight2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsHighlighted() {
            return this.isHighlighted;
        }

        /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getTextColor() {
            return this.textColor;
        }

        /* renamed from: component5, reason: from getter */
        public final FontWeight getUnselectedRowFontWeight() {
            return this.unselectedRowFontWeight;
        }

        /* renamed from: copy-8wvRk98, reason: not valid java name */
        public final Row m16253copy8wvRk98(String title, String value, boolean isHighlighted, Color textColor, FontWeight unselectedRowFontWeight) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unselectedRowFontWeight, "unselectedRowFontWeight");
            return new Row(title, value, isHighlighted, textColor, unselectedRowFontWeight, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.value, row.value) && this.isHighlighted == row.isHighlighted && Intrinsics.areEqual(this.textColor, row.textColor) && Intrinsics.areEqual(this.unselectedRowFontWeight, row.unselectedRowFontWeight);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isHighlighted)) * 31;
            Color color = this.textColor;
            return ((iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()))) * 31) + this.unselectedRowFontWeight.hashCode();
        }

        public String toString() {
            return "Row(title=" + this.title + ", value=" + this.value + ", isHighlighted=" + this.isHighlighted + ", textColor=" + this.textColor + ", unselectedRowFontWeight=" + this.unselectedRowFontWeight + ")";
        }

        private Row(String title, String value, boolean z, Color color, FontWeight unselectedRowFontWeight) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unselectedRowFontWeight, "unselectedRowFontWeight");
            this.title = title;
            this.value = value;
            this.isHighlighted = z;
            this.textColor = color;
            this.unselectedRowFontWeight = unselectedRowFontWeight;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getValue() {
            return this.value;
        }

        public final boolean isHighlighted() {
            return this.isHighlighted;
        }

        /* renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
        public final Color m16254getTextColorQN2ZGVo() {
            return this.textColor;
        }

        public /* synthetic */ Row(String str, String str2, boolean z, Color color, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : color, (i & 16) != 0 ? FontWeight.INSTANCE.getBold() : fontWeight, null);
        }

        public final FontWeight getUnselectedRowFontWeight() {
            return this.unselectedRowFontWeight;
        }
    }

    /* compiled from: MarginUpgradeRatesVisualState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$Footer;", "", "title", "", "isGold", "", "<init>", "(Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Footer {
        public static final int $stable = 0;
        private final boolean isGold;
        private final String title;

        public static /* synthetic */ Footer copy$default(Footer footer, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = footer.title;
            }
            if ((i & 2) != 0) {
                z = footer.isGold;
            }
            return footer.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        public final Footer copy(String title, boolean isGold) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Footer(title, isGold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.areEqual(this.title, footer.title) && this.isGold == footer.isGold;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + Boolean.hashCode(this.isGold);
        }

        public String toString() {
            return "Footer(title=" + this.title + ", isGold=" + this.isGold + ")";
        }

        public Footer(String title, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.isGold = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean isGold() {
            return this.isGold;
        }
    }

    /* compiled from: MarginUpgradeRatesVisualState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "", "SolidColorBackground", "OpacityReducedBackgroundWithBorder", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$SolidColorBackground;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface HighlightRowStyle {

        /* compiled from: MarginUpgradeRatesVisualState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$SolidColorBackground;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$SolidColorBackground;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SolidColorBackground implements HighlightRowStyle {
            public static final int $stable = 0;
            private final long backgroundColor;

            public /* synthetic */ SolidColorBackground(long j, DefaultConstructorMarker defaultConstructorMarker) {
                this(j);
            }

            /* renamed from: copy-8_81llA$default, reason: not valid java name */
            public static /* synthetic */ SolidColorBackground m16247copy8_81llA$default(SolidColorBackground solidColorBackground, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = solidColorBackground.backgroundColor;
                }
                return solidColorBackground.m16249copy8_81llA(j);
            }

            /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: copy-8_81llA, reason: not valid java name */
            public final SolidColorBackground m16249copy8_81llA(long backgroundColor) {
                return new SolidColorBackground(backgroundColor, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SolidColorBackground) && Color.m6707equalsimpl0(this.backgroundColor, ((SolidColorBackground) other).backgroundColor);
            }

            public int hashCode() {
                return Color.m6713hashCodeimpl(this.backgroundColor);
            }

            public String toString() {
                return "SolidColorBackground(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
            }

            private SolidColorBackground(long j) {
                this.backgroundColor = j;
            }

            /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
            public final long m16250getBackgroundColor0d7_KjU() {
                return this.backgroundColor;
            }
        }

        /* compiled from: MarginUpgradeRatesVisualState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "highlightColor", "highlightAnimation", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;", "<init>", "(JJLcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getHighlightColor-0d7_KjU", "getHighlightAnimation", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "copy", "copy-jxsXWHM", "(JJLcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;)Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder;", "equals", "", "other", "", "hashCode", "", "toString", "", "HighlightAnimation", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpacityReducedBackgroundWithBorder implements HighlightRowStyle {
            public static final int $stable = 8;
            private final long backgroundColor;
            private final HighlightAnimation highlightAnimation;
            private final long highlightColor;

            public /* synthetic */ OpacityReducedBackgroundWithBorder(long j, long j2, HighlightAnimation highlightAnimation, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, highlightAnimation);
            }

            /* renamed from: copy-jxsXWHM$default, reason: not valid java name */
            public static /* synthetic */ OpacityReducedBackgroundWithBorder m16241copyjxsXWHM$default(OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder, long j, long j2, HighlightAnimation highlightAnimation, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = opacityReducedBackgroundWithBorder.backgroundColor;
                }
                long j3 = j;
                if ((i & 2) != 0) {
                    j2 = opacityReducedBackgroundWithBorder.highlightColor;
                }
                long j4 = j2;
                if ((i & 4) != 0) {
                    highlightAnimation = opacityReducedBackgroundWithBorder.highlightAnimation;
                }
                return opacityReducedBackgroundWithBorder.m16244copyjxsXWHM(j3, j4, highlightAnimation);
            }

            /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
            public final long getHighlightColor() {
                return this.highlightColor;
            }

            /* renamed from: component3, reason: from getter */
            public final HighlightAnimation getHighlightAnimation() {
                return this.highlightAnimation;
            }

            /* renamed from: copy-jxsXWHM, reason: not valid java name */
            public final OpacityReducedBackgroundWithBorder m16244copyjxsXWHM(long backgroundColor, long highlightColor, HighlightAnimation highlightAnimation) {
                return new OpacityReducedBackgroundWithBorder(backgroundColor, highlightColor, highlightAnimation, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpacityReducedBackgroundWithBorder)) {
                    return false;
                }
                OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder = (OpacityReducedBackgroundWithBorder) other;
                return Color.m6707equalsimpl0(this.backgroundColor, opacityReducedBackgroundWithBorder.backgroundColor) && Color.m6707equalsimpl0(this.highlightColor, opacityReducedBackgroundWithBorder.highlightColor) && Intrinsics.areEqual(this.highlightAnimation, opacityReducedBackgroundWithBorder.highlightAnimation);
            }

            public int hashCode() {
                int iM6713hashCodeimpl = ((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.highlightColor)) * 31;
                HighlightAnimation highlightAnimation = this.highlightAnimation;
                return iM6713hashCodeimpl + (highlightAnimation == null ? 0 : highlightAnimation.hashCode());
            }

            public String toString() {
                return "OpacityReducedBackgroundWithBorder(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", highlightColor=" + Color.m6714toStringimpl(this.highlightColor) + ", highlightAnimation=" + this.highlightAnimation + ")";
            }

            private OpacityReducedBackgroundWithBorder(long j, long j2, HighlightAnimation highlightAnimation) {
                this.backgroundColor = j;
                this.highlightColor = j2;
                this.highlightAnimation = highlightAnimation;
            }

            public /* synthetic */ OpacityReducedBackgroundWithBorder(long j, long j2, HighlightAnimation highlightAnimation, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2, (i & 4) != 0 ? null : highlightAnimation, null);
            }

            /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
            public final long m16245getBackgroundColor0d7_KjU() {
                return this.backgroundColor;
            }

            /* renamed from: getHighlightColor-0d7_KjU, reason: not valid java name */
            public final long m16246getHighlightColor0d7_KjU() {
                return this.highlightColor;
            }

            public final HighlightAnimation getHighlightAnimation() {
                return this.highlightAnimation;
            }

            /* compiled from: MarginUpgradeRatesVisualState.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;", "", "MoveUpward", "MoveDownward", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveDownward;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveUpward;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public interface HighlightAnimation {

                /* compiled from: MarginUpgradeRatesVisualState.kt */
                @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveUpward;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class MoveUpward implements HighlightAnimation {
                    public static final int $stable = 0;
                    public static final MoveUpward INSTANCE = new MoveUpward();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof MoveUpward);
                    }

                    public int hashCode() {
                        return 731177801;
                    }

                    public String toString() {
                        return "MoveUpward";
                    }

                    private MoveUpward() {
                    }
                }

                /* compiled from: MarginUpgradeRatesVisualState.kt */
                @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation$MoveDownward;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesVisualState$HighlightRowStyle$OpacityReducedBackgroundWithBorder$HighlightAnimation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class MoveDownward implements HighlightAnimation {
                    public static final int $stable = 0;
                    public static final MoveDownward INSTANCE = new MoveDownward();

                    public boolean equals(Object other) {
                        return this == other || (other instanceof MoveDownward);
                    }

                    public int hashCode() {
                        return 2143844688;
                    }

                    public String toString() {
                        return "MoveDownward";
                    }

                    private MoveDownward() {
                    }
                }
            }
        }
    }
}
