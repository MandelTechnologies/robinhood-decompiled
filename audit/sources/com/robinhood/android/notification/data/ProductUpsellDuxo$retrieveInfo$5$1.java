package com.robinhood.android.notification.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/notification/data/ProductUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$retrieveInfo$5$1", m3645f = "ProductUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProductUpsellDuxo$retrieveInfo$5$1 extends ContinuationImpl7 implements Function2<ProductUpsellDataState, Continuation<? super ProductUpsellDataState>, Object> {
    final /* synthetic */ ProductUpsellDataState $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellDuxo$retrieveInfo$5$1(ProductUpsellDataState productUpsellDataState, Continuation<? super ProductUpsellDuxo$retrieveInfo$5$1> continuation) {
        super(2, continuation);
        this.$it = productUpsellDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductUpsellDuxo$retrieveInfo$5$1(this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductUpsellDataState productUpsellDataState, Continuation<? super ProductUpsellDataState> continuation) {
        return ((ProductUpsellDuxo$retrieveInfo$5$1) create(productUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ProductUpsellDataState productUpsellDataState = this.$it;
        Intrinsics.checkNotNull(productUpsellDataState);
        return productUpsellDataState;
    }
}
