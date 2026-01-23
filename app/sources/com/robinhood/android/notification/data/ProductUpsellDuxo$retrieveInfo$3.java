package com.robinhood.android.notification.data;

import com.robinhood.android.notification.Loggable;
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

/* compiled from: ProductUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/notification/data/ProductUpsellDataState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$retrieveInfo$3", m3645f = "ProductUpsellDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class ProductUpsellDuxo$retrieveInfo$3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductUpsellDataState>, Object> {
    final /* synthetic */ String $contentId;
    int I$0;
    int label;
    final /* synthetic */ ProductUpsellDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellDuxo$retrieveInfo$3(ProductUpsellDuxo productUpsellDuxo, String str, Continuation<? super ProductUpsellDuxo$retrieveInfo$3> continuation) {
        super(2, continuation);
        this.this$0 = productUpsellDuxo;
        this.$contentId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductUpsellDuxo$retrieveInfo$3(this.this$0, this.$contentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductUpsellDataState> continuation) {
        return ((ProductUpsellDuxo$retrieveInfo$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ProductUpsellDuxo productUpsellDuxo = this.this$0;
            String str = this.$contentId;
            this.I$0 = 0;
            this.label = 1;
            obj = productUpsellDuxo.fetchUpsellDetails$feature_product_upsell_externalDebug(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
        }
        ProductUpsellDataState productUpsellDataState = new ProductUpsellDataState(i != 0, (ProductUpsellViewData) obj, false, false, 13, null);
        Loggable.debugLog("upsellData=" + productUpsellDataState);
        return productUpsellDataState;
    }
}
