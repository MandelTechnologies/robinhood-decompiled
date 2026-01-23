package com.robinhood.android.dashboard.sweep;

import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepSectionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData;", "", "content", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash$Dialog;", "accountNumber", "", ResourceTypes.STYLE, "Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData$Style;", "showSweepSettings", "", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepSplash$Dialog;Ljava/lang/String;Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData$Style;Z)V", "getContent", "()Lcom/robinhood/models/api/bonfire/ApiSweepSplash$Dialog;", "getAccountNumber", "()Ljava/lang/String;", "getStyle", "()Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData$Style;", "getShowSweepSettings", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Style", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SweepSectionDialogData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ApiSweepSplash.Dialog content;
    private final boolean showSweepSettings;
    private final Style style;

    public static /* synthetic */ SweepSectionDialogData copy$default(SweepSectionDialogData sweepSectionDialogData, ApiSweepSplash.Dialog dialog, String str, Style style, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dialog = sweepSectionDialogData.content;
        }
        if ((i & 2) != 0) {
            str = sweepSectionDialogData.accountNumber;
        }
        if ((i & 4) != 0) {
            style = sweepSectionDialogData.style;
        }
        if ((i & 8) != 0) {
            z = sweepSectionDialogData.showSweepSettings;
        }
        return sweepSectionDialogData.copy(dialog, str, style, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiSweepSplash.Dialog getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSweepSettings() {
        return this.showSweepSettings;
    }

    public final SweepSectionDialogData copy(ApiSweepSplash.Dialog content, String accountNumber, Style style, boolean showSweepSettings) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(style, "style");
        return new SweepSectionDialogData(content, accountNumber, style, showSweepSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepSectionDialogData)) {
            return false;
        }
        SweepSectionDialogData sweepSectionDialogData = (SweepSectionDialogData) other;
        return Intrinsics.areEqual(this.content, sweepSectionDialogData.content) && Intrinsics.areEqual(this.accountNumber, sweepSectionDialogData.accountNumber) && this.style == sweepSectionDialogData.style && this.showSweepSettings == sweepSectionDialogData.showSweepSettings;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        String str = this.accountNumber;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.style.hashCode()) * 31) + Boolean.hashCode(this.showSweepSettings);
    }

    public String toString() {
        return "SweepSectionDialogData(content=" + this.content + ", accountNumber=" + this.accountNumber + ", style=" + this.style + ", showSweepSettings=" + this.showSweepSettings + ")";
    }

    public SweepSectionDialogData(ApiSweepSplash.Dialog content, String str, Style style, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(style, "style");
        this.content = content;
        this.accountNumber = str;
        this.style = style;
        this.showSweepSettings = z;
    }

    public final ApiSweepSplash.Dialog getContent() {
        return this.content;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ SweepSectionDialogData(ApiSweepSplash.Dialog dialog, String str, Style style, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dialog, str, (i & 4) != 0 ? Style.BOTTOM_SHEET : style, (i & 8) != 0 ? false : z);
    }

    public final Style getStyle() {
        return this.style;
    }

    public final boolean getShowSweepSettings() {
        return this.showSweepSettings;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SweepSectionBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData$Style;", "", "<init>", "(Ljava/lang/String;I)V", "MODAL", "BOTTOM_SHEET", "lib-dashboard-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Style {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style MODAL = new Style("MODAL", 0);
        public static final Style BOTTOM_SHEET = new Style("BOTTOM_SHEET", 1);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{MODAL, BOTTOM_SHEET};
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
