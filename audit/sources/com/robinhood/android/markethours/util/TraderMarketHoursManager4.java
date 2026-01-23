package com.robinhood.android.markethours.util;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Duration;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "j$/time/LocalDate", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.markethours.util.TraderMarketHoursManager$currentMarketDate$1", m3645f = "TraderMarketHoursManager.kt", m3646l = {111, 115, 116}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.markethours.util.TraderMarketHoursManager$currentMarketDate$1, reason: use source file name */
/* loaded from: classes8.dex */
final class TraderMarketHoursManager4 extends ContinuationImpl7 implements Function2<FlowCollector<? super LocalDate>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TraderMarketHoursManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderMarketHoursManager4(TraderMarketHoursManager traderMarketHoursManager, Continuation<? super TraderMarketHoursManager4> continuation) {
        super(2, continuation);
        this.this$0 = traderMarketHoursManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderMarketHoursManager4 traderMarketHoursManager4 = new TraderMarketHoursManager4(this.this$0, continuation);
        traderMarketHoursManager4.L$0 = obj;
        return traderMarketHoursManager4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super LocalDate> flowCollector, Continuation<? super Unit> continuation) {
        return ((TraderMarketHoursManager4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r4.emit(r1, r8) != r0) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0097 -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        LocalDate localDateMo3394a;
        LocalDateTime localDateTimeAtStartOfDay;
        FlowCollector flowCollector2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            LocalDateTime localDateTimeNow = LocalDateTime.now(this.this$0.estClock);
            localDateMo3394a = localDateTimeNow.mo3394a();
            this.L$0 = flowCollector;
            this.L$1 = localDateTimeNow;
            this.L$2 = localDateMo3394a;
            this.label = 1;
            if (flowCollector.emit(localDateMo3394a, this) != coroutine_suspended) {
                localDateTimeAtStartOfDay = localDateTimeNow;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            localDateMo3394a = (LocalDate) this.L$2;
            localDateTimeAtStartOfDay = (LocalDateTime) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            localDateMo3394a = (LocalDate) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = flowCollector2;
            this.L$1 = localDateMo3394a;
            this.label = 3;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localDateMo3394a = (LocalDate) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            localDateTimeAtStartOfDay = localDateMo3394a.atStartOfDay();
        }
        LocalDate localDatePlusDays = localDateMo3394a.plusDays(1L);
        long millis = Duration.between(localDateTimeAtStartOfDay, localDatePlusDays.atStartOfDay()).toMillis();
        this.L$0 = flowCollector;
        this.L$1 = localDatePlusDays;
        this.L$2 = null;
        this.label = 2;
        if (DelayKt.delay(millis, this) != coroutine_suspended) {
            localDateMo3394a = localDatePlusDays;
            flowCollector2 = flowCollector;
            this.L$0 = flowCollector2;
            this.L$1 = localDateMo3394a;
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
