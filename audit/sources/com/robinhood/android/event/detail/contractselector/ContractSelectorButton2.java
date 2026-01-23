package com.robinhood.android.event.detail.contractselector;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContractSelectorButton.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonOrderSide;", "", "<init>", "(Ljava/lang/String;I)V", "YES", CountryCode.COUNTRY_CODE_NO, "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorButtonOrderSide, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorButton2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContractSelectorButton2[] $VALUES;
    public static final ContractSelectorButton2 YES = new ContractSelectorButton2("YES", 0);

    /* renamed from: NO */
    public static final ContractSelectorButton2 f4140NO = new ContractSelectorButton2(CountryCode.COUNTRY_CODE_NO, 1);

    private static final /* synthetic */ ContractSelectorButton2[] $values() {
        return new ContractSelectorButton2[]{YES, f4140NO};
    }

    public static EnumEntries<ContractSelectorButton2> getEntries() {
        return $ENTRIES;
    }

    private ContractSelectorButton2(String str, int i) {
    }

    static {
        ContractSelectorButton2[] contractSelectorButton2Arr$values = $values();
        $VALUES = contractSelectorButton2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(contractSelectorButton2Arr$values);
    }

    public static ContractSelectorButton2 valueOf(String str) {
        return (ContractSelectorButton2) Enum.valueOf(ContractSelectorButton2.class, str);
    }

    public static ContractSelectorButton2[] values() {
        return (ContractSelectorButton2[]) $VALUES.clone();
    }
}
