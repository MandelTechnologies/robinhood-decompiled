package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiInstrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiInstrument;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentStore$instrumentsByIdsEndpoint$1", m3645f = "InstrumentStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentStore$instrumentsByIdsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiInstrument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentStore6(InstrumentStore instrumentStore, Continuation<? super InstrumentStore6> continuation) {
        super(2, continuation);
        this.this$0 = instrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentStore6 instrumentStore6 = new InstrumentStore6(this.this$0, continuation);
        instrumentStore6.L$0 = obj;
        return instrumentStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiInstrument>> continuation) {
        return invoke2((Tuples2<String, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiInstrument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiInstrument>> continuation) {
        return ((InstrumentStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) ((Tuples2) this.L$0).component1();
        EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
        this.label = 1;
        Object instruments = equitiesBrokeback.getInstruments(str, this);
        return instruments == coroutine_suspended ? coroutine_suspended : instruments;
    }
}
