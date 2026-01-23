package com.robinhood.android.advisory.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaxLossHarvestingKey.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/TaxLossHarvestingStartDestination;", "", "deeplinkPath", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDeeplinkPath", "()Ljava/lang/String;", "DASHBOARD", "FLOW", "GAINS_AND_LOSSES", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.contracts.TaxLossHarvestingStartDestination, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestingKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TaxLossHarvestingKey2[] $VALUES;
    public static final TaxLossHarvestingKey2 DASHBOARD = new TaxLossHarvestingKey2("DASHBOARD", 0, "strategies_tax_loss_harvest_dashboard");
    public static final TaxLossHarvestingKey2 FLOW = new TaxLossHarvestingKey2("FLOW", 1, "strategies_tax_loss_harvest_start");
    public static final TaxLossHarvestingKey2 GAINS_AND_LOSSES = new TaxLossHarvestingKey2("GAINS_AND_LOSSES", 2, "strategies_gains_and_losses");
    private final String deeplinkPath;

    private static final /* synthetic */ TaxLossHarvestingKey2[] $values() {
        return new TaxLossHarvestingKey2[]{DASHBOARD, FLOW, GAINS_AND_LOSSES};
    }

    public static EnumEntries<TaxLossHarvestingKey2> getEntries() {
        return $ENTRIES;
    }

    private TaxLossHarvestingKey2(String str, int i, String str2) {
        this.deeplinkPath = str2;
    }

    public final String getDeeplinkPath() {
        return this.deeplinkPath;
    }

    static {
        TaxLossHarvestingKey2[] taxLossHarvestingKey2Arr$values = $values();
        $VALUES = taxLossHarvestingKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(taxLossHarvestingKey2Arr$values);
    }

    public static TaxLossHarvestingKey2 valueOf(String str) {
        return (TaxLossHarvestingKey2) Enum.valueOf(TaxLossHarvestingKey2.class, str);
    }

    public static TaxLossHarvestingKey2[] values() {
        return (TaxLossHarvestingKey2[]) $VALUES.clone();
    }
}
