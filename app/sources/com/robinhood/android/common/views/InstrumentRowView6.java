package com.robinhood.android.common.views;

import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Tradability;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentRowView.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¨\u0006\u0006"}, m3636d2 = {"streamInstrumentTradabilityForAccountNow", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Tradability;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "instrument", "Lcom/robinhood/models/db/Instrument;", "feature-lib-instrument-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.views.InstrumentRowViewKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InstrumentRowView6 {
    public static final Observable<Tradability> streamInstrumentTradabilityForAccountNow(TraderMarketHoursManager traderMarketHoursManager, final Instrument instrument) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<this>");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Observable map = traderMarketHoursManager.streamIsAdtHours().map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowViewKt.streamInstrumentTradabilityForAccountNow.1
            @Override // io.reactivex.functions.Function
            public final Tradability apply(Boolean isAdtHours) {
                Intrinsics.checkNotNullParameter(isAdtHours, "isAdtHours");
                if (isAdtHours.booleanValue()) {
                    return instrument.getAllDayTradability();
                }
                return instrument.getAffiliateTradability();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
