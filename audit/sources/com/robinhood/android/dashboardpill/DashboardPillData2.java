package com.robinhood.android.dashboardpill;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DashboardPillData.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/dashboardpill/DashboardPillLocation;", "", "<init>", "(Ljava/lang/String;I)V", "HOME_TAB", "CRYPTO_HOME_TAB", "RHC_HOME_TAB", "lib-dashboard-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.DashboardPillLocation, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardPillData2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DashboardPillData2[] $VALUES;
    public static final DashboardPillData2 HOME_TAB = new DashboardPillData2("HOME_TAB", 0);
    public static final DashboardPillData2 CRYPTO_HOME_TAB = new DashboardPillData2("CRYPTO_HOME_TAB", 1);
    public static final DashboardPillData2 RHC_HOME_TAB = new DashboardPillData2("RHC_HOME_TAB", 2);

    private static final /* synthetic */ DashboardPillData2[] $values() {
        return new DashboardPillData2[]{HOME_TAB, CRYPTO_HOME_TAB, RHC_HOME_TAB};
    }

    public static EnumEntries<DashboardPillData2> getEntries() {
        return $ENTRIES;
    }

    private DashboardPillData2(String str, int i) {
    }

    static {
        DashboardPillData2[] dashboardPillData2Arr$values = $values();
        $VALUES = dashboardPillData2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(dashboardPillData2Arr$values);
    }

    public static DashboardPillData2 valueOf(String str) {
        return (DashboardPillData2) Enum.valueOf(DashboardPillData2.class, str);
    }

    public static DashboardPillData2[] values() {
        return (DashboardPillData2[]) $VALUES.clone();
    }
}
