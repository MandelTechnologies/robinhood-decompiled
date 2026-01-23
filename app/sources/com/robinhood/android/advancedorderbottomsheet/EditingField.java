package com.robinhood.android.advancedorderbottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EditingField.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "", "usesBottomSheet", "", "<init>", "(Ljava/lang/String;IZ)V", "getUsesBottomSheet", "()Z", "NUMBER_OF_WHOLE_SHARES", "NUMBER_OF_FRACTIONAL_SHARES", "LIMIT_PRICE", "TIME_IN_FORCE", "TRADING_SESSION", "ACCOUNT", "SELECT_LOTS", "TRADING_SESSION_SETTINGS", "ORDER_TYPE", "STRATEGY", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class EditingField {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EditingField[] $VALUES;
    private final boolean usesBottomSheet;
    public static final EditingField NUMBER_OF_WHOLE_SHARES = new EditingField("NUMBER_OF_WHOLE_SHARES", 0, false, 1, null);
    public static final EditingField NUMBER_OF_FRACTIONAL_SHARES = new EditingField("NUMBER_OF_FRACTIONAL_SHARES", 1, false, 1, null);
    public static final EditingField LIMIT_PRICE = new EditingField("LIMIT_PRICE", 2, false, 1, null);
    public static final EditingField TIME_IN_FORCE = new EditingField("TIME_IN_FORCE", 3, true);
    public static final EditingField TRADING_SESSION = new EditingField("TRADING_SESSION", 4, true);
    public static final EditingField ACCOUNT = new EditingField("ACCOUNT", 5, false, 1, null);
    public static final EditingField SELECT_LOTS = new EditingField("SELECT_LOTS", 6, false, 1, null);
    public static final EditingField TRADING_SESSION_SETTINGS = new EditingField("TRADING_SESSION_SETTINGS", 7, true);
    public static final EditingField ORDER_TYPE = new EditingField("ORDER_TYPE", 8, false, 1, null);
    public static final EditingField STRATEGY = new EditingField("STRATEGY", 9, true);

    private static final /* synthetic */ EditingField[] $values() {
        return new EditingField[]{NUMBER_OF_WHOLE_SHARES, NUMBER_OF_FRACTIONAL_SHARES, LIMIT_PRICE, TIME_IN_FORCE, TRADING_SESSION, ACCOUNT, SELECT_LOTS, TRADING_SESSION_SETTINGS, ORDER_TYPE, STRATEGY};
    }

    public static EnumEntries<EditingField> getEntries() {
        return $ENTRIES;
    }

    private EditingField(String str, int i, boolean z) {
        this.usesBottomSheet = z;
    }

    /* synthetic */ EditingField(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? false : z);
    }

    public final boolean getUsesBottomSheet() {
        return this.usesBottomSheet;
    }

    static {
        EditingField[] editingFieldArr$values = $values();
        $VALUES = editingFieldArr$values;
        $ENTRIES = EnumEntries2.enumEntries(editingFieldArr$values);
    }

    public static EditingField valueOf(String str) {
        return (EditingField) Enum.valueOf(EditingField.class, str);
    }

    public static EditingField[] values() {
        return (EditingField[]) $VALUES.clone();
    }
}
