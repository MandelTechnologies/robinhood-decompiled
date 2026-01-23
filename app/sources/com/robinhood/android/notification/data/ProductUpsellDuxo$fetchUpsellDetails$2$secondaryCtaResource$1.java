package com.robinhood.android.notification.data;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
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
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource$CtaButton;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1", m3645f = "ProductUpsellDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes8.dex */
final class ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductUpsellResource.CtaButton>, Object> {
    final /* synthetic */ ProductUpsellResource $resource;
    int label;
    final /* synthetic */ ProductUpsellDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1(ProductUpsellResource productUpsellResource, ProductUpsellDuxo productUpsellDuxo, Continuation<? super ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1> continuation) {
        super(2, continuation);
        this.$resource = productUpsellResource;
        this.this$0 = productUpsellDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1(this.$resource, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductUpsellResource.CtaButton> continuation) {
        return ((ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ResourceLink<EntryResource<ProductUpsellResource.CtaButton>> secondaryCta = this.$resource.getSecondaryCta();
            if (secondaryCta == null) {
                return null;
            }
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, secondaryCta, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (ProductUpsellResource.CtaButton) ((EntryResource) obj).getValue();
    }
}
