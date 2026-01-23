package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LadderPriceLevels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/PriceLevelScaledRoundingMode;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "DEFAULT", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.PriceLevelScaledRoundingMode, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderPriceLevels3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LadderPriceLevels3[] $VALUES;

    /* renamed from: UP */
    public static final LadderPriceLevels3 f4167UP = new LadderPriceLevels3("UP", 0);
    public static final LadderPriceLevels3 DOWN = new LadderPriceLevels3("DOWN", 1);
    public static final LadderPriceLevels3 DEFAULT = new LadderPriceLevels3("DEFAULT", 2);

    private static final /* synthetic */ LadderPriceLevels3[] $values() {
        return new LadderPriceLevels3[]{f4167UP, DOWN, DEFAULT};
    }

    public static EnumEntries<LadderPriceLevels3> getEntries() {
        return $ENTRIES;
    }

    private LadderPriceLevels3(String str, int i) {
    }

    static {
        LadderPriceLevels3[] ladderPriceLevels3Arr$values = $values();
        $VALUES = ladderPriceLevels3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(ladderPriceLevels3Arr$values);
    }

    public static LadderPriceLevels3 valueOf(String str) {
        return (LadderPriceLevels3) Enum.valueOf(LadderPriceLevels3.class, str);
    }

    public static LadderPriceLevels3[] values() {
        return (LadderPriceLevels3[]) $VALUES.clone();
    }
}
