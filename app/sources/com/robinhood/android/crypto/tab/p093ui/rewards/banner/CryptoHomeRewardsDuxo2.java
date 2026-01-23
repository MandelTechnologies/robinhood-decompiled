package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHomeRewardsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/contentful/model/AssetResource$Content;", "Lcom/robinhood/contentful/model/AssetDetail;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$headerImageResource$1", m3645f = "CryptoHomeRewardsDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$headerImageResource$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeRewardsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AssetResource.Content<? extends AssetDetail>>, Object> {
    final /* synthetic */ ProductUpsellResource $resource;
    int label;
    final /* synthetic */ CryptoHomeRewardsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeRewardsDuxo2(CryptoHomeRewardsDuxo cryptoHomeRewardsDuxo, ProductUpsellResource productUpsellResource, Continuation<? super CryptoHomeRewardsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeRewardsDuxo;
        this.$resource = productUpsellResource;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoHomeRewardsDuxo2(this.this$0, this.$resource, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AssetResource.Content<? extends AssetDetail>> continuation) {
        return ((CryptoHomeRewardsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            ResourceLink<AssetResource<?>> headerImage = this.$resource.getHeaderImage();
            this.label = 1;
            obj = ContentRepository.DefaultImpls.load$default(staticContentStore, headerImage, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((AssetResource) obj).getContent();
    }
}
