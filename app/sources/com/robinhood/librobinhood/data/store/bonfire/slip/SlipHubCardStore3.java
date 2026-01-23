package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.models.api.ApiSlipHubCard;
import com.robinhood.models.dao.SlipHubCardDao;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.SlipHubCard2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipHubCardStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiHubCard", "Lcom/robinhood/models/api/ApiSlipHubCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$endpoint$2", m3645f = "SlipHubCardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipHubCardStore3 extends ContinuationImpl7 implements Function2<ApiSlipHubCard, Continuation<? super Unit>, Object> {
    final /* synthetic */ SlipHubCardDao $slipHubCardDao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipHubCardStore3(SlipHubCardDao slipHubCardDao, Continuation<? super SlipHubCardStore3> continuation) {
        super(2, continuation);
        this.$slipHubCardDao = slipHubCardDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipHubCardStore3 slipHubCardStore3 = new SlipHubCardStore3(this.$slipHubCardDao, continuation);
        slipHubCardStore3.L$0 = obj;
        return slipHubCardStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSlipHubCard apiSlipHubCard, Continuation<? super Unit> continuation) {
        return ((SlipHubCardStore3) create(apiSlipHubCard, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiSlipHubCard apiSlipHubCard = (ApiSlipHubCard) this.L$0;
        SlipHubCard dbModel = SlipHubCard2.toDbModel(apiSlipHubCard);
        if (dbModel == null) {
            this.$slipHubCardDao.delete(apiSlipHubCard.getAccount_number());
        } else {
            this.$slipHubCardDao.insert((SlipHubCardDao) dbModel);
        }
        return Unit.INSTANCE;
    }
}
