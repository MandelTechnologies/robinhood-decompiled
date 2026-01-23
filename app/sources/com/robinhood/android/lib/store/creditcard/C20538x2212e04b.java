package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeMutationVariables;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeRequest;
import com.robinhood.android.models.creditcard.api.graphql.ClaimSolidGoldCashPrizeResponse;
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
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$claimSolidGoldCashPrize$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {693}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$claimSolidGoldCashPrize$$inlined$withScopeContext$1 */
/* loaded from: classes8.dex */
public final class C20538x2212e04b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ClaimSolidGoldCashPrizeResponse>, Object> {
    final /* synthetic */ String $identityId$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20538x2212e04b(Continuation continuation, CreditCardStore creditCardStore, String str) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$identityId$inlined = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20538x2212e04b(continuation, this.this$0, this.$identityId$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ClaimSolidGoldCashPrizeResponse> continuation) {
        return ((C20538x2212e04b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreditCardApi creditCardApi = this.this$0.creditCardApi;
            ClaimSolidGoldCashPrizeRequest claimSolidGoldCashPrizeRequest = new ClaimSolidGoldCashPrizeRequest(null, null, new ClaimSolidGoldCashPrizeMutationVariables(this.$identityId$inlined), 3, null);
            this.label = 1;
            obj = creditCardApi.claimSolidGoldCashPrize(claimSolidGoldCashPrizeRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((GraphqlQueryResponse) obj).getData();
    }
}
