package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.OptionHistoricalStore;
import com.robinhood.models.api.ApiOptionHistorical;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionHistoricalStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore$QueryParams;", "historical", "Lcom/robinhood/models/api/ApiOptionHistorical;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionHistoricalStore$extendedHoursEndpoint$2", m3645f = "OptionHistoricalStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalStore$extendedHoursEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionHistoricalStore5 extends ContinuationImpl7 implements Function3<OptionHistoricalStore.QueryParams, ApiOptionHistorical, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionHistoricalStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionHistoricalStore5(OptionHistoricalStore optionHistoricalStore, Continuation<? super OptionHistoricalStore5> continuation) {
        super(3, continuation);
        this.this$0 = optionHistoricalStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(OptionHistoricalStore.QueryParams queryParams, ApiOptionHistorical apiOptionHistorical, Continuation<? super Unit> continuation) {
        OptionHistoricalStore5 optionHistoricalStore5 = new OptionHistoricalStore5(this.this$0, continuation);
        optionHistoricalStore5.L$0 = queryParams;
        optionHistoricalStore5.L$1 = apiOptionHistorical;
        return optionHistoricalStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            OptionHistoricalStore.QueryParams queryParams = (OptionHistoricalStore.QueryParams) this.L$0;
            this.this$0.dao.insert((ApiOptionHistorical) this.L$1, queryParams.getGraphSelection());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
