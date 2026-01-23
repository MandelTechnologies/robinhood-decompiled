package com.robinhood.android.advisory.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_TIME", "MONTHLY", "QUARTERLY", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SimulateDepositFrequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SimulateDepositFrequency[] $VALUES;
    public static final SimulateDepositFrequency ONE_TIME = new SimulateDepositFrequency("ONE_TIME", 0);
    public static final SimulateDepositFrequency MONTHLY = new SimulateDepositFrequency("MONTHLY", 1);
    public static final SimulateDepositFrequency QUARTERLY = new SimulateDepositFrequency("QUARTERLY", 2);

    private static final /* synthetic */ SimulateDepositFrequency[] $values() {
        return new SimulateDepositFrequency[]{ONE_TIME, MONTHLY, QUARTERLY};
    }

    public static EnumEntries<SimulateDepositFrequency> getEntries() {
        return $ENTRIES;
    }

    private SimulateDepositFrequency(String str, int i) {
    }

    static {
        SimulateDepositFrequency[] simulateDepositFrequencyArr$values = $values();
        $VALUES = simulateDepositFrequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(simulateDepositFrequencyArr$values);
    }

    public static SimulateDepositFrequency valueOf(String str) {
        return (SimulateDepositFrequency) Enum.valueOf(SimulateDepositFrequency.class, str);
    }

    public static SimulateDepositFrequency[] values() {
        return (SimulateDepositFrequency[]) $VALUES.clone();
    }
}
