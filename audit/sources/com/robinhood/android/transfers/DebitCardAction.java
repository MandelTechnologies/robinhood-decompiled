package com.robinhood.android.transfers;

import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.moneymovement.strings.C22208R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DebitCardAction.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/DebitCardAction;", "", "stringResource", "", "<init>", "(Ljava/lang/String;II)V", "getStringResource", "()I", "UNLINK", "VERIFY", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DebitCardAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DebitCardAction[] $VALUES;
    public static final DebitCardAction UNLINK = new DebitCardAction("UNLINK", 0, C9631R.string.funding_relationship_menu_unlink);
    public static final DebitCardAction VERIFY = new DebitCardAction("VERIFY", 1, C22208R.string.label_verify);
    private final int stringResource;

    private static final /* synthetic */ DebitCardAction[] $values() {
        return new DebitCardAction[]{UNLINK, VERIFY};
    }

    public static EnumEntries<DebitCardAction> getEntries() {
        return $ENTRIES;
    }

    private DebitCardAction(String str, int i, int i2) {
        this.stringResource = i2;
    }

    public final int getStringResource() {
        return this.stringResource;
    }

    static {
        DebitCardAction[] debitCardActionArr$values = $values();
        $VALUES = debitCardActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(debitCardActionArr$values);
    }

    public static DebitCardAction valueOf(String str) {
        return (DebitCardAction) Enum.valueOf(DebitCardAction.class, str);
    }

    public static DebitCardAction[] values() {
        return (DebitCardAction[]) $VALUES.clone();
    }
}
