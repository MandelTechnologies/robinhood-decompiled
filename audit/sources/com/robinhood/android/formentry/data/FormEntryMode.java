package com.robinhood.android.formentry.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormEntryMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/formentry/data/FormEntryMode;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT_ENTRY", "REVIEW", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FormEntryMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FormEntryMode[] $VALUES;
    public static final FormEntryMode INPUT_ENTRY = new FormEntryMode("INPUT_ENTRY", 0);
    public static final FormEntryMode REVIEW = new FormEntryMode("REVIEW", 1);

    private static final /* synthetic */ FormEntryMode[] $values() {
        return new FormEntryMode[]{INPUT_ENTRY, REVIEW};
    }

    public static EnumEntries<FormEntryMode> getEntries() {
        return $ENTRIES;
    }

    private FormEntryMode(String str, int i) {
    }

    static {
        FormEntryMode[] formEntryModeArr$values = $values();
        $VALUES = formEntryModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(formEntryModeArr$values);
    }

    public static FormEntryMode valueOf(String str) {
        return (FormEntryMode) Enum.valueOf(FormEntryMode.class, str);
    }

    public static FormEntryMode[] values() {
        return (FormEntryMode[]) $VALUES.clone();
    }
}
