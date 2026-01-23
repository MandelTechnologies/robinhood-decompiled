package com.robinhood.utils.notifications;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Channels.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/notifications/Channels;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ACCOUNT", "CORPORATE_ACTIONS", "CUSTOMER_SUPPORT", "DIVIDENDS", "EARNINGS", "MARGIN", "ORDERS", "PRICE_MOVEMENT", "TRANSFERS", "WIDGET", "DEFAULT", "LEAKCANARY_LOW", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Channels {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Channels[] $VALUES;
    private final String id;
    public static final Channels ACCOUNT = new Channels("ACCOUNT", 0, "rh_account_channel");
    public static final Channels CORPORATE_ACTIONS = new Channels("CORPORATE_ACTIONS", 1, "rh_corporate_actions_channel");
    public static final Channels CUSTOMER_SUPPORT = new Channels("CUSTOMER_SUPPORT", 2, "rh_customer_support_channel");
    public static final Channels DIVIDENDS = new Channels("DIVIDENDS", 3, "rh_dividends_channel");
    public static final Channels EARNINGS = new Channels("EARNINGS", 4, "rh_earnings_channel");
    public static final Channels MARGIN = new Channels("MARGIN", 5, "rh_margin_channel");
    public static final Channels ORDERS = new Channels("ORDERS", 6, "rh_orders_channel");
    public static final Channels PRICE_MOVEMENT = new Channels("PRICE_MOVEMENT", 7, "rh_price_movement_channel");
    public static final Channels TRANSFERS = new Channels("TRANSFERS", 8, "rh_transfers_channel");
    public static final Channels WIDGET = new Channels("WIDGET", 9, "rh_updating_channel");
    public static final Channels DEFAULT = new Channels("DEFAULT", 10, "rh_default_channel");
    public static final Channels LEAKCANARY_LOW = new Channels("LEAKCANARY_LOW", 11, "LEAKCANARY_LOW");

    private static final /* synthetic */ Channels[] $values() {
        return new Channels[]{ACCOUNT, CORPORATE_ACTIONS, CUSTOMER_SUPPORT, DIVIDENDS, EARNINGS, MARGIN, ORDERS, PRICE_MOVEMENT, TRANSFERS, WIDGET, DEFAULT, LEAKCANARY_LOW};
    }

    public static EnumEntries<Channels> getEntries() {
        return $ENTRIES;
    }

    private Channels(String str, int i, String str2) {
        this.id = str2;
    }

    public final String getId() {
        return this.id;
    }

    static {
        Channels[] channelsArr$values = $values();
        $VALUES = channelsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(channelsArr$values);
    }

    public static Channels valueOf(String str) {
        return (Channels) Enum.valueOf(Channels.class, str);
    }

    public static Channels[] values() {
        return (Channels[]) $VALUES.clone();
    }
}
