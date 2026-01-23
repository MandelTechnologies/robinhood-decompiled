package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.InstrumentApi;
import com.robinhood.android.models.portfolio.InstrumentDetails;
import com.robinhood.android.models.portfolio.InstrumentDetails2;
import com.robinhood.android.models.portfolio.api.ApiInstrumentDetails;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/InstrumentDetails;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/InstrumentDetailsStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$instrumentDetailsEndpoint$2", m3645f = "InstrumentDetailsStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$instrumentDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentDetailsStore3 extends ContinuationImpl7 implements Function2<InstrumentDetailsStore.Request, Continuation<? super InstrumentDetails>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentDetailsStore3(InstrumentDetailsStore instrumentDetailsStore, Continuation<? super InstrumentDetailsStore3> continuation) {
        super(2, continuation);
        this.this$0 = instrumentDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentDetailsStore3 instrumentDetailsStore3 = new InstrumentDetailsStore3(this.this$0, continuation);
        instrumentDetailsStore3.L$0 = obj;
        return instrumentDetailsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentDetailsStore.Request request, Continuation<? super InstrumentDetails> continuation) {
        return ((InstrumentDetailsStore3) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentDetailsStore.Request request = (InstrumentDetailsStore.Request) this.L$0;
            InstrumentApi instrumentApi = this.this$0.instrumentApi;
            UUID instrumentId = request.getInstrumentId();
            String displayType = request.getDisplayType();
            InstrumentType instrumentType = request.getInstrumentType();
            this.label = 1;
            obj = instrumentApi.getInstrumentDetails(instrumentId, instrumentType, displayType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstrumentDetails2.toDbModel((ApiInstrumentDetails) obj);
    }
}
