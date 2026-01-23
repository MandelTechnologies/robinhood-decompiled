package com.robinhood.android.trade.configuration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderConfigurationUpsellOption.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "", "<init>", "(Ljava/lang/String;I)V", "OPTION_HOOK", "NONE", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderConfigurationUpsellOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderConfigurationUpsellOption[] $VALUES;
    public static final OrderConfigurationUpsellOption OPTION_HOOK = new OrderConfigurationUpsellOption("OPTION_HOOK", 0);
    public static final OrderConfigurationUpsellOption NONE = new OrderConfigurationUpsellOption("NONE", 1);

    private static final /* synthetic */ OrderConfigurationUpsellOption[] $values() {
        return new OrderConfigurationUpsellOption[]{OPTION_HOOK, NONE};
    }

    public static EnumEntries<OrderConfigurationUpsellOption> getEntries() {
        return $ENTRIES;
    }

    private OrderConfigurationUpsellOption(String str, int i) {
    }

    static {
        OrderConfigurationUpsellOption[] orderConfigurationUpsellOptionArr$values = $values();
        $VALUES = orderConfigurationUpsellOptionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderConfigurationUpsellOptionArr$values);
    }

    public static OrderConfigurationUpsellOption valueOf(String str) {
        return (OrderConfigurationUpsellOption) Enum.valueOf(OrderConfigurationUpsellOption.class, str);
    }

    public static OrderConfigurationUpsellOption[] values() {
        return (OrderConfigurationUpsellOption[]) $VALUES.clone();
    }
}
