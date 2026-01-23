package com.robinhood.android.equities.tradesettings.utils;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Tradability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckAdtTradability.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"checkAdtTradability", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "account", "Lcom/robinhood/models/db/Account;", "orderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/EquityOrderSide;)Ljava/lang/Boolean;", "lib-trade-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.utils.CheckAdtTradabilityKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CheckAdtTradability {
    public static final Boolean checkAdtTradability(Instrument instrument, Account account, EquityOrderSide equityOrderSide) {
        Tradability allDayTradability;
        Tradability tradabilityMerge;
        if (instrument == null || (allDayTradability = instrument.getAllDayTradability()) == null || (tradabilityMerge = allDayTradability.merge(instrument.getAffiliateTradability())) == null) {
            return null;
        }
        boolean z = false;
        if ((account != null ? Intrinsics.areEqual(account.getDisableAdt(), Boolean.FALSE) : false) && ((tradabilityMerge.getAllowsBuyToOpen() && equityOrderSide == EquityOrderSide.BUY) || (tradabilityMerge.getAllowsSells() && equityOrderSide == EquityOrderSide.SELL))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
