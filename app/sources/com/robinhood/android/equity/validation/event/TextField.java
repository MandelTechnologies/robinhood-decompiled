package com.robinhood.android.equity.validation.event;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextField.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/event/TextField;", "", "<init>", "(Ljava/lang/String;I)V", "NUMBER_OF_SHARES", "TAX_LOTS_LIMIT_PRICE", "LIMIT_STANDARD_LIMIT_PRICE", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TextField {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextField[] $VALUES;
    public static final TextField NUMBER_OF_SHARES = new TextField("NUMBER_OF_SHARES", 0);
    public static final TextField TAX_LOTS_LIMIT_PRICE = new TextField("TAX_LOTS_LIMIT_PRICE", 1);
    public static final TextField LIMIT_STANDARD_LIMIT_PRICE = new TextField("LIMIT_STANDARD_LIMIT_PRICE", 2);

    private static final /* synthetic */ TextField[] $values() {
        return new TextField[]{NUMBER_OF_SHARES, TAX_LOTS_LIMIT_PRICE, LIMIT_STANDARD_LIMIT_PRICE};
    }

    public static EnumEntries<TextField> getEntries() {
        return $ENTRIES;
    }

    private TextField(String str, int i) {
    }

    static {
        TextField[] textFieldArr$values = $values();
        $VALUES = textFieldArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textFieldArr$values);
    }

    public static TextField valueOf(String str) {
        return (TextField) Enum.valueOf(TextField.class, str);
    }

    public static TextField[] values() {
        return (TextField[]) $VALUES.clone();
    }
}
