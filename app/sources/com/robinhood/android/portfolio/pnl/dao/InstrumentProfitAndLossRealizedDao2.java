package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.portfolio.pnl.p214db.InstrumentProfitAndLossRealized;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.common.MoneyDto;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import wormhole.service.p554v1.GetRealizedPerformanceSummaryResponseDto;

/* compiled from: InstrumentProfitAndLossRealizedDao.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;", "j$/time/Instant", "currentTime", "Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "toDbModel", "(Lwormhole/service/v1/GetRealizedPerformanceSummaryResponseDto;Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnl/db/InstrumentProfitAndLossRealized;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnl.dao.InstrumentProfitAndLossRealizedDaoKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class InstrumentProfitAndLossRealizedDao2 {
    public static /* synthetic */ InstrumentProfitAndLossRealized toDbModel$default(GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return toDbModel(getRealizedPerformanceSummaryResponseDto, instant);
    }

    public static final InstrumentProfitAndLossRealized toDbModel(GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto, Instant currentTime) {
        Money money$default;
        Money money$default2;
        Intrinsics.checkNotNullParameter(getRealizedPerformanceSummaryResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        String account_number = getRealizedPerformanceSummaryResponseDto.getAccount_number();
        String instrument_id = getRealizedPerformanceSummaryResponseDto.getInstrument_id();
        MoneyDto past_month_gain_loss = getRealizedPerformanceSummaryResponseDto.getPast_month_gain_loss();
        if (past_month_gain_loss == null || (money$default = Money3.toMoney(past_month_gain_loss)) == null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            money$default = Money3.toMoney$default(bigDecimalValueOf, null, 1, null);
        }
        MoneyDto ytd_gain_loss = getRealizedPerformanceSummaryResponseDto.getYtd_gain_loss();
        if (ytd_gain_loss == null || (money$default2 = Money3.toMoney(ytd_gain_loss)) == null) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            money$default2 = Money3.toMoney$default(bigDecimalValueOf2, null, 1, null);
        }
        return new InstrumentProfitAndLossRealized(account_number, instrument_id, money$default, money$default2, currentTime);
    }
}
