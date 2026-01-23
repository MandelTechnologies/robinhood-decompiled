package com.robinhood.android.markethours.util;

import com.robinhood.models.p320db.MarketHours;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.LocalDate;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/MarketHours;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.markethours.util.TraderMarketHoursManager$todaysMarketHours$1$1", m3645f = "TraderMarketHoursManager.kt", m3646l = {131}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.markethours.util.TraderMarketHoursManager$todaysMarketHours$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class TraderMarketHoursManager8 extends ContinuationImpl7 implements Function3<FlowCollector<? super MarketHours>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocalDate $today;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TraderMarketHoursManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderMarketHoursManager8(TraderMarketHoursManager traderMarketHoursManager, LocalDate localDate, Continuation<? super TraderMarketHoursManager8> continuation) {
        super(3, continuation);
        this.this$0 = traderMarketHoursManager;
        this.$today = localDate;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super MarketHours> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        TraderMarketHoursManager8 traderMarketHoursManager8 = new TraderMarketHoursManager8(this.this$0, this.$today, continuation);
        traderMarketHoursManager8.L$0 = flowCollector;
        traderMarketHoursManager8.L$1 = th;
        return traderMarketHoursManager8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
            throw th;
        }
        ResultKt.throwOnFailure(obj);
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        Throwable th2 = (Throwable) this.L$1;
        MarketHours marketHoursBestGuessForDate = this.this$0.bestGuessForDate(this.$today);
        this.L$0 = th2;
        this.label = 1;
        if (flowCollector.emit(marketHoursBestGuessForDate, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw th2;
    }
}
