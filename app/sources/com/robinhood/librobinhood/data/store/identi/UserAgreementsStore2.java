package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiUserAgreement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UserAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiUserAgreement;", "request", "Lcom/robinhood/models/api/identi/ApiUserAgreement$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$agreePostEndpoint$1", m3645f = "UserAgreementsStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$agreePostEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class UserAgreementsStore2 extends ContinuationImpl7 implements Function2<ApiUserAgreement.Request, Continuation<? super ApiUserAgreement>, Object> {
    final /* synthetic */ Identi $identi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAgreementsStore2(Identi identi2, Continuation<? super UserAgreementsStore2> continuation) {
        super(2, continuation);
        this.$identi = identi2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserAgreementsStore2 userAgreementsStore2 = new UserAgreementsStore2(this.$identi, continuation);
        userAgreementsStore2.L$0 = obj;
        return userAgreementsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiUserAgreement.Request request, Continuation<? super ApiUserAgreement> continuation) {
        return ((UserAgreementsStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiUserAgreement.Request request = (ApiUserAgreement.Request) this.L$0;
        Identi identi2 = this.$identi;
        this.label = 1;
        Object objAgreeToUserAgreement = identi2.agreeToUserAgreement(request, this);
        return objAgreeToUserAgreement == coroutine_suspended ? coroutine_suspended : objAgreeToUserAgreement;
    }
}
