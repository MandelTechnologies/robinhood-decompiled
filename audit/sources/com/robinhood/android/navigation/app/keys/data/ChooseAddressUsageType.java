package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChooseAddressUsageType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressUsageType;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATE_USER_BASIC_INFO", "GET_VALIDATED_ADDRESS", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ChooseAddressUsageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChooseAddressUsageType[] $VALUES;
    public static final ChooseAddressUsageType UPDATE_USER_BASIC_INFO = new ChooseAddressUsageType("UPDATE_USER_BASIC_INFO", 0);
    public static final ChooseAddressUsageType GET_VALIDATED_ADDRESS = new ChooseAddressUsageType("GET_VALIDATED_ADDRESS", 1);

    private static final /* synthetic */ ChooseAddressUsageType[] $values() {
        return new ChooseAddressUsageType[]{UPDATE_USER_BASIC_INFO, GET_VALIDATED_ADDRESS};
    }

    public static EnumEntries<ChooseAddressUsageType> getEntries() {
        return $ENTRIES;
    }

    private ChooseAddressUsageType(String str, int i) {
    }

    static {
        ChooseAddressUsageType[] chooseAddressUsageTypeArr$values = $values();
        $VALUES = chooseAddressUsageTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(chooseAddressUsageTypeArr$values);
    }

    public static ChooseAddressUsageType valueOf(String str) {
        return (ChooseAddressUsageType) Enum.valueOf(ChooseAddressUsageType.class, str);
    }

    public static ChooseAddressUsageType[] values() {
        return (ChooseAddressUsageType[]) $VALUES.clone();
    }
}
