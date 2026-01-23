package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartBounds;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartBounds;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartBounds2;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: InstrumentChartBoundsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"Lcom/robinhood/utils/Optional;", "j$/time/Instant", "<destruct>", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;", "<anonymous>", "(Lcom/robinhood/utils/Optional;)Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore$endpoint$1", m3645f = "InstrumentChartBoundsStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentChartBoundsStore2 extends ContinuationImpl7 implements Function2<Optional<? extends Instant>, Continuation<? super InstrumentChartBounds>, Object> {
    final /* synthetic */ InstrumentsApi $instrumentsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartBoundsStore2(InstrumentsApi instrumentsApi, Continuation<? super InstrumentChartBoundsStore2> continuation) {
        super(2, continuation);
        this.$instrumentsApi = instrumentsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentChartBoundsStore2 instrumentChartBoundsStore2 = new InstrumentChartBoundsStore2(this.$instrumentsApi, continuation);
        instrumentChartBoundsStore2.L$0 = obj;
        return instrumentChartBoundsStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<Instant> optional, Continuation<? super InstrumentChartBounds> continuation) {
        return ((InstrumentChartBoundsStore2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Instant> optional, Continuation<? super InstrumentChartBounds> continuation) {
        return invoke2((Optional<Instant>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Instant instant = (Instant) ((Optional) this.L$0).component1();
            InstrumentsApi instrumentsApi = this.$instrumentsApi;
            this.label = 1;
            obj = instrumentsApi.getInstrumentChartBounds(instant, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstrumentChartBounds2.toDbModel((ApiInstrumentChartBounds) obj);
    }
}
