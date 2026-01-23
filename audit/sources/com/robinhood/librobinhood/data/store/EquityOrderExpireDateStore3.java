package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOrderExpireDate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: EquityOrderExpireDateStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOrderExpireDate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore$endpoint$2", m3645f = "EquityOrderExpireDateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class EquityOrderExpireDateStore3 extends ContinuationImpl7 implements Function2<ApiOrderExpireDate, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityOrderExpireDateStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderExpireDateStore3(EquityOrderExpireDateStore equityOrderExpireDateStore, Continuation<? super EquityOrderExpireDateStore3> continuation) {
        super(2, continuation);
        this.this$0 = equityOrderExpireDateStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderExpireDateStore3 equityOrderExpireDateStore3 = new EquityOrderExpireDateStore3(this.this$0, continuation);
        equityOrderExpireDateStore3.L$0 = obj;
        return equityOrderExpireDateStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOrderExpireDate apiOrderExpireDate, Continuation<? super Unit> continuation) {
        return ((EquityOrderExpireDateStore3) create(apiOrderExpireDate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiOrderExpireDate apiOrderExpireDate = (ApiOrderExpireDate) this.L$0;
            this.this$0.orderExpireDateFetchDatePref.set(Instant.now().toString());
            this.this$0.orderExpireDatePref.set(apiOrderExpireDate.getGtc_expire_datetime());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
