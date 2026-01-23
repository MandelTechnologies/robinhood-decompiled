package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualAccount;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualAccount2;
import crypto_perpetuals.service.p440v1.GetAccountResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerpetualAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcrypto_perpetuals/service/v1/GetAccountResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualAccountStore$endpoint$2", m3645f = "PerpetualAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualAccountStore$endpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualAccountStore3 extends ContinuationImpl7 implements Function2<GetAccountResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualAccountStore3(PerpetualAccountStore perpetualAccountStore, Continuation<? super PerpetualAccountStore3> continuation) {
        super(2, continuation);
        this.this$0 = perpetualAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualAccountStore3 perpetualAccountStore3 = new PerpetualAccountStore3(this.this$0, continuation);
        perpetualAccountStore3.L$0 = obj;
        return perpetualAccountStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAccountResponseDto getAccountResponseDto, Continuation<? super Unit> continuation) {
        return ((PerpetualAccountStore3) create(getAccountResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PerpetualAccount dbModel = PerpetualAccount2.toDbModel((GetAccountResponseDto) this.L$0);
        if (dbModel != null) {
            this.this$0.dao.insert(dbModel);
        }
        return Unit.INSTANCE;
    }
}
