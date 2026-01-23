package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.webView;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValueType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/webView/ValueType;", "", "<init>", "(Ljava/lang/String;I)V", "TextValue", "Unknown", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ValueType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ValueType[] $VALUES;
    public static final ValueType TextValue = new ValueType("TextValue", 0);
    public static final ValueType Unknown = new ValueType("Unknown", 1);

    private static final /* synthetic */ ValueType[] $values() {
        return new ValueType[]{TextValue, Unknown};
    }

    public static EnumEntries<ValueType> getEntries() {
        return $ENTRIES;
    }

    private ValueType(String str, int i) {
    }

    static {
        ValueType[] valueTypeArr$values = $values();
        $VALUES = valueTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(valueTypeArr$values);
    }

    public static ValueType valueOf(String str) {
        return (ValueType) Enum.valueOf(ValueType.class, str);
    }

    public static ValueType[] values() {
        return (ValueType[]) $VALUES.clone();
    }
}
