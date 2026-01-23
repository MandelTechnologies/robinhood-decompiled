package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityMutationRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityNameType;
import com.robinhood.android.models.creditcard.api.graphql.UpdateIdentityResponse;
import com.robinhood.android.models.creditcard.api.idverification.IdVerificationData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$updateIdentity$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {696}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStore$updateIdentity$$inlined$withScopeContext$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UpdateIdentityResponse>, Object> {
    final /* synthetic */ IdVerificationData $data$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStore$updateIdentity$$inlined$withScopeContext$1(Continuation continuation, CreditCardStore creditCardStore, IdVerificationData idVerificationData) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$data$inlined = idVerificationData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardStore$updateIdentity$$inlined$withScopeContext$1(continuation, this.this$0, this.$data$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UpdateIdentityResponse> continuation) {
        return ((CreditCardStore$updateIdentity$$inlined$withScopeContext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.this$0.identityId.get();
            if (str2 == null || (str = this.this$0.creditApplicationId.get()) == null) {
                return null;
            }
            CreditCardApi creditCardApi = this.this$0.creditCardApi;
            UpdateIdentityMutationRequest updateIdentityMutationRequest = new UpdateIdentityMutationRequest(null, null, new UpdateIdentityMutationRequestVariables(str2, str, (this.$data$inlined.getLastNameEditable() && this.$data$inlined.getFirstNameEditable()) ? new UpdateIdentityNameType(this.$data$inlined.getFirstName(), this.$data$inlined.getLastName()) : null, this.$data$inlined.getDobEditable() ? boxing.boxLong(CreditCardStoreKt.toMilli(this.$data$inlined.getDob())) : null, this.$data$inlined.getSsnEditable() ? CreditCardStoreKt.formattedSsn(this.$data$inlined.getSsn()) : null), 3, null);
            this.label = 1;
            obj = creditCardApi.updateIdentity(updateIdentityMutationRequest, this);
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
