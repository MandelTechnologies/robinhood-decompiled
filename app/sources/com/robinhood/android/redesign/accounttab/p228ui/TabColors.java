package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/ui/TabColors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "textColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getBorderColor-0d7_KjU", "getTextColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/robinhood/android/redesign/accounttab/ui/TabColors;", "equals", "", "other", "hashCode", "", "toString", "", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TabColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long borderColor;
    private final long textColor;

    public /* synthetic */ TabColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ TabColors m17917copyysEtTa8$default(TabColors tabColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tabColors.backgroundColor;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = tabColors.borderColor;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = tabColors.textColor;
        }
        return tabColors.m17921copyysEtTa8(j4, j5, j3);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final TabColors m17921copyysEtTa8(long backgroundColor, long borderColor, long textColor) {
        return new TabColors(backgroundColor, borderColor, textColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabColors)) {
            return false;
        }
        TabColors tabColors = (TabColors) other;
        return Color.m6707equalsimpl0(this.backgroundColor, tabColors.backgroundColor) && Color.m6707equalsimpl0(this.borderColor, tabColors.borderColor) && Color.m6707equalsimpl0(this.textColor, tabColors.textColor);
    }

    public int hashCode() {
        return (((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.borderColor)) * 31) + Color.m6713hashCodeimpl(this.textColor);
    }

    public String toString() {
        return "TabColors(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", borderColor=" + Color.m6714toStringimpl(this.borderColor) + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ")";
    }

    private TabColors(long j, long j2, long j3) {
        this.backgroundColor = j;
        this.borderColor = j2;
        this.textColor = j3;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m17922getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getBorderColor-0d7_KjU, reason: not valid java name */
    public final long m17923getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m17924getTextColor0d7_KjU() {
        return this.textColor;
    }
}
