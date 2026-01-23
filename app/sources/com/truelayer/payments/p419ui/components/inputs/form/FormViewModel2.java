package com.truelayer.payments.p419ui.components.inputs.form;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormViewModel.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/inputs/form/FormState;", "", "(Ljava/lang/String;I)V", "Valid", "InValid", "Incomplete", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.inputs.form.FormState, reason: use source file name */
/* loaded from: classes12.dex */
public final class FormViewModel2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FormViewModel2[] $VALUES;
    public static final FormViewModel2 Valid = new FormViewModel2("Valid", 0);
    public static final FormViewModel2 InValid = new FormViewModel2("InValid", 1);
    public static final FormViewModel2 Incomplete = new FormViewModel2("Incomplete", 2);

    private static final /* synthetic */ FormViewModel2[] $values() {
        return new FormViewModel2[]{Valid, InValid, Incomplete};
    }

    public static EnumEntries<FormViewModel2> getEntries() {
        return $ENTRIES;
    }

    public static FormViewModel2 valueOf(String str) {
        return (FormViewModel2) Enum.valueOf(FormViewModel2.class, str);
    }

    public static FormViewModel2[] values() {
        return (FormViewModel2[]) $VALUES.clone();
    }

    private FormViewModel2(String str, int i) {
    }

    static {
        FormViewModel2[] formViewModel2Arr$values = $values();
        $VALUES = formViewModel2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(formViewModel2Arr$values);
    }
}
