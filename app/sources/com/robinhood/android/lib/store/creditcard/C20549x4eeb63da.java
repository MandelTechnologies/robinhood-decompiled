package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeInput;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeMutationRequest;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeMutationRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.SubmitAddressChallengeResponse;
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
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$submitAddressChallenge$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {694}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.creditcard.CreditCardStore$submitAddressChallenge$$inlined$withScopeContext$1 */
/* loaded from: classes8.dex */
public final class C20549x4eeb63da extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SubmitAddressChallengeResponse>, Object> {
    final /* synthetic */ AddressType $address$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20549x4eeb63da(Continuation continuation, CreditCardStore creditCardStore, AddressType addressType) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$address$inlined = addressType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20549x4eeb63da(continuation, this.this$0, this.$address$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SubmitAddressChallengeResponse> continuation) {
        return ((C20549x4eeb63da) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.this$0.identityId.get();
            if (str == null) {
                return null;
            }
            CreditCardApi creditCardApi = this.this$0.creditCardApi;
            SubmitAddressChallengeMutationRequest submitAddressChallengeMutationRequest = new SubmitAddressChallengeMutationRequest(null, null, new SubmitAddressChallengeMutationRequestVariables(new SubmitAddressChallengeInput(str, this.$address$inlined.getPrimaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + this.$address$inlined.getSecondaryAddressLine(), this.$address$inlined.getLocality(), this.$address$inlined.getSubdivision(), this.$address$inlined.getZip())), 3, null);
            this.label = 1;
            obj = creditCardApi.submitAddressChallenge(submitAddressChallengeMutationRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (SubmitAddressChallengeResponse) ((GraphqlQueryResponse) obj).getData();
    }
}
