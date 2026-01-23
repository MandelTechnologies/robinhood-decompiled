package com.robinhood.android.options.comboorders.detail.components.legs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailLegsSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState;", "", "titleString", "", "subtitleString", "notionalString", "type", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState$ComboOrderDetailLegsAssetType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState$ComboOrderDetailLegsAssetType;)V", "getTitleString", "()Ljava/lang/String;", "getSubtitleString", "getNotionalString", "getType", "()Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState$ComboOrderDetailLegsAssetType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ComboOrderDetailLegsAssetType", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailLegsRowViewState {
    public static final int $stable = 0;
    private final String notionalString;
    private final String subtitleString;
    private final String titleString;
    private final ComboOrderDetailLegsAssetType type;

    public static /* synthetic */ ComboOrderDetailLegsRowViewState copy$default(ComboOrderDetailLegsRowViewState comboOrderDetailLegsRowViewState, String str, String str2, String str3, ComboOrderDetailLegsAssetType comboOrderDetailLegsAssetType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboOrderDetailLegsRowViewState.titleString;
        }
        if ((i & 2) != 0) {
            str2 = comboOrderDetailLegsRowViewState.subtitleString;
        }
        if ((i & 4) != 0) {
            str3 = comboOrderDetailLegsRowViewState.notionalString;
        }
        if ((i & 8) != 0) {
            comboOrderDetailLegsAssetType = comboOrderDetailLegsRowViewState.type;
        }
        return comboOrderDetailLegsRowViewState.copy(str, str2, str3, comboOrderDetailLegsAssetType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleString() {
        return this.titleString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleString() {
        return this.subtitleString;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNotionalString() {
        return this.notionalString;
    }

    /* renamed from: component4, reason: from getter */
    public final ComboOrderDetailLegsAssetType getType() {
        return this.type;
    }

    public final ComboOrderDetailLegsRowViewState copy(String titleString, String subtitleString, String notionalString, ComboOrderDetailLegsAssetType type2) {
        Intrinsics.checkNotNullParameter(titleString, "titleString");
        Intrinsics.checkNotNullParameter(subtitleString, "subtitleString");
        Intrinsics.checkNotNullParameter(notionalString, "notionalString");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ComboOrderDetailLegsRowViewState(titleString, subtitleString, notionalString, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailLegsRowViewState)) {
            return false;
        }
        ComboOrderDetailLegsRowViewState comboOrderDetailLegsRowViewState = (ComboOrderDetailLegsRowViewState) other;
        return Intrinsics.areEqual(this.titleString, comboOrderDetailLegsRowViewState.titleString) && Intrinsics.areEqual(this.subtitleString, comboOrderDetailLegsRowViewState.subtitleString) && Intrinsics.areEqual(this.notionalString, comboOrderDetailLegsRowViewState.notionalString) && this.type == comboOrderDetailLegsRowViewState.type;
    }

    public int hashCode() {
        return (((((this.titleString.hashCode() * 31) + this.subtitleString.hashCode()) * 31) + this.notionalString.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ComboOrderDetailLegsRowViewState(titleString=" + this.titleString + ", subtitleString=" + this.subtitleString + ", notionalString=" + this.notionalString + ", type=" + this.type + ")";
    }

    public ComboOrderDetailLegsRowViewState(String titleString, String subtitleString, String notionalString, ComboOrderDetailLegsAssetType type2) {
        Intrinsics.checkNotNullParameter(titleString, "titleString");
        Intrinsics.checkNotNullParameter(subtitleString, "subtitleString");
        Intrinsics.checkNotNullParameter(notionalString, "notionalString");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.titleString = titleString;
        this.subtitleString = subtitleString;
        this.notionalString = notionalString;
        this.type = type2;
    }

    public final String getTitleString() {
        return this.titleString;
    }

    public final String getSubtitleString() {
        return this.subtitleString;
    }

    public final String getNotionalString() {
        return this.notionalString;
    }

    public final ComboOrderDetailLegsAssetType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComboOrderDetailLegsSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState$ComboOrderDetailLegsAssetType;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "EQUITY_OPTION", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ComboOrderDetailLegsAssetType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ComboOrderDetailLegsAssetType[] $VALUES;
        public static final ComboOrderDetailLegsAssetType EQUITY = new ComboOrderDetailLegsAssetType("EQUITY", 0);
        public static final ComboOrderDetailLegsAssetType EQUITY_OPTION = new ComboOrderDetailLegsAssetType("EQUITY_OPTION", 1);

        private static final /* synthetic */ ComboOrderDetailLegsAssetType[] $values() {
            return new ComboOrderDetailLegsAssetType[]{EQUITY, EQUITY_OPTION};
        }

        public static EnumEntries<ComboOrderDetailLegsAssetType> getEntries() {
            return $ENTRIES;
        }

        private ComboOrderDetailLegsAssetType(String str, int i) {
        }

        static {
            ComboOrderDetailLegsAssetType[] comboOrderDetailLegsAssetTypeArr$values = $values();
            $VALUES = comboOrderDetailLegsAssetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(comboOrderDetailLegsAssetTypeArr$values);
        }

        public static ComboOrderDetailLegsAssetType valueOf(String str) {
            return (ComboOrderDetailLegsAssetType) Enum.valueOf(ComboOrderDetailLegsAssetType.class, str);
        }

        public static ComboOrderDetailLegsAssetType[] values() {
            return (ComboOrderDetailLegsAssetType[]) $VALUES.clone();
        }
    }
}
