package com.robinhood.android.disclosures.lib.homescreen;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "", "<init>", "(Ljava/lang/String;I)V", "TAXABLE", "RETIREMENT", "NONE", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureType, reason: use source file name */
/* loaded from: classes27.dex */
public final class OptionsDisclosure2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsDisclosure2[] $VALUES;
    public static final OptionsDisclosure2 TAXABLE = new OptionsDisclosure2("TAXABLE", 0);
    public static final OptionsDisclosure2 RETIREMENT = new OptionsDisclosure2("RETIREMENT", 1);
    public static final OptionsDisclosure2 NONE = new OptionsDisclosure2("NONE", 2);

    private static final /* synthetic */ OptionsDisclosure2[] $values() {
        return new OptionsDisclosure2[]{TAXABLE, RETIREMENT, NONE};
    }

    public static EnumEntries<OptionsDisclosure2> getEntries() {
        return $ENTRIES;
    }

    private OptionsDisclosure2(String str, int i) {
    }

    static {
        OptionsDisclosure2[] optionsDisclosure2Arr$values = $values();
        $VALUES = optionsDisclosure2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsDisclosure2Arr$values);
    }

    public static OptionsDisclosure2 valueOf(String str) {
        return (OptionsDisclosure2) Enum.valueOf(OptionsDisclosure2.class, str);
    }

    public static OptionsDisclosure2[] values() {
        return (OptionsDisclosure2[]) $VALUES.clone();
    }
}
