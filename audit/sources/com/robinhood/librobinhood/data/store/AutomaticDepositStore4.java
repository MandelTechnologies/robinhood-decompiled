package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AutomaticDepositStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAutomaticDeposit;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AutomaticDepositStore$listEndpoint$2", m3645f = "AutomaticDepositStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AutomaticDepositStore$listEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AutomaticDepositStore4 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiAutomaticDeposit>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AutomaticDepositStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticDepositStore4(AutomaticDepositStore automaticDepositStore, Continuation<? super AutomaticDepositStore4> continuation) {
        super(2, continuation);
        this.this$0 = automaticDepositStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutomaticDepositStore4 automaticDepositStore4 = new AutomaticDepositStore4(this.this$0, continuation);
        automaticDepositStore4.L$0 = obj;
        return automaticDepositStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiAutomaticDeposit> paginatedResult, Continuation<? super Unit> continuation) {
        return ((AutomaticDepositStore4) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiAutomaticDeposit> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiAutomaticDeposit>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insertPaginated((PaginatedResult) this.L$0);
        return Unit.INSTANCE;
    }
}
