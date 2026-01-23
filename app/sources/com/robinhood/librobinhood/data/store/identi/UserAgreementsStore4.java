package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.models.api.identi.ApiUserAgreementsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: UserAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "agreementType", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$getAgreedToEndpoint$1", m3645f = "UserAgreementsStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.UserAgreementsStore$getAgreedToEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class UserAgreementsStore4 extends ContinuationImpl7 implements Function2<String, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Identi $identi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAgreementsStore4(Identi identi2, Continuation<? super UserAgreementsStore4> continuation) {
        super(2, continuation);
        this.$identi = identi2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserAgreementsStore4 userAgreementsStore4 = new UserAgreementsStore4(this.$identi, continuation);
        userAgreementsStore4.L$0 = obj;
        return userAgreementsStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((UserAgreementsStore4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            Identi identi2 = this.$identi;
            this.label = 1;
            obj = identi2.getUserAgreements(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiUserAgreement apiUserAgreement = (ApiUserAgreement) CollectionsKt.firstOrNull((List) ((ApiUserAgreementsResponse) obj).getAgreements());
        return boxing.boxBoolean(apiUserAgreement != null ? apiUserAgreement.getIsAgreed() : false);
    }
}
