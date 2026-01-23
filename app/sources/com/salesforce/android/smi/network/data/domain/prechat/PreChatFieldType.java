package com.salesforce.android.smi.network.data.domain.prechat;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreChatFieldType.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Email", "Text", "Number", "Phone", "Checkbox", "ChoiceList", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PreChatFieldType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PreChatFieldType[] $VALUES;
    public static final PreChatFieldType Email = new PreChatFieldType("Email", 0);
    public static final PreChatFieldType Text = new PreChatFieldType("Text", 1);
    public static final PreChatFieldType Number = new PreChatFieldType("Number", 2);
    public static final PreChatFieldType Phone = new PreChatFieldType("Phone", 3);
    public static final PreChatFieldType Checkbox = new PreChatFieldType("Checkbox", 4);
    public static final PreChatFieldType ChoiceList = new PreChatFieldType("ChoiceList", 5);

    private static final /* synthetic */ PreChatFieldType[] $values() {
        return new PreChatFieldType[]{Email, Text, Number, Phone, Checkbox, ChoiceList};
    }

    public static EnumEntries<PreChatFieldType> getEntries() {
        return $ENTRIES;
    }

    private PreChatFieldType(String str, int i) {
    }

    static {
        PreChatFieldType[] preChatFieldTypeArr$values = $values();
        $VALUES = preChatFieldTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(preChatFieldTypeArr$values);
    }

    public static PreChatFieldType valueOf(String str) {
        return (PreChatFieldType) Enum.valueOf(PreChatFieldType.class, str);
    }

    public static PreChatFieldType[] values() {
        return (PreChatFieldType[]) $VALUES.clone();
    }
}
