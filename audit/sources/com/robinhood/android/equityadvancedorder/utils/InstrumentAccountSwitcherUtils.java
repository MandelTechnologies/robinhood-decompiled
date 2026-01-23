package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.models.api.bonfire.instrument.InstrumentAccountSwitcherType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentAccountSwitcherUtils.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/utils/InstrumentAccountSwitcherUtils;", "", "<init>", "()V", "makeAccountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "isCancelNewOrder", "", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "accountNumber", "", "loadingAccountSwitcher", "useSduiAccountSwitcher", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class InstrumentAccountSwitcherUtils {
    public static final int $stable = 0;
    public static final InstrumentAccountSwitcherUtils INSTANCE = new InstrumentAccountSwitcherUtils();

    /* compiled from: InstrumentAccountSwitcherUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderPositionEffect.values().length];
            try {
                iArr[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private InstrumentAccountSwitcherUtils() {
    }

    public final InstrumentAccountSwitcherState makeAccountSwitcherState(InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean isCancelNewOrder, EquityOrderSide side, OrderPositionEffect positionEffect, String accountNumber, boolean loadingAccountSwitcher, boolean useSduiAccountSwitcher) {
        InstrumentAccountSwitcherType instrumentAccountSwitcherType;
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        InstrumentAccountSwitcher.ViewModel buy = null;
        if (allAccounts.size() <= 1 || isCancelNewOrder || accountNumber == null) {
            return null;
        }
        Screen.Name name = Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE;
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[side.ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
            if (i2 == 1) {
                instrumentAccountSwitcherType = InstrumentAccountSwitcherType.BUY;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                instrumentAccountSwitcherType = InstrumentAccountSwitcherType.BUY_TO_CLOSE;
            }
        } else if (i == 2) {
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.SELL_UNITS;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.SELL_TO_OPEN;
        }
        int i3 = iArr[side.ordinal()];
        if (i3 == 1) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (instrumentAccountSwitcher != null) {
                    buy = instrumentAccountSwitcher.getBuyToClose();
                }
            } else if (instrumentAccountSwitcher != null) {
                buy = instrumentAccountSwitcher.getBuy();
            }
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (instrumentAccountSwitcher != null) {
                buy = instrumentAccountSwitcher.getSellToOpen();
            }
        } else if (instrumentAccountSwitcher != null) {
            buy = instrumentAccountSwitcher.getSellUnits();
        }
        return new InstrumentAccountSwitcherState(name, loadingAccountSwitcher, accountNumber, allAccounts, false, useSduiAccountSwitcher, instrumentAccountSwitcherType, buy, 16, null);
    }
}
