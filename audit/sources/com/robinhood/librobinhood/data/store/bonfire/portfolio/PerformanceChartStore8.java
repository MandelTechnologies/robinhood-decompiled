package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "marketValues", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "direction"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$1$2", m3645f = "PerformanceChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$1$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PerformanceChartStore8 extends ContinuationImpl7 implements Function3<AccountMarketValuesLive, Direction, Continuation<? super Tuples2<? extends Money, ? extends Direction>>, Object> {
    final /* synthetic */ PerformanceChartType $chartType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* compiled from: PerformanceChartStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore$streamAccountMarketValuesAndDirection$1$2$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceChartType.values().length];
            try {
                iArr[PerformanceChartType.HISTORICAL_PORTFOLIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceChartType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PerformanceChartType.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PerformanceChartType.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PerformanceChartType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartStore8(PerformanceChartType performanceChartType, Continuation<? super PerformanceChartStore8> continuation) {
        super(3, continuation);
        this.$chartType = performanceChartType;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AccountMarketValuesLive accountMarketValuesLive, Direction direction, Continuation<? super Tuples2<Money, ? extends Direction>> continuation) {
        PerformanceChartStore8 performanceChartStore8 = new PerformanceChartStore8(this.$chartType, continuation);
        performanceChartStore8.L$0 = accountMarketValuesLive;
        performanceChartStore8.L$1 = direction;
        return performanceChartStore8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(AccountMarketValuesLive accountMarketValuesLive, Direction direction, Continuation<? super Tuples2<? extends Money, ? extends Direction>> continuation) {
        return invoke2(accountMarketValuesLive, direction, (Continuation<? super Tuples2<Money, ? extends Direction>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal depositAdjustedMarketValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AccountMarketValuesLive accountMarketValuesLive = (AccountMarketValuesLive) this.L$0;
        Direction direction = (Direction) this.L$1;
        int i = WhenMappings.$EnumSwitchMapping$0[this.$chartType.ordinal()];
        Money money = null;
        if (i == 1 || i == 2) {
            depositAdjustedMarketValue = accountMarketValuesLive.getDepositAdjustedMarketValue();
        } else if (i == 3) {
            depositAdjustedMarketValue = accountMarketValuesLive.getOptionMarketValue();
        } else if (i == 4) {
            depositAdjustedMarketValue = accountMarketValuesLive.getEquityMarketValue();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            depositAdjustedMarketValue = null;
        }
        if (depositAdjustedMarketValue != null) {
            Currency currency = Currency.getInstance(accountMarketValuesLive.getDisplayCurrency().getServerValue());
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            money = Money3.toMoney(depositAdjustedMarketValue, currency);
        }
        return Tuples4.m3642to(money, direction);
    }
}
