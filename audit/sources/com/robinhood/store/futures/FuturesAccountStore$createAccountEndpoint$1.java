package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult2;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateFuturesAccountRequestDto;
import com.robinhood.ceres.p284v1.CreateFuturesAccountResponseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/ui/CreateFuturesAccountResult;", "it", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$createAccountEndpoint$1", m3645f = "FuturesAccountStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$createAccountEndpoint$1 extends ContinuationImpl7 implements Function2<CreateFuturesAccountRequestDto, Continuation<? super CreateFuturesAccountResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$createAccountEndpoint$1(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$createAccountEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$createAccountEndpoint$1 futuresAccountStore$createAccountEndpoint$1 = new FuturesAccountStore$createAccountEndpoint$1(this.this$0, continuation);
        futuresAccountStore$createAccountEndpoint$1.L$0 = obj;
        return futuresAccountStore$createAccountEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateFuturesAccountRequestDto createFuturesAccountRequestDto, Continuation<? super CreateFuturesAccountResult> continuation) {
        return ((FuturesAccountStore$createAccountEndpoint$1) create(createFuturesAccountRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CreateFuturesAccountRequestDto createFuturesAccountRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateFuturesAccountRequestDto createFuturesAccountRequestDto2 = (CreateFuturesAccountRequestDto) this.L$0;
            Ceres ceres = this.this$0.ceres;
            this.L$0 = createFuturesAccountRequestDto2;
            this.label = 1;
            Object objCreateFuturesAccount = ceres.CreateFuturesAccount(createFuturesAccountRequestDto2, this);
            if (objCreateFuturesAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
            createFuturesAccountRequestDto = createFuturesAccountRequestDto2;
            obj = objCreateFuturesAccount;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFuturesAccountRequestDto = (CreateFuturesAccountRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return CreateFuturesAccountResult2.toUiModel((CreateFuturesAccountResponseDto) obj, createFuturesAccountRequestDto.getRhs_account_number());
    }
}
