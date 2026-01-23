package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.rhy.ApiCashCushionSetting;
import com.robinhood.models.p320db.bonfire.CashCushionStatus2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CashCushionStatusStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/bonfire/rhy/ApiCashCushionSetting;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$getStatusEndpoint$2", m3645f = "CashCushionStatusStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$getStatusEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CashCushionStatusStore3 extends ContinuationImpl7 implements Function2<ApiCashCushionSetting, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CashCushionStatusStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashCushionStatusStore3(CashCushionStatusStore cashCushionStatusStore, Continuation<? super CashCushionStatusStore3> continuation) {
        super(2, continuation);
        this.this$0 = cashCushionStatusStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CashCushionStatusStore3 cashCushionStatusStore3 = new CashCushionStatusStore3(this.this$0, continuation);
        cashCushionStatusStore3.L$0 = obj;
        return cashCushionStatusStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCashCushionSetting apiCashCushionSetting, Continuation<? super Unit> continuation) {
        return ((CashCushionStatusStore3) create(apiCashCushionSetting, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(CashCushionStatus2.toDbModel((ApiCashCushionSetting) this.L$0));
        return Unit.INSTANCE;
    }
}
