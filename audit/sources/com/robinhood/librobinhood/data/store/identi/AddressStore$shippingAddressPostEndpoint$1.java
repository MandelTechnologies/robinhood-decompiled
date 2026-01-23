package com.robinhood.librobinhood.data.store.identi;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.ApiShippingAddress;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiShippingAddress;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/api/ApiShippingAddress$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$shippingAddressPostEndpoint$1", m3645f = "AddressStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddressStore$shippingAddressPostEndpoint$1 extends ContinuationImpl7 implements Function2<ApiShippingAddress.Request, Continuation<? super ApiShippingAddress>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressStore$shippingAddressPostEndpoint$1(AddressStore addressStore, Continuation<? super AddressStore$shippingAddressPostEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = addressStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressStore$shippingAddressPostEndpoint$1 addressStore$shippingAddressPostEndpoint$1 = new AddressStore$shippingAddressPostEndpoint$1(this.this$0, continuation);
        addressStore$shippingAddressPostEndpoint$1.L$0 = obj;
        return addressStore$shippingAddressPostEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiShippingAddress.Request request, Continuation<? super ApiShippingAddress> continuation) {
        return ((AddressStore$shippingAddressPostEndpoint$1) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiShippingAddress.Request request = (ApiShippingAddress.Request) this.L$0;
        BonfireApi bonfireApi = this.this$0.bonfire;
        this.label = 1;
        Object objAddShippingAddress = bonfireApi.addShippingAddress(request, this);
        return objAddShippingAddress == coroutine_suspended ? coroutine_suspended : objAddShippingAddress;
    }
}
