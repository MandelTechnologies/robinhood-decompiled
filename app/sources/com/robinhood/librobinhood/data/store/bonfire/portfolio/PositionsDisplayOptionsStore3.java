package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionsDisplayOptions2;
import com.robinhood.android.models.portfolio.api.ApiPositionsDisplayOptions;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PositionsDisplayOptionsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore$DisplayOptionsRequestParams;", "apiOptions", "Lcom/robinhood/android/models/portfolio/api/ApiPositionsDisplayOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$displayOptionsEndpoint$2", m3645f = "PositionsDisplayOptionsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$displayOptionsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionsDisplayOptionsStore3 extends ContinuationImpl7 implements Function3<PositionsDisplayOptionsStore.DisplayOptionsRequestParams, ApiPositionsDisplayOptions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionsDisplayOptionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsDisplayOptionsStore3(PositionsDisplayOptionsStore positionsDisplayOptionsStore, Continuation<? super PositionsDisplayOptionsStore3> continuation) {
        super(3, continuation);
        this.this$0 = positionsDisplayOptionsStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PositionsDisplayOptionsStore.DisplayOptionsRequestParams displayOptionsRequestParams, ApiPositionsDisplayOptions apiPositionsDisplayOptions, Continuation<? super Unit> continuation) {
        PositionsDisplayOptionsStore3 positionsDisplayOptionsStore3 = new PositionsDisplayOptionsStore3(this.this$0, continuation);
        positionsDisplayOptionsStore3.L$0 = displayOptionsRequestParams;
        positionsDisplayOptionsStore3.L$1 = apiPositionsDisplayOptions;
        return positionsDisplayOptionsStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PositionsDisplayOptionsStore.DisplayOptionsRequestParams displayOptionsRequestParams = (PositionsDisplayOptionsStore.DisplayOptionsRequestParams) this.L$0;
            this.this$0.displayOptionsDao.insert(PositionsDisplayOptions2.toDbModel((ApiPositionsDisplayOptions) this.L$1, displayOptionsRequestParams.getAccountNumber(), displayOptionsRequestParams.getInstrumentType(), displayOptionsRequestParams.getDisplayCurrency()));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
