package com.robinhood.android.screener.p248ui;

import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerRows.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows;", "", "<init>", "()V", "ScreenerHeader", "ToggleTruncatedRow", "ScreenerRow", "LoadingRow", "PaddingRow", "Lcom/robinhood/android/screener/ui/ScreenerRows$LoadingRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows$PaddingRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows$ToggleTruncatedRow;", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class ScreenerRows {
    public static final int $stable = 0;

    public /* synthetic */ ScreenerRows(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScreenerRows() {
    }

    /* compiled from: ScreenerRows.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "displayTitleRes", "", "actionButtonTextRes", "defaultScreenerId", "", "<init>", "(IILjava/lang/String;)V", "getDisplayTitleRes", "()I", "getActionButtonTextRes", "getDefaultScreenerId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScreenerHeader extends ScreenerRows {
        public static final int $stable = 0;
        private final int actionButtonTextRes;
        private final String defaultScreenerId;
        private final int displayTitleRes;

        public static /* synthetic */ ScreenerHeader copy$default(ScreenerHeader screenerHeader, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = screenerHeader.displayTitleRes;
            }
            if ((i3 & 2) != 0) {
                i2 = screenerHeader.actionButtonTextRes;
            }
            if ((i3 & 4) != 0) {
                str = screenerHeader.defaultScreenerId;
            }
            return screenerHeader.copy(i, i2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDisplayTitleRes() {
            return this.displayTitleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getActionButtonTextRes() {
            return this.actionButtonTextRes;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDefaultScreenerId() {
            return this.defaultScreenerId;
        }

        public final ScreenerHeader copy(int displayTitleRes, int actionButtonTextRes, String defaultScreenerId) {
            return new ScreenerHeader(displayTitleRes, actionButtonTextRes, defaultScreenerId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenerHeader)) {
                return false;
            }
            ScreenerHeader screenerHeader = (ScreenerHeader) other;
            return this.displayTitleRes == screenerHeader.displayTitleRes && this.actionButtonTextRes == screenerHeader.actionButtonTextRes && Intrinsics.areEqual(this.defaultScreenerId, screenerHeader.defaultScreenerId);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.displayTitleRes) * 31) + Integer.hashCode(this.actionButtonTextRes)) * 31;
            String str = this.defaultScreenerId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ScreenerHeader(displayTitleRes=" + this.displayTitleRes + ", actionButtonTextRes=" + this.actionButtonTextRes + ", defaultScreenerId=" + this.defaultScreenerId + ")";
        }

        public final int getDisplayTitleRes() {
            return this.displayTitleRes;
        }

        public final int getActionButtonTextRes() {
            return this.actionButtonTextRes;
        }

        public final String getDefaultScreenerId() {
            return this.defaultScreenerId;
        }

        public ScreenerHeader(int i, int i2, String str) {
            super(null);
            this.displayTitleRes = i;
            this.actionButtonTextRes = i2;
            this.defaultScreenerId = str;
        }
    }

    /* compiled from: ScreenerRows.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows$ToggleTruncatedRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "truncated", "", "displayTitleRes", "", "<init>", "(ZI)V", "getTruncated", "()Z", "getDisplayTitleRes", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ToggleTruncatedRow extends ScreenerRows {
        public static final int $stable = 0;
        private final int displayTitleRes;
        private final boolean truncated;

        public static /* synthetic */ ToggleTruncatedRow copy$default(ToggleTruncatedRow toggleTruncatedRow, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = toggleTruncatedRow.truncated;
            }
            if ((i2 & 2) != 0) {
                i = toggleTruncatedRow.displayTitleRes;
            }
            return toggleTruncatedRow.copy(z, i);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTruncated() {
            return this.truncated;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDisplayTitleRes() {
            return this.displayTitleRes;
        }

        public final ToggleTruncatedRow copy(boolean truncated, int displayTitleRes) {
            return new ToggleTruncatedRow(truncated, displayTitleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToggleTruncatedRow)) {
                return false;
            }
            ToggleTruncatedRow toggleTruncatedRow = (ToggleTruncatedRow) other;
            return this.truncated == toggleTruncatedRow.truncated && this.displayTitleRes == toggleTruncatedRow.displayTitleRes;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.truncated) * 31) + Integer.hashCode(this.displayTitleRes);
        }

        public String toString() {
            return "ToggleTruncatedRow(truncated=" + this.truncated + ", displayTitleRes=" + this.displayTitleRes + ")";
        }

        public final boolean getTruncated() {
            return this.truncated;
        }

        public final int getDisplayTitleRes() {
            return this.displayTitleRes;
        }

        public ToggleTruncatedRow(boolean z, int i) {
            super(null);
            this.truncated = z;
            this.displayTitleRes = i;
        }
    }

    /* compiled from: ScreenerRows.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "id", "", "displayName", "iconString", "isPreset", "", "subtitleText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "(Lcom/robinhood/equityscreener/models/db/Screener;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getIconString", "()Z", "getSubtitleText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScreenerRow extends ScreenerRows {
        public static final int $stable = 0;
        private final String displayName;
        private final String iconString;
        private final String id;
        private final boolean isPreset;
        private final String subtitleText;

        public static /* synthetic */ ScreenerRow copy$default(ScreenerRow screenerRow, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = screenerRow.id;
            }
            if ((i & 2) != 0) {
                str2 = screenerRow.displayName;
            }
            if ((i & 4) != 0) {
                str3 = screenerRow.iconString;
            }
            if ((i & 8) != 0) {
                z = screenerRow.isPreset;
            }
            if ((i & 16) != 0) {
                str4 = screenerRow.subtitleText;
            }
            String str5 = str4;
            String str6 = str3;
            return screenerRow.copy(str, str2, str6, z, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconString() {
            return this.iconString;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPreset() {
            return this.isPreset;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubtitleText() {
            return this.subtitleText;
        }

        public final ScreenerRow copy(String id, String displayName, String iconString, boolean isPreset, String subtitleText) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new ScreenerRow(id, displayName, iconString, isPreset, subtitleText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenerRow)) {
                return false;
            }
            ScreenerRow screenerRow = (ScreenerRow) other;
            return Intrinsics.areEqual(this.id, screenerRow.id) && Intrinsics.areEqual(this.displayName, screenerRow.displayName) && Intrinsics.areEqual(this.iconString, screenerRow.iconString) && this.isPreset == screenerRow.isPreset && Intrinsics.areEqual(this.subtitleText, screenerRow.subtitleText);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31;
            String str = this.iconString;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPreset)) * 31;
            String str2 = this.subtitleText;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ScreenerRow(id=" + this.id + ", displayName=" + this.displayName + ", iconString=" + this.iconString + ", isPreset=" + this.isPreset + ", subtitleText=" + this.subtitleText + ")";
        }

        public /* synthetic */ ScreenerRow(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, (i & 16) != 0 ? null : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getIconString() {
            return this.iconString;
        }

        public final boolean isPreset() {
            return this.isPreset;
        }

        public final String getSubtitleText() {
            return this.subtitleText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenerRow(String id, String displayName, String str, boolean z, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.id = id;
            this.displayName = displayName;
            this.iconString = str;
            this.isPreset = z;
            this.subtitleText = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ScreenerRow(Screener screener) {
            String iconEmoji;
            String str;
            Map<String, String> map;
            Intrinsics.checkNotNullParameter(screener, "screener");
            String id = screener.getId();
            String displayName = screener.getDisplayName();
            if (screener.isPreset()) {
                Map<String, Map<String, String>> assetUrls = screener.getAssetUrls();
                if (assetUrls == null || (map = assetUrls.get("48x64")) == null) {
                    str = null;
                    this(id, displayName, str, screener.isPreset(), screener.isPreset() ? screener.getDisplayDescription() : null);
                }
                iconEmoji = map.get("svg");
            } else {
                iconEmoji = screener.getIconEmoji();
            }
            str = iconEmoji;
            this(id, displayName, str, screener.isPreset(), screener.isPreset() ? screener.getDisplayDescription() : null);
        }
    }

    /* compiled from: ScreenerRows.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows$LoadingRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "<init>", "()V", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingRow extends ScreenerRows {
        public static final int $stable = 0;
        public static final LoadingRow INSTANCE = new LoadingRow();

        private LoadingRow() {
            super(null);
        }
    }

    /* compiled from: ScreenerRows.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/ScreenerRows$PaddingRow;", "Lcom/robinhood/android/screener/ui/ScreenerRows;", "<init>", "()V", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaddingRow extends ScreenerRows {
        public static final int $stable = 0;
        public static final PaddingRow INSTANCE = new PaddingRow();

        private PaddingRow() {
            super(null);
        }
    }
}
