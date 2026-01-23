package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.equityscreener.models.api.ApiAllIndicatorsResponse;
import com.robinhood.equityscreener.models.p294db.AllIndicatorsResponse;
import com.robinhood.equityscreener.models.p294db.AllIndicatorsResponse2;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndicatorsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/equityscreener/models/db/AllIndicatorsResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$indicatorsEndpoint$1", m3645f = "IndicatorsStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$indicatorsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class IndicatorsStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super AllIndicatorsResponse>, Object> {
    int label;
    final /* synthetic */ IndicatorsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicatorsStore2(IndicatorsStore indicatorsStore, Continuation<? super IndicatorsStore2> continuation) {
        super(2, continuation);
        this.this$0 = indicatorsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndicatorsStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super AllIndicatorsResponse> continuation) {
        return ((IndicatorsStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenersApi screenersApi = this.this$0.api;
            this.label = 1;
            obj = screenersApi.getAllIndicators(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AllIndicatorsResponse2.toDbModel((ApiAllIndicatorsResponse) obj);
    }
}
