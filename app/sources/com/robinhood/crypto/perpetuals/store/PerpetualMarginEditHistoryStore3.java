package com.robinhood.crypto.perpetuals.store;

import com.robinhood.crypto.models.perpetuals.dao.PerpetualMarginEditDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit2;
import crypto_perpetuals.position.p439v1.MarginEditDto;
import crypto_perpetuals.service.p440v1.GetMarginEditResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcrypto_perpetuals/service/v1/GetMarginEditResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$getMarginEditEndpoint$2", m3645f = "PerpetualMarginEditHistoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$getMarginEditEndpoint$2, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualMarginEditHistoryStore3 extends ContinuationImpl7 implements Function2<GetMarginEditResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PerpetualMarginEditHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualMarginEditHistoryStore3(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, Continuation<? super PerpetualMarginEditHistoryStore3> continuation) {
        super(2, continuation);
        this.this$0 = perpetualMarginEditHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualMarginEditHistoryStore3 perpetualMarginEditHistoryStore3 = new PerpetualMarginEditHistoryStore3(this.this$0, continuation);
        perpetualMarginEditHistoryStore3.L$0 = obj;
        return perpetualMarginEditHistoryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMarginEditResponseDto getMarginEditResponseDto, Continuation<? super Unit> continuation) {
        return ((PerpetualMarginEditHistoryStore3) create(getMarginEditResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MarginEditDto margin_edit = ((GetMarginEditResponseDto) this.L$0).getMargin_edit();
        if (margin_edit != null) {
            this.this$0.dao.insert((PerpetualMarginEditDao) PerpetualMarginEdit2.toDbModel(margin_edit));
        }
        return Unit.INSTANCE;
    }
}
