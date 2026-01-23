package com.robinhood.android.markethours.util;

import com.robinhood.models.p320db.EquityOrderSession;
import com.robinhood.models.p320db.MarketHours;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/robinhood/models/db/MarketHours;", "Lcom/robinhood/models/db/EquityOrderSession;", "todaysMarketHours", "nextOpenMarketHours", "shortSellOrderSession"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.markethours.util.TraderMarketHoursManager$_currentTradingSession$1", m3645f = "TraderMarketHoursManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.markethours.util.TraderMarketHoursManager$_currentTradingSession$1, reason: use source file name */
/* loaded from: classes8.dex */
final class TraderMarketHoursManager2 extends ContinuationImpl7 implements Function4<MarketHours, MarketHours, EquityOrderSession, Continuation<? super Tuples3<? extends MarketHours, ? extends MarketHours, ? extends EquityOrderSession>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    TraderMarketHoursManager2(Continuation<? super TraderMarketHoursManager2> continuation) {
        super(4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(MarketHours marketHours, MarketHours marketHours2, EquityOrderSession equityOrderSession, Continuation<? super Tuples3<MarketHours, MarketHours, EquityOrderSession>> continuation) {
        TraderMarketHoursManager2 traderMarketHoursManager2 = new TraderMarketHoursManager2(continuation);
        traderMarketHoursManager2.L$0 = marketHours;
        traderMarketHoursManager2.L$1 = marketHours2;
        traderMarketHoursManager2.L$2 = equityOrderSession;
        return traderMarketHoursManager2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(MarketHours marketHours, MarketHours marketHours2, EquityOrderSession equityOrderSession, Continuation<? super Tuples3<? extends MarketHours, ? extends MarketHours, ? extends EquityOrderSession>> continuation) {
        return invoke2(marketHours, marketHours2, equityOrderSession, (Continuation<? super Tuples3<MarketHours, MarketHours, EquityOrderSession>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Tuples3((MarketHours) this.L$0, (MarketHours) this.L$1, (EquityOrderSession) this.L$2);
    }
}
