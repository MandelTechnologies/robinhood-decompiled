package com.robinhood.android.advisory.tlh.flow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HarvestFlowHost.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/flow/HarvestStep;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "SELECT_ACCOUNTS", "STRATEGY_INTRO", "STRATEGY_SELECTION", "STRATEGY_CONFIRM", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestStep, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestFlowHost2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HarvestFlowHost2[] $VALUES;
    public static final HarvestFlowHost2 INTRO = new HarvestFlowHost2("INTRO", 0);
    public static final HarvestFlowHost2 SELECT_ACCOUNTS = new HarvestFlowHost2("SELECT_ACCOUNTS", 1);
    public static final HarvestFlowHost2 STRATEGY_INTRO = new HarvestFlowHost2("STRATEGY_INTRO", 2);
    public static final HarvestFlowHost2 STRATEGY_SELECTION = new HarvestFlowHost2("STRATEGY_SELECTION", 3);
    public static final HarvestFlowHost2 STRATEGY_CONFIRM = new HarvestFlowHost2("STRATEGY_CONFIRM", 4);

    private static final /* synthetic */ HarvestFlowHost2[] $values() {
        return new HarvestFlowHost2[]{INTRO, SELECT_ACCOUNTS, STRATEGY_INTRO, STRATEGY_SELECTION, STRATEGY_CONFIRM};
    }

    public static EnumEntries<HarvestFlowHost2> getEntries() {
        return $ENTRIES;
    }

    private HarvestFlowHost2(String str, int i) {
    }

    static {
        HarvestFlowHost2[] harvestFlowHost2Arr$values = $values();
        $VALUES = harvestFlowHost2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(harvestFlowHost2Arr$values);
    }

    public static HarvestFlowHost2 valueOf(String str) {
        return (HarvestFlowHost2) Enum.valueOf(HarvestFlowHost2.class, str);
    }

    public static HarvestFlowHost2[] values() {
        return (HarvestFlowHost2[]) $VALUES.clone();
    }
}
