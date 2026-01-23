package com.robinhood.android.common.options.order;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOrderLimitPrice.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/LimitPriceSource;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_INPUT", "BID_ASK_BAR", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.order.LimitPriceSource, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionOrderLimitPrice {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderLimitPrice[] $VALUES;
    public static final OptionOrderLimitPrice TEXT_INPUT = new OptionOrderLimitPrice("TEXT_INPUT", 0);
    public static final OptionOrderLimitPrice BID_ASK_BAR = new OptionOrderLimitPrice("BID_ASK_BAR", 1);

    private static final /* synthetic */ OptionOrderLimitPrice[] $values() {
        return new OptionOrderLimitPrice[]{TEXT_INPUT, BID_ASK_BAR};
    }

    public static EnumEntries<OptionOrderLimitPrice> getEntries() {
        return $ENTRIES;
    }

    private OptionOrderLimitPrice(String str, int i) {
    }

    static {
        OptionOrderLimitPrice[] optionOrderLimitPriceArr$values = $values();
        $VALUES = optionOrderLimitPriceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderLimitPriceArr$values);
    }

    public static OptionOrderLimitPrice valueOf(String str) {
        return (OptionOrderLimitPrice) Enum.valueOf(OptionOrderLimitPrice.class, str);
    }

    public static OptionOrderLimitPrice[] values() {
        return (OptionOrderLimitPrice[]) $VALUES.clone();
    }
}
