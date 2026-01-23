package com.robinhood.android.margin.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuyingPowerHubIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/BuyingPowerHubScreen;", "", "<init>", "(Ljava/lang/String;I)V", "BUYING_POWER", "MARGIN_STATUS", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.contracts.BuyingPowerHubScreen, reason: use source file name */
/* loaded from: classes8.dex */
public final class BuyingPowerHubIntentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BuyingPowerHubIntentKey2[] $VALUES;
    public static final BuyingPowerHubIntentKey2 BUYING_POWER = new BuyingPowerHubIntentKey2("BUYING_POWER", 0);
    public static final BuyingPowerHubIntentKey2 MARGIN_STATUS = new BuyingPowerHubIntentKey2("MARGIN_STATUS", 1);

    private static final /* synthetic */ BuyingPowerHubIntentKey2[] $values() {
        return new BuyingPowerHubIntentKey2[]{BUYING_POWER, MARGIN_STATUS};
    }

    public static EnumEntries<BuyingPowerHubIntentKey2> getEntries() {
        return $ENTRIES;
    }

    private BuyingPowerHubIntentKey2(String str, int i) {
    }

    static {
        BuyingPowerHubIntentKey2[] buyingPowerHubIntentKey2Arr$values = $values();
        $VALUES = buyingPowerHubIntentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(buyingPowerHubIntentKey2Arr$values);
    }

    public static BuyingPowerHubIntentKey2 valueOf(String str) {
        return (BuyingPowerHubIntentKey2) Enum.valueOf(BuyingPowerHubIntentKey2.class, str);
    }

    public static BuyingPowerHubIntentKey2[] values() {
        return (BuyingPowerHubIntentKey2[]) $VALUES.clone();
    }
}
