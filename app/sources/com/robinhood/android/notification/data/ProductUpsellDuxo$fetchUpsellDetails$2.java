package com.robinhood.android.notification.data;

import com.robinhood.android.notification.data.ProductUpsellActionType;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: ProductUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellDuxo$fetchUpsellDetails$2", m3645f = "ProductUpsellDuxo.kt", m3646l = {96, 102, 103, 104}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProductUpsellDuxo$fetchUpsellDetails$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductUpsellViewData>, Object> {
    final /* synthetic */ String $contentId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ProductUpsellDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductUpsellDuxo$fetchUpsellDetails$2(ProductUpsellDuxo productUpsellDuxo, String str, Continuation<? super ProductUpsellDuxo$fetchUpsellDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = productUpsellDuxo;
        this.$contentId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProductUpsellDuxo$fetchUpsellDetails$2 productUpsellDuxo$fetchUpsellDetails$2 = new ProductUpsellDuxo$fetchUpsellDetails$2(this.this$0, this.$contentId, continuation);
        productUpsellDuxo$fetchUpsellDetails$2.L$0 = obj;
        return productUpsellDuxo$fetchUpsellDetails$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductUpsellViewData> continuation) {
        return ((ProductUpsellDuxo$fetchUpsellDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2 A[PHI: r0 r1 r2 r4
      0x00d2: PHI (r0v13 com.robinhood.contentful.model.AssetResource$Content) = 
      (r0v12 com.robinhood.contentful.model.AssetResource$Content)
      (r0v27 com.robinhood.contentful.model.AssetResource$Content)
     binds: [B:21:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v17 java.lang.Object) binds: [B:21:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r2v5 com.robinhood.staticcontent.model.productupsell.ProductUpsellResource) = 
      (r2v4 com.robinhood.staticcontent.model.productupsell.ProductUpsellResource)
      (r2v10 com.robinhood.staticcontent.model.productupsell.ProductUpsellResource)
     binds: [B:21:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r4v4 kotlinx.coroutines.Deferred) = (r4v3 kotlinx.coroutines.Deferred), (r4v9 kotlinx.coroutines.Deferred) binds: [B:21:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objLoadEntry$default;
        ProductUpsellResource productUpsellResource;
        Deferred deferredAsync$default;
        Deferred deferredAsync$default2;
        Object objAwait;
        AssetResource.Content content;
        Object objAwait2;
        Object objAwait3;
        AssetResource.Content content2;
        ProductUpsellResource.CtaButton ctaButton;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            String str = this.$contentId;
            this.L$0 = coroutineScope;
            this.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, this, 2, null);
            if (objLoadEntry$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                Deferred deferred = (Deferred) this.L$2;
                deferredAsync$default = (Deferred) this.L$1;
                productUpsellResource = (ProductUpsellResource) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferredAsync$default2 = deferred;
                objAwait = obj;
                content = (AssetResource.Content) objAwait;
                this.L$0 = productUpsellResource;
                this.L$1 = deferredAsync$default2;
                this.L$2 = content;
                this.label = 3;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 != coroutine_suspended) {
                    ProductUpsellResource.CtaButton ctaButton2 = (ProductUpsellResource.CtaButton) objAwait2;
                    this.L$0 = productUpsellResource;
                    this.L$1 = content;
                    this.L$2 = ctaButton2;
                    this.label = 4;
                    objAwait3 = deferredAsync$default2.await(this);
                    if (objAwait3 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ctaButton = (ProductUpsellResource.CtaButton) this.L$2;
                content2 = (AssetResource.Content) this.L$1;
                productUpsellResource = (ProductUpsellResource) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait3 = obj;
                ProductUpsellResource.CtaButton ctaButton3 = (ProductUpsellResource.CtaButton) objAwait3;
                String title = productUpsellResource.getTitle();
                String body = productUpsellResource.getBody();
                String url = content2.getFile().getUrl().getUrl();
                String title2 = ctaButton.getTitle();
                ProductUpsellActionType.Companion companion = ProductUpsellActionType.INSTANCE;
                return new ProductUpsellViewData(title, body, url, null, productUpsellResource.getIdentifier(), title2, companion.fromString(ctaButton.getActionType()), ctaButton.getIdentifier(), ctaButton3 == null ? ctaButton3.getTitle() : null, companion.fromString(ctaButton3 == null ? ctaButton3.getActionType() : null), ctaButton3 != null ? ctaButton3.getIdentifier() : null, 8, null);
            }
            content = (AssetResource.Content) this.L$2;
            Deferred deferred2 = (Deferred) this.L$1;
            productUpsellResource = (ProductUpsellResource) this.L$0;
            ResultKt.throwOnFailure(obj);
            deferredAsync$default2 = deferred2;
            objAwait2 = obj;
            ProductUpsellResource.CtaButton ctaButton22 = (ProductUpsellResource.CtaButton) objAwait2;
            this.L$0 = productUpsellResource;
            this.L$1 = content;
            this.L$2 = ctaButton22;
            this.label = 4;
            objAwait3 = deferredAsync$default2.await(this);
            if (objAwait3 != coroutine_suspended) {
                content2 = content;
                ctaButton = ctaButton22;
                ProductUpsellResource.CtaButton ctaButton32 = (ProductUpsellResource.CtaButton) objAwait3;
                String title3 = productUpsellResource.getTitle();
                String body2 = productUpsellResource.getBody();
                String url2 = content2.getFile().getUrl().getUrl();
                String title22 = ctaButton.getTitle();
                ProductUpsellActionType.Companion companion2 = ProductUpsellActionType.INSTANCE;
                if (ctaButton32 == null) {
                }
                if (ctaButton32 != null) {
                }
                return new ProductUpsellViewData(title3, body2, url2, null, productUpsellResource.getIdentifier(), title22, companion2.fromString(ctaButton.getActionType()), ctaButton.getIdentifier(), ctaButton32 == null ? ctaButton32.getTitle() : null, companion2.fromString(ctaButton32 == null ? ctaButton32.getActionType() : null), ctaButton32 != null ? ctaButton32.getIdentifier() : null, 8, null);
            }
            return coroutine_suspended;
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        coroutineScope = coroutineScope2;
        objLoadEntry$default = obj;
        productUpsellResource = (ProductUpsellResource) ((EntryResource) objLoadEntry$default).getValue();
        Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ProductUpsellDuxo$fetchUpsellDetails$2$headerImageResource$1(this.this$0, productUpsellResource, null), 3, null);
        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ProductUpsellDuxo$fetchUpsellDetails$2$primaryCtaResource$1(this.this$0, productUpsellResource, null), 3, null);
        deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ProductUpsellDuxo$fetchUpsellDetails$2$secondaryCtaResource$1(productUpsellResource, this.this$0, null), 3, null);
        this.L$0 = productUpsellResource;
        this.L$1 = deferredAsync$default;
        this.L$2 = deferredAsync$default2;
        this.label = 2;
        objAwait = deferredAsync$default3.await(this);
        if (objAwait != coroutine_suspended) {
            content = (AssetResource.Content) objAwait;
            this.L$0 = productUpsellResource;
            this.L$1 = deferredAsync$default2;
            this.L$2 = content;
            this.label = 3;
            objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
