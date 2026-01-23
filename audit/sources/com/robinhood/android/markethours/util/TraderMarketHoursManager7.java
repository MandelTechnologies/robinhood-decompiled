package com.robinhood.android.markethours.util;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.EquityOrderSession;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/EquityOrderSession;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.markethours.util.TraderMarketHoursManager$shortSellOrderSession$1$1", m3645f = "TraderMarketHoursManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.markethours.util.TraderMarketHoursManager$shortSellOrderSession$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class TraderMarketHoursManager7 extends ContinuationImpl7 implements Function3<FlowCollector<? super EquityOrderSession>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    TraderMarketHoursManager7(Continuation<? super TraderMarketHoursManager7> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super EquityOrderSession> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        TraderMarketHoursManager7 traderMarketHoursManager7 = new TraderMarketHoursManager7(continuation);
        traderMarketHoursManager7.L$0 = flowCollector;
        traderMarketHoursManager7.L$1 = th;
        return traderMarketHoursManager7.invokeSuspend(Unit.INSTANCE);
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
        this.L$0 = th2;
        this.label = 1;
        if (flowCollector.emit(null, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw th2;
    }
}
