package com.robinhood.librobinhood.data.store.identi;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.ApiShippingAddress;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/api/ApiShippingAddress;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.AddressStore$shippingAddressPostEndpoint$2", m3645f = "AddressStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddressStore$shippingAddressPostEndpoint$2 extends ContinuationImpl7 implements Function2<ApiShippingAddress, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressStore$shippingAddressPostEndpoint$2(AddressStore addressStore, Continuation<? super AddressStore$shippingAddressPostEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = addressStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressStore$shippingAddressPostEndpoint$2 addressStore$shippingAddressPostEndpoint$2 = new AddressStore$shippingAddressPostEndpoint$2(this.this$0, continuation);
        addressStore$shippingAddressPostEndpoint$2.L$0 = obj;
        return addressStore$shippingAddressPostEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiShippingAddress apiShippingAddress, Continuation<? super Unit> continuation) {
        return ((AddressStore$shippingAddressPostEndpoint$2) create(apiShippingAddress, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List listListOf = CollectionsKt.listOf(this.this$0.toShippingAddress((ApiShippingAddress) this.L$0));
            List listEmptyList = (List) this.this$0.shippingAddressCache.getValue();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.this$0.shippingAddressCache.accept(CollectionsKt.plus((Collection) listListOf, (Iterable) listEmptyList));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
