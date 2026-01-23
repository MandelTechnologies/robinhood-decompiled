package com.robinhood.android.widget.util;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.widget.C31480R;
import com.robinhood.enums.moshi.EnumJsonAdapter;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* compiled from: PortfolioWidgetInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004;<=>Bu\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003Jw\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0013\u00106\u001a\u00020'2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u000eHÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010$\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo;", "", "updatePeriod", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$UpdatePeriod;", "displayedCrypto", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;", "displayedOption", "displayedEquity", "displayedFutures", "displayedLists", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedLists;", "viewOption", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$ViewOption;", "minWidth", "", "minHeight", "maxWidth", "maxHeight", "<init>", "(Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$UpdatePeriod;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedLists;Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$ViewOption;IIII)V", "getUpdatePeriod", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$UpdatePeriod;", "getDisplayedCrypto", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;", "getDisplayedOption", "getDisplayedEquity", "getDisplayedFutures", "getDisplayedLists", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedLists;", "getViewOption", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$ViewOption;", "getMinWidth", "()I", "getMinHeight", "getMaxWidth", "getMaxHeight", "widthCellsEstimation", "getWidthCellsEstimation", "showCuratedLists", "", "getShowCuratedLists", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "UpdatePeriod", "DisplayedSecurity", "DisplayedLists", "ViewOption", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PortfolioWidgetInfo {
    private final DisplayedSecurity displayedCrypto;
    private final DisplayedSecurity displayedEquity;
    private final DisplayedSecurity displayedFutures;
    private final DisplayedLists displayedLists;
    private final DisplayedSecurity displayedOption;
    private final int maxHeight;
    private final int maxWidth;
    private final int minHeight;
    private final int minWidth;
    private final UpdatePeriod updatePeriod;
    private final ViewOption viewOption;

    public PortfolioWidgetInfo() {
        this(null, null, null, null, null, null, null, 0, 0, 0, 0, 2047, null);
    }

    public static /* synthetic */ PortfolioWidgetInfo copy$default(PortfolioWidgetInfo portfolioWidgetInfo, UpdatePeriod updatePeriod, DisplayedSecurity displayedSecurity, DisplayedSecurity displayedSecurity2, DisplayedSecurity displayedSecurity3, DisplayedSecurity displayedSecurity4, DisplayedLists displayedLists, ViewOption viewOption, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            updatePeriod = portfolioWidgetInfo.updatePeriod;
        }
        if ((i5 & 2) != 0) {
            displayedSecurity = portfolioWidgetInfo.displayedCrypto;
        }
        if ((i5 & 4) != 0) {
            displayedSecurity2 = portfolioWidgetInfo.displayedOption;
        }
        if ((i5 & 8) != 0) {
            displayedSecurity3 = portfolioWidgetInfo.displayedEquity;
        }
        if ((i5 & 16) != 0) {
            displayedSecurity4 = portfolioWidgetInfo.displayedFutures;
        }
        if ((i5 & 32) != 0) {
            displayedLists = portfolioWidgetInfo.displayedLists;
        }
        if ((i5 & 64) != 0) {
            viewOption = portfolioWidgetInfo.viewOption;
        }
        if ((i5 & 128) != 0) {
            i = portfolioWidgetInfo.minWidth;
        }
        if ((i5 & 256) != 0) {
            i2 = portfolioWidgetInfo.minHeight;
        }
        if ((i5 & 512) != 0) {
            i3 = portfolioWidgetInfo.maxWidth;
        }
        if ((i5 & 1024) != 0) {
            i4 = portfolioWidgetInfo.maxHeight;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        int i9 = i2;
        DisplayedLists displayedLists2 = displayedLists;
        ViewOption viewOption2 = viewOption;
        DisplayedSecurity displayedSecurity5 = displayedSecurity4;
        DisplayedSecurity displayedSecurity6 = displayedSecurity2;
        return portfolioWidgetInfo.copy(updatePeriod, displayedSecurity, displayedSecurity6, displayedSecurity3, displayedSecurity5, displayedLists2, viewOption2, i8, i9, i6, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final UpdatePeriod getUpdatePeriod() {
        return this.updatePeriod;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplayedSecurity getDisplayedCrypto() {
        return this.displayedCrypto;
    }

    /* renamed from: component3, reason: from getter */
    public final DisplayedSecurity getDisplayedOption() {
        return this.displayedOption;
    }

    /* renamed from: component4, reason: from getter */
    public final DisplayedSecurity getDisplayedEquity() {
        return this.displayedEquity;
    }

    /* renamed from: component5, reason: from getter */
    public final DisplayedSecurity getDisplayedFutures() {
        return this.displayedFutures;
    }

    /* renamed from: component6, reason: from getter */
    public final DisplayedLists getDisplayedLists() {
        return this.displayedLists;
    }

    /* renamed from: component7, reason: from getter */
    public final ViewOption getViewOption() {
        return this.viewOption;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMinHeight() {
        return this.minHeight;
    }

    public final PortfolioWidgetInfo copy(@Json(name = "update_period") UpdatePeriod updatePeriod, @Json(name = "displayed_crypto") DisplayedSecurity displayedCrypto, @Json(name = "displayed_option") DisplayedSecurity displayedOption, @Json(name = "displayed_equity") DisplayedSecurity displayedEquity, @Json(name = "displayed_futures") DisplayedSecurity displayedFutures, @Json(name = "displayed_lists") DisplayedLists displayedLists, @Json(name = "view_option") ViewOption viewOption, @Json(name = "min_width") int minWidth, @Json(name = "min_height") int minHeight, @Json(name = "max_width") int maxWidth, @Json(name = "max_height") int maxHeight) {
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        Intrinsics.checkNotNullParameter(displayedCrypto, "displayedCrypto");
        Intrinsics.checkNotNullParameter(displayedOption, "displayedOption");
        Intrinsics.checkNotNullParameter(displayedEquity, "displayedEquity");
        Intrinsics.checkNotNullParameter(displayedFutures, "displayedFutures");
        Intrinsics.checkNotNullParameter(displayedLists, "displayedLists");
        Intrinsics.checkNotNullParameter(viewOption, "viewOption");
        return new PortfolioWidgetInfo(updatePeriod, displayedCrypto, displayedOption, displayedEquity, displayedFutures, displayedLists, viewOption, minWidth, minHeight, maxWidth, maxHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PortfolioWidgetInfo)) {
            return false;
        }
        PortfolioWidgetInfo portfolioWidgetInfo = (PortfolioWidgetInfo) other;
        return this.updatePeriod == portfolioWidgetInfo.updatePeriod && this.displayedCrypto == portfolioWidgetInfo.displayedCrypto && this.displayedOption == portfolioWidgetInfo.displayedOption && this.displayedEquity == portfolioWidgetInfo.displayedEquity && this.displayedFutures == portfolioWidgetInfo.displayedFutures && this.displayedLists == portfolioWidgetInfo.displayedLists && this.viewOption == portfolioWidgetInfo.viewOption && this.minWidth == portfolioWidgetInfo.minWidth && this.minHeight == portfolioWidgetInfo.minHeight && this.maxWidth == portfolioWidgetInfo.maxWidth && this.maxHeight == portfolioWidgetInfo.maxHeight;
    }

    public int hashCode() {
        return (((((((((((((((((((this.updatePeriod.hashCode() * 31) + this.displayedCrypto.hashCode()) * 31) + this.displayedOption.hashCode()) * 31) + this.displayedEquity.hashCode()) * 31) + this.displayedFutures.hashCode()) * 31) + this.displayedLists.hashCode()) * 31) + this.viewOption.hashCode()) * 31) + Integer.hashCode(this.minWidth)) * 31) + Integer.hashCode(this.minHeight)) * 31) + Integer.hashCode(this.maxWidth)) * 31) + Integer.hashCode(this.maxHeight);
    }

    public String toString() {
        return "PortfolioWidgetInfo(updatePeriod=" + this.updatePeriod + ", displayedCrypto=" + this.displayedCrypto + ", displayedOption=" + this.displayedOption + ", displayedEquity=" + this.displayedEquity + ", displayedFutures=" + this.displayedFutures + ", displayedLists=" + this.displayedLists + ", viewOption=" + this.viewOption + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ")";
    }

    public PortfolioWidgetInfo(@Json(name = "update_period") UpdatePeriod updatePeriod, @Json(name = "displayed_crypto") DisplayedSecurity displayedCrypto, @Json(name = "displayed_option") DisplayedSecurity displayedOption, @Json(name = "displayed_equity") DisplayedSecurity displayedEquity, @Json(name = "displayed_futures") DisplayedSecurity displayedFutures, @Json(name = "displayed_lists") DisplayedLists displayedLists, @Json(name = "view_option") ViewOption viewOption, @Json(name = "min_width") int i, @Json(name = "min_height") int i2, @Json(name = "max_width") int i3, @Json(name = "max_height") int i4) {
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        Intrinsics.checkNotNullParameter(displayedCrypto, "displayedCrypto");
        Intrinsics.checkNotNullParameter(displayedOption, "displayedOption");
        Intrinsics.checkNotNullParameter(displayedEquity, "displayedEquity");
        Intrinsics.checkNotNullParameter(displayedFutures, "displayedFutures");
        Intrinsics.checkNotNullParameter(displayedLists, "displayedLists");
        Intrinsics.checkNotNullParameter(viewOption, "viewOption");
        this.updatePeriod = updatePeriod;
        this.displayedCrypto = displayedCrypto;
        this.displayedOption = displayedOption;
        this.displayedEquity = displayedEquity;
        this.displayedFutures = displayedFutures;
        this.displayedLists = displayedLists;
        this.viewOption = viewOption;
        this.minWidth = i;
        this.minHeight = i2;
        this.maxWidth = i3;
        this.maxHeight = i4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PortfolioWidgetInfo(com.robinhood.android.widget.util.PortfolioWidgetInfo.UpdatePeriod r2, com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity r3, com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity r4, com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity r5, com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity r6, com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedLists r7, com.robinhood.android.widget.util.PortfolioWidgetInfo.ViewOption r8, int r9, int r10, int r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.robinhood.android.widget.util.PortfolioWidgetInfo$UpdatePeriod r2 = com.robinhood.android.widget.util.PortfolioWidgetInfo.UpdatePeriod.ONE_HOUR
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity r3 = com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity.POSITIONS
        Lc:
            r14 = r13 & 4
            if (r14 == 0) goto L12
            com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity r4 = com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity.NONE
        L12:
            r14 = r13 & 8
            if (r14 == 0) goto L18
            com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity r5 = com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity.POSITIONS
        L18:
            r14 = r13 & 16
            if (r14 == 0) goto L1e
            com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity r6 = com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedSecurity.POSITIONS
        L1e:
            r14 = r13 & 32
            if (r14 == 0) goto L24
            com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedLists r7 = com.robinhood.android.widget.util.PortfolioWidgetInfo.DisplayedLists.NONE
        L24:
            r14 = r13 & 64
            if (r14 == 0) goto L2a
            com.robinhood.android.widget.util.PortfolioWidgetInfo$ViewOption r8 = com.robinhood.android.widget.util.PortfolioWidgetInfo.ViewOption.QUOTE
        L2a:
            r14 = r13 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r14 == 0) goto L30
            r9 = r0
        L30:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L35
            r10 = r0
        L35:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L3a
            r11 = r0
        L3a:
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L4b
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L57
        L4b:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L57:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.widget.util.PortfolioWidgetInfo.<init>(com.robinhood.android.widget.util.PortfolioWidgetInfo$UpdatePeriod, com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity, com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity, com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity, com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedSecurity, com.robinhood.android.widget.util.PortfolioWidgetInfo$DisplayedLists, com.robinhood.android.widget.util.PortfolioWidgetInfo$ViewOption, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UpdatePeriod getUpdatePeriod() {
        return this.updatePeriod;
    }

    public final DisplayedSecurity getDisplayedCrypto() {
        return this.displayedCrypto;
    }

    public final DisplayedSecurity getDisplayedOption() {
        return this.displayedOption;
    }

    public final DisplayedSecurity getDisplayedEquity() {
        return this.displayedEquity;
    }

    public final DisplayedSecurity getDisplayedFutures() {
        return this.displayedFutures;
    }

    public final DisplayedLists getDisplayedLists() {
        return this.displayedLists;
    }

    public final ViewOption getViewOption() {
        return this.viewOption;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getWidthCellsEstimation() {
        return (int) Math.floor((this.minWidth + 30) / 70.0f);
    }

    public final boolean getShowCuratedLists() {
        return this.displayedLists == DisplayedLists.ALL;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioWidgetInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$UpdatePeriod;", "", "displayNameResId", "", "value", "", "<init>", "(Ljava/lang/String;IIJ)V", "getDisplayNameResId", "()I", "getValue", "()J", "ONE_HOUR", "THIRTY_MINUTES", "FIFTEEN_MINUTES", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdatePeriod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpdatePeriod[] $VALUES;
        private final int displayNameResId;
        private final long value;
        public static final UpdatePeriod ONE_HOUR = new UpdatePeriod("ONE_HOUR", 0, C31480R.string.widget_portfolio_refresh_period_1_hour, 3600000);
        public static final UpdatePeriod THIRTY_MINUTES = new UpdatePeriod("THIRTY_MINUTES", 1, C31480R.string.widget_portfolio_refresh_period_30_minutes, 1800000);
        public static final UpdatePeriod FIFTEEN_MINUTES = new UpdatePeriod("FIFTEEN_MINUTES", 2, C31480R.string.widget_portfolio_refresh_period_15_minutes, 900000);

        private static final /* synthetic */ UpdatePeriod[] $values() {
            return new UpdatePeriod[]{ONE_HOUR, THIRTY_MINUTES, FIFTEEN_MINUTES};
        }

        public static EnumEntries<UpdatePeriod> getEntries() {
            return $ENTRIES;
        }

        private UpdatePeriod(String str, int i, int i2, long j) {
            this.displayNameResId = i2;
            this.value = j;
        }

        public final int getDisplayNameResId() {
            return this.displayNameResId;
        }

        public final long getValue() {
            return this.value;
        }

        static {
            UpdatePeriod[] updatePeriodArr$values = $values();
            $VALUES = updatePeriodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(updatePeriodArr$values);
        }

        public static UpdatePeriod valueOf(String str) {
            return (UpdatePeriod) Enum.valueOf(UpdatePeriod.class, str);
        }

        public static UpdatePeriod[] values() {
            return (UpdatePeriod[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioWidgetInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity;", "", "displayNameResId", "", "<init>", "(Ljava/lang/String;II)V", "getDisplayNameResId", "()I", "NONE", "POSITIONS", "AdapterModule", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayedSecurity {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayedSecurity[] $VALUES;
        public static final DisplayedSecurity NONE = new DisplayedSecurity("NONE", 0, C31480R.string.widget_portfolio_security_none);
        public static final DisplayedSecurity POSITIONS = new DisplayedSecurity("POSITIONS", 1, C31480R.string.widget_portfolio_security_positions);
        private final int displayNameResId;

        private static final /* synthetic */ DisplayedSecurity[] $values() {
            return new DisplayedSecurity[]{NONE, POSITIONS};
        }

        public static EnumEntries<DisplayedSecurity> getEntries() {
            return $ENTRIES;
        }

        private DisplayedSecurity(String str, int i, int i2) {
            this.displayNameResId = i2;
        }

        public final int getDisplayNameResId() {
            return this.displayNameResId;
        }

        static {
            DisplayedSecurity[] displayedSecurityArr$values = $values();
            $VALUES = displayedSecurityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(displayedSecurityArr$values);
        }

        /* compiled from: PortfolioWidgetInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedSecurity$AdapterModule;", "", "<init>", "()V", "provideAdapter", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class AdapterModule {
            public static final AdapterModule INSTANCE = new AdapterModule();

            private AdapterModule() {
            }

            public final JsonAdapterBinding provideAdapter() {
                JsonAdapterBinding.Companion companion = JsonAdapterBinding.INSTANCE;
                return new JsonAdapterBinding(ReflectJvmMapping.getJavaType(Reflection.typeOf(DisplayedSecurity.class)), new EnumJsonAdapter(DisplayedSecurity.class, DisplayedSecurity.POSITIONS));
            }
        }

        public static DisplayedSecurity valueOf(String str) {
            return (DisplayedSecurity) Enum.valueOf(DisplayedSecurity.class, str);
        }

        public static DisplayedSecurity[] values() {
            return (DisplayedSecurity[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioWidgetInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$DisplayedLists;", "", "displayNameResId", "", "<init>", "(Ljava/lang/String;II)V", "getDisplayNameResId", "()I", "NONE", DisplaySpans.ALL, "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayedLists {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayedLists[] $VALUES;
        private final int displayNameResId;
        public static final DisplayedLists NONE = new DisplayedLists("NONE", 0, C31480R.string.widget_portfolio_curated_lists_none);
        public static final DisplayedLists ALL = new DisplayedLists(DisplaySpans.ALL, 1, C31480R.string.widget_portfolio_curated_lists_all);

        private static final /* synthetic */ DisplayedLists[] $values() {
            return new DisplayedLists[]{NONE, ALL};
        }

        public static EnumEntries<DisplayedLists> getEntries() {
            return $ENTRIES;
        }

        private DisplayedLists(String str, int i, int i2) {
            this.displayNameResId = i2;
        }

        public final int getDisplayNameResId() {
            return this.displayNameResId;
        }

        static {
            DisplayedLists[] displayedListsArr$values = $values();
            $VALUES = displayedListsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(displayedListsArr$values);
        }

        public static DisplayedLists valueOf(String str) {
            return (DisplayedLists) Enum.valueOf(DisplayedLists.class, str);
        }

        public static DisplayedLists[] values() {
            return (DisplayedLists[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PortfolioWidgetInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/widget/util/PortfolioWidgetInfo$ViewOption;", "", "displayNameResId", "", "<init>", "(Ljava/lang/String;II)V", "getDisplayNameResId", "()I", "QUOTE", "EQUITY", "CHANGE", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewOption[] $VALUES;
        private final int displayNameResId;
        public static final ViewOption QUOTE = new ViewOption("QUOTE", 0, C31480R.string.widget_portfolio_view_option_quote);
        public static final ViewOption EQUITY = new ViewOption("EQUITY", 1, C31480R.string.widget_portfolio_view_option_equity);
        public static final ViewOption CHANGE = new ViewOption("CHANGE", 2, C31480R.string.widget_portfolio_view_option_change);

        private static final /* synthetic */ ViewOption[] $values() {
            return new ViewOption[]{QUOTE, EQUITY, CHANGE};
        }

        public static EnumEntries<ViewOption> getEntries() {
            return $ENTRIES;
        }

        private ViewOption(String str, int i, int i2) {
            this.displayNameResId = i2;
        }

        public final int getDisplayNameResId() {
            return this.displayNameResId;
        }

        static {
            ViewOption[] viewOptionArr$values = $values();
            $VALUES = viewOptionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewOptionArr$values);
        }

        public static ViewOption valueOf(String str) {
            return (ViewOption) Enum.valueOf(ViewOption.class, str);
        }

        public static ViewOption[] values() {
            return (ViewOption[]) $VALUES.clone();
        }
    }
}
