package com.robinhood.android.teller;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TellerErrorAction.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/teller/TellerErrorAction;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DISMISS_ALERT", "EXIT_FLOW", "UNKNOWN", "Companion", "lib-teller_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TellerErrorAction implements RhEnum<TellerErrorAction> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TellerErrorAction[] $VALUES;
    public static final TellerErrorAction DISMISS_ALERT = new TellerErrorAction("DISMISS_ALERT", 0, "dismiss_alert");
    public static final TellerErrorAction EXIT_FLOW = new TellerErrorAction("EXIT_FLOW", 1, "exit_flow");
    public static final TellerErrorAction UNKNOWN = new TellerErrorAction("UNKNOWN", 2, "unknown");
    private final String serverValue;

    private static final /* synthetic */ TellerErrorAction[] $values() {
        return new TellerErrorAction[]{DISMISS_ALERT, EXIT_FLOW, UNKNOWN};
    }

    public static EnumEntries<TellerErrorAction> getEntries() {
        return $ENTRIES;
    }

    private TellerErrorAction(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        TellerErrorAction[] tellerErrorActionArr$values = $values();
        $VALUES = tellerErrorActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tellerErrorActionArr$values);
        INSTANCE = new Companion(null);
    }

    public static TellerErrorAction valueOf(String str) {
        return (TellerErrorAction) Enum.valueOf(TellerErrorAction.class, str);
    }

    public static TellerErrorAction[] values() {
        return (TellerErrorAction[]) $VALUES.clone();
    }
}
