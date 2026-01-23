package com.robinhood.android.lib.store.creditcard;

import com.robinhood.android.api.creditcard.CreditCardApi;
import com.robinhood.android.models.creditcard.api.graphql.GraphqlQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryRequest;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryRequestVariables;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse3;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/lib/store/creditcard/CreditCardStore$withScopeContext$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.creditcard.CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1", m3645f = "CreditCardStore.kt", m3646l = {694}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HashMap<OfferQueryResponse2, Boolean>>, Object> {
    final /* synthetic */ OfferQueryResponse2[] $offerType$inlined;
    int label;
    final /* synthetic */ CreditCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1(Continuation continuation, CreditCardStore creditCardStore, OfferQueryResponse2[] offerQueryResponse2Arr) {
        super(2, continuation);
        this.this$0 = creditCardStore;
        this.$offerType$inlined = offerQueryResponse2Arr;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1(continuation, this.this$0, this.$offerType$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HashMap<OfferQueryResponse2, Boolean>> continuation) {
        return ((CreditCardStore$hasActiveOffers$$inlined$withScopeContext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OfferQueryResponse offerQueryResponse;
        OfferQueryResponse.Response identity;
        OfferQueryResponse.Response.OfferResponse offers;
        List<OfferQueryResponse.Response.OfferResponse.Offer> active;
        Long endAt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.this$0.identityId.get();
            if (str != null) {
                CreditCardApi creditCardApi = this.this$0.creditCardApi;
                OfferQueryRequest offerQueryRequest = new OfferQueryRequest(null, null, new OfferQueryRequestVariables(str), 3, null);
                this.label = 1;
                obj = creditCardApi.getOffers(offerQueryRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            HashMap map = new HashMap();
            Instant instantNow = Instant.now(this.this$0.clock);
            if (offerQueryResponse != null && (identity = offerQueryResponse.getIdentity()) != null && (offers = identity.getOffers()) != null && (active = offers.getActive()) != null) {
                for (OfferQueryResponse.Response.OfferResponse.Offer offer : active) {
                    if (ArraysKt.contains(this.$offerType$inlined, offer.getType())) {
                        map.put(offer.getType(), boxing.boxBoolean(offer.getStatus() == OfferQueryResponse3.ELIGIBLE && ((endAt = offer.getEndAt()) == null || instantNow.compareTo(Instant.ofEpochMilli(endAt.longValue())) < 0) && instantNow.compareTo(Instant.ofEpochMilli(offer.getStartAt())) > 0));
                    }
                }
            }
            return map;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GraphqlQueryResponse graphqlQueryResponse = (GraphqlQueryResponse) obj;
        offerQueryResponse = graphqlQueryResponse != null ? (OfferQueryResponse) graphqlQueryResponse.getData() : null;
        HashMap map2 = new HashMap();
        Instant instantNow2 = Instant.now(this.this$0.clock);
        if (offerQueryResponse != null) {
            while (r10.hasNext()) {
            }
        }
        return map2;
    }
}
