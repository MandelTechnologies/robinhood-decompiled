package com.robinhood.android.notification.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProductUpsellDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo", m3645f = "ProductUpsellDuxo.kt", m3646l = {70}, m3647m = "retrieveInfo$feature_product_upsell_externalDebug")
/* loaded from: classes8.dex */
final class ProductUpsellDuxo$retrieveInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductUpsellDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellDuxo$retrieveInfo$1(ProductUpsellDuxo productUpsellDuxo, Continuation<? super ProductUpsellDuxo$retrieveInfo$1> continuation) {
        super(continuation);
        this.this$0 = productUpsellDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveInfo$feature_product_upsell_externalDebug(null, this);
    }
}
