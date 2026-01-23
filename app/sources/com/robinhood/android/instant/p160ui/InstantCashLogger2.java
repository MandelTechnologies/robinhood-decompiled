package com.robinhood.android.instant.p160ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantCashLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/instant/ui/InstantCashLoggingComponentIdentifier;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LEARN_MORE", "SWITCH_TO_CASH_ACCOUNT_BUTTON", "SWITCH_TO_MARGIN_ACCOUNT_BUTTON", "SWITCH_TO_MARGIN_ACCOUNT", "SWITCH_TO_CASH_ACCOUNT", "EQUITY_TRADE_FLOW_MARGIN_UPSELL", "NOT_NOW", "DISMISS", "GO_BACK", "feature-lib-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.instant.ui.InstantCashLoggingComponentIdentifier, reason: use source file name */
/* loaded from: classes10.dex */
public final class InstantCashLogger2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstantCashLogger2[] $VALUES;
    private final String value;
    public static final InstantCashLogger2 LEARN_MORE = new InstantCashLogger2("LEARN_MORE", 0, AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE);
    public static final InstantCashLogger2 SWITCH_TO_CASH_ACCOUNT_BUTTON = new InstantCashLogger2("SWITCH_TO_CASH_ACCOUNT_BUTTON", 1, "switch_to_cash_account_button");
    public static final InstantCashLogger2 SWITCH_TO_MARGIN_ACCOUNT_BUTTON = new InstantCashLogger2("SWITCH_TO_MARGIN_ACCOUNT_BUTTON", 2, "switch_to_margin_account_button");
    public static final InstantCashLogger2 SWITCH_TO_MARGIN_ACCOUNT = new InstantCashLogger2("SWITCH_TO_MARGIN_ACCOUNT", 3, "switch_to_margin_account");
    public static final InstantCashLogger2 SWITCH_TO_CASH_ACCOUNT = new InstantCashLogger2("SWITCH_TO_CASH_ACCOUNT", 4, "switch_to_cash_account");
    public static final InstantCashLogger2 EQUITY_TRADE_FLOW_MARGIN_UPSELL = new InstantCashLogger2("EQUITY_TRADE_FLOW_MARGIN_UPSELL", 5, "equity_trade_flow_margin_upsell");
    public static final InstantCashLogger2 NOT_NOW = new InstantCashLogger2("NOT_NOW", 6, AnalyticsStrings.BUTTON_TITLE_OPTION_ALERT_NOT_NOW);
    public static final InstantCashLogger2 DISMISS = new InstantCashLogger2("DISMISS", 7, "dismiss");
    public static final InstantCashLogger2 GO_BACK = new InstantCashLogger2("GO_BACK", 8, "go_back");

    private static final /* synthetic */ InstantCashLogger2[] $values() {
        return new InstantCashLogger2[]{LEARN_MORE, SWITCH_TO_CASH_ACCOUNT_BUTTON, SWITCH_TO_MARGIN_ACCOUNT_BUTTON, SWITCH_TO_MARGIN_ACCOUNT, SWITCH_TO_CASH_ACCOUNT, EQUITY_TRADE_FLOW_MARGIN_UPSELL, NOT_NOW, DISMISS, GO_BACK};
    }

    public static EnumEntries<InstantCashLogger2> getEntries() {
        return $ENTRIES;
    }

    private InstantCashLogger2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        InstantCashLogger2[] instantCashLogger2Arr$values = $values();
        $VALUES = instantCashLogger2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(instantCashLogger2Arr$values);
    }

    public static InstantCashLogger2 valueOf(String str) {
        return (InstantCashLogger2) Enum.valueOf(InstantCashLogger2.class, str);
    }

    public static InstantCashLogger2[] values() {
        return (InstantCashLogger2[]) $VALUES.clone();
    }
}
