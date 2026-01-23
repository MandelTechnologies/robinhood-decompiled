package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.citations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CitedDetailsType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/citations/CitedDetailsType;", "", "<init>", "(Ljava/lang/String;I)V", "InlineMetadata", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CitedDetailsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CitedDetailsType[] $VALUES;
    public static final CitedDetailsType InlineMetadata = new CitedDetailsType("InlineMetadata", 0);

    private static final /* synthetic */ CitedDetailsType[] $values() {
        return new CitedDetailsType[]{InlineMetadata};
    }

    public static EnumEntries<CitedDetailsType> getEntries() {
        return $ENTRIES;
    }

    private CitedDetailsType(String str, int i) {
    }

    static {
        CitedDetailsType[] citedDetailsTypeArr$values = $values();
        $VALUES = citedDetailsTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(citedDetailsTypeArr$values);
    }

    public static CitedDetailsType valueOf(String str) {
        return (CitedDetailsType) Enum.valueOf(CitedDetailsType.class, str);
    }

    public static CitedDetailsType[] values() {
        return (CitedDetailsType[]) $VALUES.clone();
    }
}
