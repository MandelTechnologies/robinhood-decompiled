package com.truelayer.payments.p419ui.screens.formflows.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormScreenType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/FormScreenType;", "", "(Ljava/lang/String;I)V", "Form", "SearchSelect", "RadioSelect", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FormScreenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FormScreenType[] $VALUES;
    public static final FormScreenType Form = new FormScreenType("Form", 0);
    public static final FormScreenType SearchSelect = new FormScreenType("SearchSelect", 1);
    public static final FormScreenType RadioSelect = new FormScreenType("RadioSelect", 2);

    private static final /* synthetic */ FormScreenType[] $values() {
        return new FormScreenType[]{Form, SearchSelect, RadioSelect};
    }

    public static EnumEntries<FormScreenType> getEntries() {
        return $ENTRIES;
    }

    public static FormScreenType valueOf(String str) {
        return (FormScreenType) Enum.valueOf(FormScreenType.class, str);
    }

    public static FormScreenType[] values() {
        return (FormScreenType[]) $VALUES.clone();
    }

    private FormScreenType(String str, int i) {
    }

    static {
        FormScreenType[] formScreenTypeArr$values = $values();
        $VALUES = formScreenTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(formScreenTypeArr$values);
    }
}
