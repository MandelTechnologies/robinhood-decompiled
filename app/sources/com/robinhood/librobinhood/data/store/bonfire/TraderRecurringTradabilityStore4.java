package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.models.api.bonfire.ApiInstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderRecurringTradabilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$oldEndpoint$1", m3645f = "TraderRecurringTradabilityStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore$oldEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderRecurringTradabilityStore4 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super InstrumentRecurringTradability>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderRecurringTradabilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderRecurringTradabilityStore4(TraderRecurringTradabilityStore traderRecurringTradabilityStore, Continuation<? super TraderRecurringTradabilityStore4> continuation) {
        super(2, continuation);
        this.this$0 = traderRecurringTradabilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderRecurringTradabilityStore4 traderRecurringTradabilityStore4 = new TraderRecurringTradabilityStore4(this.this$0, continuation);
        traderRecurringTradabilityStore4.L$0 = obj;
        return traderRecurringTradabilityStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super InstrumentRecurringTradability> continuation) {
        return ((TraderRecurringTradabilityStore4) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid2 = (UUID) this.L$0;
            try {
                RecurringApi recurringApi = this.this$0.recurringApi;
                this.L$0 = uuid2;
                this.label = 1;
                Object instrumentRecurringTradability = recurringApi.getInstrumentRecurringTradability(uuid2, this);
                if (instrumentRecurringTradability == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uuid = uuid2;
                obj = instrumentRecurringTradability;
            } catch (Exception unused) {
                uuid = uuid2;
                return new InstrumentRecurringTradability(uuid, true, null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused2) {
                return new InstrumentRecurringTradability(uuid, true, null);
            }
        }
        return InstrumentRecurringTradability2.toDbModel((ApiInstrumentRecurringTradability) obj);
    }
}
