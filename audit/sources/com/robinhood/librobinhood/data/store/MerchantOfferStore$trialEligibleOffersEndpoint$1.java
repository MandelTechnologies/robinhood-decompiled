package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantOfferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$trialEligibleOffersEndpoint$1", m3645f = "MerchantOfferStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MerchantOfferStore$trialEligibleOffersEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiMerchantOfferV2>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MerchantOfferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOfferStore$trialEligibleOffersEndpoint$1(MerchantOfferStore merchantOfferStore, Continuation<? super MerchantOfferStore$trialEligibleOffersEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = merchantOfferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantOfferStore$trialEligibleOffersEndpoint$1 merchantOfferStore$trialEligibleOffersEndpoint$1 = new MerchantOfferStore$trialEligibleOffersEndpoint$1(this.this$0, continuation);
        merchantOfferStore$trialEligibleOffersEndpoint$1.L$0 = obj;
        return merchantOfferStore$trialEligibleOffersEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiMerchantOfferV2>> continuation) {
        return invoke2((Tuples2<String, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiMerchantOfferV2>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiMerchantOfferV2>> continuation) {
        return ((MerchantOfferStore$trialEligibleOffersEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) ((Tuples2) this.L$0).component1();
        PlutoApi plutoApi = this.this$0.pluto;
        this.label = 1;
        Object trialEligibleOffers = plutoApi.getTrialEligibleOffers(str, this);
        return trialEligibleOffers == coroutine_suspended ? coroutine_suspended : trialEligibleOffers;
    }
}
