package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesAccount2;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FuturesAccountDto;
import com.robinhood.ceres.p284v1.MarkAttestationsSignedRequestDto;
import com.robinhood.ceres.p284v1.MarkAttestationsSignedResponseDto;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "it", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$signAttestationEndpoint$1", m3645f = "FuturesAccountStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$signAttestationEndpoint$1 extends ContinuationImpl7 implements Function2<MarkAttestationsSignedRequestDto, Continuation<? super Optional<? extends FuturesAccount>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$signAttestationEndpoint$1(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$signAttestationEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$signAttestationEndpoint$1 futuresAccountStore$signAttestationEndpoint$1 = new FuturesAccountStore$signAttestationEndpoint$1(this.this$0, continuation);
        futuresAccountStore$signAttestationEndpoint$1.L$0 = obj;
        return futuresAccountStore$signAttestationEndpoint$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto, Continuation<? super Optional<FuturesAccount>> continuation) {
        return ((FuturesAccountStore$signAttestationEndpoint$1) create(markAttestationsSignedRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto, Continuation<? super Optional<? extends FuturesAccount>> continuation) {
        return invoke2(markAttestationsSignedRequestDto, (Continuation<? super Optional<FuturesAccount>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        FuturesAccount dbModel;
        Optional optionalAsOptional;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto = (MarkAttestationsSignedRequestDto) this.L$0;
            Ceres ceres = this.this$0.ceres;
            this.label = 1;
            obj = ceres.MarkAttestationsSigned(markAttestationsSignedRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        FuturesAccountDto account = ((MarkAttestationsSignedResponseDto) obj).getAccount();
        return (account == null || (dbModel = FuturesAccount2.toDbModel(account)) == null || (optionalAsOptional = Optional3.asOptional(dbModel)) == null) ? Optional2.INSTANCE : optionalAsOptional;
    }
}
