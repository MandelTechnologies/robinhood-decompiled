package com.robinhood.android.navigation.app.keys.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarginLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/MarginLaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "OVERVIEW", "BUYING_POWER", "INSTANT_ACCESS_TO_FUNDS", "Source", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginLaunchMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarginLaunchMode[] $VALUES;
    public static final String SOURCE_24KG_MIGRATION = "24k_migration";
    public static final String SOURCE_DEEP_LINK = "deeplink";
    public static final String SOURCE_HOOK_ACCOUNT_OVERVIEW = "account_increase_buying_power";
    public static final String SOURCE_HOOK_ORDER_CONFIRMATION_BUYING_POWER = "trade_receipt_buying_power";
    public static final String SOURCE_HOOK_ORDER_CONFIRMATION_INSTANT_ACCESS = "trade_receipt_instant_access";
    public static final String SOURCE_SETTINGS_CHANGE_TIER = "change_tier";
    public static final String SOURCE_SETTINGS_MAIN = "settings";
    public static final String SOURCE_WATCHLIST = "account_menu";
    public static final String SOURCE_WITHDRAW_CASH_ERROR = "withdraw_cash_error";
    public static final String SOURCE_WITHDRAW_CASH_LEARN_MORE = "withdraw_cash_learn_more";
    public static final MarginLaunchMode OVERVIEW = new MarginLaunchMode("OVERVIEW", 0);
    public static final MarginLaunchMode BUYING_POWER = new MarginLaunchMode("BUYING_POWER", 1);
    public static final MarginLaunchMode INSTANT_ACCESS_TO_FUNDS = new MarginLaunchMode("INSTANT_ACCESS_TO_FUNDS", 2);

    /* compiled from: MarginLaunchMode.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/MarginLaunchMode$Source;", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public @interface Source {
    }

    private static final /* synthetic */ MarginLaunchMode[] $values() {
        return new MarginLaunchMode[]{OVERVIEW, BUYING_POWER, INSTANT_ACCESS_TO_FUNDS};
    }

    public static EnumEntries<MarginLaunchMode> getEntries() {
        return $ENTRIES;
    }

    private MarginLaunchMode(String str, int i) {
    }

    static {
        MarginLaunchMode[] marginLaunchModeArr$values = $values();
        $VALUES = marginLaunchModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marginLaunchModeArr$values);
        INSTANCE = new Companion(null);
    }

    public static MarginLaunchMode valueOf(String str) {
        return (MarginLaunchMode) Enum.valueOf(MarginLaunchMode.class, str);
    }

    public static MarginLaunchMode[] values() {
        return (MarginLaunchMode[]) $VALUES.clone();
    }
}
