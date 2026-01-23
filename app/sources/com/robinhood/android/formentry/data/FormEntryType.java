package com.robinhood.android.formentry.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormEntryType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/formentry/data/FormEntryType;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_PARTY", "THIRD_PARTY_WIRE", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FormEntryType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FormEntryType[] $VALUES;
    public static final FormEntryType FIRST_PARTY = new FormEntryType("FIRST_PARTY", 0);
    public static final FormEntryType THIRD_PARTY_WIRE = new FormEntryType("THIRD_PARTY_WIRE", 1);

    private static final /* synthetic */ FormEntryType[] $values() {
        return new FormEntryType[]{FIRST_PARTY, THIRD_PARTY_WIRE};
    }

    public static EnumEntries<FormEntryType> getEntries() {
        return $ENTRIES;
    }

    private FormEntryType(String str, int i) {
    }

    static {
        FormEntryType[] formEntryTypeArr$values = $values();
        $VALUES = formEntryTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(formEntryTypeArr$values);
    }

    public static FormEntryType valueOf(String str) {
        return (FormEntryType) Enum.valueOf(FormEntryType.class, str);
    }

    public static FormEntryType[] values() {
        return (FormEntryType[]) $VALUES.clone();
    }
}
