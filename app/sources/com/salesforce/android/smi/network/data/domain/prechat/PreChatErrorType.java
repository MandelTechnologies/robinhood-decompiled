package com.salesforce.android.smi.network.data.domain.prechat;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreChatErrorType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/PreChatErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "EmailFormat", "NumberFormat", "PhoneFormat", "RequiredField", "MaxLength", "RequiresTermsAccepted", "None", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PreChatErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PreChatErrorType[] $VALUES;
    public static final PreChatErrorType EmailFormat = new PreChatErrorType("EmailFormat", 0);
    public static final PreChatErrorType NumberFormat = new PreChatErrorType("NumberFormat", 1);
    public static final PreChatErrorType PhoneFormat = new PreChatErrorType("PhoneFormat", 2);
    public static final PreChatErrorType RequiredField = new PreChatErrorType("RequiredField", 3);
    public static final PreChatErrorType MaxLength = new PreChatErrorType("MaxLength", 4);
    public static final PreChatErrorType RequiresTermsAccepted = new PreChatErrorType("RequiresTermsAccepted", 5);
    public static final PreChatErrorType None = new PreChatErrorType("None", 6);

    private static final /* synthetic */ PreChatErrorType[] $values() {
        return new PreChatErrorType[]{EmailFormat, NumberFormat, PhoneFormat, RequiredField, MaxLength, RequiresTermsAccepted, None};
    }

    public static EnumEntries<PreChatErrorType> getEntries() {
        return $ENTRIES;
    }

    private PreChatErrorType(String str, int i) {
    }

    static {
        PreChatErrorType[] preChatErrorTypeArr$values = $values();
        $VALUES = preChatErrorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(preChatErrorTypeArr$values);
    }

    public static PreChatErrorType valueOf(String str) {
        return (PreChatErrorType) Enum.valueOf(PreChatErrorType.class, str);
    }

    public static PreChatErrorType[] values() {
        return (PreChatErrorType[]) $VALUES.clone();
    }
}
