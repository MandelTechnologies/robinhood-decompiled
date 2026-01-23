package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CitedReferenceType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedReferenceType;", "", "<init>", "(Ljava/lang/String;I)V", "Link", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CitedReferenceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CitedReferenceType[] $VALUES;
    public static final CitedReferenceType Link = new CitedReferenceType("Link", 0);

    private static final /* synthetic */ CitedReferenceType[] $values() {
        return new CitedReferenceType[]{Link};
    }

    public static EnumEntries<CitedReferenceType> getEntries() {
        return $ENTRIES;
    }

    private CitedReferenceType(String str, int i) {
    }

    static {
        CitedReferenceType[] citedReferenceTypeArr$values = $values();
        $VALUES = citedReferenceTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(citedReferenceTypeArr$values);
    }

    public static CitedReferenceType valueOf(String str) {
        return (CitedReferenceType) Enum.valueOf(CitedReferenceType.class, str);
    }

    public static CitedReferenceType[] values() {
        return (CitedReferenceType[]) $VALUES.clone();
    }
}
