package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.models.p320db.EquityOrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrailingStopScreenType.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopScreenType;", "", "promptRes", "", "<init>", "(Ljava/lang/String;II)V", "getPromptRes", "()I", "BUY_TRAILING_STOP_AMOUNT", "SELL_TRAILING_STOP_AMOUNT", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TrailingStopScreenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrailingStopScreenType[] $VALUES;
    public static final TrailingStopScreenType BUY_TRAILING_STOP_AMOUNT = new TrailingStopScreenType("BUY_TRAILING_STOP_AMOUNT", 0, C20649R.string.order_create_advanced_trail_amount_buy_prompt_collaring_member);
    public static final TrailingStopScreenType SELL_TRAILING_STOP_AMOUNT = new TrailingStopScreenType("SELL_TRAILING_STOP_AMOUNT", 1, C20649R.string.order_create_advanced_trail_amount_sell_prompt_collaring_member);
    private final int promptRes;

    /* compiled from: TrailingStopScreenType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrailingStopScreenType.values().length];
            try {
                iArr[TrailingStopScreenType.BUY_TRAILING_STOP_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrailingStopScreenType.SELL_TRAILING_STOP_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TrailingStopScreenType[] $values() {
        return new TrailingStopScreenType[]{BUY_TRAILING_STOP_AMOUNT, SELL_TRAILING_STOP_AMOUNT};
    }

    public static EnumEntries<TrailingStopScreenType> getEntries() {
        return $ENTRIES;
    }

    private TrailingStopScreenType(String str, int i, int i2) {
        this.promptRes = i2;
    }

    public final int getPromptRes() {
        return this.promptRes;
    }

    static {
        TrailingStopScreenType[] trailingStopScreenTypeArr$values = $values();
        $VALUES = trailingStopScreenTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(trailingStopScreenTypeArr$values);
    }

    public final EquityOrderSide getSide() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return EquityOrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return EquityOrderSide.SELL;
    }

    public static TrailingStopScreenType valueOf(String str) {
        return (TrailingStopScreenType) Enum.valueOf(TrailingStopScreenType.class, str);
    }

    public static TrailingStopScreenType[] values() {
        return (TrailingStopScreenType[]) $VALUES.clone();
    }
}
