package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeMutationRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.ApplyReferralCodeResponse;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$applyReferralCode$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {693}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStore$applyReferralCode$$inlined$withScopeContext$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super GraphqlQueryResponse<ApplyReferralCodeResponse>>, Object> {
    final /* synthetic */ String $code$inlined;
    final /* synthetic */ String $email$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStore$applyReferralCode$$inlined$withScopeContext$1(Continuation continuation, CreditCardStore creditCardStore, String str, String str2) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$code$inlined = str;
        this.$email$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardStore$applyReferralCode$$inlined$withScopeContext$1(continuation, this.this$0, this.$code$inlined, this.$email$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GraphqlQueryResponse<ApplyReferralCodeResponse>> continuation) {
        return ((CreditCardStore$applyReferralCode$$inlined$withScopeContext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CreditCardApi creditCardApi = this.this$0.creditCardApi;
        ApplyReferralCodeMutationRequest applyReferralCodeMutationRequest = new ApplyReferralCodeMutationRequest(null, null, new ApplyReferralCodeMutationRequestVariables(this.$code$inlined, this.$email$inlined), 3, null);
        this.label = 1;
        Object objApplyReferralCode = creditCardApi.applyReferralCode(applyReferralCodeMutationRequest, this);
        return objApplyReferralCode == coroutine_suspended ? coroutine_suspended : objApplyReferralCode;
    }
}
