package com.robinhood.android.generic.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/generic/table/SlotsEnum;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "DEPENDENT", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SlotsEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SlotsEnum[] $VALUES;
    public static final SlotsEnum MAIN = new SlotsEnum("MAIN", 0);
    public static final SlotsEnum DEPENDENT = new SlotsEnum("DEPENDENT", 1);

    private static final /* synthetic */ SlotsEnum[] $values() {
        return new SlotsEnum[]{MAIN, DEPENDENT};
    }

    public static EnumEntries<SlotsEnum> getEntries() {
        return $ENTRIES;
    }

    private SlotsEnum(String str, int i) {
    }

    static {
        SlotsEnum[] slotsEnumArr$values = $values();
        $VALUES = slotsEnumArr$values;
        $ENTRIES = EnumEntries2.enumEntries(slotsEnumArr$values);
    }

    public static SlotsEnum valueOf(String str) {
        return (SlotsEnum) Enum.valueOf(SlotsEnum.class, str);
    }

    public static SlotsEnum[] values() {
        return (SlotsEnum[]) $VALUES.clone();
    }
}
