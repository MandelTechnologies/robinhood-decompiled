package com.robinhood.android.equity.ordertypeselector.callbacks;

import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: EquityOrderCallbacks.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "", "setOrderConfiguration", "", "orderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "startOrderBuilder", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "startOrderSelectMenu", "accountNumber", "", "shareQuantity", "Ljava/math/BigDecimal;", "lib-equity-order-type-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderCallbacks {
    void setOrderConfiguration(EquityOrderConfiguration orderConfiguration);

    void startOrderBuilder(Buildable orderConfiguration);

    void startOrderSelectMenu(String accountNumber, BigDecimal shareQuantity);

    /* compiled from: EquityOrderCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startOrderSelectMenu$default(EquityOrderCallbacks equityOrderCallbacks, String str, BigDecimal bigDecimal, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOrderSelectMenu");
            }
            if ((i & 2) != 0) {
                bigDecimal = null;
            }
            equityOrderCallbacks.startOrderSelectMenu(str, bigDecimal);
        }
    }
}
