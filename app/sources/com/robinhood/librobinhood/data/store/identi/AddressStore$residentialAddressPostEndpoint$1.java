package com.robinhood.librobinhood.data.store.identi;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiAddress;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiAddress;", PlaceTypes.ADDRESS}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$residentialAddressPostEndpoint$1", m3645f = "AddressStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddressStore$residentialAddressPostEndpoint$1 extends ContinuationImpl7 implements Function2<ApiAddress, Continuation<? super ApiAddress>, Object> {
    final /* synthetic */ Identi $identi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressStore$residentialAddressPostEndpoint$1(Identi identi2, Continuation<? super AddressStore$residentialAddressPostEndpoint$1> continuation) {
        super(2, continuation);
        this.$identi = identi2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressStore$residentialAddressPostEndpoint$1 addressStore$residentialAddressPostEndpoint$1 = new AddressStore$residentialAddressPostEndpoint$1(this.$identi, continuation);
        addressStore$residentialAddressPostEndpoint$1.L$0 = obj;
        return addressStore$residentialAddressPostEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAddress apiAddress, Continuation<? super ApiAddress> continuation) {
        return ((AddressStore$residentialAddressPostEndpoint$1) create(apiAddress, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAddress apiAddress = (ApiAddress) this.L$0;
        Identi identi2 = this.$identi;
        this.label = 1;
        Object objSubmitResidentialAddress = identi2.submitResidentialAddress(apiAddress, this);
        return objSubmitResidentialAddress == coroutine_suspended ? coroutine_suspended : objSubmitResidentialAddress;
    }
}
