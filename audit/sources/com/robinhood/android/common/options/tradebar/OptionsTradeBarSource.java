package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import rosetta.option.OptionOrderFormSource;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsTradeBarSource.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "", "<init>", "(Ljava/lang/String;I)V", "ODP", "SIMULATED_RETURNS", "toOrderFormSource", "Lrosetta/option/OptionOrderFormSource;", "toAnalyticsScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "toIndexDetailPageSource", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class OptionsTradeBarSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsTradeBarSource[] $VALUES;
    public static final OptionsTradeBarSource ODP = new OptionsTradeBarSource("ODP", 0);
    public static final OptionsTradeBarSource SIMULATED_RETURNS = new OptionsTradeBarSource("SIMULATED_RETURNS", 1);

    /* compiled from: OptionsTradeBarSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsTradeBarSource.values().length];
            try {
                iArr[OptionsTradeBarSource.ODP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsTradeBarSource.SIMULATED_RETURNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OptionsTradeBarSource[] $values() {
        return new OptionsTradeBarSource[]{ODP, SIMULATED_RETURNS};
    }

    public static EnumEntries<OptionsTradeBarSource> getEntries() {
        return $ENTRIES;
    }

    private OptionsTradeBarSource(String str, int i) {
    }

    static {
        OptionsTradeBarSource[] optionsTradeBarSourceArr$values = $values();
        $VALUES = optionsTradeBarSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsTradeBarSourceArr$values);
    }

    public final OptionOrderFormSource toOrderFormSource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return OptionOrderFormSource.STRATEGY_DETAIL;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionOrderFormSource.SIMULATED_RETURNS;
    }

    public final Screen.Name toAnalyticsScreenName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Screen.Name.OPTION_STRATEGY_DETAIL;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.OPTION_SIMULATED_RETURNS;
    }

    public final IndexDetailPageFragmentKey2 toIndexDetailPageSource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return IndexDetailPageFragmentKey2.OptionDetailPage.INSTANCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return IndexDetailPageFragmentKey2.SimulatedReturn.INSTANCE;
    }

    public static OptionsTradeBarSource valueOf(String str) {
        return (OptionsTradeBarSource) Enum.valueOf(OptionsTradeBarSource.class, str);
    }

    public static OptionsTradeBarSource[] values() {
        return (OptionsTradeBarSource[]) $VALUES.clone();
    }
}
