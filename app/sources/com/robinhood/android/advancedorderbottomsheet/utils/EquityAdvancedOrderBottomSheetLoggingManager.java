package com.robinhood.android.advancedorderbottomsheet.utils;

import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderBottomSheetLoggingManager.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/utils/EquityAdvancedOrderBottomSheetLoggingManager;", "", "<init>", "()V", "getLoggingIdentifier", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "strategy", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "ALL_DAY_HOURS_IDENTIFIER", "getALL_DAY_HOURS_IDENTIFIER$annotations", "EXTENDED_HOURS_IDENTIFIER", "getEXTENDED_HOURS_IDENTIFIER$annotations", "REGULAR_HOURS_IDENTIFIER", "getREGULAR_HOURS_IDENTIFIER$annotations", "GOOD_FOR_DAY_IDENTIFIER", "getGOOD_FOR_DAY_IDENTIFIER$annotations", "GOOD_TIL_CANCEL_IDENTIFIER", "getGOOD_TIL_CANCEL_IDENTIFIER$annotations", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class EquityAdvancedOrderBottomSheetLoggingManager {
    public static final int $stable = 0;
    public static final String ALL_DAY_HOURS_IDENTIFIER = "trading_hours_row_all_day_hours";
    public static final String EXTENDED_HOURS_IDENTIFIER = "trading_hours_row_extended_hours";
    public static final String GOOD_FOR_DAY_IDENTIFIER = "time_in_force_row_good_for_day";
    public static final String GOOD_TIL_CANCEL_IDENTIFIER = "time_in_force_row_good_til_cancel";
    public static final EquityAdvancedOrderBottomSheetLoggingManager INSTANCE = new EquityAdvancedOrderBottomSheetLoggingManager();
    public static final String REGULAR_HOURS_IDENTIFIER = "trading_hours_row_regular_hours";

    /* compiled from: EquityAdvancedOrderBottomSheetLoggingManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTimeInForce.values().length];
            try {
                iArr2[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void getALL_DAY_HOURS_IDENTIFIER$annotations() {
    }

    public static /* synthetic */ void getEXTENDED_HOURS_IDENTIFIER$annotations() {
    }

    public static /* synthetic */ void getGOOD_FOR_DAY_IDENTIFIER$annotations() {
    }

    public static /* synthetic */ void getGOOD_TIL_CANCEL_IDENTIFIER$annotations() {
    }

    public static /* synthetic */ void getREGULAR_HOURS_IDENTIFIER$annotations() {
    }

    private EquityAdvancedOrderBottomSheetLoggingManager() {
    }

    public final String getLoggingIdentifier(OrderMarketHours tradingSession) {
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        int i = WhenMappings.$EnumSwitchMapping$0[tradingSession.ordinal()];
        if (i == 1) {
            return ALL_DAY_HOURS_IDENTIFIER;
        }
        if (i == 2 || i == 3) {
            return EXTENDED_HOURS_IDENTIFIER;
        }
        if (i == 4) {
            throw new IllegalStateException("Index options curb hours is not supported for equities");
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return REGULAR_HOURS_IDENTIFIER;
    }

    public final String getLoggingIdentifier(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        int i = WhenMappings.$EnumSwitchMapping$1[timeInForce.ordinal()];
        if (i == 1) {
            return GOOD_FOR_DAY_IDENTIFIER;
        }
        if (i != 2) {
            return null;
        }
        return GOOD_TIL_CANCEL_IDENTIFIER;
    }

    public final String getLoggingIdentifier(AvailableSelectionStrategyOption strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return strategy.getSelection_strategy().name();
    }
}
