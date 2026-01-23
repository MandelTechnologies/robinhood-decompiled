package com.robinhood.librobinhood.data.store.alert;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/alert/SortingType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SETTING_TYPE", "CREATED_AT", "UPDATED_AT", "lib-store-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SortingType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortingType[] $VALUES;
    private final String serverValue;
    public static final SortingType SETTING_TYPE = new SortingType("SETTING_TYPE", 0, "setting_type");
    public static final SortingType CREATED_AT = new SortingType("CREATED_AT", 1, "created_at");
    public static final SortingType UPDATED_AT = new SortingType("UPDATED_AT", 2, "updated_at");

    private static final /* synthetic */ SortingType[] $values() {
        return new SortingType[]{SETTING_TYPE, CREATED_AT, UPDATED_AT};
    }

    public static EnumEntries<SortingType> getEntries() {
        return $ENTRIES;
    }

    private SortingType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        SortingType[] sortingTypeArr$values = $values();
        $VALUES = sortingTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sortingTypeArr$values);
    }

    public static SortingType valueOf(String str) {
        return (SortingType) Enum.valueOf(SortingType.class, str);
    }

    public static SortingType[] values() {
        return (SortingType[]) $VALUES.clone();
    }
}
