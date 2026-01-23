package com.withpersona.sdk2.inquiry.nfc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NfcDataGroupType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/NfcDataGroupType;", "", "<init>", "(Ljava/lang/String;I)V", "Dg1", "Dg2", "Dg14", "Sod", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NfcDataGroupType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NfcDataGroupType[] $VALUES;
    public static final NfcDataGroupType Dg1 = new NfcDataGroupType("Dg1", 0);
    public static final NfcDataGroupType Dg2 = new NfcDataGroupType("Dg2", 1);
    public static final NfcDataGroupType Dg14 = new NfcDataGroupType("Dg14", 2);
    public static final NfcDataGroupType Sod = new NfcDataGroupType("Sod", 3);

    private static final /* synthetic */ NfcDataGroupType[] $values() {
        return new NfcDataGroupType[]{Dg1, Dg2, Dg14, Sod};
    }

    public static EnumEntries<NfcDataGroupType> getEntries() {
        return $ENTRIES;
    }

    private NfcDataGroupType(String str, int i) {
    }

    static {
        NfcDataGroupType[] nfcDataGroupTypeArr$values = $values();
        $VALUES = nfcDataGroupTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(nfcDataGroupTypeArr$values);
    }

    public static NfcDataGroupType valueOf(String str) {
        return (NfcDataGroupType) Enum.valueOf(NfcDataGroupType.class, str);
    }

    public static NfcDataGroupType[] values() {
        return (NfcDataGroupType[]) $VALUES.clone();
    }
}
