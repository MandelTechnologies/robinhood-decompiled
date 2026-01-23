package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChooseAddressSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressSource;", "", "type", "Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressUsageType;", "<init>", "(Ljava/lang/String;ILcom/robinhood/android/navigation/app/keys/data/ChooseAddressUsageType;)V", "getType", "()Lcom/robinhood/android/navigation/app/keys/data/ChooseAddressUsageType;", "CASH_MANAGEMENT_PAY_BY_CHECK", "CASH_MANAGEMENT_SHIPPING", "SETTINGS_TRUSTED_CONTACT", "SETTINGS_MODIFY_RESIDENTIAL", "CASH_MANAGEMENT_RESIDENTIAL", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ChooseAddressSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChooseAddressSource[] $VALUES;
    public static final ChooseAddressSource CASH_MANAGEMENT_PAY_BY_CHECK;
    public static final ChooseAddressSource CASH_MANAGEMENT_RESIDENTIAL;
    public static final ChooseAddressSource CASH_MANAGEMENT_SHIPPING;
    public static final ChooseAddressSource SETTINGS_MODIFY_RESIDENTIAL;
    public static final ChooseAddressSource SETTINGS_TRUSTED_CONTACT;
    private final ChooseAddressUsageType type;

    private static final /* synthetic */ ChooseAddressSource[] $values() {
        return new ChooseAddressSource[]{CASH_MANAGEMENT_PAY_BY_CHECK, CASH_MANAGEMENT_SHIPPING, SETTINGS_TRUSTED_CONTACT, SETTINGS_MODIFY_RESIDENTIAL, CASH_MANAGEMENT_RESIDENTIAL};
    }

    public static EnumEntries<ChooseAddressSource> getEntries() {
        return $ENTRIES;
    }

    private ChooseAddressSource(String str, int i, ChooseAddressUsageType chooseAddressUsageType) {
        this.type = chooseAddressUsageType;
    }

    public final ChooseAddressUsageType getType() {
        return this.type;
    }

    static {
        ChooseAddressUsageType chooseAddressUsageType = ChooseAddressUsageType.GET_VALIDATED_ADDRESS;
        CASH_MANAGEMENT_PAY_BY_CHECK = new ChooseAddressSource("CASH_MANAGEMENT_PAY_BY_CHECK", 0, chooseAddressUsageType);
        CASH_MANAGEMENT_SHIPPING = new ChooseAddressSource("CASH_MANAGEMENT_SHIPPING", 1, chooseAddressUsageType);
        SETTINGS_TRUSTED_CONTACT = new ChooseAddressSource("SETTINGS_TRUSTED_CONTACT", 2, chooseAddressUsageType);
        ChooseAddressUsageType chooseAddressUsageType2 = ChooseAddressUsageType.UPDATE_USER_BASIC_INFO;
        SETTINGS_MODIFY_RESIDENTIAL = new ChooseAddressSource("SETTINGS_MODIFY_RESIDENTIAL", 3, chooseAddressUsageType2);
        CASH_MANAGEMENT_RESIDENTIAL = new ChooseAddressSource("CASH_MANAGEMENT_RESIDENTIAL", 4, chooseAddressUsageType2);
        ChooseAddressSource[] chooseAddressSourceArr$values = $values();
        $VALUES = chooseAddressSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(chooseAddressSourceArr$values);
    }

    public static ChooseAddressSource valueOf(String str) {
        return (ChooseAddressSource) Enum.valueOf(ChooseAddressSource.class, str);
    }

    public static ChooseAddressSource[] values() {
        return (ChooseAddressSource[]) $VALUES.clone();
    }
}
