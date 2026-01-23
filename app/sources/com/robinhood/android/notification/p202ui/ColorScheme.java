package com.robinhood.android.notification.p202ui;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ProductUpsellScreen.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\fJ\t\u0010\u001b\u001a\u00020\bHÆ\u0003JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/notification/ui/ColorScheme;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "statusBarColor", "loadingStatusBarColor", "dividerColor", "useDarkIcons", "", "<init>", "(JJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getStatusBarColor-0d7_KjU", "getLoadingStatusBarColor-0d7_KjU", "getDividerColor-0d7_KjU", "getUseDarkIcons", "()Z", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "copy", "copy-gPfMexM", "(JJJJZ)Lcom/robinhood/android/notification/ui/ColorScheme;", "equals", "other", "hashCode", "", "toString", "", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ColorScheme {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long dividerColor;
    private final long loadingStatusBarColor;
    private final long statusBarColor;
    private final boolean useDarkIcons;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z);
    }

    /* renamed from: copy-gPfMexM$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m16755copygPfMexM$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorScheme.backgroundColor;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = colorScheme.statusBarColor;
        }
        return colorScheme.m16760copygPfMexM(j5, j2, (i & 4) != 0 ? colorScheme.loadingStatusBarColor : j3, (i & 8) != 0 ? colorScheme.dividerColor : j4, (i & 16) != 0 ? colorScheme.useDarkIcons : z);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getStatusBarColor() {
        return this.statusBarColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getLoadingStatusBarColor() {
        return this.loadingStatusBarColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseDarkIcons() {
        return this.useDarkIcons;
    }

    /* renamed from: copy-gPfMexM, reason: not valid java name */
    public final ColorScheme m16760copygPfMexM(long backgroundColor, long statusBarColor, long loadingStatusBarColor, long dividerColor, boolean useDarkIcons) {
        return new ColorScheme(backgroundColor, statusBarColor, loadingStatusBarColor, dividerColor, useDarkIcons, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) other;
        return Color.m6707equalsimpl0(this.backgroundColor, colorScheme.backgroundColor) && Color.m6707equalsimpl0(this.statusBarColor, colorScheme.statusBarColor) && Color.m6707equalsimpl0(this.loadingStatusBarColor, colorScheme.loadingStatusBarColor) && Color.m6707equalsimpl0(this.dividerColor, colorScheme.dividerColor) && this.useDarkIcons == colorScheme.useDarkIcons;
    }

    public int hashCode() {
        return (((((((Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.statusBarColor)) * 31) + Color.m6713hashCodeimpl(this.loadingStatusBarColor)) * 31) + Color.m6713hashCodeimpl(this.dividerColor)) * 31) + Boolean.hashCode(this.useDarkIcons);
    }

    public String toString() {
        return "ColorScheme(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", statusBarColor=" + Color.m6714toStringimpl(this.statusBarColor) + ", loadingStatusBarColor=" + Color.m6714toStringimpl(this.loadingStatusBarColor) + ", dividerColor=" + Color.m6714toStringimpl(this.dividerColor) + ", useDarkIcons=" + this.useDarkIcons + ")";
    }

    private ColorScheme(long j, long j2, long j3, long j4, boolean z) {
        this.backgroundColor = j;
        this.statusBarColor = j2;
        this.loadingStatusBarColor = j3;
        this.dividerColor = j4;
        this.useDarkIcons = z;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m16761getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getStatusBarColor-0d7_KjU, reason: not valid java name */
    public final long m16764getStatusBarColor0d7_KjU() {
        return this.statusBarColor;
    }

    /* renamed from: getLoadingStatusBarColor-0d7_KjU, reason: not valid java name */
    public final long m16763getLoadingStatusBarColor0d7_KjU() {
        return this.loadingStatusBarColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m16762getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final boolean getUseDarkIcons() {
        return this.useDarkIcons;
    }
}
