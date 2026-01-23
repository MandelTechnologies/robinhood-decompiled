package com.robinhood.android.portfolio.pnl.dao;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryResponseDto;
import rosetta.portfolio.p541v1.RealizedGainDto;
import rosetta.portfolio.p541v1.SpanDto;

/* compiled from: ProfitAndLossRealizedDao.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "", "Lrosetta/portfolio/v1/AssetClassDto;", "allowedAssetTypes", "j$/time/Instant", "currentTime", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "toDbModel", "(Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;Ljava/util/List;Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDaoKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfitAndLossRealizedDao2 {

    /* compiled from: ProfitAndLossRealizedDao.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossRealizedDaoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpanDto.values().length];
            try {
                iArr[SpanDto.SPAN_1M.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpanDto.SPAN_YTD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ProfitAndLossRealized toDbModel$default(GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto, List list, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
        }
        return toDbModel(getRealizedPerformanceSummaryResponseDto, list, instant);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ProfitAndLossRealized toDbModel(GetRealizedPerformanceSummaryResponseDto getRealizedPerformanceSummaryResponseDto, List<? extends AssetClassDto> allowedAssetTypes, Instant currentTime) {
        Intrinsics.checkNotNullParameter(getRealizedPerformanceSummaryResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(allowedAssetTypes, "allowedAssetTypes");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        BigDecimal element = BigDecimal.ZERO;
        BigDecimal element2 = element;
        for (RealizedGainDto realizedGainDto : getRealizedPerformanceSummaryResponseDto.getRealized_gains()) {
            if (allowedAssetTypes.contains(realizedGainDto.getAsset_class())) {
                int i = WhenMappings.$EnumSwitchMapping$0[realizedGainDto.getSpan().ordinal()];
                if (i == 1) {
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    BigDecimal bigDecimalOrNull = realizedGainDto.getRealized_gain().toBigDecimalOrNull();
                    if (bigDecimalOrNull == null) {
                        bigDecimalOrNull = BigDecimal.ZERO;
                    }
                    Intrinsics.checkNotNull(bigDecimalOrNull);
                    element = element.add(bigDecimalOrNull);
                    Intrinsics.checkNotNullExpressionValue(element, "add(...)");
                } else if (i == 2) {
                    Intrinsics.checkNotNullExpressionValue(element2, "element");
                    BigDecimal bigDecimalOrNull2 = realizedGainDto.getRealized_gain().toBigDecimalOrNull();
                    if (bigDecimalOrNull2 == null) {
                        bigDecimalOrNull2 = BigDecimal.ZERO;
                    }
                    Intrinsics.checkNotNull(bigDecimalOrNull2);
                    element2 = element2.add(bigDecimalOrNull2);
                    Intrinsics.checkNotNullExpressionValue(element2, "add(...)");
                }
            }
        }
        String rhs_account_number = getRealizedPerformanceSummaryResponseDto.getRhs_account_number();
        Intrinsics.checkNotNullExpressionValue(element, "element");
        Currency currency = Currency.getInstance(getRealizedPerformanceSummaryResponseDto.getDisplay_currency().name());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        Money money = Money3.toMoney(element, currency);
        Intrinsics.checkNotNullExpressionValue(element2, "element");
        Currency currency2 = Currency.getInstance(getRealizedPerformanceSummaryResponseDto.getDisplay_currency().name());
        Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
        return new ProfitAndLossRealized(rhs_account_number, money, Money3.toMoney(element2, currency2), currentTime, (com.robinhood.rosetta.common.Currency) getRealizedPerformanceSummaryResponseDto.getDisplay_currency().toProto());
    }
}
